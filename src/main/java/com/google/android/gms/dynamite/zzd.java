package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes5.dex */
final class zzd extends PathClassLoader {
    zzd(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z11) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z11);
    }
}
