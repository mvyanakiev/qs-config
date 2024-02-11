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
                .append(CHAN_INDEX)
                .append(CSV_SEPARATOR)
                .append(NAME)
                .append(CSV_SEPARATOR)
                .append(BAND_WIDTH)
                .append(CSV_SEPARATOR)
                .append(TX_FREQ)
                .append(CSV_SEPARATOR)
                .append(RX_FREQ);

        return header.toString();
    }

    public static List<Channel> parseCsvFile(String csvFile) {
        List<Channel> result = new ArrayList<>();

        Scanner scanner = new Scanner(csvFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.startsWith("chanIndex")) {
                continue;
            }


            Channel channel = convertCsvLineToChannel(line);
            result.add(channel);
        }
        scanner.close();

        return result;
    }
}
