package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.uwb.RangingPosition;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangingPositionParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();

    @SafeParcelable.Field(getter = "getDistance", id = 1)
    private zzme zza;

    @SafeParcelable.Field(getter = "getAzimuth", id = 2)
    private zzme zzb;

    @SafeParcelable.Field(getter = "getElevation", id = 3)
    private zzme zzc;

    @SafeParcelable.Field(getter = "getElapsedRealtimeNanos", id = 4)
    private long zzd;

    @SafeParcelable.Field(defaultValue = "-128", getter = "getRssi", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getDlTdoaMeasurement", id = 6)
    private zzka zzf;

    private zzmk() {
        this.zze = RangingPosition.RSSI_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmk) {
            zzmk zzmkVar = (zzmk) obj;
            if (Objects.equal(this.zza, zzmkVar.zza) && Objects.equal(this.zzb, zzmkVar.zzb) && Objects.equal(this.zzc, zzmkVar.zzc) && Objects.equal(Long.valueOf(this.zzd), Long.valueOf(zzmkVar.zzd)) && Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzmkVar.zze)) && Objects.equal(this.zzf, zzmkVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Long.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzd;
    }

    public final zzka zzc() {
        return this.zzf;
    }

    public final zzme zzd() {
        return this.zzb;
    }

    public final zzme zze() {
        return this.zza;
    }

    public final zzme zzf() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    zzmk(@SafeParcelable.Param(id = 1) zzme zzmeVar, @SafeParcelable.Param(id = 2) zzme zzmeVar2, @SafeParcelable.Param(id = 3) zzme zzmeVar3, @SafeParcelable.Param(id = 4) long j11, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) zzka zzkaVar) {
        this.zza = zzmeVar;
        this.zzb = zzmeVar2;
        this.zzc = zzmeVar3;
        this.zzd = j11;
        this.zze = i11;
        this.zzf = zzkaVar;
    }
}
