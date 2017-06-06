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
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
//	   System.out.println(urlVal.isValid("http://www.am%30azon.com"));
//	   System.out.println(urlVal.isValid("http://name:pass@www.pc-help.org/obscure.htm"));
	   
   }
   //Christopher - do scheme, path
   private String assembleURL(String scheme, String authority, String port, String path, String query) {
	   return (scheme == null ? "" : scheme) + 
			   (authority == null ? "" : authority) + 
			   (port == null ? "" : port) + 
			   (path == null ? "" : path) + 
			   (query == null ? "" : query);
   }
   
   private void testUrl(boolean shouldBeValid, String url) throws Exception {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertEquals(shouldBeValid, urlVal.isValid(url));
   }
   
   public void testScheme() throws Exception
   {
	   // legal
	   testUrl(true, assembleURL("http://","www.amazon.com", null, null, null));
	   // all legal characters
	   testUrl(true, assembleURL("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+-.://","www.amazon.com", null, null, null));
	   // other legal stuff
	   testUrl(true, assembleURL("b234qh43://","www.amazon.com", null, null, null));
	   testUrl(true, assembleURL("A://","www.amazon.com", null, null, null));
	   testUrl(true, assembleURL("coolstuff://","www.amazon.com", null, null, null));
	   
	   //start with usually legal, but non-alpha char
	   testUrl(false, assembleURL("1moretime://","www.amazon.com", null, null, null));
	   
	   // blank scheme with ://
	   testUrl(false, assembleURL("://","www.amazon.com", null, null, null));
	   
	   testUrl(false, assembleURL("http:/","www.amazon.com", null, null, null));	   
	   testUrl(false, assembleURL("http//","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("http:","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("http/","www.amazon.com", null, null, null));
	   //invalid characters
	   testUrl(false, assembleURL("ht*tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht%tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht$tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht#tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht@tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht!tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht~tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht^tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht(tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht)tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht{tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht}tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht\"tp://","www.amazon.com", null, null, null));
	   testUrl(false, assembleURL("ht'tp://","www.amazon.com", null, null, null));
   }
   
   public void testAuthority() throws Exception {
	   testUrl(true, assembleURL("http://","username.password@www.amazon.com", null, null, null));
   }
   
   public void testQuery() {
	   
   }

   public void testPart() {
	   
   }
   
   public void testPath() throws Exception {
	   testUrl(true, "http://www.amazon.com");
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/morestuff", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/encoded%20char", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/this/is/a/lot/of/paths/hopefully/it/is/long/enough/to/find/potential/errors/in/the/scenario/that/that/would/be/necessary/for/us/", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/done/", null));
	   testUrl(true, assembleURL("http://","www.amazon.com", null, "/a/bc/def/ghij/klmno/pqrstu/vwxyz12/34567890/-._~%23%65%20", null));
	   
	   testUrl(false, assembleURL("http://","www.amazon.com", null, "/comming/up/is/invalid/char/asdf^asfd", null));
	   testUrl(false, assembleURL("http://","www.amazon.com", null, "this/should/start/with/a/slash", null));
	   testUrl(false, assembleURL("http://","www.amazon.com", null, "/more/invlid/chars/as<df", null));
	   testUrl(false, assembleURL("http://","www.amazon.com", null, "/more/invlid/chars/as^df", null));
	   testUrl(false, assembleURL("http://","www.amazon.com", null, "/more/invlid/chars/as{df", null));

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
