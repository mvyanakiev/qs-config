package com.milko;

import com.milko.model.*;
import com.milko.util.XmlParserImpl;
import com.milko.util.XmlUtil;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static com.milko.config.Config.INPUT_CSV_FILE;
import static com.milko.config.Config.INPUT_XML_FILE;
import static com.milko.util.Convertor.*;
import static com.milko.util.CsvUtil.parseCsvFile;
import static com.milko.util.FileUtil.readFile;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        List<Channel> result = new ArrayList<>();

        XmlChannelRootDto xmlOrdersImportRootDto = XmlUtil.readXml();


        for (XmlChannelDto xmlChannelDto : xmlOrdersImportRootDto.getXmlChannelImportDto()) {
            Channel channel = convertXmlDtoToChannel(xmlChannelDto);
            result.add(channel);
        }

//        System.out.println(createCsvHeader());
//        result.forEach(c -> System.out.println(convertChannelToCsv(c)));

        String csvFile = readFile(INPUT_CSV_FILE);
        List<Channel> channels = parseCsvFile(csvFile);
        ChannelsWrapper channelsWrapper = new ChannelsWrapper();


        List<ChannelToDto> abv = new ArrayList<>();

        for (Channel channel : channels) {
            abv.add(convertChannelToChannelToDto(channel));
        }

        channelsWrapper.setChannel(abv);

        XmlUtil.writeXml(channelsWrapper);

        System.out.println("debug");
    }
}