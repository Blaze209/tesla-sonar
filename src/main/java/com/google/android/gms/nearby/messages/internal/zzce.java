package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UnpublishRequestCreator")
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    public final zzae zzb;

    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 3, type = "android.os.IBinder")
    public final zzr zzc;

    @SafeParcelable.Field(id = 4)
    @Deprecated
    public final String zzd;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    public final String zze;

    @SafeParcelable.Field(id = 6)
    @Deprecated
    public final boolean zzf;

    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final ClientAppContext zzg;

    @SafeParcelable.Constructor
    zzce(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) zzae zzaeVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) boolean z11, @SafeParcelable.Param(id = 7) ClientAppContext clientAppContext) {
        zzr zzpVar;
        this.zza = i11;
        this.zzb = zzaeVar;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
        }
        this.zzc = zzpVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = z11;
        this.zzg = ClientAppContext.zza(clientAppContext, str2, str, z11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
