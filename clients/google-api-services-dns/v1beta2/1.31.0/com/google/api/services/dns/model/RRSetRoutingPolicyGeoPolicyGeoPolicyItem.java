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

package com.google.api.services.dns.model;

/**
 * Model definition for RRSetRoutingPolicyGeoPolicyGeoPolicyItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RRSetRoutingPolicyGeoPolicyGeoPolicyItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The geo-location granularity is a GCP region. This location string should correspond to a GCP
   * region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> rrdatas;

  /**
   * DNSSEC generated signatures for the above geo_rrdata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> signatureRrdatas;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The geo-location granularity is a GCP region. This location string should correspond to a GCP
   * region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The geo-location granularity is a GCP region. This location string should correspond to a GCP
   * region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
   * @param location location or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRrdatas() {
    return rrdatas;
  }

  /**
   * @param rrdatas rrdatas or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem setRrdatas(java.util.List<java.lang.String> rrdatas) {
    this.rrdatas = rrdatas;
    return this;
  }

  /**
   * DNSSEC generated signatures for the above geo_rrdata.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSignatureRrdatas() {
    return signatureRrdatas;
  }

  /**
   * DNSSEC generated signatures for the above geo_rrdata.
   * @param signatureRrdatas signatureRrdatas or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem setSignatureRrdatas(java.util.List<java.lang.String> signatureRrdatas) {
    this.signatureRrdatas = signatureRrdatas;
    return this;
  }

  @Override
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem set(String fieldName, Object value) {
    return (RRSetRoutingPolicyGeoPolicyGeoPolicyItem) super.set(fieldName, value);
  }

  @Override
  public RRSetRoutingPolicyGeoPolicyGeoPolicyItem clone() {
    return (RRSetRoutingPolicyGeoPolicyGeoPolicyItem) super.clone();
  }

}
