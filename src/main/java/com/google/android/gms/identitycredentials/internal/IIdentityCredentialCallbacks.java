package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;

/* JADX INFO: loaded from: classes5.dex */
public interface IIdentityCredentialCallbacks extends IInterface {

    public static abstract class Stub extends zzb implements IIdentityCredentialCallbacks {
        public Stub() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        protected boolean dispatchTransaction(int i11, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i12) {
            if (i11 == 1) {
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) zzc.zza(parcel, PendingGetCredentialHandle.CREATOR);
                enforceNoDataAvail(parcel);
                onGetCredential(status, pendingGetCredentialHandle);
            } else if (i11 == 2) {
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                RegistrationResponse registrationResponse = (RegistrationResponse) zzc.zza(parcel, RegistrationResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onRegisterCredentials(status2, registrationResponse);
            } else if (i11 == 3) {
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                ClearRegistryResponse clearRegistryResponse = (ClearRegistryResponse) zzc.zza(parcel, ClearRegistryResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onClearRegistry(status3, clearRegistryResponse);
            } else if (i11 == 4) {
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                PendingImportCredentialsHandle pendingImportCredentialsHandle = (PendingImportCredentialsHandle) zzc.zza(parcel, PendingImportCredentialsHandle.CREATOR);
                enforceNoDataAvail(parcel);
                onImportCredentials(status4, pendingImportCredentialsHandle);
            } else {
                if (i11 != 5) {
                    return false;
                }
                Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
                RegisterExportResponse registerExportResponse = (RegisterExportResponse) zzc.zza(parcel, RegisterExportResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onRegisterExport(status5, registerExportResponse);
            }
            return true;
        }
    }

    void onClearRegistry(@NonNull Status status, ClearRegistryResponse clearRegistryResponse);

    void onGetCredential(@NonNull Status status, PendingGetCredentialHandle pendingGetCredentialHandle);

    void onImportCredentials(@NonNull Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle);

    void onRegisterCredentials(@NonNull Status status, RegistrationResponse registrationResponse);

    void onRegisterExport(@NonNull Status status, RegisterExportResponse registerExportResponse);
}
