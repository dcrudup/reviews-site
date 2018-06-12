package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		
		Review chocolateChip = new Review(1L, "Chocolate Chip Cookies", "Description");
		Review peanutButter = new Review(2L, "Peanut Butter Cookies", "Description");
		Review butter = new Review(3L, "Butter Cookies", "Description");
		
		reviewList.put(chocolateChip.getId(), chocolateChip);
		reviewList.put(peanutButter.getId(), peanutButter);
		reviewList.put(butter.getId(), butter);
	}
	
	//constructor for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {

		return reviewList.values();
	}
}
