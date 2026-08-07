package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "SendPayloadParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzhx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhx> CREATOR = new zzhy();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzfs zza;

    @SafeParcelable.Field(getter = "getRemoteEndpointIds", id = 2)
    private String[] zzb;

    @SafeParcelable.Field(getter = "getPayload", id = 3)
    private zzhk zzc;

    @SafeParcelable.Field(getter = "getSendReliably", id = 4)
    private boolean zzd;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 6)
    private zzjk zzf;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 7)
    private com.google.android.gms.nearby.connection.zzo zzg;

    private zzhx() {
        this.zze = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhx) {
            zzhx zzhxVar = (zzhx) obj;
            if (Objects.equal(this.zza, zzhxVar.zza) && Arrays.equals(this.zzb, zzhxVar.zzb) && Objects.equal(this.zzc, zzhxVar.zzc) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzhxVar.zzd)) && Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzhxVar.zze)) && Objects.equal(this.zzf, zzhxVar.zzf) && Objects.equal(this.zzg, zzhxVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, Boolean.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf, this.zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzfs zzfsVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzfsVar == null ? null : zzfsVar.asBinder(), false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzhx(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) zzhk zzhkVar, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) zzjk zzjkVar, @SafeParcelable.Param(id = 7) com.google.android.gms.nearby.connection.zzo zzoVar) {
        zzfs zzfqVar;
        if (iBinder == null) {
            zzfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzfqVar = iInterfaceQueryLocalInterface instanceof zzfs ? (zzfs) iInterfaceQueryLocalInterface : new zzfq(iBinder);
        }
        this.zza = zzfqVar;
        this.zzb = strArr;
        this.zzc = zzhkVar;
        this.zzd = z11;
        this.zze = i11;
        this.zzf = zzjkVar;
        this.zzg = zzoVar;
    }
}
