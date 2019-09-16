package com.roytuts.spring.jcache.support.repository;

import javax.annotation.PostConstruct;
import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CachePut;
import javax.cache.annotation.CacheRemove;
import javax.cache.annotation.CacheRemoveAll;
import javax.cache.annotation.CacheResult;
import javax.cache.annotation.CacheValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Repository;

import com.roytuts.spring.jcache.support.model.Person;

@Repository
@EnableCaching
@CacheConfig(cacheNames = "person")
@CacheDefaults(cacheName = "person")
public class PersonRepository {

	@Autowired
	private CacheManager cacheManager;
	private Cache<String, Person> cache;
	private static String[] names = new String[] { "Younker Patel", "Zollicoffer Robinson", "Zeh Haugen",
			"Yager Johansen", "Zickefoose Macdonald", "Yerkes Karlsson", "Yerby Gustavsson", "Zimple Svensson",
			"Youmans Stewart", "Zahn Davis", "Zenz Davis", "Zamastil Jackson", "Zamastil Gustavsson", "Zucchero Walker",
			"Zielke Martin", "Zabowski Carlsson", "Yoes Hansson", "Zuczek Smith", "Zeidler Watson", "Yingling Harris",
			"Zahn Karlsen", "Zimmermann Olsson", "Zerkey Martin", "Zatovich Andersson", "Yurky Andersson",
			"Yeary Carlsson", "Yeary Olsen", "Zabowski Olsen", "Zuber Jackson", "Zeim Nilsen" };

	@PostConstruct
	public void init() {
		cache = cacheManager.getCache("person");
		int id = 1;
		for (String name : names) {
			cache.putIfAbsent(String.valueOf(id), new Person(String.valueOf(id), name));
			id++;
		}
	}

	@CacheResult
	public Person findPerson(@CacheKey String id) {
		return cache.get(id);
	}

	@CachePut
	public Person savePerson(@CacheKey String id, @CacheValue Person person) {
		return cache.getAndPut(id, person);
	}

	@CacheRemove
	public void removePerson(Person person) {
		cache.getAndRemove(person.getId());
	}

	@CacheRemoveAll
	public void removeAllPersons() {
		cache.clear();
	}

}
