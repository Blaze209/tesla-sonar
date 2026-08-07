package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements qj0.e<ActivityResultLauncher<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f58304a;

    public s(p pVar) {
        this.f58304a = pVar;
    }

    public static s a(p pVar) {
        return new s(pVar);
    }

    public static ActivityResultLauncher<String[]> c(p pVar) {
        return (ActivityResultLauncher) qj0.h.d(pVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<String[]> get() {
        return c(this.f58304a);
    }
}
