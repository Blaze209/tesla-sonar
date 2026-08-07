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
@SafeParcelable.Class(creator = "AdvertisingOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class AdvertisingOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getPowerLevel", id = 27)
    private int zzA;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getDeviceInfo", id = 28)
    private byte[] zzB;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowGattConnections", id = 29)
    private boolean zzC;

    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getConnectionType", id = 30)
    private int zzD;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 31)
    @Deprecated
    private boolean zzE;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 32)
    private boolean zzF;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 33)
    private boolean zzG;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBleL2capListening", id = 34)
    private boolean zzH;

    @SafeParcelable.Field(getter = "getStrategy", id = 1)
    private Strategy zza;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAutoUpgradeBandwidth", id = 2)
    private boolean zzb;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", id = 3)
    private boolean zzc;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 4)
    private boolean zzd;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getNearbyNotificationsBeaconData", id = 6)
    private byte[] zzf;

    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 7)
    private boolean zzg;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", id = 8)
    private ParcelUuid zzh;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 9)
    private boolean zzi;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 10)
    private boolean zzj;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 11)
    private boolean zzk;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableBluetoothListening", id = 12)
    private boolean zzl;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcListening", id = 13)
    private boolean zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", id = 14)
    private boolean zzn;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getUwbChannel", id = 15)
    private int zzo;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getUwbPreambleIndex", id = 16)
    private int zzp;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteUwbAddress", id = 17)
    private byte[] zzq;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = WebrtcBuildVersion.maint_version, getter = "getFlowId", id = 18)
    private long zzr;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbSenderInfo", id = 19)
    private zzac[] zzs;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableOutOfBandConnection", id = 20)
    private boolean zzt;

    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", id = 21)
    @Deprecated
    private boolean zzu;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcUpgrade", id = 22)
    private boolean zzv;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getUseStableIdentifiers", id = 23)
    private boolean zzw;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getAdvertisingMediums", id = 24)
    private int[] zzx;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUpgradeMediums", id = 25)
    private int[] zzy;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableUpgradeMediumsRankingOptimization", id = 26)
    private boolean zzz;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final AdvertisingOptions zza;

        public Builder() {
            this.zza = new AdvertisingOptions((zza) null);
        }

        @NonNull
        public AdvertisingOptions build() {
            int[] iArr = this.zza.zzx;
            if (iArr != null && iArr.length > 0) {
                this.zza.zze = false;
                this.zza.zzd = false;
                this.zza.zzj = false;
                this.zza.zzk = false;
                this.zza.zzi = false;
                this.zza.zzm = false;
                for (int i11 : iArr) {
                    if (i11 == 2) {
                        this.zza.zzd = true;
                    } else if (i11 == 9) {
                        this.zza.zzm = true;
                    } else if (i11 != 11) {
                        if (i11 == 4) {
                            this.zza.zze = true;
                        } else if (i11 == 5) {
                            this.zza.zzi = true;
                        } else if (i11 == 6) {
                            this.zza.zzk = true;
                        } else if (i11 != 7) {
                            Log.d("NearbyConnections", "Illegal advertising medium " + i11);
                        } else {
                            this.zza.zzj = true;
                        }
                    }
                }
            }
            if (this.zza.zzy != null && this.zza.zzy.length > 0) {
                this.zza.zzv = false;
                for (int i12 = 0; i12 < this.zza.zzy.length; i12++) {
                    if (this.zza.zzy[i12] == 9) {
                        this.zza.zzv = true;
                        break;
                    }
                }
            }
            if (this.zza.zzA == 0) {
                AdvertisingOptions advertisingOptions = this.zza;
                advertisingOptions.zzA = true == advertisingOptions.zzg ? 1 : 3;
            } else {
                AdvertisingOptions advertisingOptions2 = this.zza;
                advertisingOptions2.zzg = advertisingOptions2.zzA != 3;
            }
            if (this.zza.zzD != 0) {
                AdvertisingOptions advertisingOptions3 = this.zza;
                advertisingOptions3.zzu = advertisingOptions3.zzD == 1;
            } else if (!this.zza.zzu) {
                this.zza.zzD = 2;
            }
            return this.zza;
        }

        @NonNull
        public Builder setConnectionType(int i11) {
            this.zza.zzD = i11;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDisruptiveUpgrade(boolean z11) {
            this.zza.zzu = z11;
            return this;
        }

        @NonNull
        public Builder setLowPower(boolean z11) {
            this.zza.zzg = z11;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.zza.zza = strategy;
            return this;
        }

        public Builder(@NonNull AdvertisingOptions advertisingOptions) {
            AdvertisingOptions advertisingOptions2 = new AdvertisingOptions((zza) null);
            this.zza = advertisingOptions2;
            advertisingOptions2.zza = advertisingOptions.zza;
            advertisingOptions2.zzb = advertisingOptions.zzb;
            advertisingOptions2.zzc = advertisingOptions.zzc;
            advertisingOptions2.zzd = advertisingOptions.zzd;
            advertisingOptions2.zze = advertisingOptions.zze;
            advertisingOptions2.zzf = advertisingOptions.zzf;
            advertisingOptions2.zzg = advertisingOptions.zzg;
            advertisingOptions2.zzh = advertisingOptions.zzh;
            advertisingOptions2.zzi = advertisingOptions.zzi;
            advertisingOptions2.zzj = advertisingOptions.zzj;
            advertisingOptions2.zzk = advertisingOptions.zzk;
            advertisingOptions2.zzl = advertisingOptions.zzl;
            advertisingOptions2.zzm = advertisingOptions.zzm;
            advertisingOptions2.zzn = advertisingOptions.zzn;
            advertisingOptions2.zzo = advertisingOptions.zzo;
            advertisingOptions2.zzp = advertisingOptions.zzp;
            advertisingOptions2.zzq = advertisingOptions.zzq;
            advertisingOptions2.zzr = advertisingOptions.zzr;
            advertisingOptions2.zzs = advertisingOptions.zzs;
            advertisingOptions2.zzt = advertisingOptions.zzt;
            advertisingOptions2.zzu = advertisingOptions.zzu;
            advertisingOptions2.zzv = advertisingOptions.zzv;
            advertisingOptions2.zzw = advertisingOptions.zzw;
            advertisingOptions2.zzx = advertisingOptions.zzx;
            advertisingOptions2.zzy = advertisingOptions.zzy;
            advertisingOptions2.zzz = advertisingOptions.zzz;
            advertisingOptions2.zzA = advertisingOptions.zzA;
            advertisingOptions2.zzB = advertisingOptions.zzB;
            advertisingOptions2.zzC = advertisingOptions.zzC;
            advertisingOptions2.zzD = advertisingOptions.zzD;
            advertisingOptions2.zzE = advertisingOptions.zzE;
            advertisingOptions2.zzF = advertisingOptions.zzF;
            advertisingOptions2.zzG = advertisingOptions.zzG;
            advertisingOptions2.zzH = advertisingOptions.zzH;
        }
    }

    private AdvertisingOptions() {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
        this.zzH = true;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (Objects.equal(this.zza, advertisingOptions.zza) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(advertisingOptions.zzb)) && Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(advertisingOptions.zzc)) && Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(advertisingOptions.zzd)) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(advertisingOptions.zze)) && Arrays.equals(this.zzf, advertisingOptions.zzf) && Objects.equal(Boolean.valueOf(this.zzg), Boolean.valueOf(advertisingOptions.zzg)) && Objects.equal(this.zzh, advertisingOptions.zzh) && Objects.equal(Boolean.valueOf(this.zzi), Boolean.valueOf(advertisingOptions.zzi)) && Objects.equal(Boolean.valueOf(this.zzj), Boolean.valueOf(advertisingOptions.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(advertisingOptions.zzk)) && Objects.equal(Boolean.valueOf(this.zzl), Boolean.valueOf(advertisingOptions.zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(advertisingOptions.zzm)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(advertisingOptions.zzn)) && Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(advertisingOptions.zzo)) && Objects.equal(Integer.valueOf(this.zzp), Integer.valueOf(advertisingOptions.zzp)) && Arrays.equals(this.zzq, advertisingOptions.zzq) && Objects.equal(Long.valueOf(this.zzr), Long.valueOf(advertisingOptions.zzr)) && Arrays.equals(this.zzs, advertisingOptions.zzs) && Objects.equal(Boolean.valueOf(this.zzt), Boolean.valueOf(advertisingOptions.zzt)) && Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(advertisingOptions.zzu)) && Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(advertisingOptions.zzv)) && Objects.equal(Boolean.valueOf(this.zzw), Boolean.valueOf(advertisingOptions.zzw)) && Arrays.equals(this.zzx, advertisingOptions.zzx) && Arrays.equals(this.zzy, advertisingOptions.zzy) && Objects.equal(Boolean.valueOf(this.zzz), Boolean.valueOf(advertisingOptions.zzz)) && Objects.equal(Integer.valueOf(this.zzA), Integer.valueOf(advertisingOptions.zzA)) && Arrays.equals(this.zzB, advertisingOptions.zzB) && Objects.equal(Boolean.valueOf(this.zzC), Boolean.valueOf(advertisingOptions.zzC)) && Objects.equal(Integer.valueOf(this.zzD), Integer.valueOf(advertisingOptions.zzD)) && Objects.equal(Boolean.valueOf(this.zzE), Boolean.valueOf(advertisingOptions.zzE)) && Objects.equal(Boolean.valueOf(this.zzF), Boolean.valueOf(advertisingOptions.zzF)) && Objects.equal(Boolean.valueOf(this.zzG), Boolean.valueOf(advertisingOptions.zzG)) && Objects.equal(Boolean.valueOf(this.zzH), Boolean.valueOf(advertisingOptions.zzH))) {
                return true;
            }
        }
        return false;
    }

    public int getConnectionType() {
        return this.zzD;
    }

    @Deprecated
    public boolean getDisruptiveUpgrade() {
        return this.zzu;
    }

    public boolean getLowPower() {
        return this.zzg;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Integer.valueOf(Arrays.hashCode(this.zzf)), Boolean.valueOf(this.zzg), this.zzh, Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzo), Integer.valueOf(this.zzp), Integer.valueOf(Arrays.hashCode(this.zzq)), Long.valueOf(this.zzr), Integer.valueOf(Arrays.hashCode(this.zzs)), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw), Integer.valueOf(Arrays.hashCode(this.zzx)), Integer.valueOf(Arrays.hashCode(this.zzy)), Boolean.valueOf(this.zzz), Integer.valueOf(this.zzA), Integer.valueOf(Arrays.hashCode(this.zzB)), Boolean.valueOf(this.zzC), Integer.valueOf(this.zzD), Boolean.valueOf(this.zzE), Boolean.valueOf(this.zzF), Boolean.valueOf(this.zzG), Boolean.valueOf(this.zzH));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.zza;
        Boolean boolValueOf = Boolean.valueOf(this.zzb);
        Boolean boolValueOf2 = Boolean.valueOf(this.zzc);
        Boolean boolValueOf3 = Boolean.valueOf(this.zzd);
        Boolean boolValueOf4 = Boolean.valueOf(this.zze);
        byte[] bArr = this.zzf;
        String strZzb = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr);
        Boolean boolValueOf5 = Boolean.valueOf(this.zzg);
        ParcelUuid parcelUuid = this.zzh;
        Boolean boolValueOf6 = Boolean.valueOf(this.zzi);
        Boolean boolValueOf7 = Boolean.valueOf(this.zzj);
        Boolean boolValueOf8 = Boolean.valueOf(this.zzk);
        Boolean boolValueOf9 = Boolean.valueOf(this.zzl);
        Boolean boolValueOf10 = Boolean.valueOf(this.zzm);
        Boolean boolValueOf11 = Boolean.valueOf(this.zzn);
        Integer numValueOf = Integer.valueOf(this.zzo);
        Integer numValueOf2 = Integer.valueOf(this.zzp);
        byte[] bArr2 = this.zzq;
        String strZzb2 = bArr2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr2);
        Long lValueOf = Long.valueOf(this.zzr);
        String string = Arrays.toString(this.zzs);
        Boolean boolValueOf12 = Boolean.valueOf(this.zzt);
        Boolean boolValueOf13 = Boolean.valueOf(this.zzu);
        Boolean boolValueOf14 = Boolean.valueOf(this.zzw);
        byte[] bArr3 = this.zzB;
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s, useStableIdentifiers: %s, deviceInfo: %s,allowGattConnections: %s, connectionType: %d, enableBleL2capListening: %s}", strategy, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, strZzb, boolValueOf5, parcelUuid, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, numValueOf, numValueOf2, strZzb2, lValueOf, string, boolValueOf12, boolValueOf13, boolValueOf14, bArr3 == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr3), Boolean.valueOf(this.zzC), Integer.valueOf(this.zzD), Boolean.valueOf(this.zzH));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i11, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        SafeParcelWriter.writeInt(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeLong(parcel, 18, this.zzr);
        SafeParcelWriter.writeTypedArray(parcel, 19, this.zzs, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 20, this.zzt);
        SafeParcelWriter.writeBoolean(parcel, 21, getDisruptiveUpgrade());
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzw);
        SafeParcelWriter.writeIntArray(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeIntArray(parcel, 25, this.zzy, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzz);
        SafeParcelWriter.writeInt(parcel, 27, this.zzA);
        SafeParcelWriter.writeByteArray(parcel, 28, this.zzB, false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzC);
        SafeParcelWriter.writeInt(parcel, 30, getConnectionType());
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzE);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzF);
        SafeParcelWriter.writeBoolean(parcel, 33, this.zzG);
        SafeParcelWriter.writeBoolean(parcel, 34, this.zzH);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* synthetic */ AdvertisingOptions(zza zzaVar) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
        this.zzH = true;
    }

    @Deprecated
    public AdvertisingOptions(@NonNull Strategy strategy) {
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzg = false;
        this.zzi = true;
        this.zzj = true;
        this.zzk = true;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
        this.zzH = true;
        this.zza = strategy;
    }

    @SafeParcelable.Constructor
    AdvertisingOptions(@SafeParcelable.Param(id = 1) Strategy strategy, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) boolean z13, @SafeParcelable.Param(id = 5) boolean z14, @SafeParcelable.Param(id = 6) byte[] bArr, @SafeParcelable.Param(id = 7) boolean z15, @SafeParcelable.Param(id = 8) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 9) boolean z16, @SafeParcelable.Param(id = 10) boolean z17, @SafeParcelable.Param(id = 11) boolean z18, @SafeParcelable.Param(id = 12) boolean z19, @SafeParcelable.Param(id = 13) boolean z21, @SafeParcelable.Param(id = 14) boolean z22, @SafeParcelable.Param(id = 15) int i11, @SafeParcelable.Param(id = 16) int i12, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) long j11, @SafeParcelable.Param(id = 19) zzac[] zzacVarArr, @SafeParcelable.Param(id = 20) boolean z23, @SafeParcelable.Param(id = 21) boolean z24, @SafeParcelable.Param(id = 22) boolean z25, @SafeParcelable.Param(id = 23) boolean z26, @SafeParcelable.Param(id = 24) int[] iArr, @SafeParcelable.Param(id = 25) int[] iArr2, @SafeParcelable.Param(id = 26) boolean z27, @SafeParcelable.Param(id = 27) int i13, @SafeParcelable.Param(id = 28) byte[] bArr3, @SafeParcelable.Param(id = 29) boolean z28, @SafeParcelable.Param(id = 30) int i14, @SafeParcelable.Param(id = 31) boolean z29, @SafeParcelable.Param(id = 32) boolean z31, @SafeParcelable.Param(id = 33) boolean z32, @SafeParcelable.Param(id = 34) boolean z33) {
        this.zza = strategy;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = z13;
        this.zze = z14;
        this.zzf = bArr;
        this.zzg = z15;
        this.zzh = parcelUuid;
        this.zzi = z16;
        this.zzj = z17;
        this.zzk = z18;
        this.zzl = z19;
        this.zzm = z21;
        this.zzn = z22;
        this.zzo = i11;
        this.zzp = i12;
        this.zzq = bArr2;
        this.zzr = j11;
        this.zzs = zzacVarArr;
        this.zzt = z23;
        this.zzu = z24;
        this.zzv = z25;
        this.zzw = z26;
        this.zzx = iArr;
        this.zzy = iArr2;
        this.zzz = z27;
        this.zzA = i13;
        this.zzB = bArr3;
        this.zzC = z28;
        this.zzD = i14;
        this.zzE = z29;
        this.zzF = z31;
        this.zzG = z32;
        this.zzH = z33;
    }
}
