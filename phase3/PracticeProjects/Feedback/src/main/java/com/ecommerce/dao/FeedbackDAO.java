package com.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Repository.FeedbackRepo;
import com.ecommerce.bean.FeedbackBean;


@Service
public class FeedbackDAO {
    @Autowired
    FeedbackRepo srepo;
    
public FeedbackBean insert(FeedbackBean fb) {
    return srepo.save(fb);
}
}
