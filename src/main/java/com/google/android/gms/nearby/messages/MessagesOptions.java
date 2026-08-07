package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class MessagesOptions implements Api.ApiOptions.Optional {
    public final int zzc;
    public final String zza = null;
    public final boolean zzb = false;

    @NonNull
    public final String zzd = null;

    @NonNull
    public final String zze = null;

    public static class Builder {
        private int zza = -1;

        @NonNull
        public MessagesOptions build() {
            return new MessagesOptions(this, null);
        }

        @NonNull
        public Builder setPermissions(int i11) {
            this.zza = i11;
            return this;
        }
    }

    /* synthetic */ MessagesOptions(Builder builder, zzd zzdVar) {
        this.zzc = builder.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessagesOptions) {
            return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && this.zzc == ((MessagesOptions) obj).zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.FALSE, null, null, Integer.valueOf(this.zzc));
    }
}
