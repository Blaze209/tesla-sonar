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
@SafeParcelable.Class(creator = "UwbSenderInfoCreator")
@SafeParcelable.Reserved({1000})
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private byte[] zza;

    @SafeParcelable.Field(getter = "getChannel", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getPreambleIndex", id = 3)
    private int zzc;

    private zzac() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (Arrays.equals(this.zza, zzacVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzacVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzacVar.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        return "UwbSenderInfo{address=" + Arrays.toString(this.zza) + ", channel=" + this.zzb + ", preambleIndex=" + this.zzc + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzac(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12) {
        this.zza = bArr;
        this.zzb = i11;
        this.zzc = i12;
    }
}
