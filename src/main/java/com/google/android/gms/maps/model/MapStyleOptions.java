package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class MapStyleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzh();
    private static final String zza = "MapStyleOptions";

    @SafeParcelable.Field(getter = "getJson", id = 2)
    private String zzb;

    @SafeParcelable.Constructor
    public MapStyleOptions(@NonNull @SafeParcelable.Param(id = 2) String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    @NonNull
    public static MapStyleOptions loadRawResourceStyle(@NonNull Context context, int i11) {
        try {
            return new MapStyleOptions(new String(IOUtils.readInputStreamFully(context.getResources().openRawResource(i11)), "UTF-8"));
        } catch (IOException e11) {
            String string = e11.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 37);
            sb2.append("Failed to read resource ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(string);
            throw new Resources.NotFoundException(sb2.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
