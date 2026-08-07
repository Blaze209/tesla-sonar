package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnEndpointFoundParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgn> CREATOR = new zzgo();

    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getServiceId", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getEndpointName", id = 3)
    private String zzc;

    @SafeParcelable.Field(getter = "getBluetoothDevice", id = 4)
    private BluetoothDevice zzd;

    @SafeParcelable.Field(getter = "getEndpointInfo", id = 5)
    private byte[] zze;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 7)
    private com.google.android.gms.nearby.connection.zzo zzg;

    private zzgn() {
        this.zzf = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgn) {
            zzgn zzgnVar = (zzgn) obj;
            if (Objects.equal(this.zza, zzgnVar.zza) && Objects.equal(this.zzb, zzgnVar.zzb) && Objects.equal(this.zzc, zzgnVar.zzc) && Objects.equal(this.zzd, zzgnVar.zzd) && Arrays.equals(this.zze, zzgnVar.zze) && Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(zzgnVar.zzf)) && Objects.equal(this.zzg, zzgnVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(this.zzf), this.zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final BluetoothDevice zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final byte[] zze() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    zzgn(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) BluetoothDevice bluetoothDevice, @SafeParcelable.Param(id = 5) byte[] bArr, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bluetoothDevice;
        this.zze = bArr;
        this.zzf = i11;
        this.zzg = zzoVar;
    }
}
