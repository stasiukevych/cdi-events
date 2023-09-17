package cdievents.buissness.observers;

import cdievents.buissness.Notification;
import cdievents.buissness.NotificationByType;
import cdievents.buissness.NotificationByType.NotificationType;
import jakarta.enterprise.event.Observes;

public class NotificationWeekObserver {


  public void accept(
      @Observes @NotificationByType(typeOf = NotificationType.WEEK) Notification notification
  ) {
    System.out.println("Start creation of week notification");
    System.out.println("Notify: " + notification.getMessage());
    System.out.println("Ent creation of week notification");
  }
}