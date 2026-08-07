package lm0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends io.reactivex.rxjava3.core.o<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.t f90426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f90427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f90428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f90429d;

    static final class a extends AtomicReference<am0.b> implements am0.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.s<? super Long> f90430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f90431b;

        a(io.reactivex.rxjava3.core.s<? super Long> sVar) {
            this.f90430a = sVar;
        }

        public void a(am0.b bVar) {
            dm0.b.setOnce(this, bVar);
        }

        @Override // am0.b
        public void dispose() {
            dm0.b.dispose(this);
        }

        @Override // am0.b
        public boolean isDisposed() {
            return get() == dm0.b.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != dm0.b.DISPOSED) {
                io.reactivex.rxjava3.core.s<? super Long> sVar = this.f90430a;
                long j11 = this.f90431b;
                this.f90431b = 1 + j11;
                sVar.onNext(Long.valueOf(j11));
            }
        }
    }

    public q(long j11, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.t tVar) {
        this.f90427b = j11;
        this.f90428c = j12;
        this.f90429d = timeUnit;
        this.f90426a = tVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.rxjava3.core.o
    public void Q(io.reactivex.rxjava3.core.s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        io.reactivex.rxjava3.core.t tVar = this.f90426a;
        if (!(tVar instanceof om0.q)) {
            aVar.a(tVar.schedulePeriodicallyDirect(aVar, this.f90427b, this.f90428c, this.f90429d));
            return;
        }
        io.reactivex.rxjava3.core.t.c cVarCreateWorker = tVar.createWorker();
        aVar.a(cVarCreateWorker);
        cVarCreateWorker.schedulePeriodically(aVar, this.f90427b, this.f90428c, this.f90429d);
    }
}
