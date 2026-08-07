package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements qj0.e<ActivityResultLauncher<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f58312a;

    public y(v vVar) {
        this.f58312a = vVar;
    }

    public static y a(v vVar) {
        return new y(vVar);
    }

    public static ActivityResultLauncher<String> c(v vVar) {
        return (ActivityResultLauncher) qj0.h.d(vVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<String> get() {
        return c(this.f58312a);
    }
}
