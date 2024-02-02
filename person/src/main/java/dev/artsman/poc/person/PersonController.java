package dev.artsman.poc.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/people")
@RestController
class PersonController {
	@GetMapping
	ResponseEntity<List<Person>> findAll() {
		var bruce = new Person("Bruce", LocalDate.of(1970, Month.APRIL, 7));
		var persons = List.of(bruce);
		return ResponseEntity.ok(persons);
	}
}
