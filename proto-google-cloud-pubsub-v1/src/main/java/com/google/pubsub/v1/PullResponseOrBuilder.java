/*
 * Copyright 2023 Google LLC
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
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface PullResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PullResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  java.util.List<com.google.pubsub.v1.ReceivedMessage> getReceivedMessagesList();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  com.google.pubsub.v1.ReceivedMessage getReceivedMessages(int index);
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  int getReceivedMessagesCount();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  java.util.List<? extends com.google.pubsub.v1.ReceivedMessageOrBuilder>
      getReceivedMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  com.google.pubsub.v1.ReceivedMessageOrBuilder getReceivedMessagesOrBuilder(int index);
}
