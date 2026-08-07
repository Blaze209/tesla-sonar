package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import ch.qos.logback.classic.Level;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.nearby.zzpm;
import com.google.android.gms.internal.nearby.zzpt;

/* JADX INFO: loaded from: classes5.dex */
public final class UwbRangeDataNtfConfig {
    public static final zzpt zza = zzpt.zzo(0, 1, 2, 3);

    @RangeDataNtfConfig
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public static class Builder {
        private int zza = 1;
        private int zzb = 0;
        private int zzc = Level.INFO_INT;

        @NonNull
        public UwbRangeDataNtfConfig build() {
            return new UwbRangeDataNtfConfig(this.zza, this.zzb, this.zzc, null);
        }

        @NonNull
        public Builder setNtfProximityFar(int i11) {
            this.zzc = i11;
            return this;
        }

        @NonNull
        public Builder setNtfProximityNear(int i11) {
            this.zzb = i11;
            return this;
        }

        @NonNull
        public Builder setRangeDataConfigType(int i11) {
            this.zza = i11;
            return this;
        }
    }

    public @interface RangeDataNtfConfig {
        public static final int RANGE_DATA_NTF_DISABLE = 0;
        public static final int RANGE_DATA_NTF_ENABLE = 1;
        public static final int RANGE_DATA_NTF_ENABLE_PROXIMITY_EDGE_TRIG = 3;
        public static final int RANGE_DATA_NTF_ENABLE_PROXIMITY_LEVEL_TRIG = 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* synthetic */ UwbRangeDataNtfConfig(int i11, int i12, int i13, zzf zzfVar) {
        zzpm.zze(zza.contains(Integer.valueOf(i11)), "Invalid/unsupported range data notification config");
        boolean z11 = true;
        zzpm.zze(i12 <= i13, "Proximity near cannot be greater than proximity far");
        if (i11 == 1) {
            if (i12 == 0) {
                z11 = false;
            } else if (i13 == 20000) {
                i13 = 20000;
                i12 = 0;
            } else {
                i12 = 0;
                z11 = false;
            }
            zzpm.zze(z11, "Proximity near and far distances are not set to default");
        } else if (i11 == 0) {
            i11 = 0;
            if (i12 == 0) {
                z11 = false;
            } else if (i13 == 20000) {
                i13 = 20000;
                i12 = 0;
            } else {
                i12 = 0;
                z11 = false;
            }
            zzpm.zze(z11, "Proximity near and far distances are not set to default");
        }
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbRangeDataNtfConfig)) {
            return false;
        }
        UwbRangeDataNtfConfig uwbRangeDataNtfConfig = (UwbRangeDataNtfConfig) obj;
        return this.zzb == uwbRangeDataNtfConfig.zzb && this.zzc == uwbRangeDataNtfConfig.zzc && this.zzd == uwbRangeDataNtfConfig.zzd;
    }

    public int getNtfProximityFar() {
        return this.zzd;
    }

    public int getNtfProximityNear() {
        return this.zzc;
    }

    public int getRangeDataNtfConfigType() {
        return this.zzb;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    @NonNull
    public final String toString() {
        return "UwbRangeDataNtfConfig{mRangeDataNtfConfigType=" + this.zzb + ", mNtfProximityNear=" + this.zzc + ", mNtfProximityFar=" + this.zzd + "}";
    }
}
