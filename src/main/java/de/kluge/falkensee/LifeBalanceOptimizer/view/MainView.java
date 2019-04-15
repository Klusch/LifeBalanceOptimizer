package de.kluge.falkensee.LifeBalanceOptimizer.view;

import com.vaadin.flow.router.Route;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@Route
public class MainView extends VerticalLayout {

//    private EmployeeRepository employeeRepository;
    private LikeViewVn editor;
    
//    Grid<Employee> grid;
    TextField filter;
    private Button addNewBtn;
	
}
