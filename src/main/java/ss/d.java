package ss;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d {

    public interface a {

        /* JADX INFO: renamed from: ss.d$a$a, reason: collision with other inner class name */
        public static final class C2386a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C2387a> f111643a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: ss.d$a$a$a, reason: collision with other inner class name */
            static final class C2387a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f111644a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f111645b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f111646c;

                public C2387a(Handler handler, a aVar) {
                    this.f111644a = handler;
                    this.f111645b = aVar;
                }

                public void d() {
                    this.f111646c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                ts.a.e(handler);
                ts.a.e(aVar);
                d(aVar);
                this.f111643a.add(new C2387a(handler, aVar));
            }

            public void c(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                for (final C2387a c2387a : this.f111643a) {
                    if (c2387a.f111646c) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        c2387a.f111644a.post(new Runnable() { // from class: ss.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2387a.f111645b.q(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public void d(a aVar) {
                for (C2387a c2387a : this.f111643a) {
                    if (c2387a.f111645b == aVar) {
                        c2387a.d();
                        this.f111643a.remove(c2387a);
                    }
                }
            }
        }

        void q(int i11, long j11, long j12);
    }

    z a();

    void d(a aVar);

    void g(Handler handler, a aVar);
}
