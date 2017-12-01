package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findTop3ByAuthor(String string);
	Iterable<Dwarf> findByAuthor(String string);
	Iterable<Dwarf> findByNameOrderByNameAsc(String string);
	Iterable<Dwarf> findByName(String string);	
	Iterable<Dwarf> findByOrderByName(String string);

	
}
