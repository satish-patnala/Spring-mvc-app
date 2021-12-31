package com.app.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvcapp.lc.api.UserInfoDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		return "Home-Page";
	}

	@RequestMapping("/process-homepage")
	public String resultpage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		return "Result-Page";
	}
}
