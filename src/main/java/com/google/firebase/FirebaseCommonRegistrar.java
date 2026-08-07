package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String d(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        return (i11 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<yu.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qw.c.c());
        arrayList.add(wv.f.g());
        arrayList.add(qw.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(qw.h.b("fire-core", "22.0.1"));
        arrayList.add(qw.h.b("device-name", e(Build.PRODUCT)));
        arrayList.add(qw.h.b("device-model", e(Build.DEVICE)));
        arrayList.add(qw.h.b("device-brand", e(Build.BRAND)));
        arrayList.add(qw.h.c("android-target-sdk", new qw.h.a() { // from class: com.google.firebase.h
            @Override // qw.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(qw.h.c("android-min-sdk", new qw.h.a() { // from class: com.google.firebase.i
            @Override // qw.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(qw.h.c("android-platform", new qw.h.a() { // from class: com.google.firebase.j
            @Override // qw.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(qw.h.c("android-installer", new qw.h.a() { // from class: com.google.firebase.k
            @Override // qw.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strA = qw.e.a();
        if (strA != null) {
            arrayList.add(qw.h.b("kotlin", strA));
        }
        return arrayList;
    }
}
