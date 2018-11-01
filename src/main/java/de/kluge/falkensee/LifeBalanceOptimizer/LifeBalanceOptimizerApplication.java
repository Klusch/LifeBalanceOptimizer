package de.kluge.falkensee.LifeBalanceOptimizer;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //(exclude = SecurityAutoConfiguration.class)
public class LifeBalanceOptimizerApplication {

	public static void main(String[] args) {
		
		// Always running an appication, but using the return value ...
		ApplicationContext ctx = SpringApplication.run(LifeBalanceOptimizerApplication.class, args);
 
        // .. to display what autoconfig does
        String[] beanNames = ctx.getBeanDefinitionNames();
         
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
		
	}
}
