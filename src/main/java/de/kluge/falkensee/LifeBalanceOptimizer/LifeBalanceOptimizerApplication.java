package de.kluge.falkensee.LifeBalanceOptimizer;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // (exclude = SecurityAutoConfiguration.class)
public class LifeBalanceOptimizerApplication extends SpringBootServletInitializer implements CommandLineRunner {

	private static final boolean DEBUG = false;

	@Autowired
    DataSource dataSource;
	
	// Running as WAR on a server ...
	// ... or speed up by Spring Boot and main()
	public static void main(String[] args) {

		// Always running an application, but using the return value ...
		ApplicationContext ctx = SpringApplication.run(LifeBalanceOptimizerApplication.class, args);

		if (DEBUG) {
			// .. to display what autoconfig does
			String[] beanNames = ctx.getBeanDefinitionNames();

			Arrays.sort(beanNames);

			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		}

	}
	
    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataSource = " + dataSource);
    }
    
}
