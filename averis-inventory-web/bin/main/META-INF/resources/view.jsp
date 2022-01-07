<%@page import="com.liferay.portal.util.PortalImpl"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="init.jsp" %>
<%
 PortletURL requestItrUrl = renderResponse.createRenderURL();
 requestItrUrl.setParameter("mvcPath", "/view.jsp"); 

%>
<portlet:renderURL var="addRequestJSP">
 <portlet:param name="mvcPath" value="/addRequest.jsp"/> 
</portlet:renderURL>


<div class="container-fluid main-content-body">

<liferay-ui:search-container delta="10" emptyResultsMessage="no-requests-found" iteratorURL="<%=requestItrUrl %>" >
 
 
 <liferay-ui:search-container-results >
      <%
                                               
          results = RequestLocalServiceUtil.getRequests(searchContainer.getStart(),searchContainer.getEnd());
          total = RequestLocalServiceUtil.getRequestsCount();
          searchContainer.setResults(results);
          searchContainer.setTotal(total);
                                %>
 </liferay-ui:search-container-results>
	 <liferay-ui:search-container-row className="com.averis.inventory.model.Request" modelVar="requests" keyProperty="requestId" > 
	     <%-- <portlet:renderURL var="rowURL"> 
	          <portlet:param name="backURL" value="<%=currentURL %>" /> 
	          <portlet:param name="requestId" value="${requests.requestId}" /> 
	           <portlet:param name="mvcPath" value="/requestInfo.jsp"/> -
	     </portlet:renderURL> --%>
    	<liferay-ui:search-container-column-user userId="${requests.userId}" showDetails="false" name="User" />
         <%-- <liferay-ui:search-container-column-text property="userName" name="User Name" href="${rowURL}"/>  --%>
         <liferay-ui:search-container-column-text property="productName" name="Product Name"/> 
         <liferay-ui:search-container-column-text property="quantity" name="Quantity"/>
         <liferay-ui:search-container-column-date property="createDate" name="Created Date"/>
	     <liferay-ui:search-container-column-status property="status" name="Status" >
	 	</liferay-ui:search-container-column-status>
     </liferay-ui:search-container-row>
     <liferay-ui:search-iterator />
</liferay-ui:search-container>

<liferay-frontend:add-menu >
 <liferay-frontend:add-menu-item title='<%= LanguageUtil.get(request,
 "add-request") %>' url="<%=addRequestJSP%>" />
</liferay-frontend:add-menu>

</div>