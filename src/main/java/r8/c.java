package r8;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final t0 f107159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f107160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f107161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f107162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p7.u[] f107163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f107164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f107165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f107166h;

    public c(t0 t0Var, int... iArr) {
        this(t0Var, iArr, 0);
    }

    public static /* synthetic */ int u(p7.u uVar, p7.u uVar2) {
        return uVar2.f101539j - uVar.f101539j;
    }

    @Override // r8.x
    public final int b(int i11) {
        return this.f107161c[i11];
    }

    @Override // r8.x
    public final int d(int i11) {
        for (int i12 = 0; i12 < this.f107160b; i12++) {
            if (this.f107161c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // r8.x
    public final t0 e() {
        return this.f107159a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f107159a.equals(cVar.f107159a) && Arrays.equals(this.f107161c, cVar.f107161c)) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.t
    public final p7.u f() {
        return this.f107163e[a()];
    }

    @Override // r8.x
    public final p7.u h(int i11) {
        return this.f107163e[i11];
    }

    public int hashCode() {
        if (this.f107165g == 0) {
            this.f107165g = (System.identityHashCode(this.f107159a) * 31) + Arrays.hashCode(this.f107161c);
        }
        return this.f107165g;
    }

    @Override // r8.t
    public void j(boolean z11) {
        this.f107166h = z11;
    }

    @Override // r8.t
    public boolean l(int i11, long j11) {
        return this.f107164f[i11] > j11;
    }

    @Override // r8.x
    public final int length() {
        return this.f107161c.length;
    }

    @Override // r8.t
    public boolean n(int i11, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zL = l(i11, jElapsedRealtime);
        int i12 = 0;
        while (i12 < this.f107160b && !zL) {
            zL = (i12 == i11 || l(i12, jElapsedRealtime)) ? false : true;
            i12++;
        }
        if (!zL) {
            return false;
        }
        long[] jArr = this.f107164f;
        jArr[i11] = Math.max(jArr[i11], q0.f(jElapsedRealtime, j11, Long.MAX_VALUE));
        return true;
    }

    @Override // r8.t
    public int o(long j11, List<? extends p8.m> list) {
        return list.size();
    }

    @Override // r8.t
    public final int p() {
        return this.f107161c[a()];
    }

    @Override // r8.x
    public final int s(p7.u uVar) {
        for (int i11 = 0; i11 < this.f107160b; i11++) {
            if (this.f107163e[i11] == uVar) {
                return i11;
            }
        }
        return -1;
    }

    public c(t0 t0Var, int[] iArr, int i11) {
        s7.a.h(iArr.length > 0);
        this.f107162d = i11;
        this.f107159a = (t0) s7.a.f(t0Var);
        int length = iArr.length;
        this.f107160b = length;
        this.f107163e = new p7.u[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f107163e[i12] = t0Var.c(iArr[i12]);
        }
        Arrays.sort(this.f107163e, new Comparator() { // from class: r8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.u((p7.u) obj, (p7.u) obj2);
            }
        });
        this.f107161c = new int[this.f107160b];
        int i13 = 0;
        while (true) {
            int i14 = this.f107160b;
            if (i13 >= i14) {
                this.f107164f = new long[i14];
                this.f107166h = false;
                return;
            } else {
                this.f107161c[i13] = t0Var.d(this.f107163e[i13]);
                i13++;
            }
        }
    }

    @Override // r8.t
    public void disable() {
    }

    @Override // r8.t
    public void enable() {
    }

    @Override // r8.t
    public void i(float f11) {
    }
}
