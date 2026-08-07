package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements qj0.e<ActivityResultLauncher<Uri>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f58302a;

    public o(h hVar) {
        this.f58302a = hVar;
    }

    public static o a(h hVar) {
        return new o(hVar);
    }

    public static ActivityResultLauncher<Uri> c(h hVar) {
        return (ActivityResultLauncher) qj0.h.d(hVar.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultLauncher<Uri> get() {
        return c(this.f58302a);
    }
}
