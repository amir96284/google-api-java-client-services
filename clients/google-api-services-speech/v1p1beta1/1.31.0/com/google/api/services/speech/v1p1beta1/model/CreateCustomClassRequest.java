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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * Message sent by the client for the `CreateCustomClass` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateCustomClassRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The custom class to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomClass customClass;

  /**
   * Required. The ID to use for the custom class, which will become the final component of the
   * custom class' resource name. This value should be 4-63 characters, and valid characters are
   * /a-z-/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customClassId;

  /**
   * Required. The custom class to create.
   * @return value or {@code null} for none
   */
  public CustomClass getCustomClass() {
    return customClass;
  }

  /**
   * Required. The custom class to create.
   * @param customClass customClass or {@code null} for none
   */
  public CreateCustomClassRequest setCustomClass(CustomClass customClass) {
    this.customClass = customClass;
    return this;
  }

  /**
   * Required. The ID to use for the custom class, which will become the final component of the
   * custom class' resource name. This value should be 4-63 characters, and valid characters are
   * /a-z-/.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomClassId() {
    return customClassId;
  }

  /**
   * Required. The ID to use for the custom class, which will become the final component of the
   * custom class' resource name. This value should be 4-63 characters, and valid characters are
   * /a-z-/.
   * @param customClassId customClassId or {@code null} for none
   */
  public CreateCustomClassRequest setCustomClassId(java.lang.String customClassId) {
    this.customClassId = customClassId;
    return this;
  }

  @Override
  public CreateCustomClassRequest set(String fieldName, Object value) {
    return (CreateCustomClassRequest) super.set(fieldName, value);
  }

  @Override
  public CreateCustomClassRequest clone() {
    return (CreateCustomClassRequest) super.clone();
  }

}
