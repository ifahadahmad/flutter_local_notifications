import 'types.dart';

class TimeFromNamaz {
  final NamazTime? namazTime;
  final BeforeAfter? beforeAfter;
  final int? minutes;
  final int? hours;
  TimeFromNamaz({
    this.namazTime,
    this.beforeAfter,
    this.minutes,
    this.hours,
  });
    Map<String, dynamic> toJson() {
    return {
      'namazTime': namazTime?.toString(),
      'beforeAfter': beforeAfter?.toString(),
      'minutes': minutes,
      'hours': hours,
    };
  }
}
