/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Configuration for a cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Autoscaling configuration for this cluster. Note that when creating or updating a cluster,
   * exactly one of serve_nodes or cluster_autoscaling_config must be set. If serve_nodes is set,
   * then serve_nodes is fixed and autoscaling is turned off. If cluster_autoscaling_config is set,
   * then serve_nodes will be autoscaled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterAutoscalingConfig clusterAutoscalingConfig;

  /**
   * Autoscaling configuration for this cluster. Note that when creating or updating a cluster,
   * exactly one of serve_nodes or cluster_autoscaling_config must be set. If serve_nodes is set,
   * then serve_nodes is fixed and autoscaling is turned off. If cluster_autoscaling_config is set,
   * then serve_nodes will be autoscaled.
   * @return value or {@code null} for none
   */
  public ClusterAutoscalingConfig getClusterAutoscalingConfig() {
    return clusterAutoscalingConfig;
  }

  /**
   * Autoscaling configuration for this cluster. Note that when creating or updating a cluster,
   * exactly one of serve_nodes or cluster_autoscaling_config must be set. If serve_nodes is set,
   * then serve_nodes is fixed and autoscaling is turned off. If cluster_autoscaling_config is set,
   * then serve_nodes will be autoscaled.
   * @param clusterAutoscalingConfig clusterAutoscalingConfig or {@code null} for none
   */
  public ClusterConfig setClusterAutoscalingConfig(ClusterAutoscalingConfig clusterAutoscalingConfig) {
    this.clusterAutoscalingConfig = clusterAutoscalingConfig;
    return this;
  }

  @Override
  public ClusterConfig set(String fieldName, Object value) {
    return (ClusterConfig) super.set(fieldName, value);
  }

  @Override
  public ClusterConfig clone() {
    return (ClusterConfig) super.clone();
  }

}
