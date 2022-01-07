package com.averis.inventory.web.portlet;

import com.averis.inventory.model.Request;
import com.averis.inventory.service.RequestLocalService;
import com.averis.inventory.web.constants.AverisInventoryWebPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + AverisInventoryWebPortletKeys.AVERISINVENTORYWEB,
		"mvc.command.name=request_edit" }, service = MVCActionCommand.class)
public class EditInventoryActionCmd extends BaseMVCActionCommand {

	private RequestLocalService requestService;

	@Reference(unbind = "-")
	protected void setLeaveService(RequestLocalService leaveService) {
		this.requestService = leaveService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String productName = ParamUtil.getString(actionRequest, "productName");
		int quantity = ParamUtil.getInteger(actionRequest, "quantity");

		ServiceContext serviceContext = new ServiceContext();

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		serviceContext.setScopeGroupId(groupId);
		serviceContext.setUserId(themeDisplay.getUserId());

		Request request = requestService.addRequest(serviceContext, productName, groupId, themeDisplay.getUserId(),
				quantity, themeDisplay.getCompanyId(), new Date());

	}
}
