package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzug extends zzb implements zzuh {
    public zzug() {
        super("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerCallbacks");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzb
    protected final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzuc zzucVar = (zzuc) zzc.zza(parcel, zzuc.CREATOR);
            zzc.zzb(parcel);
            zzb(zzucVar);
        } else {
            if (i11 != 2) {
                return false;
            }
            zzc.zzb(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
        }
        return true;
    }
}
