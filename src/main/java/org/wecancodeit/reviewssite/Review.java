package org.wecancodeit.reviewssite;

public class Review {

	private long reviewId;
	private String name;
	private String description;

	public long getReviewId() {
		return reviewId;
	}

	public String getName() {
		return "name";
	}

	public String getDescription() {
		return "description";
	}

	public Review(long reviewId, String name, String description) {
		this.reviewId = reviewId;
		this.name = name;
		this.description = description;
		
	}

}
