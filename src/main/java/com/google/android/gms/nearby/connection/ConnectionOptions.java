package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;
import java.util.Locale;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "ConnectionOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class ConnectionOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzn();

    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 1)
    private boolean zza;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 2)
    private boolean zzb;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 3)
    private boolean zzc;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 4)
    private boolean zzd;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 5)
    private boolean zze;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 6)
    private boolean zzf;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiHotspot", id = 7)
    private boolean zzg;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiDirect", id = 8)
    private boolean zzh;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteBluetoothMacAddress", id = 9)
    private byte[] zzi;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtc", id = 10)
    private boolean zzj;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", id = 11)
    private boolean zzk;

    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", id = 12)
    @Deprecated
    private boolean zzl;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getKeepAliveIntervalMillis", id = 13)
    private int zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getKeepAliveTimeoutMillis", id = 14)
    private int zzn;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUpgradeMediums", id = 15)
    private int[] zzo;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getConnectionMediums", id = 16)
    private int[] zzp;

    @SafeParcelable.Field(getter = "getDeviceInfo", id = 17)
    private byte[] zzq;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getStrategy", id = 18)
    private Strategy zzr;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getConnectionType", id = 19)
    private int zzs;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getFlowId", id = 20)
    private long zzt;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 21)
    @Deprecated
    private boolean zzu;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 22)
    private boolean zzv;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 23)
    private boolean zzw;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final ConnectionOptions zza;

        public Builder() {
            this.zza = new ConnectionOptions(null);
        }

        @NonNull
        public ConnectionOptions build() {
            ConnectionOptions.zzC(this.zza);
            if (this.zza.zzs != 0) {
                ConnectionOptions connectionOptions = this.zza;
                connectionOptions.zzl = connectionOptions.zzs == 1;
            } else if (!this.zza.zzl) {
                this.zza.zzs = 2;
            }
            return this.zza;
        }

        @NonNull
        public Builder setConnectionType(int i11) {
            this.zza.zzs = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDisruptiveUpgrade(boolean z11) {
            this.zza.zzl = z11;
            return this;
        }

        @NonNull
        public Builder setLowPower(boolean z11) {
            this.zza.zza = z11;
            return this;
        }

        public Builder(@NonNull ConnectionOptions connectionOptions) {
            ConnectionOptions connectionOptions2 = new ConnectionOptions(null);
            this.zza = connectionOptions2;
            connectionOptions2.zza = connectionOptions.zza;
            connectionOptions2.zzb = connectionOptions.zzb;
            connectionOptions2.zzc = connectionOptions.zzc;
            connectionOptions2.zzd = connectionOptions.zzd;
            connectionOptions2.zze = connectionOptions.zze;
            connectionOptions2.zzf = connectionOptions.zzf;
            connectionOptions2.zzg = connectionOptions.zzg;
            connectionOptions2.zzh = connectionOptions.zzh;
            connectionOptions2.zzi = connectionOptions.zzi;
            connectionOptions2.zzj = connectionOptions.zzj;
            connectionOptions2.zzk = connectionOptions.zzk;
            connectionOptions2.zzl = connectionOptions.zzl;
            connectionOptions2.zzm = connectionOptions.zzm;
            connectionOptions2.zzn = connectionOptions.zzn;
            connectionOptions2.zzo = connectionOptions.zzo;
            connectionOptions2.zzp = connectionOptions.zzp;
            connectionOptions2.zzq = connectionOptions.zzq;
            connectionOptions2.zzr = connectionOptions.zzr;
            connectionOptions2.zzs = connectionOptions.zzs;
            connectionOptions2.zzt = connectionOptions.zzt;
            connectionOptions2.zzu = connectionOptions.zzu;
            connectionOptions2.zzv = connectionOptions.zzv;
            connectionOptions2.zzw = connectionOptions.zzw;
        }
    }

    private ConnectionOptions() {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
        this.zzt = 0L;
        this.zzu = false;
        this.zzv = true;
        this.zzw = true;
    }

    @NonNull
    public static String convertConnectionTypeToString(int i11) {
        if (i11 == 0) {
            return "BALANCED";
        }
        if (i11 == 1) {
            return "DISRUPTIVE";
        }
        if (i11 == 2) {
            return "NON_DISRUPTIVE";
        }
        return "UNKNOWN_CONNECTION_TYPE(" + i11 + ")";
    }

    static /* bridge */ /* synthetic */ void zzC(ConnectionOptions connectionOptions) {
        int[] iArr = connectionOptions.zzp;
        int[] iArr2 = connectionOptions.zzo;
        if (iArr != null && iArr.length > 0) {
            connectionOptions.zzc = false;
            connectionOptions.zzb = false;
            connectionOptions.zze = false;
            if (PlatformVersion.isAtLeastP()) {
                connectionOptions.zzd = false;
            }
        }
        if (iArr2 != null) {
            connectionOptions.zzg = false;
            connectionOptions.zzf = false;
            connectionOptions.zzh = false;
            if (!PlatformVersion.isAtLeastP()) {
                connectionOptions.zzd = false;
            }
        }
        if (iArr != null) {
            for (int i11 : iArr) {
                zzV(i11, connectionOptions);
            }
        }
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                zzV(i12, connectionOptions);
            }
        }
    }

    private static void zzV(int i11, ConnectionOptions connectionOptions) {
        switch (i11) {
            case 2:
                connectionOptions.zzb = true;
                break;
            case 3:
                connectionOptions.zzg = true;
                break;
            case 4:
                connectionOptions.zzc = true;
                break;
            case 5:
                connectionOptions.zzd = true;
                break;
            case 6:
                connectionOptions.zzf = true;
                break;
            case 7:
                connectionOptions.zze = true;
                break;
            case 8:
                connectionOptions.zzh = true;
                break;
            case 9:
                connectionOptions.zzj = true;
                break;
            case 10:
            case 11:
                break;
            default:
                Log.d("NearbyConnections", "Illegal connection medium " + i11);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(connectionOptions.zza)) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(connectionOptions.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(connectionOptions.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(connectionOptions.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(connectionOptions.zze)) && Objects.equal(Boolean.valueOf(this.zzf), Boolean.valueOf(connectionOptions.zzf)) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(connectionOptions.zzg)) && Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(connectionOptions.zzh)) && Arrays.equals(this.zzi, connectionOptions.zzi) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(connectionOptions.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(connectionOptions.zzk)) && Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(connectionOptions.zzl)) && Objects.equal(Integer.valueOf(this.zzm), Integer.valueOf(connectionOptions.zzm)) && Objects.equal(Integer.valueOf(this.zzn), Integer.valueOf(connectionOptions.zzn)) && Arrays.equals(this.zzo, connectionOptions.zzo) && Arrays.equals(this.zzp, connectionOptions.zzp) && Arrays.equals(this.zzq, connectionOptions.zzq) && Objects.equal(this.zzr, connectionOptions.zzr) && Objects.equal(Integer.valueOf(this.zzs), Integer.valueOf(connectionOptions.zzs)) && Objects.equal(Long.valueOf(this.zzt), Long.valueOf(connectionOptions.zzt)) && Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(connectionOptions.zzu)) && Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(connectionOptions.zzv)) && Objects.equal(Boolean.valueOf(this.zzw), Boolean.valueOf(connectionOptions.zzw))) {
                return true;
            }
        }
        return false;
    }

    public int getConnectionType() {
        return this.zzs;
    }

    @Deprecated
    public boolean getDisruptiveUpgrade() {
        return this.zzl;
    }

    public boolean getLowPower() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Integer.valueOf(Arrays.hashCode(this.zzi)), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Integer.valueOf(this.zzm), Integer.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Integer.valueOf(Arrays.hashCode(this.zzp)), Integer.valueOf(Arrays.hashCode(this.zzq)), this.zzr, Integer.valueOf(this.zzs), Long.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        Boolean boolValueOf = Boolean.valueOf(this.zza);
        Boolean boolValueOf2 = Boolean.valueOf(this.zzb);
        Boolean boolValueOf3 = Boolean.valueOf(this.zzc);
        Boolean boolValueOf4 = Boolean.valueOf(this.zzd);
        Boolean boolValueOf5 = Boolean.valueOf(this.zze);
        Boolean boolValueOf6 = Boolean.valueOf(this.zzf);
        Boolean boolValueOf7 = Boolean.valueOf(this.zzg);
        Boolean boolValueOf8 = Boolean.valueOf(this.zzh);
        byte[] bArr = this.zzi;
        String strZzb = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr);
        Boolean boolValueOf9 = Boolean.valueOf(this.zzj);
        Boolean boolValueOf10 = Boolean.valueOf(this.zzk);
        Boolean boolValueOf11 = Boolean.valueOf(this.zzl);
        byte[] bArr2 = this.zzq;
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s,deviceInfo: %s,strategy: %s,connectionType: %dflowId: %d, }", boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, strZzb, boolValueOf9, boolValueOf10, boolValueOf11, bArr2 != null ? com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr2) : null, this.zzr, Integer.valueOf(this.zzs), Long.valueOf(this.zzt));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getLowPower());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeByteArray(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, getDisruptiveUpgrade());
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeInt(parcel, 14, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeParcelable(parcel, 18, this.zzr, i11, false);
        SafeParcelWriter.writeInt(parcel, 19, getConnectionType());
        SafeParcelWriter.writeLong(parcel, 20, this.zzt);
        SafeParcelWriter.writeBoolean(parcel, 21, this.zzu);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ ConnectionOptions(zzm zzmVar) {
        this.zza = false;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = false;
        this.zzk = true;
        this.zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
        this.zzt = 0L;
        this.zzu = false;
        this.zzv = true;
        this.zzw = true;
    }

    @SafeParcelable.Constructor
    ConnectionOptions(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) boolean z12, @SafeParcelable.Param(id = 3) boolean z13, @SafeParcelable.Param(id = 4) boolean z14, @SafeParcelable.Param(id = 5) boolean z15, @SafeParcelable.Param(id = 6) boolean z16, @SafeParcelable.Param(id = 7) boolean z17, @SafeParcelable.Param(id = 8) boolean z18, @SafeParcelable.Param(id = 9) byte[] bArr, @SafeParcelable.Param(id = 10) boolean z19, @SafeParcelable.Param(id = 11) boolean z21, @SafeParcelable.Param(id = 12) boolean z22, @SafeParcelable.Param(id = 13) int i11, @SafeParcelable.Param(id = 14) int i12, @SafeParcelable.Param(id = 15) int[] iArr, @SafeParcelable.Param(id = 16) int[] iArr2, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) Strategy strategy, @SafeParcelable.Param(id = 19) int i13, @SafeParcelable.Param(id = 20) long j11, @SafeParcelable.Param(id = 21) boolean z23, @SafeParcelable.Param(id = 22) boolean z24, @SafeParcelable.Param(id = 23) boolean z25) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = z13;
        this.zzd = z14;
        this.zze = z15;
        this.zzf = z16;
        this.zzg = z17;
        this.zzh = z18;
        this.zzi = bArr;
        this.zzj = z19;
        this.zzk = z21;
        this.zzl = z22;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = iArr;
        this.zzp = iArr2;
        this.zzq = bArr2;
        this.zzr = strategy;
        this.zzs = i13;
        this.zzt = j11;
        this.zzu = z23;
        this.zzv = z24;
        this.zzw = z25;
    }
}
