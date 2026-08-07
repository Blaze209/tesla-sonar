package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzpi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "BleConnectivityInfoCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getBleMacAddress", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getBleGattCharacteristic", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getActions", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getPsm", id = 4)
    private final byte[] zzd;

    @SafeParcelable.Field(getter = "getDeviceToken", id = 5)
    private final byte[] zze;

    @SafeParcelable.Constructor
    zzg(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2, @SafeParcelable.Param(id = 3) byte[] bArr3, @SafeParcelable.Param(id = 4) byte[] bArr4, @SafeParcelable.Param(id = 5) byte[] bArr5) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = bArr3;
        this.zzd = bArr4;
        this.zze = bArr5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (Arrays.equals(this.zza, zzgVar.zza) && Arrays.equals(this.zzb, zzgVar.zzb) && Arrays.equals(this.zzc, zzgVar.zzc) && Arrays.equals(this.zzd, zzgVar.zzd) && Arrays.equals(this.zze, zzgVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    public final String toString() {
        String string;
        byte[] bArr = this.zza;
        if (bArr != null && bArr.length == 6) {
            StringBuilder sb2 = new StringBuilder(18);
            int i11 = 0;
            for (int i12 = 0; i12 < 6; i12++) {
                byte b11 = bArr[i12];
                if (sb2.length() > 0) {
                    sb2.append(CoreConstants.COLON_CHAR);
                }
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            string = sb2.toString();
            while (true) {
                int length = string.length();
                if (i11 >= length) {
                    break;
                }
                if (zzpi.zza(string.charAt(i11))) {
                    char[] charArray = string.toCharArray();
                    while (i11 < length) {
                        char c11 = charArray[i11];
                        if (zzpi.zza(c11)) {
                            charArray[i11] = (char) (c11 ^ ' ');
                        }
                        i11++;
                    }
                    string = String.valueOf(charArray);
                    break;
                }
                i11++;
            }
        } else {
            string = null;
        }
        byte[] bArr2 = this.zzb;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.zzc;
        Integer numValueOf2 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.zzd;
        Integer numValueOf3 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.zze;
        return String.format("BleConnectivityInfo:<bleMacAddress hash: %s, bleGattCharacteristic hash: %s, actions hash: %s, psm hash: %s, deviceToken hash : %s>", string, numValueOf, numValueOf2, numValueOf3, bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null);
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
        SafeParcelWriter.writeByteArray(parcel, 4, bArr4 == null ? null : (byte[]) bArr4.clone(), false);
        byte[] bArr5 = this.zze;
        SafeParcelWriter.writeByteArray(parcel, 5, bArr5 != null ? (byte[]) bArr5.clone() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
