package ls;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.f;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f90710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f90711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f90712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f90713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f90716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f90717j;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f90721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f90722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f90723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f90724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f90725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f90726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f90727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f90728k;

        private a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.f90718a = i11;
            this.f90719b = i12;
            this.f90720c = i13;
            this.f90721d = i14;
            this.f90722e = i15;
            this.f90723f = i16;
            this.f90724g = i17;
            this.f90725h = i18;
            this.f90726i = i19;
            this.f90727j = i21;
            this.f90728k = i22;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < strArrSplit.length; i22++) {
                String strE = ou.c.e(strArrSplit[i22].trim());
                strE.getClass();
                switch (strE) {
                    case "italic":
                        i17 = i22;
                        break;
                    case "underline":
                        i18 = i22;
                        break;
                    case "strikeout":
                        i19 = i22;
                        break;
                    case "primarycolour":
                        i13 = i22;
                        break;
                    case "bold":
                        i16 = i22;
                        break;
                    case "name":
                        i11 = i22;
                        break;
                    case "fontsize":
                        i15 = i22;
                        break;
                    case "borderstyle":
                        i21 = i22;
                        break;
                    case "alignment":
                        i12 = i22;
                        break;
                    case "outlinecolour":
                        i14 = i22;
                        break;
                }
            }
            if (i11 != -1) {
                return new a(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, strArrSplit.length);
            }
            return null;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f90729c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f90730d = Pattern.compile(p0.B("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f90731e = Pattern.compile(p0.B("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f90732f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f90734b;

        private b(int i11, PointF pointF) {
            this.f90733a = i11;
            this.f90734b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f90732f.matcher(str);
            if (matcher.find()) {
                return c.e((String) ts.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f90729c.matcher(str);
            PointF pointF = null;
            int i11 = -1;
            while (matcher.find()) {
                String str2 = (String) ts.a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i11 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i11, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f90730d.matcher(str);
            Matcher matcher2 = f90731e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    u.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) ts.a.e(strGroup)).trim()), Float.parseFloat(((String) ts.a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f90729c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i11, Integer num, Integer num2, float f11, boolean z11, boolean z12, boolean z13, boolean z14, int i12) {
        this.f90708a = str;
        this.f90709b = i11;
        this.f90710c = num;
        this.f90711d = num2;
        this.f90712e = f11;
        this.f90713f = z11;
        this.f90714g = z12;
        this.f90715h = z13;
        this.f90716i = z14;
        this.f90717j = i12;
    }

    public static c b(String str, a aVar) {
        ts.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = aVar.f90728k;
        if (length != i11) {
            u.i("SsaStyle", p0.B("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f90718a].trim();
            int i12 = aVar.f90719b;
            int iE = i12 != -1 ? e(strArrSplit[i12].trim()) : -1;
            int i13 = aVar.f90720c;
            Integer numH = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f90721d;
            Integer numH2 = i14 != -1 ? h(strArrSplit[i14].trim()) : null;
            int i15 = aVar.f90722e;
            float fI = i15 != -1 ? i(strArrSplit[i15].trim()) : -3.4028235E38f;
            int i16 = aVar.f90723f;
            boolean z11 = false;
            boolean z12 = true;
            if (i16 != -1 && f(strArrSplit[i16].trim())) {
                z11 = true;
            }
            int i17 = aVar.f90724g;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z12 = false;
            }
            int i18 = aVar.f90725h;
            if (i18 == -1 || !f(strArrSplit[i18].trim())) {
                z12 = false;
            }
            int i19 = aVar.f90726i;
            boolean z13 = i19 != -1 && f(strArrSplit[i19].trim());
            int i21 = aVar.f90727j;
            return new c(strTrim, iE, numH, numH2, fI, z11, z12, z12, z13, i21 != -1 ? g(strArrSplit[i21].trim()) : -1);
        } catch (RuntimeException e11) {
            u.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }

    private static boolean c(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i11) {
        return i11 == 1 || i11 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int i11 = Integer.parseInt(str.trim());
            if (c(i11)) {
                return i11;
            }
        } catch (NumberFormatException unused) {
        }
        u.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int i11 = Integer.parseInt(str);
            return i11 == 1 || i11 == -1;
        } catch (NumberFormatException e11) {
            u.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e11);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int i11 = Integer.parseInt(str.trim());
            if (d(i11)) {
                return i11;
            }
        } catch (NumberFormatException unused) {
        }
        u.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long j11 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ts.a.a(j11 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.e(((j11 >> 24) & 255) ^ 255), f.e(j11 & 255), f.e((j11 >> 8) & 255), f.e((j11 >> 16) & 255)));
        } catch (IllegalArgumentException e11) {
            u.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e11);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e11) {
            u.j("SsaStyle", "Failed to parse font size: '" + str + "'", e11);
            return -3.4028235E38f;
        }
    }
}
