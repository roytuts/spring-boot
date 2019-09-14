package com.roytuts.spring.mvc.autocomplete.input.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoCompleteDao {

	private static final List<String> strings;

	static {
		strings = new ArrayList<>();
		strings.add("Lorem Ipsum is simply dummy text of the printing and typesetting");
		strings.add("Lorem Ipsum has been the industry's standard dummy");
		strings.add("nd scrambled it to make a type specimen book. It");
		strings.add("typesetting, remaining essentially unchanged. It ");
		strings.add("sum passages, and more recently with desktop publi");
		strings.add("Contrary to popular belief, Lorem Ipsum is not sim");
		strings.add("professor at Hampden-Sydney College in Virginia, looked up one");
		strings.add("passage, and going through the cites of the word in");
		strings.add("comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum");
		strings.add("BC. This book is a treatise on the theory of ethics, very popu");
		strings.add("here are many variations of passages of Lorem Ipsum availa");
		strings.add("believable. If you are going to use a passage of Lorem Ips");
		strings.add("middle of text. All the Lorem Ipsum generators on the Intern");
		strings.add("tend to repeat predefined chunks as necessary, making this the");
		strings.add("first true generator on the Internet. It uses a dictionary of over 20");
		strings.add("he standard chunk of Lorem Ipsum used since the 1500s i");
		strings.add("1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are als");
		strings.add("reproduced in their exact original form, accompanied by English");
		strings.add("eadable content of a page when looking at its layout. The point");
	}

	public static List<String> getStrings(final String input) {
		return strings.stream().filter(s -> s.toLowerCase().contains(input.toLowerCase())).collect(Collectors.toList());
	}

}
