package im0;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class f<T> extends io.reactivex.rxjava3.core.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterable<? extends T> f78332b;

    static abstract class a<T> extends qm0.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<? extends T> f78333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f78334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f78335c;

        a(Iterator<? extends T> it) {
            this.f78333a = it;
        }

        abstract void a();

        abstract void b(long j11);

        @Override // nr0.c
        public final void cancel() {
            this.f78334b = true;
        }

        @Override // fm0.h
        public final void clear() {
            this.f78333a = null;
        }

        @Override // fm0.h
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f78333a;
            if (it == null) {
                return true;
            }
            if (!this.f78335c || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // fm0.h
        public final T poll() {
            Iterator<? extends T> it = this.f78333a;
            if (it == null) {
                return null;
            }
            if (!this.f78335c) {
                this.f78335c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f78333a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // nr0.c
        public final void request(long j11) {
            if (qm0.d.validate(j11) && rm0.c.a(this, j11) == 0) {
                if (j11 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j11);
                }
            }
        }

        @Override // fm0.d
        public final int requestFusion(int i11) {
            return i11 & 1;
        }
    }

    static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final fm0.a<? super T> f78336d;

        b(fm0.a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f78336d = aVar;
        }

        @Override // im0.f.a
        void a() {
            Iterator<? extends T> it = this.f78333a;
            fm0.a<? super T> aVar = this.f78336d;
            while (!this.f78334b) {
                try {
                    T next = it.next();
                    if (this.f78334b) {
                        return;
                    }
                    if (next == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.a(next);
                    if (this.f78334b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f78334b) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        bm0.a.b(th2);
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    bm0.a.b(th3);
                    aVar.onError(th3);
                    return;
                }
            }
        }

        @Override // im0.f.a
        void b(long j11) {
            Iterator<? extends T> it = this.f78333a;
            fm0.a<? super T> aVar = this.f78336d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.f78334b) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f78334b) {
                                return;
                            }
                            if (next == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zA = aVar.a(next);
                            if (this.f78334b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f78334b) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (zA) {
                                    j12++;
                                }
                            } catch (Throwable th2) {
                                bm0.a.b(th2);
                                aVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            bm0.a.b(th3);
                            aVar.onError(th3);
                            return;
                        }
                    }
                }
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }
    }

    static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final nr0.b<? super T> f78337d;

        c(nr0.b<? super T> bVar, Iterator<? extends T> it) {
            super(it);
            this.f78337d = bVar;
        }

        @Override // im0.f.a
        void a() {
            Iterator<? extends T> it = this.f78333a;
            nr0.b<? super T> bVar = this.f78337d;
            while (!this.f78334b) {
                try {
                    T next = it.next();
                    if (this.f78334b) {
                        return;
                    }
                    if (next == null) {
                        bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.onNext(next);
                    if (this.f78334b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f78334b) {
                                return;
                            }
                            bVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        bm0.a.b(th2);
                        bVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    bm0.a.b(th3);
                    bVar.onError(th3);
                    return;
                }
            }
        }

        @Override // im0.f.a
        void b(long j11) {
            Iterator<? extends T> it = this.f78333a;
            nr0.b<? super T> bVar = this.f78337d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j11 = get();
                        if (j12 == j11) {
                            break;
                        }
                    } else {
                        if (this.f78334b) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f78334b) {
                                return;
                            }
                            if (next == null) {
                                bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            bVar.onNext(next);
                            if (this.f78334b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f78334b) {
                                        return;
                                    }
                                    bVar.onComplete();
                                    return;
                                }
                                j12++;
                            } catch (Throwable th2) {
                                bm0.a.b(th2);
                                bVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            bm0.a.b(th3);
                            bVar.onError(th3);
                            return;
                        }
                    }
                }
                j11 = addAndGet(-j12);
            } while (j11 != 0);
        }
    }

    public f(Iterable<? extends T> iterable) {
        this.f78332b = iterable;
    }

    public static <T> void z(nr0.b<? super T> bVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                qm0.c.complete(bVar);
            } else if (bVar instanceof fm0.a) {
                bVar.onSubscribe(new b((fm0.a) bVar, it));
            } else {
                bVar.onSubscribe(new c(bVar, it));
            }
        } catch (Throwable th2) {
            bm0.a.b(th2);
            qm0.c.error(th2, bVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.h
    public void y(nr0.b<? super T> bVar) {
        try {
            z(bVar, this.f78332b.iterator());
        } catch (Throwable th2) {
            bm0.a.b(th2);
            qm0.c.error(th2, bVar);
        }
    }
}
