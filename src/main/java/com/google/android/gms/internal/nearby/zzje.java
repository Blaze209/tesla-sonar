package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DataElementCollectionCreator")
public final class zzje extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzje> CREATOR = new zzjf();

    @SafeParcelable.Field(getter = "getSequenceNumber", id = 1)
    private final zzjm zza;

    @SafeParcelable.Field(getter = "getCastIdentity", id = 2)
    private final zzjc zzb;

    @SafeParcelable.Field(getter = "getDeduplicationHintBytes", id = 3)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getDeduplicationHintEnabled", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getBleGattConnectivityInfoList", id = 5)
    private final List zze;

    @SafeParcelable.Field(getter = "getWifiLanConnectivityInfoList", id = 6)
    private final List zzf;

    @SafeParcelable.Field(getter = "getBluetoothConnectivityInfoList", id = 7)
    private final List zzg;

    @SafeParcelable.Field(getter = "getUwbConnectivityCapability", id = 8)
    private final zzjo zzh;

    @SafeParcelable.Field(getter = "getDeviceType", id = 9)
    private final zzjg zzi;

    @SafeParcelable.Constructor
    zzje(@SafeParcelable.Param(id = 1) zzjm zzjmVar, @SafeParcelable.Param(id = 2) zzjc zzjcVar, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) List list2, @SafeParcelable.Param(id = 7) List list3, @SafeParcelable.Param(id = 8) zzjo zzjoVar, @SafeParcelable.Param(id = 9) zzjg zzjgVar) {
        this.zza = zzjmVar;
        this.zzb = zzjcVar;
        this.zzc = bArr;
        this.zzd = z11;
        this.zze = list;
        this.zzf = list2;
        this.zzg = list3;
        this.zzh = zzjoVar;
        this.zzi = zzjgVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzje) {
            zzje zzjeVar = (zzje) obj;
            if (Objects.equal(this.zza, zzjeVar.zza) && Objects.equal(this.zzb, zzjeVar.zzb) && Arrays.equals(this.zzc, zzjeVar.zzc) && this.zzd == zzjeVar.zzd && Objects.equal(this.zze, zzjeVar.zze) && Objects.equal(this.zzf, zzjeVar.zzf) && Objects.equal(this.zzg, zzjeVar.zzg) && Objects.equal(this.zzh, zzjeVar.zzh) && Objects.equal(this.zzi, zzjeVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Boolean.valueOf(this.zzd), this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.zza, this.zzb, Arrays.toString(this.zzc), Boolean.valueOf(this.zzd), this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zzjm zzjmVar = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, zzjmVar, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedList(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
