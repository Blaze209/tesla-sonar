package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "DiscoveryOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class DiscoveryOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzv();

    @SafeParcelable.Field(getter = "getStrategy", id = 1)
    private Strategy zza;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getForwardUnrecognizedBluetoothDevices", id = 2)
    private boolean zzb;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 3)
    private boolean zzc;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 4)
    private boolean zzd;

    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 5)
    private boolean zze;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", id = 6)
    private ParcelUuid zzf;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 8)
    private boolean zzg;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 9)
    private boolean zzh;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 10)
    private boolean zzi;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", id = 11)
    private boolean zzj;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getUwbChannel", id = 12)
    private int zzk;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getUwbPreambleIndex", id = 13)
    private int zzl;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbAddress", id = 14)
    private byte[] zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getFlowId", id = 15)
    private long zzn;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getDiscoveryMediums", id = 16)
    private int[] zzo;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowGattConnections", id = 17)
    private boolean zzp;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 18)
    @Deprecated
    private boolean zzq;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 19)
    private boolean zzr;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 20)
    private boolean zzs;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final DiscoveryOptions zza;

        public Builder() {
            this.zza = new DiscoveryOptions((zzu) null);
        }

        @NonNull
        public DiscoveryOptions build() {
            int[] iArr = this.zza.zzo;
            if (iArr != null && iArr.length > 0) {
                this.zza.zzd = false;
                this.zza.zzc = false;
                this.zza.zzh = false;
                this.zza.zzi = false;
                this.zza.zzg = false;
                for (int i11 : iArr) {
                    if (i11 == 2) {
                        this.zza.zzc = true;
                    } else if (i11 != 11) {
                        if (i11 == 4) {
                            this.zza.zzd = true;
                        } else if (i11 == 5) {
                            this.zza.zzg = true;
                        } else if (i11 == 6) {
                            this.zza.zzi = true;
                        } else if (i11 != 7) {
                            Log.d("NearbyConnections", "Illegal discovery medium " + i11);
                        } else {
                            this.zza.zzh = true;
                        }
                    }
                }
            }
            return this.zza;
        }

        @NonNull
        public Builder setLowPower(boolean z11) {
            this.zza.zze = z11;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(@NonNull DiscoveryOptions discoveryOptions) {
            DiscoveryOptions discoveryOptions2 = new DiscoveryOptions((zzu) null);
            this.zza = discoveryOptions2;
            discoveryOptions2.zza = discoveryOptions.zza;
            discoveryOptions2.zzb = discoveryOptions.zzb;
            discoveryOptions2.zzc = discoveryOptions.zzc;
            discoveryOptions2.zzd = discoveryOptions.zzd;
            discoveryOptions2.zze = discoveryOptions.zze;
            discoveryOptions2.zzf = discoveryOptions.zzf;
            discoveryOptions2.zzg = discoveryOptions.zzg;
            discoveryOptions2.zzh = discoveryOptions.zzh;
            discoveryOptions2.zzi = discoveryOptions.zzi;
            discoveryOptions2.zzj = discoveryOptions.zzj;
            discoveryOptions2.zzk = discoveryOptions.zzk;
            discoveryOptions2.zzl = discoveryOptions.zzl;
            discoveryOptions2.zzm = discoveryOptions.zzm;
            discoveryOptions2.zzn = discoveryOptions.zzn;
            discoveryOptions2.zzo = discoveryOptions.zzo;
            discoveryOptions2.zzp = discoveryOptions.zzp;
            discoveryOptions2.zzq = discoveryOptions.zzq;
            discoveryOptions2.zzr = discoveryOptions.zzr;
            discoveryOptions2.zzs = discoveryOptions.zzs;
        }
    }

    private DiscoveryOptions() {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (Objects.equal(this.zza, discoveryOptions.zza) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(discoveryOptions.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(discoveryOptions.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(discoveryOptions.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(discoveryOptions.zze)) && Objects.equal(this.zzf, discoveryOptions.zzf) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(discoveryOptions.zzg)) && Objects.equal(Boolean.valueOf(this.zzh), Boolean.valueOf(discoveryOptions.zzh)) && Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(discoveryOptions.zzi)) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(discoveryOptions.zzj)) && Objects.equal(Integer.valueOf(this.zzk), Integer.valueOf(discoveryOptions.zzk)) && Objects.equal(Integer.valueOf(this.zzl), Integer.valueOf(discoveryOptions.zzl)) && Arrays.equals(this.zzm, discoveryOptions.zzm) && Objects.equal(Long.valueOf(this.zzn), Long.valueOf(discoveryOptions.zzn)) && Arrays.equals(this.zzo, discoveryOptions.zzo) && Objects.equal(Boolean.valueOf(this.zzp), Boolean.valueOf(discoveryOptions.zzp)) && Objects.equal(Boolean.valueOf(this.zzq), Boolean.valueOf(discoveryOptions.zzq)) && Objects.equal(Boolean.valueOf(this.zzr), Boolean.valueOf(discoveryOptions.zzr)) && Objects.equal(Boolean.valueOf(this.zzs), Boolean.valueOf(discoveryOptions.zzs))) {
                return true;
            }
        }
        return false;
    }

    public boolean getLowPower() {
        return this.zze;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, Boolean.valueOf(this.zzg), Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(this.zzk), Integer.valueOf(this.zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Long.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Boolean.valueOf(this.zzp), Boolean.valueOf(this.zzq), Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.zza;
        Boolean boolValueOf = Boolean.valueOf(this.zzb);
        Boolean boolValueOf2 = Boolean.valueOf(this.zzc);
        Boolean boolValueOf3 = Boolean.valueOf(this.zzd);
        Boolean boolValueOf4 = Boolean.valueOf(this.zze);
        ParcelUuid parcelUuid = this.zzf;
        Boolean boolValueOf5 = Boolean.valueOf(this.zzg);
        Boolean boolValueOf6 = Boolean.valueOf(this.zzh);
        Boolean boolValueOf7 = Boolean.valueOf(this.zzi);
        Boolean boolValueOf8 = Boolean.valueOf(this.zzj);
        Integer numValueOf = Integer.valueOf(this.zzk);
        Integer numValueOf2 = Integer.valueOf(this.zzl);
        byte[] bArr = this.zzm;
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, allowGattConnections: %s}", strategy, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, parcelUuid, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, numValueOf, numValueOf2, bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr), Long.valueOf(this.zzn), Boolean.valueOf(this.zzp));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i11, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeInt(parcel, 13, this.zzl);
        SafeParcelWriter.writeByteArray(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzq);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzr);
        SafeParcelWriter.writeBoolean(parcel, 20, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    public final boolean zzK() {
        return this.zzh;
    }

    /* synthetic */ DiscoveryOptions(zzu zzuVar) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
    }

    @Deprecated
    public DiscoveryOptions(@NonNull Strategy strategy) {
        this.zzb = false;
        this.zzc = true;
        this.zzd = true;
        this.zze = false;
        this.zzg = true;
        this.zzh = true;
        this.zzi = true;
        this.zzj = false;
        this.zzk = 0;
        this.zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
        this.zza = strategy;
    }

    @SafeParcelable.Constructor
    DiscoveryOptions(@SafeParcelable.Param(id = 1) Strategy strategy, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) boolean z13, @SafeParcelable.Param(id = 5) boolean z14, @SafeParcelable.Param(id = 6) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 8) boolean z15, @SafeParcelable.Param(id = 9) boolean z16, @SafeParcelable.Param(id = 10) boolean z17, @SafeParcelable.Param(id = 11) boolean z18, @SafeParcelable.Param(id = 12) int i11, @SafeParcelable.Param(id = 13) int i12, @SafeParcelable.Param(id = 14) byte[] bArr, @SafeParcelable.Param(id = 15) long j11, @SafeParcelable.Param(id = 16) int[] iArr, @SafeParcelable.Param(id = 17) boolean z19, @SafeParcelable.Param(id = 18) boolean z21, @SafeParcelable.Param(id = 19) boolean z22, @SafeParcelable.Param(id = 20) boolean z23) {
        this.zza = strategy;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = z13;
        this.zze = z14;
        this.zzf = parcelUuid;
        this.zzg = z15;
        this.zzh = z16;
        this.zzi = z17;
        this.zzj = z18;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = bArr;
        this.zzn = j11;
        this.zzo = iArr;
        this.zzp = z19;
        this.zzq = z21;
        this.zzr = z22;
        this.zzs = z23;
    }
}
