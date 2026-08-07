package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnConnectionResponseParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzgf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgf> CREATOR = new zzgg();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getHandshakeData", id = 3)
    private byte[] zzc;

    private zzgf() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgf) {
            zzgf zzgfVar = (zzgf) obj;
            if (Objects.equal(this.zza, zzgfVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzgfVar.zzb)) && Arrays.equals(this.zzc, zzgfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final byte[] zzc() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    zzgf(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = bArr;
    }
}
