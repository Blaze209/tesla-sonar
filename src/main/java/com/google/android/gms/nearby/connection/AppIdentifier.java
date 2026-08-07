package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "AppIdentifierCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class AppIdentifier extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getIdentifier", id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public AppIdentifier(@NonNull @SafeParcelable.Param(id = 1) String str) {
        this.zza = Preconditions.checkNotEmpty(str, "Missing application identifier value");
    }

    @NonNull
    public String getIdentifier() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getIdentifier(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
