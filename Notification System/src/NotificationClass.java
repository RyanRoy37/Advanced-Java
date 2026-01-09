abstract class  NotificationType {
     String n_type;
     String n_msg;

     protected void settype(String n_type){
         this.n_type=n_type;
     }

     protected void setmsg(String n_msg){
         this.n_msg=n_msg;
     }

     protected String gettype(){
         return this.n_type;
     }

     protected String getmsg(){
         return this.n_msg;
     }

     abstract protected void callsender();

}

class SMSNotificationClass extends NotificationType{

    @Override
    protected void callsender(){}
}


class EMAILNotificationClass extends NotificationType{

    @Override
    protected void callsender(){}
}

class WHATSAPPNotificationClass extends NotificationType{

    @Override
    protected void callsender(){}
}

public class NotificationClass {
    private String n_type, n_msg;

    private NotificationClass(String n_type, String n_msg)
    {
        this.n_type = n_type;
        this.n_msg = n_msg;
    }

    public static NotificationClass getobj(String n_type, String  n_msg){
        return new NotificationClass(n_type, n_msg);
    }

    public  NotificationType getnotif() {
        NotificationType type;
        switch (n_type) {
            case "SMS":
                type = new SMSNotificationClass();
                type.setmsg(n_msg);
                type.settype(n_type);
                break;

            case "EMAIL":
                type = new EMAILNotificationClass();
                type.setmsg(n_msg);
                type.settype(n_type);
                break;
            case "WHATSAPP":
                type = new WHATSAPPNotificationClass();
                type.setmsg(n_msg);
                type.settype(n_type);
                break;
            default:
                type = null;


        }

        return type;

    }
}