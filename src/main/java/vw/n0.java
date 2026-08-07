package vw;

import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvw/n0;", "", "Lvw/w0;", "timeProvider", "Lvw/y0;", "uuidGenerator", "<init>", "(Lvw/w0;Lvw/y0;)V", "", "b", "()Ljava/lang/String;", "Lvw/h0;", "currentSession", "a", "(Lvw/h0;)Lvw/h0;", "Lvw/w0;", "Lvw/y0;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w0 timeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y0 uuidGenerator;

    public n0(w0 timeProvider, y0 uuidGenerator) {
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        p013kotlin.jvm.internal.s.k(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    private final String b() {
        String string = this.uuidGenerator.next().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String lowerCase = p013kotlin.text.t.V(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final SessionDetails a(SessionDetails currentSession) {
        String firstSessionId;
        String strB = b();
        if (currentSession == null || (firstSessionId = currentSession.getFirstSessionId()) == null) {
            firstSessionId = strB;
        }
        return new SessionDetails(strB, firstSessionId, currentSession != null ? currentSession.getSessionIndex() + 1 : 0, this.timeProvider.a().getUs());
    }
}
