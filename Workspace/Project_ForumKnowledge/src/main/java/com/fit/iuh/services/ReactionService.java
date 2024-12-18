/**
 * Update at 1:45 AM 7/25/2021
 * Author: NguyenThanhLuan
 * Name: ReactionService
 */
package com.fit.iuh.services;

import java.util.Date;
import java.util.List;

import com.fit.iuh.entites.Reaction;

public interface ReactionService {
	public List<Reaction> findAll();

	public Boolean save(Reaction reaction);

	public Boolean update(Reaction reaction);

	public void delete(Reaction reaction);

	public Reaction findByUserAndPost(int userId, int postId);

	List<Reaction> getReactionsCreatedInWeek();

	List<Reaction> getReactionsBetweenDates(Date startDate, Date endDate);

	int countUpvotes(int postId);

	int countDownvotes(int postId);

	int countTotalReactions(int postId);

	List<Reaction> getReactionsByPost(int postId);
}
