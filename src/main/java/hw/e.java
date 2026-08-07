package hw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nq.j;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kw.a f73663i = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f73664a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f73665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.f f73666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f73667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.f f73668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yv.b<com.google.firebase.remoteconfig.c> f73669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zv.f f73670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yv.b<j> f73671h;

    e(com.google.firebase.f fVar, yv.b<com.google.firebase.remoteconfig.c> bVar, zv.f fVar2, yv.b<j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f73667d = null;
        this.f73668e = fVar;
        this.f73669f = bVar;
        this.f73670g = fVar2;
        this.f73671h = bVar2;
        if (fVar == null) {
            this.f73667d = Boolean.FALSE;
            this.f73665b = aVar;
            this.f73666c = new com.google.firebase.perf.util.f(new Bundle());
            return;
        }
        k.k().r(fVar, fVar2, bVar2);
        Context contextK = fVar.k();
        com.google.firebase.perf.util.f fVarA = a(contextK);
        this.f73666c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f73665b = aVar;
        aVar.Q(fVarA);
        aVar.O(contextK);
        sessionManager.setApplicationContext(contextK);
        this.f73667d = aVar.j();
        kw.a aVar2 = f73663i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", kw.b.b(fVar.n().e(), contextK.getPackageName())));
        }
    }

    private static com.google.firebase.perf.util.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            Log.d("isEnabled", "No perf enable meta data found " + e11.getMessage());
            bundle = null;
        }
        return bundle != null ? new com.google.firebase.perf.util.f(bundle) : new com.google.firebase.perf.util.f();
    }

    @NonNull
    public static e c() {
        return (e) com.google.firebase.f.l().j(e.class);
    }

    @NonNull
    public Map<String, String> b() {
        return new HashMap(this.f73664a);
    }

    public boolean d() {
        Boolean bool = this.f73667d;
        return bool != null ? bool.booleanValue() : com.google.firebase.f.l().t();
    }

    public synchronized void e(Boolean bool) {
        try {
            com.google.firebase.f.l();
            if (this.f73665b.i().booleanValue()) {
                f73663i.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f73665b.P(bool);
            if (bool != null) {
                this.f73667d = bool;
            } else {
                this.f73667d = this.f73665b.j();
            }
            if (Boolean.TRUE.equals(this.f73667d)) {
                f73663i.f("Firebase Performance is Enabled");
            } else if (Boolean.FALSE.equals(this.f73667d)) {
                f73663i.f("Firebase Performance is Disabled");
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void f(boolean z11) {
        e(Boolean.valueOf(z11));
    }
}
