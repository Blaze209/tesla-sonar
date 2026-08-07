package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zzka;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class RangingPosition {
    public static final int RSSI_MAX = -1;
    public static final int RSSI_MIN = -127;
    public static final int RSSI_UNKNOWN = -128;
    private final RangingMeasurement zza;
    private final RangingMeasurement zzb;
    private final RangingMeasurement zzc;
    private final long zzd;
    private final int zze;
    private final zzka zzf;

    public RangingPosition(RangingMeasurement rangingMeasurement, RangingMeasurement rangingMeasurement2, RangingMeasurement rangingMeasurement3, long j11, int i11, zzka zzkaVar) {
        this.zza = rangingMeasurement;
        this.zzb = rangingMeasurement2;
        this.zzc = rangingMeasurement3;
        this.zzd = j11;
        this.zze = i11;
        this.zzf = zzkaVar;
    }

    public RangingMeasurement getAzimuth() {
        return this.zzb;
    }

    @NonNull
    public RangingMeasurement getDistance() {
        return this.zza;
    }

    public long getElapsedRealtimeNanos() {
        return this.zzd;
    }

    public RangingMeasurement getElevation() {
        return this.zzc;
    }

    public int getRssiDbm() {
        return this.zze;
    }

    @NonNull
    public String toString() {
        long j11 = this.zzd;
        Locale locale = Locale.US;
        String strConcat = String.format(locale, "elapsedRealtime (ms) %d | distance (m) %f", Long.valueOf(j11 / 1000000), Float.valueOf(this.zza.getValue()));
        RangingMeasurement rangingMeasurement = this.zzb;
        if (rangingMeasurement != null) {
            strConcat = strConcat.concat(String.format(locale, " | azimuth: %f", Float.valueOf(rangingMeasurement.getValue())));
        }
        RangingMeasurement rangingMeasurement2 = this.zzc;
        if (rangingMeasurement2 != null) {
            strConcat = String.valueOf(strConcat).concat(String.format(locale, " | elevation: %f", Float.valueOf(rangingMeasurement2.getValue())));
        }
        return String.valueOf(strConcat).concat(String.format(locale, " | rssi: %d", Integer.valueOf(this.zze)));
    }
}
