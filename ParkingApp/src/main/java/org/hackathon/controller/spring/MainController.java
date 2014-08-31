package org.hackathon.controller.spring;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hackathon.constants.AppConstants;
import org.hackathon.model.bean.Product;
import org.hackathon.model.bean.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	private static final Logger LOG = Logger.getLogger(MainController.class);

	@RequestMapping(value = "/main")
	public String mainPage(HttpServletRequest request, Model model,
			ModelMap modelMap) {

		HttpSession session = request.getSession(false);

		return AppConstants.MAIN_PAGE;
	}

	@RequestMapping(value = "/{category}")
	public String booksPage(@PathVariable("category") String category,
			HttpServletRequest request, Model model, ModelMap modelMap) {

		
		

		return AppConstants.MAIN_PAGE;

	}

	@RequestMapping(value = "/{category}/{itemName}")
	public String bookNamedPage(@PathVariable("itemName") String itemName,
			@PathVariable("category") String category,
			HttpServletRequest request, Model model, ModelMap modelMap) {

			
			return AppConstants.SEARCH_PRODUCT_PAGE;

	}

}
