package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PresenceDeviceCreator")
public final class zzjk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjk> CREATOR = new zzjl();
    private static final String[] zza = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};

    @SafeParcelable.Field(getter = "getDeviceId", id = 1)
    private final long zzb;

    @SafeParcelable.Field(getter = "getDeviceName", id = 2)
    private final String zzc;

    @SafeParcelable.Field(getter = "getDeviceType", id = 3)
    private final int zzd;

    @SafeParcelable.Field(getter = "getDeviceImageUrl", id = 4)
    private final String zze;

    @SafeParcelable.Field(getter = "getDiscoveryTimestampMillis", id = 5)
    private final long zzf;

    @SafeParcelable.Field(getter = "getEndpointId", id = 6)
    private final String zzg;

    @SafeParcelable.Field(getter = "getEndpointInfo", id = 7)
    private final byte[] zzh;

    @SafeParcelable.Field(getter = "getBluetoothMacAddress", id = 8)
    private final byte[] zzi;

    @SafeParcelable.Field(getter = "getActions", id = 9)
    private final List zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.nearby.presence.PresenceIdentity.IdentityType.PRIVATE", getter = "getIdentityType", id = 10)
    private final int zzk;

    @SafeParcelable.Field(getter = "getConnectivityBytes", id = 11)
    private final byte[] zzl;

    @SafeParcelable.Field(getter = "getDataElements", id = 12)
    private final zzje zzm;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDiscoveryMedium", id = 13)
    private final int zzn;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getInstanceType", id = 14)
    private final int zzo;

    @SafeParcelable.Field(getter = "getDusi", id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    zzjk(@SafeParcelable.Param(id = 1) long j11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j12, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) List list, @SafeParcelable.Param(id = 10) int i12, @SafeParcelable.Param(id = 11) byte[] bArr3, @SafeParcelable.Param(id = 12) zzje zzjeVar, @SafeParcelable.Param(id = 13) int i13, @SafeParcelable.Param(id = 14) int i14, @SafeParcelable.Param(id = 15) String str4) {
        this.zzb = j11;
        this.zzc = str;
        this.zzd = i11;
        this.zze = str2;
        this.zzf = j12;
        this.zzg = str3;
        this.zzh = bArr;
        this.zzi = bArr2;
        this.zzj = list;
        this.zzk = i12;
        this.zzl = bArr3;
        this.zzm = zzjeVar;
        this.zzn = i13;
        this.zzo = i14;
        this.zzp = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjk) {
            zzjk zzjkVar = (zzjk) obj;
            if (Objects.equal(Long.valueOf(this.zzb), Long.valueOf(zzjkVar.zzb)) && Objects.equal(this.zzc, zzjkVar.zzc) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzjkVar.zzd)) && Objects.equal(this.zze, zzjkVar.zze) && Objects.equal(this.zzg, zzjkVar.zzg) && Arrays.equals(this.zzh, zzjkVar.zzh) && Arrays.equals(this.zzi, zzjkVar.zzi) && Objects.equal(this.zzj, zzjkVar.zzj) && Objects.equal(Integer.valueOf(this.zzk), Integer.valueOf(zzjkVar.zzk)) && Arrays.equals(this.zzl, zzjkVar.zzl) && Objects.equal(this.zzm, zzjkVar.zzm) && Objects.equal(Integer.valueOf(this.zzn), Integer.valueOf(zzjkVar.zzn)) && Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(zzjkVar.zzo)) && Objects.equal(this.zzp, zzjkVar.zzp)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)), Integer.valueOf(Arrays.hashCode(this.zzi)), this.zzj, Integer.valueOf(this.zzk), Integer.valueOf(Arrays.hashCode(this.zzl)), this.zzm, Integer.valueOf(this.zzn), Integer.valueOf(this.zzo), this.zzp);
    }

    public final String toString() {
        char c11;
        Long lValueOf = Long.valueOf(this.zzb);
        String str = this.zzc;
        switch (this.zzd) {
            case 1:
                c11 = 1;
                break;
            case 2:
                c11 = 2;
                break;
            case 3:
                c11 = 3;
                break;
            case 4:
                c11 = 4;
                break;
            case 5:
                c11 = 5;
                break;
            case 6:
                c11 = 6;
                break;
            case 7:
                c11 = 7;
                break;
            case 8:
                c11 = '\b';
                break;
            case 9:
                c11 = '\t';
                break;
            case 10:
                c11 = '\n';
                break;
            default:
                c11 = 0;
                break;
        }
        String str2 = zza[c11];
        String str3 = this.zze;
        Long lValueOf2 = Long.valueOf(this.zzf);
        String str4 = this.zzg;
        byte[] bArr = this.zzh;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.zzi;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        List list = this.zzj;
        Integer numValueOf2 = Integer.valueOf(this.zzk);
        byte[] bArr3 = this.zzl;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", lValueOf, str, str2, str3, lValueOf2, str4, string, numValueOf, list, numValueOf2, bArr3 != null ? Arrays.toString(bArr3) : null, this.zzm, Integer.valueOf(this.zzn), com.google.android.gms.nearby.connection.zzr.zza(this.zzo), this.zzp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        long j11 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j11);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeString(parcel, 4, this.zze, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzf);
        SafeParcelWriter.writeString(parcel, 6, this.zzg, false);
        byte[] bArr = this.zzh;
        SafeParcelWriter.writeByteArray(parcel, 7, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.zzi;
        SafeParcelWriter.writeByteArray(parcel, 8, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        List list = this.zzj;
        SafeParcelWriter.writeTypedList(parcel, 9, list == null ? zzpt.zzk() : zzpt.zzj(list), false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzk);
        SafeParcelWriter.writeByteArray(parcel, 11, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzm, i11, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzn);
        SafeParcelWriter.writeInt(parcel, 14, this.zzo);
        SafeParcelWriter.writeString(parcel, 15, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
