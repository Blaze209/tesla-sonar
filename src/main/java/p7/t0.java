package p7;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f101497f = s7.q0.N0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f101498g = s7.q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u[] f101502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101503e;

    public t0(u... uVarArr) {
        this("", uVarArr);
    }

    public static t0 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f101497f);
        return new t0(bundle.getString(f101498g, ""), (u[]) (parcelableArrayList == null ? com.google.common.collect.x.r() : s7.i.d(new ou.h() { // from class: p7.s0
            @Override // ou.h
            public final Object apply(Object obj) {
                return u.e((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new u[0]));
    }

    private static void e(String str, String str2, String str3, int i11) {
        s7.t.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i11 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int g(int i11) {
        return i11 | 16384;
    }

    private void i() {
        String strF = f(this.f101502d[0].f101533d);
        int iG = g(this.f101502d[0].f101535f);
        int i11 = 1;
        while (true) {
            u[] uVarArr = this.f101502d;
            if (i11 >= uVarArr.length) {
                return;
            }
            if (!strF.equals(f(uVarArr[i11].f101533d))) {
                u[] uVarArr2 = this.f101502d;
                e("languages", uVarArr2[0].f101533d, uVarArr2[i11].f101533d, i11);
                return;
            } else {
                if (iG != g(this.f101502d[i11].f101535f)) {
                    e("role flags", Integer.toBinaryString(this.f101502d[0].f101535f), Integer.toBinaryString(this.f101502d[i11].f101535f), i11);
                    return;
                }
                i11++;
            }
        }
    }

    public t0 a(String str) {
        return new t0(str, this.f101502d);
    }

    public u c(int i11) {
        return this.f101502d[i11];
    }

    public int d(u uVar) {
        int i11 = 0;
        while (true) {
            u[] uVarArr = this.f101502d;
            if (i11 >= uVarArr.length) {
                return -1;
            }
            if (uVar == uVarArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f101500b.equals(t0Var.f101500b) && Arrays.equals(this.f101502d, t0Var.f101502d)) {
                return true;
            }
        }
        return false;
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f101502d.length);
        for (u uVar : this.f101502d) {
            arrayList.add(uVar.k());
        }
        bundle.putParcelableArrayList(f101497f, arrayList);
        bundle.putString(f101498g, this.f101500b);
        return bundle;
    }

    public int hashCode() {
        if (this.f101503e == 0) {
            this.f101503e = ((527 + this.f101500b.hashCode()) * 31) + Arrays.hashCode(this.f101502d);
        }
        return this.f101503e;
    }

    public String toString() {
        return this.f101500b + ": " + Arrays.toString(this.f101502d);
    }

    public t0(String str, u... uVarArr) {
        s7.a.a(uVarArr.length > 0);
        this.f101500b = str;
        this.f101502d = uVarArr;
        this.f101499a = uVarArr.length;
        int iK = g0.k(uVarArr[0].f101544o);
        this.f101501c = iK == -1 ? g0.k(uVarArr[0].f101543n) : iK;
        i();
    }
}
