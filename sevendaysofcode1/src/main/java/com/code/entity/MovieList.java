package com.code.entity;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

	private List<Items> items;

	public MovieList() {
		this.items = new ArrayList<>();
	}

	public List<Items> getItems() {
		return items;
	}
}
