package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class m implements ww.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f44003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f44004b;

    public m(f0 f0Var, jv.g gVar) {
        this.f44003a = f0Var;
        this.f44004b = new l(gVar);
    }

    @Override // ww.c
    public boolean a() {
        return this.f44003a.d();
    }

    @Override // ww.c
    @NonNull
    public ww.c.a b() {
        return ww.c.a.CRASHLYTICS;
    }

    @Override // ww.c
    public void c(@NonNull ww.c.SessionDetails sessionDetails) {
        bv.g.f().b("App Quality Sessions session changed: " + sessionDetails);
        this.f44004b.f(sessionDetails.getSessionId());
    }

    public String d(@NonNull String str) {
        return this.f44004b.c(str);
    }

    public void e(String str) {
        this.f44004b.g(str);
    }
}
