package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: loaded from: classes5.dex */
public interface IIdentityCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IIdentityCredentialService {

        public static class Proxy extends zza implements IIdentityCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearRegistry(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearRegistryRequest clearRegistryRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, clearRegistryRequest);
                transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull GetCredentialRequest getCredentialRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, getCredentialRequest);
                transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegistrationRequest registrationRequest) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzc(parcelObtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                zzc.zzb(parcelObtainAndWriteInterfaceToken, registrationRequest);
                transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
            }
        }

        @NonNull
        public static IIdentityCredentialService asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return iInterfaceQueryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    void clearRegistry(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull ClearRegistryRequest clearRegistryRequest);

    void getCredential(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull GetCredentialRequest getCredentialRequest);

    void registerCredentials(@NonNull IIdentityCredentialCallbacks iIdentityCredentialCallbacks, @NonNull RegistrationRequest registrationRequest);
}
