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
@SafeParcelable.Class(creator = "IsAvailableParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlm> CREATOR = new zzln();

    @SafeParcelable.Field(getter = "getBooleanResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkq zza;

    private zzlm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlm) {
            return Objects.equal(this.zza, ((zzlm) obj).zza);
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
    zzlm(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzkq zzkoVar;
        if (iBinder == null) {
            zzkoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
            zzkoVar = iInterfaceQueryLocalInterface instanceof zzkq ? (zzkq) iInterfaceQueryLocalInterface : new zzko(iBinder);
        }
        this.zza = zzkoVar;
    }

    /* synthetic */ zzlm(zzll zzllVar) {
    }
}
