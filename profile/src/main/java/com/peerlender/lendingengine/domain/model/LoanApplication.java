package com.peerlender.lendingengine.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

@Entity
public final class LoanApplication {

    @Id
    private long id;
    private int amount;
    @ManyToOne
    private Users borrower;
    private int repaymentTermInDays;
    private double interestRate;

    public LoanApplication() {
    }

    public LoanApplication(int amount, Users borrower, int repaymentTermInDays, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTermInDays = repaymentTermInDays;
        this.interestRate = interestRate;
    }

    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public Users getBorrower() {
        return borrower;
    }

    public int getRepaymentTermInDays() { return repaymentTermInDays;}

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanApplication that = (LoanApplication) o;
        return id == that.id && amount == that.amount && Double.compare(that.interestRate, interestRate) == 0 && Objects.equals(borrower, that.borrower) && Objects.equals(repaymentTermInDays, that.repaymentTermInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, borrower, repaymentTermInDays, interestRate);
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "amount=" + amount +
                ", borrower=" + borrower +
                ", repaymentTerm=" + repaymentTermInDays +
                ", interestRate=" + interestRate +
                '}';
    }
}
