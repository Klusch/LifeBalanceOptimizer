package de.kluge.falkensee.LifeBalanceOptimizer.presenter;

import de.kluge.falkensee.LifeBalanceOptimizer.service.LikeService;
import de.kluge.falkensee.LifeBalanceOptimizer.view.LikeView;

/*
 * Der Presenter ist KEINE Spring-managed Bean,
 * sondern wird vom View instanziiert.
 * Sämtliche vom Presenter benötigten Bean-Referenzen
 * sammeln wir in einer @Service-Klasse.
 */
public class LikePresenter {

	private LikeView view;
	private LikeService service;
	
	public LikePresenter(LikeView view, LikeService service) {
		super();
		this.view = view;
		this.service = service;
	}
	
	public void addLike() {
		service.getLikeRepository(new Like());
		view.displayLikeCount((int) service.getLikeRepository().count());
	}
	
}
