package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbConnectivityCapabilityCreator")
public final class zzjo extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "isStaticStsSupported", id = 1)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isProvisionedStsSupported", id = 2)
    private final boolean zzc;
    public static final zzjo zza = new zzjo(false, false);
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();

    @SafeParcelable.Constructor
    public zzjo(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) boolean z12) {
        this.zzb = z11;
        this.zzc = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjo)) {
            return false;
        }
        zzjo zzjoVar = (zzjo) obj;
        return this.zzb == zzjoVar.zzb && this.zzc == zzjoVar.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc)});
    }

    public final String toString() {
        return String.format(Locale.US, "UwbConnectivityCapability<S-STS: %s, P-STS: %s>", Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z11);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
