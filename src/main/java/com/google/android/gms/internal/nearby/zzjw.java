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
@SafeParcelable.Class(creator = "AddControleeWithSessionParamsParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzjw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjw> CREATOR = new zzjx();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzla zza;

    @SafeParcelable.Field(getter = "getParams", id = 2)
    private zzmc zzb;

    private zzjw() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjw) {
            zzjw zzjwVar = (zzjw) obj;
            if (Objects.equal(this.zza, zzjwVar.zza) && Objects.equal(this.zzb, zzjwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzla zzlaVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzlaVar == null ? null : zzlaVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzjw(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) zzmc zzmcVar) {
        zzla zzkyVar;
        if (iBinder == null) {
            zzkyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            zzkyVar = iInterfaceQueryLocalInterface instanceof zzla ? (zzla) iInterfaceQueryLocalInterface : new zzky(iBinder);
        }
        this.zza = zzkyVar;
        this.zzb = zzmcVar;
    }

    /* synthetic */ zzjw(zzjv zzjvVar) {
    }
}
