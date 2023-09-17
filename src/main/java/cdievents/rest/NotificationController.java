package cdievents.rest;

import cdievents.buissness.NotificationSender;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("notification")
public class NotificationController {

  @Inject
  private NotificationSender sender;

  @GET
  @Path("yearNotify/{content}")
  public void sendYearNotification(@PathParam("content") String content) {
    sender.sendNotification("YEAR", content);
  }

  @GET
  @Path("monthNotify/{content}")
  public void sendMonthNotification(@PathParam("content") String content) {
    sender.sendNotification("MONTH", content);
  }

  @GET
  @Path("weekNotify/{content}")
  public void sendWeekNotification(@PathParam("content") String content) {
    sender.sendNotification("WEEK", content);
  }
}