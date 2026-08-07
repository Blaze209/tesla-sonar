package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbRangingDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    @SafeParcelable.Field(getter = "getRawDistance", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getRawAngleOfArrivalAzimuth", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getRawAngleOfArrivalPolar", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getIsValidAngleOfArrivalData", id = 4)
    private boolean zzd;

    private zzaa() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzaaVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzaaVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzaaVar.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzaaVar.zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd));
    }

    public final String toString() {
        return "UwbRangingData{rawDistance=" + this.zza + ", rawAngleOfArrivalAzimuth=" + this.zzb + ", rawAngleOfArrivalPolar=" + this.zzc + ", isValidAngleOfArrivalData=" + this.zzd + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzaa(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 4) boolean z11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = z11;
    }
}
