// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatDeleteMessage.proto

package net.iGap.proto;

public final class ProtoChatDeleteMessage {
  private ProtoChatDeleteMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ChatDeleteMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChatDeleteMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    net.iGap.proto.ProtoRequest.Request getRequest();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    long getMessageId();

    /**
     * <code>optional bool both = 4;</code>
     */
    boolean getBoth();
  }
  /**
   * Protobuf type {@code proto.ChatDeleteMessage}
   */
  public  static final class ChatDeleteMessage extends
      com.google.protobuf.GeneratedMessageLite<
          ChatDeleteMessage, ChatDeleteMessage.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChatDeleteMessage)
      ChatDeleteMessageOrBuilder {
    private ChatDeleteMessage() {
    }
    public static final int REQUEST_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoRequest.Request request_;
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public boolean hasRequest() {
      return request_ != null;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public net.iGap.proto.ProtoRequest.Request getRequest() {
      return request_ == null ? net.iGap.proto.ProtoRequest.Request.getDefaultInstance() : request_;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (value == null) {
        throw new NullPointerException();
      }
      request_ = value;
      
      }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(
        net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
      request_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (request_ != null &&
          request_ != net.iGap.proto.ProtoRequest.Request.getDefaultInstance()) {
        request_ =
          net.iGap.proto.ProtoRequest.Request.newBuilder(request_).mergeFrom(value).buildPartial();
      } else {
        request_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void clearRequest() {  request_ = null;
      
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private long messageId_;
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    public long getMessageId() {
      return messageId_;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void setMessageId(long value) {
      
      messageId_ = value;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void clearMessageId() {
      
      messageId_ = 0L;
    }

    public static final int BOTH_FIELD_NUMBER = 4;
    private boolean both_;
    /**
     * <code>optional bool both = 4;</code>
     */
    public boolean getBoth() {
      return both_;
    }
    /**
     * <code>optional bool both = 4;</code>
     */
    private void setBoth(boolean value) {
      
      both_ = value;
    }
    /**
     * <code>optional bool both = 4;</code>
     */
    private void clearBoth() {
      
      both_ = false;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (messageId_ != 0L) {
        output.writeUInt64(3, messageId_);
      }
      if (both_ != false) {
        output.writeBool(4, both_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (request_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRequest());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, messageId_);
      }
      if (both_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, both_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChatDeleteMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChatDeleteMessage)
        net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageOrBuilder {
      // Construct using net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public boolean hasRequest() {
        return instance.hasRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public net.iGap.proto.ProtoRequest.Request getRequest() {
        return instance.getRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.setRequest(value);
        return this;
        }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(
          net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
        copyOnWrite();
        instance.setRequest(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.mergeRequest(value);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder clearRequest() {  copyOnWrite();
        instance.clearRequest();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public long getMessageId() {
        return instance.getMessageId();
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder setMessageId(long value) {
        copyOnWrite();
        instance.setMessageId(value);
        return this;
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder clearMessageId() {
        copyOnWrite();
        instance.clearMessageId();
        return this;
      }

      /**
       * <code>optional bool both = 4;</code>
       */
      public boolean getBoth() {
        return instance.getBoth();
      }
      /**
       * <code>optional bool both = 4;</code>
       */
      public Builder setBoth(boolean value) {
        copyOnWrite();
        instance.setBoth(value);
        return this;
      }
      /**
       * <code>optional bool both = 4;</code>
       */
      public Builder clearBoth() {
        copyOnWrite();
        instance.clearBoth();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ChatDeleteMessage)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage other = (net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
          messageId_ = visitor.visitLong(messageId_ != 0L, messageId_,
              other.messageId_ != 0L, other.messageId_);
          both_ = visitor.visitBoolean(both_ != false, both_,
              other.both_ != false, other.both_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  net.iGap.proto.ProtoRequest.Request.Builder subBuilder = null;
                  if (request_ != null) {
                    subBuilder = request_.toBuilder();
                  }
                  request_ = input.readMessage(net.iGap.proto.ProtoRequest.Request.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(request_);
                    request_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  roomId_ = input.readUInt64();
                  break;
                }
                case 24: {

                  messageId_ = input.readUInt64();
                  break;
                }
                case 32: {

                  both_ = input.readBool();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ChatDeleteMessage)
    private static final net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChatDeleteMessage();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChatDeleteMessage> PARSER;

    public static com.google.protobuf.Parser<ChatDeleteMessage> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ChatDeleteMessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChatDeleteMessageResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.Response getResponse();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    long getMessageId();

    /**
     * <code>optional uint64 delete_version = 4;</code>
     */
    long getDeleteVersion();
  }
  /**
   * Protobuf type {@code proto.ChatDeleteMessageResponse}
   */
  public  static final class ChatDeleteMessageResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ChatDeleteMessageResponse, ChatDeleteMessageResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChatDeleteMessageResponse)
      ChatDeleteMessageResponseOrBuilder {
    private ChatDeleteMessageResponse() {
    }
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoResponse.Response response_;
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public boolean hasResponse() {
      return response_ != null;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public net.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (value == null) {
        throw new NullPointerException();
      }
      response_ = value;
      
      }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(
        net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
      response_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (response_ != null &&
          response_ != net.iGap.proto.ProtoResponse.Response.getDefaultInstance()) {
        response_ =
          net.iGap.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
      } else {
        response_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void clearResponse() {  response_ = null;
      
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private long messageId_;
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    public long getMessageId() {
      return messageId_;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void setMessageId(long value) {
      
      messageId_ = value;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void clearMessageId() {
      
      messageId_ = 0L;
    }

    public static final int DELETE_VERSION_FIELD_NUMBER = 4;
    private long deleteVersion_;
    /**
     * <code>optional uint64 delete_version = 4;</code>
     */
    public long getDeleteVersion() {
      return deleteVersion_;
    }
    /**
     * <code>optional uint64 delete_version = 4;</code>
     */
    private void setDeleteVersion(long value) {
      
      deleteVersion_ = value;
    }
    /**
     * <code>optional uint64 delete_version = 4;</code>
     */
    private void clearDeleteVersion() {
      
      deleteVersion_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (messageId_ != 0L) {
        output.writeUInt64(3, messageId_);
      }
      if (deleteVersion_ != 0L) {
        output.writeUInt64(4, deleteVersion_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, messageId_);
      }
      if (deleteVersion_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, deleteVersion_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChatDeleteMessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChatDeleteMessageResponse)
        net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public boolean hasResponse() {
        return instance.hasResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.Response getResponse() {
        return instance.getResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.setResponse(value);
        return this;
        }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(
          net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        copyOnWrite();
        instance.setResponse(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.mergeResponse(value);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder clearResponse() {  copyOnWrite();
        instance.clearResponse();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public long getMessageId() {
        return instance.getMessageId();
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder setMessageId(long value) {
        copyOnWrite();
        instance.setMessageId(value);
        return this;
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder clearMessageId() {
        copyOnWrite();
        instance.clearMessageId();
        return this;
      }

      /**
       * <code>optional uint64 delete_version = 4;</code>
       */
      public long getDeleteVersion() {
        return instance.getDeleteVersion();
      }
      /**
       * <code>optional uint64 delete_version = 4;</code>
       */
      public Builder setDeleteVersion(long value) {
        copyOnWrite();
        instance.setDeleteVersion(value);
        return this;
      }
      /**
       * <code>optional uint64 delete_version = 4;</code>
       */
      public Builder clearDeleteVersion() {
        copyOnWrite();
        instance.clearDeleteVersion();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ChatDeleteMessageResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse other = (net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
          messageId_ = visitor.visitLong(messageId_ != 0L, messageId_,
              other.messageId_ != 0L, other.messageId_);
          deleteVersion_ = visitor.visitLong(deleteVersion_ != 0L, deleteVersion_,
              other.deleteVersion_ != 0L, other.deleteVersion_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 10: {
                  net.iGap.proto.ProtoResponse.Response.Builder subBuilder = null;
                  if (response_ != null) {
                    subBuilder = response_.toBuilder();
                  }
                  response_ = input.readMessage(net.iGap.proto.ProtoResponse.Response.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(response_);
                    response_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  roomId_ = input.readUInt64();
                  break;
                }
                case 24: {

                  messageId_ = input.readUInt64();
                  break;
                }
                case 32: {

                  deleteVersion_ = input.readUInt64();
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.ChatDeleteMessageResponse)
    private static final net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChatDeleteMessageResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChatDeleteMessage.ChatDeleteMessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChatDeleteMessageResponse> PARSER;

    public static com.google.protobuf.Parser<ChatDeleteMessageResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
