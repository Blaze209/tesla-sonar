package s8;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.q;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    public interface a {

        /* JADX INFO: renamed from: s8.d$a$a, reason: collision with other inner class name */
        public static final class C2352a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C2353a> f110526a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: s8.d$a$a$a, reason: collision with other inner class name */
            static final class C2353a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f110527a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f110528b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f110529c;

                public C2353a(Handler handler, a aVar) {
                    this.f110527a = handler;
                    this.f110528b = aVar;
                }

                public void d() {
                    this.f110529c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                s7.a.f(handler);
                s7.a.f(aVar);
                d(aVar);
                this.f110526a.add(new C2353a(handler, aVar));
            }

            public void c(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                for (final C2353a c2353a : this.f110526a) {
                    if (c2353a.f110529c) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        c2353a.f110527a.post(new Runnable() { // from class: s8.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2353a.f110528b.q(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public void d(a aVar) {
                for (C2353a c2353a : this.f110526a) {
                    if (c2353a.f110528b == aVar) {
                        c2353a.d();
                        this.f110526a.remove(c2353a);
                    }
                }
            }
        }

        void q(int i11, long j11, long j12);
    }

    q a();

    long c();

    void d(Handler handler, a aVar);

    default long e() {
        return -9223372036854775807L;
    }

    void g(a aVar);
}
