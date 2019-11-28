package de.kluge.falkensee.spring;


import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import de.kluge.falkensee.layout.MainLayout;

@Route(value = VaadinApp.NAVIGATION_ROOT, layout = MainLayout.class)
public class VaadinApp extends Composite<Div> implements HasLogger {

  public static final String NAVIGATION_ROOT = "";

  @Override
  protected void onAttach(AttachEvent attachEvent) {
    super.onAttach(attachEvent);
    logger().info("navigated to ROOT .. now redirecting..");
    UI.getCurrent().navigate(MainView.class);
  }
}
