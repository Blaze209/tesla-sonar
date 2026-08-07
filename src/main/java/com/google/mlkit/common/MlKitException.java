package com.google.mlkit.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public class MlKitException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45024a;

    @KeepForSdk
    public MlKitException(@NonNull String str, int i11) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f45024a = i11;
    }

    public int a() {
        return this.f45024a;
    }

    @KeepForSdk
    public MlKitException(@NonNull String str, int i11, Throwable th2) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), th2);
        this.f45024a = i11;
    }
}
