package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangeDataNtfConfigParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlw> CREATOR = new zzlx();

    @SafeParcelable.Field(getter = "getRangeDataNtfConfigType", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getNtfProximityNearInCm", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getNtfProximityFarInCm", id = 3)
    private int zzc;

    private zzlw() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlw) {
            zzlw zzlwVar = (zzlw) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzlwVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzlwVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzlwVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzlw(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
    }

    /* synthetic */ zzlw(zzlv zzlvVar) {
    }
}
