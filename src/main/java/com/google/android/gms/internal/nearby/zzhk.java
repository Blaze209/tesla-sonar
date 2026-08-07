package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "ParcelablePayloadCreator")
@SafeParcelable.Reserved({1000})
public final class zzhk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhk> CREATOR = new zzhl();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private long zza;

    @SafeParcelable.Field(getter = "getType", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getBytes", id = 3)
    private byte[] zzc;

    @SafeParcelable.Field(getter = "getDataPfd", id = 4)
    private ParcelFileDescriptor zzd;

    @SafeParcelable.Field(getter = "getJavaFilePath", id = 5)
    private String zze;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getJavaFileSize", id = 6)
    private long zzf;

    @SafeParcelable.Field(getter = "getStatusPfd", id = 7)
    private ParcelFileDescriptor zzg;

    @SafeParcelable.Field(getter = "getUri", id = 8)
    private Uri zzh;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getOffset", id = 9)
    private long zzi;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIsSensitive", id = 10)
    private boolean zzj;

    @SafeParcelable.Field(getter = "getSharedBytes", id = 11)
    private zzhg zzk;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getPayloadSize", id = 12)
    private long zzl;

    @SafeParcelable.Field(getter = "getFileName", id = 13)
    private String zzm;

    @SafeParcelable.Field(getter = "getParentFolder", id = 14)
    private String zzn;

    private zzhk() {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
        this.zzl = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhk) {
            zzhk zzhkVar = (zzhk) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(zzhkVar.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzhkVar.zzb)) && Arrays.equals(this.zzc, zzhkVar.zzc) && Objects.equal(this.zzd, zzhkVar.zzd) && Objects.equal(this.zze, zzhkVar.zze) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(zzhkVar.zzf)) && Objects.equal(this.zzg, zzhkVar.zzg) && Objects.equal(this.zzh, zzhkVar.zzh) && Objects.equal(Long.valueOf(this.zzi), Long.valueOf(zzhkVar.zzi)) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(zzhkVar.zzj)) && Objects.equal(this.zzk, zzhkVar.zzk) && Objects.equal(Long.valueOf(this.zzl), Long.valueOf(zzhkVar.zzl)) && Objects.equal(this.zzm, zzhkVar.zzm) && Objects.equal(this.zzn, zzhkVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, Long.valueOf(this.zzf), this.zzg, this.zzh, Long.valueOf(this.zzi), Boolean.valueOf(this.zzj), this.zzk, Long.valueOf(this.zzl), this.zzm, this.zzn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i11, false);
        SafeParcelWriter.writeLong(parcel, 12, this.zzl);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzl;
    }

    public final Uri zze() {
        return this.zzh;
    }

    public final ParcelFileDescriptor zzf() {
        return this.zzd;
    }

    public final ParcelFileDescriptor zzg() {
        return this.zzg;
    }

    public final zzhg zzh() {
        return this.zzk;
    }

    public final String zzi() {
        return this.zzm;
    }

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzn;
    }

    public final byte[] zzz() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    zzhk(@SafeParcelable.Param(id = 1) long j11, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) long j12, @SafeParcelable.Param(id = 7) ParcelFileDescriptor parcelFileDescriptor2, @SafeParcelable.Param(id = 8) Uri uri, @SafeParcelable.Param(id = 9) long j13, @SafeParcelable.Param(id = 10) boolean z11, @SafeParcelable.Param(id = 11) zzhg zzhgVar, @SafeParcelable.Param(id = 12) long j14, @SafeParcelable.Param(id = 13) String str2, @SafeParcelable.Param(id = 14) String str3) {
        this.zza = j11;
        this.zzb = i11;
        this.zzc = bArr;
        this.zzd = parcelFileDescriptor;
        this.zze = str;
        this.zzf = j12;
        this.zzg = parcelFileDescriptor2;
        this.zzh = uri;
        this.zzi = j13;
        this.zzj = z11;
        this.zzk = zzhgVar;
        this.zzl = j14;
        this.zzm = str2;
        this.zzn = str3;
    }

    /* synthetic */ zzhk(zzhj zzhjVar) {
        this.zzf = -1L;
        this.zzi = 0L;
        this.zzj = false;
        this.zzl = 0L;
    }
}
