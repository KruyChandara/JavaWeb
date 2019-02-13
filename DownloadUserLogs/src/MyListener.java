import javax.servlet.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletRequestAttributeListener, HttpSessionAttributeListener, ServletContextAttributeListener,
        ServletContextListener, HttpSessionListener, ServletRequestListener {

//    ServletRequestAttributeListener
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("==========> Added attribute"+"\nName:"+srae.getName()+"\nValue:"+srae.getValue());
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("==========> Removed attribute"+"\nName:"+srae.getName()+"\nValue:"+srae.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("==========> Replaced attribute\n"+"Name:"+srae.getName()+"\nValue:"+srae.getValue());
    }
//  HttpSessionAttributeListener
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("==========> Added attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("==========> Removed attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("==========> Replaced attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
    }
//  ServletContextAttributeListener
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("==========> Added attribute in Context"+"\nName:"+scae.getName()+"\nValue:"+scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("==========> removed attribute in Context"+"\nName:"+scae.getName()+"\nValue:"+scae.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("==========> replaced attribute in Context"+"\nName:"+scae.getName()+"\nValue:"+scae.getValue());
    }
//  Servlet Context life circle
    public void contextInitialized(ServletContextEvent sce) {
//        context created when deploy
        System.out.println("==========> Context Initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
//        context destroyed when shutdown server or un deployed by container
        System.out.println("==========> Context Destroyed");
    }

//    Https Session listener
//    a new session object is created automatically by the container whenever new request to the server
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("==========> new session created"+ se.toString() + se.getSession());
    }


    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("=========> session destroyed");
    }
//    Servlet Request Listener
//    request n destroyed is destroyed by container only (container manage object)
    public void requestDestroyed(ServletRequestEvent sre) {
        // happen when server response
        System.out.println("========> request Destroyed");
    }

    public void requestInitialized(ServletRequestEvent sre) {
        // happen when request to server
        System.out.println("========> request initialized");
    }
}
