/*
 * Copyright 2015 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.dsl.internal.element.functions;

import io.sundr.dsl.annotations.Any;
import io.sundr.dsl.internal.element.functions.filter.RequiresAnyFilter;
import io.sundr.dsl.internal.element.functions.filter.TransitionFilter;

import javax.lang.model.util.Elements;
import java.util.Set;

public class ToRequiresAny extends KeywordsAndMethodsToFilter {

    public ToRequiresAny(Elements elements) {
        super(elements, Any.class.getCanonicalName());
    }

    @Override
    public TransitionFilter create(Set<String> classes, Set<String> keywords, Set<String> methods) {
        return new RequiresAnyFilter(classes, keywords, methods);
    }
}