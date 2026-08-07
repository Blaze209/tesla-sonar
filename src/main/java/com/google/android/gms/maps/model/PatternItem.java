package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();
    private static final String zza = "PatternItem";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) Float f11) {
        boolean z11 = true;
        if (i11 != 1 && (f11 == null || f11.floatValue() < BitmapDescriptorFactory.HUE_RED)) {
            z11 = false;
        }
        String strValueOf = String.valueOf(f11);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 45);
        sb2.append("Invalid PatternItem: type=");
        sb2.append(i11);
        sb2.append(" length=");
        sb2.append(strValueOf);
        Preconditions.checkArgument(z11, sb2.toString());
        this.zzb = i11;
        this.zzc = f11;
    }

    static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem dot : list) {
            if (dot == null) {
                dot = null;
            } else {
                int i11 = dot.zzb;
                if (i11 == 0) {
                    Preconditions.checkState(dot.zzc != null, "length must not be null.");
                    dash = new Dash(dot.zzc.floatValue());
                } else if (i11 == 1) {
                    dot = new Dot();
                } else if (i11 != 2) {
                    String str = zza;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unknown PatternItem type: ");
                    sb2.append(i11);
                    Log.w(str, sb2.toString());
                } else {
                    Preconditions.checkState(dot.zzc != null, "length must not be null.");
                    dash = new Gap(dot.zzc.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    @NonNull
    public String toString() {
        int i11 = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39);
        sb2.append("[PatternItem: type=");
        sb2.append(i11);
        sb2.append(" length=");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
