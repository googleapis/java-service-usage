// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

/**
 * <pre>
 * Request message for the `BatchEnableServices` method.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.BatchEnableServicesRequest}
 */
public final class BatchEnableServicesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.BatchEnableServicesRequest)
    BatchEnableServicesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchEnableServicesRequest.newBuilder() to construct.
  private BatchEnableServicesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchEnableServicesRequest() {
    parent_ = "";
    serviceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchEnableServicesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BatchEnableServicesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              serviceIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            serviceIds_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        serviceIds_ = serviceIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_BatchEnableServicesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_BatchEnableServicesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.class, com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Parent to enable services on.
   * An example name would be:
   * `projects/123`
   * where `123` is the project number (not project ID).
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Parent to enable services on.
   * An example name would be:
   * `projects/123`
   * where `123` is the project number (not project ID).
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList serviceIds_;
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   * @return A list containing the serviceIds.
   */
  public com.google.protobuf.ProtocolStringList
      getServiceIdsList() {
    return serviceIds_;
  }
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   * @return The count of serviceIds.
   */
  public int getServiceIdsCount() {
    return serviceIds_.size();
  }
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The serviceIds at the given index.
   */
  public java.lang.String getServiceIds(int index) {
    return serviceIds_.get(index);
  }
  /**
   * <pre>
   * The identifiers of the services to enable on the project.
   * A valid identifier would be:
   * serviceusage.googleapis.com
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the serviceIds at the given index.
   */
  public com.google.protobuf.ByteString
      getServiceIdsBytes(int index) {
    return serviceIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < serviceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < serviceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(serviceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getServiceIdsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest other = (com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getServiceIdsList()
        .equals(other.getServiceIdsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getServiceIdsCount() > 0) {
      hash = (37 * hash) + SERVICE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getServiceIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for the `BatchEnableServices` method.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.BatchEnableServicesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.BatchEnableServicesRequest)
      com.google.api.serviceusage.v1beta1.BatchEnableServicesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_BatchEnableServicesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_BatchEnableServicesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.class, com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      serviceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto.internal_static_google_api_serviceusage_v1beta1_BatchEnableServicesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest build() {
      com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest buildPartial() {
      com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest result = new com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest(this);
      int from_bitField0_ = bitField0_;
      result.parent_ = parent_;
      if (((bitField0_ & 0x00000001) != 0)) {
        serviceIds_ = serviceIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.serviceIds_ = serviceIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest) {
        return mergeFrom((com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest other) {
      if (other == com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.serviceIds_.isEmpty()) {
        if (serviceIds_.isEmpty()) {
          serviceIds_ = other.serviceIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureServiceIdsIsMutable();
          serviceIds_.addAll(other.serviceIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Parent to enable services on.
     * An example name would be:
     * `projects/123`
     * where `123` is the project number (not project ID).
     * The `BatchEnableServices` method currently only supports projects.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Parent to enable services on.
     * An example name would be:
     * `projects/123`
     * where `123` is the project number (not project ID).
     * The `BatchEnableServices` method currently only supports projects.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Parent to enable services on.
     * An example name would be:
     * `projects/123`
     * where `123` is the project number (not project ID).
     * The `BatchEnableServices` method currently only supports projects.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent to enable services on.
     * An example name would be:
     * `projects/123`
     * where `123` is the project number (not project ID).
     * The `BatchEnableServices` method currently only supports projects.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent to enable services on.
     * An example name would be:
     * `projects/123`
     * where `123` is the project number (not project ID).
     * The `BatchEnableServices` method currently only supports projects.
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList serviceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureServiceIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serviceIds_ = new com.google.protobuf.LazyStringArrayList(serviceIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @return A list containing the serviceIds.
     */
    public com.google.protobuf.ProtocolStringList
        getServiceIdsList() {
      return serviceIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @return The count of serviceIds.
     */
    public int getServiceIdsCount() {
      return serviceIds_.size();
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The serviceIds at the given index.
     */
    public java.lang.String getServiceIds(int index) {
      return serviceIds_.get(index);
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the serviceIds at the given index.
     */
    public com.google.protobuf.ByteString
        getServiceIdsBytes(int index) {
      return serviceIds_.getByteString(index);
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The serviceIds to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureServiceIdsIsMutable();
      serviceIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param value The serviceIds to add.
     * @return This builder for chaining.
     */
    public Builder addServiceIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureServiceIdsIsMutable();
      serviceIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param values The serviceIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllServiceIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureServiceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, serviceIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceIds() {
      serviceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The identifiers of the services to enable on the project.
     * A valid identifier would be:
     * serviceusage.googleapis.com
     * Enabling services requires that each service is public or is shared with
     * the user enabling the service.
     * Two or more services must be specified. To enable a single service,
     * use the `EnableService` method instead.
     * A single request can enable a maximum of 20 services at a time. If more
     * than 20 services are specified, the request will fail, and no state changes
     * will occur.
     * </pre>
     *
     * <code>repeated string service_ids = 2;</code>
     * @param value The bytes of the serviceIds to add.
     * @return This builder for chaining.
     */
    public Builder addServiceIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureServiceIdsIsMutable();
      serviceIds_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.BatchEnableServicesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.BatchEnableServicesRequest)
  private static final com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest();
  }

  public static com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchEnableServicesRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchEnableServicesRequest>() {
    @java.lang.Override
    public BatchEnableServicesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BatchEnableServicesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BatchEnableServicesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchEnableServicesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.BatchEnableServicesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
