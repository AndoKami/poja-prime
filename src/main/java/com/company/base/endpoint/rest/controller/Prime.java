package com.company.base.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

@RestController
@RequestMapping("/Prime")
public class Prime {
    @GetMapping
    public String getPrime() {
        BigInteger probablePrime = BigInteger.probablePrime(10000, new Random());
        return probablePrime.toString();
    }
}