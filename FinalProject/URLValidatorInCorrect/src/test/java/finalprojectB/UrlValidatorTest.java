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
package finalprojectB;

import junit.framework.TestCase;



/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using
   
   private String[] schemeValid = {
	   "http://",
	   "https://",
	   "gopher://",
	   "icap://",
	   "ftp://"
   };
   
   private String[] schemeInvalid = {
		"junk://",
		"trash://",
		"idbeamazedifthisisavalidscheme://",
		"http:/",
		"http:",
		"http",
		"somestuff:",
		"someJunk//",
		"someTrash:/"
   };
   private String[] athorityValid = {
	   "www.google.com",
	   "1.1.1.1",
	   "192.168.1.1"
   };
   
   private String[] athorityInValid = {
	   "google.com",
	   "ww.google.com",
	   "0.0.0",
	   "128.4.5",
	   "128.192.134.156.172",
	   "256.256.256.256",
	   "www.yourmom.com"
   };
   private String[] portValid = {
	   "60000",
	   "1",
	   "29000",
	   "65535"
   };
   
   private String[] portInValid = {
	   "0",
	   "-100",
	   "-1",
	   "12345678910",
	   "65536" //largest 16 bit port number.
   };
   private String[] Query;
   private String[] path;

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("www.amazon.damn?dude=five"));
	   System.out.println(urlVal.isValid("ssh://www.osu.org/../"));
	   System.out.println(urlVal.isValid("http:/www.google/dudeman:35844"));
	   System.out.println(urlVal.isValid("http://192.168.1.1"));
	   System.out.println(urlVal.isValid("http:www.google.com/"));
	   System.out.println(urlVal.isValid("http://www.google.com//path"));
	   System.out.println(urlVal.isValid("http://www.google.com/path/this/path/is/super/long/and/will/hopfully/cause/a/problem/damn/this/path/just/keeps/going/on/and/on/and/on"));
	   System.out.println(urlVal.isValid("http://example.com/wp-admin/load-scripts.php?c=1&load[]=swfobject,jquery,utils&ver=3.5"));
	   System.out.println(urlVal.isValid("http://test.site/wp-admin/post.php?t=1347548645469?t=1347548651124?t=1347548656685?t=1347548662469?t=1347548672300?t=1347548681615?"));
	   System.out.println(urlVal.isValid("http://www.google.com?id=25&password=dudeman&sam=man"));
	   System.out.println(urlVal.isValid("http://www.google.com:-100/index"));
	   System.out.println(urlVal.isValid("http://www.google.com:80/index"));
	   System.out.println(urlVal.isValid("http://www.google.com:80b/index"));
	   System.out.println(urlVal.isValid("http://www.google.com:100000000000000/index"));
   }
   
   //chris
   public void testScheme()
   {
	   
   }
   
   //thomas
   public void testPort(){
	   
   }
   
   //thomas
   public void testQuery(){
	   
   }
   
   //thomas
   public void testAuthority(){
	   
   }
   
   //chris:
   public void testPath() {
	   
   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
