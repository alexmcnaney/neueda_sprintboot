package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.mysql.fabric.xmlrpc.base.Member;

import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.ConstituencyJsonResponse;

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
		model.addAttribute("pageTitle", "Constituencies");

		return "homePage";
	}

	@GetMapping("/view/{constituency}")
	public String members(@PathVariable Integer constituency, Model model) {
		model.addAttribute("pageTitle", "Constituency");
		RestTemplate restTemplate = new RestTemplate();
		ConstituencyJsonResponse jsonResponse = restTemplate.getForObject(this.getBaseUrl() + constituency.toString(),
		ConstituencyJsonResponse.class);
	

		// Possible lombok issues here
		ArrayList<Member> members = jsonResponse.getAllMembersList().getMembers();
		model.addAttribute("members", members);
		model.addAttribute("constituency", members.get(0).getConstituencyName());
		

		return "memberPage";
	}

}
