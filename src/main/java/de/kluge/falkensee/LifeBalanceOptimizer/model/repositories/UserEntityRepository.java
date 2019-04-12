package de.kluge.falkensee.LifeBalanceOptimizer.model.repositories;

import org.springframework.data.repository.CrudRepository;

import de.kluge.falkensee.LifeBalanceOptimizer.model.entities.UserEntity;

public interface UserEntityRepository extends CrudRepository<UserEntity, Long> {

}
