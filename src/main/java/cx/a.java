package cx;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f59225a = DesugarTimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    private static int b(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00df A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0190 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0116, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01ef, please report this as an issue */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i11;
        int i12;
        int i13;
        int iD;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int iD2 = d(str, index, i14);
            if (a(str, i14, CoreConstants.DASH_CHAR)) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int iD3 = d(str, i14, i15);
            if (a(str, i15, CoreConstants.DASH_CHAR)) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int iD4 = d(str, i15, i16);
            boolean zA = a(str, i16, 'T');
            if (!zA && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD2, iD3 - 1, iD4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i17 = i15 + 5;
                int iD5 = d(str, i15 + 3, i17);
                if (a(str, i17, CoreConstants.COLON_CHAR)) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int iD6 = d(str, i17, i18);
                if (a(str, i18, CoreConstants.COLON_CHAR)) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (cCharAt2 = str.charAt(i18)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i16 = i18;
                    i11 = iD5;
                    i12 = iD6;
                } else {
                    int i19 = i18 + 2;
                    iD = d(str, i18, i19);
                    if (iD > 59 && iD < 63) {
                        iD = 59;
                    }
                    if (a(str, i19, CoreConstants.DOT)) {
                        int i21 = i18 + 3;
                        int iB = b(str, i18 + 4);
                        int iMin = Math.min(iB, i18 + 6);
                        int iD7 = d(str, i21, iMin);
                        int i22 = iMin - i21;
                        if (i22 == 1) {
                            iD7 *= 100;
                        } else if (i22 == 2) {
                            iD7 *= 10;
                        }
                        i11 = iD5;
                        i16 = iB;
                        i12 = iD6;
                        i13 = iD7;
                    } else {
                        i11 = iD5;
                        i16 = i19;
                        i12 = iD6;
                        i13 = 0;
                    }
                }
                if (str.length() > i16) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i16);
                if (cCharAt == 'Z') {
                    timeZone = f59225a;
                    length = i16 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i16);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i16 + strSubstring.length();
                    if (!strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                        timeZone = f59225a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iD2);
                gregorianCalendar2.set(2, iD3 - 1);
                gregorianCalendar2.set(5, iD4);
                gregorianCalendar2.set(11, i11);
                gregorianCalendar2.set(12, i12);
                gregorianCalendar2.set(13, iD);
                gregorianCalendar2.set(14, i13);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i11 = 0;
            i12 = 0;
            i13 = 0;
            iD = 0;
            if (str.length() > i16) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i16);
            if (cCharAt == 'Z') {
                timeZone = f59225a;
                length = i16 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i16);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i16 + strSubstring.length();
                if (strSubstring.equals("+0000")) {
                    timeZone = f59225a;
                } else {
                    timeZone = f59225a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iD2);
            gregorianCalendar3.set(2, iD3 - 1);
            gregorianCalendar3.set(5, iD4);
            gregorianCalendar3.set(11, i11);
            gregorianCalendar3.set(12, i12);
            gregorianCalendar3.set(13, iD);
            gregorianCalendar3.set(14, i13);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e11) {
            e = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = CoreConstants.DOUBLE_QUOTE_CHAR + str + CoreConstants.DOUBLE_QUOTE_CHAR;
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e12) {
            e = e12;
            if (str == null) {
                str2 = null;
            } else {
                str2 = CoreConstants.DOUBLE_QUOTE_CHAR + str + CoreConstants.DOUBLE_QUOTE_CHAR;
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    private static int d(String str, int i11, int i12) {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = -iDigit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int iDigit2 = Character.digit(str.charAt(i14), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - iDigit2;
            i14 = i15;
        }
        return -i13;
    }
}
