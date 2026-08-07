package ii0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import zg0.ScreenState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR*\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001b\u0010!R\u0011\u0010#\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\"¨\u0006$"}, d2 = {"Lii0/b;", "", "Lei0/e;", "externalInquiryController", "<init>", "(Lei0/e;)V", "Ljn0/h0;", "f", "()V", "", "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "c", "(ZZZ)V", "a", "Lei0/e;", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lii0/a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "navigationStateFlow", DateTokenConverter.CONVERTER_KEY, "Z", "e", "isNavigationEnabled", "value", "g", "isTransitioningBack", "()Z", "(Z)V", "()Lii0/a;", "navigationState", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ei0.e externalInquiryController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<ii0.a> navigationStateFlow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowBackButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowCancelButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigationEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isTransitioningBack;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", f = "NavigationStateManager.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f78186n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ii0.a f78188p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ii0.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f78188p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f78188p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f78186n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow<ScreenState> mutableStateFlowB = b.this.externalInquiryController.b();
                ScreenState screenState = new ScreenState(this.f78188p.getShowBackButton(), this.f78188p.getShowCancelButton(), this.f78188p.getIsNavigationEnabled());
                this.f78186n = 1;
                if (mutableStateFlowB.emit(screenState, this) == coroutine_suspended) {
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

    public b(ei0.e externalInquiryController) {
        s.k(externalInquiryController, "externalInquiryController");
        this.externalInquiryController = externalInquiryController;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.navigationStateFlow = StateFlowKt.MutableStateFlow(new ii0.a(true, true, externalInquiryController.d(), true, true));
        this.isNavigationEnabled = true;
    }

    public static /* synthetic */ void d(b bVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        bVar.c(z11, z12, z13);
    }

    private final void f() {
        ii0.a aVar = new ii0.a(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.d(), this.externalInquiryController.e(), this.isNavigationEnabled && !this.isTransitioningBack);
        if (s.f(this.navigationStateFlow.getValue(), aVar)) {
            return;
        }
        this.navigationStateFlow.setValue(aVar);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new a(aVar, null), 3, null);
    }

    public final ii0.a b() {
        return this.navigationStateFlow.getValue();
    }

    public final void c(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        f();
    }

    public final void e(boolean z11) {
        this.isTransitioningBack = z11;
        f();
    }
}
