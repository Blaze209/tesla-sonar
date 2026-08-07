package x9;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f123094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f123095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f123096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f123097f;

    private a(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f123092a = i11;
        this.f123093b = i12;
        this.f123094c = i13;
        this.f123095d = i14;
        this.f123096e = i15;
        this.f123097f = i16;
    }

    public static a a(String str) {
        s7.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < strArrSplit.length; i16++) {
            String strE = ou.c.e(strArrSplit[i16].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i13 = i16;
                    break;
                case "text":
                    i15 = i16;
                    break;
                case "layer":
                    i11 = i16;
                    break;
                case "start":
                    i12 = i16;
                    break;
                case "style":
                    i14 = i16;
                    break;
            }
        }
        if (i12 == -1 || i13 == -1 || i15 == -1) {
            return null;
        }
        return new a(i11, i12, i13, i14, i15, strArrSplit.length);
    }
}
