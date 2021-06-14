/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
