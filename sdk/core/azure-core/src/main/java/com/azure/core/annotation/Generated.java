// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Annotation given to all methods that are generated by AutoRest. This annotation is intended to be used by
 * the code generation tool only to identify methods that are generated. The purpose of this annotation is to find
 * and replace all methods in a class that are generated. Methods not annotated with this annotation will not be
 * updated when code is regenerated.
 * <p>This annotation is expected to be used in classes that are annotated with {@link ServiceClient} only.</p>
 */
@Retention(SOURCE)
@Target({METHOD, CONSTRUCTOR, FIELD})
public @interface Generated {

}
