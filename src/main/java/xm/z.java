package xm;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f123790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f123791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f123792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f123793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f123794g;

    public z(int i11, int i12, SparseIntArray sparseIntArray) {
        this(i11, i12, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public z(int i11, int i12, SparseIntArray sparseIntArray, int i13, int i14, int i15) {
        pk.k.i(i11 >= 0 && i12 >= i11);
        this.f123789b = i11;
        this.f123788a = i12;
        this.f123790c = sparseIntArray;
        this.f123791d = i13;
        this.f123792e = i14;
        this.f123794g = i15;
    }
}
