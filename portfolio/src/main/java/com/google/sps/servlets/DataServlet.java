// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns some example content. TODO: modify this file to handle comments data */
@WebServlet("/data")
public class DataServlet extends HttpServlet {
    private int pageViews = 0;
    private List<String> quotes;
    private final Date startTime = new Date();


  @Override
  public void init() {
    quotes = new ArrayList<>();
    quotes.add("Si se Puede");
    quotes.add("Shout out to my mom");
    quotes.add("Siempre Humble");
    quotes.add("Adelante y con ganas");
    quotes.add("Don't complain you have too much on your plate when your goal was to eat");
    quotes.add("She believes she could so she did");
 }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    pageViews++;
    String quote = quotes.get((int) (Math.random() * quotes.size()));

    response.setContentType("text/html;");
    response.getWriter().println("Hello Ricardo!");
    response.getWriter().println("This page has been viewed " + pageViews + " times.");
    response.getWriter().println(quote);    
 }
}