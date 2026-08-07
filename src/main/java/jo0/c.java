package jo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\n*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "Ljn0/h0;", "f", "(J[BIII)V", "", "index", "e", "(Ljava/lang/String;I)V", "hexDashString", "Ljo0/a;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljo0/a;", "hexString", "h", "maxLength", "g", "(Ljava/lang/String;I)Ljava/lang/String;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class c extends b {
    public static final void e(String str, int i11) {
        s.k(str, "<this>");
        if (str.charAt(i11) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i11 + ", but was '" + str.charAt(i11) + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    public static final void f(long j11, byte[] dst, int i11, int i12, int i13) {
        s.k(dst, "dst");
        int i14 = 7 - i12;
        int i15 = 8 - i13;
        if (i15 > i14) {
            return;
        }
        while (true) {
            int i16 = g.i()[(int) ((j11 >> (i14 << 3)) & 255)];
            int i17 = i11 + 1;
            dst[i11] = (byte) (i16 >> 8);
            i11 += 2;
            dst[i17] = (byte) i16;
            if (i14 == i15) {
                return;
            } else {
                i14--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, int i11) {
        if (str.length() <= i11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        s.i(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i11);
        s.j(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final a h(String hexString) {
        s.k(hexString, "hexString");
        return a.f84111c.a(g.k(hexString, 0, 16, null, 4, null), g.k(hexString, 16, 32, null, 4, null));
    }

    public static final a i(String hexDashString) {
        s.k(hexDashString, "hexDashString");
        long jK = g.k(hexDashString, 0, 8, null, 4, null);
        e(hexDashString, 8);
        long jK2 = g.k(hexDashString, 9, 13, null, 4, null);
        e(hexDashString, 13);
        long jK3 = g.k(hexDashString, 14, 18, null, 4, null);
        e(hexDashString, 18);
        long jK4 = g.k(hexDashString, 19, 23, null, 4, null);
        e(hexDashString, 23);
        return a.f84111c.a((jK2 << 16) | (jK << 32) | jK3, (jK4 << 48) | g.k(hexDashString, 24, 36, null, 4, null));
    }
}
