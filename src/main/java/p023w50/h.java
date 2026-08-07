package p023w50;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u0010"}, d2 = {"Lw50/h;", "Lw50/g;", "<init>", "()V", "Lkotlin/Function0;", "Ljn0/h0;", "event", "a", "(Lwn0/a;)V", "", "b", "J", "lastEventTimeMs", "()J", "now", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long lastEventTimeMs;

    private final long b() {
        return System.currentTimeMillis();
    }

    @Override // p023w50.g
    public void a(a<h0> event) {
        s.k(event, "event");
        if (b() - this.lastEventTimeMs >= 500) {
            event.invoke();
        }
        this.lastEventTimeMs = b();
    }
}
