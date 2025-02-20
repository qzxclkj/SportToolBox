package segelzwerg.sporttooolbox.IUnits;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class TimeTest {

    /**
     * Test zero
     * Time: 0 hours, 0 minutes, 0 seconds
     * Expected Time: 0 hours, 0 minutes, 0 seconds
     * @result Time of 0 hours, 0 minutes, 0 seconds is equal to Time of 0 hours, 0 minutes, 0 seconds
     */
	@Test
    public void zero() {
        assertThat(new Time(0, 0, 0), equalTo(new Time(0, 0, 0)));
    }

    /**
     * Test oneHour
     * Time: 0 hours, 0 minutes, 3600 seconds
     * Expected Time: 1 hour, 0 minutes, 0 seconds
     * @result Time of 3600 seconds is equal to Time of 1 hour
     */
    @Test
    public void oneHour() {
        assertThat(new Time(0, 0, 3_600), equalTo(new Time(1, 0, 0)));
    }

    /**
     * Test sixtyMinutes
     * Time: 0 hours, 0 minutes, 3600 seconds
     * Expected Time: 0 hours, 60 minutes, 0 seconds
     * @result Time of 3600 seconds is equal to Time of 60 minutes
     */
    @Test
    public void sixtyMinutes() {
        assertThat(new Time(0, 0, 3_600), equalTo(new Time(0, 60, 0)));
    }

    /**
     * Test manySeconds
     * Time: 0 hours, 0 minutes, 1800 seconds
     * Expected Time: 0 hours, 0 minutes, 1800 seconds
     * @result Time of 1800 seconds is equal to Time of 1800 seconds
     */
    @Test
    public void manySeconds() {
        assertThat(new Time(0, 0, 1_800), equalTo(new Time(0, 0, 1800)));
    }

    /**
     * Test ninetyMinutes
     * Time: 0 hours, 0 minutes, 5400 seconds
     * Expected Time: 0 hours, 90 minutes, 0 seconds
     * @result Time of 5400 seconds is equal to Time of 90 minutes
     */
    @Test
    public void ninetyMinutes() {
        assertThat(new Time(0, 0, 5_400), equalTo(new Time(0, 90, 0)));
    }

    /**
     * Test oddNumber
     * Time: 0 hours, 0 minutes, 4530 seconds
     * Expected Time: 1 hours, 15 minutes, 30 seconds
     * @result Time of 4530 seconds is equal to Time of 1 hours, 15 minutes, 30 seconds
     */
    @Test
    public void oddNumber() {
        assertThat(new Time(0, 0, 4_530), equalTo(new Time(1, 15, 30)));
    }

    /**
     * Test overflow
     * Time: 0 hours, 0 minutes, 56133 seconds
     * Expected Time: 13 hours, 150 minutes, 333 seconds
     * @result Time of 56133 seconds is equal to Time of 13 hours, 150 minutes, 333 seconds
     */
    @Test
    public void overflow() {
        assertThat(new Time(0, 0, 56_133), equalTo(new Time(13, 150, 333)));
    }

    /**
     * Test equals
     * Time: 15 hours, 35 minutes, 33 seconds
     * Expected Time: 13 hours, 150 minutes, 333 seconds
     * @result Time of 15 hours, 35 minutes, 33 seconds is equal to Time of 13 hours, 150 minutes, 333 seconds
     */
    @Test
    public void equals() {
        assertThat(new Time(15, 35, 33), equalTo(new Time(13, 150, 333)));
    }

    /**
     * Test negativeHours
     * Time: -1 hours, 0 minutes, 0 seconds
     * Expected: IllegalArgumentException exception thrown
     * @result IllegalArgumentException exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void negativeHours() {
        new Time(-1, 0, 0);
    }

    /**
     * Test negativeMinutes
     * Time: 0 hours, -1 minutes, 0 seconds
     * Expected: IllegalArgumentException exception thrown
     * @result IllegalArgumentException exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void negativeMinutes() {
        new Time(0, -1, 0);
    }

     /**
      * Test negativeSeconds
      * Time: 0 hours, 0 minutes, -1 seconds
      * Expected: IllegalArgumentException exception thrown
      * @result IllegalArgumentException exception
      */
     @Test(expected = IllegalArgumentException.class)
    public void negativeSeconds() {
        new Time(0, 0, -1);
    }
}