package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzuj extends zzb implements zzuk {
    public static zzuk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        return iInterfaceQueryLocalInterface instanceof zzuk ? (zzuk) iInterfaceQueryLocalInterface : new zzui(iBinder);
    }
}
