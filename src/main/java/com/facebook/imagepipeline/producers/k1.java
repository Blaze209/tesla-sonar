package com.facebook.imagepipeline.producers;

import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\rB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/imagepipeline/producers/k1;", "T", "Lcom/facebook/imagepipeline/producers/z0;", "inputProducer", "Lcom/facebook/imagepipeline/producers/l1;", "threadHandoffProducerQueue", "<init>", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/producers/l1;)V", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)V", "Lcom/facebook/imagepipeline/producers/z0;", "c", "()Lcom/facebook/imagepipeline/producers/z0;", "b", "Lcom/facebook/imagepipeline/producers/l1;", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/imagepipeline/producers/l1;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1<T> implements z0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0<T> inputProducer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/imagepipeline/producers/k1$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Lcom/facebook/imagepipeline/producers/a1;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/producers/a1;)Z", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(a1 context) {
            if (!vm.a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + context.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(a1 context) {
            return context.n().getExperiments().getHandOffOnUiThreadOnly() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/imagepipeline/producers/k1$b", "Lcom/facebook/imagepipeline/producers/f;", "Ljn0/h0;", "b", "()V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1<T> f21873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1<T> f21874b;

        b(i1<T> i1Var, k1<T> k1Var) {
            this.f21873a = i1Var;
            this.f21874b = k1Var;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21873a.a();
            this.f21874b.getThreadHandoffProducerQueue().a(this.f21873a);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/facebook/imagepipeline/producers/k1$c", "Lcom/facebook/imagepipeline/producers/i1;", "ignored", "Ljn0/h0;", "f", "(Ljava/lang/Object;)V", "b", "c", "()Ljava/lang/Object;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends i1<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n<T> f21875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c1 f21876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a1 f21877h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ k1<T> f21878i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n<T> nVar, c1 c1Var, a1 a1Var, k1<T> k1Var) {
            super(nVar, c1Var, a1Var, "BackgroundThreadHandoffProducer");
            this.f21875f = nVar;
            this.f21876g = c1Var;
            this.f21877h = a1Var;
            this.f21878i = k1Var;
        }

        @Override // nk.h
        protected void b(T ignored) {
        }

        @Override // nk.h
        protected T c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        protected void f(T ignored) {
            this.f21876g.j(this.f21877h, "BackgroundThreadHandoffProducer", null);
            this.f21878i.c().a(this.f21875f, this.f21877h);
        }
    }

    public k1(z0<T> inputProducer, l1 threadHandoffProducerQueue) {
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
        p013kotlin.jvm.internal.s.k(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.inputProducer = inputProducer;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<T> consumer, a1 context) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (!bn.b.d()) {
            c1 c1VarP = context.p();
            Companion companion = INSTANCE;
            if (companion.d(context)) {
                c1VarP.b(context, "BackgroundThreadHandoffProducer");
                c1VarP.j(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.a(consumer, context);
                return;
            } else {
                c cVar = new c(consumer, c1VarP, context, this);
                context.H(new b(cVar, this));
                this.threadHandoffProducerQueue.b(vm.a.a(cVar, companion.c(context)));
                return;
            }
        }
        bn.b.a("ThreadHandoffProducer#produceResults");
        try {
            c1 c1VarP2 = context.p();
            Companion companion2 = INSTANCE;
            if (companion2.d(context)) {
                c1VarP2.b(context, "BackgroundThreadHandoffProducer");
                c1VarP2.j(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.a(consumer, context);
            } else {
                c cVar2 = new c(consumer, c1VarP2, context, this);
                context.H(new b(cVar2, this));
                this.threadHandoffProducerQueue.b(vm.a.a(cVar2, companion2.c(context)));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        } finally {
            bn.b.b();
        }
    }

    public final z0<T> c() {
        return this.inputProducer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l1 getThreadHandoffProducerQueue() {
        return this.threadHandoffProducerQueue;
    }
}
