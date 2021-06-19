package com.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jwt.model.ProductModel;

@Controller
@RequestMapping(value = "products")
public class ProductController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		ProductModel productModel = new ProductModel();
		modelMap.put("products", productModel.findAll());
		return "product/index";
	}
}
