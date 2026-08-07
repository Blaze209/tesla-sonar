package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RejectConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzhp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhp> CREATOR = new zzhq();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzfs zza;

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 2)
    private String zzb;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 4)
    private zzjk zzd;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 5)
    private com.google.android.gms.nearby.connection.zzo zze;

    private zzhp() {
        this.zzc = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhp) {
            zzhp zzhpVar = (zzhp) obj;
            if (Objects.equal(this.zza, zzhpVar.zza) && Objects.equal(this.zzb, zzhpVar.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzhpVar.zzc)) && Objects.equal(this.zzd, zzhpVar.zzd) && Objects.equal(this.zze, zzhpVar.zze)) {
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
        zzfs zzfsVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzfsVar == null ? null : zzfsVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzhp(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) zzjk zzjkVar, @SafeParcelable.Param(id = 5) com.google.android.gms.nearby.connection.zzo zzoVar) {
        zzfs zzfqVar;
        if (iBinder == null) {
            zzfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzfqVar = iInterfaceQueryLocalInterface instanceof zzfs ? (zzfs) iInterfaceQueryLocalInterface : new zzfq(iBinder);
        }
        this.zza = zzfqVar;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = zzjkVar;
        this.zze = zzoVar;
    }
}
