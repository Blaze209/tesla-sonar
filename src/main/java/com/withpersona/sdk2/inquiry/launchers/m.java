package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qj0.e<ActivityResultLauncher<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f58300a;

    public m(h hVar) {
        this.f58300a = hVar;
    }

    public static m a(h hVar) {
        return new m(hVar);
    }

    public static ActivityResultLauncher<String[]> c(h hVar) {
        return (ActivityResultLauncher) qj0.h.d(hVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<String[]> get() {
        return c(this.f58300a);
    }
}
