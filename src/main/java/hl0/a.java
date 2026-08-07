package hl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bi\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012H\u0010\u000b\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u0006\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u001b\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016RV\u0010\u000b\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lhl0/a;", "", "TSubject", "TContext", "Lhl0/e;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "()V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "initial", "a", "b", "Ljava/util/List;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "", "e", "I", "index", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<TSubject, TContext> extends e<TSubject, TContext> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TSubject subject;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: hl0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {0}, l = {80}, m = "proceedLoop", n = {"this"}, s = {"L$0"})
    static final class C1537a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73131n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f73132o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a<TSubject, TContext> f73133p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f73134q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1537a(a<TSubject, TContext> aVar, Continuation<? super C1537a> continuation) {
            super(continuation);
            this.f73133p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73132o = obj;
            this.f73134q |= Integer.MIN_VALUE;
            return this.f73133p.h(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(TContext context, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object>> interceptors, TSubject subject, CoroutineContext coroutineContext) {
        super(context);
        s.k(context, "context");
        s.k(interceptors, "interceptors");
        s.k(subject, "subject");
        s.k(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Continuation<? super TSubject> continuation) {
        C1537a c1537a;
        a<TSubject, TContext> aVar;
        q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object> qVar;
        TSubject tsubjectG;
        if (continuation instanceof C1537a) {
            c1537a = (C1537a) continuation;
            int i11 = c1537a.f73134q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1537a.f73134q = i11 - Integer.MIN_VALUE;
            } else {
                c1537a = new C1537a(this, continuation);
            }
        } else {
            c1537a = new C1537a(this, continuation);
        }
        Object obj = c1537a.f73132o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1537a.f73134q;
        if (i12 == 0) {
            t.b(obj);
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c1537a.f73131n;
            t.b(obj);
        }
        do {
            int i13 = aVar.index;
            if (i13 != -1) {
                List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> list = aVar.interceptors;
                if (i13 >= list.size()) {
                    aVar.f();
                } else {
                    qVar = list.get(i13);
                    aVar.index = i13 + 1;
                    s.i(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    tsubjectG = aVar.g();
                    c1537a.f73131n = aVar;
                    c1537a.f73134q = 1;
                }
            }
            return aVar.g();
        } while (qVar.invoke(aVar, tsubjectG, c1537a) != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // hl0.e
    public Object a(TSubject tsubject, Continuation<? super TSubject> continuation) {
        this.index = 0;
        i(tsubject);
        return c(continuation);
    }

    @Override // hl0.e
    public Object c(Continuation<? super TSubject> continuation) {
        int i11 = this.index;
        if (i11 < 0) {
            return g();
        }
        if (i11 < this.interceptors.size()) {
            return h(continuation);
        }
        f();
        return g();
    }

    @Override // hl0.e
    public Object d(TSubject tsubject, Continuation<? super TSubject> continuation) {
        i(tsubject);
        return c(continuation);
    }

    public void f() {
        this.index = -1;
    }

    public TSubject g() {
        return this.subject;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public void i(TSubject tsubject) {
        s.k(tsubject, "<set-?>");
        this.subject = tsubject;
    }
}
