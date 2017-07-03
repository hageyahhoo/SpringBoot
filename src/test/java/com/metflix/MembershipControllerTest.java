package com.metflix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MembershipControllerTest {

	@Autowired
	private MockMvc mvc;


	@Test
	public void get_該当データあり() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("/api/members/meso").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"user\":\"meso\",\"age\":99}")));
	}  

	@Test
	public void get_該当データなし() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("/api/members/mesoko").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("")));
	}  


	@Test
	public void register() throws Exception {

		// Register
		this.mvc.perform(MockMvcRequestBuilders.post("/api/members")
						.content("{\"user\":\"are\",\"age\":123}")
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
						.andExpect(status().isOk())
						.andExpect(content().string(equalTo("{\"user\":\"are\",\"age\":123}")));

		// Get
		this.mvc.perform(MockMvcRequestBuilders.post("/api/members/are").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"user\":\"are\",\"age\":123}")));
	}
}
