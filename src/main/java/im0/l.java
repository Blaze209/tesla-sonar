package im0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class l<T, U> extends im0.b<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final cm0.h<? super T, ? extends U> f78359c;

    static final class a<T, U> extends pm0.a<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.h<? super T, ? extends U> f78360f;

        a(fm0.a<? super U> aVar, cm0.h<? super T, ? extends U> hVar) {
            super(aVar);
            this.f78360f = hVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // fm0.a
        public boolean a(T t11) {
            if (this.f103456d) {
                return true;
            }
            if (this.f103457e != 0) {
                this.f103453a.a(null);
                return true;
            }
            try {
                U uApply = this.f78360f.apply(t11);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return this.f103453a.a((Object) uApply);
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f103456d) {
                return;
            }
            if (this.f103457e != 0) {
                this.f103453a.onNext(null);
                return;
            }
            try {
                U uApply = this.f78360f.apply(t11);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f103453a.onNext((Object) uApply);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // fm0.h
        public U poll() {
            T tPoll = this.f103455c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f78360f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return e(i11);
        }
    }

    static final class b<T, U> extends pm0.b<T, U> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final cm0.h<? super T, ? extends U> f78361f;

        b(nr0.b<? super U> bVar, cm0.h<? super T, ? extends U> hVar) {
            super(bVar);
            this.f78361f = hVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // nr0.b
        public void onNext(T t11) {
            if (this.f103461d) {
                return;
            }
            if (this.f103462e != 0) {
                this.f103458a.onNext(null);
                return;
            }
            try {
                U uApply = this.f78361f.apply(t11);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.f103458a.onNext((Object) uApply);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // fm0.h
        public U poll() {
            T tPoll = this.f103460c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f78361f.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // fm0.d
        public int requestFusion(int i11) {
            return e(i11);
        }
    }

    public l(io.reactivex.rxjava3.core.h<T> hVar, cm0.h<? super T, ? extends U> hVar2) {
        super(hVar);
        this.f78359c = hVar2;
    }

    @Override // io.reactivex.rxjava3.core.h
    protected void y(nr0.b<? super U> bVar) {
        if (bVar instanceof fm0.a) {
            this.f78303b.x(new a((fm0.a) bVar, this.f78359c));
        } else {
            this.f78303b.x(new b(bVar, this.f78359c));
        }
    }
}
