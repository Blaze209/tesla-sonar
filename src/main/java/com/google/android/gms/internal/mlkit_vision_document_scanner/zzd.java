package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class zzd {
    public static final ClipData zza = ClipData.newIntent("", new Intent());

    public static PendingIntent zza(Context context, int i11, Intent intent, int i12) {
        zzn.zza(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzn.zza(!zzb(67108864, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            zzn.zza(zzb(67108864, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!zzb(67108864, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zza);
            }
        }
        return PendingIntent.getActivity(context, i11, intent2, 67108864);
    }

    private static boolean zzb(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
