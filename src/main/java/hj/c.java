package hj;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f72909a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f72910b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f72911a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f72912b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<a> f72913a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f72913a) {
                aVarPoll = this.f72913a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f72913a) {
                try {
                    if (this.f72913a.size() < 10) {
                        this.f72913a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f72909a.get(str);
                if (aVarA == null) {
                    aVarA = this.f72910b.a();
                    this.f72909a.put(str, aVarA);
                }
                aVarA.f72912b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f72911a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f72909a.get(str));
                int i11 = aVar.f72912b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f72912b);
                }
                int i12 = i11 - 1;
                aVar.f72912b = i12;
                if (i12 == 0) {
                    a aVarRemove = this.f72909a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f72910b.b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f72911a.unlock();
    }
}
