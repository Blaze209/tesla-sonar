package jh0;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.i0;
import androidx.p003lifecycle.s0;
import bh0.i2;
import bh0.q;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.withpersona.sdk2.inquiry.internal.m;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00014B\u0013\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R*\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Ljh0/f;", "Landroidx/lifecycle/c1;", "Landroidx/lifecycle/s0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/s0;)V", "Lbh0/q;", "component", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "props", "Ljh0/i;", "workflowStateViewModel", "", "resetState", "Ljn0/h0;", "c", "(Lbh0/q;Lcom/withpersona/sdk2/inquiry/internal/m$c;Ljh0/i;Z)V", "Lkotlinx/coroutines/flow/StateFlow;", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljh0/i;)Lkotlinx/coroutines/flow/StateFlow;", "s", "Landroidx/lifecycle/s0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/inquiry/internal/m;", "u", "Lcom/withpersona/sdk2/inquiry/internal/m;", AnalyticsContext.Workflow, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "v", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_result", "Landroidx/lifecycle/i0;", "", "w", "Landroidx/lifecycle/i0;", "f", "()Landroidx/lifecycle/i0;", "setInquiryId", "(Landroidx/lifecycle/i0;)V", "inquiryId", "x", "h", "setSessionToken", "sessionToken", "Lkotlinx/coroutines/flow/SharedFlow;", "g", "()Lkotlinx/coroutines/flow/SharedFlow;", "result", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableStateFlow<m.c> props;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private m workflow;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<m.b> _result;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private i0<String> inquiryId;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private i0<String> sessionToken;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljh0/f$a;", "", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ljh0/f;", "a", "(Landroidx/lifecycle/s0;)Ljh0/f;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        f a(s0 savedStateHandle);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b;", "it", "Ljn0/h0;", "<anonymous>", "(Lcom/withpersona/sdk2/inquiry/internal/m$b;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowsViewModel$render$1", f = "InquiryWorkflowsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<m.b, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83766o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowsViewModel$render$1$1", f = "InquiryWorkflowsViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f83768n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f83769o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ m.b f83770p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, m.b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f83769o = fVar;
                this.f83770p = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f83769o, this.f83770p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f83768n;
                if (i11 == 0) {
                    t.b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f83769o._result;
                    m.b bVar = this.f83770p;
                    this.f83768n = 1;
                    if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m.b bVar, Continuation<? super h0> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f83766o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f83765n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            BuildersKt__Builders_commonKt.launch$default(d1.a(f.this), null, null, new a(f.this, (m.b) this.f83766o, null), 3, null);
            return h0.f84049a;
        }
    }

    public f(s0 savedStateHandle) {
        s.k(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this._result = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.g("inquiry_id", null);
        this.sessionToken = savedStateHandle.g("session_token", null);
    }

    public final void c(q component, m.c props, i workflowStateViewModel, boolean resetState) {
        s.k(component, "component");
        s.k(props, "props");
        s.k(workflowStateViewModel, "workflowStateViewModel");
        if (resetState) {
            workflowStateViewModel.g();
        }
        MutableStateFlow<m.c> mutableStateFlow = this.props;
        if (mutableStateFlow != null) {
            if (mutableStateFlow == null) {
                s.B("props");
                mutableStateFlow = null;
            }
            mutableStateFlow.setValue(props);
        } else {
            this.props = StateFlowKt.MutableStateFlow(props);
        }
        this.workflow = component.e();
    }

    public final i0<String> f() {
        return this.inquiryId;
    }

    public final SharedFlow<m.b> g() {
        return this._result;
    }

    public final i0<String> h() {
        return this.sessionToken;
    }

    public final StateFlow<Object> i(i workflowStateViewModel) {
        m mVar;
        MutableStateFlow<m.c> mutableStateFlow;
        s.k(workflowStateViewModel, "workflowStateViewModel");
        m mVar2 = this.workflow;
        if (mVar2 == null) {
            s.B(AnalyticsContext.Workflow);
            mVar = null;
        } else {
            mVar = mVar2;
        }
        CoroutineScope coroutineScopeA = d1.a(this);
        s0 savedStateHandle = workflowStateViewModel.getSavedStateHandle();
        MutableStateFlow<m.c> mutableStateFlow2 = this.props;
        if (mutableStateFlow2 == null) {
            s.B("props");
            mutableStateFlow = null;
        } else {
            mutableStateFlow = mutableStateFlow2;
        }
        return a30.a.a(mVar, coroutineScopeA, mutableStateFlow, savedStateHandle, i2.f17274a.a(), new b(null));
    }
}
