package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class p2 implements r.a<Context, n2> {

    public static class a extends Service {
        private a() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    @NonNull
    private static n2 b(@NonNull Context context, @NonNull Bundle bundle) {
        boolean z11 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        c0.y0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        c0.y0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z11);
        c0.y0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        c0.y0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new n2.b().d(z11).c(e(strArrC)).b(e(strArrC2)).a();
    }

    @NonNull
    private static String[] c(@NonNull Context context, @NonNull Bundle bundle, @NonNull String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i11 = bundle.getInt(str, -1);
        if (i11 == -1) {
            c0.y0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i11);
        } catch (Resources.NotFoundException e11) {
            c0.y0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i11, e11);
            return new String[0];
        }
    }

    private static Class<? extends m2> d(@NonNull String str) {
        try {
            Class cls = Class.forName(str);
            if (m2.class.isAssignableFrom(cls)) {
                return cls;
            }
            c0.y0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e11) {
            c0.y0.m("QuirkSettingsLoader", "Class not found: " + str, e11);
            return null;
        }
    }

    @NonNull
    private static Set<Class<? extends m2>> e(@NonNull String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends m2> clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // r.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n2 apply(@NonNull Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            c0.y0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            c0.y0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
