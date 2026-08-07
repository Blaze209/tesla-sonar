package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<ActivityResultLauncher<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f58287a;

    public f(d dVar) {
        this.f58287a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static ActivityResultLauncher<b> b(d dVar) {
        return (ActivityResultLauncher) qj0.h.d(dVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<b> get() {
        return b(this.f58287a);
    }
}
