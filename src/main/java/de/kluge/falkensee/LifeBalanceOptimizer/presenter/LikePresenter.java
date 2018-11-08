package de.kluge.falkensee.LifeBalanceOptimizer.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vaadin.flow.router.Route;

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
	
//	@RequestMapping(value = "registration", method = RequestMethod.GET)
//	@RequestMapping(value = "registration/add", method = RequestMethod.POST)
	public void addLike() {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		service.getLikeRepository();
		view.displayLikeCount((int) service.getLikeRepository().count());
	}
	

	
}
