package com.nobroker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "owner_plan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlan {
    @Id
    private long planId;
    @Column(name= "plan_name",unique = true)
    private String planName;
    @Column(name= "price")
    private double price;
    @Column(name= "plan_validity")
    private int planValidity;
    @Column(name= "relationship_manager")
    private boolean relationshipManager;
    @Column(name= "rental_agreement")
    private boolean rentalAgreement;
    @Column(name= "property_promotion")
    private boolean propertyPromotion;
    @Column(name= "guaranteed_tenants")
    private boolean guaranteedTenants;
    @Column(name= "showin_property")
    private boolean showingProperty;
    @Column(name= "facebool_marketing_of_property")
    private boolean faceboolMarketingOfProperty;
}
