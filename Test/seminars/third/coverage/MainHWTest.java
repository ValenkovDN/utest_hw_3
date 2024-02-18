package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;

public class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp(){
        mainHW = new MainHW();
    }

    @Test
    void evenNumber() {
        assertThat(mainHW.evenOddNumber(20)).isTrue();
    }


    @Test
    void oddNumber(){
        assertThat(mainHW.evenOddNumber(21)).isFalse();
    }

    @Test
    void numberIntervalEntered() {
        assertThat(mainHW.numberInterval(25)).isTrue();
    }

    @Test
    void numberIntervalNotEntered() {
        assertThat(mainHW.numberInterval(100)).isTrue();
    }

    @Test
    void numberIntervalException(){
        assertThat(mainHW.numberInterval(24)).isFalse();
    }
}
