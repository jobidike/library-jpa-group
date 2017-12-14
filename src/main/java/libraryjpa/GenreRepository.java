package libraryjpa;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

@Resource
public interface GenreRepository extends CrudRepository<Genre, Long> {

	// need for all bc we need to tie in the entity(Genre)
	
}
