/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
 package com.adobe.aem.spa.project.core.internal;

 import org.apache.sling.caconfig.annotation.Configuration;
 import org.apache.sling.caconfig.annotation.Property;
 
 /**
  * Context Aware Configuration Class of the Remote SPA host URL
  */
 @Configuration(label="Remote Page", description="Configure host URL of remote app to be edited")
 public @interface RemotePageConfig {
 
     @Property(label="Remote SPA URL")
     String remoteSPAUrl() default "http://localhost:3000";
 
 }