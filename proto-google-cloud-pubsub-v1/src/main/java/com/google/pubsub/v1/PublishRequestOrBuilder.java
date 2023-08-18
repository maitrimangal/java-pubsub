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

public interface PublishRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PublishRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>
   * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * Required. The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>
   * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.pubsub.v1.PubsubMessage> getMessagesList();
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.pubsub.v1.PubsubMessage getMessages(int index);
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder> getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(int index);
}
