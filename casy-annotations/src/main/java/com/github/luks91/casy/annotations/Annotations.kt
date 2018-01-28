/**
 * Copyright (c) 2018-present, Casy Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package com.github.luks91.casy.annotations

import java.lang.annotation.Inherited
import kotlin.reflect.KClass

@Inherited
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class SyncEmitter(
        val triggeredBy: Array<KClass<*>> = [],
        val syncsAfter: Array<KClass<*>> = [],
        val topics: Array<String> = []
)

@Inherited
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class SyncRoot(
        val allEmittersTopic: String = "",
        val allNonPushEmittersTopic: String = ""
)

@Inherited
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class SyncGroup