package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class j<T> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.j<? super T> f90384b;

    static final class a<T> extends gm0.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.j<? super T> f90385f;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, cm0.j<? super T> jVar) {
            super(sVar);
            this.f90385f = jVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f69229e != 0) {
                this.f69225a.onNext(null);
                return;
            }
            try {
                if (this.f90385f.test(t11)) {
                    this.f69225a.onNext((Object) t11);
                }
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // fm0.h
        public T poll() {
            T tPoll;
            do {
                tPoll = this.f69227c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f90385f.test(tPoll));
            return tPoll;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return f(i11);
        }
    }

    public j(io.reactivex.rxjava3.core.r<T> rVar, cm0.j<? super T> jVar) {
        super(rVar);
        this.f90384b = jVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar, this.f90384b));
    }
}
