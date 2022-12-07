package com.peerlender.lendingengine.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Loan {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Users borrower;
    @ManyToOne
    private Users lender;
    private int amount;
    private double interestRate;
    private LocalDate dateLent;
    private LocalDate dateDue;

    public Loan() {
    }

    public Loan(Users lender, LoanApplication loanApplication){
        this.borrower = loanApplication.getBorrower();
        this.lender = lender;
        this.amount = loanApplication.getAmount();
        this.interestRate = loanApplication.getInterestRate();
        this.dateLent = LocalDate.now();
        this.dateDue = LocalDate.now().plusDays(loanApplication.getRepaymentTermInDays());
    }

    public long getId() {
        return id;
    }

    public Users getBorrower() {
        return borrower;
    }

    public Users getLender() {
        return lender;
    }

    public int getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getDateLent() {
        return dateLent;
    }

    public LocalDate getDateDue() {
        return dateDue;
    }

}
