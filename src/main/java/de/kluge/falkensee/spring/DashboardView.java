package de.kluge.falkensee.spring;

import static de.kluge.falkensee.spring.DashboardView.NAV;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

import de.kluge.falkensee.layout.MainLayout;

@Route(value = NAV, layout = MainLayout.class)
public class DashboardView extends Composite<Div> {
	public static final String NAV = "dashbord";

	public DashboardView() {
		getContent().add(new Span("Dashboard"));
	}
}
