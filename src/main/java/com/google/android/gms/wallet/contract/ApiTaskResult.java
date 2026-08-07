package com.google.android.gms.wallet.contract;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* JADX INFO: loaded from: classes5.dex */
public class ApiTaskResult<T> {
    private final Object zza;
    private final Status zzb;

    public ApiTaskResult(T t11, @NonNull Status status) {
        this.zza = t11;
        this.zzb = status;
    }

    public T getResult() {
        return (T) this.zza;
    }

    @NonNull
    public Status getStatus() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add(PermissionsResponse.STATUS_KEY, this.zzb).add("result", this.zza).toString();
    }

    public ApiTaskResult(@NonNull Status status) {
        this(null, status);
    }
}
