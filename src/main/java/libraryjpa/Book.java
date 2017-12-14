package libraryjpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

// @ManyToOne and a @ManyToMany 

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String title;

	@ManyToMany
	private Set<Author> authors; //dont need hast set up here bc it would override the hasset in constructor

	@ManyToOne 
	private Genre genre;

	protected Book() {
	}

	public Book(String title, Genre genre, Author... author) {
		this.title = title;
		this.genre = genre;
		this.authors = new HashSet<Author>(Arrays.asList(author)); //can also leave Author in hashset blank
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Set<Author> getAuthor() {
		return authors;
	}

	public Genre getGenre() {
		return genre;
	}
	//dont have to use toString here
	@Override
	public String toString() {
		return title;
	}

}
