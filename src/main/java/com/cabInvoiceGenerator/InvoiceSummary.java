package com.cabInvoiceGenerator;

import java.util.Objects;

public class InvoiceSummary {
    private final int noOfRides;
    private final double totalFare;
    private final double averageFair;

    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageFair = this.totalFare/this.noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.averageFair, averageFair) == 0;
    }

}
