package qs;

import com.google.android.exoplayer2.u0;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final es.u f105963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f105964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f105965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f105966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u0[] f105967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f105968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f105969g;

    public c(es.u uVar, int[] iArr, int i11) {
        int i12 = 0;
        ts.a.g(iArr.length > 0);
        this.f105966d = i11;
        this.f105963a = (es.u) ts.a.e(uVar);
        int length = iArr.length;
        this.f105964b = length;
        this.f105967e = new u0[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f105967e[i13] = uVar.c(iArr[i13]);
        }
        Arrays.sort(this.f105967e, new Comparator() { // from class: qs.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.k((u0) obj, (u0) obj2);
            }
        });
        this.f105965c = new int[this.f105964b];
        while (true) {
            int i14 = this.f105964b;
            if (i12 >= i14) {
                this.f105968f = new long[i14];
                return;
            } else {
                this.f105965c[i12] = uVar.d(this.f105967e[i12]);
                i12++;
            }
        }
    }

    public static /* synthetic */ int k(u0 u0Var, u0 u0Var2) {
        return u0Var2.f40708h - u0Var.f40708h;
    }

    @Override // qs.u
    public final int b(int i11) {
        return this.f105965c[i11];
    }

    @Override // qs.u
    public final int d(int i11) {
        for (int i12 = 0; i12 < this.f105964b; i12++) {
            if (this.f105965c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // qs.u
    public final es.u e() {
        return this.f105963a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f105963a == cVar.f105963a && Arrays.equals(this.f105965c, cVar.f105965c)) {
                return true;
            }
        }
        return false;
    }

    @Override // qs.r
    public final u0 f() {
        return this.f105967e[a()];
    }

    @Override // qs.u
    public final u0 h(int i11) {
        return this.f105967e[i11];
    }

    public int hashCode() {
        if (this.f105969g == 0) {
            this.f105969g = (System.identityHashCode(this.f105963a) * 31) + Arrays.hashCode(this.f105965c);
        }
        return this.f105969g;
    }

    @Override // qs.u
    public final int length() {
        return this.f105965c.length;
    }

    @Override // qs.r
    public void disable() {
    }

    @Override // qs.r
    public void enable() {
    }

    @Override // qs.r
    public void i(float f11) {
    }
}
