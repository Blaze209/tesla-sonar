package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzad;

/* JADX INFO: loaded from: classes5.dex */
public final class zzu extends C4333zza implements zzv {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzA(Location location) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, location);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzB(Location location, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, location);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(85, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzC(zzr zzrVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzc(parcelZza, zzrVar);
        zzc(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzD(LocationSettingsRequest locationSettingsRequest, zzab zzabVar, String str) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, locationSettingsRequest);
        C4335zzc.zzc(parcelZza, zzabVar);
        parcelZza.writeString(null);
        zzc(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzE(zzo zzoVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzc(parcelZza, zzoVar);
        zzc(95, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzF(zzj zzjVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzjVar);
        zzc(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzd(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzt zztVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, geofencingRequest);
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, zztVar);
        zzc(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zze(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, geofencingRequest);
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(97, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzf(zzem zzemVar, zzt zztVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzemVar);
        C4335zzc.zzc(parcelZza, zztVar);
        zzc(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzg(zzem zzemVar, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzemVar);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(98, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzh(long j11, boolean z11, PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j11);
        int i11 = C4335zzc.zza;
        parcelZza.writeInt(1);
        C4335zzc.zzb(parcelZza, pendingIntent);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzi(com.google.android.gms.location.zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzbVar);
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(70, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzj(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, activityTransitionRequest);
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzk(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzl(PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, pendingIntent);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzm(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzb(parcelZza, sleepSegmentRequest);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(79, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzn(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, pendingIntent);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzo(zzad zzadVar, zzee zzeeVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzadVar);
        C4335zzc.zzb(parcelZza, zzeeVar);
        zzc(91, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final LocationAvailability zzp(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) C4335zzc.zza(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzq(LastLocationRequest lastLocationRequest, zzee zzeeVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, lastLocationRequest);
        C4335zzc.zzb(parcelZza, zzeeVar);
        zzc(90, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzr(LastLocationRequest lastLocationRequest, zzz zzzVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, lastLocationRequest);
        C4335zzc.zzc(parcelZza, zzzVar);
        zzc(82, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final Location zzs() {
        Parcel parcelZzb = zzb(7, zza());
        Location location = (Location) C4335zzc.zza(parcelZzb, Location.CREATOR);
        parcelZzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final ICancelToken zzt(CurrentLocationRequest currentLocationRequest, zzee zzeeVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, currentLocationRequest);
        C4335zzc.zzb(parcelZza, zzeeVar);
        Parcel parcelZzb = zzb(92, parcelZza);
        ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iCancelTokenAsInterface;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final ICancelToken zzu(CurrentLocationRequest currentLocationRequest, zzz zzzVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, currentLocationRequest);
        C4335zzc.zzc(parcelZza, zzzVar);
        Parcel parcelZzb = zzb(87, parcelZza);
        ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iCancelTokenAsInterface;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzv(zzei zzeiVar) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzeiVar);
        zzc(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzw(zzee zzeeVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzeeVar);
        C4335zzc.zzb(parcelZza, locationRequest);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(88, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzx(zzee zzeeVar, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        C4335zzc.zzb(parcelZza, zzeeVar);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(89, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzy(boolean z11) {
        Parcel parcelZza = zza();
        int i11 = C4335zzc.zza;
        parcelZza.writeInt(z11 ? 1 : 0);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzz(boolean z11, IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        int i11 = C4335zzc.zza;
        parcelZza.writeInt(z11 ? 1 : 0);
        C4335zzc.zzc(parcelZza, iStatusCallback);
        zzc(84, parcelZza);
    }
}
