package uk.ac.belfastmet.constituencies.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

	@JsonProperty("PersonId")
	private String personId;
	@JsonProperty("AffiliationId")
	private String affiliationId;
	@JsonProperty("MemberName")
	private String memberName;
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	@JsonProperty("MemberLastName")
	private String memberLastame;
	@JsonProperty("MemberSortName")
	private String memberSortName;
	@JsonProperty("Party")
	private String party;
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConsitutencyId")
	private String constituencyId;
}
