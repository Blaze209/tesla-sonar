package gj;

import gj.l;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
abstract class c<T extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f68962a = xj.l.g(20);

    c() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f68962a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t11) {
        if (this.f68962a.size() < 20) {
            this.f68962a.offer(t11);
        }
    }
}
