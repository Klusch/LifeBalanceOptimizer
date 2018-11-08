package de.kluge.falkensee.LifeBalanceOptimizer.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import de.kluge.falkensee.LifeBalanceOptimizer.presenter.LikePresenter;
import de.kluge.falkensee.LifeBalanceOptimizer.service.LikeService;


/*
 * Das Spring-Framework injiziert diesen Service in den View-Konstruktor,
 * der damit nichts weiter tut als sie an den Konstruktor des Presenters
 * weiterzugeben.
 * 
 * LikeViewVn ist die Vaadin-Implementierung
 */
//@Component
@Route("o")
public class LikeViewVn extends VerticalLayout  //extends CustomComponent 
implements LikeView {

	private LikePresenter likePresenter;
	private Label likeCountDisplay;
	
	@Autowired	
	public LikeViewVn(LikeService likeService) {
		this.likePresenter = new LikePresenter(this, likeService);
		
		likeCountDisplay = new Label("0");
		Button button = new Button("FontAwesome.THUMBS_UP", event -> Notification.show("Clicked!"));
		
		
		add(button);

	}

	@Override
	public void displayLikeCount(int likeCount) {
		likeCountDisplay.setText(Integer.toString(likeCount));
	}

}
