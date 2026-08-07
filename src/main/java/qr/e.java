package qr;

import hr.l;
import hr.n;
import java.util.Arrays;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f105879a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f105880b = new d0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f105881c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f105883e;

    e() {
    }

    private int a(int i11) {
        int i12;
        int i13 = 0;
        this.f105882d = 0;
        do {
            int i14 = this.f105882d;
            int i15 = i11 + i14;
            f fVar = this.f105879a;
            if (i15 >= fVar.f105890g) {
                break;
            }
            int[] iArr = fVar.f105893j;
            this.f105882d = i14 + 1;
            i12 = iArr[i14 + i11];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    public f b() {
        return this.f105879a;
    }

    public d0 c() {
        return this.f105880b;
    }

    public boolean d(l lVar) {
        int i11;
        ts.a.g(lVar != null);
        if (this.f105883e) {
            this.f105883e = false;
            this.f105880b.Q(0);
        }
        while (!this.f105883e) {
            if (this.f105881c < 0) {
                if (!this.f105879a.c(lVar) || !this.f105879a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f105879a;
                int iA = fVar.f105891h;
                if ((fVar.f105885b & 1) == 1 && this.f105880b.g() == 0) {
                    iA += a(0);
                    i11 = this.f105882d;
                } else {
                    i11 = 0;
                }
                if (!n.e(lVar, iA)) {
                    return false;
                }
                this.f105881c = i11;
            }
            int iA2 = a(this.f105881c);
            int i12 = this.f105881c + this.f105882d;
            if (iA2 > 0) {
                d0 d0Var = this.f105880b;
                d0Var.c(d0Var.g() + iA2);
                if (!n.d(lVar, this.f105880b.e(), this.f105880b.g(), iA2)) {
                    return false;
                }
                d0 d0Var2 = this.f105880b;
                d0Var2.T(d0Var2.g() + iA2);
                this.f105883e = this.f105879a.f105893j[i12 + (-1)] != 255;
            }
            if (i12 == this.f105879a.f105890g) {
                i12 = -1;
            }
            this.f105881c = i12;
        }
        return true;
    }

    public void e() {
        this.f105879a.b();
        this.f105880b.Q(0);
        this.f105881c = -1;
        this.f105883e = false;
    }

    public void f() {
        if (this.f105880b.e().length == 65025) {
            return;
        }
        d0 d0Var = this.f105880b;
        d0Var.S(Arrays.copyOf(d0Var.e(), Math.max(65025, this.f105880b.g())), this.f105880b.g());
    }
}
