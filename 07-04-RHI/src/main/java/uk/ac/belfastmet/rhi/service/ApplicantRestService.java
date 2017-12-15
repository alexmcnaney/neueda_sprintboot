package uk.ac.belfastmet.rhi.service;

import uk.ac.belfastmet.rhi.domain.Applicant;

public interface ApplicantRestService {
	
	Iterable<Applicant> list();
	Applicant create(Applicant applicant);
	Applicant read(Applicant applicant);
	Applicant update(Applicant applicant);
	void delete(Integer applicantId);

}
