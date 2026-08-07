package com.plaid.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface;
import ezvcard.property.Kind;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.plaid.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4350b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashApiOptions f46877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f46878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H0 f46879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K6<Breadcrumb> f46880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UUID f46881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f46882g;

    public C4350b0(Context application, CrashApiOptions crashApiOptions, Y crashEnvironmentProvider) {
        O4 deviceInfo = O4.f46551a;
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(crashApiOptions, "crashApiOptions");
        p013kotlin.jvm.internal.s.k(crashEnvironmentProvider, "crashEnvironmentProvider");
        p013kotlin.jvm.internal.s.k(deviceInfo, "deviceInfo");
        this.f46876a = application;
        this.f46877b = crashApiOptions;
        this.f46878c = crashEnvironmentProvider;
        this.f46879d = deviceInfo;
        this.f46880e = new K6<>();
        this.f46882g = jn0.m.b(new C4341a0(this));
    }

    public final Crash a(Throwable throwable) {
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f46881f = uuidRandomUUID;
        p013kotlin.jvm.internal.s.h(uuidRandomUUID);
        String string = uuidRandomUUID.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String strV = p013kotlin.text.t.V(string, "-", "", false, 4, null);
        String str = ((SimpleDateFormat) this.f46882g.getValue()).format(new Date());
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        String message = throwable.getMessage();
        CrashLogLevel crashLogLevel = CrashLogLevel.ERROR;
        String release = this.f46877b.getRelease();
        String strA = this.f46878c.a();
        ExceptionInterface exceptionInterface = new ExceptionInterface(throwable);
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"ea5ac326-896b-556a-a06f-7208ae64a9ed"}[0], null, 2, null));
        return a(new Crash(strV, message, str, crashLogLevel, null, null, null, null, null, null, null, release, null, strA, null, null, null, exceptionInterface, debugMetaInterface, 120816, null));
    }

    public final Crash a(Crash crash) {
        String str;
        String strValueOf;
        String strValueOf2;
        crash.getBreadcrumbs$crash_reporting_release().clear();
        crash.getBreadcrumbs$crash_reporting_release().addAll(this.f46880e.a());
        crash.getContexts$crash_reporting_release().clear();
        Map<String, CrashContext> contexts$crash_reporting_release = crash.getContexts$crash_reporting_release();
        UUID uuid = this.f46881f;
        Context application = this.f46876a;
        p013kotlin.jvm.internal.s.k(application, "application");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                strValueOf = String.valueOf(packageInfo.versionCode);
                try {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    strValueOf2 = String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(application.getPackageManager()) : null);
                } catch (PackageManager.NameNotFoundException e11) {
                    e = e11;
                    e.printStackTrace();
                    strValueOf2 = null;
                }
            } catch (PackageManager.NameNotFoundException e12) {
                e = e12;
                strValueOf = null;
            }
        } catch (PackageManager.NameNotFoundException e13) {
            e = e13;
            str = null;
            strValueOf = null;
        }
        if (str != null) {
            linkedHashMap.put("version", str);
        }
        if (strValueOf != null) {
            linkedHashMap.put("build", strValueOf);
        }
        if (strValueOf2 != null) {
            linkedHashMap.put("name", strValueOf2);
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap != null ? p013kotlin.collections.v0.D(linkedHashMap) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release2 = crash.getContexts$crash_reporting_release();
        UUID uuid2 = this.f46881f;
        H0 build = this.f46879d;
        p013kotlin.jvm.internal.s.k(build, "build");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", build.getId());
        linkedHashMap2.put("manufacturer", build.a());
        linkedHashMap2.put("model", build.b());
        linkedHashMap2.put("name", build.g());
        linkedHashMap2.put("type", build.d());
        linkedHashMap2.put("version", build.e());
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        contexts$crash_reporting_release2.put(Kind.DEVICE, new CrashContext(0, uuid2, null, null, linkedHashMap2 != null ? p013kotlin.collections.v0.D(linkedHashMap2) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release3 = crash.getContexts$crash_reporting_release();
        UUID uuid3 = this.f46881f;
        H0 build2 = this.f46879d;
        p013kotlin.jvm.internal.s.k(build2, "build");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", build2.c());
        linkedHashMap3.put("version", C4358c.a(build2));
        if (linkedHashMap3.isEmpty()) {
            linkedHashMap3 = null;
        }
        contexts$crash_reporting_release3.put("os", new CrashContext(0, uuid3, null, null, linkedHashMap3 != null ? p013kotlin.collections.v0.D(linkedHashMap3) : null, 13, null));
        return crash;
    }
}
