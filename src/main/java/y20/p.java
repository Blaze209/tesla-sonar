package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u001d\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00042(\u0010\u001c\u001a$0\u001bR \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b%\u0010)¨\u0006+"}, d2 = {"Ly20/p;", "OutputT", "Ly20/k;", "Ly20/o;", "", "Ljn0/h0;", "Ly20/c;", "Lco0/q;", "workerType", "", Action.KEY_ATTRIBUTE, "<init>", "(Lco0/q;Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "props", "Ly20/i;", "snapshot", IntegerTokenConverter.CONVERTER_KEY, "(Ly20/o;Ly20/i;)Ljava/lang/Integer;", "old", "new", "state", "j", "(Ly20/o;Ly20/o;I)Ljava/lang/Integer;", "renderProps", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "k", "(Ly20/o;ILy20/k$a;)V", "l", "(I)Ly20/i;", "a", "Lco0/q;", "getWorkerType", "()Lco0/q;", "b", "Ljava/lang/String;", "Ly20/s;", "Ly20/s;", "()Ly20/s;", "realIdentifier", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class p<OutputT> extends k<o<? extends OutputT>, Integer, OutputT, h0> implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.q workerType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s realIdentifier;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.WorkerWorkflow$render$1", f = "WorkerWorkflow.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124712n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ o<OutputT> f124713o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<OutputT> f124714p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ k<o<? extends OutputT>, Integer, OutputT, h0>.a f124715q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o<? extends OutputT> oVar, p<OutputT> pVar, k<? super o<? extends OutputT>, Integer, ? extends OutputT, h0>.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f124713o = oVar;
            this.f124714p = pVar;
            this.f124715q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f124713o, this.f124714p, this.f124715q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124712n;
            if (i11 == 0) {
                jn0.t.b(obj);
                o<OutputT> oVar = this.f124713o;
                String str = ((p) this.f124714p).key;
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVarC = this.f124715q.c();
                this.f124712n = 1;
                if (w.k(oVar, str, hVarC, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public p(co0.q workerType, String key) {
        p013kotlin.jvm.internal.s.k(workerType, "workerType");
        p013kotlin.jvm.internal.s.k(key, "key");
        this.workerType = workerType;
        this.key = key;
        this.realIdentifier = w.n(workerType);
    }

    @Override // y20.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public s getRealIdentifier() {
        return this.realIdentifier;
    }

    @Override // y20.c
    public String c() {
        return p013kotlin.jvm.internal.s.t("worker ", this.workerType);
    }

    @Override // y20.k
    public /* bridge */ /* synthetic */ Integer e(Object obj, Object obj2, Integer num) {
        return j((o) obj, (o) obj2, num.intValue());
    }

    @Override // y20.k
    public /* bridge */ /* synthetic */ h0 f(Object obj, Integer num, k.a aVar) {
        k((o) obj, num.intValue(), aVar);
        return h0.f84049a;
    }

    @Override // y20.k
    public /* bridge */ /* synthetic */ Snapshot g(Integer num) {
        return l(num.intValue());
    }

    @Override // y20.k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer d(o<? extends OutputT> props, Snapshot snapshot) {
        p013kotlin.jvm.internal.s.k(props, "props");
        return 0;
    }

    public Integer j(o<? extends OutputT> old, o<? extends OutputT> oVar, int state) {
        p013kotlin.jvm.internal.s.k(old, "old");
        p013kotlin.jvm.internal.s.k(oVar, "new");
        if (!old.a(oVar)) {
            state++;
        }
        return Integer.valueOf(state);
    }

    public void k(o<? extends OutputT> renderProps, int renderState, k<? super o<? extends OutputT>, Integer, ? extends OutputT, h0>.a context) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(context, "context");
        context.a(String.valueOf(renderState), new a(renderProps, this, context, null));
    }

    public Snapshot l(int state) {
        return null;
    }
}
