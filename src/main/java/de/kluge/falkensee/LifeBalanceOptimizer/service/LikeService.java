package de.kluge.falkensee.LifeBalanceOptimizer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kluge.falkensee.LifeBalanceOptimizer.model.LikeRepository;

@Service
public class LikeService {

	@Autowired
	private LikeRepository likeRepository;
	
	public LikeRepository getLikeRepository() {
		return likeRepository;
	}


}
