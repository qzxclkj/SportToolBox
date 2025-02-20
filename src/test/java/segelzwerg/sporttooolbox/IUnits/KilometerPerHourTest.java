package segelzwerg.sporttooolbox.IUnits;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class KilometerPerHourTest {

    private static final float THIRTY_KM_PER_HOUR = 30f;
    private static Speed thirtyKilometersPerHour = new KilometerPerHour(THIRTY_KM_PER_HOUR);

    /**
     * Set up before all tests
     * Initialization of static Speed thirtyMetersPerSecond
     */
    @BeforeClass
    public static void setUp() {
        thirtyKilometersPerHour = new KilometerPerHour(THIRTY_KM_PER_HOUR);
    }

    /**
     * toKilometerPerHour
     * Speed: thirtyKilometersPerHour
     * Expected Speed: thirtyKilometersPerHour
     * @result thirtyKilometersPerHour return itself
     */
    @Test
    public void toKilometerPerHour() {

        Speed convertedSpeed = thirtyKilometersPerHour.toKilometerPerHour();

        assertThat(convertedSpeed, is(thirtyKilometersPerHour));
    }

    /**
     * toMeterPerSecond
     * Speed: thirtyKilometersPerHour
     * Expected Speed: 8.333334
     * @result 30km/h = 8.333334m/s
     */
    @Test
    public void toMeterPerSecond() {
        Speed convertedSpeed = thirtyKilometersPerHour.toMeterPerSecond();

        assertThat(convertedSpeed.getSpeed(), equalTo(8.333334f));
    }

    /**
     * toMilePerHour
     * Speed: thirtyKilometersPerHour
     * Expected Speed: 18.641136
     * @result 30km/h = 18.641136mph
     */
    @Test
    public void toMilePerHour() {
        Speed convertedSpeed = thirtyKilometersPerHour.toMilePerHour();

        assertThat(convertedSpeed.getSpeed(), equalTo(18.641136f));
    }

    /**
     * toKnot
     * Speed: thirtyKilometersPerHour
     * Expected Speed: 16.198704
     * @result 30km/h = 16.198704kn
     */
    @Test
    public void toKnot() {
        Speed convertedSpeed = thirtyKilometersPerHour.toKnot();

        assertThat(convertedSpeed.getSpeed(), equalTo(16.198704f));
    }
}