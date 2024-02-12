package com.milko;

import com.milko.model.*;
import com.milko.util.XmlUtil;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.milko.config.Config.INPUT_CSV_FILE;
import static com.milko.util.Convertor.*;
import static com.milko.util.CsvUtil.createCsvHeader;
import static com.milko.util.CsvUtil.parseCsvFile;
import static com.milko.util.FileUtil.readFile;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        List<Channel> result = new ArrayList<>();
//        XmlChannelRootDto xmlOrdersImportRootDto = XmlUtil.readXml();
//
//        for (XmlChannelDto xmlChannelDto : xmlOrdersImportRootDto.getXmlChannelImportDto()) {
//            Channel channel = convertXmlDtoToChannel(xmlChannelDto);
//            result.add(channel);
//        }
//
        System.out.println(createCsvHeader());
//        result.forEach(c -> System.out.println(convertChannelToCsv(c)));

        String csvFile = readFile(INPUT_CSV_FILE);
        List<Channel> channels = parseCsvFile(csvFile);
        channels.forEach(c -> System.out.println(convertChannelToCsv(c)));


        ChannelsWrapper channelsWrapper = new ChannelsWrapper();
        List<ChannelToDto> channelsDto = new ArrayList<>();

        for (Channel channel : channels) {
            channelsDto.add(convertChannelToChannelToDto(channel));
        }

        channelsWrapper.setChannel(channelsDto);

        XmlUtil.writeXml(channelsWrapper);

        System.out.println("debug");
    }
}