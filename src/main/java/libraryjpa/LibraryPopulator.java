package libraryjpa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryPopulator implements CommandLineRunner {

	@Resource
	private AuthorRepository authorRepo;

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private BookRepository bookRepo;

	@Override
	public void run(String... args) throws Exception {

		Genre fiction = new Genre("Fiction");
		genreRepo.save(fiction);
		Genre nonFiction = new Genre("Non Fiction");
		genreRepo.save(nonFiction);

		Author kathy = new Author("Kathy", "Sierra");
		authorRepo.save(kathy);
		Author bert = new Author("Bert", "Bates");
		authorRepo.save(bert);
		Author elisabeth = new Author("Elisabeth", "Freeman");
		authorRepo.save(elisabeth);
		Author cliff = new Author("Clifford", "Stoll");
		authorRepo.save(cliff);

		Book hfDesign = new Book("Head First Design Patterns", nonFiction, kathy, bert);
		bookRepo.save(hfDesign);
		Book hfJava = new Book("Head First Java", nonFiction, kathy, elisabeth);
		bookRepo.save(hfJava);
		Book cukoo = new Book("The Cukoo's Egg", fiction, cliff);
		bookRepo.save(cukoo);

	} // to close command line runner

}
