package com.example.example3;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class AuthorRestController {

	@Autowired
	AuthorRepository authorRepository;

	@GetMapping("/allAuthors")
	public Iterable<Author> listAuthors() {
		return authorRepository.findAll();

	}

	@GetMapping("/author/{id}")
	public Author findAuthorById(@PathVariable long id) {
		Optional<Author> author = authorRepository.findById(id);

		if (author.isPresent()) {

			return author.get();
		}

		return null;

	}

	@PostMapping(path = "/addAuthor", consumes = "application/json")
	public void insertAuthor(@RequestBody Author author) {
		authorRepository.save(author);

	}

	@DeleteMapping("/deleteAuthor/{id}")
	public void deleteAuthorById(@PathVariable long id) {
		Optional<Author> author = authorRepository.findById(id);
		if (author.isPresent()) {
			authorRepository.deleteById(id);
		}

	}

	@PutMapping("/updateAuthor/{id}")
	public void upAuthor(@RequestBody Author author, @PathVariable long id) {
		Optional<Author> authorById = authorRepository.findById(id);

		if (authorById.isPresent()) {
			authorRepository.deleteById(id);
		}
		authorRepository.save(author);

	}
}