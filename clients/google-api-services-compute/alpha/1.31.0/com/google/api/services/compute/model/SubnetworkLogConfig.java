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

package com.google.api.services.compute.model;

/**
 * The available logging options for this subnetwork.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SubnetworkLogConfig extends com.google.api.client.json.GenericJson {

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the
   * aggregation interval for collecting flow logs. Increasing the interval time will reduce the
   * amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds
   * per connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregationInterval;

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is determined by the org
   * policy, if there is no org policy specified, then it will default to disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enable;

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to
   * define which VPC flow logs should be logged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filterExpr;

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the
   * field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0
   * means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless
   * otherwise specified by the org policy, which means half of all collected logs are reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float flowSampling;

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all,
   * none or a subset of metadata fields should be added to the reported VPC flow logs. Default is
   * EXCLUDE_ALL_METADATA.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadata;

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to
   * CUSTOM_METADATA.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metadataFields;

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the
   * aggregation interval for collecting flow logs. Increasing the interval time will reduce the
   * amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds
   * per connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregationInterval() {
    return aggregationInterval;
  }

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the
   * aggregation interval for collecting flow logs. Increasing the interval time will reduce the
   * amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds
   * per connection.
   * @param aggregationInterval aggregationInterval or {@code null} for none
   */
  public SubnetworkLogConfig setAggregationInterval(java.lang.String aggregationInterval) {
    this.aggregationInterval = aggregationInterval;
    return this;
  }

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is determined by the org
   * policy, if there is no org policy specified, then it will default to disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnable() {
    return enable;
  }

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is determined by the org
   * policy, if there is no org policy specified, then it will default to disabled.
   * @param enable enable or {@code null} for none
   */
  public SubnetworkLogConfig setEnable(java.lang.Boolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to
   * define which VPC flow logs should be logged.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilterExpr() {
    return filterExpr;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to
   * define which VPC flow logs should be logged.
   * @param filterExpr filterExpr or {@code null} for none
   */
  public SubnetworkLogConfig setFilterExpr(java.lang.String filterExpr) {
    this.filterExpr = filterExpr;
    return this;
  }

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the
   * field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0
   * means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless
   * otherwise specified by the org policy, which means half of all collected logs are reported.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFlowSampling() {
    return flowSampling;
  }

  /**
   * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the
   * field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0
   * means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless
   * otherwise specified by the org policy, which means half of all collected logs are reported.
   * @param flowSampling flowSampling or {@code null} for none
   */
  public SubnetworkLogConfig setFlowSampling(java.lang.Float flowSampling) {
    this.flowSampling = flowSampling;
    return this;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all,
   * none or a subset of metadata fields should be added to the reported VPC flow logs. Default is
   * EXCLUDE_ALL_METADATA.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadata() {
    return metadata;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all,
   * none or a subset of metadata fields should be added to the reported VPC flow logs. Default is
   * EXCLUDE_ALL_METADATA.
   * @param metadata metadata or {@code null} for none
   */
  public SubnetworkLogConfig setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to
   * CUSTOM_METADATA.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetadataFields() {
    return metadataFields;
  }

  /**
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to
   * CUSTOM_METADATA.
   * @param metadataFields metadataFields or {@code null} for none
   */
  public SubnetworkLogConfig setMetadataFields(java.util.List<java.lang.String> metadataFields) {
    this.metadataFields = metadataFields;
    return this;
  }

  @Override
  public SubnetworkLogConfig set(String fieldName, Object value) {
    return (SubnetworkLogConfig) super.set(fieldName, value);
  }

  @Override
  public SubnetworkLogConfig clone() {
    return (SubnetworkLogConfig) super.clone();
  }

}
