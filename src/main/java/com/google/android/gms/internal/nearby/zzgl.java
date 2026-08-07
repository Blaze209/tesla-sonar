package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnEndpointDistanceChangedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgl> CREATOR = new zzgm();

    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getDistance", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getUwbRangingData", id = 3)
    private com.google.android.gms.nearby.connection.zzaa zzc;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo zze;

    private zzgl() {
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgl) {
            zzgl zzglVar = (zzgl) obj;
            if (Objects.equal(this.zza, zzglVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzglVar.zzb)) && Objects.equal(this.zzc, zzglVar.zzc) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzglVar.zzd)) && Objects.equal(this.zze, zzglVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.nearby.connection.zzaa zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzgl(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) com.google.android.gms.nearby.connection.zzaa zzaaVar, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = zzaaVar;
        this.zzd = i12;
        this.zze = zzoVar;
    }
}
