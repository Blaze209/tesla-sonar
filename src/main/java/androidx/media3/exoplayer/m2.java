package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes.dex */
public interface m2 {

    public interface a {
        void d(l2 l2Var);
    }

    static int B(int i11, int i12, int i13, int i14) {
        return F(i11, i12, i13, 0, 128, i14);
    }

    @SuppressLint({"WrongConstant"})
    static int D(int i11) {
        return i11 & 3584;
    }

    @SuppressLint({"WrongConstant"})
    static int F(int i11, int i12, int i13, int i14, int i15, int i16) {
        return i11 | i12 | i13 | i14 | i15 | i16;
    }

    static boolean J(int i11, boolean z11) {
        int iQ = q(i11);
        if (iQ != 4) {
            return z11 && iQ == 3;
        }
        return true;
    }

    static int g(int i11) {
        return B(i11, 0, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int i(int i11) {
        return i11 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int m(int i11) {
        return i11 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int q(int i11) {
        return i11 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int s(int i11) {
        return i11 & KyberEngine.KyberPolyBytes;
    }

    static int u(int i11, int i12, int i13, int i14, int i15) {
        return F(i11, i12, i13, i14, i15, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int v(int i11) {
        return i11 & 32;
    }

    int A();

    default void O(a aVar) {
    }

    int b(p7.u uVar);

    int c();

    String getName();

    default void r() {
    }
}
