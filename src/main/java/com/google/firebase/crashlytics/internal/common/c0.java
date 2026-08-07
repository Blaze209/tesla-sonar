package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c0 {
    @NonNull
    public static c0 a(gv.f0 f0Var, String str, File file) {
        return new b(f0Var, str, file);
    }

    public abstract gv.f0 b();

    public abstract File c();

    public abstract String d();
}
