package com.milko.model;

public class Channel {

    private String name;
    private int chanIndex;
    private int bandWidth;
    private double txFreq;
    private double rxFreq;
    private int txPowerLevel;
    private int anaTxCTCFlag;
    private int anaRxCTCFlag;
    private int anaTxCTCIndex;
    private int anaRxCTCIndex;
    private int freqStep;
    private int freqReverseFlag;
    private int encryptFlag;
    private int busyNoTx;
    private int pttIdFlag;
    private int dtmfDecode;
    private int amChanFlag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChanIndex() {
        return chanIndex;
    }

    public void setChanIndex(int chanIndex) {
        this.chanIndex = chanIndex;
    }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth = bandWidth;
    }

    public double getTxFreq() {
        return txFreq;
    }

    public void setTxFreq(double txFreq) {
        this.txFreq = txFreq;
    }

    public double getRxFreq() {
        return rxFreq;
    }

    public void setRxFreq(double rxFreq) {
        this.rxFreq = rxFreq;
    }

    public int getTxPowerLevel() {
        return txPowerLevel;
    }

    public void setTxPowerLevel(int txPowerLevel) {
        this.txPowerLevel = txPowerLevel;
    }

    public int getAnaTxCTCFlag() {
        return anaTxCTCFlag;
    }

    public void setAnaTxCTCFlag(int anaTxCTCFlag) {
        this.anaTxCTCFlag = anaTxCTCFlag;
    }

    public int getAnaRxCTCFlag() {
        return anaRxCTCFlag;
    }

    public void setAnaRxCTCFlag(int anaRxCTCFlag) {
        this.anaRxCTCFlag = anaRxCTCFlag;
    }

    public int getAnaTxCTCIndex() {
        return anaTxCTCIndex;
    }

    public void setAnaTxCTCIndex(int anaTxCTCIndex) {
        this.anaTxCTCIndex = anaTxCTCIndex;
    }

    public int getAnaRxCTCIndex() {
        return anaRxCTCIndex;
    }

    public void setAnaRxCTCIndex(int anaRxCTCIndex) {
        this.anaRxCTCIndex = anaRxCTCIndex;
    }

    public int getFreqStep() {
        return freqStep;
    }

    public void setFreqStep(int freqStep) {
        this.freqStep = freqStep;
    }

    public int getFreqReverseFlag() {
        return freqReverseFlag;
    }

    public void setFreqReverseFlag(int freqReverseFlag) {
        this.freqReverseFlag = freqReverseFlag;
    }

    public int getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(int encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public int getBusyNoTx() {
        return busyNoTx;
    }

    public void setBusyNoTx(int busyNoTx) {
        this.busyNoTx = busyNoTx;
    }

    public int getPttIdFlag() {
        return pttIdFlag;
    }

    public void setPttIdFlag(int pttIdFlag) {
        this.pttIdFlag = pttIdFlag;
    }

    public int getDtmfDecode() {
        return dtmfDecode;
    }

    public void setDtmfDecode(int dtmfDecode) {
        this.dtmfDecode = dtmfDecode;
    }

    public int getAmChanFlag() {
        return amChanFlag;
    }

    public void setAmChanFlag(int amChanFlag) {
        this.amChanFlag = amChanFlag;
    }
}

