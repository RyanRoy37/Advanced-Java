import javax.management.Notification;
import java.util.Scanner;
public class Notification_Accepter {
    private String n_type;
    private String n_msg;


     public void startapp(){
         Scanner sc=new Scanner(System.in);
         this.n_type=sc.nextLine();
         sc.next();
         this.n_msg=sc.nextLine();
         sc.next();
         NotificationClass notification=NotificationClass.getobj(n_type,n_msg);
         NotificationManager manager=NotificationManager.getobj(notification);

     }

}
