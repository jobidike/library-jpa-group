package libraryjpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// oneToMany

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;
	private String genre;

	protected Genre() {

	}

	public Genre(String genre) {
		this.genre = genre;
	}

	@OneToMany(mappedBy = "genre")
	private Set<Book> booksInGenre = new HashSet<Book>();

	public Set<Book> getBooksInGenre() {
		return booksInGenre;
	}

	public Long getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return genre;
	}

} // to close class. don't touch!
