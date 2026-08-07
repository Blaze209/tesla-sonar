package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PublishRequestCreator")
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    public final zzae zzb;

    @SafeParcelable.Field(id = 3)
    public final Strategy zzc;

    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr zzd;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    public final String zze;

    @SafeParcelable.Field(id = 6)
    @Deprecated
    public final String zzf;

    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final boolean zzg;

    @SafeParcelable.Field(getter = "getPublishCallbackAsBinder", id = 8, type = "android.os.IBinder")
    public final zzv zzh;

    @SafeParcelable.Field(id = 9)
    @Deprecated
    public final boolean zzi;

    @SafeParcelable.Field(id = 10)
    @Deprecated
    public final ClientAppContext zzj;

    @SafeParcelable.Field(id = 11)
    public final int zzk;

    @SafeParcelable.Constructor
    zzbz(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) zzae zzaeVar, @SafeParcelable.Param(id = 3) Strategy strategy, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) IBinder iBinder2, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) ClientAppContext clientAppContext, @SafeParcelable.Param(id = 11) int i12) {
        zzr zzpVar;
        this.zza = i11;
        this.zzb = zzaeVar;
        this.zzc = strategy;
        zzv zztVar = null;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
        }
        this.zzd = zzpVar;
        this.zze = str;
        this.zzf = str2;
        this.zzg = z11;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            zztVar = iInterfaceQueryLocalInterface2 instanceof zzv ? (zzv) iInterfaceQueryLocalInterface2 : new zzt(iBinder2);
        }
        this.zzh = zztVar;
        this.zzi = z12;
        this.zzj = ClientAppContext.zza(clientAppContext, str2, str, z12);
        this.zzk = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeIBinder(parcel, 4, this.zzd.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        zzv zzvVar = this.zzh;
        SafeParcelWriter.writeIBinder(parcel, 8, zzvVar == null ? null : zzvVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i11, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
