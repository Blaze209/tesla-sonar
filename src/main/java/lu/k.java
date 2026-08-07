package lu;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f90785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f90786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f90787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f90788g;

    public static k a(String str) {
        int iIndexOf = str.indexOf(58);
        String strSubstring = "";
        if (-1 != iIndexOf) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf < str.length() ? str.substring(iIndexOf + 1) : "";
            str = strSubstring2;
        }
        String[] strArrSplit = TextUtils.split(str, Pattern.quote("|"));
        if (strArrSplit.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        k kVar = new k();
        kVar.f90788g = strSubstring;
        kVar.f90782a = Integer.parseInt(strArrSplit[0]);
        kVar.f90783b = Integer.parseInt(strArrSplit[1]);
        kVar.f90784c = strArrSplit[2];
        kVar.f90785d = strArrSplit[3];
        kVar.f90786e = strArrSplit[4];
        kVar.f90787f = Long.parseLong(strArrSplit[5]);
        return kVar;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f90782a), Integer.valueOf(this.f90783b), this.f90784c, this.f90785d, this.f90786e, Long.valueOf(this.f90787f)});
    }
}
