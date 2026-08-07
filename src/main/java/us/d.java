package us;

import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116554c;

    private d(int i11, int i12, String str) {
        this.f116552a = i11;
        this.f116553b = i12;
        this.f116554c = str;
    }

    public static d a(d0 d0Var) {
        String str;
        d0Var.V(2);
        int iH = d0Var.H();
        int i11 = iH >> 1;
        int iH2 = ((d0Var.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7) {
            str = "dvhe";
        } else if (i11 == 8) {
            str = "hev1";
        } else {
            if (i11 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i11);
        sb2.append(iH2 >= 10 ? "." : ".0");
        sb2.append(iH2);
        return new d(i11, iH2, sb2.toString());
    }
}
