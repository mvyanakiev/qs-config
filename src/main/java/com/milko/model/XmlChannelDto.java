package com.milko.model;

import javax.xml.bind.annotation.*;

import static com.milko.config.Config.*;

@XmlRootElement(name = ELEMENT_NAME)
//@XmlType(propOrder = { "name", "chanIndex", "bandWidth", "txFreq", "rxFreq" })
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

    //    @XmlElement(name = "TxPowerLevel")
//    public int getTxPowerLevel() {
//        return txPowerLevel;
//    }
//
//    @XmlElement(name = "AnaTxCTCFlag")
//    public int getAnaTxCTCFlag() {
//        return anaTxCTCFlag;
//    }
//
//    @XmlElement(name = "AnaRxCTCFlag")
//    public int getAnaRxCTCFlag() {
//        return anaRxCTCFlag;
//    }
//
//    @XmlElement(name = "AnaTxCTCIndex")
//    public int getAnaTxCTCIndex() {
//        return anaTxCTCIndex;
//    }
//
//    @XmlElement(name = "AnaRxCTCIndex")
//    public int getAnaRxCTCIndex() {
//        return anaRxCTCIndex;
//    }
//
//    @XmlElement(name = "FreqStep")
//    public int getFreqStep() {
//        return freqStep;
//    }
//
//    @XmlElement(name = "FreqReverseFlag")
//    public int getFreqReverseFlag() {
//        return freqReverseFlag;
//    }
//
//    @XmlElement(name = "EncryptFlag")
//    public int getEncryptFlag() {
//        return encryptFlag;
//    }
//
//    @XmlElement(name = "BusyNoTx")
//    public int getBusyNoTx() {
//        return busyNoTx;
//    }
//
//    @XmlElement(name = "PTTIdFlag")
//    public int getPttIdFlag() {
//        return pttIdFlag;
//    }
//
//    @XmlElement(name = "DTMFDecode")
//    public int getDtmfDecode() {
//        return dtmfDecode;
//    }
//
//    @XmlElement(name = "AMChanFlag")
//    public int getAmChanFlag() {
//        return amChanFlag;
//    }

}
