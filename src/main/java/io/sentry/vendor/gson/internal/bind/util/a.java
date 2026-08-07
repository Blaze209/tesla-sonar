package io.sentry.vendor.gson.internal.bind.util;

import ch.qos.logback.core.CoreConstants;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f81533a = DesugarTimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    public static String b(Date date, boolean z11) {
        return c(date, z11, f81533a);
    }

    public static String c(Date date, boolean z11, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z11 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb2, gregorianCalendar.get(1), 4);
        char c11 = CoreConstants.DASH_CHAR;
        sb2.append(CoreConstants.DASH_CHAR);
        e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(CoreConstants.DASH_CHAR);
        e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(CoreConstants.COLON_CHAR);
        e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(CoreConstants.COLON_CHAR);
        e(sb2, gregorianCalendar.get(13), 2);
        if (z11) {
            sb2.append(CoreConstants.DOT);
            e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int iAbs = Math.abs(i11 / 60);
            int iAbs2 = Math.abs(i11 % 60);
            if (offset >= 0) {
                c11 = '+';
            }
            sb2.append(c11);
            e(sb2, iAbs, 2);
            sb2.append(CoreConstants.COLON_CHAR);
            e(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static int d(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                return i11;
            }
            i11++;
        }
        return str.length();
    }

    private static void e(StringBuilder sb2, int i11, int i12) {
        String string = Integer.toString(i11);
        for (int length = i12 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00de A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x018f A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0115, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01ee, please report this as an issue */
    public static Date f(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i11;
        int i12;
        int i13;
        int iG;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int iG2 = g(str, index, i14);
            if (a(str, i14, CoreConstants.DASH_CHAR)) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int iG3 = g(str, i14, i15);
            if (a(str, i15, CoreConstants.DASH_CHAR)) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int iG4 = g(str, i15, i16);
            boolean zA = a(str, i16, 'T');
            if (!zA && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iG2, iG3 - 1, iG4);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i17 = i15 + 5;
                int iG5 = g(str, i15 + 3, i17);
                if (a(str, i17, CoreConstants.COLON_CHAR)) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int iG6 = g(str, i17, i18);
                if (a(str, i18, CoreConstants.COLON_CHAR)) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (cCharAt2 = str.charAt(i18)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i16 = i18;
                    i11 = iG5;
                    i12 = iG6;
                } else {
                    int i19 = i18 + 2;
                    iG = g(str, i18, i19);
                    if (iG > 59 && iG < 63) {
                        iG = 59;
                    }
                    if (a(str, i19, CoreConstants.DOT)) {
                        int i21 = i18 + 3;
                        int iD = d(str, i18 + 4);
                        int iMin = Math.min(iD, i18 + 6);
                        int iG7 = g(str, i21, iMin);
                        int i22 = iMin - i21;
                        if (i22 == 1) {
                            iG7 *= 100;
                        } else if (i22 == 2) {
                            iG7 *= 10;
                        }
                        i11 = iG5;
                        i16 = iD;
                        i12 = iG6;
                        i13 = iG7;
                    } else {
                        i11 = iG5;
                        i16 = i19;
                        i12 = iG6;
                        i13 = 0;
                    }
                }
                if (str.length() > i16) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i16);
                if (cCharAt == 'Z') {
                    timeZone = f81533a;
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
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f81533a;
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
                gregorianCalendar2.set(1, iG2);
                gregorianCalendar2.set(2, iG3 - 1);
                gregorianCalendar2.set(5, iG4);
                gregorianCalendar2.set(11, i11);
                gregorianCalendar2.set(12, i12);
                gregorianCalendar2.set(13, iG);
                gregorianCalendar2.set(14, i13);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i11 = 0;
            i12 = 0;
            i13 = 0;
            iG = 0;
            if (str.length() > i16) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i16);
            if (cCharAt == 'Z') {
                timeZone = f81533a;
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
                if ("+0000".equals(strSubstring)) {
                    timeZone = f81533a;
                } else {
                    timeZone = f81533a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iG2);
            gregorianCalendar3.set(2, iG3 - 1);
            gregorianCalendar3.set(5, iG4);
            gregorianCalendar3.set(11, i11);
            gregorianCalendar3.set(12, i12);
            gregorianCalendar3.set(13, iG);
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
        } catch (NumberFormatException e13) {
            e = e13;
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
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int g(String str, int i11, int i12) {
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
