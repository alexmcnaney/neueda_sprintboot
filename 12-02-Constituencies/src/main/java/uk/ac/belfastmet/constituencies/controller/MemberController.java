package uk.ac.belfastmet.constituencies.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.mysql.fabric.xmlrpc.base.Member;


import uk.ac.belfastmet.constituencies.member.AllMembersList;
import uk.ac.belfastmet.constituencies.member.ConstituencyJsonResponse;

@Controller
@RequestMapping("")
public class MemberController {
	
	@Value("${api.constituency.url}")
	private String baseUrl;
	
	
    public String getBaseUrl() {
		return baseUrl;
	}


	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");		

		return "homePage";	
	}
	
	
	
	
	@GetMapping("/view/{constituencyId}")
	public String members(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");
		String membersURL = "";
		RestTemplate restTemplate = new RestTemplate();
		ConstituencyJsonResponse jsonResponse = restTemplate.getForObject(membersURL, ConstituencyJsonResponse.class);
		AllMembersList allMembersList = jsonResponse.getAllMembersList();

		
		//Possible lombok issues here 
		ArrayList<Member> members = allMembersList.getMembers();

		model.addAttribute("constituency", members.get(0).getConstituencyName());
		model.addAttribute("members", requestedMembers);
		return "memberPage";
	}
}


//String allMembersURL = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";	
//RestTemplate restTemplate = new RestTemplate();
//ConstituencyJsonResponse jsonResponse = restTemplate.getForObject(
//		this.getBaseUrl() + constituency.toString(), ConstituencyJsonResponse.class);
//	model.addAttribute("members", members);
//model.addAttribute("constituency", members.get(0).getConstituencyName());

