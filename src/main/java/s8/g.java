package s8;

import java.util.Arrays;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f110595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f110597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f110598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f110599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f110600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f110601g;

    public g(boolean z11, int i11) {
        this(z11, i11, 0);
    }

    @Override // s8.b
    public synchronized void a() {
        try {
            int i11 = 0;
            int iMax = Math.max(0, q0.n(this.f110598d, this.f110596b) - this.f110599e);
            int i12 = this.f110600f;
            if (iMax >= i12) {
                return;
            }
            if (this.f110597c != null) {
                int i13 = i12 - 1;
                while (i11 <= i13) {
                    a aVar = (a) s7.a.f(this.f110601g[i11]);
                    if (aVar.f110520a == this.f110597c) {
                        i11++;
                    } else {
                        a aVar2 = (a) s7.a.f(this.f110601g[i13]);
                        if (aVar2.f110520a != this.f110597c) {
                            i13--;
                        } else {
                            a[] aVarArr = this.f110601g;
                            aVarArr[i11] = aVar2;
                            aVarArr[i13] = aVar;
                            i13--;
                            i11++;
                        }
                    }
                }
                iMax = Math.max(iMax, i11);
                if (iMax >= this.f110600f) {
                    return;
                }
            }
            Arrays.fill(this.f110601g, iMax, this.f110600f, (Object) null);
            this.f110600f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // s8.b
    public synchronized a b() {
        a aVar;
        try {
            this.f110599e++;
            int i11 = this.f110600f;
            if (i11 > 0) {
                a[] aVarArr = this.f110601g;
                int i12 = i11 - 1;
                this.f110600f = i12;
                aVar = (a) s7.a.f(aVarArr[i12]);
                this.f110601g[this.f110600f] = null;
            } else {
                aVar = new a(new byte[this.f110596b], 0);
                int i13 = this.f110599e;
                a[] aVarArr2 = this.f110601g;
                if (i13 > aVarArr2.length) {
                    this.f110601g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // s8.b
    public int c() {
        return this.f110596b;
    }

    @Override // s8.b
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f110601g;
        int i11 = this.f110600f;
        this.f110600f = i11 + 1;
        aVarArr[i11] = aVar;
        this.f110599e--;
        notifyAll();
    }

    @Override // s8.b
    public synchronized int e() {
        return this.f110599e * this.f110596b;
    }

    @Override // s8.b
    public synchronized void f(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f110601g;
                int i11 = this.f110600f;
                this.f110600f = i11 + 1;
                aVarArr[i11] = aVar.a();
                this.f110599e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public synchronized void g() {
        if (this.f110595a) {
            h(0);
        }
    }

    public synchronized void h(int i11) {
        boolean z11 = i11 < this.f110598d;
        this.f110598d = i11;
        if (z11) {
            a();
        }
    }

    public g(boolean z11, int i11, int i12) {
        s7.a.a(i11 > 0);
        s7.a.a(i12 >= 0);
        this.f110595a = z11;
        this.f110596b = i11;
        this.f110600f = i12;
        this.f110601g = new a[i12 + 100];
        if (i12 <= 0) {
            this.f110597c = null;
            return;
        }
        this.f110597c = new byte[i12 * i11];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f110601g[i13] = new a(this.f110597c, i13 * i11);
        }
    }
}
