package BMS;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import streamer.BMSStreamerImpl;
import streamer.IBMSStreamer;

@RunWith(MockitoJUnitRunner.class)
public class BMSStreamerTest {

	@Test
	public void checkIfBMSValuesPrinting() {
		IBMSStreamer bmsStreamerImplMock = Mockito.mock(BMSStreamerImpl.class);
		((BMSStreamerImpl) Mockito.doNothing().when(bmsStreamerImplMock)).streamData();
		bmsStreamerImplMock.streamData();
		((BMSStreamerImpl) Mockito.verify(bmsStreamerImplMock, Mockito.times(1))).streamData();
		((BMSStreamerImpl) bmsStreamerImplMock).printBatteryValues();
		((BMSStreamerImpl) Mockito.verify(bmsStreamerImplMock, Mockito.times(1))).printBatteryValues();
	}

}
