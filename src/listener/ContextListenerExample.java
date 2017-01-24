package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerExample implements ServletContextListener {
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ContextListenerExample1");

	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ContextListenerExample destroyed");

	}
}
