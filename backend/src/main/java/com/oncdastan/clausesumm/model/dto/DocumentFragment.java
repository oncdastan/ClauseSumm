package com.oncdastan.clausesumm.model.dto;

import java.util.List;

// TODO: Refactor to dynamic schema after building and testing the engine
public record DocumentFragment(
                String landlordName,
                String tenantName,
                String propertyAddress,
                Integer leaseTermMonths,
                String leaseStartDate,
                String leaseEndDate,
                Double yearOneMonthlyRent,
                Double lateFeePercentage,
                List<String> landlordPaidUtilities) {
}
