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

package com.google.api.services.run.v1alpha1;

/**
 * Service definition for CloudRun (v1alpha1).
 *
 * <p>
 * Deploy and manage user provided container images that scale automatically based on incoming requests. The Cloud Run Admin API follows the Knative Serving API specification.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/run/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudRunRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudRun extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.32.1 of the Cloud Run Admin API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://run.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://run.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudRun(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudRun(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Namespaces collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudRun run = new CloudRun(...);}
   *   {@code CloudRun.Namespaces.List request = run.namespaces().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Namespaces namespaces() {
    return new Namespaces();
  }

  /**
   * The "namespaces" collection of methods.
   */
  public class Namespaces {

    /**
     * An accessor for creating requests from the Jobs collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code CloudRun run = new CloudRun(...);}
     *   {@code CloudRun.Jobs.List request = run.jobs().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Jobs jobs() {
      return new Jobs();
    }

    /**
     * The "jobs" collection of methods.
     */
    public class Jobs {

      /**
       * Create a job.
       *
       * Create a request for the method "jobs.create".
       *
       * This request holds the parameters needed by the run server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param parent Required. The namespace in which the job should be created. Replace {namespace_id} with the project
       *        ID or number.
       * @param content the {@link com.google.api.services.run.v1alpha1.model.Job}
       * @return the request
       */
      public Create create(java.lang.String parent, com.google.api.services.run.v1alpha1.model.Job content) throws java.io.IOException {
        Create result = new Create(parent, content);
        initialize(result);
        return result;
      }

      public class Create extends CloudRunRequest<com.google.api.services.run.v1alpha1.model.Job> {

        private static final String REST_PATH = "apis/run.googleapis.com/v1alpha1/{+parent}/jobs";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^namespaces/[^/]+$");

        /**
         * Create a job.
         *
         * Create a request for the method "jobs.create".
         *
         * This request holds the parameters needed by the the run server.  After setting any optional
         * parameters, call the {@link Create#execute()} method to invoke the remote operation. <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Required. The namespace in which the job should be created. Replace {namespace_id} with the project
       *        ID or number.
         * @param content the {@link com.google.api.services.run.v1alpha1.model.Job}
         * @since 1.13
         */
        protected Create(java.lang.String parent, com.google.api.services.run.v1alpha1.model.Job content) {
          super(CloudRun.this, "POST", REST_PATH, content, com.google.api.services.run.v1alpha1.model.Job.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^namespaces/[^/]+$");
          }
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The namespace in which the job should be created. Replace {namespace_id} with
         * the project ID or number.
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Required. The namespace in which the job should be created. Replace {namespace_id} with the project
       ID or number.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Required. The namespace in which the job should be created. Replace {namespace_id} with
         * the project ID or number.
         */
        public Create setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^namespaces/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }
      /**
       * Delete a job.
       *
       * Create a request for the method "jobs.delete".
       *
       * This request holds the parameters needed by the run server.  After setting any optional
       * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
       *
       * @param name Required. The name of the job to delete. For Cloud Run (fully managed), replace {namespace_id} with
       *        the project ID or number.
       * @return the request
       */
      public Delete delete(java.lang.String name) throws java.io.IOException {
        Delete result = new Delete(name);
        initialize(result);
        return result;
      }

      public class Delete extends CloudRunRequest<com.google.api.services.run.v1alpha1.model.Empty> {

        private static final String REST_PATH = "apis/run.googleapis.com/v1alpha1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^namespaces/[^/]+/jobs/[^/]+$");

        /**
         * Delete a job.
         *
         * Create a request for the method "jobs.delete".
         *
         * This request holds the parameters needed by the the run server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation. <p> {@link
         * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Required. The name of the job to delete. For Cloud Run (fully managed), replace {namespace_id} with
       *        the project ID or number.
         * @since 1.13
         */
        protected Delete(java.lang.String name) {
          super(CloudRun.this, "DELETE", REST_PATH, null, com.google.api.services.run.v1alpha1.model.Empty.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^namespaces/[^/]+/jobs/[^/]+$");
          }
        }

        @Override
        public Delete set$Xgafv(java.lang.String $Xgafv) {
          return (Delete) super.set$Xgafv($Xgafv);
        }

        @Override
        public Delete setAccessToken(java.lang.String accessToken) {
          return (Delete) super.setAccessToken(accessToken);
        }

        @Override
        public Delete setAlt(java.lang.String alt) {
          return (Delete) super.setAlt(alt);
        }

        @Override
        public Delete setCallback(java.lang.String callback) {
          return (Delete) super.setCallback(callback);
        }

        @Override
        public Delete setFields(java.lang.String fields) {
          return (Delete) super.setFields(fields);
        }

        @Override
        public Delete setKey(java.lang.String key) {
          return (Delete) super.setKey(key);
        }

        @Override
        public Delete setOauthToken(java.lang.String oauthToken) {
          return (Delete) super.setOauthToken(oauthToken);
        }

        @Override
        public Delete setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Delete) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Delete setQuotaUser(java.lang.String quotaUser) {
          return (Delete) super.setQuotaUser(quotaUser);
        }

        @Override
        public Delete setUploadType(java.lang.String uploadType) {
          return (Delete) super.setUploadType(uploadType);
        }

        @Override
        public Delete setUploadProtocol(java.lang.String uploadProtocol) {
          return (Delete) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the job to delete. For Cloud Run (fully managed), replace
         * {namespace_id} with the project ID or number.
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. The name of the job to delete. For Cloud Run (fully managed), replace {namespace_id} with
       the project ID or number.
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. The name of the job to delete. For Cloud Run (fully managed), replace
         * {namespace_id} with the project ID or number.
         */
        public Delete setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^namespaces/[^/]+/jobs/[^/]+$");
          }
          this.name = name;
          return this;
        }

        /** Optional. Cloud Run currently ignores this parameter. */
        @com.google.api.client.util.Key
        private java.lang.String apiVersion;

        /** Optional. Cloud Run currently ignores this parameter.
         */
        public java.lang.String getApiVersion() {
          return apiVersion;
        }

        /** Optional. Cloud Run currently ignores this parameter. */
        public Delete setApiVersion(java.lang.String apiVersion) {
          this.apiVersion = apiVersion;
          return this;
        }

        /** Optional. Cloud Run currently ignores this parameter. */
        @com.google.api.client.util.Key
        private java.lang.String kind;

        /** Optional. Cloud Run currently ignores this parameter.
         */
        public java.lang.String getKind() {
          return kind;
        }

        /** Optional. Cloud Run currently ignores this parameter. */
        public Delete setKind(java.lang.String kind) {
          this.kind = kind;
          return this;
        }

        /**
         * Optional. Specifies the propagation policy of delete. Cloud Run currently ignores this
         * setting, and deletes in the background. Please see
         * kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more
         * information.
         */
        @com.google.api.client.util.Key
        private java.lang.String propagationPolicy;

        /** Optional. Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and
       deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-
       collection/ for more information.
         */
        public java.lang.String getPropagationPolicy() {
          return propagationPolicy;
        }

        /**
         * Optional. Specifies the propagation policy of delete. Cloud Run currently ignores this
         * setting, and deletes in the background. Please see
         * kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more
         * information.
         */
        public Delete setPropagationPolicy(java.lang.String propagationPolicy) {
          this.propagationPolicy = propagationPolicy;
          return this;
        }

        @Override
        public Delete set(String parameterName, Object value) {
          return (Delete) super.set(parameterName, value);
        }
      }
      /**
       * Get information about a job.
       *
       * Create a request for the method "jobs.get".
       *
       * This request holds the parameters needed by the run server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation.
       *
       * @param name Required. The name of the job to retrieve. For Cloud Run (fully managed), replace {namespace_id}
       *        with the project ID or number.
       * @return the request
       */
      public Get get(java.lang.String name) throws java.io.IOException {
        Get result = new Get(name);
        initialize(result);
        return result;
      }

      public class Get extends CloudRunRequest<com.google.api.services.run.v1alpha1.model.Job> {

        private static final String REST_PATH = "apis/run.googleapis.com/v1alpha1/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^namespaces/[^/]+/jobs/[^/]+$");

        /**
         * Get information about a job.
         *
         * Create a request for the method "jobs.get".
         *
         * This request holds the parameters needed by the the run server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
         * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Required. The name of the job to retrieve. For Cloud Run (fully managed), replace {namespace_id}
       *        with the project ID or number.
         * @since 1.13
         */
        protected Get(java.lang.String name) {
          super(CloudRun.this, "GET", REST_PATH, null, com.google.api.services.run.v1alpha1.model.Job.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^namespaces/[^/]+/jobs/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public Get set$Xgafv(java.lang.String $Xgafv) {
          return (Get) super.set$Xgafv($Xgafv);
        }

        @Override
        public Get setAccessToken(java.lang.String accessToken) {
          return (Get) super.setAccessToken(accessToken);
        }

        @Override
        public Get setAlt(java.lang.String alt) {
          return (Get) super.setAlt(alt);
        }

        @Override
        public Get setCallback(java.lang.String callback) {
          return (Get) super.setCallback(callback);
        }

        @Override
        public Get setFields(java.lang.String fields) {
          return (Get) super.setFields(fields);
        }

        @Override
        public Get setKey(java.lang.String key) {
          return (Get) super.setKey(key);
        }

        @Override
        public Get setOauthToken(java.lang.String oauthToken) {
          return (Get) super.setOauthToken(oauthToken);
        }

        @Override
        public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Get) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Get setQuotaUser(java.lang.String quotaUser) {
          return (Get) super.setQuotaUser(quotaUser);
        }

        @Override
        public Get setUploadType(java.lang.String uploadType) {
          return (Get) super.setUploadType(uploadType);
        }

        @Override
        public Get setUploadProtocol(java.lang.String uploadProtocol) {
          return (Get) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the job to retrieve. For Cloud Run (fully managed), replace
         * {namespace_id} with the project ID or number.
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. The name of the job to retrieve. For Cloud Run (fully managed), replace {namespace_id}
       with the project ID or number.
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. The name of the job to retrieve. For Cloud Run (fully managed), replace
         * {namespace_id} with the project ID or number.
         */
        public Get setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^namespaces/[^/]+/jobs/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public Get set(String parameterName, Object value) {
          return (Get) super.set(parameterName, value);
        }
      }
      /**
       * List jobs.
       *
       * Create a request for the method "jobs.list".
       *
       * This request holds the parameters needed by the run server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation.
       *
       * @param parent Required. The namespace from which the jobs should be listed. Replace {namespace_id} with the
       *        project ID or number.
       * @return the request
       */
      public List list(java.lang.String parent) throws java.io.IOException {
        List result = new List(parent);
        initialize(result);
        return result;
      }

      public class List extends CloudRunRequest<com.google.api.services.run.v1alpha1.model.ListJobsResponse> {

        private static final String REST_PATH = "apis/run.googleapis.com/v1alpha1/{+parent}/jobs";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^namespaces/[^/]+$");

        /**
         * List jobs.
         *
         * Create a request for the method "jobs.list".
         *
         * This request holds the parameters needed by the the run server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
         * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Required. The namespace from which the jobs should be listed. Replace {namespace_id} with the
       *        project ID or number.
         * @since 1.13
         */
        protected List(java.lang.String parent) {
          super(CloudRun.this, "GET", REST_PATH, null, com.google.api.services.run.v1alpha1.model.ListJobsResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^namespaces/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public List set$Xgafv(java.lang.String $Xgafv) {
          return (List) super.set$Xgafv($Xgafv);
        }

        @Override
        public List setAccessToken(java.lang.String accessToken) {
          return (List) super.setAccessToken(accessToken);
        }

        @Override
        public List setAlt(java.lang.String alt) {
          return (List) super.setAlt(alt);
        }

        @Override
        public List setCallback(java.lang.String callback) {
          return (List) super.setCallback(callback);
        }

        @Override
        public List setFields(java.lang.String fields) {
          return (List) super.setFields(fields);
        }

        @Override
        public List setKey(java.lang.String key) {
          return (List) super.setKey(key);
        }

        @Override
        public List setOauthToken(java.lang.String oauthToken) {
          return (List) super.setOauthToken(oauthToken);
        }

        @Override
        public List setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (List) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public List setQuotaUser(java.lang.String quotaUser) {
          return (List) super.setQuotaUser(quotaUser);
        }

        @Override
        public List setUploadType(java.lang.String uploadType) {
          return (List) super.setUploadType(uploadType);
        }

        @Override
        public List setUploadProtocol(java.lang.String uploadProtocol) {
          return (List) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The namespace from which the jobs should be listed. Replace {namespace_id} with
         * the project ID or number.
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Required. The namespace from which the jobs should be listed. Replace {namespace_id} with the
       project ID or number.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Required. The namespace from which the jobs should be listed. Replace {namespace_id} with
         * the project ID or number.
         */
        public List setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^namespaces/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        /** Optional. Optional encoded string to continue paging. */
        @com.google.api.client.util.Key("continue")
        private java.lang.String continue__;

        /** Optional. Optional encoded string to continue paging.
         */
        public java.lang.String getContinue() {
          return continue__;
        }

        /** Optional. Optional encoded string to continue paging. */
        public List setContinue(java.lang.String continue__) {
          this.continue__ = continue__;
          return this;
        }

        /**
         * Optional. Allows to filter resources based on a specific value for a field name. Send
         * this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud
         * Run.
         */
        @com.google.api.client.util.Key
        private java.lang.String fieldSelector;

        /** Optional. Allows to filter resources based on a specific value for a field name. Send this in a
       query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
         */
        public java.lang.String getFieldSelector() {
          return fieldSelector;
        }

        /**
         * Optional. Allows to filter resources based on a specific value for a field name. Send
         * this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud
         * Run.
         */
        public List setFieldSelector(java.lang.String fieldSelector) {
          this.fieldSelector = fieldSelector;
          return this;
        }

        /** Optional. Not currently used by Cloud Run. */
        @com.google.api.client.util.Key
        private java.lang.Boolean includeUninitialized;

        /** Optional. Not currently used by Cloud Run.
         */
        public java.lang.Boolean getIncludeUninitialized() {
          return includeUninitialized;
        }

        /** Optional. Not currently used by Cloud Run. */
        public List setIncludeUninitialized(java.lang.Boolean includeUninitialized) {
          this.includeUninitialized = includeUninitialized;
          return this;
        }

        /**
         * Optional. Allows to filter resources based on a label. Supported operations are =, !=,
         * exists, in, and notIn.
         */
        @com.google.api.client.util.Key
        private java.lang.String labelSelector;

        /** Optional. Allows to filter resources based on a label. Supported operations are =, !=, exists, in,
       and notIn.
         */
        public java.lang.String getLabelSelector() {
          return labelSelector;
        }

        /**
         * Optional. Allows to filter resources based on a label. Supported operations are =, !=,
         * exists, in, and notIn.
         */
        public List setLabelSelector(java.lang.String labelSelector) {
          this.labelSelector = labelSelector;
          return this;
        }

        /** Optional. The maximum number of records that should be returned. */
        @com.google.api.client.util.Key
        private java.lang.Integer limit;

        /** Optional. The maximum number of records that should be returned.
         */
        public java.lang.Integer getLimit() {
          return limit;
        }

        /** Optional. The maximum number of records that should be returned. */
        public List setLimit(java.lang.Integer limit) {
          this.limit = limit;
          return this;
        }

        /**
         * Optional. The baseline resource version from which the list or watch operation should
         * start. Not currently used by Cloud Run.
         */
        @com.google.api.client.util.Key
        private java.lang.String resourceVersion;

        /** Optional. The baseline resource version from which the list or watch operation should start. Not
       currently used by Cloud Run.
         */
        public java.lang.String getResourceVersion() {
          return resourceVersion;
        }

        /**
         * Optional. The baseline resource version from which the list or watch operation should
         * start. Not currently used by Cloud Run.
         */
        public List setResourceVersion(java.lang.String resourceVersion) {
          this.resourceVersion = resourceVersion;
          return this;
        }

        /**
         * Optional. Flag that indicates that the client expects to watch this resource as well. Not
         * currently used by Cloud Run.
         */
        @com.google.api.client.util.Key
        private java.lang.Boolean watch;

        /** Optional. Flag that indicates that the client expects to watch this resource as well. Not currently
       used by Cloud Run.
         */
        public java.lang.Boolean getWatch() {
          return watch;
        }

        /**
         * Optional. Flag that indicates that the client expects to watch this resource as well. Not
         * currently used by Cloud Run.
         */
        public List setWatch(java.lang.Boolean watch) {
          this.watch = watch;
          return this;
        }

        @Override
        public List set(String parameterName, Object value) {
          return (List) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link CloudRun}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudRun}. */
    @Override
    public CloudRun build() {
      return new CloudRun(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudRunRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudRunRequestInitializer(
        CloudRunRequestInitializer cloudrunRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudrunRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
