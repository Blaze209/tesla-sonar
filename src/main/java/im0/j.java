package im0;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends io.reactivex.rxjava3.core.h<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f78342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f78343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f78344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TimeUnit f78345e;

    static final class a extends AtomicLong implements nr0.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final nr0.b<? super Long> f78346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f78347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<am0.b> f78348c = new AtomicReference<>();

        a(nr0.b<? super Long> bVar) {
            this.f78346a = bVar;
        }

        public void a(am0.b bVar) {
            dm0.b.setOnce(this.f78348c, bVar);
        }

        @Override // nr0.c
        public void cancel() {
            dm0.b.dispose(this.f78348c);
        }

        @Override // nr0.c
        public void request(long j11) {
            if (qm0.d.validate(j11)) {
                rm0.c.a(this, j11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f78348c.get() != dm0.b.DISPOSED) {
                if (get() != 0) {
                    nr0.b<? super Long> bVar = this.f78346a;
                    long j11 = this.f78347b;
                    this.f78347b = j11 + 1;
                    bVar.onNext(Long.valueOf(j11));
                    rm0.c.c(this, 1L);
                    return;
                }
                this.f78346a.onError(new MissingBackpressureException("Can't deliver value " + this.f78347b + " due to lack of requests"));
                dm0.b.dispose(this.f78348c);
            }
        }
    }

    public j(long j11, long j12, TimeUnit timeUnit, t tVar) {
        this.f78343c = j11;
        this.f78344d = j12;
        this.f78345e = timeUnit;
        this.f78342b = tVar;
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
        a aVar = new a(bVar);
        bVar.onSubscribe(aVar);
        t tVar = this.f78342b;
        if (!(tVar instanceof om0.q)) {
            aVar.a(tVar.schedulePeriodicallyDirect(aVar, this.f78343c, this.f78344d, this.f78345e));
            return;
        }
        t.c cVarCreateWorker = tVar.createWorker();
        aVar.a(cVarCreateWorker);
        cVarCreateWorker.schedulePeriodically(aVar, this.f78343c, this.f78344d, this.f78345e);
    }
}
