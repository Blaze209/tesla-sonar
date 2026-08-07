package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "StopRangingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzne extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzne> CREATOR = new zznf();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzla zza;

    private zzne() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzne) {
            return Objects.equal(this.zza, ((zzne) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzla zzlaVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzlaVar == null ? null : zzlaVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzne(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzla zzkyVar;
        if (iBinder == null) {
            zzkyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzkyVar = iInterfaceQueryLocalInterface instanceof zzla ? (zzla) iInterfaceQueryLocalInterface : new zzky(iBinder);
        }
        this.zza = zzkyVar;
    }

    /* synthetic */ zzne(zznd zzndVar) {
    }
}
