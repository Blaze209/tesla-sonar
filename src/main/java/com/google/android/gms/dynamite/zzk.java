package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    zzk() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iZza;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        int i11 = 1;
        int i12 = 0;
        if (iZzb != 0) {
            iZza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = iZza;
        } else {
            iZza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = iZza;
        }
        int i13 = selectionResult.localVersion;
        if (i13 == 0) {
            if (iZza == 0) {
                i11 = 0;
            }
            selectionResult.selection = i11;
            return selectionResult;
        }
        i12 = i13;
        if (i12 >= iZza) {
            i11 = -1;
        }
        selectionResult.selection = i11;
        return selectionResult;
    }
}
