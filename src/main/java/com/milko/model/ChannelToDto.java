package com.milko.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import static com.milko.config.Config.*;

@XmlRootElement(name = "Channel")
@XmlType(propOrder = { "name","chanIndex","bandWidth","txFreq","rxFreq","txPowerLevel","anaTxCTCFlag","anaRxCTCFlag","anaTxCTCIndex","anaRxCTCIndex","freqStep","freqReverseFlag","encryptFlag","busyNoTx","pttIdFlag","dtmfDecode","amChanFlag" })
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

    @XmlAttribute(name = NAME)
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

    @XmlElement(name = BAND_WIDTH)
    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getTxFreq() {
        return txFreq;
    }

    @XmlElement(name = TX_FREQ)
    public void setTxFreq(String txFreq) {
        this.txFreq = txFreq;
    }

    public String getRxFreq() {
        return rxFreq;
    }

    @XmlElement(name = RX_FREQ)
    public void setRxFreq(String rxFreq) {
        this.rxFreq = rxFreq;
    }

    public int getTxPowerLevel() {
        return txPowerLevel;
    }

    @XmlElement(name = TX_POWER_LEVEL)
    public void setTxPowerLevel(int txPowerLevel) {
        this.txPowerLevel = txPowerLevel;
    }

    public int getAnaTxCTCFlag() {
        return anaTxCTCFlag;
    }

    @XmlElement(name = ANA_TX_CTC_FLAG)
    public void setAnaTxCTCFlag(int anaTxCTCFlag) {
        this.anaTxCTCFlag = anaTxCTCFlag;
    }

    public int getAnaRxCTCFlag() {
        return anaRxCTCFlag;
    }

    @XmlElement(name = ANA_RX_CTC_FLAG)
    public void setAnaRxCTCFlag(int anaRxCTCFlag) {
        this.anaRxCTCFlag = anaRxCTCFlag;
    }

    public int getAnaTxCTCIndex() {
        return anaTxCTCIndex;
    }

    @XmlElement(name = ANA_TX_CTC_INDEX)
    public void setAnaTxCTCIndex(int anaTxCTCIndex) {
        this.anaTxCTCIndex = anaTxCTCIndex;
    }

    public int getAnaRxCTCIndex() {
        return anaRxCTCIndex;
    }

    @XmlElement(name = ANA_RX_CTC_INDEX)
    public void setAnaRxCTCIndex(int anaRxCTCIndex) {
        this.anaRxCTCIndex = anaRxCTCIndex;
    }

    public int getFreqStep() {
        return freqStep;
    }

    @XmlElement(name = FREQ_STEP)
    public void setFreqStep(int freqStep) {
        this.freqStep = freqStep;
    }

    public int getFreqReverseFlag() {
        return freqReverseFlag;
    }

    @XmlElement(name = FREQ_REVERSE_FLAG)
    public void setFreqReverseFlag(int freqReverseFlag) {
        this.freqReverseFlag = freqReverseFlag;
    }

    public int getEncryptFlag() {
        return encryptFlag;
    }

    @XmlElement(name = ENCRYPT_FLAG)
    public void setEncryptFlag(int encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public int getBusyNoTx() {
        return busyNoTx;
    }

    @XmlElement(name = BUSY_NO_TX)
    public void setBusyNoTx(int busyNoTx) {
        this.busyNoTx = busyNoTx;
    }

    public int getPttIdFlag() {
        return pttIdFlag;
    }

    @XmlElement(name = PTT_ID_FLAG)
    public void setPttIdFlag(int pttIdFlag) {
        this.pttIdFlag = pttIdFlag;
    }

    public int getDtmfDecode() {
        return dtmfDecode;
    }

    @XmlElement(name = DTMF_DECODE)
    public void setDtmfDecode(int dtmfDecode) {
        this.dtmfDecode = dtmfDecode;
    }

    public int getAmChanFlag() {
        return amChanFlag;
    }

    @XmlElement(name = AM_CHAN_FLAG)
    public void setAmChanFlag(int amChanFlag) {
        this.amChanFlag = amChanFlag;
    }
}

