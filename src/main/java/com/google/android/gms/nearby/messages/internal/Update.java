package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.b;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzip;
import com.google.android.gms.internal.nearby.zziq;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "UpdateCreator")
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Update> CREATOR = new zzci();

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    final int zzb;

    @NonNull
    @SafeParcelable.Field(id = 3)
    public final Message zzc;

    @SafeParcelable.Field(id = 4)
    public final zze zzd;

    @SafeParcelable.Field(id = 5)
    public final zza zze;

    @SafeParcelable.Field(id = 6)
    public final zziq zzf;

    @SafeParcelable.Field(id = 7)
    public final byte[] zzg;

    @SafeParcelable.Constructor
    Update(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) Message message, @SafeParcelable.Param(id = 4) zze zzeVar, @SafeParcelable.Param(id = 5) zza zzaVar, @SafeParcelable.Param(id = 6) zziq zziqVar, @SafeParcelable.Param(id = 7) byte[] bArr) {
        this.zza = i11;
        boolean zZzb = zzb(i12, 2);
        this.zzb = true == zZzb ? 2 : i12;
        this.zzc = message;
        this.zzd = true == zZzb ? null : zzeVar;
        this.zze = true == zZzb ? null : zzaVar;
        this.zzf = true == zZzb ? null : zziqVar;
        this.zzg = true == zZzb ? null : bArr;
    }

    public static boolean zzb(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.zzb == update.zzb && Objects.equal(this.zzc, update.zzc) && Objects.equal(this.zzd, update.zzd) && Objects.equal(this.zze, update.zze) && Objects.equal(this.zzf, update.zzf) && Arrays.equals(this.zzg, update.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    @NonNull
    public final String toString() {
        b bVar = new b();
        if (zzb(this.zzb, 1)) {
            bVar.add("FOUND");
        }
        if (zzb(this.zzb, 2)) {
            bVar.add("LOST");
        }
        if (zzb(this.zzb, 4)) {
            bVar.add("DISTANCE");
        }
        if (zzb(this.zzb, 8)) {
            bVar.add("BLE_SIGNAL");
        }
        if (zzb(this.zzb, 16)) {
            bVar.add("DEVICE");
        }
        if (zzb(this.zzb, 32)) {
            bVar.add("BLE_RECORD");
        }
        String string = bVar.toString();
        Message message = this.zzc;
        zze zzeVar = this.zzd;
        zza zzaVar = this.zze;
        zziq zziqVar = this.zzf;
        byte[] bArr = this.zzg;
        return "Update{types=" + string + ", message=" + String.valueOf(message) + ", distance=" + String.valueOf(zzeVar) + ", bleSignal=" + String.valueOf(zzaVar) + ", device=" + String.valueOf(zziqVar) + ", bleRecord=" + String.valueOf(zzip.zza(bArr)) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(int i11) {
        return zzb(this.zzb, i11);
    }
}
