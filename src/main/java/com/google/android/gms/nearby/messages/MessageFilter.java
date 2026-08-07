package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzis;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "MessageFilterCreator")
public class MessageFilter extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();

    @NonNull
    public static final MessageFilter INCLUDE_ALL_MY_TYPES;

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(getter = "getMessageTypes", id = 1)
    private final List zzb;

    @SafeParcelable.Field(getter = "getDeviceFilters", id = 2)
    private final List zzc;

    @SafeParcelable.Field(getter = "getIncludeAllMyTypes", id = 3)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "getBleFilters", id = 4)
    private final List zze;

    @SafeParcelable.Field(getter = "getNumRawAudioBytes", id = 5)
    private final int zzf;

    public static final class Builder {
        private boolean zzd;
        private final Set zza = new HashSet();
        private final List zzb = new ArrayList();
        private final Set zzc = new HashSet();
        private int zze = 0;

        private final Builder zza(String str, String str2) {
            this.zza.add(new zzac(str, str2));
            return this;
        }

        @NonNull
        public MessageFilter build() {
            boolean z11 = true;
            if (!this.zzd && this.zza.isEmpty()) {
                z11 = false;
            }
            Preconditions.checkState(z11, "At least one of the include methods must be called.");
            return new MessageFilter(2, new ArrayList(this.zza), this.zzb, this.zzd, new ArrayList(this.zzc), this.zze);
        }

        @NonNull
        public Builder includeAllMyTypes() {
            this.zzd = true;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder includeAudioBytes(int i11) {
            Preconditions.checkArgument(this.zze == 0, "includeAudioBytes() can only be called once per MessageFilter instance.");
            Preconditions.checkArgument(i11 > 0, "Invalid value for numAudioBytes: " + i11);
            Preconditions.checkArgument(i11 <= 10, "numAudioBytes is capped by AudioBytes.MAX_SIZE = 10");
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_AUDIO_BYTES);
            this.zze = i11;
            return this;
        }

        @NonNull
        public Builder includeEddystoneUids(@NonNull String str, String str2) {
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_EDDYSTONE_UID);
            this.zzb.add(zzis.zza(str, str2));
            return this;
        }

        @NonNull
        public Builder includeFilter(@NonNull MessageFilter messageFilter) {
            this.zza.addAll(messageFilter.zzc());
            this.zzb.addAll(messageFilter.zzb());
            this.zzc.addAll(messageFilter.zza());
            this.zzd = messageFilter.zzd() | this.zzd;
            return this;
        }

        @NonNull
        public Builder includeIBeaconIds(@NonNull UUID uuid, Short sh2, Short sh3) {
            zza(Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_I_BEACON_ID);
            this.zzb.add(zzis.zzb(uuid, sh2, sh3));
            return this;
        }

        @NonNull
        public Builder includeNamespacedType(@NonNull String str, @NonNull String str2) {
            Preconditions.checkArgument((str == null || str.isEmpty() || str.contains(Marker.ANY_MARKER)) ? false : true, "namespace(%s) cannot be null, empty or contain (*).", str);
            Preconditions.checkArgument((str2 == null || str2.contains(Marker.ANY_MARKER)) ? false : true, "type(%s) cannot be null or contain (*).", str2);
            zza(str, str2);
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.includeAllMyTypes();
        INCLUDE_ALL_MY_TYPES = builder.build();
    }

    @SafeParcelable.Constructor
    MessageFilter(@SafeParcelable.Param(id = 1000) int i11, @SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) boolean z11, @SafeParcelable.Param(id = 4) List list3, @SafeParcelable.Param(id = 5) int i12) {
        this.zza = i11;
        this.zzb = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
        this.zzd = z11;
        this.zzc = Collections.unmodifiableList(list2 == null ? Collections.EMPTY_LIST : list2);
        this.zze = Collections.unmodifiableList(list3 == null ? Collections.EMPTY_LIST : list3);
        this.zzf = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.zzd == messageFilter.zzd && Objects.equal(this.zzb, messageFilter.zzb) && Objects.equal(this.zzc, messageFilter.zzc) && Objects.equal(this.zze, messageFilter.zze);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, Boolean.valueOf(this.zzd), this.zze);
    }

    @NonNull
    public String toString() {
        return "MessageFilter{includeAllMyTypes=" + this.zzd + ", messageTypes=" + String.valueOf(this.zzb) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        List list = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzf);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final List zza() {
        return this.zze;
    }

    final List zzb() {
        return this.zzc;
    }

    @NonNull
    public final List zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzd;
    }
}
