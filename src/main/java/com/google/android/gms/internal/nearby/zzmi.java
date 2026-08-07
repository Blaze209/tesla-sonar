package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangingParametersParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmi> CREATOR = new zzmj();

    @SafeParcelable.Field(getter = "getUwbConfigId", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getSessionKeyInfo", id = 3)
    private byte[] zzc;

    @SafeParcelable.Field(getter = "getComplexChannel", id = 4)
    private zznr zzd;

    @SafeParcelable.Field(getter = "getRangingUpdateRate", id = 5)
    private int zze;

    @SafeParcelable.Field(getter = "getPeerDevices", id = 6)
    private zzox[] zzf;

    @SafeParcelable.Field(getter = "getSubSessionId", id = 7)
    private int zzg;

    @SafeParcelable.Field(getter = "getSubSessionKeyInfo", id = 8)
    private byte[] zzh;

    @SafeParcelable.Field(getter = "getLocalDevice", id = 9)
    private zzox zzi;

    @SafeParcelable.Field(getter = "getRangeDataNtfConfig", id = 10)
    private zzlw zzj;

    @SafeParcelable.Field(getter = "getSlotDuration", id = 11)
    private int zzk;

    @SafeParcelable.Field(getter = "getRangingInterval", id = 12)
    private int zzl;

    @SafeParcelable.Field(getter = "getIsAoaDisabled", id = 13)
    private boolean zzm;

    private zzmi() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmi) {
            zzmi zzmiVar = (zzmi) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzmiVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzmiVar.zzb)) && Arrays.equals(this.zzc, zzmiVar.zzc) && Objects.equal(this.zzd, zzmiVar.zzd) && Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzmiVar.zze)) && Arrays.equals(this.zzf, zzmiVar.zzf) && Objects.equal(Integer.valueOf(this.zzg), Integer.valueOf(zzmiVar.zzg)) && Arrays.equals(this.zzh, zzmiVar.zzh) && Objects.equal(this.zzi, zzmiVar.zzi) && Objects.equal(this.zzj, zzmiVar.zzj) && Objects.equal(Integer.valueOf(this.zzk), Integer.valueOf(zzmiVar.zzk)) && Objects.equal(Integer.valueOf(this.zzl), Integer.valueOf(zzmiVar.zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(zzmiVar.zzm))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, Integer.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)), Integer.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), Boolean.valueOf(this.zzm));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i11, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.writeInt(parcel, 12, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzmi(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) zznr zznrVar, @SafeParcelable.Param(id = 5) int i13, @SafeParcelable.Param(id = 6) zzox[] zzoxVarArr, @SafeParcelable.Param(id = 7) int i14, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) zzox zzoxVar, @SafeParcelable.Param(id = 10) zzlw zzlwVar, @SafeParcelable.Param(id = 11) int i15, @SafeParcelable.Param(id = 12) int i16, @SafeParcelable.Param(id = 13) boolean z11) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = bArr;
        this.zzd = zznrVar;
        this.zze = i13;
        this.zzf = zzoxVarArr;
        this.zzg = i14;
        this.zzh = bArr2;
        this.zzi = zzoxVar;
        this.zzj = zzlwVar;
        this.zzk = i15;
        this.zzl = i16;
        this.zzm = z11;
    }

    /* synthetic */ zzmi(zzmh zzmhVar) {
    }
}
