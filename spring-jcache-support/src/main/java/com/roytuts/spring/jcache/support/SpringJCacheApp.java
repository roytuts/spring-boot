package com.roytuts.spring.jcache.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roytuts.spring.jcache.support.model.Person;
import com.roytuts.spring.jcache.support.repository.PersonRepository;

@SpringBootApplication(scanBasePackages = "com.roytuts.spring.jcache.support")
public class SpringJCacheApp implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJCacheApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Fetching Person details");
		Person person = personRepository.findPerson(String.valueOf(1));
		System.out.println("Cached Person Info: " + person);
		personRepository.savePerson("1000", new Person("1000", "Soumitra Roy"));
		System.out.println("Saved Person Info in cache: " + personRepository.findPerson("1000"));
		personRepository.removePerson(new Person("1000", "Soumitra Roy"));
		System.out.println("Has Person Info removed from cache: " + (personRepository.findPerson("1000") != null));
		personRepository.removeAllPersons();
		System.out
				.println("Is there still any Person Info in the cache: " + (personRepository.findPerson("1") != null));
	}
}
