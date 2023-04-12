/*
 * Copyright (c) 2012 Kevin Sawicki <kevinsawicki@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package com.github.kevinsawicki.http;

import static org.junit.Assert.assertEquals;

import com.github.kevinsawicki.http.HttpRequest.HttpRequestException;

import org.junit.Test;

/**
 * Unit tests of URL encoding done by {@link HttpRequest}
 */
public class EncodeTest {

  /**
   * Verify encoding of URLs
   */
  @Test
  public void encode() {
    assertEquals("http://google.com", HttpRequest.encode("http://google.com"));
    int x=7;
    String str1="Test";
    if(x==5)
    {
      str1.concat(" Concat");
    }
    else {
      StringBuilder sb = new StringBuilder(str1);
      str1 = sb.reverse().toString();
    }

  }
  @Test
  public void condition() {
    int x=5;
    String str1="Test";
    if(x==5)
    {
      str1.concat(" Concat");

    }
    else {
      StringBuilder sb = new StringBuilder(str1);
      str1 = sb.reverse().toString();
    }
    System.out.println(str1.length());

  }
  @Test
  public void loop() {
    int x = 8;
    String str1 = "Test";
    int sum = 0;

    // Unroll the loop 3 times
    for (int i = 0; i < x; i++) {
      str1 = str1 + "a";
      sum += str1.length();
    }

    System.out.println(sum);
  }
  @Test
  public void whileLoop() {
    int x = 8;
    String str1 = "Test";
    int sum = 0;
    int i = 0;

    while (i < x) {
      str1 = str1 + "a";
      sum += str1.length();
      i++;
    }

    System.out.println(sum);
  }
  @Test
  public void testFactorial() {
    assertEquals(6, HttpRequest.factorial(3));
  }
}
