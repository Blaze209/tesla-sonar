package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface a2 {

    public interface a {
        void a(z1 z1Var);
    }

    static int B(int i11, int i12, int i13) {
        return u(i11, i12, i13, 0, 128);
    }

    static int g(int i11) {
        return B(i11, 0, 0);
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

    @SuppressLint({"WrongConstant"})
    static int u(int i11, int i12, int i13, int i14, int i15) {
        return i11 | i12 | i13 | i14 | i15;
    }

    @SuppressLint({"WrongConstant"})
    static int v(int i11) {
        return i11 & 32;
    }

    int A();

    default void E(a aVar) {
    }

    int b(u0 u0Var);

    int c();

    String getName();

    default void r() {
    }
}
