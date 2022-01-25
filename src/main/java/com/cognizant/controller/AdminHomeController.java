package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminHomeController {

	@RequestMapping(value = "/Trainerdetails", method = RequestMethod.GET)
	public String showRegisterPage(ModelMap model) {
		return "Trainerdetails";
	}

	@RequestMapping(value = "/Trainerdetails", method = RequestMethod.POST)
	public String showRegisterForm(ModelMap model) {
		return "Trainerdetails";
	}

	@RequestMapping(value = "/Requestdetails", method = RequestMethod.GET)
	public String showReqPage(ModelMap model) {
		return "Requestdetails";
	}

	@RequestMapping(value = "/Requestdetails", method = RequestMethod.POST)
	public String showReqForm(ModelMap model) {
		return "Requestdetails";
	}
	@RequestMapping(value = "/mappeddetails", method = RequestMethod.GET)
	public String showmapPage(ModelMap model) {
		return "mappeddetails";
	}

	@RequestMapping(value = "/mappeddetails", method = RequestMethod.POST)
	public String showmapForm(ModelMap model) {
		return "mappeddetails";
	}

}
