package libraryjpa;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
//Long is the key value, it increases for each, Long is auto generated
	//Book is the object
}