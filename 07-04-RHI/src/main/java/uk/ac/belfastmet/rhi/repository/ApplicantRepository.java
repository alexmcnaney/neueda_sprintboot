package uk.ac.belfastmet.rhi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.rhi.domain.Applicant;



public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {

	Iterable<Applicant> findByOrderByName();	
	
	Iterable<Applicant> findByNameLike(String string);
	
	Iterable<Applicant> findByName(String searchField);

	
}
