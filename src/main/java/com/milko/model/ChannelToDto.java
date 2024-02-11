package com.milko.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Channel")
//@XmlType(propOrder = { "name", "chanIndex", "bandWidth", "txFreq", "rxFreq" }) // TODO fix order
public class ChannelToDto {

    private String name;
    private String chanIndex;
    private String bandWidth;
    private String txFreq;
    private String rxFreq;
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

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public String getChanIndex() {
        return chanIndex;
    }

    public void setChanIndex(String chanIndex) {
        this.chanIndex = chanIndex;
    }

    public String getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getTxFreq() {
        return txFreq;
    }

    public void setTxFreq(String txFreq) {
        this.txFreq = txFreq;
    }

    public String getRxFreq() {
        return rxFreq;
    }

    public void setRxFreq(String rxFreq) {
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

