package com.averis.inventory.web.portlet;

import com.averis.inventory.model.Request;
import com.averis.inventory.service.RequestLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "model.class.name=com.averis.inventory.model.Request" }, service = WorkflowHandler.class)
public class RequestWorkflowHandler extends BaseWorkflowHandler<Request> {
	Log logger = LogFactoryUtil.getLog(getClass());
	@Reference
	private RequestLocalService requestService;

	@Override
	public String getClassName() {
		return Request.class.getName();
	}

	@Override
	public String getType(Locale locale) {
		return "request";
	}

	@Override
	public Request updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
		Request request = null;
		logger.info(" updateStatus");
		long userId = GetterUtil.getLong((String) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long requestId = GetterUtil.getLong((String) workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");
		try {
			
			
			
			request = requestService.updateStatus(userId, requestId, status, serviceContext);
		} catch (Exception e) {
			logger.error("erroe");
			e.printStackTrace();
		}
		return request;
	}

}
