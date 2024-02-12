package com.milko.model;

import javax.xml.bind.annotation.*;

import static com.milko.config.Config.*;

@XmlRootElement(name = ELEMENT_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlChannelDto {

    @XmlAttribute(name = NAME)
    private String name;

    @XmlAttribute(name = CHAN_INDEX)
    private int chanIndex;

    @XmlElement(name = BAND_WIDTH)
    private String bandWidth;

    @XmlElement(name = TX_FREQ)
    private String txFreq;

    @XmlElement(name = RX_FREQ)
    private String rxFreq;

    @XmlElement(name = TX_POWER_LEVEL)
    private String txPowerLevel;

    @XmlElement(name = ANA_TX_CTC_FLAG)
    private String anaTxCTCFlag;

    @XmlElement(name = ANA_RX_CTC_FLAG)
    private String anaRxCTCFlag;

    @XmlElement(name = ANA_TX_CTC_INDEX)
    private String anaTxCTCIndex;

    @XmlElement(name = ANA_RX_CTC_INDEX)
    private String anaRxCTCIndex;

    @XmlElement(name = FREQ_STEP)
    private String freqStep;

    @XmlElement(name = FREQ_REVERSE_FLAG)
    private String freqReverseFlag;

    @XmlElement(name = ENCRYPT_FLAG)
    private String encryptFlag;

    @XmlElement(name = BUSY_NO_TX)
    private String busyNoTx;

    @XmlElement(name = PTT_ID_FLAG)
    private String pttIdFlag;

    @XmlElement(name = DTMF_DECODE)
    private String dtmfDecode;

    @XmlElement(name = AM_CHAN_FLAG)
    private String amChanFlag;

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

    public String getTxPowerLevel() {
        return txPowerLevel;
    }

    public void setTxPowerLevel(String txPowerLevel) {
        this.txPowerLevel = txPowerLevel;
    }

    public String getAnaTxCTCFlag() {
        return anaTxCTCFlag;
    }

    public void setAnaTxCTCFlag(String anaTxCTCFlag) {
        this.anaTxCTCFlag = anaTxCTCFlag;
    }

    public String getAnaRxCTCFlag() {
        return anaRxCTCFlag;
    }

    public void setAnaRxCTCFlag(String anaRxCTCFlag) {
        this.anaRxCTCFlag = anaRxCTCFlag;
    }

    public String getAnaTxCTCIndex() {
        return anaTxCTCIndex;
    }

    public void setAnaTxCTCIndex(String anaTxCTCIndex) {
        this.anaTxCTCIndex = anaTxCTCIndex;
    }

    public String getAnaRxCTCIndex() {
        return anaRxCTCIndex;
    }

    public void setAnaRxCTCIndex(String anaRxCTCIndex) {
        this.anaRxCTCIndex = anaRxCTCIndex;
    }

    public String getFreqStep() {
        return freqStep;
    }

    public void setFreqStep(String freqStep) {
        this.freqStep = freqStep;
    }

    public String getFreqReverseFlag() {
        return freqReverseFlag;
    }

    public void setFreqReverseFlag(String freqReverseFlag) {
        this.freqReverseFlag = freqReverseFlag;
    }

    public String getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(String encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public String getBusyNoTx() {
        return busyNoTx;
    }

    public void setBusyNoTx(String busyNoTx) {
        this.busyNoTx = busyNoTx;
    }

    public String getPttIdFlag() {
        return pttIdFlag;
    }

    public void setPttIdFlag(String pttIdFlag) {
        this.pttIdFlag = pttIdFlag;
    }

    public String getDtmfDecode() {
        return dtmfDecode;
    }

    public void setDtmfDecode(String dtmfDecode) {
        this.dtmfDecode = dtmfDecode;
    }

    public String getAmChanFlag() {
        return amChanFlag;
    }

    public void setAmChanFlag(String amChanFlag) {
        this.amChanFlag = amChanFlag;
    }
}
