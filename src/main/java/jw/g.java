package jw;

import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements qj0.e<SessionManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84365a;

    public g(a aVar) {
        this.f84365a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) qj0.h.d(aVar.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f84365a);
    }
}
