package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zziq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "MessageCreator")
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int MAX_CONTENT_SIZE_BYTES = 102400;
    public static final int MAX_TYPE_LENGTH = 32;

    @NonNull
    public static final String MESSAGE_NAMESPACE_RESERVED = "__reserved_namespace";

    @NonNull
    @Deprecated
    public static final String MESSAGE_TYPE_AUDIO_BYTES = "__audio_bytes";

    @NonNull
    public static final String MESSAGE_TYPE_EDDYSTONE_UID = "__eddystone_uid";

    @NonNull
    public static final String MESSAGE_TYPE_I_BEACON_ID = "__i_beacon_id";

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(id = 4)
    @Deprecated
    final zziq[] zzb;

    @SafeParcelable.Field(getter = "getContent", id = 1)
    private final byte[] zzd;

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final String zze;

    @SafeParcelable.Field(getter = "getNamespace", id = 3)
    private final String zzf;

    @SafeParcelable.Field(getter = "getProjectId", id = 5)
    private final long zzg;

    @NonNull
    public static final Parcelable.Creator<Message> CREATOR = new zza();
    private static final zziq[] zzc = {zziq.zza};

    @SafeParcelable.Constructor
    Message(@SafeParcelable.Param(id = 1000) int i11, @NonNull @SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 4) zziq[] zziqVarArr, @SafeParcelable.Param(id = 5) long j11) {
        this.zza = i11;
        this.zze = (String) Preconditions.checkNotNull(str2);
        this.zzf = str == null ? "" : str;
        this.zzg = j11;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        Preconditions.checkArgument(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), Integer.valueOf(MAX_CONTENT_SIZE_BYTES));
        this.zzd = bArr;
        this.zzb = (zziqVarArr == null || zziqVarArr.length == 0) ? zzc : zziqVarArr;
        Preconditions.checkArgument(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.zzf, message.zzf) && TextUtils.equals(this.zze, message.zze) && Arrays.equals(this.zzd, message.zzd) && this.zzg == message.zzg;
    }

    @NonNull
    public byte[] getContent() {
        return this.zzd;
    }

    @NonNull
    public String getNamespace() {
        return this.zzf;
    }

    @NonNull
    public String getType() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzf, this.zze, Integer.valueOf(Arrays.hashCode(this.zzd)), Long.valueOf(this.zzg));
    }

    @NonNull
    public String toString() {
        byte[] bArr = this.zzd;
        int length = bArr == null ? 0 : bArr.length;
        String str = this.zze;
        return "Message{namespace='" + this.zzf + "', type='" + str + "', content=[" + length + " bytes]}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, getContent(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeString(parcel, 3, getNamespace(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzb, i11, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzg);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(@NonNull String str) {
        return MESSAGE_NAMESPACE_RESERVED.equals(getNamespace()) && str.equals(getType());
    }

    public Message(@NonNull byte[] bArr) {
        this(bArr, "", "", zzc, 0L);
    }

    public Message(@NonNull byte[] bArr, @NonNull String str) {
        this(bArr, "", str, zzc, 0L);
    }

    public Message(@NonNull byte[] bArr, @NonNull String str, @NonNull String str2) {
        this(bArr, MESSAGE_NAMESPACE_RESERVED, MESSAGE_TYPE_AUDIO_BYTES, zzc, 0L);
    }

    public Message(byte[] bArr, String str, String str2, zziq[] zziqVarArr, long j11) {
        this(2, bArr, str, str2, zziqVarArr, 0L);
    }
}
