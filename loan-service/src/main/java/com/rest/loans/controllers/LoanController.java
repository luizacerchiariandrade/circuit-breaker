package com.rest.loans.controllers;

import com.rest.loans.entities.Loan;
import com.rest.loans.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping(path = "/loans-circuit")
    public ResponseEntity<List<Loan>> getLoansByTypeCircuit(@RequestParam("type") String type) {
        return ResponseEntity.ok().body(loanService.getAllLoansByTypeCircuitBreaker(type.toUpperCase()));
    }

    @GetMapping(path = "/loans-retry")
    public ResponseEntity<List<Loan>> getLoansByTypeRetry(@RequestParam("type") String type) {
        return ResponseEntity.ok().body(loanService.getAllLoansByTypeRetry(type.toUpperCase()));
    }

}
