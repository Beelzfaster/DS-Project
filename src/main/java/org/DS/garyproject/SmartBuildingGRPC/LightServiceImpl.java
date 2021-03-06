// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Light.proto

package org.DS.garyproject.SmartBuildingGRPC;

public final class LightServiceImpl {
  private LightServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_stringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_stringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_stringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_stringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_booleanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_booleanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_booleanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_booleanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_valueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_valueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_valueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_valueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_lightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_lightResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Light.proto\022\021SmartBuildingGRPC\"\007\n\005Empt" +
      "y\"\035\n\rstringRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016stri" +
      "ngResponse\022\014\n\004text\030\001 \001(\t\"\035\n\016booleanReque" +
      "st\022\013\n\003msg\030\002 \001(\010\"\036\n\017booleanResponse\022\013\n\003ms" +
      "g\030\002 \001(\010\"\036\n\014valueRequest\022\016\n\006length\030\003 \001(\005\"" +
      "\037\n\rvalueResponse\022\016\n\006length\030\003 \001(\005\"B\n\rligh" +
      "tResponse\022\r\n\005aname\030\004 \001(\t\022\016\n\006status\030\005 \001(\t" +
      "\022\022\n\nbrightness\030\006 \001(\0052\353\002\n\014LightService\022P\n" +
      "\020initialAppliance\022\030.SmartBuildingGRPC.Em" +
      "pty\032 .SmartBuildingGRPC.lightResponse\"\000\022" +
      "Y\n\020changeBrightness\022\037.SmartBuildingGRPC." +
      "valueRequest\032 .SmartBuildingGRPC.valueRe" +
      "sponse\"\0000\001\022P\n\005onOff\022!.SmartBuildingGRPC." +
      "booleanRequest\032\".SmartBuildingGRPC.boole" +
      "anResponse\"\000\022\\\n\023changeApplianceName\022 .Sm" +
      "artBuildingGRPC.stringRequest\032!.SmartBui" +
      "ldingGRPC.stringResponse\"\000B:\n$org.DS.gar" +
      "yproject.SmartBuildingGRPCB\020LightService" +
      "ImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SmartBuildingGRPC_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartBuildingGRPC_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_SmartBuildingGRPC_stringRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartBuildingGRPC_stringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_stringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartBuildingGRPC_stringResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartBuildingGRPC_stringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_stringResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartBuildingGRPC_booleanRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SmartBuildingGRPC_booleanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_booleanRequest_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartBuildingGRPC_booleanResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SmartBuildingGRPC_booleanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_booleanResponse_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartBuildingGRPC_valueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SmartBuildingGRPC_valueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_valueRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartBuildingGRPC_valueResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SmartBuildingGRPC_valueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_valueResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartBuildingGRPC_lightResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SmartBuildingGRPC_lightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_lightResponse_descriptor,
        new java.lang.String[] { "Aname", "Status", "Brightness", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
