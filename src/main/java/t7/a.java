package t7;

import s7.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112694c;

    private a(int i11, int i12, String str) {
        this.f112692a = i11;
        this.f112693b = i12;
        this.f112694c = str;
    }

    public static a a(c0 c0Var) {
        String str;
        c0Var.c0(2);
        int iM = c0Var.M();
        int i11 = iM >> 1;
        int iM2 = ((c0Var.M() >> 3) & 31) | ((iM & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7 || i11 == 8) {
            str = "dvhe";
        } else if (i11 == 9) {
            str = "dvav";
        } else {
            if (i11 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i11 < 10 ? ".0" : ".");
        sb2.append(i11);
        sb2.append(iM2 < 10 ? ".0" : ".");
        sb2.append(iM2);
        return new a(i11, iM2, sb2.toString());
    }
}
