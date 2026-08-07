package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    protected Cap(int i11) {
        this(i11, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @NonNull
    public String toString() {
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("[Cap: type=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final Cap zza() {
        int i11 = this.zzb;
        if (i11 == 0) {
            return new ButtCap();
        }
        if (i11 == 1) {
            return new SquareCap();
        }
        if (i11 == 2) {
            return new RoundCap();
        }
        if (i11 == 3) {
            Preconditions.checkState(this.zzc != null, "bitmapDescriptor must not be null");
            Preconditions.checkState(this.zzd != null, "bitmapRefWidth must not be null");
            return new CustomCap(this.zzc, this.zzd.floatValue());
        }
        String str = zza;
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Unknown Cap type: ");
        sb2.append(i11);
        Log.w(str, sb2.toString());
        return this;
    }

    @SafeParcelable.Constructor
    Cap(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) Float f11) {
        this(i11, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f11);
    }

    private Cap(int i11, BitmapDescriptor bitmapDescriptor, Float f11) {
        boolean z11 = true;
        boolean z12 = f11 != null && f11.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (i11 == 3) {
            z11 = bitmapDescriptor != null && z12;
            i11 = 3;
        }
        Preconditions.checkArgument(z11, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i11), bitmapDescriptor, f11));
        this.zzb = i11;
        this.zzc = bitmapDescriptor;
        this.zzd = f11;
    }

    protected Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f11) {
        this(3, bitmapDescriptor, Float.valueOf(f11));
    }
}
