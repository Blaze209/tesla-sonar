package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnDisconnectedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgj> CREATOR = new zzgk();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 3)
    private zzjk zzc;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 4)
    private com.google.android.gms.nearby.connection.zzo zzd;

    private zzgj() {
        this.zzb = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgj) {
            zzgj zzgjVar = (zzgj) obj;
            if (Objects.equal(this.zza, zzgjVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzgjVar.zzb)) && Objects.equal(this.zzc, zzgjVar.zzc) && Objects.equal(this.zzd, zzgjVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzgj(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) zzjk zzjkVar, @SafeParcelable.Param(id = 4) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = zzjkVar;
        this.zzd = zzoVar;
    }
}
