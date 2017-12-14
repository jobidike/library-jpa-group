package libraryjpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

	@Resource
	GenreRepository genreRepo;

	@Resource
	BookRepository bookRepo;

	@Resource
	AuthorRepository authorRepo;

	@RequestMapping("/")
	public String redirectToBooks(Model model) {
		return "redirect:/books";
	}

	@RequestMapping("/genres")
	public String showAllGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}
	@RequestMapping("/genre")
	public String showAGenre(@RequestParam Long id, Model model) {
		model.addAttribute("genre", genreRepo.findOne(id));
		return "genre";
	}

	@RequestMapping("/books")
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

	@RequestMapping("/authors")
	public String showAllAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}
	@RequestMapping("/author")
	public String showOneAuthor(@RequestParam Long id, Model model) {
		model.addAttribute("author", authorRepo.findOne(id));
		return "author";
	}
	

} // don't touch
