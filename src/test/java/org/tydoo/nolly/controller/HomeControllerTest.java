package org.tydoo.nolly.controller;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class HomeControllerTest {

	HomeController unit = new HomeController();;

	@Mock
	Model model;

	@Test
	public void homeTest(){
		assertEquals(unit.home(Locale.UK, model), "home");
	}

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

}
