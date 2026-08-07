package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
final class zzq {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(string);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
}
