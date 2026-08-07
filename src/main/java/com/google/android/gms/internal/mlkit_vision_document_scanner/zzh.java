package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import androidx.core.content.f;

/* JADX INFO: loaded from: classes5.dex */
final class zzh extends zzm {
    zzh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzm
    protected final int zza(Context context, zzl zzlVar, boolean z11) {
        return (zzlVar.zza.getAuthority().lastIndexOf(64) < 0 || f.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
