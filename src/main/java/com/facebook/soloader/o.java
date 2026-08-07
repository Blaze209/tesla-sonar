package com.facebook.soloader;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
public class o implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f23965a;

    public o(w wVar) {
        this.f23965a = wVar;
    }

    @Override // com.facebook.soloader.w
    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public void a(String str, int i11) {
        cp.b.j(this.f23965a, "load", i11);
        try {
            this.f23965a.a(str, i11);
            cp.b.i(null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                cp.b.i(th2);
                throw th3;
            }
        }
    }
}
