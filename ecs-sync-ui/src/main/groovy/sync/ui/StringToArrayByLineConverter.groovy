/*
 * Copyright 2013-2017 EMC Corporation. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package sync.ui

import grails.databinding.converters.ValueConverter

class StringToArrayByLineConverter implements ValueConverter {
    @Override
    boolean canConvert(Object value) {
        return value instanceof String
    }

    @Override
    Object convert(Object value) {
        return (value as String).split('\n').collect { return it.trim() }
    }

    @Override
    Class<?> getTargetType() {
        return String[].class
    }
}
