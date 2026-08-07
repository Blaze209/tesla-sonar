package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "BleFilterCreator")
public final class zzin extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzin> CREATOR = new zzio();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getServiceUuid", id = 4)
    private final ParcelUuid zzb;

    @SafeParcelable.Field(getter = "getServiceUuidMask", id = 5)
    private final ParcelUuid zzc;

    @SafeParcelable.Field(getter = "getServiceDataUuid", id = 6)
    private final ParcelUuid zzd;

    @SafeParcelable.Field(getter = "getServiceData", id = 7)
    private final byte[] zze;

    @SafeParcelable.Field(getter = "getServiceDataMask", id = 8)
    private final byte[] zzf;

    @SafeParcelable.Field(getter = "getManufacturerId", id = 9)
    private final int zzg;

    @SafeParcelable.Field(getter = "getManufacturerData", id = 10)
    private final byte[] zzh;

    @SafeParcelable.Field(getter = "getManufacturerDataMask", id = 11)
    private final byte[] zzi;

    @SafeParcelable.Constructor
    zzin(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 4) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 5) ParcelUuid parcelUuid2, @SafeParcelable.Param(id = 6) ParcelUuid parcelUuid3, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) int i12, @SafeParcelable.Param(id = 10) byte[] bArr3, @SafeParcelable.Param(id = 11) byte[] bArr4) {
        this.zza = i11;
        this.zzb = parcelUuid;
        this.zzc = parcelUuid2;
        this.zzd = parcelUuid3;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = i12;
        this.zzh = bArr3;
        this.zzi = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzin.class == obj.getClass()) {
            zzin zzinVar = (zzin) obj;
            if (this.zzg == zzinVar.zzg && Arrays.equals(this.zzh, zzinVar.zzh) && Arrays.equals(this.zzi, zzinVar.zzi) && Objects.equal(this.zzd, zzinVar.zzd) && Arrays.equals(this.zze, zzinVar.zze) && Arrays.equals(this.zzf, zzinVar.zzf) && Objects.equal(this.zzb, zzinVar.zzb) && Objects.equal(this.zzc, zzinVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), Integer.valueOf(Arrays.hashCode(this.zzi)), this.zzd, Integer.valueOf(Arrays.hashCode(this.zze)), Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzg);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
