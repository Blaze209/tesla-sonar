package rs;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.u0;
import java.util.Locale;
import ts.p0;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f109083a;

    public e(Resources resources) {
        this.f109083a = (Resources) ts.a.e(resources);
    }

    private String b(u0 u0Var) {
        int i11 = u0Var.f40725y;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            return this.f109083a.getString(o.f109156q);
        }
        if (i11 == 2) {
            return this.f109083a.getString(o.f109165z);
        }
        if (i11 == 6 || i11 == 7) {
            return this.f109083a.getString(o.B);
        }
        return i11 != 8 ? this.f109083a.getString(o.A) : this.f109083a.getString(o.C);
    }

    private String c(u0 u0Var) {
        int i11 = u0Var.f40708h;
        return i11 == -1 ? "" : this.f109083a.getString(o.f109155p, Float.valueOf(i11 / 1000000.0f));
    }

    private String d(u0 u0Var) {
        return TextUtils.isEmpty(u0Var.f40702b) ? "" : u0Var.f40702b;
    }

    private String e(u0 u0Var) {
        String strJ = j(f(u0Var), h(u0Var));
        return TextUtils.isEmpty(strJ) ? d(u0Var) : strJ;
    }

    private String f(u0 u0Var) {
        String str = u0Var.f40703c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = p0.f115040a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeN = p0.N();
        String displayName = localeForLanguageTag.getDisplayName(localeN);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeN) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(u0 u0Var) {
        int i11 = u0Var.f40717q;
        int i12 = u0Var.f40718r;
        return (i11 == -1 || i12 == -1) ? "" : this.f109083a.getString(o.f109157r, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private String h(u0 u0Var) {
        String string = (u0Var.f40705e & 2) != 0 ? this.f109083a.getString(o.f109158s) : "";
        if ((u0Var.f40705e & 4) != 0) {
            string = j(string, this.f109083a.getString(o.f109161v));
        }
        if ((u0Var.f40705e & 8) != 0) {
            string = j(string, this.f109083a.getString(o.f109160u));
        }
        return (u0Var.f40705e & 1088) != 0 ? j(string, this.f109083a.getString(o.f109159t)) : string;
    }

    private static int i(u0 u0Var) {
        int i11 = y.i(u0Var.f40712l);
        if (i11 != -1) {
            return i11;
        }
        if (y.k(u0Var.f40709i) != null) {
            return 2;
        }
        if (y.b(u0Var.f40709i) != null) {
            return 1;
        }
        if (u0Var.f40717q == -1 && u0Var.f40718r == -1) {
            return (u0Var.f40725y == -1 && u0Var.f40726z == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f109083a.getString(o.f109154o, string, str);
            }
        }
        return string;
    }

    @Override // rs.u
    public String a(u0 u0Var) {
        String strJ;
        int i11 = i(u0Var);
        if (i11 == 2) {
            strJ = j(h(u0Var), g(u0Var), c(u0Var));
        } else {
            strJ = i11 == 1 ? j(e(u0Var), b(u0Var), c(u0Var)) : e(u0Var);
        }
        return strJ.length() == 0 ? this.f109083a.getString(o.D) : strJ;
    }
}
