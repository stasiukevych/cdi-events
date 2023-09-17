package cdievents.buissness;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import java.util.Date;

public class NotificationSender {

  @Inject
  private Event<Notification> notification;

  public void sendNotification(String typeOf, String content) {

    notification
        .select(new NotificationBinding(NotificationByType.NotificationType.valueOf(typeOf)))
        .fire(new Notification(content, new Date()));
  }
}