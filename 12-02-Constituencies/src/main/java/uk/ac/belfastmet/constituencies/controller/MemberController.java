package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.mysql.fabric.xmlrpc.base.Member;

import uk.ac.belfastmet.constituencies.member.AllMembersList;

@Controller
@RequestMapping("")
public class MemberController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "All Members");		
		String allMembersURL = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";	
		RestTemplate restTemplate = new RestTemplate();
		AllMembersList allMembers = restTemplate.getForObject(allMembersURL, AllMembersList.class);
		model.addAttribute("events", allMembers.getMembers());

		return "homePage";
	}
	
	
	
	@GetMapping("/view/{constituencyId}")
	public String singleEvent(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");
		String membersURL = "";
		RestTemplate restTemplate = new RestTemplate();
		AllMembersList allMembersList = restTemplate.getForObject(memberURL, AllMembersList.class);
		ArrayList<Member> requestedMembers = new ArrayList<Member>();
	
	}
}

