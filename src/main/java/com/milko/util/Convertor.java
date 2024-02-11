package com.milko.util;

import com.milko.model.Channel;
import com.milko.model.ChannelToDto;
import com.milko.model.XmlChannelDto;

import static com.milko.config.Config.CSV_SEPARATOR;

public class Convertor {

    public static Channel convertXmlDtoToChannel(XmlChannelDto xmlChannelDto) {
        Channel channel = new Channel();
        channel.setName(xmlChannelDto.getName());
        channel.setChanIndex(xmlChannelDto.getChanIndex());
        channel.setBandWidth(Integer.parseInt(xmlChannelDto.getBandWidth()));
        channel.setRxFreq(Double.parseDouble(xmlChannelDto.getRxFreq().replace(",", ".")));
        channel.setTxFreq(Double.parseDouble(xmlChannelDto.getTxFreq().replace(",", ".")));

        return channel;
    }

    public static String convertChannelToCsv(Channel channel) {
        StringBuilder sb = new StringBuilder();

        sb
                .append(channel.getChanIndex())
                .append(CSV_SEPARATOR)
                .append(channel.getName())
                .append(CSV_SEPARATOR)
                .append(channel.getBandWidth())
                .append(CSV_SEPARATOR)
                .append(channel.getTxFreq())
                .append(CSV_SEPARATOR)
                .append(channel.getRxFreq());

        return sb.toString();
    }

    public static Channel convertCsvLineToChannel(String line) {

        Channel channel = new Channel();

        String[] tokens = line.split(CSV_SEPARATOR);
        channel.setName(tokens[1]);
        channel.setChanIndex(Integer.parseInt(tokens[0]));
        channel.setBandWidth(Integer.parseInt(tokens[2]));
        channel.setTxFreq(Double.parseDouble(tokens[3]));
        channel.setRxFreq(Double.parseDouble(tokens[4]));

        return channel;
    }

    public static XmlChannelDto convertChannelToXmlChannelDto(Channel channel) {
        XmlChannelDto xmlChannelDto = new XmlChannelDto();

        xmlChannelDto.setName(channel.getName());
        xmlChannelDto.setChanIndex(channel.getChanIndex());
        xmlChannelDto.setRxFreq(String.valueOf(channel.getRxFreq()));
        xmlChannelDto.setTxFreq(String.valueOf(channel.getTxFreq()));

        return xmlChannelDto;
    }

    public static ChannelToDto convertChannelToChannelToDto(Channel channel) {
        ChannelToDto channelToDto = new ChannelToDto();

        channelToDto.setName(channel.getName());
        channelToDto.setChanIndex(String.valueOf(channel.getChanIndex()));
        channelToDto.setRxFreq(String.valueOf(channel.getRxFreq()).replace(".", ","));
        channelToDto.setTxFreq(String.valueOf(channel.getTxFreq()).replace(".", ","));

        return channelToDto;
    }




}
