package vw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lvw/j0;", "", "<init>", "()V", "Lww/c;", "subscriber", "Lvw/d;", DateTokenConverter.CONVERTER_KEY, "(Lww/c;)Lvw/d;", "Lcom/google/firebase/f;", "firebaseApp", "Lvw/h0;", "sessionDetails", "Lyw/j;", "sessionsSettings", "", "Lww/c$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Lvw/i0;", "a", "(Lcom/google/firebase/f;Lvw/h0;Lyw/j;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lvw/i0;", "Lvw/b;", "b", "(Lcom/google/firebase/f;)Lvw/b;", "Lrv/a;", "Lrv/a;", "c", "()Lrv/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f119948a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final rv.a SESSION_EVENT_ENCODER;

    static {
        rv.a aVarH = new tv.d().i(c.f119885a).j(true).h();
        p013kotlin.jvm.internal.s.j(aVarH, "build(...)");
        SESSION_EVENT_ENCODER = aVarH;
    }

    private j0() {
    }

    private final d d(ww.c subscriber) {
        if (subscriber == null) {
            return d.COLLECTION_SDK_NOT_INSTALLED;
        }
        return subscriber.a() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }

    public final SessionEvent a(com.google.firebase.f firebaseApp, SessionDetails sessionDetails, yw.j sessionsSettings, Map<ww.c.a, ? extends ww.c> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        p013kotlin.jvm.internal.s.k(firebaseApp, "firebaseApp");
        p013kotlin.jvm.internal.s.k(sessionDetails, "sessionDetails");
        p013kotlin.jvm.internal.s.k(sessionsSettings, "sessionsSettings");
        p013kotlin.jvm.internal.s.k(subscribers, "subscribers");
        p013kotlin.jvm.internal.s.k(firebaseInstallationId, "firebaseInstallationId");
        p013kotlin.jvm.internal.s.k(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(j.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(d(subscribers.get(ww.c.a.PERFORMANCE)), d(subscribers.get(ww.c.a.CRASHLYTICS)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final ApplicationInfo b(com.google.firebase.f firebaseApp) throws PackageManager.NameNotFoundException {
        p013kotlin.jvm.internal.s.k(firebaseApp, "firebaseApp");
        Context contextK = firebaseApp.k();
        p013kotlin.jvm.internal.s.j(contextK, "getApplicationContext(...)");
        String packageName = contextK.getPackageName();
        PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.n().c();
        p013kotlin.jvm.internal.s.j(strC, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        p013kotlin.jvm.internal.s.j(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        p013kotlin.jvm.internal.s.j(RELEASE, "RELEASE");
        u uVar = u.LOG_ENVIRONMENT_PROD;
        p013kotlin.jvm.internal.s.h(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        p013kotlin.jvm.internal.s.j(MANUFACTURER, "MANUFACTURER");
        d0 d0Var = d0.f119925a;
        Context contextK2 = firebaseApp.k();
        p013kotlin.jvm.internal.s.j(contextK2, "getApplicationContext(...)");
        ProcessDetails processDetailsB = d0Var.b(contextK2);
        Context contextK3 = firebaseApp.k();
        p013kotlin.jvm.internal.s.j(contextK3, "getApplicationContext(...)");
        return new ApplicationInfo(strC, MODEL, "3.0.3", RELEASE, uVar, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, processDetailsB, d0Var.a(contextK3)));
    }

    public final rv.a c() {
        return SESSION_EVENT_ENCODER;
    }
}
