package com.example.demo.impl;

import com.example.demo.Addition;

public class DefaultAdditionImpl implements Addition {

	@Override
	public int add(int n1, int n2) {
		int sum = n1+n2; 
		return sum;
	}

}
