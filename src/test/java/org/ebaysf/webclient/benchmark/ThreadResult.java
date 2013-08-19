/*
 * Copyright (c) 2012-2013 eBay Software Foundation.
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
package org.ebaysf.webclient.benchmark;

/**
 * @author <a href="http://bruno.factor45.org/">Bruno de Carvalho</a>
 * @author Jason Brittain
 */
public class ThreadResult {

    private final int targetRequests;
    private final int successfulRequests;
    private final long totalTime;

    public ThreadResult(int targetRequests, int successfulRequests, long totalTime) {
        this.targetRequests = targetRequests;
        this.successfulRequests = successfulRequests;
        this.totalTime = totalTime;
    }

    public int getTargetRequests() {
        return targetRequests;
    }

    public int getSuccessfulRequests() {
        return successfulRequests;
    }

    public long getTotalTime() {
        return totalTime;
    }
}