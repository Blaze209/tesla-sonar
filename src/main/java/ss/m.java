package ss;

import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f111682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f111684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f111688g;

    public m(boolean z11, int i11) {
        this(z11, i11, 0);
    }

    @Override // ss.b
    public synchronized void a() {
        try {
            int i11 = 0;
            int iMax = Math.max(0, p0.l(this.f111685d, this.f111683b) - this.f111686e);
            int i12 = this.f111687f;
            if (iMax >= i12) {
                return;
            }
            if (this.f111684c != null) {
                int i13 = i12 - 1;
                while (i11 <= i13) {
                    a aVar = (a) ts.a.e(this.f111688g[i11]);
                    if (aVar.f111637a == this.f111684c) {
                        i11++;
                    } else {
                        a aVar2 = (a) ts.a.e(this.f111688g[i13]);
                        if (aVar2.f111637a != this.f111684c) {
                            i13--;
                        } else {
                            a[] aVarArr = this.f111688g;
                            aVarArr[i11] = aVar2;
                            aVarArr[i13] = aVar;
                            i13--;
                            i11++;
                        }
                    }
                }
                iMax = Math.max(iMax, i11);
                if (iMax >= this.f111687f) {
                    return;
                }
            }
            Arrays.fill(this.f111688g, iMax, this.f111687f, (Object) null);
            this.f111687f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ss.b
    public synchronized a b() {
        a aVar;
        try {
            this.f111686e++;
            int i11 = this.f111687f;
            if (i11 > 0) {
                a[] aVarArr = this.f111688g;
                int i12 = i11 - 1;
                this.f111687f = i12;
                aVar = (a) ts.a.e(aVarArr[i12]);
                this.f111688g[this.f111687f] = null;
            } else {
                aVar = new a(new byte[this.f111683b], 0);
                int i13 = this.f111686e;
                a[] aVarArr2 = this.f111688g;
                if (i13 > aVarArr2.length) {
                    this.f111688g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // ss.b
    public int c() {
        return this.f111683b;
    }

    @Override // ss.b
    public synchronized void d(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f111688g;
                int i11 = this.f111687f;
                this.f111687f = i11 + 1;
                aVarArr[i11] = aVar.a();
                this.f111686e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // ss.b
    public synchronized void e(a aVar) {
        a[] aVarArr = this.f111688g;
        int i11 = this.f111687f;
        this.f111687f = i11 + 1;
        aVarArr[i11] = aVar;
        this.f111686e--;
        notifyAll();
    }

    public synchronized int f() {
        return this.f111686e * this.f111683b;
    }

    public synchronized void g() {
        if (this.f111682a) {
            h(0);
        }
    }

    public synchronized void h(int i11) {
        boolean z11 = i11 < this.f111685d;
        this.f111685d = i11;
        if (z11) {
            a();
        }
    }

    public m(boolean z11, int i11, int i12) {
        ts.a.a(i11 > 0);
        ts.a.a(i12 >= 0);
        this.f111682a = z11;
        this.f111683b = i11;
        this.f111687f = i12;
        this.f111688g = new a[i12 + 100];
        if (i12 <= 0) {
            this.f111684c = null;
            return;
        }
        this.f111684c = new byte[i12 * i11];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f111688g[i13] = new a(this.f111684c, i13 * i11);
        }
    }
}
