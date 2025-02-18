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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of a Site.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Site extends com.google.api.client.json.GenericJson {

  /**
   * Whether auto ads is turned on for the site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoAdsEnabled;

  /**
   * Domain (or subdomain) of the site, e.g. "example.com" or "www.example.com". This is used in the
   * `OWNED_SITE_DOMAIN_NAME` reporting dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Resource name of a site. Format: accounts/{account}/sites/{site}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Unique ID of the site as used in the `OWNED_SITE_ID` reporting dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportingDimensionId;

  /**
   * Output only. State of a site.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Whether auto ads is turned on for the site.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoAdsEnabled() {
    return autoAdsEnabled;
  }

  /**
   * Whether auto ads is turned on for the site.
   * @param autoAdsEnabled autoAdsEnabled or {@code null} for none
   */
  public Site setAutoAdsEnabled(java.lang.Boolean autoAdsEnabled) {
    this.autoAdsEnabled = autoAdsEnabled;
    return this;
  }

  /**
   * Domain (or subdomain) of the site, e.g. "example.com" or "www.example.com". This is used in the
   * `OWNED_SITE_DOMAIN_NAME` reporting dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Domain (or subdomain) of the site, e.g. "example.com" or "www.example.com". This is used in the
   * `OWNED_SITE_DOMAIN_NAME` reporting dimension.
   * @param domain domain or {@code null} for none
   */
  public Site setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Resource name of a site. Format: accounts/{account}/sites/{site}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of a site. Format: accounts/{account}/sites/{site}
   * @param name name or {@code null} for none
   */
  public Site setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Unique ID of the site as used in the `OWNED_SITE_ID` reporting dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getReportingDimensionId() {
    return reportingDimensionId;
  }

  /**
   * Output only. Unique ID of the site as used in the `OWNED_SITE_ID` reporting dimension.
   * @param reportingDimensionId reportingDimensionId or {@code null} for none
   */
  public Site setReportingDimensionId(java.lang.String reportingDimensionId) {
    this.reportingDimensionId = reportingDimensionId;
    return this;
  }

  /**
   * Output only. State of a site.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of a site.
   * @param state state or {@code null} for none
   */
  public Site setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Site set(String fieldName, Object value) {
    return (Site) super.set(fieldName, value);
  }

  @Override
  public Site clone() {
    return (Site) super.clone();
  }

}
