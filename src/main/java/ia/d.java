package ia;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p7.g0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f77187a;

    public d(Resources resources) {
        this.f77187a = (Resources) s7.a.f(resources);
    }

    private String b(p7.u uVar) {
        int i11 = uVar.G;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            return this.f77187a.getString(x.f77283q);
        }
        if (i11 == 2) {
            return this.f77187a.getString(x.f77292z);
        }
        if (i11 == 6 || i11 == 7) {
            return this.f77187a.getString(x.B);
        }
        return i11 != 8 ? this.f77187a.getString(x.A) : this.f77187a.getString(x.C);
    }

    private String c(p7.u uVar) {
        int i11 = uVar.f101539j;
        return i11 == -1 ? "" : this.f77187a.getString(x.f77282p, Float.valueOf(i11 / 1000000.0f));
    }

    private String d(p7.u uVar) {
        return TextUtils.isEmpty(uVar.f101531b) ? "" : uVar.f101531b;
    }

    private String e(p7.u uVar) {
        String strJ = j(f(uVar), h(uVar));
        return TextUtils.isEmpty(strJ) ? d(uVar) : strJ;
    }

    private String f(p7.u uVar) {
        String str = uVar.f101533d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeE0 = q0.e0();
        String displayName = localeForLanguageTag.getDisplayName(localeE0);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeE0) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(p7.u uVar) {
        int i11 = uVar.f101551v;
        int i12 = uVar.f101552w;
        return (i11 == -1 || i12 == -1) ? "" : this.f77187a.getString(x.f77284r, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private String h(p7.u uVar) {
        String string = (uVar.f101535f & 2) != 0 ? this.f77187a.getString(x.f77285s) : "";
        if ((uVar.f101535f & 4) != 0) {
            string = j(string, this.f77187a.getString(x.f77288v));
        }
        if ((uVar.f101535f & 8) != 0) {
            string = j(string, this.f77187a.getString(x.f77287u));
        }
        return (uVar.f101535f & 1088) != 0 ? j(string, this.f77187a.getString(x.f77286t)) : string;
    }

    private static int i(p7.u uVar) {
        int iK = g0.k(uVar.f101544o);
        if (iK != -1) {
            return iK;
        }
        if (g0.n(uVar.f101540k) != null) {
            return 2;
        }
        if (g0.c(uVar.f101540k) != null) {
            return 1;
        }
        if (uVar.f101551v == -1 && uVar.f101552w == -1) {
            return (uVar.G == -1 && uVar.H == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : this.f77187a.getString(x.f77281o, string, str);
            }
        }
        return string;
    }

    @Override // ia.a0
    public String a(p7.u uVar) {
        String strJ;
        int i11 = i(uVar);
        if (i11 == 2) {
            strJ = j(h(uVar), g(uVar), c(uVar));
        } else {
            strJ = i11 == 1 ? j(e(uVar), b(uVar), c(uVar)) : e(uVar);
        }
        if (!strJ.isEmpty()) {
            return strJ;
        }
        String str = uVar.f101533d;
        return (str == null || str.trim().isEmpty()) ? this.f77187a.getString(x.D) : this.f77187a.getString(x.E, str);
    }
}
