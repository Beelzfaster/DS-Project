// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heating.proto

package org.DS.garyproject.SmartBuildingGRPC;

/**
 * Protobuf type {@code SmartBuildingGRPC.heatingResponse}
 */
public  final class heatingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartBuildingGRPC.heatingResponse)
    heatingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use heatingResponse.newBuilder() to construct.
  private heatingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private heatingResponse() {
    aname_ = "";
    status_ = "";
    temperature_ = 0;
    speed_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private heatingResponse(
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
          case 48: {

            temperature_ = input.readInt32();
            break;
          }
          case 56: {

            speed_ = input.readInt32();
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
    return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.internal_static_SmartBuildingGRPC_heatingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.internal_static_SmartBuildingGRPC_heatingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.DS.garyproject.SmartBuildingGRPC.heatingResponse.class, org.DS.garyproject.SmartBuildingGRPC.heatingResponse.Builder.class);
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

  public static final int TEMPERATURE_FIELD_NUMBER = 6;
  private int temperature_;
  /**
   * <code>int32 temperature = 6;</code>
   */
  public int getTemperature() {
    return temperature_;
  }

  public static final int SPEED_FIELD_NUMBER = 7;
  private int speed_;
  /**
   * <code>int32 speed = 7;</code>
   */
  public int getSpeed() {
    return speed_;
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
    if (temperature_ != 0) {
      output.writeInt32(6, temperature_);
    }
    if (speed_ != 0) {
      output.writeInt32(7, speed_);
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
    if (temperature_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, temperature_);
    }
    if (speed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, speed_);
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
    if (!(obj instanceof org.DS.garyproject.SmartBuildingGRPC.heatingResponse)) {
      return super.equals(obj);
    }
    org.DS.garyproject.SmartBuildingGRPC.heatingResponse other = (org.DS.garyproject.SmartBuildingGRPC.heatingResponse) obj;

    boolean result = true;
    result = result && getAname()
        .equals(other.getAname());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getTemperature()
        == other.getTemperature());
    result = result && (getSpeed()
        == other.getSpeed());
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
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getTemperature();
    hash = (37 * hash) + SPEED_FIELD_NUMBER;
    hash = (53 * hash) + getSpeed();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse parseFrom(
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
  public static Builder newBuilder(org.DS.garyproject.SmartBuildingGRPC.heatingResponse prototype) {
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
   * Protobuf type {@code SmartBuildingGRPC.heatingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartBuildingGRPC.heatingResponse)
      org.DS.garyproject.SmartBuildingGRPC.heatingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.internal_static_SmartBuildingGRPC_heatingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.internal_static_SmartBuildingGRPC_heatingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.DS.garyproject.SmartBuildingGRPC.heatingResponse.class, org.DS.garyproject.SmartBuildingGRPC.heatingResponse.Builder.class);
    }

    // Construct using org.DS.garyproject.SmartBuildingGRPC.heatingResponse.newBuilder()
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

      temperature_ = 0;

      speed_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.DS.garyproject.SmartBuildingGRPC.HeatingServiceImpl.internal_static_SmartBuildingGRPC_heatingResponse_descriptor;
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.heatingResponse getDefaultInstanceForType() {
      return org.DS.garyproject.SmartBuildingGRPC.heatingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.heatingResponse build() {
      org.DS.garyproject.SmartBuildingGRPC.heatingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.DS.garyproject.SmartBuildingGRPC.heatingResponse buildPartial() {
      org.DS.garyproject.SmartBuildingGRPC.heatingResponse result = new org.DS.garyproject.SmartBuildingGRPC.heatingResponse(this);
      result.aname_ = aname_;
      result.status_ = status_;
      result.temperature_ = temperature_;
      result.speed_ = speed_;
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
      if (other instanceof org.DS.garyproject.SmartBuildingGRPC.heatingResponse) {
        return mergeFrom((org.DS.garyproject.SmartBuildingGRPC.heatingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.DS.garyproject.SmartBuildingGRPC.heatingResponse other) {
      if (other == org.DS.garyproject.SmartBuildingGRPC.heatingResponse.getDefaultInstance()) return this;
      if (!other.getAname().isEmpty()) {
        aname_ = other.aname_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getTemperature() != 0) {
        setTemperature(other.getTemperature());
      }
      if (other.getSpeed() != 0) {
        setSpeed(other.getSpeed());
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
      org.DS.garyproject.SmartBuildingGRPC.heatingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.DS.garyproject.SmartBuildingGRPC.heatingResponse) e.getUnfinishedMessage();
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

    private int temperature_ ;
    /**
     * <code>int32 temperature = 6;</code>
     */
    public int getTemperature() {
      return temperature_;
    }
    /**
     * <code>int32 temperature = 6;</code>
     */
    public Builder setTemperature(int value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 temperature = 6;</code>
     */
    public Builder clearTemperature() {
      
      temperature_ = 0;
      onChanged();
      return this;
    }

    private int speed_ ;
    /**
     * <code>int32 speed = 7;</code>
     */
    public int getSpeed() {
      return speed_;
    }
    /**
     * <code>int32 speed = 7;</code>
     */
    public Builder setSpeed(int value) {
      
      speed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 speed = 7;</code>
     */
    public Builder clearSpeed() {
      
      speed_ = 0;
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


    // @@protoc_insertion_point(builder_scope:SmartBuildingGRPC.heatingResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartBuildingGRPC.heatingResponse)
  private static final org.DS.garyproject.SmartBuildingGRPC.heatingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.DS.garyproject.SmartBuildingGRPC.heatingResponse();
  }

  public static org.DS.garyproject.SmartBuildingGRPC.heatingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<heatingResponse>
      PARSER = new com.google.protobuf.AbstractParser<heatingResponse>() {
    @java.lang.Override
    public heatingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new heatingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<heatingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<heatingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.DS.garyproject.SmartBuildingGRPC.heatingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

