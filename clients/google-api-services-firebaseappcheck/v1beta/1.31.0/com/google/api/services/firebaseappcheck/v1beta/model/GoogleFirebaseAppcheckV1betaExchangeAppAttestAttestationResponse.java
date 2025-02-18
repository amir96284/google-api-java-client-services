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

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * Response message for the ExchangeAppAttestAttestation method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse extends com.google.api.client.json.GenericJson {

  /**
   * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifact;

  /**
   * Encapsulates an App Check token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirebaseAppcheckV1betaAttestationTokenResponse attestationToken;

  /**
   * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
   * @see #decodeArtifact()
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifact() {
    return artifact;
  }

  /**
   * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
   * @see #getArtifact()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeArtifact() {
    return com.google.api.client.util.Base64.decodeBase64(artifact);
  }

  /**
   * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
   * @see #encodeArtifact()
   * @param artifact artifact or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse setArtifact(java.lang.String artifact) {
    this.artifact = artifact;
    return this;
  }

  /**
   * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
   * @see #setArtifact()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse encodeArtifact(byte[] artifact) {
    this.artifact = com.google.api.client.util.Base64.encodeBase64URLSafeString(artifact);
    return this;
  }

  /**
   * Encapsulates an App Check token.
   * @return value or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaAttestationTokenResponse getAttestationToken() {
    return attestationToken;
  }

  /**
   * Encapsulates an App Check token.
   * @param attestationToken attestationToken or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse setAttestationToken(GoogleFirebaseAppcheckV1betaAttestationTokenResponse attestationToken) {
    this.attestationToken = attestationToken;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse clone() {
    return (GoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse) super.clone();
  }

}
