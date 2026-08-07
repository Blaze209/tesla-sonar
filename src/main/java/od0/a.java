package od0;

import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lod0/a;", "", "<init>", "()V", "", "", "loggingEvents", "failureEvent", "Ljn0/h0;", "a", "(Ljava/util/List;Ljava/lang/String;)V", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97126a = new a();

    private a() {
    }

    public final void a(List<String> loggingEvents, String failureEvent) {
        s.k(loggingEvents, "loggingEvents");
        s.k(failureEvent, "failureEvent");
        ud0.a.b(v0.m(x.a("type", "mobile-app-notif-ext-processed"), x.a("events", loggingEvents), x.a("failure_event", failureEvent), x.a("version", "1"), x.a("install_id", qb0.a.INSTANCE.b().E())), false, null, 4, null);
    }
}
