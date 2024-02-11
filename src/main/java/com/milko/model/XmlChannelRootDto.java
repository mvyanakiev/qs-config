package com.milko.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static com.milko.config.Config.ELEMENT_NAME;
import static com.milko.config.Config.ROOT_NAME;

@XmlRootElement(name = ROOT_NAME)
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlChannelRootDto {

    @XmlElement(name = ELEMENT_NAME)
    private XmlChannelDto[] xmlChannelDto;

    public XmlChannelRootDto() {}

    public XmlChannelDto[] getXmlChannelImportDto() {
        return xmlChannelDto;
    }

    public void setXmlChannelImportDto(XmlChannelDto[] xmlChannelDto) {
        this.xmlChannelDto = xmlChannelDto;
    }
}

