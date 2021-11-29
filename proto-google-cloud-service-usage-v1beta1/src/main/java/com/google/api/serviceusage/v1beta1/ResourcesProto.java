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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/resources.proto

package com.google.api.serviceusage.v1beta1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_ServiceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_ServiceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaMetric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaLimit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_QuotaBucket_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_QuotaBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_QuotaBucket_DimensionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_QuotaBucket_DimensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_QuotaOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_QuotaOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_QuotaOverride_DimensionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_QuotaOverride_DimensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_OverrideInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_OverrideInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_DimensionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_DimensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "/google/api/serviceusage/v1beta1/resources.proto\022\037google.api.serviceusage.v1bet"
          + "a1\032\025google/api/auth.proto\032\036google/api/do"
          + "cumentation.proto\032\031google/api/endpoint.p"
          + "roto\032#google/api/monitored_resource.prot"
          + "o\032\033google/api/monitoring.proto\032\026google/a"
          + "pi/quota.proto\032\026google/api/usage.proto\032\031google/protobuf/api.proto\032\034google/api/annotations.proto\"\236\001\n"
          + "\007Service\022\014\n"
          + "\004name\030\001 \001(\t\022\016\n"
          + "\006parent\030\005 \001(\t\022>\n"
          + "\006config\030\002 \001(\0132..google.api.serviceusage.v1beta1.ServiceConfig\0225\n"
          + "\005state\030\004 \001(\0162&.google.api.serviceusage.v1beta1.State\"\225\003\n\r"
          + "ServiceConfig\022\014\n"
          + "\004name\030\001 \001(\t\022\r\n"
          + "\005title\030\002 \001(\t\022\"\n"
          + "\004apis\030\003 \003(\0132\024.google.protobuf.Api\0220\n\r"
          + "documentation\030\006 \001(\0132\031.google.api.Documentation\022 \n"
          + "\005quota\030\n"
          + " \001(\0132\021.google.api.Quota\0222\n"
          + "\016authentication\030\013 \001(\0132\032.google.api.Authentication\022 \n"
          + "\005usage\030\017 \001(\0132\021.google.api.Usage\022\'\n"
          + "\tendpoints\030\022 \003(\0132\024.google.api.Endpoint\022D\n"
          + "\023monitored_resources\030\031"
          + " \003(\0132\'.google.api.MonitoredResourceDescriptor\022*\n\n"
          + "monitoring\030\034 \001(\0132\026.google.api.Monitoring\"+\n"
          + "\021OperationMetadata\022\026\n"
          + "\016resource_names\030\002 \003(\t\"\212\002\n"
          + "\023ConsumerQuotaMetric\022\014\n"
          + "\004name\030\001 \001(\t\022\016\n"
          + "\006metric\030\004 \001(\t\022\024\n"
          + "\014display_name\030\002 \001(\t\022R\n"
          + "\025consumer_quota_limits\030\003"
          + " \003(\01323.google.api.serviceusage.v1beta1.ConsumerQuotaLimit\022]\n"
          + " descendant_consumer_quota_limits\030\006"
          + " \003(\01323.google.api.serviceusage.v1beta1.ConsumerQuotaLimit\022\014\n"
          + "\004unit\030\005 \001(\t\"\271\001\n"
          + "\022ConsumerQuotaLimit\022\014\n"
          + "\004name\030\001 \001(\t\022\016\n"
          + "\006metric\030\010 \001(\t\022\014\n"
          + "\004unit\030\002 \001(\t\022\022\n\n"
          + "is_precise\030\003 \001(\010\022\036\n"
          + "\026allows_admin_overrides\030\007 \001(\010\022C\n\r"
          + "quota_buckets\030\t"
          + " \003(\0132,.google.api.serviceusage.v1beta1.QuotaBucket\"\240\003\n"
          + "\013QuotaBucket\022\027\n"
          + "\017effective_limit\030\001 \001(\003\022\025\n\r"
          + "default_limit\030\002 \001(\003\022I\n"
          + "\021producer_override\030\003"
          + " \001(\0132..google.api.serviceusage.v1beta1.QuotaOverride\022I\n"
          + "\021consumer_override\030\004"
          + " \001(\0132..google.api.serviceusage.v1beta1.QuotaOverride\022F\n"
          + "\016admin_override\030\005"
          + " \001(\0132..google.api.serviceusage.v1beta1.QuotaOverride\022P\n\n"
          + "dimensions\030\006"
          + " \003(\0132<.google.api.serviceusage.v1beta1.QuotaBucket.DimensionsEntry\0321\n"
          + "\017DimensionsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\373\001\n\r"
          + "QuotaOverride\022\014\n"
          + "\004name\030\001 \001(\t\022\026\n"
          + "\016override_value\030\002 \001(\003\022R\n\n"
          + "dimensions\030\003"
          + " \003(\0132>.google.api.serviceusage.v1beta1.QuotaOverride.DimensionsEntry\022\016\n"
          + "\006metric\030\004 \001(\t\022\014\n"
          + "\004unit\030\005 \001(\t\022\037\n"
          + "\027admin_override_ancestor\030\006 \001(\t\0321\n"
          + "\017DimensionsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"Y\n"
          + "\024OverrideInlineSource\022A\n"
          + "\toverrides\030\001"
          + " \003(\0132..google.api.serviceusage.v1beta1.QuotaOverride\"\361\001\n"
          + "\020AdminQuotaPolicy\022\014\n"
          + "\004name\030\001 \001(\t\022\024\n"
          + "\014policy_value\030\002 \001(\003\022U\n\n"
          + "dimensions\030\003"
          + " \003(\0132A.google.api.serviceusage.v1beta1.AdminQuotaPolicy.DimensionsEntry\022\016\n"
          + "\006metric\030\004 \001(\t\022\014\n"
          + "\004unit\030\005 \001(\t\022\021\n"
          + "\tcontainer\030\006 \001(\t\0321\n"
          + "\017DimensionsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"3\n"
          + "\017ServiceIdentity\022\r\n"
          + "\005email\030\001 \001(\t\022\021\n"
          + "\tunique_id\030\002 \001(\t*9\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010DISABLED\020\001\022\013\n"
          + "\007ENABLED\020\002*<\n"
          + "\tQuotaView\022\032\n"
          + "\026QUOTA_VIEW_UNSPECIFIED\020\000\022\t\n"
          + "\005BASIC\020\001\022\010\n"
          + "\004FULL\020\002*~\n"
          + "\020QuotaSafetyCheck\022\"\n"
          + "\036QUOTA_SAFETY_CHECK_UNSPECIFIED\020\000\022\036\n"
          + "\032LIMIT_DECREASE_BELOW_USAGE\020\001\022&\n"
          + "\"LIMIT_DECREASE_PERCENTAGE_TOO_HIGH\020\002B\355\001\n"
          + "#com.google.api.serviceusage.v1beta1B\016ResourcesProtoP\001ZKgoogle.golang.org/genpro"
          + "to/googleapis/api/serviceusage/v1beta1;s"
          + "erviceusage\252\002\037Google.Api.ServiceUsage.V1"
          + "Beta1\312\002\037Google\\Api\\ServiceUsage\\V1beta1\352"
          + "\002\"Google::Api::ServiceUsage::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AuthProto.getDescriptor(),
              com.google.api.DocumentationProto.getDescriptor(),
              com.google.api.EndpointProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.MonitoringProto.getDescriptor(),
              com.google.api.QuotaProto.getDescriptor(),
              com.google.api.UsageProto.getDescriptor(),
              com.google.protobuf.ApiProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_api_serviceusage_v1beta1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_serviceusage_v1beta1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_Service_descriptor,
            new java.lang.String[] {
              "Name", "Parent", "Config", "State",
            });
    internal_static_google_api_serviceusage_v1beta1_ServiceConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_serviceusage_v1beta1_ServiceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_ServiceConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "Title",
              "Apis",
              "Documentation",
              "Quota",
              "Authentication",
              "Usage",
              "Endpoints",
              "MonitoredResources",
              "Monitoring",
            });
    internal_static_google_api_serviceusage_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_serviceusage_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "ResourceNames",
            });
    internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaMetric_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaMetric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaMetric_descriptor,
            new java.lang.String[] {
              "Name",
              "Metric",
              "DisplayName",
              "ConsumerQuotaLimits",
              "DescendantConsumerQuotaLimits",
              "Unit",
            });
    internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaLimit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaLimit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_ConsumerQuotaLimit_descriptor,
            new java.lang.String[] {
              "Name", "Metric", "Unit", "IsPrecise", "AllowsAdminOverrides", "QuotaBuckets",
            });
    internal_static_google_api_serviceusage_v1beta1_QuotaBucket_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_api_serviceusage_v1beta1_QuotaBucket_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_QuotaBucket_descriptor,
            new java.lang.String[] {
              "EffectiveLimit",
              "DefaultLimit",
              "ProducerOverride",
              "ConsumerOverride",
              "AdminOverride",
              "Dimensions",
            });
    internal_static_google_api_serviceusage_v1beta1_QuotaBucket_DimensionsEntry_descriptor =
        internal_static_google_api_serviceusage_v1beta1_QuotaBucket_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_serviceusage_v1beta1_QuotaBucket_DimensionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_QuotaBucket_DimensionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_serviceusage_v1beta1_QuotaOverride_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_api_serviceusage_v1beta1_QuotaOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_QuotaOverride_descriptor,
            new java.lang.String[] {
              "Name", "OverrideValue", "Dimensions", "Metric", "Unit", "AdminOverrideAncestor",
            });
    internal_static_google_api_serviceusage_v1beta1_QuotaOverride_DimensionsEntry_descriptor =
        internal_static_google_api_serviceusage_v1beta1_QuotaOverride_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_serviceusage_v1beta1_QuotaOverride_DimensionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_QuotaOverride_DimensionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_serviceusage_v1beta1_OverrideInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_api_serviceusage_v1beta1_OverrideInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_OverrideInlineSource_descriptor,
            new java.lang.String[] {
              "Overrides",
            });
    internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_descriptor,
            new java.lang.String[] {
              "Name", "PolicyValue", "Dimensions", "Metric", "Unit", "Container",
            });
    internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_DimensionsEntry_descriptor =
        internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_DimensionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_AdminQuotaPolicy_DimensionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_serviceusage_v1beta1_ServiceIdentity_descriptor,
            new java.lang.String[] {
              "Email", "UniqueId",
            });
    com.google.api.AuthProto.getDescriptor();
    com.google.api.DocumentationProto.getDescriptor();
    com.google.api.EndpointProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.MonitoringProto.getDescriptor();
    com.google.api.QuotaProto.getDescriptor();
    com.google.api.UsageProto.getDescriptor();
    com.google.protobuf.ApiProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
