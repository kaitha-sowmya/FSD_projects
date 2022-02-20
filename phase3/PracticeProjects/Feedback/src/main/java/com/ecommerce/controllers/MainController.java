package com.ecommerce.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bean.FeedbackBean;
import com.ecommerce.dao.FeedbackDAO;


@RestController
public class MainController {
	@Autowired
	   FeedbackDAO dao;
	    
	@PostMapping("insert")
	public FeedbackBean insert(@RequestBody FeedbackBean fb) {
	    return dao.insert(fb);
	}
	}

