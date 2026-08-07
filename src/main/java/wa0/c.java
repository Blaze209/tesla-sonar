package wa0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lwa0/c;", "", "<init>", "()V", "Lwa0/b;", "b", "Lwa0/b;", "a", "()Lwa0/b;", "(Lwa0/b;)V", "INSTANCE", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f121636a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static b INSTANCE;

    private c() {
    }

    public final b a() {
        b bVar = INSTANCE;
        if (bVar != null) {
            return bVar;
        }
        s.B("INSTANCE");
        return null;
    }

    public final void b(b bVar) {
        s.k(bVar, "<set-?>");
        INSTANCE = bVar;
    }
}
