/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.test.junit

import org.apache.geode.test.junit.support.DefaultIgnoreCondition
import java.lang.annotation.Inherited
import kotlin.reflect.KClass

/**
 * The ConditionalIgnore class is a Java Annotation used to annotated a test suite class test case
 * method in order to conditionally ignore the test case for a fixed amount of time, or based on a
 * predetermined condition provided by the IgnoreCondition interface.
 *
 * @see java.lang.annotation.Annotation
 *
 * @see org.apache.geode.test.junit.IgnoreCondition
 *
 * @see org.apache.geode.test.junit.support.DefaultIgnoreCondition
 */
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Inherited // Added by yvolk@yurivolkov.com 2017-05-29 - Now the annotation may be set on a superclass.
annotation class ConditionalIgnore(val condition: KClass<out IgnoreCondition> =
        DefaultIgnoreCondition::class, val until: String = "1970-01-01", val value: String = "")
