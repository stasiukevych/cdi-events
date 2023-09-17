package cdievents.buissness.observers;

import cdievents.buissness.Notification;
import cdievents.buissness.NotificationByType;
import cdievents.buissness.NotificationByType.NotificationType;
import jakarta.enterprise.event.Observes;

public class NotificationMonthObserver {

  public void accept(
      @Observes @NotificationByType(typeOf = NotificationType.MONTH) Notification notification
  ) {
    System.out.println("Start creation of month notification");
    System.out.println("Notify: " + notification.getMessage());
    System.out.println("Ent creation of month notification");
  }
}