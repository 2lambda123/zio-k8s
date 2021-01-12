package com.coralogix.zio.k8s.client.model

import com.coralogix.zio.k8s.model.pkg.apis.meta.v1.ObjectMeta

trait ObjectTransformations[T] {
  def mapMetadata(f: ObjectMeta => ObjectMeta)(r: T): T
}