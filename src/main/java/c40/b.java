package c40;

import a40.CustomerPermissions;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.a1;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u00192\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0082@¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0096@¢\u0006\u0004\b#\u0010\u0012J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u001fH\u0096@¢\u0006\u0004\b$\u0010\u0012J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010%\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010%\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b,\u0010+J\u0018\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u001fH\u0096@¢\u0006\u0004\b.\u0010\u0012J \u00101\u001a\b\u0012\u0004\u0012\u0002000\u001f2\b\u0010/\u001a\u0004\u0018\u00010-H\u0096@¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fH\u0096@¢\u0006\u0004\b3\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u001a\u0010<\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b6\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Lc40/b;", "Lc40/l;", "Lc40/o;", "Lc40/n;", "Lc40/m;", "Lf80/b;", "elementsSessionRepository", "Lcom/stripe/android/customersheet/b;", "customerAdapter", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lf80/b;Lcom/stripe/android/customersheet/b;Lh70/h;Lkotlin/coroutines/CoroutineContext;)V", "Ljn0/s;", "Lcom/stripe/android/model/h0;", "n", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/stripe/android/model/v0;", "o", "", "m", "()Ljava/util/List;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/stripe/android/customersheet/b$c;", "", "task", "Lc40/j;", "p", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc40/p;", "h", "a", "paymentMethodId", "Lcom/stripe/android/model/a1;", "params", "e", "(Ljava/lang/String;Lcom/stripe/android/model/a1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lw70/m;", IntegerTokenConverter.CONVERTER_KEY, "selection", "Ljn0/h0;", "g", "(Lw70/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lf80/b;", "Lcom/stripe/android/customersheet/b;", "c", "Lh70/h;", "Lkotlin/coroutines/CoroutineContext;", "", "Z", "()Z", "canCreateSetupIntents", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements c40.l, o, n, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f80.b elementsSessionRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.b customerAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean canCreateSetupIntents;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "Lcom/stripe/android/model/v0;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$attachPaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18610n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18612p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f18612p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new a(this.f18612p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18610n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            String str = this.f18612p;
            this.f18610n = 1;
            Object objD = bVar.d(str, this);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: c40.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "Lcom/stripe/android/model/v0;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$detachPaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class C0373b extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18613n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18615p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0373b(String str, Continuation<? super C0373b> continuation) {
            super(1, continuation);
            this.f18615p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new C0373b(this.f18615p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18613n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            String str = this.f18615p;
            this.f18613n = 1;
            Object objB = bVar.b(str, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
            return ((C0373b) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource", f = "CustomerAdapterDataSource.kt", i = {0}, l = {110}, m = "fetchElementsSession-IoAF18A", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18616n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f18617o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18619q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18617o = obj;
            this.f18619q |= Integer.MIN_VALUE;
            Object objN = b.this.n(this);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : s.a(objN);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource", f = "CustomerAdapterDataSource.kt", i = {0}, l = {128}, m = "fetchInitialPaymentMethods-IoAF18A", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18620n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f18621o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18623q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18621o = obj;
            this.f18623q |= Integer.MIN_VALUE;
            Object objO = b.this.o(this);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : s.a(objO);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource", f = "CustomerAdapterDataSource.kt", i = {}, l = {37}, m = "loadCustomerSheetSession", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18624n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18626p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18624n = obj;
            this.f18626p |= Integer.MIN_VALUE;
            return b.this.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/p;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2", f = "CustomerAdapterDataSource.kt", i = {0, 0, 1, 1, 2, 2}, l = {50, 51, 52}, m = "invokeSuspend", n = {"paymentMethodsResult", "savedSelectionResult", "savedSelectionResult", "elementsSession", "elementsSession", "paymentMethods"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super CustomerSheetSession>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18627n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f18628o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f18629p;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1", f = "CustomerAdapterDataSource.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends ElementsSession>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f18631n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f18632o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f18632o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f18632o, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends ElementsSession>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super s<ElementsSession>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objN;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f18631n;
                if (i11 == 0) {
                    t.b(obj);
                    b bVar = this.f18632o;
                    this.f18631n = 1;
                    objN = bVar.n(this);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objN = ((s) obj).getValue();
                }
                return s.a(objN);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<ElementsSession>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: c40.b$f$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2$paymentMethodsResult$1", f = "CustomerAdapterDataSource.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
        static final class C0374b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f18633n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f18634o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0374b(b bVar, Continuation<? super C0374b> continuation) {
                super(2, continuation);
                this.f18634o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0374b(this.f18634o, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends List<? extends PaymentMethod>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super s<? extends List<PaymentMethod>>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objO;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f18633n;
                if (i11 == 0) {
                    t.b(obj);
                    b bVar = this.f18634o;
                    this.f18633n = 1;
                    objO = bVar.o(this);
                    if (objO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    objO = ((s) obj).getValue();
                }
                return s.a(objO);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<? extends List<PaymentMethod>>> continuation) {
                return ((C0374b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lw70/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1", f = "CustomerAdapterDataSource.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends w70.m>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f18635n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f18636o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f18636o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f18636o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f18635n;
                if (i11 == 0) {
                    t.b(obj);
                    b bVar = this.f18636o;
                    this.f18635n = 1;
                    obj = bVar.i(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return s.a(((c40.j) obj).a());
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends w70.m>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f18629p = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Deferred deferred;
            ElementsSession elementsSession;
            Deferred deferred2;
            List list;
            Object objAwait;
            List list2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18628o;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f18629p;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(b.this, null), 3, null);
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0374b(b.this, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new c(b.this, null), 3, null);
                this.f18629p = deferredAsync$default3;
                this.f18627n = deferredAsync$default;
                this.f18628o = 1;
                obj = deferredAsync$default2.await(this);
                if (obj != coroutine_suspended) {
                    deferred = deferredAsync$default3;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                deferredAsync$default = (Deferred) this.f18627n;
                deferred = (Deferred) this.f18629p;
                t.b(obj);
            } else {
                if (i11 == 2) {
                    elementsSession = (ElementsSession) this.f18627n;
                    deferred2 = (Deferred) this.f18629p;
                    t.b(obj);
                    Object value = ((s) obj).getValue();
                    t.b(value);
                    list = (List) value;
                    this.f18629p = elementsSession;
                    this.f18627n = list;
                    this.f18628o = 3;
                    objAwait = deferred2.await(this);
                    if (objAwait != coroutine_suspended) {
                        list2 = list;
                        obj = objAwait;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = (List) this.f18627n;
                elementsSession = (ElementsSession) this.f18629p;
                t.b(obj);
                list2 = list3;
            }
            ElementsSession elementsSession2 = elementsSession;
            Object value2 = ((s) obj).getValue();
            t.b(value2);
            return new CustomerSheetSession(elementsSession2, list2, (w70.m) value2, u60.h.d.f115780a, new CustomerPermissions(true));
            Object value3 = ((s) obj).getValue();
            t.b(value3);
            ElementsSession elementsSession3 = (ElementsSession) value3;
            this.f18629p = deferredAsync$default;
            this.f18627n = elementsSession3;
            this.f18628o = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 != coroutine_suspended) {
                Deferred deferred3 = deferredAsync$default;
                elementsSession = elementsSession3;
                obj = objAwait2;
                deferred2 = deferred3;
                Object value4 = ((s) obj).getValue();
                t.b(value4);
                list = (List) value4;
                this.f18629p = elementsSession;
                this.f18627n = list;
                this.f18628o = 3;
                objAwait = deferred2.await(this);
                if (objAwait != coroutine_suspended) {
                    list2 = list;
                    obj = objAwait;
                    ElementsSession elementsSession4 = elementsSession;
                    Object value5 = ((s) obj).getValue();
                    t.b(value5);
                    return new CustomerSheetSession(elementsSession4, list2, (w70.m) value5, u60.h.d.f115780a, new CustomerPermissions(true));
                }
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetSession> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrievePaymentMethods$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<List<? extends PaymentMethod>>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18637n;

        g(Continuation<? super g> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<List<? extends PaymentMethod>>> continuation) {
            return invoke2((Continuation<? super com.stripe.android.customersheet.b.c<List<PaymentMethod>>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18637n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            this.f18637n = 1;
            Object objA = bVar.a(this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super com.stripe.android.customersheet.b.c<List<PaymentMethod>>> continuation) {
            return ((g) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "Lw70/m;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSavedSelection$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<w70.m>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18639n;

        h(Continuation<? super h> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18639n;
            if (i11 == 0) {
                t.b(obj);
                com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
                this.f18639n = 1;
                obj = bVar.v(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            com.stripe.android.customersheet.b.c cVar = (com.stripe.android.customersheet.b.c) obj;
            if (cVar instanceof com.stripe.android.customersheet.b.c.C0805c) {
                com.stripe.android.customersheet.b.c.Companion companion = com.stripe.android.customersheet.b.c.INSTANCE;
                com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b = (com.stripe.android.customersheet.b.AbstractC0802b) ((com.stripe.android.customersheet.b.c.C0805c) cVar).a();
                return companion.b(abstractC0802b != null ? abstractC0802b.c() : null);
            }
            if (!(cVar instanceof com.stripe.android.customersheet.b.c.C0804b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.stripe.android.customersheet.b.c.C0804b c0804b = (com.stripe.android.customersheet.b.c.C0804b) cVar;
            return com.stripe.android.customersheet.b.c.INSTANCE.a(c0804b.getCause(), c0804b.getDisplayMessage());
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<w70.m>> continuation) {
            return ((h) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSetupIntentClientSecret$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<String>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18641n;

        i(Continuation<? super i> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new i(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18641n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            this.f18641n = 1;
            Object objW = bVar.w(this);
            return objW == coroutine_suspended ? coroutine_suspended : objW;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<String>> continuation) {
            return ((i) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$runCatchingAdapterTask$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    static final class j<T> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super c40.j<T>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18643n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f18644o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<T>>, Object> f18645p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(wn0.l<? super Continuation<? super com.stripe.android.customersheet.b.c<T>>, ? extends Object> lVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f18645p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f18645p, continuation);
            jVar.f18644o = obj;
            return jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18643n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<T>>, Object> lVar = this.f18645p;
                    s.Companion companion = s.INSTANCE;
                    this.f18643n = 1;
                    obj = lVar.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = s.b((com.stripe.android.customersheet.b.c) obj);
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            Throwable thE = s.e(objB);
            return thE == null ? c40.k.b((com.stripe.android.customersheet.b.c) objB) : c40.j.INSTANCE.a(thE, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super c40.j<T>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "Ljn0/h0;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$setSavedSelection$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18646n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w70.m f18648p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(w70.m mVar, Continuation<? super k> continuation) {
            super(1, continuation);
            this.f18648p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new k(this.f18648p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18646n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            w70.m mVar = this.f18648p;
            com.stripe.android.customersheet.b.AbstractC0802b abstractC0802bB = mVar != null ? com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE.b(mVar) : null;
            this.f18646n = 1;
            Object objU = bVar.u(abstractC0802bB, this);
            return objU == coroutine_suspended ? coroutine_suspended : objU;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<h0>> continuation) {
            return ((k) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/b$c;", "Lcom/stripe/android/model/v0;", "<anonymous>", "()Lcom/stripe/android/customersheet/b$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$updatePaymentMethod$2", f = "CustomerAdapterDataSource.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.l<Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18649n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f18651p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a1 f18652q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, a1 a1Var, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f18651p = str;
            this.f18652q = a1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new l(this.f18651p, this.f18652q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18649n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.stripe.android.customersheet.b bVar = b.this.customerAdapter;
            String str = this.f18651p;
            a1 a1Var = this.f18652q;
            this.f18649n = 1;
            Object objE = bVar.e(str, a1Var, this);
            return objE == coroutine_suspended ? coroutine_suspended : objE;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super com.stripe.android.customersheet.b.c<PaymentMethod>> continuation) {
            return ((l) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(f80.b elementsSessionRepository, com.stripe.android.customersheet.b customerAdapter, h70.h errorReporter, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(elementsSessionRepository, "elementsSessionRepository");
        p013kotlin.jvm.internal.s.k(customerAdapter, "customerAdapter");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.elementsSessionRepository = elementsSessionRepository;
        this.customerAdapter = customerAdapter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.canCreateSetupIntents = customerAdapter.c();
    }

    private final List<String> m() {
        if (!this.customerAdapter.c()) {
            return v.e("card");
        }
        List<String> listT = this.customerAdapter.t();
        return listT == null ? v.m() : listT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object n(Continuation<? super s<ElementsSession>> continuation) {
        c cVar;
        Object objA;
        b bVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f18619q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f18619q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f18617o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f18619q;
        if (i12 == 0) {
            t.b(obj);
            y.m.DeferredIntent deferredIntent = new y.m.DeferredIntent(new y.n(new y.n.d.b(null, null, 3, null), m(), null, null, false, 28, null));
            f80.b bVar2 = this.elementsSessionRepository;
            List<String> listM = v.m();
            cVar2.f18616n = this;
            cVar2.f18619q = 1;
            objA = bVar2.a(deferredIntent, null, listM, null, cVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) cVar2.f18616n;
            t.b(obj);
            objA = ((s) obj).getValue();
        }
        if (s.h(objA)) {
            h70.h.b.a(bVar.errorReporter, h70.h.e.CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS, null, null, 6, null);
        }
        Throwable thE = s.e(objA);
        if (thE != null) {
            h70.h.b.a(bVar.errorReporter, h70.h.d.CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Continuation<? super s<? extends List<PaymentMethod>>> continuation) {
        d dVar;
        b bVar;
        StripeError stripeError;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f18623q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f18623q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.f18621o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f18623q;
        if (i12 == 0) {
            t.b(objA);
            dVar.f18620n = this;
            dVar.f18623q = 1;
            objA = a(dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) dVar.f18620n;
            t.b(objA);
        }
        c40.j jVar = (c40.j) objA;
        if (jVar instanceof c40.j.Success) {
            h70.h.b.a(bVar.errorReporter, h70.h.e.CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS, null, null, 6, null);
        }
        c40.j.Failure failureA = c40.k.a(jVar);
        if (failureA != null) {
            if (failureA.getDisplayMessage() == null) {
                Throwable cause = failureA.getCause();
                StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                    stripeError.getMessage();
                }
            }
            h70.h.b.a(bVar.errorReporter, h70.h.d.CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE, StripeException.INSTANCE.b(failureA.getCause()), null, 4, null);
        }
        return jVar.a();
    }

    private final <T> Object p(wn0.l<? super Continuation<? super com.stripe.android.customersheet.b.c<T>>, ? extends Object> lVar, Continuation<? super c40.j<T>> continuation) {
        return BuildersKt.withContext(this.workContext, new j(lVar, null), continuation);
    }

    @Override // c40.n
    public Object a(Continuation<? super c40.j<List<PaymentMethod>>> continuation) {
        return p(new g(null), continuation);
    }

    @Override // c40.n
    public Object b(String str, Continuation<? super c40.j<PaymentMethod>> continuation) {
        return p(new C0373b(str, null), continuation);
    }

    @Override // c40.m
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getCanCreateSetupIntents() {
        return this.canCreateSetupIntents;
    }

    @Override // c40.n
    public Object d(String str, Continuation<? super c40.j<PaymentMethod>> continuation) {
        return p(new a(str, null), continuation);
    }

    @Override // c40.n
    public Object e(String str, a1 a1Var, Continuation<? super c40.j<PaymentMethod>> continuation) {
        return p(new l(str, a1Var, null), continuation);
    }

    @Override // c40.m
    public Object f(Continuation<? super c40.j<String>> continuation) {
        return p(new i(null), continuation);
    }

    @Override // c40.o
    public Object g(w70.m mVar, Continuation<? super c40.j<h0>> continuation) {
        return p(new k(mVar, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // c40.l
    public Object h(Continuation<? super c40.j<CustomerSheetSession>> continuation) {
        e eVar;
        Object objB;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f18626p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f18626p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f18624n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar2.f18626p;
        if (i12 == 0) {
            t.b(obj);
            CoroutineContext coroutineContext = this.workContext;
            f fVar = new f(null);
            eVar2.f18626p = 1;
            objB = k30.a.b(coroutineContext, null, fVar, eVar2, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objB = ((s) obj).getValue();
        }
        return c40.k.c(objB);
    }

    @Override // c40.o
    public Object i(Continuation<? super c40.j<w70.m>> continuation) {
        return p(new h(null), continuation);
    }
}
