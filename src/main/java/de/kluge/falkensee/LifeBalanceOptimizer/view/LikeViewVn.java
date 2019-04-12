package de.kluge.falkensee.LifeBalanceOptimizer.view;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

import de.kluge.falkensee.LifeBalanceOptimizer.presenter.LikePresenter;
import de.kluge.falkensee.LifeBalanceOptimizer.service.LikeService;


@Theme("mytheme")
@Route
public class LikeViewVn extends VerticalLayout implements LikeView {

	private static final long serialVersionUID = -7703649349582987526L;
	
	private LikePresenter likePresenter;
	private Label likeCountDisplay;
	
	@Autowired	
	public LikeViewVn(LikeService likeService) {
		this.likePresenter = new LikePresenter(this, likeService);
		
		likeCountDisplay = new Label("0");
		Button button = new Button("FontAwesome.THUMBS_UP", event -> Notification.show("Clicked!"));
		
		
		this.addComponent(button);

	}

	@Override
	public void displayLikeCount(int likeCount) {
		likeCountDisplay.setText(Integer.toString(likeCount));
	}

	public void o() {
		System.out.println("Ein Schelm");
	}
	
}
