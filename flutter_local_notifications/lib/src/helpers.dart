import 'package:clock/clock.dart';
import 'package:timezone/timezone.dart';

import 'types.dart';

/// Helper method for validating a date/time value represents a future point in
/// time where `matchDateTimeComponents` is null.
void validateDateIsInTheFuture(
  TZDateTime scheduledDate,
  DateTimeComponents? matchDateTimeComponents,
) {
  if (matchDateTimeComponents != null) {
    return;
  }
  print("this is the scheduled Date $scheduledDate");
  print("this is the now time ${clock.now()}");
  if (scheduledDate.isBefore(clock.now())) {
    throw ArgumentError.value(
        scheduledDate, 'scheduledDate', 'Must be a date in the future');
  }
}
