package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
public class Strategy extends AbstractSafeParcelable {

    @NonNull
    @Deprecated
    public static final Strategy BLE_ONLY;

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();

    @NonNull
    public static final Strategy DEFAULT = new Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;

    @NonNull
    @ShowFirstParty
    @Deprecated
    public static final Strategy zza;

    @SafeParcelable.VersionField(id = 1000)
    final int zzb;

    @SafeParcelable.Field(id = 1)
    @Deprecated
    final int zzc;

    @SafeParcelable.Field(id = 2)
    final int zzd;

    @SafeParcelable.Field(id = 3)
    final int zze;

    @SafeParcelable.Field(id = 4)
    @Deprecated
    final boolean zzf;

    @SafeParcelable.Field(getter = "getDiscoveryMedium", id = 5)
    final int zzg;

    @SafeParcelable.Field(getter = "getDiscoveryMode", id = 6)
    final int zzh;

    @SafeParcelable.Field(getter = "getBackgroundScanMode", id = 7)
    private final int zzi;

    public static class Builder {
        private int zza = 3;
        private int zzb = 300;
        private int zzc = 0;
        private int zzd = -1;

        @NonNull
        public Strategy build() {
            if (this.zzd == 2 && this.zzc == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.zzb, this.zzc, false, this.zzd, this.zza, 0);
        }

        @NonNull
        public Builder setDiscoveryMode(int i11) {
            this.zza = i11;
            return this;
        }

        @NonNull
        public Builder setDistanceType(int i11) {
            this.zzc = i11;
            return this;
        }

        @NonNull
        public Builder setTtlSeconds(int i11) {
            boolean z11 = true;
            if (i11 != Integer.MAX_VALUE && (i11 <= 0 || i11 > 86400)) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i11), Integer.valueOf(Strategy.TTL_SECONDS_MAX));
            this.zzb = i11;
            return this;
        }

        @NonNull
        @ShowFirstParty
        public final Builder zza(int i11) {
            this.zzd = 2;
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.zza(2);
        builder.setTtlSeconds(Integer.MAX_VALUE);
        Strategy strategyBuild = builder.build();
        BLE_ONLY = strategyBuild;
        zza = strategyBuild;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b A[PHI: r8
      0x000b: PHI (r8v2 int) = (r8v0 int), (r8v1 int) binds: [B:3:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @SafeParcelable.Constructor
    Strategy(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 1) int i12, @SafeParcelable.Param(id = 2) int i13, @SafeParcelable.Param(id = 3) int i14, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) int i15, @SafeParcelable.Param(id = 6) int i16, @SafeParcelable.Param(id = 7) int i17) {
        this.zzb = i11;
        this.zzc = i12;
        if (i12 == 0) {
            this.zzh = i16;
        } else if (i12 != 2) {
            i16 = 3;
            if (i12 != 3) {
                this.zzh = i16;
            } else {
                this.zzh = 2;
            }
        } else {
            this.zzh = 1;
        }
        this.zze = i14;
        this.zzf = z11;
        if (z11) {
            this.zzg = 2;
            this.zzd = Integer.MAX_VALUE;
        } else {
            this.zzd = i13;
            if (i15 == -1 || i15 == 0 || i15 == 1 || i15 == 6) {
                this.zzg = -1;
            } else {
                this.zzg = i15;
            }
        }
        this.zzi = i17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.zzb == strategy.zzb && this.zzh == strategy.zzh && this.zzd == strategy.zzd && this.zze == strategy.zze && this.zzg == strategy.zzg && this.zzi == strategy.zzi;
    }

    public int hashCode() {
        return (((((((((this.zzb * 31) + this.zzh) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzg) * 31) + this.zzi;
    }

    @NonNull
    public String toString() {
        String str;
        String string;
        String string2;
        int i11 = this.zze;
        String str2 = "DEFAULT";
        if (i11 == 0) {
            str = "DEFAULT";
        } else if (i11 != 1) {
            str = "UNKNOWN:" + i11;
        } else {
            str = "EARSHOT";
        }
        int i12 = this.zzg;
        if (i12 == -1) {
            string = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i12 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i12 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                string = "UNKNOWN:" + i12;
            } else {
                string = arrayList.toString();
            }
        }
        int i13 = this.zzh;
        if (i13 == 3) {
            string2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i13 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i13 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                string2 = "UNKNOWN:" + i13;
            } else {
                string2 = arrayList2.toString();
            }
        }
        int i14 = this.zzi;
        if (i14 != 0) {
            if (i14 != 1) {
                str2 = "UNKNOWN: " + i14;
            } else {
                str2 = "ALWAYS_ON";
            }
        }
        return "Strategy{ttlSeconds=" + this.zzd + ", distanceType=" + str + ", discoveryMedium=" + string + ", discoveryMode=" + string2 + ", backgroundScanMode=" + str2 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zzc;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zzd);
        SafeParcelWriter.writeInt(parcel, 3, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzf);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeInt(parcel, 6, this.zzh);
        SafeParcelWriter.writeInt(parcel, 7, this.zzi);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }
}
