package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "OnConnectionResultParamsCreator")
public final class zzgh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgh> CREATOR = new zzgi();

    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getHandshakeData", id = 3)
    private byte[] zzc;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getDeviceType", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzjk zze;

    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo zzf;

    private zzgh() {
        this.zzd = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgh) {
            zzgh zzghVar = (zzgh) obj;
            if (Objects.equal(this.zza, zzghVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzghVar.zzb)) && Arrays.equals(this.zzc, zzghVar.zzc) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzghVar.zzd)) && Objects.equal(this.zze, zzghVar.zze) && Objects.equal(this.zzf, zzghVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzgh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) zzjk zzjkVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = bArr;
        this.zzd = i12;
        this.zze = zzjkVar;
        this.zzf = zzoVar;
    }
}
