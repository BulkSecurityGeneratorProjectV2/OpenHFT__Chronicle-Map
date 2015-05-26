/*
 * Copyright 2015 Higher Frequency Trading
 *
 *  http://www.higherfrequencytrading.com
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.openhft.chronicle.hash;

import net.openhft.chronicle.algo.hashing.LongHashFunction;

public abstract class AbstractValue<V, T> implements Value<V, T> {

    @Override
    public int hashCode() {
        return (int) hash(LongHashFunction.city_1_1());
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null &&
                obj instanceof Value &&
                Value.bytesEquivalent(this, (Value<?, ?>) obj);
    }

    @Override
    public String toString() {
        return get().toString();
    }
}
