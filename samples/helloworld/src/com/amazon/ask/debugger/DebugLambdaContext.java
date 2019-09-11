/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.ask.debugger;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class DebugLambdaContext implements Context {

    @Override
    public String getAwsRequestId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLogGroupName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLogStreamName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getFunctionName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CognitoIdentity getIdentity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClientContext getClientContext() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getRemainingTimeInMillis() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMemoryLimitInMB() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public LambdaLogger getLogger() {
        // TODO Auto-generated method stub
        return null;
    }

}
