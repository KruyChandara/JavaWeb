import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyListener implements ServletRequestAttributeListener, HttpSessionAttributeListener {

//    ServletRequestAttributeListener
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("===================");
        System.out.println("Added attribute"+"\nName:"+srae.getName()+"\nValue:"+srae.getValue());
        System.out.println("===================");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("===================");
        System.out.println("Removed attribute"+"\nName:"+srae.getName()+"\nValue:"+srae.getValue());
        System.out.println("===================");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("===================");
        System.out.println("Replaced attribute\n"+"Name:"+srae.getName()+"\nValue:"+srae.getValue());
        System.out.println("===================");
    }
//  HttpSessionAttributeListener
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("===================");
        System.out.println("Added attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
        System.out.println("===================");
    }

    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("===================");
        System.out.println("Removed attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
        System.out.println("===================");
    }

    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("===================");
        System.out.println("Replaced attribute in Session"+"\nName:"+se.getName()+"\nValue:"+se.getValue());
        System.out.println("===================");
    }

}
