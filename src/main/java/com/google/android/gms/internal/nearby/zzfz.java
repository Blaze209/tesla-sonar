package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnBandwidthChangedParamsCreator")
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new zzga();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getQuality", id = 2)
    private int zzb;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getMedium", id = 3)
    private final int zzc;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzjk zze;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo zzf;

    private zzfz() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfz) {
            zzfz zzfzVar = (zzfz) obj;
            if (Objects.equal(this.zza, zzfzVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzfzVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzfzVar.zzc)) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzfzVar.zzd)) && Objects.equal(this.zze, zzfzVar.zze) && Objects.equal(this.zzf, zzfzVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzfz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) zzjk zzjkVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzjkVar;
        this.zzf = zzoVar;
    }
}
