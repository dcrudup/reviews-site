package org.wecancodeit.reviewssite;

public class Review {

	private long id;
	private String image;
	private String name;
	private String description;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public Review(long id, String name, String description, String image) {
		this.id = id;
		this.image = image;
		this.name = name;
		this.description = description;

	}

}