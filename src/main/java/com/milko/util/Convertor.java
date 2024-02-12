package com.milko.util;

import com.milko.model.Channel;
import com.milko.model.ChannelToDto;
import com.milko.model.XmlChannelDto;

import java.util.Optional;

import static com.milko.config.Config.CSV_SEPARATOR;

public class Convertor {

    public static Channel convertXmlDtoToChannel(XmlChannelDto xmlChannelDto) {
        Channel channel = new Channel();
        channel.setName(xmlChannelDto.getName());
        channel.setChanIndex(xmlChannelDto.getChanIndex());
        channel.setBandWidth(Integer.parseInt(xmlChannelDto.getBandWidth()));
        channel.setTxFreq(Double.parseDouble(xmlChannelDto.getTxFreq().replace(",", ".")));
        channel.setRxFreq(Double.parseDouble(xmlChannelDto.getRxFreq().replace(",", ".")));
        channel.setTxPowerLevel(Integer.parseInt(xmlChannelDto.getTxPowerLevel()));
        channel.setAnaTxCTCFlag(Integer.parseInt(xmlChannelDto.getAnaTxCTCFlag()));
        channel.setAnaRxCTCFlag(Integer.parseInt(xmlChannelDto.getAnaRxCTCFlag()));
        channel.setAnaTxCTCIndex(Integer.parseInt(xmlChannelDto.getAnaTxCTCIndex()));
        channel.setAnaRxCTCIndex(Integer.parseInt(xmlChannelDto.getAnaRxCTCIndex()));
        channel.setFreqStep(Integer.parseInt(xmlChannelDto.getFreqStep()));
        channel.setFreqReverseFlag(Integer.parseInt(xmlChannelDto.getFreqReverseFlag()));
        channel.setEncryptFlag(Integer.parseInt(xmlChannelDto.getEncryptFlag()));
        channel.setBusyNoTx(Integer.parseInt(xmlChannelDto.getBusyNoTx()));
        channel.setPttIdFlag(Integer.parseInt(xmlChannelDto.getPttIdFlag()));
        channel.setDtmfDecode(Integer.parseInt(xmlChannelDto.getDtmfDecode()));
        channel.setAmChanFlag(Integer.parseInt(xmlChannelDto.getAmChanFlag()));

        return channel;
    }

    public static String convertChannelToCsv(Channel channel) {
        StringBuilder sb = new StringBuilder();

        sb
                .append(channel.getName())
                .append(CSV_SEPARATOR)
                .append(channel.getChanIndex())
                .append(CSV_SEPARATOR)
                .append(channel.getBandWidth())
                .append(CSV_SEPARATOR)
                .append(channel.getTxFreq())
                .append(CSV_SEPARATOR)
                .append(channel.getRxFreq())
                .append(CSV_SEPARATOR)
                .append(channel.getTxPowerLevel())
                .append(CSV_SEPARATOR)
                .append(channel.getAnaTxCTCFlag())
                .append(CSV_SEPARATOR)
                .append(channel.getAnaRxCTCFlag())
                .append(CSV_SEPARATOR)
                .append(channel.getAnaTxCTCIndex())
                .append(CSV_SEPARATOR)
                .append(channel.getAnaRxCTCIndex())
                .append(CSV_SEPARATOR)
                .append(channel.getFreqStep())
                .append(CSV_SEPARATOR)
                .append(channel.getFreqReverseFlag())
                .append(CSV_SEPARATOR)
                .append(channel.getEncryptFlag())
                .append(CSV_SEPARATOR)
                .append(channel.getBusyNoTx())
                .append(CSV_SEPARATOR)
                .append(channel.getPttIdFlag())
                .append(CSV_SEPARATOR)
                .append(channel.getDtmfDecode())
                .append(CSV_SEPARATOR)
                .append(channel.getAmChanFlag());

        return sb.toString();
    }

    public static Channel convertCsvLineToChannel(String line) {

        try {
            Channel channel = new Channel();

            String[] tokens = line.split(CSV_SEPARATOR);
            channel.setName(tokens[0]);
            channel.setChanIndex(Integer.parseInt(tokens[1]));
            channel.setBandWidth(Integer.parseInt(tokens[2]));
            channel.setTxFreq(Double.parseDouble(tokens[3]));
            channel.setRxFreq(Double.parseDouble(tokens[4]));
            channel.setTxPowerLevel(Integer.parseInt(tokens[5]));
            channel.setAnaTxCTCFlag(Integer.parseInt(tokens[6]));
            channel.setAnaRxCTCFlag(Integer.parseInt(tokens[7]));
            channel.setAnaTxCTCIndex(Integer.parseInt(tokens[8]));
            channel.setAnaRxCTCIndex(Integer.parseInt(tokens[9]));
            channel.setFreqStep(Integer.parseInt(tokens[10]));
            channel.setFreqReverseFlag(Integer.parseInt(tokens[11]));
            channel.setEncryptFlag(Integer.parseInt(tokens[12]));
            channel.setBusyNoTx(Integer.parseInt(tokens[13]));
            channel.setPttIdFlag(Integer.parseInt(tokens[14]));
            channel.setDtmfDecode(Integer.parseInt(tokens[15]));
            channel.setAmChanFlag(Integer.parseInt(tokens[16]));
            return channel;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ChannelToDto convertChannelToChannelToDto(Channel channel) {
        ChannelToDto channelToDto = new ChannelToDto();

        channelToDto.setName(channel.getName());
        channelToDto.setChanIndex(String.valueOf(channel.getChanIndex()));
        channelToDto.setBandWidth(String.valueOf(channel.getBandWidth()));
        channelToDto.setTxFreq(String.valueOf(channel.getTxFreq()).replace(".", ","));
        channelToDto.setRxFreq(String.valueOf(channel.getRxFreq()).replace(".", ","));
        channelToDto.setTxPowerLevel(channel.getTxPowerLevel());
        channelToDto.setAnaTxCTCFlag(channel.getAnaTxCTCFlag());
        channelToDto.setAnaRxCTCFlag(channel.getAnaRxCTCFlag());
        channelToDto.setAnaTxCTCIndex(channel.getAnaTxCTCIndex());
        channelToDto.setAnaRxCTCIndex(channel.getAnaRxCTCIndex());
        channelToDto.setFreqStep(channel.getFreqStep());
        channelToDto.setFreqReverseFlag(channel.getFreqReverseFlag());
        channelToDto.setEncryptFlag(channel.getEncryptFlag());
        channelToDto.setBusyNoTx(channel.getBusyNoTx());
        channelToDto.setPttIdFlag(channel.getPttIdFlag());
        channelToDto.setDtmfDecode(channel.getDtmfDecode());
        channelToDto.setAmChanFlag(channel.getAmChanFlag());

        return channelToDto;
    }
}
