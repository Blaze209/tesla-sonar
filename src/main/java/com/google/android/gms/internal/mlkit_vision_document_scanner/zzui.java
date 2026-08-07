package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzui extends zza implements zzuk {
    zzui(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzuk
    public final void zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(1, parcelZza);
    }
}
