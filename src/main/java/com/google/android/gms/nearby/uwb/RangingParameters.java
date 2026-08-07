package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RangingParameters {
    public static final int SESSION_ID_UNSET = 0;
    public static final int SLOT_DURATION_DEFAULT = 2;
    public static final int SUB_SESSION_ID_UNSET = 0;
    private static final byte[] zza = {7, 8, 1, 2, 3, 4, 5, 6};

    @UwbConfigId
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final UwbComplexChannel zzg;
    private final List zzh;

    @RangingUpdateRate
    private final int zzi;

    @NonNull
    private final UwbRangeDataNtfConfig zzj;

    @SlotDuration
    private final int zzk;
    private final boolean zzl;

    public static class Builder {
        private byte[] zzf;
        private UwbComplexChannel zzg;

        @UwbConfigId
        private int zzb = 0;
        private int zzc = 0;
        private int zzd = 0;
        private byte[] zze = RangingParameters.zza;
        private final List zzh = new ArrayList();

        @RangingUpdateRate
        int zza = 3;
        private UwbRangeDataNtfConfig zzi = new UwbRangeDataNtfConfig.Builder().build();

        @SlotDuration
        private int zzj = 2;
        private boolean zzk = false;

        @NonNull
        public Builder addPeerDevice(@NonNull UwbDevice uwbDevice) {
            Preconditions.checkNotNull(uwbDevice, "peerDevice cannot be null.");
            this.zzh.add(uwbDevice);
            return this;
        }

        @NonNull
        public RangingParameters build() {
            int length;
            boolean z11 = true;
            Preconditions.checkArgument(!this.zzh.isEmpty(), "At least 1 peer device must be set.");
            Preconditions.checkArgument(this.zzb != 0);
            Preconditions.checkArgument(this.zza != 0);
            int i11 = this.zzb;
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 1000 || i11 == 1001 || i11 == 1004 || i11 == 1005) {
                byte[] bArr = this.zze;
                Preconditions.checkArgument(bArr != null && bArr.length == 8);
                Preconditions.checkArgument(this.zzd == 0);
                Preconditions.checkArgument(this.zzf == null);
            }
            int i12 = this.zzb;
            if (i12 == 4 || i12 == 5 || i12 == 6 || i12 == 1002 || i12 == 1003) {
                byte[] bArr2 = this.zze;
                Preconditions.checkArgument(bArr2 != null && bArr2.length == 16, "At present, only 16 byte session key is supported for provisoned STS");
                Preconditions.checkArgument(this.zzd == 0);
                Preconditions.checkArgument(this.zzf == null);
            }
            if (this.zzb == 7) {
                Preconditions.checkArgument(this.zzd != 0);
                byte[] bArr3 = this.zze;
                Preconditions.checkArgument(bArr3 != null && bArr3.length == 16, "At present, only 16 byte session key is supported for provisoned STS");
                byte[] bArr4 = this.zzf;
                if (bArr4 == null || ((length = bArr4.length) != 16 && length != 32)) {
                    z11 = false;
                }
                Preconditions.checkArgument(z11);
            }
            return new RangingParameters(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zza, this.zzh, this.zzi, this.zzj, this.zzk, null);
        }

        @NonNull
        public Builder setComplexChannel(UwbComplexChannel uwbComplexChannel) {
            this.zzg = uwbComplexChannel;
            return this;
        }

        @NonNull
        public Builder setIsAoaDisabled(boolean z11) {
            this.zzk = z11;
            return this;
        }

        @NonNull
        public Builder setRangingUpdateRate(@RangingUpdateRate int i11) {
            this.zza = i11;
            return this;
        }

        @NonNull
        public Builder setSessionId(int i11) {
            this.zzc = i11;
            return this;
        }

        @NonNull
        public Builder setSessionKeyInfo(byte[] bArr) {
            this.zze = bArr;
            return this;
        }

        @NonNull
        public Builder setSlotDuration(@SlotDuration int i11) {
            this.zzj = i11;
            return this;
        }

        @NonNull
        public Builder setSubSessionId(int i11) {
            this.zzd = i11;
            return this;
        }

        @NonNull
        public Builder setSubSessionKeyInfo(byte[] bArr) {
            this.zzf = bArr;
            return this;
        }

        @NonNull
        public Builder setUwbConfigId(@UwbConfigId int i11) {
            this.zzb = i11;
            return this;
        }

        @NonNull
        public Builder setUwbRangeDataNtfConfig(@NonNull UwbRangeDataNtfConfig uwbRangeDataNtfConfig) {
            this.zzi = uwbRangeDataNtfConfig;
            return this;
        }
    }

    public @interface RangingUpdateRate {
        public static final int AUTOMATIC = 1;
        public static final int FREQUENT = 3;
        public static final int INFREQUENT = 2;
        public static final int UNKNOWN = 0;
    }

    public @interface SlotDuration {
        public static final int DURATION_1_MS = 1;
        public static final int DURATION_2_MS = 2;
    }

    public @interface UwbConfigId {
        public static final int CONFIG_ID_1 = 1;
        public static final int CONFIG_ID_2 = 2;
        public static final int CONFIG_ID_3 = 3;
        public static final int CONFIG_ID_4 = 4;
        public static final int CONFIG_ID_5 = 5;
        public static final int CONFIG_ID_6 = 6;
        public static final int CONFIG_ID_7 = 7;
    }

    /* synthetic */ RangingParameters(int i11, int i12, int i13, byte[] bArr, byte[] bArr2, UwbComplexChannel uwbComplexChannel, int i14, List list, UwbRangeDataNtfConfig uwbRangeDataNtfConfig, int i15, boolean z11, zza zzaVar) {
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = uwbComplexChannel;
        this.zzi = i14;
        this.zzh = list;
        this.zzj = uwbRangeDataNtfConfig;
        this.zzk = i15;
        this.zzl = z11;
    }

    public UwbComplexChannel getComplexChannel() {
        return this.zzg;
    }

    @NonNull
    public List<UwbDevice> getPeerDevices() {
        return this.zzh;
    }

    @RangingUpdateRate
    public int getRangingUpdateRate() {
        return this.zzi;
    }

    public int getSessionId() {
        return this.zzc;
    }

    public byte[] getSessionKeyInfo() {
        return this.zze;
    }

    @SlotDuration
    public int getSlotDuration() {
        return this.zzk;
    }

    public int getSubSessionId() {
        return this.zzd;
    }

    public byte[] getSubSessionKeyInfo() {
        return this.zzf;
    }

    @UwbConfigId
    public int getUwbConfigId() {
        return this.zzb;
    }

    @NonNull
    public UwbRangeDataNtfConfig getUwbRangeDataNtfConfig() {
        return this.zzj;
    }

    public boolean isAoaDisabled() {
        return this.zzl;
    }
}
