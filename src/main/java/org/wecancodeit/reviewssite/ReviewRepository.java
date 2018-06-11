package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		
		Review chocolateChip = new Review(1L, "ImageURL", "Chocolate Chip Cookies", "Description", "WebsiteUrl");
		Review peanutButter = new Review(2L, "ImageURL", "Peanut Butter Cookies", "Description", "WebsiteUrl");
		Review butter = new Review(3L, "ImageURL", "Butter Cookies", "Description", "WebsiteUrl");
		
		reviewList.put(chocolateChip.getReviewId(), chocolateChip);
		reviewList.put(peanutButter.getReviewId(), peanutButter);
		reviewList.put(butter.getReviewId(), butter);
	}
	
	//constructor for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getReviewId(), review);
		}
	}

	public Review findOne(long reviewId) {
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAll() {

		return reviewList.values();
	}

}
