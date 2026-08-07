package p027z70;

import com.stripe.android.paymentsheet.ui.PrimaryButton;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import w70.j;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lz70/h;", "viewModel", "Lz70/d;", "usBankAccountFormArgs", "Ljn0/h0;", "a", "(Lz70/h;Lz70/d;Lr2/l;I)V", "Lz70/f;", "screenState", "", "hasRequiredFields", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$1", f = "USBankAccountEmitters.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127125n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f127126o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127127p;

        /* JADX INFO: renamed from: z70.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j$e$d;", "result", "Ljn0/h0;", "a", "(Lw70/j$e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C2755a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p027z70.d f127128a;

            C2755a(p027z70.d dVar) {
                this.f127128a = dVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j.e.USBankAccount uSBankAccount, Continuation<? super h0> continuation) {
                if (uSBankAccount != null) {
                    this.f127128a.h().invoke(uSBankAccount);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, p027z70.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f127126o = hVar;
            this.f127127p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f127126o, this.f127127p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127125n;
            if (i11 == 0) {
                t.b(obj);
                Flow<j.e.USBankAccount> flowB = this.f127126o.B();
                C2755a c2755a = new C2755a(this.f127127p);
                this.f127125n = 1;
                if (flowB.collect(c2755a, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$2", f = "USBankAccountEmitters.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127129n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f127130o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127131p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/e;", "result", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/bankaccount/navigation/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p027z70.d f127132a;

            a(p027z70.d dVar) {
                this.f127132a = dVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.navigation.e eVar, Continuation<? super h0> continuation) {
                l<com.stripe.android.payments.bankaccount.navigation.e, h0> lVarG;
                if (eVar != null && (lVarG = this.f127132a.g()) != null) {
                    lVarG.invoke(eVar);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, p027z70.d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f127130o = hVar;
            this.f127131p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f127130o, this.f127131p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127129n;
            if (i11 == 0) {
                t.b(obj);
                Flow<com.stripe.android.payments.bankaccount.navigation.e> flowT = this.f127130o.t();
                a aVar = new a(this.f127131p);
                this.f127129n = 1;
                if (flowT.collect(aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: z70.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$3", f = "USBankAccountEmitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class C2756c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127133n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f127134o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127135p;

        /* JADX INFO: renamed from: z70.c$c$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasRequiredFields", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p027z70.d f127136a;

            /* JADX INFO: renamed from: z70.c$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "a", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;"}, k = 3, mv = {1, 9, 0})
            static final class C2757a extends u implements l<PrimaryButton.UIState, PrimaryButton.UIState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f127137c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2757a(boolean z11) {
                    super(1);
                    this.f127137c = z11;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.UIState invoke(PrimaryButton.UIState uIState) {
                    if (uIState != null) {
                        return PrimaryButton.UIState.b(uIState, null, null, this.f127137c, false, 11, null);
                    }
                    return null;
                }
            }

            a(p027z70.d dVar) {
                this.f127136a = dVar;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                this.f127136a.l().invoke(new C2757a(z11));
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2756c(h hVar, p027z70.d dVar, Continuation<? super C2756c> continuation) {
            super(2, continuation);
            this.f127134o = hVar;
            this.f127135p = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2756c(this.f127134o, this.f127135p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f127133n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow<Boolean> stateFlowA = this.f127134o.A();
                a aVar = new a(this.f127135p);
                this.f127133n = 1;
                if (stateFlowA.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C2756c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$4", f = "USBankAccountEmitters.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127138n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127139o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h f127140p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<p027z70.f> f127141q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y3<Boolean> f127142r;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements l<p027z70.f, h0> {
            a(Object obj) {
                super(1, obj, h.class, "handlePrimaryButtonClick", "handlePrimaryButtonClick(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V", 0);
            }

            public final void a(p027z70.f p11) {
                s.k(p11, "p0");
                ((h) this.receiver).K(p11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p027z70.f fVar) {
                a(fVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p027z70.d dVar, h hVar, y3<? extends p027z70.f> y3Var, y3<Boolean> y3Var2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f127139o = dVar;
            this.f127140p = hVar;
            this.f127141q = y3Var;
            this.f127142r = y3Var2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(this.f127139o, this.f127140p, this.f127141q, this.f127142r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f127138n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            k.a(this.f127139o, c.b(this.f127141q), c.c(this.f127142r) && !c.b(this.f127141q).getIsProcessing(), new a(this.f127140p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f127143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h.d f127144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127145e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "a", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements l<PrimaryButton.UIState, PrimaryButton.UIState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f127146c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButton.UIState invoke(PrimaryButton.UIState uIState) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z70/c$e$b", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p027z70.d f127147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f127148b;

            public b(p027z70.d dVar, h hVar) {
                this.f127147a = dVar;
                this.f127148b = hVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f127147a.l().invoke(a.f127146c);
                this.f127148b.M();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h hVar, h.d dVar, p027z70.d dVar2) {
            super(1);
            this.f127143c = hVar;
            this.f127144d = dVar;
            this.f127145e = dVar2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 DisposableEffect) {
            s.k(DisposableEffect, "$this$DisposableEffect");
            h hVar = this.f127143c;
            h.d dVar = this.f127144d;
            s.h(dVar);
            hVar.N(dVar);
            return new b(this.f127145e, this.f127143c);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f127149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p027z70.d f127150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f127151e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h hVar, p027z70.d dVar, int i11) {
            super(2);
            this.f127149c = hVar;
            this.f127150d = dVar;
            this.f127151e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f127149c, this.f127150d, lVar, k2.a(this.f127151e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(h viewModel, p027z70.d usBankAccountFormArgs, p020r2.l lVar, int i11) {
        s.k(viewModel, "viewModel");
        s.k(usBankAccountFormArgs, "usBankAccountFormArgs");
        p020r2.l lVarV = lVar.v(356178850);
        if (o.J()) {
            o.S(356178850, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmitters (USBankAccountEmitters.kt:13)");
        }
        y3 y3VarA = r90.f.a(viewModel.u(), lVarV, 8);
        y3 y3VarA2 = r90.f.a(viewModel.A(), lVarV, 8);
        h.d dVarA = f.f.f63714a.a(lVarV, f.f.f63716c);
        h0 h0Var = h0.f84049a;
        Function0.g(h0Var, new a(viewModel, usBankAccountFormArgs, null), lVarV, 70);
        Function0.g(h0Var, new b(viewModel, usBankAccountFormArgs, null), lVarV, 70);
        Function0.g(h0Var, new C2756c(viewModel, usBankAccountFormArgs, null), lVarV, 70);
        Function0.f(b(y3VarA), Boolean.valueOf(c(y3VarA2)), new d(usBankAccountFormArgs, viewModel, y3VarA, y3VarA2, null), lVarV, 520);
        Function0.c(h0Var, new e(viewModel, dVarA, usBankAccountFormArgs), lVarV, 6);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(viewModel, usBankAccountFormArgs, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p027z70.f b(y3<? extends p027z70.f> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }
}
