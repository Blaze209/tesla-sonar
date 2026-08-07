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
@SafeParcelable.Class(creator = "StartRangingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzna extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzna> CREATOR = new zznb();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzla zza;

    @SafeParcelable.Field(getter = "getParams", id = 2)
    private zzmi zzb;

    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 3, type = "android.os.IBinder")
    private zzkx zzc;

    private zzna() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzna) {
            zzna zznaVar = (zzna) obj;
            if (Objects.equal(this.zza, zznaVar.zza) && Objects.equal(this.zzb, zznaVar.zzb) && Objects.equal(this.zzc, zznaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzla zzlaVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzlaVar == null ? null : zzlaVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzna(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzmi zzmiVar, @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        zzla zzkyVar;
        zzkx zzkvVar = null;
        if (iBinder == null) {
            zzkyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzkyVar = iInterfaceQueryLocalInterface instanceof zzla ? (zzla) iInterfaceQueryLocalInterface : new zzky(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            zzkvVar = iInterfaceQueryLocalInterface2 instanceof zzkx ? (zzkx) iInterfaceQueryLocalInterface2 : new zzkv(iBinder2);
        }
        this.zza = zzkyVar;
        this.zzb = zzmiVar;
        this.zzc = zzkvVar;
    }

    /* synthetic */ zzna(zzmz zzmzVar) {
    }
}
