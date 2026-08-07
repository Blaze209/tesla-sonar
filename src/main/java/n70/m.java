package n70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m60.InlineSignupViewState;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001 B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00122\u0010\n\u001a.\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR@\u0010\n\u001a.\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ln70/m;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function4;", "Lm60/m;", "Lw70/j;", "", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "payWithLink", "Lkotlinx/coroutines/flow/StateFlow;", "selection", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "updateLinkPrimaryButtonUiState", "Lx30/c;", "primaryButtonLabel", "shouldCompleteLinkFlowInline", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lwn0/r;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;Lkotlinx/coroutines/flow/StateFlow;Z)V", "Lm60/e;", "viewState", "j", "(Lm60/e;)V", "userInput", IntegerTokenConverter.CONVERTER_KEY, "(Lm60/m;)V", "state", "h", "a", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lwn0/r;", "c", "Lkotlinx/coroutines/flow/StateFlow;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "e", "f", "Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "g", "Lkotlinx/coroutines/flow/MutableStateFlow;", "linkInlineSignUpState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f93431i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.r<m60.m, w70.j, Boolean, Continuation<? super h0>, Object> payWithLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.j> selection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<PrimaryButton.UIState, h0> updateLinkPrimaryButtonUiState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<x30.c> primaryButtonLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldCompleteLinkFlowInline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<InlineSignupViewState> linkInlineSignUpState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkInlineHandler$1", f = "LinkInlineHandler.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93439n;

        /* JADX INFO: renamed from: n70.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw70/j;", "paymentSelection", "Lm60/e;", "linkInlineSignUpState", "Lkotlin/Pair;", "<anonymous>", "(Lw70/j;Lm60/e;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkInlineHandler$1$1", f = "LinkInlineHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1996a extends SuspendLambda implements wn0.q<w70.j, InlineSignupViewState, Continuation<? super Pair<? extends w70.j, ? extends InlineSignupViewState>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f93441n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f93442o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f93443p;

            C1996a(Continuation<? super C1996a> continuation) {
                super(3, continuation);
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(w70.j jVar, InlineSignupViewState inlineSignupViewState, Continuation<? super Pair<? extends w70.j, InlineSignupViewState>> continuation) {
                C1996a c1996a = new C1996a(continuation);
                c1996a.f93442o = jVar;
                c1996a.f93443p = inlineSignupViewState;
                return c1996a.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f93441n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return new Pair((w70.j) this.f93442o, (InlineSignupViewState) this.f93443p);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lw70/j;", "Lm60/e;", "pair", "Ljn0/h0;", "a", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f93444a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f93445b;

            b(j0 j0Var, m mVar) {
                this.f93444a = j0Var;
                this.f93445b = mVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<? extends w70.j, InlineSignupViewState> pair, Continuation<? super h0> continuation) {
                w70.j jVarA = pair.a();
                InlineSignupViewState inlineSignupViewStateB = pair.b();
                if (jVarA instanceof w70.j.e.Card) {
                    this.f93444a.f86523a = true;
                    if (inlineSignupViewStateB != null) {
                        this.f93445b.j(inlineSignupViewStateB);
                    }
                    return h0.f84049a;
                }
                if (this.f93444a.f86523a) {
                    if (!(jVarA instanceof w70.j.e.USBankAccount)) {
                        this.f93445b.updateLinkPrimaryButtonUiState.invoke(null);
                    }
                    this.f93444a.f86523a = false;
                }
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return m.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93439n;
            if (i11 == 0) {
                jn0.t.b(obj);
                j0 j0Var = new j0();
                Flow flowCombine = FlowKt.combine(m.this.selection, m.this.linkInlineSignUpState, new C1996a(null));
                b bVar = new b(j0Var, m.this);
                this.f93439n = 1;
                if (flowCombine.collect(bVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: n70.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln70/m$b;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ln70/m;", "a", "(Lk80/a;Lkotlinx/coroutines/CoroutineScope;)Ln70/m;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n70.m$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.r<m60.m, w70.j, Boolean, Continuation<? super h0>, Object>, SuspendFunction {
            a(Object obj) {
                super(4, obj, com.stripe.android.paymentsheet.k.class, "payWithLinkInline", "payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final Object a(m60.m mVar, w70.j jVar, boolean z11, Continuation<? super h0> continuation) {
                return ((com.stripe.android.paymentsheet.k) this.receiver).k(mVar, jVar, z11, continuation);
            }

            @Override // wn0.r
            public /* bridge */ /* synthetic */ Object invoke(m60.m mVar, w70.j jVar, Boolean bool, Continuation<? super h0> continuation) {
                return a(mVar, jVar, bool.booleanValue(), continuation);
            }
        }

        /* JADX INFO: renamed from: n70.m$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1997b extends p013kotlin.jvm.internal.u implements wn0.l<PrimaryButton.UIState, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f93446c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1997b(k80.a aVar) {
                super(1);
                this.f93446c = aVar;
            }

            public final void a(PrimaryButton.UIState uIState) {
                this.f93446c.k().setValue(uIState);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(PrimaryButton.UIState uIState) {
                a(uIState);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: n70.m$b$c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "Lx30/c;", "a", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)Lx30/c;"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.l<PrimaryButton.UIState, x30.c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f93447c = new c();

            c() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x30.c invoke(PrimaryButton.UIState uIState) {
                if (uIState != null) {
                    return uIState.getLabel();
                }
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(k80.a viewModel, CoroutineScope coroutineScope) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
            return new m(coroutineScope, new a(viewModel.getLinkHandler()), viewModel.C(), new C1997b(viewModel), r90.g.m(viewModel.y(), c.f93447c), viewModel.getIsCompleteFlow());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkInlineHandler$payWithLinkInline$1", f = "LinkInlineHandler.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93448n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m60.m f93450p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m60.m mVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f93450p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return m.this.new c(this.f93450p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93448n;
            if (i11 == 0) {
                jn0.t.b(obj);
                wn0.r rVar = m.this.payWithLink;
                m60.m mVar = this.f93450p;
                Object value = m.this.selection.getValue();
                Boolean boolBoxBoolean = Boxing.boxBoolean(m.this.shouldCompleteLinkFlowInline);
                this.f93448n = 1;
                if (rVar.invoke(mVar, value, boolBoxBoolean, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m60.m f93452d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m60.m mVar) {
            super(0);
            this.f93452d = mVar;
        }

        public final void b() {
            m.this.i(this.f93452d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(CoroutineScope coroutineScope, wn0.r<? super m60.m, ? super w70.j, ? super Boolean, ? super Continuation<? super h0>, ? extends Object> payWithLink, StateFlow<? extends w70.j> selection, wn0.l<? super PrimaryButton.UIState, h0> updateLinkPrimaryButtonUiState, StateFlow<? extends x30.c> primaryButtonLabel, boolean z11) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(payWithLink, "payWithLink");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(updateLinkPrimaryButtonUiState, "updateLinkPrimaryButtonUiState");
        p013kotlin.jvm.internal.s.k(primaryButtonLabel, "primaryButtonLabel");
        this.coroutineScope = coroutineScope;
        this.payWithLink = payWithLink;
        this.selection = selection;
        this.updateLinkPrimaryButtonUiState = updateLinkPrimaryButtonUiState;
        this.primaryButtonLabel = primaryButtonLabel;
        this.shouldCompleteLinkFlowInline = z11;
        this.linkInlineSignUpState = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(m60.m userInput) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(userInput, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(InlineSignupViewState viewState) {
        PrimaryButton.UIState uIState;
        x30.c value = this.primaryButtonLabel.getValue();
        if (value == null) {
            return;
        }
        wn0.l<PrimaryButton.UIState, h0> lVar = this.updateLinkPrimaryButtonUiState;
        if (viewState.h()) {
            m60.m userInput = viewState.getUserInput();
            uIState = (userInput == null || this.selection.getValue() == null) ? new PrimaryButton.UIState(value, e.f93453c, false, this.shouldCompleteLinkFlowInline) : new PrimaryButton.UIState(value, new d(userInput), true, this.shouldCompleteLinkFlowInline);
        } else {
            uIState = null;
        }
        lVar.invoke(uIState);
    }

    public final void h(InlineSignupViewState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        this.linkInlineSignUpState.setValue(state);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f93453c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }
}
