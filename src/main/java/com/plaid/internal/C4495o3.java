package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.plaid.link.Plaid;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4495o3 implements qj0.e<i8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0.e f47982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<I5> f47983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<C4351b1> f47984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4405e3 f47985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<String> f47986e;

    public C4495o3(C4396d3 c4396d3, qj0.e eVar, Provider provider, Provider provider2, C4405e3 c4405e3, Provider provider3) {
        this.f47982a = eVar;
        this.f47983b = provider;
        this.f47984c = provider2;
        this.f47985d = c4405e3;
        this.f47986e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f47982a.get();
        I5 sdkVersionDetails = this.f47983b.get();
        C4351b1 featureManager = this.f47984c.get();
        C4410f appSignatureHelper = (C4410f) this.f47985d.get();
        String persistentLinkId = this.f47986e.get();
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(sdkVersionDetails, "sdkVersionDetails");
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        p013kotlin.jvm.internal.s.k(appSignatureHelper, "appSignatureHelper");
        p013kotlin.jvm.internal.s.k(persistentLinkId, "persistentLinkId");
        O4 o11 = O4.f46551a;
        String strA = G0.a(application);
        p013kotlin.jvm.internal.s.k(featureManager, "featureManager");
        String version_name = Plaid.getVERSION_NAME();
        Bundle bundle = sdkVersionDetails.f46353a.getPackageManager().getApplicationInfo(sdkVersionDetails.f46353a.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        Bundle bundle2 = sdkVersionDetails.f46353a.getPackageManager().getApplicationInfo(sdkVersionDetails.f46353a.getPackageName(), 128).metaData;
        String string2 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        String packageName = application.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName, "getPackageName(...)");
        String strA2 = Q.a(application);
        PackageManager packageManager = application.getPackageManager();
        p013kotlin.jvm.internal.s.j(packageManager, "getPackageManager(...)");
        return (i8) qj0.h.d(new i8(strA, version_name, string, string2, persistentLinkId, packageName, strA2, packageManager, appSignatureHelper.a(application), new C4353b3(featureManager)));
    }
}
