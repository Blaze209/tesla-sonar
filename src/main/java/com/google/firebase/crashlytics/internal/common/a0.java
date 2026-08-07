package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jv.g f43936b;

    public a0(String str, jv.g gVar) {
        this.f43935a = str;
        this.f43936b = gVar;
    }

    private File b() {
        return this.f43936b.g(this.f43935a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e11) {
            bv.g.f().e("Error creating marker: " + this.f43935a, e11);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
