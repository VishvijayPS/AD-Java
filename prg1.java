
public class prg1 {

    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public Day nextWorkingDay() {
            switch (this) {
                case FRIDAY:
                case SATURDAY:
                case SUNDAY:
                    return MONDAY;
                default:
                    return Day.values()[(this.ordinal() + 1)];
            }
        }
    }

    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        System.out.println("Today is: " + today);
        if (today.isWeekend()) {
            System.out.println("It's a weekend!");
        } else {
            Day nextWorkiDay = today.nextWorkingDay();
            System.out.println("The next working day is: " + nextWorkiDay);
        }
    }
}
