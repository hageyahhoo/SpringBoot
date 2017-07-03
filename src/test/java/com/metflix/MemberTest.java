package com.metflix;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MemberTest {

	private Member sut;


	@Test
	public void instantiatedWithDefaultConstructor() {

		this.sut = new Member();
		assertThat(
				this.sut.getUser(),
				is(nullValue()));
		assertThat(
				this.sut.getAge(),
				is(0));

		this.sut.setUser("Maki");
		this.sut.setAge(15);
		assertThat(
				this.sut.getUser(),
				is("Maki"));
		assertThat(
				this.sut.getAge(),
				is(15));
	}


	@Test
	public void instantiatedWithCustomConstructor() {

		this.sut = new Member("Miku", 17);
		assertThat(
				this.sut.getUser(),
				is("Miku"));
		assertThat(
				this.sut.getAge(),
				is(17));

		this.sut.setUser("Maki");
		this.sut.setAge(15);
		assertThat(
				this.sut.getUser(),
				is("Maki"));
		assertThat(
				this.sut.getAge(),
				is(15));
	}
}
