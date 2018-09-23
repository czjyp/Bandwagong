package com.czj.bandwagong.bean;

import java.io.Serializable;

/**
 * Created by czj on 2018/9/23.
 */
class HostInfoaVz_quota extends SuperBean implements Serializable{
    private String softlimit_kb;
    private String softlimit_inodes;

    public HostInfoaVz_quota() {
    }

    public HostInfoaVz_quota(String softlimit_kb, String softlimit_inodes, String hardlimit_inodes, String hardlimit_kb, String occupied_inodes, String occupied_kb) {
        this.softlimit_kb = softlimit_kb;
        this.softlimit_inodes = softlimit_inodes;
        this.hardlimit_inodes = hardlimit_inodes;
        this.hardlimit_kb = hardlimit_kb;
        this.occupied_inodes = occupied_inodes;
        this.occupied_kb = occupied_kb;
    }

    public String getSoftlimit_kb() {
        return softlimit_kb;
    }

    public void setSoftlimit_kb(String softlimit_kb) {
        this.softlimit_kb = softlimit_kb;
    }

    public String getSoftlimit_inodes() {
        return softlimit_inodes;
    }

    public void setSoftlimit_inodes(String softlimit_inodes) {
        this.softlimit_inodes = softlimit_inodes;
    }

    public String getHardlimit_inodes() {
        return hardlimit_inodes;
    }

    public void setHardlimit_inodes(String hardlimit_inodes) {
        this.hardlimit_inodes = hardlimit_inodes;
    }

    public String getHardlimit_kb() {
        return hardlimit_kb;
    }

    public void setHardlimit_kb(String hardlimit_kb) {
        this.hardlimit_kb = hardlimit_kb;
    }

    public String getOccupied_inodes() {
        return occupied_inodes;
    }

    public void setOccupied_inodes(String occupied_inodes) {
        this.occupied_inodes = occupied_inodes;
    }

    public String getOccupied_kb() {
        return occupied_kb;
    }

    public void setOccupied_kb(String occupied_kb) {
        this.occupied_kb = occupied_kb;
    }

    private String hardlimit_inodes;
    private String hardlimit_kb;
    private String occupied_inodes;
    private String occupied_kb;

}
