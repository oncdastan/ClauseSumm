package com.oncdastan.clausesumm.model.dto;

import java.util.ArrayList;
import java.util.List;

// TODO: Refactor to dynamic schema after building and testing the engine
public class DocumentSummary {

    private String landlordName;
    private String tenantName;
    private String propertyAddress;
    private Integer leaseTermMonths;
    private String leaseStartDate;
    private String leaseEndDate;
    private Double yearOneMonthlyRent;
    private Double lateFeePercentage;
    private List<String> landlordPaidUtilities = new ArrayList<>();

    // First in wins, preserves existing while merging the data from fragments
    public void merge(DocumentFragment fragment) {
        if (fragment.landlordName() != null && this.landlordName == null) {
            this.landlordName = fragment.landlordName();
        }
        if (fragment.tenantName() != null && this.tenantName == null) {
            this.tenantName = fragment.tenantName();
        }
        if (fragment.propertyAddress() != null && this.propertyAddress == null) {
            this.propertyAddress = fragment.propertyAddress();
        }
        if (fragment.leaseTermMonths() != null && this.leaseTermMonths == null) {
            this.leaseTermMonths = fragment.leaseTermMonths();
        }
        if (fragment.leaseStartDate() != null && this.leaseStartDate == null) {
            this.leaseStartDate = fragment.leaseStartDate();
        }
        if (fragment.leaseEndDate() != null && this.leaseEndDate == null) {
            this.leaseEndDate = fragment.leaseEndDate();
        }
        if (fragment.yearOneMonthlyRent() != null && this.yearOneMonthlyRent == null) {
            this.yearOneMonthlyRent = fragment.yearOneMonthlyRent();
        }
        if (fragment.lateFeePercentage() != null && this.lateFeePercentage == null) {
            this.lateFeePercentage = fragment.lateFeePercentage();
        }

        // Prevents duplicate utilities across multiple chunks
        if (fragment.landlordPaidUtilities() != null && !fragment.landlordPaidUtilities().isEmpty()) {
            for (String utility : fragment.landlordPaidUtilities()) {
                if (!this.landlordPaidUtilities.contains(utility)) {
                    this.landlordPaidUtilities.add(utility);
                }
            }
        }
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public Integer getLeaseTermMonths() {
        return leaseTermMonths;
    }

    public void setLeaseTermMonths(Integer leaseTermMonths) {
        this.leaseTermMonths = leaseTermMonths;
    }

    public String getLeaseStartDate() {
        return leaseStartDate;
    }

    public void setLeaseStartDate(String leaseStartDate) {
        this.leaseStartDate = leaseStartDate;
    }

    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(String leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public Double getYearOneMonthlyRent() {
        return yearOneMonthlyRent;
    }

    public void setYearOneMonthlyRent(Double yearOneMonthlyRent) {
        this.yearOneMonthlyRent = yearOneMonthlyRent;
    }

    public Double getLateFeePercentage() {
        return lateFeePercentage;
    }

    public void setLateFeePercentage(Double lateFeePercentage) {
        this.lateFeePercentage = lateFeePercentage;
    }

    public List<String> getLandlordPaidUtilities() {
        return landlordPaidUtilities;
    }

    public void setLandlordPaidUtilities(List<String> landlordPaidUtilities) {
        this.landlordPaidUtilities = landlordPaidUtilities;
    }
}