// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Projector.proto

package org.DS.garyproject.SmartBuildingGRPC;

public final class ProjectorServiceImpl {
  private ProjectorServiceImpl() {}
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
    internal_static_SmartBuildingGRPC_projectorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_projectorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Projector.proto\022\021SmartBuildingGRPC\"\007\n\005" +
      "Empty\"\035\n\rstringRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016" +
      "stringResponse\022\014\n\004text\030\001 \001(\t\"\035\n\016booleanR" +
      "equest\022\013\n\003msg\030\002 \001(\010\"\036\n\017booleanResponse\022\013" +
      "\n\003msg\030\002 \001(\010\"\036\n\014valueRequest\022\016\n\006length\030\003 " +
      "\001(\005\"\037\n\rvalueResponse\022\016\n\006length\030\003 \001(\005\"S\n\021" +
      "projectorResponse\022\r\n\005aname\030\004 \001(\t\022\016\n\006stat" +
      "us\030\005 \001(\t\022\016\n\006volume\030\006 \001(\005\022\017\n\007channel\030\007 \001(" +
      "\0052\257\004\n\020ProjectorService\022T\n\020initialApplian" +
      "ce\022\030.SmartBuildingGRPC.Empty\032$.SmartBuil" +
      "dingGRPC.projectorResponse\"\000\022U\n\014changeVo" +
      "lume\022\037.SmartBuildingGRPC.valueRequest\032 ." +
      "SmartBuildingGRPC.valueResponse\"\0000\001\022V\n\rc" +
      "hangeChannel\022\037.SmartBuildingGRPC.valueRe" +
      "quest\032 .SmartBuildingGRPC.valueResponse\"" +
      "\0000\001\022P\n\005onOff\022!.SmartBuildingGRPC.boolean" +
      "Request\032\".SmartBuildingGRPC.booleanRespo" +
      "nse\"\000\022\\\n\023changeApplianceName\022 .SmartBuil" +
      "dingGRPC.stringRequest\032!.SmartBuildingGR" +
      "PC.stringResponse\"\000\022f\n\031changeApplianceNa" +
      "meStream\022 .SmartBuildingGRPC.stringReque" +
      "st\032!.SmartBuildingGRPC.stringResponse\"\000(" +
      "\0010\001B>\n$org.DS.garyproject.SmartBuildingG" +
      "RPCB\024ProjectorServiceImplP\001b\006proto3"
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
    internal_static_SmartBuildingGRPC_projectorResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SmartBuildingGRPC_projectorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_projectorResponse_descriptor,
        new java.lang.String[] { "Aname", "Status", "Volume", "Channel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
