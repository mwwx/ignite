/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.network.serialization.marshal;

/**
 * Marshals/unmarshals objects in accordance with User Object Serialization.
 *
 * @see <a href="https://github.com/gridgain/gridgain-9-ce/blob/iep-67/modules/network/README.md">IEP-67</a>
 */
public interface UserObjectMarshaller {
    /**
     * Marshals the provided object.
     *
     * @param object object to marshal
     * @return marshalled representation
     * @throws MarshalException if marshalling fails
     */
    MarshalledObject marshal(Object object) throws MarshalException;

    /**
     * Unmarshals an object.
     *
     * @param bytes bytes representing the marshalled object
     * @param <T> expected type
     * @return unmarshalled object
     * @throws UnmarshalException if unmarshalling fails
     */
    <T> T unmarshal(byte[] bytes) throws UnmarshalException;
}
