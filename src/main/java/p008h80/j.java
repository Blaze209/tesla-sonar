package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.h;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00017B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012$\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012.\u0010\u0012\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0013\u0010&\u001a\u00020%*\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020 *\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\b\u0012\u0004\u0012\u00020 0**\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-*\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020 *\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R2\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00109R<\u0010\u0012\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u0015\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b?\u0010@R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010CR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010CR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010S\u001a\u0004\b7\u0010T¨\u0006V"}, d2 = {"Lh80/j;", "Lh80/t;", "Lcom/stripe/android/model/v0;", "initialPaymentMethod", "Lx30/c;", "displayName", "Lkotlin/Function1;", "Lh80/n$a;", "Ljn0/h0;", "eventHandler", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "removeExecutor", "Lkotlin/Function3;", "Lcom/stripe/android/model/h;", "Ljn0/s;", "updateExecutor", "", "canRemove", "isLiveMode", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/model/v0;Lx30/c;Lwn0/l;Lwn0/p;Lwn0/q;ZZLkotlin/coroutines/CoroutineContext;)V", "v", "()V", "u", "w", "s", "r", "Lh80/o$a;", "choice", "q", "(Lh80/o$a;)V", "t", "", "o", "(Lcom/stripe/android/model/v0;)Ljava/lang/String;", "p", "(Lcom/stripe/android/model/v0;)Lh80/o$a;", "", "l", "(Lcom/stripe/android/model/v0;)Ljava/util/List;", "Lcom/stripe/android/model/v0$g;", "m", "(Lcom/stripe/android/model/v0;)Lcom/stripe/android/model/v0$g;", "x", "(Lcom/stripe/android/model/h;)Lh80/o$a;", "Lh80/m;", "viewAction", "b", "(Lh80/m;)V", "close", "a", "Lwn0/l;", "Lwn0/p;", "c", "Lwn0/q;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "n", "()Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lh80/o$b;", "g", PermissionsResponse.STATUS_KEY, "h", "paymentMethod", IntegerTokenConverter.CONVERTER_KEY, "confirmRemoval", "j", AnalyticsAttribute.Error, "Lkotlinx/coroutines/CoroutineScope;", "k", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/o;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<n.a, h0> eventHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<PaymentMethod, Continuation<? super Throwable>, Object> removeExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q<PaymentMethod, h, Continuation<? super s<PaymentMethod>>, Object> updateExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean canRemove;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<EditPaymentMethodViewState.CardBrandChoice> choice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<EditPaymentMethodViewState.b> status;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<PaymentMethod> paymentMethod;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> confirmRemoval;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<x30.c> error;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<EditPaymentMethodViewState> viewState;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0099\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062$\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2.\u0010\u0012\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh80/j$a;", "Lh80/t$a;", "<init>", "()V", "Lcom/stripe/android/model/v0;", "initialPaymentMethod", "Lkotlin/Function1;", "Lh80/n$a;", "Ljn0/h0;", "eventHandler", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "removeExecutor", "Lkotlin/Function3;", "Lcom/stripe/android/model/h;", "Ljn0/s;", "updateExecutor", "Lx30/c;", "displayName", "", "canRemove", "isLiveMode", "Lh80/t;", "a", "(Lcom/stripe/android/model/v0;Lwn0/l;Lwn0/p;Lwn0/q;Lx30/c;ZZ)Lh80/t;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71137a = new a();

        private a() {
        }

        @Override // h80.t.a
        public t a(PaymentMethod initialPaymentMethod, l<? super n.a, h0> eventHandler, p<? super PaymentMethod, ? super Continuation<? super Throwable>, ? extends Object> removeExecutor, q<? super PaymentMethod, ? super h, ? super Continuation<? super s<PaymentMethod>>, ? extends Object> updateExecutor, x30.c displayName, boolean canRemove, boolean isLiveMode) {
            p013kotlin.jvm.internal.s.k(initialPaymentMethod, "initialPaymentMethod");
            p013kotlin.jvm.internal.s.k(eventHandler, "eventHandler");
            p013kotlin.jvm.internal.s.k(removeExecutor, "removeExecutor");
            p013kotlin.jvm.internal.s.k(updateExecutor, "updateExecutor");
            p013kotlin.jvm.internal.s.k(displayName, "displayName");
            return new j(initialPaymentMethod, displayName, eventHandler, removeExecutor, updateExecutor, canRemove, isLiveMode, null, 128, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditPaymentMethodViewInteractor$onRemoveConfirmed$1", f = "EditPaymentMethodViewInteractor.kt", i = {}, l = {119, 120, 123, 125, 126}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71138n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return j.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073 A[PHI: r9
          0x0073: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:23:0x0070, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x007d  */
        /* JADX WARN: Code duplicated, block: B:31:0x008a  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L33;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f71138n
                r2 = 0
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L35
                if (r1 == r7) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L29
                if (r1 == r4) goto L25
                if (r1 != r3) goto L1d
                jn0.t.b(r9)
                goto L9b
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                jn0.t.b(r9)
                goto L8a
            L29:
                jn0.t.b(r9)
                goto L73
            L2d:
                jn0.t.b(r9)
                goto L58
            L31:
                jn0.t.b(r9)
                goto L47
            L35:
                jn0.t.b(r9)
                h80.j r9 = p008h80.j.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = p008h80.j.e(r9)
                r8.f71138n = r7
                java.lang.Object r9 = r9.emit(r2, r8)
                if (r9 != r0) goto L47
                goto L9a
            L47:
                h80.j r9 = p008h80.j.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = p008h80.j.j(r9)
                h80.o$b r1 = p008h80.EditPaymentMethodViewState.b.Removing
                r8.f71138n = r6
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L58
                goto L9a
            L58:
                h80.j r9 = p008h80.j.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = p008h80.j.g(r9)
                java.lang.Object r9 = r9.getValue()
                com.stripe.android.model.v0 r9 = (com.stripe.android.model.PaymentMethod) r9
                h80.j r1 = p008h80.j.this
                wn0.p r1 = p008h80.j.i(r1)
                r8.f71138n = r5
                java.lang.Object r9 = r1.invoke(r9, r8)
                if (r9 != r0) goto L73
                goto L9a
            L73:
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                h80.j r1 = p008h80.j.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = p008h80.j.e(r1)
                if (r9 == 0) goto L81
                x30.c r2 = l30.a.b(r9)
            L81:
                r8.f71138n = r4
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L8a
                goto L9a
            L8a:
                h80.j r9 = p008h80.j.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = p008h80.j.j(r9)
                h80.o$b r1 = p008h80.EditPaymentMethodViewState.b.Idle
                r8.f71138n = r3
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L9b
            L9a:
                return r0
            L9b:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: h80.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditPaymentMethodViewInteractor$onUpdatePressed$1", f = "EditPaymentMethodViewInteractor.kt", i = {}, l = {136, 137, 139, 142, 144, 147}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71140n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f71141o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ EditPaymentMethodViewState.CardBrandChoice f71143q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EditPaymentMethodViewState.CardBrandChoice cardBrandChoice, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f71143q = cardBrandChoice;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return j.this.new c(this.f71143q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0055  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075 A[PHI: r6
          0x0075: PHI (r6v10 java.lang.Object) = (r6v9 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x0072, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:26:0x0096 A[PHI: r1
          0x0096: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v6 java.lang.Object), (r1v9 java.lang.Object) binds: [B:22:0x0081, B:24:0x0093, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L33;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h80.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/stripe/android/model/v0;", "paymentMethod", "Lh80/o$a;", "choice", "Lh80/o$b;", PermissionsResponse.STATUS_KEY, "", "confirmDeletion", "Lx30/c;", AnalyticsAttribute.Error, "Lh80/o;", "a", "(Lcom/stripe/android/model/v0;Lh80/o$a;Lh80/o$b;ZLx30/c;)Lh80/o;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.s<PaymentMethod, EditPaymentMethodViewState.CardBrandChoice, EditPaymentMethodViewState.b, Boolean, x30.c, EditPaymentMethodViewState> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x30.c f71145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x30.c cVar) {
            super(5);
            this.f71145d = cVar;
        }

        public final EditPaymentMethodViewState a(PaymentMethod paymentMethod, EditPaymentMethodViewState.CardBrandChoice choice, EditPaymentMethodViewState.b status, boolean z11, x30.c cVar) {
            p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
            p013kotlin.jvm.internal.s.k(choice, "choice");
            p013kotlin.jvm.internal.s.k(status, "status");
            EditPaymentMethodViewState.CardBrandChoice cardBrandChoiceP = j.this.p(paymentMethod);
            return new EditPaymentMethodViewState(status, j.this.o(paymentMethod), this.f71145d, !p013kotlin.jvm.internal.s.f(cardBrandChoiceP, choice), choice, j.this.l(paymentMethod), j.this.canRemove, z11, cVar);
        }

        @Override // wn0.s
        public /* bridge */ /* synthetic */ EditPaymentMethodViewState d(PaymentMethod paymentMethod, EditPaymentMethodViewState.CardBrandChoice cardBrandChoice, EditPaymentMethodViewState.b bVar, Boolean bool, x30.c cVar) {
            return a(paymentMethod, cardBrandChoice, bVar, bool.booleanValue(), cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(PaymentMethod initialPaymentMethod, x30.c displayName, l<? super n.a, h0> eventHandler, p<? super PaymentMethod, ? super Continuation<? super Throwable>, ? extends Object> removeExecutor, q<? super PaymentMethod, ? super h, ? super Continuation<? super s<PaymentMethod>>, ? extends Object> updateExecutor, boolean z11, boolean z12, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(initialPaymentMethod, "initialPaymentMethod");
        p013kotlin.jvm.internal.s.k(displayName, "displayName");
        p013kotlin.jvm.internal.s.k(eventHandler, "eventHandler");
        p013kotlin.jvm.internal.s.k(removeExecutor, "removeExecutor");
        p013kotlin.jvm.internal.s.k(updateExecutor, "updateExecutor");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.eventHandler = eventHandler;
        this.removeExecutor = removeExecutor;
        this.updateExecutor = updateExecutor;
        this.canRemove = z11;
        this.isLiveMode = z12;
        MutableStateFlow<EditPaymentMethodViewState.CardBrandChoice> MutableStateFlow = StateFlowKt.MutableStateFlow(p(initialPaymentMethod));
        this.choice = MutableStateFlow;
        MutableStateFlow<EditPaymentMethodViewState.b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(EditPaymentMethodViewState.b.Idle);
        this.status = MutableStateFlow2;
        MutableStateFlow<PaymentMethod> MutableStateFlow3 = StateFlowKt.MutableStateFlow(initialPaymentMethod);
        this.paymentMethod = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.confirmRemoval = MutableStateFlow4;
        MutableStateFlow<x30.c> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.error = MutableStateFlow5;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(workContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.viewState = g.e(MutableStateFlow3, MutableStateFlow, MutableStateFlow2, MutableStateFlow4, MutableStateFlow5, new d(displayName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EditPaymentMethodViewState.CardBrandChoice> l(PaymentMethod paymentMethod) {
        Set<String> setA;
        PaymentMethod.Card.Networks networks = m(paymentMethod).networks;
        if (networks == null || (setA = networks.a()) == null) {
            return v.m();
        }
        Set<String> set = setA;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(x(h.INSTANCE.b((String) it.next())));
        }
        return arrayList;
    }

    private final PaymentMethod.Card m(PaymentMethod paymentMethod) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            return card;
        }
        throw new IllegalStateException("Payment method must be a card in order to be edited");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(PaymentMethod paymentMethod) {
        String str = m(paymentMethod).last4;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Card payment method must contain last 4 digits");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditPaymentMethodViewState.CardBrandChoice p(PaymentMethod paymentMethod) {
        return x(h.INSTANCE.b(m(paymentMethod).displayBrand));
    }

    private final void q(EditPaymentMethodViewState.CardBrandChoice choice) {
        this.choice.setValue(choice);
        this.eventHandler.invoke(new n.a.HideBrands(choice.getBrand()));
    }

    private final void r() {
        this.eventHandler.invoke(new n.a.HideBrands(null));
    }

    private final void s() {
        this.eventHandler.invoke(new n.a.ShowBrands(this.choice.getValue().getBrand()));
    }

    private final void t() {
        this.confirmRemoval.setValue(Boolean.FALSE);
    }

    private final void u() {
        this.confirmRemoval.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(null), 3, null);
    }

    private final void v() {
        this.confirmRemoval.setValue(Boolean.TRUE);
    }

    private final void w() {
        PaymentMethod value = this.paymentMethod.getValue();
        EditPaymentMethodViewState.CardBrandChoice value2 = this.choice.getValue();
        if (p013kotlin.jvm.internal.s.f(p(value), value2)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(value2, null), 3, null);
    }

    private final EditPaymentMethodViewState.CardBrandChoice x(h hVar) {
        return new EditPaymentMethodViewState.CardBrandChoice(hVar);
    }

    @Override // p008h80.n
    public StateFlow<EditPaymentMethodViewState> a() {
        return this.viewState;
    }

    @Override // p008h80.n
    public void b(m viewAction) {
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (viewAction instanceof m.f) {
            v();
            return;
        }
        if (viewAction instanceof m.e) {
            u();
            return;
        }
        if (viewAction instanceof m.g) {
            w();
            return;
        }
        if (viewAction instanceof m.c) {
            s();
            return;
        }
        if (viewAction instanceof m.b) {
            r();
        } else if (viewAction instanceof m.OnBrandChoiceChanged) {
            q(((m.OnBrandChoiceChanged) viewAction).getChoice());
        } else if (viewAction instanceof m.d) {
            t();
        }
    }

    @Override // p008h80.t
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    @Override // p008h80.t
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    public /* synthetic */ j(PaymentMethod paymentMethod, x30.c cVar, l lVar, p pVar, q qVar, boolean z11, boolean z12, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethod, cVar, lVar, pVar, qVar, z11, z12, (i11 & 128) != 0 ? Dispatchers.getDefault() : coroutineContext);
    }
}
