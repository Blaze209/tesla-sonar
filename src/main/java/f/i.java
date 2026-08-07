package f;

import androidx.p002activity.b0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0010\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lf/i;", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/b;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "onBack", "Landroidx/activity/b0;", "callback", "<init>", "(Lkotlinx/coroutines/CoroutineScope;ZLwn0/p;Landroidx/activity/b0;)V", "backEvent", "Lkotlinx/coroutines/channels/ChannelResult;", "e", "(Landroidx/activity/b;)Ljava/lang/Object;", "b", "()Z", "a", "()V", "Z", DateTokenConverter.CONVERTER_KEY, "f", "(Z)V", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "c", "()Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isPredictiveBack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Channel<androidx.p002activity.b> channel = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Job job;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {121}, m = "invokeSuspend", n = {"completed"}, s = {"L$0"})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63728n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f63729o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b0 f63730p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<Flow<androidx.p002activity.b>, Continuation<? super h0>, Object> f63731q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ i f63732r;

        /* JADX INFO: renamed from: f.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/activity/b;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1305a extends SuspendLambda implements q<FlowCollector<? super androidx.p002activity.b>, Throwable, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f63733n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ j0 f63734o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1305a(j0 j0Var, Continuation<? super C1305a> continuation) {
                super(3, continuation);
                this.f63734o = j0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f63733n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f63734o.f86523a = true;
                return h0.f84049a;
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super androidx.p002activity.b> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
                return new C1305a(this.f63734o, continuation).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0 b0Var, p<? super Flow<androidx.p002activity.b>, ? super Continuation<? super h0>, ? extends Object> pVar, i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f63730p = b0Var;
            this.f63731q = pVar;
            this.f63732r = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f63730p, this.f63731q, this.f63732r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j0 j0Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f63729o;
            if (i11 == 0) {
                t.b(obj);
                if (this.f63730p.getIsEnabled()) {
                    j0 j0Var2 = new j0();
                    p<Flow<androidx.p002activity.b>, Continuation<? super h0>, Object> pVar = this.f63731q;
                    Flow<androidx.p002activity.b> flowOnCompletion = FlowKt.onCompletion(FlowKt.consumeAsFlow(this.f63732r.c()), new C1305a(j0Var2, null));
                    this.f63728n = j0Var2;
                    this.f63729o = 1;
                    if (pVar.invoke(flowOnCompletion, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j0Var = j0Var2;
                }
                return h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j0Var = (j0) this.f63728n;
            t.b(obj);
            if (!j0Var.f86523a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public i(CoroutineScope coroutineScope, boolean z11, p<? super Flow<androidx.p002activity.b>, ? super Continuation<? super h0>, ? extends Object> pVar, b0 b0Var) {
        this.isPredictiveBack = z11;
        this.job = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(b0Var, pVar, this, null), 3, null);
    }

    public final void a() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    public final boolean b() {
        return SendChannel.DefaultImpls.close$default(this.channel, null, 1, null);
    }

    public final Channel<androidx.p002activity.b> c() {
        return this.channel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPredictiveBack() {
        return this.isPredictiveBack;
    }

    public final Object e(androidx.p002activity.b backEvent) {
        return this.channel.mo85trySendJP2dKIU(backEvent);
    }

    public final void f(boolean z11) {
        this.isPredictiveBack = z11;
    }
}
