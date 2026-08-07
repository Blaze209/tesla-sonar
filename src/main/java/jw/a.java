package jw;

import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import nq.j;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f84356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zv.f f84357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yv.b<com.google.firebase.remoteconfig.c> f84358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yv.b<j> f84359d;

    public a(@NonNull com.google.firebase.f fVar, @NonNull zv.f fVar2, @NonNull yv.b<com.google.firebase.remoteconfig.c> bVar, @NonNull yv.b<j> bVar2) {
        this.f84356a = fVar;
        this.f84357b = fVar2;
        this.f84358c = bVar;
        this.f84359d = bVar2;
    }

    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    com.google.firebase.f b() {
        return this.f84356a;
    }

    zv.f c() {
        return this.f84357b;
    }

    yv.b<com.google.firebase.remoteconfig.c> d() {
        return this.f84358c;
    }

    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    SessionManager f() {
        return SessionManager.getInstance();
    }

    yv.b<j> g() {
        return this.f84359d;
    }
}
