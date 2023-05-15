<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>MAE UAT SAM Old app TSC</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobile</key>
                  <value>{
  &quot;id&quot;: &quot;samsung_galaxy_s23&quot;,
  &quot;deviceId&quot;: &quot;Galaxy_S23_android_13&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;Samsung&quot;
  ],
  &quot;name&quot;: &quot;Galaxy S23&quot;,
  &quot;osVersion&quot;: &quot;13&quot;,
  &quot;os&quot;: &quot;Android&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false
}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/SAM/MAE UAT SAM OLS app</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
