package de.kluge.falkensee.spring;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import de.kluge.falkensee.layout.MainLayout;

@Route(value = MainView.NAV_MAIN_VIEW, layout = MainLayout.class)
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends Composite<Div> {

	public static final String NAV_MAIN_VIEW = "main";
	public static final String PAGE_CONTENT_ID = "page-content";
	public static final String PAGE_CONTENT = "Page content";

	public MainView(@Autowired MessageBean bean) {
		
	    final Span pageContent = new Span(PAGE_CONTENT);
	    pageContent.setId(PAGE_CONTENT_ID);
	    getContent().add(pageContent);
		
		Button button = new Button("Click me", e -> Notification.show(bean.getMessage()));
//		add(button);
	}

}
