package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.TransactionDeltaRepository;
import com.example.domain.transactionDelta;


@RestController
@RequestMapping("/api")
public class TransactionDeltaController {
	
	@Autowired
	private TransactionDeltaRepository td;
	
	
	@GetMapping("/all")
	public String getAll(){
		//List<transactionDelta> hotels= td.findAll();
		return "aaa";
	}
}
