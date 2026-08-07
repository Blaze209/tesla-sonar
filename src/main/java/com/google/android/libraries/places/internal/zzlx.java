package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
enum zzlx {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    static /* bridge */ /* synthetic */ zzlx zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }
}
