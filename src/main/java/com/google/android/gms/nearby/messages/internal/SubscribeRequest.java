package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "SubscribeRequestCreator")
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcd();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", id = 2, type = "android.os.IBinder")
    public final zzo zzb;

    @NonNull
    @SafeParcelable.Field(id = 3)
    public final Strategy zzc;

    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr zzd;

    @NonNull
    @SafeParcelable.Field(id = 5)
    public final MessageFilter zze;

    @SafeParcelable.Field(id = 6)
    public final PendingIntent zzf;

    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final int zzg;

    @SafeParcelable.Field(id = 8)
    @Deprecated
    public final String zzh;

    @SafeParcelable.Field(id = 9)
    @Deprecated
    public final String zzi;

    @SafeParcelable.Field(id = 10)
    public final byte[] zzj;

    @SafeParcelable.Field(id = 11)
    @Deprecated
    public final boolean zzk;

    @SafeParcelable.Field(getter = "getSubscribeCallbackAsBinder", id = 12, type = "android.os.IBinder")
    public final zzab zzl;

    @SafeParcelable.Field(id = 13)
    @Deprecated
    public final boolean zzm;

    @SafeParcelable.Field(id = 14)
    @Deprecated
    public final ClientAppContext zzn;

    @SafeParcelable.Field(id = 15)
    public final boolean zzo;

    @SafeParcelable.Field(id = 16)
    public final int zzp;

    @SafeParcelable.Field(id = 17)
    public final int zzq;

    @SafeParcelable.Constructor
    public SubscribeRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) IBinder iBinder, @NonNull @SafeParcelable.Param(id = 3) Strategy strategy, @NonNull @SafeParcelable.Param(id = 4) IBinder iBinder2, @NonNull @SafeParcelable.Param(id = 5) MessageFilter messageFilter, @SafeParcelable.Param(id = 6) PendingIntent pendingIntent, @SafeParcelable.Param(id = 7) int i12, @SafeParcelable.Param(id = 8) String str, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) byte[] bArr, @SafeParcelable.Param(id = 11) boolean z11, @SafeParcelable.Param(id = 12) IBinder iBinder3, @SafeParcelable.Param(id = 13) boolean z12, @SafeParcelable.Param(id = 14) ClientAppContext clientAppContext, @SafeParcelable.Param(id = 15) boolean z13, @SafeParcelable.Param(id = 16) int i13, @SafeParcelable.Param(id = 17) int i14) {
        IBinder iBinder4;
        zzo zzmVar;
        zzr zzpVar;
        this.zza = i11;
        zzab zzzVar = null;
        if (iBinder == null || (iBinder4 = (IBinder) Preconditions.checkNotNull(iBinder)) == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzm(iBinder4);
        }
        this.zzb = zzmVar;
        this.zzc = strategy;
        if (iBinder2 == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface2 : new zzp(iBinder2);
        }
        this.zzd = zzpVar;
        this.zze = messageFilter;
        this.zzf = pendingIntent;
        this.zzg = i12;
        this.zzh = str;
        this.zzi = str2;
        this.zzj = bArr;
        this.zzk = z11;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            zzzVar = iInterfaceQueryLocalInterface3 instanceof zzab ? (zzab) iInterfaceQueryLocalInterface3 : new zzz(iBinder3);
        }
        this.zzl = zzzVar;
        this.zzm = z12;
        this.zzn = ClientAppContext.zza(clientAppContext, str2, str, z12);
        this.zzo = z13;
        this.zzp = i13;
        this.zzq = i14;
    }

    @NonNull
    public final String toString() {
        String str;
        byte[] bArr = this.zzj;
        PendingIntent pendingIntent = this.zzf;
        MessageFilter messageFilter = this.zze;
        zzr zzrVar = this.zzd;
        Strategy strategy = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(strategy);
        String strValueOf3 = String.valueOf(zzrVar);
        String strValueOf4 = String.valueOf(messageFilter);
        String strValueOf5 = String.valueOf(pendingIntent);
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        zzab zzabVar = this.zzl;
        boolean z11 = this.zzm;
        ClientAppContext clientAppContext = this.zzn;
        boolean z12 = this.zzo;
        String str2 = this.zzh;
        String str3 = this.zzi;
        boolean z13 = this.zzk;
        int i11 = this.zzq;
        return "SubscribeRequest{messageListener=" + strValueOf + ", strategy=" + strValueOf2 + ", callback=" + strValueOf3 + ", filter=" + strValueOf4 + ", pendingIntent=" + strValueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(zzabVar) + ", useRealClientApiKey=" + z11 + ", clientAppContext=" + String.valueOf(clientAppContext) + ", isDiscardPendingIntent=" + z12 + ", zeroPartyPackageName=" + str2 + ", realClientPackageName=" + str3 + ", isIgnoreNearbyPermission=" + z13 + ", callingContext=" + i11 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        zzo zzoVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        zzr zzrVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzrVar == null ? null : zzrVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        zzab zzabVar = this.zzl;
        SafeParcelWriter.writeIBinder(parcel, 12, zzabVar != null ? zzabVar.asBinder() : null, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 17, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SubscribeRequest(IBinder iBinder, @NonNull Strategy strategy, @NonNull IBinder iBinder2, @NonNull MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z11, int i11, int i12) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i12);
    }
}
