package com.sushil.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushil.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO doa;

	public PaymentDAO getDoa() {
		return doa;
	}

	public void setDoa(PaymentDAO doa) {
		this.doa = doa;
	}

}
