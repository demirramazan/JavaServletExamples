package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeListenerExample implements ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeAdded : " + arg0.getName() + " " + arg0.getValue());
		
	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeRemoved : " + arg0.getName() + " " + arg0.getValue());
		
	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeReplaced : " + arg0.getName() + " " + arg0.getValue());
		
	}

}
