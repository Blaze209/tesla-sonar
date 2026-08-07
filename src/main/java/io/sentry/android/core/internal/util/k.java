package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes9.dex */
public class k {
    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }
}
