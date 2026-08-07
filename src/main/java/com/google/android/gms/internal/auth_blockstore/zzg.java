package com.google.android.gms.internal.auth_blockstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends zza implements IInterface {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zza(zzi zziVar, DeleteBytesRequest deleteBytesRequest) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zziVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, deleteBytesRequest);
        transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzb(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzkVar);
        transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzc(zzm zzmVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzmVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzd(zzm zzmVar, RetrieveBytesRequest retrieveBytesRequest) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzmVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, retrieveBytesRequest);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }

    public final void zze(zzo zzoVar, StoreBytesData storeBytesData) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzoVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, storeBytesData);
        transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
    }
}
