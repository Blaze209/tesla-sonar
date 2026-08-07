package ch.qos.logback.core.util;

import io.sentry.q7;
import java.text.DateFormatSymbols;

/* JADX INFO: loaded from: classes3.dex */
class CharSequenceToRegexMapper {
    DateFormatSymbols symbols = DateFormatSymbols.getInstance();

    CharSequenceToRegexMapper() {
    }

    static int[] findMinMaxLengthsInSymbols(String[] strArr) {
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                iMin = Math.min(iMin, length);
                iMax = Math.max(iMax, length);
            }
        }
        return new int[]{iMin, iMax};
    }

    private String getRegexForAmPms() {
        return symbolArrayToRegex(this.symbols.getAmPmStrings());
    }

    private String getRegexForLongDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getWeekdays());
    }

    private String getRegexForLongMonths() {
        return symbolArrayToRegex(this.symbols.getMonths());
    }

    private String getRegexForShortDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getShortWeekdays());
    }

    private String number(int i11) {
        return "\\d{" + i11 + "}";
    }

    private String symbolArrayToRegex(String[] strArr) {
        int[] iArrFindMinMaxLengthsInSymbols = findMinMaxLengthsInSymbols(strArr);
        return ".{" + iArrFindMinMaxLengthsInSymbols[0] + "," + iArrFindMinMaxLengthsInSymbols[1] + "}";
    }

    String getRegexForShortMonths() {
        return symbolArrayToRegex(this.symbols.getShortMonths());
    }

    String toRegex(CharSequenceState charSequenceState) {
        int i11 = charSequenceState.occurrences;
        char c11 = charSequenceState.f19346c;
        if (c11 != 'y') {
            if (c11 == 'z') {
                return q7.DEFAULT_PROPAGATION_TARGETS;
            }
            switch (c11) {
                case '\'':
                    if (i11 == 1) {
                        return "";
                    }
                    throw new IllegalStateException("Too many single quotes");
                case '.':
                    return "\\.";
                case 'K':
                case 'S':
                case 'W':
                case 'd':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                    break;
                case 'M':
                    if (i11 <= 2) {
                        return number(i11);
                    }
                    return i11 == 3 ? getRegexForShortMonths() : getRegexForLongMonths();
                case 'Z':
                    return "(\\+|-)\\d{4}";
                case '\\':
                    throw new IllegalStateException("Forward slashes are not allowed");
                case 'a':
                    return getRegexForAmPms();
                default:
                    switch (c11) {
                        case 'D':
                        case 'F':
                        case 'H':
                            break;
                        case 'E':
                            return i11 >= 4 ? getRegexForLongDaysOfTheWeek() : getRegexForShortDaysOfTheWeek();
                        case 'G':
                            return q7.DEFAULT_PROPAGATION_TARGETS;
                        default:
                            if (i11 == 1) {
                                return "" + c11;
                            }
                            return c11 + "{" + i11 + "}";
                    }
                    break;
            }
        }
        return number(i11);
    }
}
