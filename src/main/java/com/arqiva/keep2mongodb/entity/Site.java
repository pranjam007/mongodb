package com.arqiva.keep2mongodb.entity;

import java.util.List;

/**
 * Created by pranjal.mathur on 31/08/2016.
 */
public class Site {

    private Long siteId;
    private String siteName;
    private String agentName;
    private String tenantName;
    private String ownerName;
    private String planningAuthority;
    private List<Long> planningReference;

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPlanningAuthority() {
        return planningAuthority;
    }

    public void setPlanningAuthority(String planningAuthority) {
        this.planningAuthority = planningAuthority;
    }

    public List<Long> getPlanningReference() {
        return planningReference;
    }

    public void setPlanningReference(List<Long> planningReference) {
        this.planningReference = planningReference;
    }
}
