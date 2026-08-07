package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "DlTdoaMeasurementParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzka extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzka> CREATOR = new zzkb();

    @SafeParcelable.Field(getter = "getMessageType", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getMessageControl", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getBlockIndex", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getRoundIndex", id = 4)
    private int zzd;

    @SafeParcelable.Field(getter = "getNlos", id = 5)
    private int zze;

    @SafeParcelable.Field(getter = "getTxTimestamp", id = 6)
    private long zzf;

    @SafeParcelable.Field(getter = "getRxTimestamp", id = 7)
    private long zzg;

    @SafeParcelable.Field(getter = "getAnchroCfo", id = 8)
    private float zzh;

    @SafeParcelable.Field(getter = "getCfo", id = 9)
    private float zzi;

    @SafeParcelable.Field(getter = "getInitiatorReplyTime", id = 10)
    private long zzj;

    @SafeParcelable.Field(getter = "getResponderReplyTime", id = 11)
    private long zzk;

    @SafeParcelable.Field(getter = "getInitiatorResponderTof", id = 12)
    private int zzl;

    @SafeParcelable.Field(getter = "getAnchorLocation", id = 13)
    private byte[] zzm;

    @SafeParcelable.Field(getter = "getActiveRangingRounds", id = 14)
    private byte[] zzn;

    private zzka() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzkaVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzkaVar.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzkaVar.zzc)) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzkaVar.zzd)) && Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzkaVar.zze)) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(zzkaVar.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(zzkaVar.zzg)) && Objects.equal(Float.valueOf(this.zzh), Float.valueOf(zzkaVar.zzh)) && Objects.equal(Float.valueOf(this.zzi), Float.valueOf(zzkaVar.zzi)) && Objects.equal(Long.valueOf(this.zzj), Long.valueOf(zzkaVar.zzj)) && Objects.equal(Long.valueOf(this.zzk), Long.valueOf(zzkaVar.zzk)) && Objects.equal(Integer.valueOf(this.zzl), Integer.valueOf(zzkaVar.zzl)) && Arrays.equals(this.zzm, zzkaVar.zzm) && Arrays.equals(this.zzn, zzkaVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Float.valueOf(this.zzh), Float.valueOf(this.zzi), Long.valueOf(this.zzj), Long.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Integer.valueOf(Arrays.hashCode(this.zzn)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzh);
        SafeParcelWriter.writeFloat(parcel, 9, this.zzi);
        SafeParcelWriter.writeLong(parcel, 10, this.zzj);
        SafeParcelWriter.writeLong(parcel, 11, this.zzk);
        SafeParcelWriter.writeInt(parcel, 12, this.zzl);
        SafeParcelWriter.writeByteArray(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeByteArray(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzka(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) int i15, @SafeParcelable.Param(id = 6) long j11, @SafeParcelable.Param(id = 7) long j12, @SafeParcelable.Param(id = 8) float f11, @SafeParcelable.Param(id = 9) float f12, @SafeParcelable.Param(id = 10) long j13, @SafeParcelable.Param(id = 11) long j14, @SafeParcelable.Param(id = 12) int i16, @SafeParcelable.Param(id = 13) byte[] bArr, @SafeParcelable.Param(id = 14) byte[] bArr2) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = f11;
        this.zzi = f12;
        this.zzj = j13;
        this.zzk = j14;
        this.zzl = i16;
        this.zzm = bArr;
        this.zzn = bArr2;
    }
}
