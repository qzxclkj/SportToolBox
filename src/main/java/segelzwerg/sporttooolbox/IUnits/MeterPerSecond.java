package segelzwerg.sporttooolbox.IUnits;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Speed in meter per second
 */
@Getter
@Setter
@EqualsAndHashCode
public class MeterPerSecond extends Speed {

	public MeterPerSecond(float speed) {
		super(speed);
	}

	/**
	 * Convert to kilometer per hour
	 * @return speed in kilometer per hour
	 */
	public Speed toKilometerPerHour() {
		return new KilometerPerHour(getSpeed() * Speed.METER_PER_SECOND_TO_KILOMETER_PER_HOUR);
	}

	/**
	 * Convert to meter per second
	 * @return speed in meter per second
	 */
	public Speed toMeterPerSecond() {
		return this;
	}

	/**
	 * Convert to mile per hour
	 * @return speed in mile per hour
	 */
	public Speed toMilePerHour() {
		return new MilePerHour(getSpeed() * Speed.METER_PER_SECOND_TO_KILOMETER_PER_HOUR / Speed.MILE_PER_HOUR_TO_KILOMETER_PER_HOUR);
	}

	/**
	 * Convert to knot
	 * @return speed in knot
	 */
	public Speed toKnot() {
		return new Knot(getSpeed() * Speed.METER_PER_SECOND_TO_KILOMETER_PER_HOUR / Speed.KNOT_TO_KILOMETER_PER_HOUR);
	}
}
