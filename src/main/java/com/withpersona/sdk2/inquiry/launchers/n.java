package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qj0.e<ActivityResultLauncher<h.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f58301a;

    public n(h hVar) {
        this.f58301a = hVar;
    }

    public static n a(h hVar) {
        return new n(hVar);
    }

    public static ActivityResultLauncher<h.f> c(h hVar) {
        return (ActivityResultLauncher) qj0.h.d(hVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<h.f> get() {
        return c(this.f58301a);
    }
}
