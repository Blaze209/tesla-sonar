package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PayloadTransferUpdateCreator")
@SafeParcelable.Reserved({1000})
public final class PayloadTransferUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzy();

    @SafeParcelable.Field(getter = "getPayloadId", id = 1)
    private long zza;

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getTotalBytes", id = 3)
    private long zzc;

    @SafeParcelable.Field(getter = "getBytesTransferred", id = 4)
    private long zzd;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final PayloadTransferUpdate zza;

        public Builder() {
            this.zza = new PayloadTransferUpdate(null);
        }

        @NonNull
        public PayloadTransferUpdate build() {
            return this.zza;
        }

        @NonNull
        public Builder setBytesTransferred(long j11) {
            this.zza.zzd = j11;
            return this;
        }

        @NonNull
        public Builder setPayloadId(long j11) {
            this.zza.zza = j11;
            return this;
        }

        @NonNull
        public Builder setStatus(int i11) {
            this.zza.zzb = i11;
            return this;
        }

        @NonNull
        public Builder setTotalBytes(long j11) {
            this.zza.zzc = j11;
            return this;
        }

        public Builder(@NonNull PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate(null);
            this.zza = payloadTransferUpdate2;
            payloadTransferUpdate2.zza = payloadTransferUpdate.zza;
            payloadTransferUpdate2.zzb = payloadTransferUpdate.zzb;
            payloadTransferUpdate2.zzc = payloadTransferUpdate.zzc;
            payloadTransferUpdate2.zzd = payloadTransferUpdate.zzd;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CANCELED = 4;
        public static final int FAILURE = 2;
        public static final int IN_PROGRESS = 3;
        public static final int SUCCESS = 1;
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (Objects.equal(Long.valueOf(this.zza), Long.valueOf(payloadTransferUpdate.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(payloadTransferUpdate.zzb)) && Objects.equal(Long.valueOf(this.zzc), Long.valueOf(payloadTransferUpdate.zzc)) && Objects.equal(Long.valueOf(this.zzd), Long.valueOf(payloadTransferUpdate.zzd))) {
                return true;
            }
        }
        return false;
    }

    public long getBytesTransferred() {
        return this.zzd;
    }

    public long getPayloadId() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzb;
    }

    public long getTotalBytes() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getPayloadId());
        SafeParcelWriter.writeInt(parcel, 2, getStatus());
        SafeParcelWriter.writeLong(parcel, 3, getTotalBytes());
        SafeParcelWriter.writeLong(parcel, 4, getBytesTransferred());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    PayloadTransferUpdate(@SafeParcelable.Param(id = 1) long j11, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) long j12, @SafeParcelable.Param(id = 4) long j13) {
        this.zza = j11;
        this.zzb = i11;
        this.zzc = j12;
        this.zzd = j13;
    }

    /* synthetic */ PayloadTransferUpdate(zzx zzxVar) {
    }
}
