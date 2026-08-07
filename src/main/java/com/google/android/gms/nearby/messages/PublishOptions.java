package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class PublishOptions {

    @NonNull
    public static final PublishOptions DEFAULT = new Builder().build();
    private final Strategy zza;
    private final PublishCallback zzb;

    public static class Builder {
        private Strategy zza = Strategy.DEFAULT;
        private PublishCallback zzb;

        @NonNull
        public PublishOptions build() {
            return new PublishOptions(this.zza, this.zzb, null);
        }

        @NonNull
        public Builder setCallback(@NonNull PublishCallback publishCallback) {
            this.zzb = (PublishCallback) Preconditions.checkNotNull(publishCallback);
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.zza = (Strategy) Preconditions.checkNotNull(strategy);
            return this;
        }
    }

    /* synthetic */ PublishOptions(Strategy strategy, PublishCallback publishCallback, zze zzeVar) {
        this.zza = strategy;
        this.zzb = publishCallback;
    }

    public PublishCallback getCallback() {
        return this.zzb;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.zza;
    }
}
