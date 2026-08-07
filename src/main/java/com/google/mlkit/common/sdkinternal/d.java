package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.b f45035a;

    public d(@NonNull yv.b bVar) {
        this.f45035a = bVar;
    }

    @NonNull
    @KeepForSdk
    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f45035a.get();
    }
}
