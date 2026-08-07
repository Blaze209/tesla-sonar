package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionsDeviceCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(id = 4)
    final byte[] zza;

    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private final String zzb;

    @SafeParcelable.Field(getter = "getEndpointInfo", id = 2)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 3)
    private final byte[] zzd;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getInstanceType", id = 5)
    private final int zze;

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) byte[] bArr2, @SafeParcelable.Param(id = 4) byte[] bArr3, @SafeParcelable.Param(id = 5) int i11) {
        this.zzb = str;
        this.zzc = bArr;
        this.zzd = bArr2;
        this.zza = bArr3;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzo) {
            zzo zzoVar = (zzo) obj;
            if (Objects.equal(this.zzb, zzoVar.zzb) && Arrays.equals(this.zzc, zzoVar.zzc) && Arrays.equals(this.zzd, zzoVar.zzd) && Arrays.equals(this.zza, zzoVar.zza) && this.zze == zzoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zze));
    }

    public final String toString() {
        String str = this.zzb;
        byte[] bArr = this.zzc;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.zza;
        return String.format("ConnectionsDevice:<endpointId: %s, endpointInfo: %s, connectivityBytes: %s, instanceType : %s>", str, string, bArr2 != null ? Arrays.toString(bArr2) : null, zzr.zza(this.zze));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        byte[] bArr = this.zzc;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
