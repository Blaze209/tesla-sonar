package r9;

import java.util.Arrays;
import s7.c0;
import w8.q;
import w8.s;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f107332a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f107333b = new c0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107334c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f107335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f107336e;

    e() {
    }

    private int a(int i11) {
        int i12;
        int i13 = 0;
        this.f107335d = 0;
        do {
            int i14 = this.f107335d;
            int i15 = i11 + i14;
            f fVar = this.f107332a;
            if (i15 >= fVar.f107343g) {
                break;
            }
            int[] iArr = fVar.f107346j;
            this.f107335d = i14 + 1;
            i12 = iArr[i14 + i11];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    public f b() {
        return this.f107332a;
    }

    public c0 c() {
        return this.f107333b;
    }

    public boolean d(q qVar) {
        int i11;
        s7.a.h(qVar != null);
        if (this.f107336e) {
            this.f107336e = false;
            this.f107333b.X(0);
        }
        while (!this.f107336e) {
            if (this.f107334c < 0) {
                if (!this.f107332a.c(qVar) || !this.f107332a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f107332a;
                int iA = fVar.f107344h;
                if ((fVar.f107338b & 1) == 1 && this.f107333b.j() == 0) {
                    iA += a(0);
                    i11 = this.f107335d;
                } else {
                    i11 = 0;
                }
                if (!s.f(qVar, iA)) {
                    return false;
                }
                this.f107334c = i11;
            }
            int iA2 = a(this.f107334c);
            int i12 = this.f107334c + this.f107335d;
            if (iA2 > 0) {
                c0 c0Var = this.f107333b;
                c0Var.d(c0Var.j() + iA2);
                if (!s.e(qVar, this.f107333b.f(), this.f107333b.j(), iA2)) {
                    return false;
                }
                c0 c0Var2 = this.f107333b;
                c0Var2.a0(c0Var2.j() + iA2);
                this.f107336e = this.f107332a.f107346j[i12 + (-1)] != 255;
            }
            if (i12 == this.f107332a.f107343g) {
                i12 = -1;
            }
            this.f107334c = i12;
        }
        return true;
    }

    public void e() {
        this.f107332a.b();
        this.f107333b.X(0);
        this.f107334c = -1;
        this.f107336e = false;
    }

    public void f() {
        if (this.f107333b.f().length == 65025) {
            return;
        }
        c0 c0Var = this.f107333b;
        c0Var.Z(Arrays.copyOf(c0Var.f(), Math.max(65025, this.f107333b.j())), this.f107333b.j());
    }
}
