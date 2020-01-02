/*
 *      Copyright 2019 The original authors.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package io.sundr.codegen.model;

import io.sundr.builder.BaseFluent;

import java.util.HashMap;
import java.util.Map;

public class AttributeSupportFluentImpl<A extends AttributeSupportFluent<A>> extends BaseFluent<A> implements AttributeSupportFluent<A>{

    private final Map<AttributeKey, Object> attributes = new HashMap<>(0);

    public AttributeSupportFluentImpl(){
    }

    public AttributeSupportFluentImpl(AttributeSupport instance){
        this.withAttributes(instance.getAttributes());
    }

    public A addToAttributes(AttributeKey key, Object value){
        if(key != null && value != null) {this.attributes.put(key, value);} return (A)this;
    }

    public A addToAttributes(Map<AttributeKey, Object> map){
        if(map != null) { this.attributes.putAll(map);} return (A)this;
    }

    public A removeFromAttributes(AttributeKey key){
        if(key != null) {this.attributes.remove(key);} return (A)this;
    }

    public A removeFromAttributes(Map<AttributeKey, Object> map) {
        if (map != null) {
            map.keySet().forEach(attributes::remove);
        }
        return (A) this;
    }

    public Map<AttributeKey,Object> getAttributes(){
        return this.attributes;
    }

    public A withAttributes(Map<AttributeKey,Object> attributes) {
        this.attributes.clear();
        this.attributes.putAll(attributes);
        return (A) this;
    }

    public Boolean hasAttributes(){
            return !this.attributes.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AttributeSupportFluentImpl that = (AttributeSupportFluentImpl) o;
            if (attributes != null ? !attributes.equals(that.attributes) :that.attributes != null) return false;
            return true;
    }




}
