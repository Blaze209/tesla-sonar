package lm0;

/* JADX INFO: loaded from: classes9.dex */
public final class f<T, K> extends lm0.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, K> f90364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.d<? super K, ? super K> f90365c;

    static final class a<T, K> extends gm0.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.h<? super T, K> f90366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final cm0.d<? super K, ? super K> f90367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        K f90368h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f90369i;

        a(io.reactivex.rxjava3.core.s<? super T> sVar, cm0.h<? super T, K> hVar, cm0.d<? super K, ? super K> dVar) {
            super(sVar);
            this.f90366f = hVar;
            this.f90367g = dVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f69228d) {
                return;
            }
            if (this.f69229e != 0) {
                this.f69225a.onNext((Object) t11);
                return;
            }
            try {
                K kApply = this.f90366f.apply(t11);
                if (this.f90369i) {
                    boolean zTest = this.f90367g.test(this.f90368h, kApply);
                    this.f90368h = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.f90369i = true;
                    this.f90368h = kApply;
                }
                this.f69225a.onNext((Object) t11);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // fm0.h
        public T poll() {
            while (true) {
                T tPoll = this.f69227c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f90366f.apply(tPoll);
                if (!this.f90369i) {
                    this.f90369i = true;
                    this.f90368h = kApply;
                    return tPoll;
                }
                if (!this.f90367g.test(this.f90368h, kApply)) {
                    this.f90368h = kApply;
                    return tPoll;
                }
                this.f90368h = kApply;
            }
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return f(i11);
        }
    }

    public f(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super T, K> hVar, cm0.d<? super K, ? super K> dVar) {
        super(rVar);
        this.f90364b = hVar;
        this.f90365c = dVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void Q(io.reactivex.rxjava3.core.s<? super T> sVar) {
        this.f90266a.a(new a(sVar, this.f90364b, this.f90365c));
    }
}
