package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAdditionImpl;

class DefaultAdditionTest {

	@Test
	void test1() {
		assertEquals(10, new DefaultAdditionImpl().add(5,5));
	}

}
