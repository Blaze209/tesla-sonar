package ls;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90707e;

    private b(int i11, int i12, int i13, int i14, int i15) {
        this.f90703a = i11;
        this.f90704b = i12;
        this.f90705c = i13;
        this.f90706d = i14;
        this.f90707e = i15;
    }

    public static b a(String str) {
        ts.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strE = ou.c.e(strArrSplit[i15].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new b(i11, i12, i13, i14, strArrSplit.length);
    }
}
