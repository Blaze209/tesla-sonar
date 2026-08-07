package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RangingCapabilitiesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzly extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzly> CREATOR = new zzlz();

    @SafeParcelable.Field(getter = "getSupportsDistance", id = 1)
    private boolean zza;

    @SafeParcelable.Field(getter = "getSupportsAzimuthalAngle", id = 2)
    private boolean zzb;

    @SafeParcelable.Field(getter = "getSupportsElevationAngle", id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getStatusCode", id = 4)
    private int zzd;

    @SafeParcelable.Field(getter = "getMinRangingInterval", id = 5)
    private int zze;

    @SafeParcelable.Field(getter = "getSupportedChannels", id = 6)
    private int[] zzf;

    @SafeParcelable.Field(getter = "getSupportedConfigIds", id = 7)
    private int[] zzg;

    @SafeParcelable.Field(getter = "getMinSlotDuration", id = 8)
    private float zzh;

    @SafeParcelable.Field(getter = "getSupportedNtfConfigs", id = 9)
    private int[] zzi;

    @SafeParcelable.Field(getter = "getSupportedSlotDurations", id = 10)
    private int[] zzj;

    @SafeParcelable.Field(getter = "getSupportedRangingIntervals", id = 11)
    private int[] zzk;

    @SafeParcelable.Field(getter = "getIsRangingIntervalReconfigureSupported", id = 12)
    private boolean zzl;

    @SafeParcelable.Field(getter = "getSupportsBackgroundRanging", id = 13)
    private boolean zzm;

    private zzly() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzly) {
            zzly zzlyVar = (zzly) obj;
            if (Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(zzlyVar.zza)) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzlyVar.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzlyVar.zzc)) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzlyVar.zzd)) && Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzlyVar.zze)) && Arrays.equals(this.zzf, zzlyVar.zzf) && Arrays.equals(this.zzg, zzlyVar.zzg) && Objects.equal(Float.valueOf(this.zzh), Float.valueOf(zzlyVar.zzh)) && Arrays.equals(this.zzi, zzlyVar.zzi) && Arrays.equals(this.zzj, zzlyVar.zzj) && Arrays.equals(this.zzk, zzlyVar.zzk) && Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(zzlyVar.zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(zzlyVar.zzm))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)), Integer.valueOf(Arrays.hashCode(this.zzg)), Float.valueOf(this.zzh), Integer.valueOf(Arrays.hashCode(this.zzi)), Integer.valueOf(Arrays.hashCode(this.zzj)), Integer.valueOf(Arrays.hashCode(this.zzk)), Boolean.valueOf(this.zzl), Boolean.valueOf(this.zzm));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeIntArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeIntArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzh);
        SafeParcelWriter.writeIntArray(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeIntArray(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeIntArray(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzm;
    }

    public final boolean zze() {
        return this.zza;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final int[] zzg() {
        return this.zzf;
    }

    public final int[] zzh() {
        return this.zzg;
    }

    public final int[] zzi() {
        return this.zzi;
    }

    public final int[] zzj() {
        return this.zzk;
    }

    public final int[] zzk() {
        return this.zzj;
    }

    @SafeParcelable.Constructor
    zzly(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) boolean z12, @SafeParcelable.Param(id = 3) boolean z13, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) int[] iArr, @SafeParcelable.Param(id = 7) int[] iArr2, @SafeParcelable.Param(id = 8) float f11, @SafeParcelable.Param(id = 9) int[] iArr3, @SafeParcelable.Param(id = 10) int[] iArr4, @SafeParcelable.Param(id = 11) int[] iArr5, @SafeParcelable.Param(id = 12) boolean z14, @SafeParcelable.Param(id = 13) boolean z15) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = z13;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = iArr;
        this.zzg = iArr2;
        this.zzh = f11;
        this.zzi = iArr3;
        this.zzj = iArr4;
        this.zzk = iArr5;
        this.zzl = z14;
        this.zzm = z15;
    }
}
