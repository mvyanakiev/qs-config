package com.milko.util;

import com.milko.model.ChannelsWrapper;
import com.milko.model.XmlChannelRootDto;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static com.milko.config.Config.INPUT_XML_FILE;
import static com.milko.config.Config.OUTPUT_XML_FILE;

public class XmlUtil {

    public static XmlChannelRootDto readXml() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(XmlChannelRootDto.class);
        return (XmlChannelRootDto) context.createUnmarshaller().unmarshal(new FileReader(INPUT_XML_FILE));
    }

    public static void writeXml(ChannelsWrapper channelsWrapper) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ChannelsWrapper.class);
        context.createMarshaller().marshal(channelsWrapper, new File(OUTPUT_XML_FILE));
    }
}
