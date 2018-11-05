package de.kluge.falkensee.LifeBalanceOptimizer.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import de.kluge.falkensee.LifeBalanceOptimizer.presenter.LikePresenter;
import de.kluge.falkensee.LifeBalanceOptimizer.service.LikeService;


/*
 * Das Spring-Framework injiziert diesen Service in den View-Konstruktor,
 * der damit nichts weiter tut als sie an den Konstruktor des Presenters
 * weiterzugeben.
 * 
 * LikeViewVn ist die Vaadin-Implementierung
 */
@Component
public class LikeViewVn extends CustomComponent implements LikeView {

	private LikePresenter likePresenter;
	private Label likeCountDisplay;
	
	@Autowired	
	public LikeViewVn(LikeService likeService) {
		this.likePresenter = new LikePresenter(this, likeService);
		
		likeCountDisplay = new Label("0");
		Button add = new Button(FontAwesome.THUMBS_UP);
		add.addClickListener(event -> likePresenter.addLike());
		setCompositionRoot(new HorizontalLayout(likeCountDisplay, add));
	}

	@Override
	public void displayLikeCount(int likeCount) {
		likeCountDisplay.setValue(Integer.toString(likeCount));
	}

}
