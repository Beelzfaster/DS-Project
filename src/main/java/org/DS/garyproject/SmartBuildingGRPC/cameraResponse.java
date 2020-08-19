// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Securitycamera.proto

package org.DS.garyproject.SmartBuildingGRPC;

/**
 * Protobuf type {@code SmartBuildingGRPC.cameraResponse}
 */
public  final class cameraResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartBuildingGRPC.cameraResponse)
    cameraResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use cameraResponse.newBuilder() to construct.
  private cameraResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private cameraResponse() {
    aname_ = "";
    status_ = "";
    cam_ = "";
    volume_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private cameraResponse(
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
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            aname_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            cam_ = s;
            break;
          }
          case 56: {

            volume_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.DS.garyproject.SmartBuildingGRPC.SecuritycameraServiceImpl.internal_static_SmartBuildingGRPC_cameraResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.DS.garyproject.SmartBuildingGRPC.SecuritycameraServiceImpl.internal_static_SmartBuildingGRPC_cameraResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.DS.garyproject.SmartBuildingGRPC.cameraResponse.class, org.DS.garyproject.SmartBuildingGRPC.cameraResponse.Builder.class);
  }

  public static final int ANAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object aname_;
  /**
   * <code>string aname = 4;</code>
   */
  public java.lang.String getAname() {
    java.lang.Object ref = aname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aname_ = s;
      return s;
    }
  }
  /**
   * <code>string aname = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAnameBytes() {
    java.lang.Object ref = aname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 5;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAM_FIELD_NUMBER = 6;
  private volatile java.lang.Object cam_;
  /**
   * <code>string cam = 6;</code>
   */
  public java.lang.String getCam() {
    java.lang.Object ref = cam_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cam_ = s;
      return s;
    }
  }
  /**
   * <code>string cam = 6;</code>
   */
  public com.google.protobuf.ByteString
      getCamBytes() {
    java.lang.Object ref = cam_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cam_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME_FIELD_NUMBER = 7;
  private int volume_;
  /**
   * <code>int32 volume = 7;</code>
   */
  public int getVolume() {
    return volume_;
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
    if (!getAnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, aname_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, status_);
    }
    if (!getCamBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, cam_);
    }
    if (volume_ != 0) {
      output.writeInt32(7, volume_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, aname_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, status_);
    }
    if (!getCamBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, cam_);
    }
    if (volume_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, volume_);
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
    if (!(obj instanceof org.DS.garyproject.SmartBuildingGRPC.cameraResponse)) {
      return super.equals(obj);
    }
    org.DS.garyproject.SmartBuildingGRPC.cameraResponse other = (org.DS.garyproject.SmartBuildingGRPC.cameraResponse) obj;

    boolean result = true;
    result = result && getAname()
        .equals(other.getAname());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && getCam()
        .equals(other.getCam());
    result = result && (getVolume()
        == other.getVolume());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ANAME_FIELD_NUMBER;
    hash = (53 * hash) + getAname().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + CAM_FIELD_NUMBER;
    hash = (53 * hash) + getCam().hashCode();
    hash = (37 * hash) + VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getVolume();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse parseFrom(
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
  public static Builder newBuilder(org.DS.garyproject.SmartBuildingGRPC.cameraResponse prototype) {
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
   * Protobuf type {@code SmartBuildingGRPC.cameraResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartBuildingGRPC.cameraResponse)
      org.DS.garyproject.SmartBuildingGRPC.cameraResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.DS.garyproject.SmartBuildingGRPC.SecuritycameraServiceImpl.internal_static_SmartBuildingGRPC_cameraResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.DS.garyproject.SmartBuildingGRPC.SecuritycameraServiceImpl.internal_static_SmartBuildingGRPC_cameraResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.DS.garyproject.SmartBuildingGRPC.cameraResponse.class, org.DS.garyproject.SmartBuildingGRPC.cameraResponse.Builder.class);
    }

    // Construct using org.DS.garyproject.SmartBuildingGRPC.cameraResponse.newBuilder()
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
      aname_ = "";

      status_ = "";

      cam_ = "";

      volume_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.DS.garyproject.SmartBuildingGRPC.SecuritycameraServiceImpl.internal_static_SmartBuildingGRPC_cameraResponse_descriptor;
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.cameraResponse getDefaultInstanceForType() {
      return org.DS.garyproject.SmartBuildingGRPC.cameraResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.cameraResponse build() {
      org.DS.garyproject.SmartBuildingGRPC.cameraResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.cameraResponse buildPartial() {
      org.DS.garyproject.SmartBuildingGRPC.cameraResponse result = new org.DS.garyproject.SmartBuildingGRPC.cameraResponse(this);
      result.aname_ = aname_;
      result.status_ = status_;
      result.cam_ = cam_;
      result.volume_ = volume_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.DS.garyproject.SmartBuildingGRPC.cameraResponse) {
        return mergeFrom((org.DS.garyproject.SmartBuildingGRPC.cameraResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.DS.garyproject.SmartBuildingGRPC.cameraResponse other) {
      if (other == org.DS.garyproject.SmartBuildingGRPC.cameraResponse.getDefaultInstance()) return this;
      if (!other.getAname().isEmpty()) {
        aname_ = other.aname_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getCam().isEmpty()) {
        cam_ = other.cam_;
        onChanged();
      }
      if (other.getVolume() != 0) {
        setVolume(other.getVolume());
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
      org.DS.garyproject.SmartBuildingGRPC.cameraResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.DS.garyproject.SmartBuildingGRPC.cameraResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object aname_ = "";
    /**
     * <code>string aname = 4;</code>
     */
    public java.lang.String getAname() {
      java.lang.Object ref = aname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aname = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAnameBytes() {
      java.lang.Object ref = aname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder setAname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder clearAname() {
      
      aname_ = getDefaultInstance().getAname();
      onChanged();
      return this;
    }
    /**
     * <code>string aname = 4;</code>
     */
    public Builder setAnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 5;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 5;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cam_ = "";
    /**
     * <code>string cam = 6;</code>
     */
    public java.lang.String getCam() {
      java.lang.Object ref = cam_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cam_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cam = 6;</code>
     */
    public com.google.protobuf.ByteString
        getCamBytes() {
      java.lang.Object ref = cam_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cam_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cam = 6;</code>
     */
    public Builder setCam(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cam_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cam = 6;</code>
     */
    public Builder clearCam() {
      
      cam_ = getDefaultInstance().getCam();
      onChanged();
      return this;
    }
    /**
     * <code>string cam = 6;</code>
     */
    public Builder setCamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cam_ = value;
      onChanged();
      return this;
    }

    private int volume_ ;
    /**
     * <code>int32 volume = 7;</code>
     */
    public int getVolume() {
      return volume_;
    }
    /**
     * <code>int32 volume = 7;</code>
     */
    public Builder setVolume(int value) {
      
      volume_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 volume = 7;</code>
     */
    public Builder clearVolume() {
      
      volume_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SmartBuildingGRPC.cameraResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartBuildingGRPC.cameraResponse)
  private static final org.DS.garyproject.SmartBuildingGRPC.cameraResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.DS.garyproject.SmartBuildingGRPC.cameraResponse();
  }

  public static org.DS.garyproject.SmartBuildingGRPC.cameraResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<cameraResponse>
      PARSER = new com.google.protobuf.AbstractParser<cameraResponse>() {
    @java.lang.Override
    public cameraResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new cameraResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<cameraResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<cameraResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.DS.garyproject.SmartBuildingGRPC.cameraResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

