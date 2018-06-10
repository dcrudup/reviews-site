package org.wecancodeit.reviewssite;

public class Review {

	private long reviewId;

	public Review(long reviewId, String string, String string2, String string3, String string4) {
		this.reviewId = reviewId;
	}

	public Long getReviewId() {
		return reviewId;
	}

}
