package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class UwbComplexChannel {
    private final int zza;
    private final int zzb;

    public static class Builder {
        private int zza;
        private int zzb;

        @NonNull
        public UwbComplexChannel build() {
            return new UwbComplexChannel(this.zza, this.zzb, null);
        }

        @NonNull
        public Builder setChannel(int i11) {
            this.zza = i11;
            return this;
        }

        @NonNull
        public Builder setPreambleIndex(int i11) {
            this.zzb = i11;
            return this;
        }
    }

    /* synthetic */ UwbComplexChannel(int i11, int i12, zzb zzbVar) {
        this.zza = i11;
        this.zzb = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbComplexChannel)) {
            return false;
        }
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) obj;
        return this.zza == uwbComplexChannel.zza && this.zzb == uwbComplexChannel.zzb;
    }

    public int getChannel() {
        return this.zza;
    }

    public int getPreambleIndex() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        return "UwbComplexChannel{channel=" + this.zza + ", preambleIndex=" + this.zzb + "}";
    }
}
