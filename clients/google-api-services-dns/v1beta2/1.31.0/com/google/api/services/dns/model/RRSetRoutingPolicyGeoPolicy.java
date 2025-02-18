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
 * Model definition for RRSetRoutingPolicyGeoPolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RRSetRoutingPolicyGeoPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The primary geo routing configuration. If there are multiple items with the same location, an
   * error is returned instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RRSetRoutingPolicyGeoPolicyGeoPolicyItem> items;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The primary geo routing configuration. If there are multiple items with the same location, an
   * error is returned instead.
   * @return value or {@code null} for none
   */
  public java.util.List<RRSetRoutingPolicyGeoPolicyGeoPolicyItem> getItems() {
    return items;
  }

  /**
   * The primary geo routing configuration. If there are multiple items with the same location, an
   * error is returned instead.
   * @param items items or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicy setItems(java.util.List<RRSetRoutingPolicyGeoPolicyGeoPolicyItem> items) {
    this.items = items;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public RRSetRoutingPolicyGeoPolicy set(String fieldName, Object value) {
    return (RRSetRoutingPolicyGeoPolicy) super.set(fieldName, value);
  }

  @Override
  public RRSetRoutingPolicyGeoPolicy clone() {
    return (RRSetRoutingPolicyGeoPolicy) super.clone();
  }

}
