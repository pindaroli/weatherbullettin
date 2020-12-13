package com.pindaro.weatherbulletin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pindaro.weatherbulletin.controllers.bulletinController;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private bulletinController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}