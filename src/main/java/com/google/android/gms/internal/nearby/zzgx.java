package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnStoppedAdvertisingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgx> CREATOR = new zzgy();

    @SafeParcelable.Field(getter = "getReason", id = 1)
    private int zza;

    private zzgx() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgx) {
            return Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(((zzgx) obj).zza));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzgx(@SafeParcelable.Param(id = 1) int i11) {
        this.zza = i11;
    }
}
