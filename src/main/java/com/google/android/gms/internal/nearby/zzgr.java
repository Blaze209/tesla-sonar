package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnPayloadReceivedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgr> CREATOR = new zzgs();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getPayload", id = 2)
    private zzhk zzb;

    @SafeParcelable.Field(getter = "getIsReliable", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzjk zze;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo zzf;

    private zzgr() {
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            if (Objects.equal(this.zza, zzgrVar.zza) && Objects.equal(this.zzb, zzgrVar.zzb) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzgrVar.zzc)) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzgrVar.zzd)) && Objects.equal(this.zze, zzgrVar.zze) && Objects.equal(this.zzf, zzgrVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzhk zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    zzgr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) zzhk zzhkVar, @SafeParcelable.Param(id = 3) boolean z11, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) zzjk zzjkVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = zzhkVar;
        this.zzc = z11;
        this.zzd = i11;
        this.zze = zzjkVar;
        this.zzf = zzoVar;
    }
}
