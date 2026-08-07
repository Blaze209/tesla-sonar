package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SequenceNumberCreator")
public final class zzjm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjm> CREATOR = new zzjn();

    @SafeParcelable.Field(getter = "getValue", id = 1)
    private final int zza;

    @SafeParcelable.Constructor
    public zzjm(@SafeParcelable.Param(id = 1) int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= 15) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Sequence number should be 4 bits.");
        this.zza = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzjm) && this.zza == ((zzjm) obj).zza;
    }

    public final int hashCode() {
        return Objects.hash(19, Integer.valueOf(this.zza));
    }

    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, value: %d>", "ContextSequenceNumber", Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
