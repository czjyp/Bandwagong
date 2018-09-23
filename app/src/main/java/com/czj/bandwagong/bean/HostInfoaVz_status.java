package com.czj.bandwagong.bean;

import java.io.Serializable;

/**
 * Created by czj on 2018/9/23.
 */
class HostInfoaVz_status extends SuperBean implements Serializable{
    private String physpages;
    private String nproc_b;
    private String physpages_l;
    private String numfile_b;
    private String nproc;

    public HostInfoaVz_status(String physpages, String nproc_b, String physpages_l, String numfile_b, String nproc, String numfile, String numtcpsock, String privvmpages, String swappages, String hostname, String load_average, String swappages_b, String oomguarpages_b, String numtcpsock_b, String oomguarpages, String privvmpages_b, String status, String kmemsize, String kmemsize_b) {
        this.physpages = physpages;
        this.nproc_b = nproc_b;
        this.physpages_l = physpages_l;
        this.numfile_b = numfile_b;
        this.nproc = nproc;
        this.numfile = numfile;
        this.numtcpsock = numtcpsock;
        this.privvmpages = privvmpages;
        this.swappages = swappages;
        this.hostname = hostname;
        this.load_average = load_average;
        this.swappages_b = swappages_b;
        this.oomguarpages_b = oomguarpages_b;
        this.numtcpsock_b = numtcpsock_b;
        this.oomguarpages = oomguarpages;
        this.privvmpages_b = privvmpages_b;
        this.status = status;
        this.kmemsize = kmemsize;
        this.kmemsize_b = kmemsize_b;
    }

    public HostInfoaVz_status() {

    }

    public String getPhyspages() {

        return physpages;
    }

    public void setPhyspages(String physpages) {
        this.physpages = physpages;
    }

    public String getNproc_b() {
        return nproc_b;
    }

    public void setNproc_b(String nproc_b) {
        this.nproc_b = nproc_b;
    }

    public String getPhyspages_l() {
        return physpages_l;
    }

    public void setPhyspages_l(String physpages_l) {
        this.physpages_l = physpages_l;
    }

    public String getNumfile_b() {
        return numfile_b;
    }

    public void setNumfile_b(String numfile_b) {
        this.numfile_b = numfile_b;
    }

    public String getNproc() {
        return nproc;
    }

    public void setNproc(String nproc) {
        this.nproc = nproc;
    }

    public String getNumfile() {
        return numfile;
    }

    public void setNumfile(String numfile) {
        this.numfile = numfile;
    }

    public String getNumtcpsock() {
        return numtcpsock;
    }

    public void setNumtcpsock(String numtcpsock) {
        this.numtcpsock = numtcpsock;
    }

    public String getPrivvmpages() {
        return privvmpages;
    }

    public void setPrivvmpages(String privvmpages) {
        this.privvmpages = privvmpages;
    }

    public String getSwappages() {
        return swappages;
    }

    public void setSwappages(String swappages) {
        this.swappages = swappages;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getLoad_average() {
        return load_average;
    }

    public void setLoad_average(String load_average) {
        this.load_average = load_average;
    }

    public String getSwappages_b() {
        return swappages_b;
    }

    public void setSwappages_b(String swappages_b) {
        this.swappages_b = swappages_b;
    }

    public String getOomguarpages_b() {
        return oomguarpages_b;
    }

    public void setOomguarpages_b(String oomguarpages_b) {
        this.oomguarpages_b = oomguarpages_b;
    }

    public String getNumtcpsock_b() {
        return numtcpsock_b;
    }

    public void setNumtcpsock_b(String numtcpsock_b) {
        this.numtcpsock_b = numtcpsock_b;
    }

    public String getOomguarpages() {
        return oomguarpages;
    }

    public void setOomguarpages(String oomguarpages) {
        this.oomguarpages = oomguarpages;
    }

    public String getPrivvmpages_b() {
        return privvmpages_b;
    }

    public void setPrivvmpages_b(String privvmpages_b) {
        this.privvmpages_b = privvmpages_b;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKmemsize() {
        return kmemsize;
    }

    public void setKmemsize(String kmemsize) {
        this.kmemsize = kmemsize;
    }

    public String getKmemsize_b() {
        return kmemsize_b;
    }

    public void setKmemsize_b(String kmemsize_b) {
        this.kmemsize_b = kmemsize_b;
    }

    private String numfile;
    private String numtcpsock;
    private String privvmpages;
    private String swappages;
    private String hostname;
    private String load_average;
    private String swappages_b;
    private String oomguarpages_b;
    private String numtcpsock_b;
    private String oomguarpages;
    private String privvmpages_b;
    private String status;
    private String kmemsize;
    private String kmemsize_b;
}
