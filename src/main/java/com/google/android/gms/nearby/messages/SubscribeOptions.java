package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class SubscribeOptions {

    @NonNull
    public static final SubscribeOptions DEFAULT = new Builder().build();
    public final boolean zza = false;
    public final int zzb = 0;
    private final Strategy zzc;
    private final MessageFilter zzd;
    private final SubscribeCallback zze;

    public static class Builder {
        private Strategy zza = Strategy.DEFAULT;
        private MessageFilter zzb = MessageFilter.INCLUDE_ALL_MY_TYPES;
        private SubscribeCallback zzc;

        @NonNull
        public SubscribeOptions build() {
            return new SubscribeOptions(this.zza, this.zzb, this.zzc, false, 0, null);
        }

        @NonNull
        public Builder setCallback(@NonNull SubscribeCallback subscribeCallback) {
            this.zzc = (SubscribeCallback) Preconditions.checkNotNull(subscribeCallback);
            return this;
        }

        @NonNull
        public Builder setFilter(@NonNull MessageFilter messageFilter) {
            this.zzb = messageFilter;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.zza = strategy;
            return this;
        }
    }

    /* synthetic */ SubscribeOptions(Strategy strategy, MessageFilter messageFilter, SubscribeCallback subscribeCallback, boolean z11, int i11, zzg zzgVar) {
        this.zzc = strategy;
        this.zzd = messageFilter;
        this.zze = subscribeCallback;
    }

    public SubscribeCallback getCallback() {
        return this.zze;
    }

    @NonNull
    public MessageFilter getFilter() {
        return this.zzd;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.zzc;
    }

    @NonNull
    public String toString() {
        MessageFilter messageFilter = this.zzd;
        return "SubscribeOptions{strategy=" + String.valueOf(this.zzc) + ", filter=" + String.valueOf(messageFilter) + "}";
    }
}
