package z9;

import android.text.TextUtils;
import com.google.common.collect.b0;
import com.google.common.collect.c0;
import com.google.common.collect.z0;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f127898d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b0<String> f127899e = b0.s(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b0<String> f127900f = b0.t("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b0<String> f127901g = b0.s("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b0<String> f127902h = b0.t("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127905c;

    private b(int i11, int i12, int i13) {
        this.f127903a = i11;
        this.f127904b = i12;
        this.f127905c = i13;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = ou.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(b0.n(TextUtils.split(strE, f127898d)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    private static b b(b0<String> b0Var) {
        int i11;
        z0.f fVarE;
        int i12;
        z0.f fVarE2;
        z0.f fVarE3;
        String str;
        int iHashCode;
        int i13;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) c0.c(z0.e(f127902h, b0Var), "outside");
        int iHashCode4 = str4.hashCode();
        int i14 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals("after")) {
                    i11 = 2;
                }
            } else if (str4.equals("outside")) {
                i11 = -2;
            }
            fVarE = z0.e(f127899e, b0Var);
            i12 = -1;
            if (!fVarE.isEmpty()) {
                str3 = (String) fVarE.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i12 = 0;
                }
                return new b(i12, 0, i11);
            }
            fVarE2 = z0.e(f127901g, b0Var);
            fVarE3 = z0.e(f127900f, b0Var);
            if (!fVarE2.isEmpty() && fVarE3.isEmpty()) {
                return new b(-1, 0, i11);
            }
            str = (String) c0.c(fVarE2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals("open")) {
                    i13 = 2;
                }
                str2 = (String) c0.c(fVarE3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i14 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i14 = 3;
                }
                return new b(i14, i13, i11);
            }
            str.equals("filled");
            i13 = 1;
            str2 = (String) c0.c(fVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i14 = 2;
                }
            } else if (str2.equals("sesame")) {
                i14 = 3;
            }
            return new b(i14, i13, i11);
        }
        str4.equals("before");
        i11 = 1;
        fVarE = z0.e(f127899e, b0Var);
        i12 = -1;
        if (!fVarE.isEmpty()) {
            str3 = (String) fVarE.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            } else if (iHashCode3 == 3387192) {
                i12 = 0;
            }
            return new b(i12, 0, i11);
        }
        fVarE2 = z0.e(f127901g, b0Var);
        fVarE3 = z0.e(f127900f, b0Var);
        if (!fVarE2.isEmpty()) {
        }
        str = (String) c0.c(fVarE2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i13 = 2;
            }
            str2 = (String) c0.c(fVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i14 = 2;
                }
            } else if (str2.equals("sesame")) {
                i14 = 3;
            }
            return new b(i14, i13, i11);
        }
        str.equals("filled");
        i13 = 1;
        str2 = (String) c0.c(fVarE3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i14 = 2;
            }
        } else if (str2.equals("sesame")) {
            i14 = 3;
        }
        return new b(i14, i13, i11);
    }
}
