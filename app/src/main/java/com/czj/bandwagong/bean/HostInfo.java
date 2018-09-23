package com.czj.bandwagong.bean;

import java.io.Serializable;

/**
 * Created by czj on 2018/9/23.
 */
public class HostInfo extends SuperBean implements Serializable {
    private int ssh_port;
    private String node_ip;

    public HostInfo() {
    }

    private String os;

    public int getSsh_port() {
        return ssh_port;
    }

    public void setSsh_port(int ssh_port) {
        this.ssh_port = ssh_port;
    }

    public String getNode_ip() {
        return node_ip;
    }

    public void setNode_ip(String node_ip) {
        this.node_ip = node_ip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getNode_location() {
        return node_location;
    }

    public void setNode_location(String node_location) {
        this.node_location = node_location;
    }

    public int getPlan_max_ipv6s() {
        return plan_max_ipv6s;
    }

    public void setPlan_max_ipv6s(int plan_max_ipv6s) {
        this.plan_max_ipv6s = plan_max_ipv6s;
    }

    public String[] getIp_addresses() {
        return ip_addresses;
    }

    public void setIp_addresses(String[] ip_addresses) {
        this.ip_addresses = ip_addresses;
    }

    public boolean isLocation_ipv6_ready() {
        return location_ipv6_ready;
    }

    public void setLocation_ipv6_ready(boolean location_ipv6_ready) {
        this.location_ipv6_ready = location_ipv6_ready;
    }

    public String getIs_cpu_throttled() {
        return is_cpu_throttled;
    }

    public void setIs_cpu_throttled(String is_cpu_throttled) {
        this.is_cpu_throttled = is_cpu_throttled;
    }

    public long getPlan_ram() {
        return plan_ram;
    }

    public void setPlan_ram(long plan_ram) {
        this.plan_ram = plan_ram;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public long getData_counter() {
        return data_counter;
    }

    public void setData_counter(long data_counter) {
        this.data_counter = data_counter;
    }

    public String getVm_type() {
        return vm_type;
    }

    public void setVm_type(String vm_type) {
        this.vm_type = vm_type;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public HostInfoaVz_quota getVz_quota() {
        return vz_quota;
    }

    public void setVz_quota(HostInfoaVz_quota vz_quota) {
        this.vz_quota = vz_quota;
    }

    public int getData_next_reset() {
        return data_next_reset;
    }

    public void setData_next_reset(int data_next_reset) {
        this.data_next_reset = data_next_reset;
    }

    public HostInfoaVz_status getVz_status() {
        return vz_status;
    }

    public void setVz_status(HostInfoaVz_status vz_status) {
        this.vz_status = vz_status;
    }

    public long getPlan_monthly_data() {
        return plan_monthly_data;
    }

    public void setPlan_monthly_data(long plan_monthly_data) {
        this.plan_monthly_data = plan_monthly_data;
    }

    public double getMonthly_data_multiplier() {
        return monthly_data_multiplier;
    }

    public void setMonthly_data_multiplier(double monthly_data_multiplier) {
        this.monthly_data_multiplier = monthly_data_multiplier;
    }

    public boolean isRdns_api_available() {
        return rdns_api_available;
    }

    public void setRdns_api_available(boolean rdns_api_available) {
        this.rdns_api_available = rdns_api_available;
    }

    public String getNode_alias() {
        return node_alias;
    }

    public void setNode_alias(String node_alias) {
        this.node_alias = node_alias;
    }

    public long getPlan_swap() {
        return plan_swap;
    }

    public void setPlan_swap(long plan_swap) {
        this.plan_swap = plan_swap;
    }

    public long getPlan_disk() {
        return plan_disk;
    }

    public void setPlan_disk(long plan_disk) {
        this.plan_disk = plan_disk;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVe_disk_quota_gb() {
        return ve_disk_quota_gb;
    }

    public void setVe_disk_quota_gb(String ve_disk_quota_gb) {
        this.ve_disk_quota_gb = ve_disk_quota_gb;
    }

    public String getVe_status() {
        return ve_status;
    }

    public void setVe_status(String ve_status) {
        this.ve_status = ve_status;
    }

    public long getVe_used_disk_space_b() {
        return ve_used_disk_space_b;
    }

    public void setVe_used_disk_space_b(long ve_used_disk_space_b) {
        this.ve_used_disk_space_b = ve_used_disk_space_b;
    }

    public String getVe_mac1() {
        return ve_mac1;
    }

    public void setVe_mac1(String ve_mac1) {
        this.ve_mac1 = ve_mac1;
    }

    public String getLoad_average() {
        return load_average;
    }

    public void setLoad_average(String load_average) {
        this.load_average = load_average;
    }

    public long getMem_available_kb() {
        return mem_available_kb;
    }

    public void setMem_available_kb(long mem_available_kb) {
        this.mem_available_kb = mem_available_kb;
    }

    public long getSwap_total_kb() {
        return swap_total_kb;
    }

    public void setSwap_total_kb(long swap_total_kb) {
        this.swap_total_kb = swap_total_kb;
    }

    public long getSwap_available_kb() {
        return swap_available_kb;
    }

    public void setSwap_available_kb(long swap_available_kb) {
        this.swap_available_kb = swap_available_kb;
    }

    private String node_location;
    private int plan_max_ipv6s;
    private String[] ip_addresses;
    private boolean location_ipv6_ready;
    private String is_cpu_throttled;
    private long plan_ram;
    private boolean suspended;
    private long data_counter;
    private String vm_type;
    private String hostname;
    private HostInfoaVz_quota vz_quota;
    private int data_next_reset;
    private HostInfoaVz_status vz_status;
    private long plan_monthly_data;
    private double monthly_data_multiplier = 1.0;
    private boolean rdns_api_available;
    private String node_alias;
    private long plan_swap;
    private long plan_disk;
    private String plan;
    private String email;
    private String password;

    private String ve_disk_quota_gb;
    private String ve_status;
    private long ve_used_disk_space_b;
    private String ve_mac1;
    private String load_average;
    private long mem_available_kb;
    private long swap_total_kb;
    private long swap_available_kb;
}
