package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "BluetoothConnectivityInfoCreator")
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getBluetoothUuid", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getActions", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Constructor
    zzi(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (Arrays.equals(this.zza, zziVar.zza) && Arrays.equals(this.zzb, zziVar.zzb) && Arrays.equals(this.zzc, zziVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    public final String toString() {
        byte[] bArr = this.zza;
        Integer numValueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.zzb;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.zzc;
        return String.format("BluetoothConnectivityInfo:<bluetoothMacAddress hash: %s, bluetoothUuid hash: %s, actions hash: %s>", numValueOf, numValueOf2, bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        byte[] bArr = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr3 != null ? (byte[]) bArr3.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
