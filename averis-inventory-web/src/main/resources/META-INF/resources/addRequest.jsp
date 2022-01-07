<%@ include file="init.jsp" %>


Send Request

<liferay-portlet:actionURL name="request_edit" var="editRequest">
 <portlet:param name="mvcActionCommand" value="request_edit" />
</liferay-portlet:actionURL>

<aui:form action="<%= editRequest %>" cssClass="container-fluid" method="post" name="fm">
 <aui:fieldset markupView="lexicon">
 
 <aui:select name="productName">
 	<aui:option value="apples" label="apples"></aui:option>
 	<aui:option value="rice" label="rice"></aui:option>
 </aui:select>

 <aui:input type="number"  name="quantity"></aui:input>
 <aui:button type="submit"></aui:button>
 </aui:fieldset> 
</aui:form>