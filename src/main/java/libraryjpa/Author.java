package libraryjpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

// @ManyToMany
//hey

@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;

	@ManyToMany(mappedBy = "authors")
	private Set<Book> booksByAuthor; //creating as a set so we dont have duplicates,the two we could use are hashset and tree set

	protected Author() {

	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<Book> getBooksByAuthor() {
		return booksByAuthor;
	}

}
