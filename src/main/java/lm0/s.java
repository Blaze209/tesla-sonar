package lm0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class s<T, U> extends lm0.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final cm0.h<? super T, ? extends U> f90433b;

    static final class a<T, U> extends gm0.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.h<? super T, ? extends U> f90434f;

        a(io.reactivex.rxjava3.core.s<? super U> sVar, cm0.h<? super T, ? extends U> hVar) {
            super(sVar);
            this.f90434f = hVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.s
        public void onNext(T t11) {
            if (this.f69228d) {
                return;
            }
            if (this.f69229e != 0) {
                this.f69225a.onNext(null);
                return;
            }
            try {
                U uApply = this.f90434f.apply(t11);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f69225a.onNext((Object) uApply);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // fm0.h
        public U poll() {
            T tPoll = this.f69227c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f90434f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return f(i11);
        }
    }

    public s(io.reactivex.rxjava3.core.r<T> rVar, cm0.h<? super T, ? extends U> hVar) {
        super(rVar);
        this.f90433b = hVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super U> sVar) {
        this.f90266a.a(new a(sVar, this.f90433b));
    }
}
