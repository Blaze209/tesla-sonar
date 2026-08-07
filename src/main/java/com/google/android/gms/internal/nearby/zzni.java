package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UwbAddressParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new zznj();

    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private byte[] zza;

    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int zzb;

    private zzni() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzni) {
            zzni zzniVar = (zzni) obj;
            if (Arrays.equals(this.zza, zzniVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzniVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final byte[] zzb() {
        return this.zza;
    }

    /* synthetic */ zzni(zznh zznhVar) {
    }

    @SafeParcelable.Constructor
    zzni(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i11) {
        this.zza = bArr;
        this.zzb = i11;
    }
}
