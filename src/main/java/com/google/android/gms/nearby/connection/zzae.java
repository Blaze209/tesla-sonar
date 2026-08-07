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
@SafeParcelable.Class(creator = "WifiLanConnectivityInfoCreator")
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();

    @SafeParcelable.Field(getter = "getPort", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getIpAddress", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getBssid", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getActions", id = 4)
    private final byte[] zzd;

    @SafeParcelable.Constructor
    zzae(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3, @SafeParcelable.Param(id = 4) byte[] bArr4) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = bArr3;
        this.zzd = bArr4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzae) {
            zzae zzaeVar = (zzae) obj;
            if (Arrays.equals(this.zza, zzaeVar.zza) && Arrays.equals(this.zzb, zzaeVar.zzb) && Arrays.equals(this.zzc, zzaeVar.zzc) && Arrays.equals(this.zzd, zzaeVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    public final String toString() {
        return String.format("WifiLanConnectivityInfo:<wifiLanPort hash: %s>, <wifiLanIp hash: %s>, <BSSID hash: %s>, <actions hash: %s>", Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        byte[] bArr = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone(), false);
        byte[] bArr4 = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, bArr4 != null ? (byte[]) bArr4.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
