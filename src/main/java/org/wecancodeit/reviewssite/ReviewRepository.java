package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {

		Review chocolateChip = new Review(1L, "Chocolate Chip Cookies",
				"This is the perfect chocolate chip cookie!! Crispy on the outside and chewy on the inside!!",
				"/images/chocolate-chip-cookies.jpg");

		Review peanutButter = new Review(2L, "Peanut Butter Cookies",
				"These cookies are TOO DIE FOR GOOD! They're soft, decadent, and delicious.",
				"/images/peanut-butter-cookies.jpg");

		Review spritz = new Review(3L, "Spritz Cookies",
				"These are the best spritz cookies!!! They are light and crispy with a rich, buttery taste.",
				"/images/spritz-cookies.jpg");

		reviewList.put(chocolateChip.getId(), chocolateChip);
		reviewList.put(peanutButter.getId(), peanutButter);
		reviewList.put(spritz.getId(), spritz);
	}

	// constructor for testing purposes
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