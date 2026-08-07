package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionResolution {
    private final Status zza;

    @Deprecated
    public ConnectionResolution(@NonNull Status status) {
        this.zza = status;
    }

    @NonNull
    public Status getStatus() {
        return this.zza;
    }
}
