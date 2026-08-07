package mw;

import com.google.firebase.perf.v1.ApplicationInfo;

/* JADX INFO: loaded from: classes5.dex */
public class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kw.a f92522c = kw.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f92523b;

    a(ApplicationInfo applicationInfo) {
        this.f92523b = applicationInfo;
    }

    private boolean g() {
        ApplicationInfo applicationInfo = this.f92523b;
        if (applicationInfo == null) {
            f92522c.j("ApplicationInfo is null");
            return false;
        }
        if (!applicationInfo.hasGoogleAppId()) {
            f92522c.j("GoogleAppId is null");
            return false;
        }
        if (!this.f92523b.hasAppInstanceId()) {
            f92522c.j("AppInstanceId is null");
            return false;
        }
        if (!this.f92523b.hasApplicationProcessState()) {
            f92522c.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f92523b.hasAndroidAppInfo()) {
            return true;
        }
        if (!this.f92523b.getAndroidAppInfo().hasPackageName()) {
            f92522c.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f92523b.getAndroidAppInfo().hasSdkVersion()) {
            return true;
        }
        f92522c.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    @Override // mw.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f92522c.j("ApplicationInfo is invalid");
        return false;
    }
}
