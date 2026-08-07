package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import java.io.File;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.plaid.internal.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4364c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S6 f46902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4350b0 f46903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4456k0 f46904c;

    public C4364c5(Application context, SentryProject.LinkSdk sentryProject, String sdkVersion, Z.a crashProvider, E5 retrofitFactory, C4479m5 environmentProvider, M2 crashInterceptor) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(sentryProject, "sentryProject");
        p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
        p013kotlin.jvm.internal.s.k(crashProvider, "crashProvider");
        p013kotlin.jvm.internal.s.k(retrofitFactory, "retrofitFactory");
        p013kotlin.jvm.internal.s.k(environmentProvider, "environmentProvider");
        p013kotlin.jvm.internal.s.k(crashInterceptor, "crashInterceptor");
        Resources resources = context.getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        CrashApiOptions crashApiOptions = CrashApiOptionsKt.toCrashOptions(sentryProject, resources, sdkVersion);
        W w11 = new W(retrofitFactory);
        crashProvider.getClass();
        V.a crashApiClass = Z.a.f46841b;
        p013kotlin.jvm.internal.s.k(crashApiClass, "crashApiClass");
        S6 s6A = w11.a(crashApiClass.f46756a);
        this.f46902a = s6A;
        p013kotlin.jvm.internal.s.k(crashApiOptions, "crashApiOptions");
        s6A.f46701c = crashApiOptions;
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        C4350b0 crashReportFactory = new C4350b0(applicationContext, crashApiOptions, environmentProvider);
        this.f46903b = crashReportFactory;
        Context application = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(application, "getApplicationContext(...)");
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(crashReportFactory, "crashReportFactory");
        File filesDir = application.getFilesDir();
        p013kotlin.jvm.internal.s.j(filesDir, "getFilesDir(...)");
        C4429h0 c4429h0 = new C4429h0(new C4443i5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
        Context applicationContext2 = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext2, "getApplicationContext(...)");
        C4456k0 c4456k0 = new C4456k0(applicationContext2, c4429h0, crashApiClass, crashApiOptions);
        this.f46904c = c4456k0;
        new Z4(crashReportFactory, c4456k0, crashInterceptor).a();
    }

    public final void a(X crumb) {
        Breadcrumb crumb2;
        p013kotlin.jvm.internal.s.k(crumb, "crumb");
        C4350b0 c4350b0 = this.f46903b;
        if (crumb instanceof C4406e4) {
            C4406e4 c4406e4 = (C4406e4) crumb;
            crumb2 = new Breadcrumb(Breadcrumb.Type.NAVIGATION, crumb.f46797a, X.a(c4406e4.f47637d), c4406e4.f47635b, null, c4406e4.f47636c, 16, null);
        } else {
            if (!(crumb instanceof A1)) {
                throw new NoWhenBranchMatchedException();
            }
            Breadcrumb.Type type = Breadcrumb.Type.DEFAULT;
            A1 a11 = (A1) crumb;
            String str = a11.f46197b;
            Map<String, String> map = a11.f46198c;
            int i11 = a11.f46199d;
            Map mapD = p013kotlin.collections.v0.D(map);
            mapD.put("level", X.a(i11).name());
            crumb2 = new Breadcrumb(type, crumb.f46797a, X.a(a11.f46199d), str, null, mapD, 16, null);
        }
        c4350b0.getClass();
        p013kotlin.jvm.internal.s.k(crumb2, "crumb");
        K6<Breadcrumb> k11 = c4350b0.f46880e;
        if (k11.f46384a.get(k11.f46386c) != null) {
            k11.f46385b = (k11.f46385b + 1) % 50;
        }
        k11.f46384a.set(k11.f46386c, crumb2);
        k11.f46386c = (k11.f46386c + 1) % 50;
        int i12 = k11.f46387d;
        if (i12 != 50) {
            k11.f46387d = i12 + 1;
        }
    }
}
