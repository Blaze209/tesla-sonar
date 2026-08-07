package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* JADX INFO: loaded from: classes5.dex */
public interface IRestoreCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IRestoreCredentialService {

        public static class Proxy extends zza implements IRestoreCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void clearRestoreCredential(@NonNull ClearRestoreCredentialRequest clearRestoreCredentialRequest, @NonNull IClearRestoreCredentialCallback iClearRestoreCredentialCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, clearRestoreCredentialRequest);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iClearRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void createRestoreCredential(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, createRestoreCredentialRequest);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iCreateRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void getRestoreCredential(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull IGetRestoreCredentialCallback iGetRestoreCredentialCallback) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(parcelObtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iGetRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        @NonNull
        public static IRestoreCredentialService asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return iInterfaceQueryLocalInterface instanceof IRestoreCredentialService ? (IRestoreCredentialService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void clearRestoreCredential(@NonNull ClearRestoreCredentialRequest clearRestoreCredentialRequest, @NonNull IClearRestoreCredentialCallback iClearRestoreCredentialCallback);

    void createRestoreCredential(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback);

    void getRestoreCredential(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull IGetRestoreCredentialCallback iGetRestoreCredentialCallback);
}
