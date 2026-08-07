package ww;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vw.s0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lww/a;", "", "<init>", "()V", "Ljn0/h0;", "b", "Lvw/s0;", "Lvw/s0;", "a", "()Lvw/s0;", "c", "(Lvw/s0;)V", "getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations", "sharedSessionRepository", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f122395a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static s0 sharedSessionRepository;

    private a() {
    }

    public static final void b() {
        try {
            if (sharedSessionRepository == null) {
                f122395a.c(s0.INSTANCE.a());
            }
            a aVar = f122395a;
            if (aVar.a().b()) {
                aVar.a().c();
            }
        } catch (Exception unused) {
        }
    }

    public final s0 a() {
        s0 s0Var = sharedSessionRepository;
        if (s0Var != null) {
            return s0Var;
        }
        s.B("sharedSessionRepository");
        return null;
    }

    public final void c(s0 s0Var) {
        s.k(s0Var, "<set-?>");
        sharedSessionRepository = s0Var;
    }
}
