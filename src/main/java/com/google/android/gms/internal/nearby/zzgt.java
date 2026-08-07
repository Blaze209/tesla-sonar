package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnPayloadTransferUpdateParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgt> CREATOR = new zzgu();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getUpdate", id = 2)
    private PayloadTransferUpdate zzb;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 4)
    private zzjk zzd;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo zze;

    private zzgt() {
        this.zzc = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgtVar = (zzgt) obj;
            if (Objects.equal(this.zza, zzgtVar.zza) && Objects.equal(this.zzb, zzgtVar.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzgtVar.zzc)) && Objects.equal(this.zzd, zzgtVar.zzd) && Objects.equal(this.zze, zzgtVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final PayloadTransferUpdate zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzgt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) PayloadTransferUpdate payloadTransferUpdate, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) zzjk zzjkVar, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = payloadTransferUpdate;
        this.zzc = i11;
        this.zzd = zzjkVar;
        this.zze = zzoVar;
    }
}
