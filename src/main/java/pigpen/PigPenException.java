/*
 *
 *  Copyright 2013 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package pigpen;

import java.io.IOException;

/**
 * An exception used to wrap Errors thrown from Clojure code as an IOException, which Pig can handle appropriately.
 *
 * @author mbossenbroek
 *
 */
public class PigPenException extends IOException {

    private static final long serialVersionUID = 1L;

    /**
     * Initialize a new PigPen exception.
     *
     * @param z The original exception
     */
    public PigPenException(Throwable z) {
        super(z);
        setStackTrace(new StackTraceElement[0]);
    }
}
