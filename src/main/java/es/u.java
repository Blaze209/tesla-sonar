package es;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Arrays;
import ts.p0;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63202f = p0.t0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f63203g = p0.t0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<u> f63204h = new com.google.android.exoplayer2.g.a() { // from class: es.t
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return u.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u0[] f63208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63209e;

    public u(u0... u0VarArr) {
        this("", u0VarArr);
    }

    public static /* synthetic */ u a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f63202f);
        return new u(bundle.getString(f63203g, ""), (u0[]) (parcelableArrayList == null ? x.r() : ts.c.d(u0.f40700p0, parcelableArrayList)).toArray(new u0[0]));
    }

    private static void e(String str, String str2, String str3, int i11) {
        ts.u.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i11 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int g(int i11) {
        return i11 | 16384;
    }

    private void h() {
        String strF = f(this.f63208d[0].f40703c);
        int iG = g(this.f63208d[0].f40705e);
        int i11 = 1;
        while (true) {
            u0[] u0VarArr = this.f63208d;
            if (i11 >= u0VarArr.length) {
                return;
            }
            if (!strF.equals(f(u0VarArr[i11].f40703c))) {
                u0[] u0VarArr2 = this.f63208d;
                e("languages", u0VarArr2[0].f40703c, u0VarArr2[i11].f40703c, i11);
                return;
            } else {
                if (iG != g(this.f63208d[i11].f40705e)) {
                    e("role flags", Integer.toBinaryString(this.f63208d[0].f40705e), Integer.toBinaryString(this.f63208d[i11].f40705e), i11);
                    return;
                }
                i11++;
            }
        }
    }

    public u b(String str) {
        return new u(str, this.f63208d);
    }

    public u0 c(int i11) {
        return this.f63208d[i11];
    }

    public int d(u0 u0Var) {
        int i11 = 0;
        while (true) {
            u0[] u0VarArr = this.f63208d;
            if (i11 >= u0VarArr.length) {
                return -1;
            }
            if (u0Var == u0VarArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f63206b.equals(uVar.f63206b) && Arrays.equals(this.f63208d, uVar.f63208d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f63209e == 0) {
            this.f63209e = ((527 + this.f63206b.hashCode()) * 31) + Arrays.hashCode(this.f63208d);
        }
        return this.f63209e;
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f63208d.length);
        for (u0 u0Var : this.f63208d) {
            arrayList.add(u0Var.i(true));
        }
        bundle.putParcelableArrayList(f63202f, arrayList);
        bundle.putString(f63203g, this.f63206b);
        return bundle;
    }

    public u(String str, u0... u0VarArr) {
        ts.a.a(u0VarArr.length > 0);
        this.f63206b = str;
        this.f63208d = u0VarArr;
        this.f63205a = u0VarArr.length;
        int i11 = y.i(u0VarArr[0].f40712l);
        this.f63207c = i11 == -1 ? y.i(u0VarArr[0].f40711k) : i11;
        h();
    }
}
