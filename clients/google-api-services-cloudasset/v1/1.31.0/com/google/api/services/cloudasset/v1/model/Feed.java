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

package com.google.api.services.cloudasset.v1.model;

/**
 * An asset feed used to export asset updates to a destinations. An asset feed filter controls what
 * updates are exported. The asset feed must be created within a project, organization, or folder.
 * Supported destinations are: Pub/Sub topics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Feed extends com.google.api.client.json.GenericJson {

  /**
   * A list of the full names of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> assetNames;

  /**
   * A list of types of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example: `"compute.googleapis.com/Disk"` See [this
   * topic](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for a list of all
   * supported asset types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> assetTypes;

  /**
   * A condition which determines whether an asset update should be published. If specified, an
   * asset will be returned only when the expression evaluates to true. When set, `expression` field
   * in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a
   * TemporalAsset with name `temporal_asset`. Example: a Feed with expression
   * ("temporal_asset.deleted == true") will only publish Asset deletions. Other fields of `Expr`
   * are optional. See our [user guide](https://cloud.google.com/asset-inventory/docs/monitoring-
   * asset-changes-with-condition) for detailed instructions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Expr condition;

  /**
   * Asset content type. If not specified, no content but the asset name and type will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * Required. Feed output configuration defining where the asset updates are published to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FeedOutputConfig feedOutputConfig;

  /**
   * Required. The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier}
   * or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned
   * feed identifier must be unique within the parent project/folder/organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field
   * should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified
   * relationship updates on the [asset_names] or the [asset_types]. It returns an error if any of
   * the [relationship_types] doesn't belong to the supported relationship types of the
   * [asset_names] or [asset_types], or any of the [asset_names] or the [asset_types] doesn't belong
   * to the source types of the [relationship_types]. * Otherwise: it outputs the supported
   * relationships of the types of [asset_names] and [asset_types] or returns an error if any of the
   * [asset_names] or the [asset_types] has no replationship support. See [Introduction to Cloud
   * Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported
   * asset types and relationship types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> relationshipTypes;

  /**
   * A list of the full names of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more info.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssetNames() {
    return assetNames;
  }

  /**
   * A list of the full names of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more info.
   * @param assetNames assetNames or {@code null} for none
   */
  public Feed setAssetNames(java.util.List<java.lang.String> assetNames) {
    this.assetNames = assetNames;
    return this;
  }

  /**
   * A list of types of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example: `"compute.googleapis.com/Disk"` See [this
   * topic](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for a list of all
   * supported asset types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssetTypes() {
    return assetTypes;
  }

  /**
   * A list of types of the assets to receive updates. You must specify either or both of
   * asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
   * are exported to the feed. Example: `"compute.googleapis.com/Disk"` See [this
   * topic](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for a list of all
   * supported asset types.
   * @param assetTypes assetTypes or {@code null} for none
   */
  public Feed setAssetTypes(java.util.List<java.lang.String> assetTypes) {
    this.assetTypes = assetTypes;
    return this;
  }

  /**
   * A condition which determines whether an asset update should be published. If specified, an
   * asset will be returned only when the expression evaluates to true. When set, `expression` field
   * in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a
   * TemporalAsset with name `temporal_asset`. Example: a Feed with expression
   * ("temporal_asset.deleted == true") will only publish Asset deletions. Other fields of `Expr`
   * are optional. See our [user guide](https://cloud.google.com/asset-inventory/docs/monitoring-
   * asset-changes-with-condition) for detailed instructions.
   * @return value or {@code null} for none
   */
  public Expr getCondition() {
    return condition;
  }

  /**
   * A condition which determines whether an asset update should be published. If specified, an
   * asset will be returned only when the expression evaluates to true. When set, `expression` field
   * in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a
   * TemporalAsset with name `temporal_asset`. Example: a Feed with expression
   * ("temporal_asset.deleted == true") will only publish Asset deletions. Other fields of `Expr`
   * are optional. See our [user guide](https://cloud.google.com/asset-inventory/docs/monitoring-
   * asset-changes-with-condition) for detailed instructions.
   * @param condition condition or {@code null} for none
   */
  public Feed setCondition(Expr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Asset content type. If not specified, no content but the asset name and type will be returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Asset content type. If not specified, no content but the asset name and type will be returned.
   * @param contentType contentType or {@code null} for none
   */
  public Feed setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Required. Feed output configuration defining where the asset updates are published to.
   * @return value or {@code null} for none
   */
  public FeedOutputConfig getFeedOutputConfig() {
    return feedOutputConfig;
  }

  /**
   * Required. Feed output configuration defining where the asset updates are published to.
   * @param feedOutputConfig feedOutputConfig or {@code null} for none
   */
  public Feed setFeedOutputConfig(FeedOutputConfig feedOutputConfig) {
    this.feedOutputConfig = feedOutputConfig;
    return this;
  }

  /**
   * Required. The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier}
   * or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned
   * feed identifier must be unique within the parent project/folder/organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier}
   * or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned
   * feed identifier must be unique within the parent project/folder/organization.
   * @param name name or {@code null} for none
   */
  public Feed setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field
   * should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified
   * relationship updates on the [asset_names] or the [asset_types]. It returns an error if any of
   * the [relationship_types] doesn't belong to the supported relationship types of the
   * [asset_names] or [asset_types], or any of the [asset_names] or the [asset_types] doesn't belong
   * to the source types of the [relationship_types]. * Otherwise: it outputs the supported
   * relationships of the types of [asset_names] and [asset_types] or returns an error if any of the
   * [asset_names] or the [asset_types] has no replationship support. See [Introduction to Cloud
   * Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported
   * asset types and relationship types.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRelationshipTypes() {
    return relationshipTypes;
  }

  /**
   * A list of relationship types to output, for example: `INSTANCE_TO_INSTANCEGROUP`. This field
   * should only be specified if content_type=RELATIONSHIP. * If specified: it outputs specified
   * relationship updates on the [asset_names] or the [asset_types]. It returns an error if any of
   * the [relationship_types] doesn't belong to the supported relationship types of the
   * [asset_names] or [asset_types], or any of the [asset_names] or the [asset_types] doesn't belong
   * to the source types of the [relationship_types]. * Otherwise: it outputs the supported
   * relationships of the types of [asset_names] and [asset_types] or returns an error if any of the
   * [asset_names] or the [asset_types] has no replationship support. See [Introduction to Cloud
   * Asset Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported
   * asset types and relationship types.
   * @param relationshipTypes relationshipTypes or {@code null} for none
   */
  public Feed setRelationshipTypes(java.util.List<java.lang.String> relationshipTypes) {
    this.relationshipTypes = relationshipTypes;
    return this;
  }

  @Override
  public Feed set(String fieldName, Object value) {
    return (Feed) super.set(fieldName, value);
  }

  @Override
  public Feed clone() {
    return (Feed) super.clone();
  }

}
