package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes8.dex */
public final class PartialDate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c[] f63638c = {new c("(\\d{4})", 0), new c("(\\d{4})-(\\d{2})", 0, 1), new c("(\\d{4})-?(\\d{2})-?(\\d{2})", 0, 1, 2), new c("--(\\d{2})-?(\\d{2})", 1, 2), new c("--(\\d{2})", 1), new c("---(\\d{2})", 2)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c[] f63639d = {new c("(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, null, 6, 7), new c("(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, null, 6, 7), new c("(\\d{2}):?(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 3, 4, 5, null, 6, 7), new c("-(\\d{2}):?(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, 5, null, 6, 7), new c("-(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 4, null, 6, 7), new c("--(\\d{2})(([-+]\\d{1,2}):?(\\d{2})?)?", 5, null, 6, 7)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer[] f63640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UtcOffset f63641b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer[] f63642a = new Integer[6];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UtcOffset f63643b;

        public PartialDate c() {
            Integer[] numArr = this.f63642a;
            if (numArr[0] != null && numArr[1] == null && numArr[2] != null) {
                throw xj0.b.INSTANCE.getIllegalArgumentException(38, new Object[0]);
            }
            if (numArr[3] == null || numArr[4] != null || numArr[5] == null) {
                return new PartialDate(this.f63642a, this.f63643b);
            }
            throw xj0.b.INSTANCE.getIllegalArgumentException(39, new Object[0]);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Pattern f63644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer[] f63645b;

        public c(String str, Integer... numArr) {
            this.f63644a = Pattern.compile('^' + str + CoreConstants.DOLLAR);
            this.f63645b = numArr;
        }

        public boolean a(b bVar, String str) {
            String strGroup;
            Matcher matcher = this.f63644a.matcher(str);
            if (!matcher.find()) {
                return false;
            }
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                Integer[] numArr = this.f63645b;
                if (i11 >= numArr.length) {
                    break;
                }
                Integer num = numArr[i11];
                if (num != null && (strGroup = matcher.group(i11 + 1)) != null) {
                    boolean zStartsWith = strGroup.startsWith(Marker.ANY_NON_NULL_MARKER);
                    if (zStartsWith) {
                        strGroup = strGroup.substring(1);
                    }
                    int i12 = Integer.parseInt(strGroup);
                    if (num.intValue() == 6) {
                        numValueOf = Integer.valueOf(i12);
                        z11 = zStartsWith;
                    } else if (num.intValue() == 7) {
                        numValueOf2 = Integer.valueOf(i12);
                    } else {
                        bVar.f63642a[num.intValue()] = Integer.valueOf(i12);
                    }
                }
                i11++;
            }
            if (numValueOf != null) {
                if (numValueOf2 == null) {
                    numValueOf2 = 0;
                }
                bVar.f63643b = new UtcOffset(z11, numValueOf.intValue(), numValueOf2.intValue());
            }
            return true;
        }
    }

    private boolean g() {
        return a() != null;
    }

    private boolean h() {
        return b() != null;
    }

    private boolean i() {
        return c() != null;
    }

    private boolean j() {
        return d() != null;
    }

    private boolean k() {
        return e() != null;
    }

    private boolean m() {
        return this.f63641b != null;
    }

    private boolean n() {
        return f() != null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static PartialDate o(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(84);
        String strSubstring2 = null;
        boolean zR = false;
        if (iIndexOf < 0) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            if (iIndexOf < str.length() - 1) {
                strSubstring2 = str.substring(iIndexOf + 1);
            }
        }
        b bVar = new b();
        if (strSubstring2 == null) {
            if (p(strSubstring, bVar) || r(strSubstring, bVar)) {
                zR = true;
            }
        } else if (strSubstring.length() == 0) {
            zR = r(strSubstring2, bVar);
        } else if (p(strSubstring, bVar) && r(strSubstring2, bVar)) {
            zR = true;
        }
        if (zR) {
            return bVar.c();
        }
        throw xj0.b.INSTANCE.getIllegalArgumentException(36, str);
    }

    private static boolean p(String str, b bVar) {
        return q(str, bVar, f63638c);
    }

    private static boolean q(String str, b bVar, c[] cVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.a(bVar, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean r(String str, b bVar) {
        return q(str, bVar, f63639d);
    }

    public Integer a() {
        return this.f63640a[2];
    }

    public Integer b() {
        return this.f63640a[3];
    }

    public Integer c() {
        return this.f63640a[4];
    }

    public Integer d() {
        return this.f63640a[1];
    }

    public Integer e() {
        return this.f63640a[5];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PartialDate.class != obj.getClass()) {
            return false;
        }
        PartialDate partialDate = (PartialDate) obj;
        if (!Arrays.equals(this.f63640a, partialDate.f63640a)) {
            return false;
        }
        UtcOffset utcOffset = this.f63641b;
        if (utcOffset == null) {
            if (partialDate.f63641b != null) {
                return false;
            }
        } else if (!utcOffset.equals(partialDate.f63641b)) {
            return false;
        }
        return true;
    }

    public Integer f() {
        return this.f63640a[0];
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f63640a) + 31) * 31;
        UtcOffset utcOffset = this.f63641b;
        return iHashCode + (utcOffset == null ? 0 : utcOffset.hashCode());
    }

    public boolean l() {
        return h() || i() || k();
    }

    public String s(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String string = n() ? f().toString() : null;
        String str = j() ? decimalFormat.format(d()) : null;
        String str2 = g() ? decimalFormat.format(a()) : null;
        String str3 = z11 ? "-" : "";
        if (n() && !j() && !g()) {
            sb2.append(string);
        } else if (!n() && j() && !g()) {
            sb2.append("--");
            sb2.append(str);
        } else if (!n() && !j() && g()) {
            sb2.append("---");
            sb2.append(str2);
        } else if (n() && j() && !g()) {
            sb2.append(string);
            sb2.append("-");
            sb2.append(str);
        } else if (!n() && j() && g()) {
            sb2.append("--");
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str2);
        } else {
            if (n() && !j() && g()) {
                throw new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(38, new Object[0]));
            }
            if (n() && j() && g()) {
                sb2.append(string);
                sb2.append(str3);
                sb2.append(str);
                sb2.append(str3);
                sb2.append(str2);
            }
        }
        if (l()) {
            sb2.append('T');
            String str4 = h() ? decimalFormat.format(b()) : null;
            String str5 = i() ? decimalFormat.format(c()) : null;
            String str6 = k() ? decimalFormat.format(e()) : null;
            String str7 = z11 ? ":" : "";
            if (h() && !i() && !k()) {
                sb2.append(str4);
            } else if (!h() && i() && !k()) {
                sb2.append("-");
                sb2.append(str5);
            } else if (!h() && !i() && k()) {
                sb2.append("--");
                sb2.append(str6);
            } else if (h() && i() && !k()) {
                sb2.append(str4);
                sb2.append(str7);
                sb2.append(str5);
            } else if (!h() && i() && k()) {
                sb2.append("-");
                sb2.append(str5);
                sb2.append(str7);
                sb2.append(str6);
            } else {
                if (h() && !i() && k()) {
                    throw new IllegalStateException(xj0.b.INSTANCE.getExceptionMessage(39, new Object[0]));
                }
                if (h() && i() && k()) {
                    sb2.append(str4);
                    sb2.append(str7);
                    sb2.append(str5);
                    sb2.append(str7);
                    sb2.append(str6);
                }
            }
            if (m()) {
                sb2.append(this.f63641b.h(z11));
            }
        }
        return sb2.toString();
    }

    public String toString() {
        return s(true);
    }

    private PartialDate(Integer[] numArr, UtcOffset utcOffset) {
        this.f63640a = numArr;
        this.f63641b = utcOffset;
    }
}
