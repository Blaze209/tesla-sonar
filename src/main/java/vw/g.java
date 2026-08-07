package vw;

import android.util.Log;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvw/g;", "Lvw/h;", "Lyv/b;", "Lnq/j;", "transportFactoryProvider", "<init>", "(Lyv/b;)V", "Lvw/i0;", "value", "", "c", "(Lvw/i0;)[B", "sessionEvent", "Ljn0/h0;", "a", "(Lvw/i0;)V", "Lyv/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yv.b<nq.j> transportFactoryProvider;

    public g(yv.b<nq.j> transportFactoryProvider) {
        p013kotlin.jvm.internal.s.k(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(SessionEvent value) {
        String strEncode = j0.f119948a.c().encode(value);
        p013kotlin.jvm.internal.s.j(strEncode, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strEncode.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // vw.h
    public void a(SessionEvent sessionEvent) {
        p013kotlin.jvm.internal.s.k(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, nq.c.b("json"), new nq.h() { // from class: vw.f
            @Override // nq.h
            public final Object apply(Object obj) {
                return this.f119934a.c((SessionEvent) obj);
            }
        }).a(nq.d.f(sessionEvent));
    }
}
