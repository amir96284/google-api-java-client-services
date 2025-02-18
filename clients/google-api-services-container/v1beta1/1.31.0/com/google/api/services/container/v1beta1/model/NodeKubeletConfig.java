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

package com.google.api.services.container.v1beta1.model;

/**
 * Node kubelet configs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeKubeletConfig extends com.google.api.client.json.GenericJson {

  /**
   * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled
   * by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU
   * limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU
   * throttling problems while still having your pods to be in Guaranteed QoS class by specifying
   * the CPU limits. The default value is 'true' if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cpuCfsQuota;

  /**
   * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of
   * decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time
   * units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuCfsQuotaPeriod;

  /**
   * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-
   * cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which
   * represents the existing scheduling behavior. * "static": allows pods with certain resource
   * characteristics to be granted increased CPU affinity and exclusivity on the node. The default
   * value is 'none' if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuManagerPolicy;

  /**
   * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled
   * by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU
   * limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU
   * throttling problems while still having your pods to be in Guaranteed QoS class by specifying
   * the CPU limits. The default value is 'true' if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCpuCfsQuota() {
    return cpuCfsQuota;
  }

  /**
   * Enable CPU CFS quota enforcement for containers that specify CPU limits. This option is enabled
   * by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to enforce container CPU
   * limits. Otherwise, CPU limits will not be enforced at all. Disable this option to mitigate CPU
   * throttling problems while still having your pods to be in Guaranteed QoS class by specifying
   * the CPU limits. The default value is 'true' if unspecified.
   * @param cpuCfsQuota cpuCfsQuota or {@code null} for none
   */
  public NodeKubeletConfig setCpuCfsQuota(java.lang.Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
    return this;
  }

  /**
   * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of
   * decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time
   * units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuCfsQuotaPeriod() {
    return cpuCfsQuotaPeriod;
  }

  /**
   * Set the CPU CFS quota period value 'cpu.cfs_period_us'. The string must be a sequence of
   * decimal numbers, each with optional fraction and a unit suffix, such as "300ms". Valid time
   * units are "ns", "us" (or "µs"), "ms", "s", "m", "h". The value must be a positive duration.
   * @param cpuCfsQuotaPeriod cpuCfsQuotaPeriod or {@code null} for none
   */
  public NodeKubeletConfig setCpuCfsQuotaPeriod(java.lang.String cpuCfsQuotaPeriod) {
    this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
    return this;
  }

  /**
   * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-
   * cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which
   * represents the existing scheduling behavior. * "static": allows pods with certain resource
   * characteristics to be granted increased CPU affinity and exclusivity on the node. The default
   * value is 'none' if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuManagerPolicy() {
    return cpuManagerPolicy;
  }

  /**
   * Control the CPU management policy on the node. See https://kubernetes.io/docs/tasks/administer-
   * cluster/cpu-management-policies/ The following values are allowed. * "none": the default, which
   * represents the existing scheduling behavior. * "static": allows pods with certain resource
   * characteristics to be granted increased CPU affinity and exclusivity on the node. The default
   * value is 'none' if unspecified.
   * @param cpuManagerPolicy cpuManagerPolicy or {@code null} for none
   */
  public NodeKubeletConfig setCpuManagerPolicy(java.lang.String cpuManagerPolicy) {
    this.cpuManagerPolicy = cpuManagerPolicy;
    return this;
  }

  @Override
  public NodeKubeletConfig set(String fieldName, Object value) {
    return (NodeKubeletConfig) super.set(fieldName, value);
  }

  @Override
  public NodeKubeletConfig clone() {
    return (NodeKubeletConfig) super.clone();
  }

}
