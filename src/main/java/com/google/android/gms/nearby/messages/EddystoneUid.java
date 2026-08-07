package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class EddystoneUid {
    public static final int INSTANCE_LENGTH = 6;
    public static final int LENGTH = 16;
    public static final int NAMESPACE_LENGTH = 10;
    private final com.google.android.gms.nearby.messages.internal.zzg zza;

    public EddystoneUid(@NonNull String str) {
        this(com.google.android.gms.nearby.messages.internal.zzc.zzd(str));
    }

    @NonNull
    public static EddystoneUid from(@NonNull Message message) {
        Preconditions.checkArgument(message.zza(Message.MESSAGE_TYPE_EDDYSTONE_UID), "Message type '" + message.getType() + "' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.");
        return new EddystoneUid(message.getContent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EddystoneUid) {
            return Objects.equal(this.zza, ((EddystoneUid) obj).zza);
        }
        return false;
    }

    @NonNull
    public String getHex() {
        return this.zza.zza();
    }

    @NonNull
    public String getInstance() {
        byte[] bArrZzc = this.zza.zzc();
        if (bArrZzc.length < 16) {
            return null;
        }
        return com.google.android.gms.nearby.messages.internal.zzc.zzb(Arrays.copyOfRange(bArrZzc, 10, 16));
    }

    @NonNull
    public String getNamespace() {
        return com.google.android.gms.nearby.messages.internal.zzc.zzb(Arrays.copyOfRange(this.zza.zzc(), 0, 10));
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @NonNull
    public String toString() {
        return "EddystoneUid{id=" + getHex() + "}";
    }

    public EddystoneUid(@NonNull String str, @NonNull String str2) {
        this.zza = new com.google.android.gms.nearby.messages.internal.zzg(str, str2);
    }

    public EddystoneUid(@NonNull byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        this.zza = new com.google.android.gms.nearby.messages.internal.zzg(bArr);
    }
}
