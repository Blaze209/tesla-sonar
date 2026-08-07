package r9;

import com.google.common.collect.x;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p7.f0;
import p7.u;
import s7.c0;
import w8.h0;
import w8.r0;

/* JADX INFO: loaded from: classes3.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f107348o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f107349p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f107350n;

    h() {
    }

    private static boolean n(c0 c0Var, byte[] bArr) {
        if (c0Var.a() < bArr.length) {
            return false;
        }
        int iG = c0Var.g();
        byte[] bArr2 = new byte[bArr.length];
        c0Var.q(bArr2, 0, bArr.length);
        c0Var.b0(iG);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(c0 c0Var) {
        return n(c0Var, f107348o);
    }

    @Override // r9.i
    protected long f(c0 c0Var) {
        return c(h0.e(c0Var.f()));
    }

    @Override // r9.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(c0 c0Var, long j11, i.b bVar) {
        if (n(c0Var, f107348o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c0Var.f(), c0Var.j());
            int iC = h0.c(bArrCopyOf);
            List<byte[]> listA = h0.a(bArrCopyOf);
            if (bVar.f107364a != null) {
                return true;
            }
            bVar.f107364a = new u.b().W("audio/ogg").y0("audio/opus").T(iC).z0(48000).k0(listA).P();
            return true;
        }
        byte[] bArr = f107349p;
        if (!n(c0Var, bArr)) {
            s7.a.j(bVar.f107364a);
            return false;
        }
        s7.a.j(bVar.f107364a);
        if (this.f107350n) {
            return true;
        }
        this.f107350n = true;
        c0Var.c0(bArr.length);
        f0 f0VarD = r0.d(x.o(r0.k(c0Var, false, false).f121402b));
        if (f0VarD == null) {
            return true;
        }
        bVar.f107364a = bVar.f107364a.b().r0(f0VarD.b(bVar.f107364a.f101541l)).P();
        return true;
    }

    @Override // r9.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f107350n = false;
        }
    }
}
