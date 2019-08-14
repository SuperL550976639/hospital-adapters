package com.sybercare.hospital.health.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.sybercare.hospital.adapters.entity.HisPrescriptionOther;
import com.sybercare.hospital.common.utils.ResultMsg;
import com.sybercare.hospital.health.service.IPrescriptionOtherService;

@RestController
public class PrescriptionOtherController {

	protected static final Logger LOGGER = LoggerFactory.getLogger(PrescriptionOtherController.class);

	@Autowired
	private IPrescriptionOtherService prescriptionOtherService;

	@RequestMapping(value = "/prescriptionOther/save", method = RequestMethod.POST)
	public ResultMsg heartrate(@RequestBody String jsonBody) {
		HisPrescriptionOther hisPrescriptionOther = JSONObject.parseObject(jsonBody)
				.toJavaObject(HisPrescriptionOther.class);
		ResultMsg msg = new ResultMsg();
		msg.setSyb_info("error");
		msg.setSyb_status("100");
		if (hisPrescriptionOther != null) {
			LOGGER.debug("hisPrescriptionOther: " + JSONObject.toJSONString(hisPrescriptionOther));
			if (prescriptionOtherService.doPOther(hisPrescriptionOther)) {
				msg.setSyb_info("success");
				msg.setSyb_status("200");
			}
		}
		return msg;
	}
}
