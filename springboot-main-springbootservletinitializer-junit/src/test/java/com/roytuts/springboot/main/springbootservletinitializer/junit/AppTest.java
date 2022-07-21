package com.roytuts.springboot.main.springbootservletinitializer.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	@Mock
	private SpringApplicationBuilder springApplicationBuilder;

	@Test
	public void testConfigure() {
		App app = new App();

		Mockito.when(springApplicationBuilder.sources(App.class)).thenReturn(springApplicationBuilder);

		SpringApplicationBuilder result = app.configure(springApplicationBuilder);

		Mockito.verify(springApplicationBuilder).sources(App.class);

		assertEquals(springApplicationBuilder, result);
	}

	@Test
	public void testMain() {
		App.main(new String[] {});
		assertTrue(true);
	}
	
}
