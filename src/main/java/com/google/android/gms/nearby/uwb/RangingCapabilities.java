package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzpk;
import com.google.android.gms.internal.nearby.zzpt;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RangingCapabilities {
    public static final boolean DEFAULT_SUPPORTS_RANGING_INTERVAL_RECONFIGURE = false;
    public static final float FIRA_DEFAULT_MIN_SLOT_DURATION_MS = 2.0f;
    public static final int FIRA_DEFAULT_RANGING_INTERVAL_MS = 200;
    public static final int FIRA_DEFAULT_SUPPORTED_CHANNEL = 9;
    public static final int RANGE_DATA_NTF_ENABLE = 1;
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final int zze;
    private final zzpt zzf;
    private final zzpt zzg;
    private final zzpt zzh;
    private final zzpt zzi;
    private final zzpt zzj;
    private final boolean zzk;

    @NonNull
    public static final List<Integer> FIRA_DEFAULT_SUPPORTED_CONFIG_IDS = zzpt.zzp(1, 2, 3, 1000, 1001);

    @NonNull
    public static final List<Integer> DEFAULT_SUPPORTED_SLOT_DURATIONS = zzpt.zzl(2);

    @NonNull
    public static final List<Integer> DEFAULT_SUPPORTED_RANGING_UPDATE_RATES = zzpt.zzm(1, 2);

    public RangingCapabilities(boolean z11, boolean z12, boolean z13, boolean z14, int i11, zzpt zzptVar, zzpt zzptVar2, zzpt zzptVar3, zzpt zzptVar4, zzpt zzptVar5, boolean z15) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = z13;
        this.zzd = z14;
        this.zze = i11;
        this.zzf = zzptVar;
        this.zzg = zzptVar2;
        this.zzh = zzptVar3;
        this.zzi = zzptVar4;
        this.zzj = zzptVar5;
        this.zzk = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangingCapabilities)) {
            return false;
        }
        RangingCapabilities rangingCapabilities = (RangingCapabilities) obj;
        return this.zza == rangingCapabilities.zza && this.zzb == rangingCapabilities.zzb && this.zzc == rangingCapabilities.zzc && this.zzd == rangingCapabilities.zzd && getMinRangingInterval() == rangingCapabilities.getMinRangingInterval() && zzpk.zza(getSupportedChannels(), rangingCapabilities.getSupportedChannels()) && zzpk.zza(getSupportedNtfConfigs(), rangingCapabilities.getSupportedNtfConfigs()) && zzpk.zza(getSupportedConfigIds(), rangingCapabilities.getSupportedConfigIds()) && zzpk.zza(getSupportedSlotDurations(), rangingCapabilities.getSupportedSlotDurations()) && zzpk.zza(getSupportedRangingUpdateRates(), rangingCapabilities.getSupportedRangingUpdateRates()) && this.zzk == rangingCapabilities.zzk;
    }

    public int getMinRangingInterval() {
        return this.zze;
    }

    @NonNull
    public List<Integer> getSupportedChannels() {
        return this.zzf;
    }

    @NonNull
    public List<Integer> getSupportedConfigIds() {
        return this.zzh;
    }

    @NonNull
    public List<Integer> getSupportedNtfConfigs() {
        return this.zzg;
    }

    @NonNull
    public List<Integer> getSupportedRangingUpdateRates() {
        return this.zzj;
    }

    @NonNull
    public List<Integer> getSupportedSlotDurations() {
        return this.zzi;
    }

    public boolean hasBackgroundRangingSupport() {
        return this.zzk;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Integer.valueOf(getMinRangingInterval()), getSupportedChannels(), getSupportedNtfConfigs(), getSupportedConfigIds(), getSupportedSlotDurations(), getSupportedRangingUpdateRates(), Boolean.valueOf(this.zzk)});
    }

    public boolean supportsAzimuthalAngle() {
        return this.zzb;
    }

    public boolean supportsDistance() {
        return this.zza;
    }

    public boolean supportsElevationAngle() {
        return this.zzc;
    }

    public boolean supportsRangingIntervalReconfigure() {
        return this.zzd;
    }

    @NonNull
    public String toString() {
        zzpt zzptVar = this.zzj;
        zzpt zzptVar2 = this.zzi;
        zzpt zzptVar3 = this.zzh;
        zzpt zzptVar4 = this.zzg;
        return "RangingCapabilities{supportsDistance=" + this.zza + ", supportsAzimuthalAngle=" + this.zzb + ", supportsElevationAngle=" + this.zzc + ", supportsRangingIntervalReconfigure=" + this.zzd + ", minRangingInterval=" + this.zze + ", supportedChannels=" + String.valueOf(this.zzf) + ", supportedNtfConfigs=" + String.valueOf(zzptVar4) + ", supportedConfigIds=" + String.valueOf(zzptVar3) + ", supportedSlotDurations=" + String.valueOf(zzptVar2) + ", supportedRangingUpdateRates=" + String.valueOf(zzptVar) + "}";
    }
}
