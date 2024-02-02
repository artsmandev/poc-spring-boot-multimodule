package dev.artsman.poc.customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
class CustomerController {
	@GetMapping
	ResponseEntity<List<Customer>> findAll() {
		var bruce = new Customer("Bruce", LocalDate.of(1970, Month.APRIL, 7));
		var customers = List.of(bruce);
		return ResponseEntity.ok(customers);
	}
}
