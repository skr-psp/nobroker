package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerPlanDto {
    private long planId;
    private String planName;
    private double price;
    private int planValidity;
    private boolean relationshipManager;
    private boolean rentalAgreement;
    private boolean propertyPromotion;
    private boolean guaranteedTenants;
    private boolean showingProperty;
    private boolean faceboolMarketingOfProperty;
}
