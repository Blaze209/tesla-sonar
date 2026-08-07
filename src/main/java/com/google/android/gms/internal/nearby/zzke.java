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
@SafeParcelable.Class(creator = "GetComplexChannelParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzke extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzke> CREATOR = new zzkf();

    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzlj zza;

    private zzke() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzke) {
            return Objects.equal(this.zza, ((zzke) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzke(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzlj zzlhVar;
        if (iBinder == null) {
            zzlhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
            zzlhVar = iInterfaceQueryLocalInterface instanceof zzlj ? (zzlj) iInterfaceQueryLocalInterface : new zzlh(iBinder);
        }
        this.zza = zzlhVar;
    }

    /* synthetic */ zzke(zzkd zzkdVar) {
    }
}
