package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "StrategyCreator")
@SafeParcelable.Reserved({1000})
public final class Strategy extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getConnectionType", id = 3)
    private final int zza;

    @SafeParcelable.Field(getter = "getTopology", id = 4)
    private final int zzb;

    @NonNull
    public static final Parcelable.Creator<Strategy> CREATOR = new zzz();

    @NonNull
    public static final Strategy P2P_CLUSTER = new Strategy(1, 3);

    @NonNull
    public static final Strategy P2P_STAR = new Strategy(1, 2);

    @NonNull
    public static final Strategy P2P_POINT_TO_POINT = new Strategy(1, 1);

    @SafeParcelable.Constructor
    Strategy(@SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12) {
        this.zza = i11;
        this.zzb = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.zza == strategy.zza && this.zzb == strategy.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        String str;
        Locale locale = Locale.US;
        if (P2P_CLUSTER.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (P2P_STAR.equals(this)) {
            str = "P2P_STAR";
        } else {
            str = P2P_POINT_TO_POINT.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN";
        }
        return String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", str, Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 3, i12);
        SafeParcelWriter.writeInt(parcel, 4, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
