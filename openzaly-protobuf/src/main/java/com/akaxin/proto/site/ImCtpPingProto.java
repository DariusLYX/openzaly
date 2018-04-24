// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: platform/im_ctp_ping.proto

package com.akaxin.proto.site;

public final class ImCtpPingProto {
  private ImCtpPingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImCtpPingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:client.ImCtpPingRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   *ping操作不需要request实体
   * </pre>
   *
   * Protobuf type {@code client.ImCtpPingRequest}
   */
  public  static final class ImCtpPingRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:client.ImCtpPingRequest)
      ImCtpPingRequestOrBuilder {
    // Use ImCtpPingRequest.newBuilder() to construct.
    private ImCtpPingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImCtpPingRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ImCtpPingRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ImCtpPingProto.internal_static_client_ImCtpPingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ImCtpPingProto.internal_static_client_ImCtpPingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.class, com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest other = (com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     *ping操作不需要request实体
     * </pre>
     *
     * Protobuf type {@code client.ImCtpPingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:client.ImCtpPingRequest)
        com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ImCtpPingProto.internal_static_client_ImCtpPingRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ImCtpPingProto.internal_static_client_ImCtpPingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.class, com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ImCtpPingProto.internal_static_client_ImCtpPingRequest_descriptor;
      }

      public com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest build() {
        com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest buildPartial() {
        com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest result = new com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest) {
          return mergeFrom((com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest other) {
        if (other == com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:client.ImCtpPingRequest)
    }

    // @@protoc_insertion_point(class_scope:client.ImCtpPingRequest)
    private static final com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest();
    }

    public static com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImCtpPingRequest>
        PARSER = new com.google.protobuf.AbstractParser<ImCtpPingRequest>() {
      public ImCtpPingRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImCtpPingRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImCtpPingRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImCtpPingRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ImCtpPingProto.ImCtpPingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_client_ImCtpPingRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_client_ImCtpPingRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032platform/im_ctp_ping.proto\022\006client\032\017co" +
      "re/core.proto\"\022\n\020ImCtpPingRequest2H\n\020ImC" +
      "tpPingService\0224\n\004ping\022\030.client.ImCtpPing" +
      "Request\032\022.core.NoneResponseB\'\n\025com.akaxi" +
      "n.proto.siteB\016ImCtpPingProtob\006proto3"
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
          com.akaxin.proto.core.CoreProto.getDescriptor(),
        }, assigner);
    internal_static_client_ImCtpPingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_client_ImCtpPingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_client_ImCtpPingRequest_descriptor,
        new java.lang.String[] { });
    com.akaxin.proto.core.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}