package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "SendConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzht extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzht> CREATOR = new zzhu();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzfs zza;

    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", id = 2, type = "android.os.IBinder")
    private zzfb zzb;

    @SafeParcelable.Field(getter = "getConnectionResponseListenerAsBinder", id = 3, type = "android.os.IBinder")
    private zzfh zzc;

    @SafeParcelable.Field(getter = "getName", id = 4)
    private String zzd;

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 5)
    private String zze;

    @SafeParcelable.Field(getter = "getHandshakeData", id = 6)
    private byte[] zzf;

    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", id = 7, type = "android.os.IBinder")
    private zzfe zzg;

    @SafeParcelable.Field(getter = "getEndpointInfo", id = 8)
    private byte[] zzh;

    @SafeParcelable.Field(getter = "getOptions", id = 9)
    private ConnectionOptions zzi;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 10)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 11)
    private zzjk zzk;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 14)
    private com.google.android.gms.nearby.connection.zzo zzl;

    @SafeParcelable.Field(getter = "getLocalDeviceInfo", id = 12)
    private byte[] zzm;

    @SafeParcelable.Field(getter = "getServiceId", id = 13)
    private String zzn;

    private zzht() {
        this.zzj = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzht) {
            zzht zzhtVar = (zzht) obj;
            if (Objects.equal(this.zza, zzhtVar.zza) && Objects.equal(this.zzb, zzhtVar.zzb) && Objects.equal(this.zzc, zzhtVar.zzc) && Objects.equal(this.zzd, zzhtVar.zzd) && Objects.equal(this.zze, zzhtVar.zze) && Arrays.equals(this.zzf, zzhtVar.zzf) && Objects.equal(this.zzg, zzhtVar.zzg) && Arrays.equals(this.zzh, zzhtVar.zzh) && Objects.equal(this.zzi, zzhtVar.zzi) && Objects.equal(Integer.valueOf(this.zzj), Integer.valueOf(zzhtVar.zzj)) && Objects.equal(this.zzk, zzhtVar.zzk) && Objects.equal(this.zzl, zzhtVar.zzl) && Arrays.equals(this.zzm, zzhtVar.zzm) && Objects.equal(this.zzn, zzhtVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, Integer.valueOf(this.zzj), this.zzk, this.zzl, Integer.valueOf(Arrays.hashCode(this.zzm)), this.zzn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzfs zzfsVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzfsVar == null ? null : zzfsVar.asBinder(), false);
        zzfb zzfbVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzfbVar == null ? null : zzfbVar.asBinder(), false);
        zzfh zzfhVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzfhVar == null ? null : zzfhVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        zzfe zzfeVar = this.zzg;
        SafeParcelWriter.writeIBinder(parcel, 7, zzfeVar != null ? zzfeVar.asBinder() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i11, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzl, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzht(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) IBinder iBinder3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) byte[] bArr, @SafeParcelable.Param(id = 7) IBinder iBinder4, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) ConnectionOptions connectionOptions, @SafeParcelable.Param(id = 10) int i11, @SafeParcelable.Param(id = 11) zzjk zzjkVar, @SafeParcelable.Param(id = 14) com.google.android.gms.nearby.connection.zzo zzoVar, @SafeParcelable.Param(id = 12) byte[] bArr3, @SafeParcelable.Param(id = 13) String str3) {
        zzfs zzfqVar;
        zzfb zzezVar;
        zzfh zzffVar;
        zzfe zzfcVar = null;
        if (iBinder == null) {
            zzfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzfqVar = iInterfaceQueryLocalInterface instanceof zzfs ? (zzfs) iInterfaceQueryLocalInterface : new zzfq(iBinder);
        }
        if (iBinder2 == null) {
            zzezVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            zzezVar = iInterfaceQueryLocalInterface2 instanceof zzfb ? (zzfb) iInterfaceQueryLocalInterface2 : new zzez(iBinder2);
        }
        if (iBinder3 == null) {
            zzffVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            zzffVar = iInterfaceQueryLocalInterface3 instanceof zzfh ? (zzfh) iInterfaceQueryLocalInterface3 : new zzff(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzfcVar = iInterfaceQueryLocalInterface4 instanceof zzfe ? (zzfe) iInterfaceQueryLocalInterface4 : new zzfc(iBinder4);
        }
        this.zza = zzfqVar;
        this.zzb = zzezVar;
        this.zzc = zzffVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = zzfcVar;
        this.zzh = bArr2;
        this.zzi = connectionOptions;
        this.zzj = i11;
        this.zzk = zzjkVar;
        this.zzl = zzoVar;
        this.zzm = bArr3;
        this.zzn = str3;
    }
}
