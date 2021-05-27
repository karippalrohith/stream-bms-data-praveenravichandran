package BMS;

import streamer.BMSStreamer;
import streamer.IBMSStreamer;

/**
 * BMS Application that will stream BMS data
 *
 */
public class BMSSender {
	public static void sendData() {
		IBMSStreamer bmsStreamer = new BMSStreamer();
		bmsStreamer.streamData();
	}
}
