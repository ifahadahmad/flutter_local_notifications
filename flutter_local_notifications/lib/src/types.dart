/// The days of the week.
enum Day {
  /// Sunday.
  sunday(1),

  /// Monday.
  monday(2),

  /// Tuesday.
  tuesday(3),

  /// Wednesday.
  wednesday(4),

  /// Thursday.
  thursday(5),

  /// Friday.
  friday(6),

  /// Saturday.
  saturday(7);

  /// Constructs an instance of [Day].
  const Day(this.value);

  /// The integer representation of [Day].
  final int value;
}

/// The components of a date and time representations.
enum DateTimeComponents {
  /// The time.
  time,

  /// The day of the week and time.
  dayOfWeekAndTime,

  /// The day of the month and time.
  dayOfMonthAndTime,

  /// The date and time.
  dateAndTime,
}

enum WeekDay {
  _,
  monday,
  tuesday,
  wednesday,
  thursday,
  friday,
  saturday,
  sunday
}
enum MonthlyType {
  date,
  day
}
enum CalendarDay {
  _,
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY
}
enum NamazTime { Fajr, Dhuhr, Asr, Maghrib, Isha }
enum BeforeAfter { before, after }
