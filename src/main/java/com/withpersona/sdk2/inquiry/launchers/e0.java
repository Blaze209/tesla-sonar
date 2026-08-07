package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements qj0.e<ActivityResultLauncher<h.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f58286a;

    public e0(b0 b0Var) {
        this.f58286a = b0Var;
    }

    public static e0 a(b0 b0Var) {
        return new e0(b0Var);
    }

    public static ActivityResultLauncher<h.e> c(b0 b0Var) {
        return (ActivityResultLauncher) qj0.h.d(b0Var.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<h.e> get() {
        return c(this.f58286a);
    }
}
