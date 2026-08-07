package com.google.firebase.crashlytics.ndk;

import gv.f0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
class g implements bv.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f44130a;

    g(f fVar) {
        this.f44130a = fVar;
    }

    @Override // bv.h
    public File a() {
        return this.f44130a.f44119f;
    }

    @Override // bv.h
    public f0.a b() {
        f.c cVar = this.f44130a.f44114a;
        if (cVar != null) {
            return cVar.f44129b;
        }
        return null;
    }

    @Override // bv.h
    public File c() {
        return this.f44130a.f44114a.f44128a;
    }

    @Override // bv.h
    public File d() {
        return this.f44130a.f44118e;
    }

    @Override // bv.h
    public File e() {
        return this.f44130a.f44120g;
    }

    @Override // bv.h
    public File f() {
        return this.f44130a.f44117d;
    }

    @Override // bv.h
    public File g() {
        return this.f44130a.f44116c;
    }
}
