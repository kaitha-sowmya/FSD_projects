package com.ecommerce.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FeedbackBean {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int id;
		String feedback;
		public String getFeedback() {
			return feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

			

		}
