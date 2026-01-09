public class NotificationManager {
    private static final NotificationManager manager=new NotificationManager();
    private NotificationType type;
    private void setter(NotificationType notif){
        type=notif;
    }
    public static NotificationManager getobj(NotificationType notification){
        return new NotificationManager(notification);
    }
}
