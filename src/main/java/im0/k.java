package im0;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends io.reactivex.rxjava3.core.h<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f78349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f78350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f78351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f78352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f78353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final TimeUnit f78354g;

    static final class a extends AtomicLong implements nr0.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super Long> f78355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f78356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f78357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<am0.b> f78358d = new AtomicReference<>();

        a(nr0.b<? super Long> bVar, long j11, long j12) {
            this.f78355a = bVar;
            this.f78357c = j11;
            this.f78356b = j12;
        }

        public void a(am0.b bVar) {
            dm0.b.setOnce(this.f78358d, bVar);
        }

        @Override // nr0.c
        public void cancel() {
            dm0.b.dispose(this.f78358d);
        }

        @Override // nr0.c
        public void request(long j11) {
            if (qm0.d.validate(j11)) {
                rm0.c.a(this, j11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            am0.b bVar = this.f78358d.get();
            dm0.b bVar2 = dm0.b.DISPOSED;
            if (bVar != bVar2) {
                long j11 = get();
                if (j11 == 0) {
                    this.f78355a.onError(new MissingBackpressureException("Can't deliver value " + this.f78357c + " due to lack of requests"));
                    dm0.b.dispose(this.f78358d);
                    return;
                }
                long j12 = this.f78357c;
                this.f78355a.onNext(Long.valueOf(j12));
                if (j12 == this.f78356b) {
                    if (this.f78358d.get() != bVar2) {
                        this.f78355a.onComplete();
                    }
                    dm0.b.dispose(this.f78358d);
                } else {
                    this.f78357c = j12 + 1;
                    if (j11 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public k(long j11, long j12, long j13, long j14, TimeUnit timeUnit, t tVar) {
        this.f78352e = j13;
        this.f78353f = j14;
        this.f78354g = timeUnit;
        this.f78349b = tVar;
        this.f78350c = j11;
        this.f78351d = j12;
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
    @Override // io.reactivex.rxjava3.core.h
    public void y(nr0.b<? super Long> bVar) {
        a aVar = new a(bVar, this.f78350c, this.f78351d);
        bVar.onSubscribe(aVar);
        t tVar = this.f78349b;
        if (!(tVar instanceof om0.q)) {
            aVar.a(tVar.schedulePeriodicallyDirect(aVar, this.f78352e, this.f78353f, this.f78354g));
            return;
        }
        t.c cVarCreateWorker = tVar.createWorker();
        aVar.a(cVarCreateWorker);
        cVarCreateWorker.schedulePeriodically(aVar, this.f78352e, this.f78353f, this.f78354g);
    }
}
