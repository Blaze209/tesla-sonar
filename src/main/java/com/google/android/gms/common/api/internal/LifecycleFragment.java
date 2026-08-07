package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    @KeepForSdk
    <T extends LifecycleCallback> T getCallbackOrNull(@NonNull String str, @NonNull Class<T> cls);

    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@NonNull Intent intent, int i11);
}
