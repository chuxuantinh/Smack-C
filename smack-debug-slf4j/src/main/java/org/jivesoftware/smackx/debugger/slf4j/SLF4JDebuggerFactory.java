/**
 *
 * Copyright 2014 Vyacheslav Blinov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.smackx.debugger.slf4j;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.debugger.SmackDebugger;
import org.jivesoftware.smack.debugger.SmackDebuggerFactory;

/**
 * Implementation of SmackDebuggerFactory which always creates instance of SLF4JSmackDebugger.
 */
public final class SLF4JDebuggerFactory implements SmackDebuggerFactory {

    public static final SLF4JDebuggerFactory INSTANCE = new SLF4JDebuggerFactory();

    private SLF4JDebuggerFactory() {
    }

    @Override
    public SmackDebugger create(XMPPConnection connection) throws IllegalArgumentException {
        return new SLF4JSmackDebugger(connection);
    }
}
