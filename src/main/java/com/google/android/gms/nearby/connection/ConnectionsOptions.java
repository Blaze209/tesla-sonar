package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectionsOptions implements Api.ApiOptions.Optional {
    private final String zza = null;

    public static class Builder {
        @NonNull
        public ConnectionsOptions build() {
            return new ConnectionsOptions(this, null);
        }
    }

    /* synthetic */ ConnectionsOptions(Builder builder, zzq zzqVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionsOptions) {
            return Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }
}
