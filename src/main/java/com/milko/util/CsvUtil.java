package com.milko.util;

import com.milko.model.Channel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.milko.config.Config.*;
import static com.milko.util.Convertor.convertCsvLineToChannel;

public class CsvUtil {

    public static String createCsvHeader() {
        StringBuilder header = new StringBuilder();
        header
                .append(NAME)
                .append(CSV_SEPARATOR)
                .append(CHAN_INDEX)
                .append(CSV_SEPARATOR)
                .append(BAND_WIDTH)
                .append(CSV_SEPARATOR)
                .append(TX_FREQ)
                .append(CSV_SEPARATOR)
                .append(RX_FREQ)
                .append(CSV_SEPARATOR)
                .append(TX_POWER_LEVEL)
                .append(CSV_SEPARATOR)
                .append(ANA_TX_CTC_FLAG)
                .append(CSV_SEPARATOR)
                .append(ANA_RX_CTC_FLAG)
                .append(CSV_SEPARATOR)
                .append(ANA_TX_CTC_INDEX)
                .append(CSV_SEPARATOR)
                .append(ANA_RX_CTC_INDEX)
                .append(CSV_SEPARATOR)
                .append(FREQ_STEP)
                .append(CSV_SEPARATOR)
                .append(FREQ_REVERSE_FLAG)
                .append(CSV_SEPARATOR)
                .append(ENCRYPT_FLAG)
                .append(CSV_SEPARATOR)
                .append(BUSY_NO_TX)
                .append(CSV_SEPARATOR)
                .append(PTT_ID_FLAG)
                .append(CSV_SEPARATOR)
                .append(DTMF_DECODE)
                .append(CSV_SEPARATOR)
                .append(AM_CHAN_FLAG);

        return header.toString();
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


    public static List<Channel> parseCsvFile(String csvFile) {
        List<Channel> result = new ArrayList<>();

        Scanner scanner = new Scanner(csvFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("Name")) {
                continue;
            }

            Channel channel = convertCsvLineToChannel(line);
            result.add(channel);
        }
        scanner.close();

        return result;
    }
}
