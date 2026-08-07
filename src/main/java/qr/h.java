package qr;

import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import dr.v;
import hr.e0;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f105895o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f105896p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f105897n;

    h() {
    }

    private static boolean n(d0 d0Var, byte[] bArr) {
        if (d0Var.a() < bArr.length) {
            return false;
        }
        int iF = d0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        d0Var.l(bArr2, 0, bArr.length);
        d0Var.U(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(d0 d0Var) {
        return n(d0Var, f105895o);
    }

    @Override // qr.i
    protected long f(d0 d0Var) {
        return c(v.e(d0Var.e()));
    }

    @Override // qr.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean i(d0 d0Var, long j11, i.b bVar) {
        if (n(d0Var, f105895o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d0Var.e(), d0Var.g());
            int iC = v.c(bArrCopyOf);
            List<byte[]> listA = v.a(bArrCopyOf);
            if (bVar.f105911a != null) {
                return true;
            }
            bVar.f105911a = new u0.b().g0("audio/opus").J(iC).h0(48000).V(listA).G();
            return true;
        }
        byte[] bArr = f105896p;
        if (!n(d0Var, bArr)) {
            ts.a.i(bVar.f105911a);
            return false;
        }
        ts.a.i(bVar.f105911a);
        if (this.f105897n) {
            return true;
        }
        this.f105897n = true;
        d0Var.V(bArr.length);
        ur.a aVarC = e0.c(x.o(e0.i(d0Var, false, false).f73339b));
        if (aVarC == null) {
            return true;
        }
        bVar.f105911a = bVar.f105911a.b().Z(aVarC.b(bVar.f105911a.f40710j)).G();
        return true;
    }

    @Override // qr.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f105897n = false;
        }
    }
}
