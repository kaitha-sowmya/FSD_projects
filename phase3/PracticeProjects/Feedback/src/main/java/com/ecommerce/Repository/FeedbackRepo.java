package com.ecommerce.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bean.FeedbackBean;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackBean, Integer> {
	
	}

