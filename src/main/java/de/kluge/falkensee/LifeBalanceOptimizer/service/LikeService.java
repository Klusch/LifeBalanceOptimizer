package de.kluge.falkensee.LifeBalanceOptimizer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.kluge.falkensee.LifeBalanceOptimizer.model.Like;
import de.kluge.falkensee.LifeBalanceOptimizer.model.repositories.LikeRepository;

@Service
public class LikeService {

	@Autowired
	private LikeRepository likeRepository; 
	
	public LikeRepository getLikeRepository() {
		return likeRepository;
	}

    @Transactional
    public void addClient(Like like){
    	likeRepository.save(like);
    }

}
