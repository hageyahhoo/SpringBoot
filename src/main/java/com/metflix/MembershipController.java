package com.metflix;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api/members")
public class MembershipController {

	private final Map<String, Member> memberStore = new ConcurrentHashMap<String, Member>() {
		private static final long serialVersionUID = 1L;
		{
			put("making",    new Member("making",    10));
			put("tichimura", new Member("tichimura", 30));
			put("meso",      new Member("meso",      99));
		}
	};


	@RequestMapping(method = RequestMethod.POST)
	public Member register(@RequestBody Member member) {
		this.memberStore.put(member.getUser(), member);
		return member;
	}

	@RequestMapping("/{user}")
	public Member get(@PathVariable String user) {
		return this.memberStore.get(user);
	}
}
