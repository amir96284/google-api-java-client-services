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

package com.google.api.services.dialogflow.v3.model;

/**
 * Represents configuration for a generic web service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3WebhookGenericWebService extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS
   * verification. This overrides the default SSL trust store. If this is empty or unspecified,
   * Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the
   * HTTPS server certificates are signed with "subject alt name". For instance a certificate can be
   * self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \
   * -signkey example.com.key \ -out example.com.crt \ -extfile <(printf
   * "\nsubjectAltName='DNS:www.example.com'")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedCaCerts;

  /**
   * The password for HTTP Basic authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The HTTP request headers to send together with webhook requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> requestHeaders;

  /**
   * Required. The webhook URI for receiving POST requests. It must use https protocol.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The user name for HTTP Basic authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS
   * verification. This overrides the default SSL trust store. If this is empty or unspecified,
   * Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the
   * HTTPS server certificates are signed with "subject alt name". For instance a certificate can be
   * self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \
   * -signkey example.com.key \ -out example.com.crt \ -extfile <(printf
   * "\nsubjectAltName='DNS:www.example.com'")
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedCaCerts() {
    return allowedCaCerts;
  }

  /**
   * Optional. Specifies a list of allowed custom CA certificates (in DER format) for HTTPS
   * verification. This overrides the default SSL trust store. If this is empty or unspecified,
   * Dialogflow will use Google's default trust store to verify certificates. N.B. Make sure the
   * HTTPS server certificates are signed with "subject alt name". For instance a certificate can be
   * self-signed using the following command, openssl x509 -req -days 200 -in example.com.csr \
   * -signkey example.com.key \ -out example.com.crt \ -extfile <(printf
   * "\nsubjectAltName='DNS:www.example.com'")
   * @param allowedCaCerts allowedCaCerts or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3WebhookGenericWebService setAllowedCaCerts(java.util.List<java.lang.String> allowedCaCerts) {
    this.allowedCaCerts = allowedCaCerts;
    return this;
  }

  /**
   * The password for HTTP Basic authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password for HTTP Basic authentication.
   * @param password password or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3WebhookGenericWebService setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The HTTP request headers to send together with webhook requests.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRequestHeaders() {
    return requestHeaders;
  }

  /**
   * The HTTP request headers to send together with webhook requests.
   * @param requestHeaders requestHeaders or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3WebhookGenericWebService setRequestHeaders(java.util.Map<String, java.lang.String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  /**
   * Required. The webhook URI for receiving POST requests. It must use https protocol.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required. The webhook URI for receiving POST requests. It must use https protocol.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3WebhookGenericWebService setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The user name for HTTP Basic authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The user name for HTTP Basic authentication.
   * @param username username or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3WebhookGenericWebService setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3WebhookGenericWebService set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3WebhookGenericWebService) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3WebhookGenericWebService clone() {
    return (GoogleCloudDialogflowCxV3WebhookGenericWebService) super.clone();
  }

}
