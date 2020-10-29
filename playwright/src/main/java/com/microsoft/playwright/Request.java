/*
 * Copyright (c) Microsoft Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.playwright;

import java.util.*;

public interface Request {
  class RequestFailure {
    private String errorText;

    public RequestFailure(String errorText) {
      this.errorText = errorText;
    }
    public String errorText() {
      return this.errorText;
    }
  }
  class RequestPostDataJSON {

  }
  RequestFailure failure();
  Frame frame();
  Map<String, String> headers();
  boolean isNavigationRequest();
  String method();
  String postData();
  byte[] postDataBuffer();
  Request redirectedFrom();
  Request redirectedTo();
  String resourceType();
  Response response();
  String url();
}
