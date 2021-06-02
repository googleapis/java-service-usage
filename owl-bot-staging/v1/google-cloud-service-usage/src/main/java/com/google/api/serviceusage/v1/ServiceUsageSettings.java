/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.api.serviceusage.v1;

import static com.google.api.serviceusage.v1.ServiceUsageClient.ListServicesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.serviceusage.v1.stub.ServiceUsageStubSettings;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ServiceUsageClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (serviceusage.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getService to 30 seconds:
 *
 * <pre>{@code
 * ServiceUsageSettings.Builder serviceUsageSettingsBuilder = ServiceUsageSettings.newBuilder();
 * serviceUsageSettingsBuilder
 *     .getServiceSettings()
 *     .setRetrySettings(
 *         serviceUsageSettingsBuilder
 *             .getServiceSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ServiceUsageSettings serviceUsageSettings = serviceUsageSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ServiceUsageSettings extends ClientSettings<ServiceUsageSettings> {

  /** Returns the object with the settings used for calls to enableService. */
  public UnaryCallSettings<EnableServiceRequest, Operation> enableServiceSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).enableServiceSettings();
  }

  /** Returns the object with the settings used for calls to enableService. */
  public OperationCallSettings<EnableServiceRequest, EnableServiceResponse, OperationMetadata>
      enableServiceOperationSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).enableServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to disableService. */
  public UnaryCallSettings<DisableServiceRequest, Operation> disableServiceSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).disableServiceSettings();
  }

  /** Returns the object with the settings used for calls to disableService. */
  public OperationCallSettings<DisableServiceRequest, DisableServiceResponse, OperationMetadata>
      disableServiceOperationSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).disableServiceOperationSettings();
  }

  /** Returns the object with the settings used for calls to getService. */
  public UnaryCallSettings<GetServiceRequest, Service> getServiceSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).getServiceSettings();
  }

  /** Returns the object with the settings used for calls to listServices. */
  public PagedCallSettings<ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
      listServicesSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).listServicesSettings();
  }

  /** Returns the object with the settings used for calls to batchEnableServices. */
  public UnaryCallSettings<BatchEnableServicesRequest, Operation> batchEnableServicesSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).batchEnableServicesSettings();
  }

  /** Returns the object with the settings used for calls to batchEnableServices. */
  public OperationCallSettings<
          BatchEnableServicesRequest, BatchEnableServicesResponse, OperationMetadata>
      batchEnableServicesOperationSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).batchEnableServicesOperationSettings();
  }

  /** Returns the object with the settings used for calls to batchGetServices. */
  public UnaryCallSettings<BatchGetServicesRequest, BatchGetServicesResponse>
      batchGetServicesSettings() {
    return ((ServiceUsageStubSettings) getStubSettings()).batchGetServicesSettings();
  }

  public static final ServiceUsageSettings create(ServiceUsageStubSettings stub)
      throws IOException {
    return new ServiceUsageSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ServiceUsageStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ServiceUsageStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ServiceUsageStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ServiceUsageStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ServiceUsageStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ServiceUsageStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ServiceUsageStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ServiceUsageSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ServiceUsageSettings. */
  public static class Builder extends ClientSettings.Builder<ServiceUsageSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ServiceUsageStubSettings.newBuilder(clientContext));
    }

    protected Builder(ServiceUsageSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ServiceUsageStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ServiceUsageStubSettings.newBuilder());
    }

    public ServiceUsageStubSettings.Builder getStubSettingsBuilder() {
      return ((ServiceUsageStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to enableService. */
    public UnaryCallSettings.Builder<EnableServiceRequest, Operation> enableServiceSettings() {
      return getStubSettingsBuilder().enableServiceSettings();
    }

    /** Returns the builder for the settings used for calls to enableService. */
    public OperationCallSettings.Builder<
            EnableServiceRequest, EnableServiceResponse, OperationMetadata>
        enableServiceOperationSettings() {
      return getStubSettingsBuilder().enableServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to disableService. */
    public UnaryCallSettings.Builder<DisableServiceRequest, Operation> disableServiceSettings() {
      return getStubSettingsBuilder().disableServiceSettings();
    }

    /** Returns the builder for the settings used for calls to disableService. */
    public OperationCallSettings.Builder<
            DisableServiceRequest, DisableServiceResponse, OperationMetadata>
        disableServiceOperationSettings() {
      return getStubSettingsBuilder().disableServiceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getService. */
    public UnaryCallSettings.Builder<GetServiceRequest, Service> getServiceSettings() {
      return getStubSettingsBuilder().getServiceSettings();
    }

    /** Returns the builder for the settings used for calls to listServices. */
    public PagedCallSettings.Builder<
            ListServicesRequest, ListServicesResponse, ListServicesPagedResponse>
        listServicesSettings() {
      return getStubSettingsBuilder().listServicesSettings();
    }

    /** Returns the builder for the settings used for calls to batchEnableServices. */
    public UnaryCallSettings.Builder<BatchEnableServicesRequest, Operation>
        batchEnableServicesSettings() {
      return getStubSettingsBuilder().batchEnableServicesSettings();
    }

    /** Returns the builder for the settings used for calls to batchEnableServices. */
    public OperationCallSettings.Builder<
            BatchEnableServicesRequest, BatchEnableServicesResponse, OperationMetadata>
        batchEnableServicesOperationSettings() {
      return getStubSettingsBuilder().batchEnableServicesOperationSettings();
    }

    /** Returns the builder for the settings used for calls to batchGetServices. */
    public UnaryCallSettings.Builder<BatchGetServicesRequest, BatchGetServicesResponse>
        batchGetServicesSettings() {
      return getStubSettingsBuilder().batchGetServicesSettings();
    }

    @Override
    public ServiceUsageSettings build() throws IOException {
      return new ServiceUsageSettings(this);
    }
  }
}
