package com.example.service.usage;

import com.google.api.core.ApiFuture;
import com.google.api.serviceusage.v1.DisableServiceRequest;
import com.google.api.serviceusage.v1.EnableServiceRequest;
import com.google.api.serviceusage.v1.ServiceUsageClient;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class QuickStart {

  public static void main(String[] args) {
    String projectId = "your_project_id";
    String service = "your_service.googleapis.com";
    enableService(projectId, service);
    disableService(projectId, service);
  }

  public static void enableService(String projectId, String service) {
    try (ServiceUsageClient serviceUsageClient = ServiceUsageClient.create()) {

      EnableServiceRequest enableServiceRequest =
          EnableServiceRequest.newBuilder()
              .setName("projects/" + projectId + "/services/" + service)
              .build();
      ApiFuture<Operation> future =
          serviceUsageClient.enableServiceCallable().futureCall(enableServiceRequest);

      // do something

      Operation response = future.get();

    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  public static void disableService(String projectId, String service) {
    try (ServiceUsageClient serviceUsageClient = ServiceUsageClient.create()) {

      DisableServiceRequest disableServiceRequest =
          DisableServiceRequest.newBuilder()
              .setName("projects/" + projectId + "/services/" + service)
              .build();
      ApiFuture<Operation> future =
          serviceUsageClient.disableServiceCallable().futureCall(disableServiceRequest);

      // Do something

      Operation response = future.get();

    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
