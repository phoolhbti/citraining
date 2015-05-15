<%--
  Copyright 1997-2008 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Text-Image component

  Test component by phool chandra

--%><%@ page import="com.day.cq.commons.Doctype" %><%
%><%@include file="/apps/citraining/global.jsp"%>
<!-- How to access JCR data using sling api -->
<%
com.citraining.sling.Query wfService = sling.getService(com.citraining.sling.Query.class);
 
%>
<h2>Use the Sling API to get title of the resource at /content/geometrixx/en/service</h2>
  
<h3>The title of the page is: <%=  wfService.getJCRData("/content/geometrixx/en/service")%></h3>

    
