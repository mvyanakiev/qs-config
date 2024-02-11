package com.milko.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import static com.milko.config.Config.ELEMENT_NAME;
import static com.milko.config.Config.ROOT_NAME;

@XmlRootElement(name = ROOT_NAME)
public class ChannelsWrapper {

    private List<ChannelToDto> channel;

    @XmlElement(name = ELEMENT_NAME)
    public List<ChannelToDto> getChannel() {
        return channel;
    }

    public void setChannel(List<ChannelToDto> channel) {
        this.channel = channel;
    }
}
