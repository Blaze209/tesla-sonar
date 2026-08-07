package bx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class e0 {
    private static String a(int i11) {
        if (i11 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i11 == 1) {
            return "MMMM d, yyyy";
        }
        if (i11 == 2) {
            return "MMM d, yyyy";
        }
        if (i11 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
    }

    private static String b(int i11) {
        if (i11 == 0 || i11 == 1) {
            return "h:mm:ss a z";
        }
        if (i11 == 2) {
            return "h:mm:ss a";
        }
        if (i11 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
    }

    public static DateFormat c(int i11, int i12) {
        return new SimpleDateFormat(a(i11) + " " + b(i12), Locale.US);
    }
}
