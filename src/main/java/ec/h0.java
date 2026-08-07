package ec;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u001aS\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001d*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", CardPaymentMethod.PAYMENT_METHOD_TYPE, "authority", "path", SearchIntents.EXTRA_QUERY, "fragment", "separator", "Lec/g0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec/g0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lec/g0;", "data", "original", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec/g0;", "", "bytes", "h", "(Ljava/lang/String;[B)Ljava/lang/String;", "", "f", "(Lec/g0;)Ljava/util/List;", "pathSegments", DateTokenConverter.CONVERTER_KEY, "(Lec/g0;)Ljava/lang/String;", "filePath", "", "e", "(Ljava/lang/String;)I", "length", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final g0 a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null && str2 == null && str3 == null && str4 == null && str5 == null) {
            throw new IllegalArgumentException("At least one of scheme, authority, path, query, or fragment must be non-null.");
        }
        return new g0(c(str, str2, str3, str4, str5), str6, str, str2, str3, str4, str5);
    }

    public static /* synthetic */ g0 b(String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            str6 = okio.i0.f97934c;
        }
        return a(str, str2, str3, str4, str5, str6);
    }

    private static final String c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(CoreConstants.COLON_CHAR);
        }
        if (str2 != null) {
            sb2.append("//");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append('?');
            sb2.append(str4);
        }
        if (str5 != null) {
            sb2.append('#');
            sb2.append(str5);
        }
        return sb2.toString();
    }

    public static final String d(g0 g0Var) {
        List<String> listF = f(g0Var);
        if (listF.isEmpty()) {
            return null;
        }
        String path = g0Var.getPath();
        p013kotlin.jvm.internal.s.h(path);
        return p013kotlin.collections.v.y0(listF, g0Var.getSeparator(), p013kotlin.text.t.b0(path, g0Var.getSeparator(), false, 2, null) ? g0Var.getSeparator() : "", null, 0, null, null, 60, null);
    }

    private static final int e(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static final List<String> f(g0 g0Var) {
        String path = g0Var.getPath();
        if (path == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        int iU0 = -1;
        while (iU0 < path.length()) {
            int i11 = iU0 + 1;
            iU0 = p013kotlin.text.t.u0(path, '/', i11, false, 4, null);
            if (iU0 == -1) {
                iU0 = path.length();
            }
            String strSubstring = path.substring(i11, iU0);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
        }
        return arrayList;
    }

    private static final g0 g(String str, String str2, String str3) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        boolean z11 = true;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (i16 < str.length()) {
            char cCharAt = str.charAt(i16);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i13 == -1 && i11 == -1) {
                            i13 = i16 + 1;
                        }
                    } else if (z11 && i13 == -1 && i11 == -1) {
                        int i17 = i16 + 2;
                        if (i17 < str2.length() && str2.charAt(i16 + 1) == '/' && str2.charAt(i17) == '/') {
                            i14 = i16 + 3;
                            z11 = false;
                            i15 = i16;
                            i16 = i17;
                        } else if (p013kotlin.jvm.internal.s.f(str, str2)) {
                            i12 = i16 + 1;
                            i15 = i16;
                            i16 = i12;
                            i14 = i16;
                        }
                    }
                } else if (i12 == -1 && i13 == -1 && i11 == -1) {
                    i12 = i14 == -1 ? 0 : i16;
                    z11 = false;
                }
            } else if (i11 == -1) {
                i11 = i16 + 1;
            }
            i16++;
        }
        int iMin = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, str.length());
        int iMin2 = Math.min(i13 == -1 ? Integer.MAX_VALUE : i13 - 1, iMin);
        if (i14 != -1) {
            strSubstring2 = str.substring(0, i15);
            p013kotlin.jvm.internal.s.j(strSubstring2, "substring(...)");
            strSubstring = str.substring(i14, Math.min(i12 != -1 ? i12 : Integer.MAX_VALUE, iMin2));
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i12 != -1) {
            strSubstring3 = str.substring(i12, iMin2);
            p013kotlin.jvm.internal.s.j(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i13 != -1) {
            strSubstring4 = str.substring(i13, iMin);
            p013kotlin.jvm.internal.s.j(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i11 != -1) {
            strSubstring5 = str.substring(i11, str.length());
            p013kotlin.jvm.internal.s.j(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(e(strSubstring2), Math.max(e(strSubstring), Math.max(e(strSubstring3), Math.max(e(strSubstring4), e(strSubstring5))))) - 2)];
        return new g0(str, str3, strSubstring2 != null ? h(strSubstring2, bArr) : null, strSubstring != null ? h(strSubstring, bArr) : null, strSubstring3 != null ? h(strSubstring3, bArr) : null, strSubstring4 != null ? h(strSubstring4, bArr) : null, strSubstring5 != null ? h(strSubstring5, bArr) : null);
    }

    private static final String h(String str, byte[] bArr) {
        byte[] bArr2;
        int length = str.length();
        int i11 = 0;
        int iMax = Math.max(0, length - 2);
        int i12 = 0;
        while (true) {
            if (i11 < iMax) {
                bArr2 = bArr;
                if (str.charAt(i11) == '%') {
                    int i13 = i11 + 3;
                    try {
                        String strSubstring = str.substring(i11 + 1, i13);
                        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                        bArr2[i12] = (byte) Integer.parseInt(strSubstring, p013kotlin.text.a.a(16));
                        i12++;
                        bArr = bArr2;
                        i11 = i13;
                    } catch (NumberFormatException unused) {
                        bArr2[i12] = (byte) str.charAt(i11);
                        i12++;
                        i11++;
                        bArr = bArr2;
                    }
                }
            } else {
                if (i11 == i12) {
                    return str;
                }
                if (i11 >= length) {
                    return p013kotlin.text.t.I(bArr, 0, i12, false, 5, null);
                }
                bArr2 = bArr;
            }
            bArr2[i12] = (byte) str.charAt(i11);
            i12++;
            i11++;
            bArr = bArr2;
        }
    }

    public static final g0 i(String str, String str2) {
        String str3;
        String str4;
        if (p013kotlin.jvm.internal.s.f(str2, "/")) {
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            str = p013kotlin.text.t.V(str3, str4, "/", false, 4, null);
        }
        return g(str, str3, str4);
    }

    public static /* synthetic */ g0 j(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = okio.i0.f97934c;
        }
        return i(str, str2);
    }
}
