package com.stripe.android.customersheet;

import c40.CustomerSheetSession;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.t;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import z80.SharedDataSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015BO\b\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00104\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lcom/stripe/android/customersheet/o;", "Lcom/stripe/android/customersheet/h;", "Lkotlin/Function0;", "", "isLiveModeProvider", "Lkotlin/Function1;", "La60/d;", "Lcom/stripe/android/googlepaylauncher/l;", "googlePayRepositoryFactory", "Ll70/d;", "isFinancialConnectionsAvailable", "Lt60/d;", "lpmRepository", "Lkotlinx/coroutines/Deferred;", "Lc40/l;", "initializationDataSourceProvider", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lwn0/a;Lwn0/l;Ll70/d;Lt60/d;Lkotlinx/coroutines/Deferred;Lh70/h;Lkotlin/coroutines/CoroutineContext;)V", "(Lwn0/a;Lwn0/l;Ll70/d;Lt60/d;Lh70/h;Lkotlin/coroutines/CoroutineContext;)V", "Ljn0/s;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/customersheet/d$c;", "configuration", "Lc40/p;", "customerSheetSession", "Lu60/e;", "e", "(Lcom/stripe/android/customersheet/d$c;Lc40/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", OrcaKeys.METADATA, "Lcom/stripe/android/customersheet/j;", DateTokenConverter.CONVERTER_KEY, "(Lc40/p;Lu60/e;Lcom/stripe/android/customersheet/d$c;)Lcom/stripe/android/customersheet/j;", "", "Lt60/g;", "supportedPaymentMethods", "f", "(Ljava/util/List;)Ljava/util/List;", "a", "(Lcom/stripe/android/customersheet/d$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/a;", "b", "Lwn0/l;", "c", "Ll70/d;", "Lt60/d;", "Lkotlinx/coroutines/Deferred;", "Lh70/h;", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> isLiveModeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> googlePayRepositoryFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l70.d isFinancialConnectionsAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t60.d lpmRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Deferred<c40.l> initializationDataSourceProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0, 0, 0, 0, 0}, l = {114}, m = "createPaymentMethodMetadata", n = {"this", "configuration", "customerSheetSession", "elementsSession", "sharedDataSpecs"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50021n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50022o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f50023p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f50024q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f50025r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f50026s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f50028u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50026s = obj;
            this.f50028u |= Integer.MIN_VALUE;
            return o.this.e(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {65, 66, 75}, m = "load-gIAlu-s", n = {"this", "configuration", "this", "configuration", "this", "configuration", "customerSheetSession"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50030o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f50031p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f50032q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f50034s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50032q = obj;
            this.f50034s |= Integer.MIN_VALUE;
            Object objA = o.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0}, l = {88}, m = "retrieveInitializationDataSource-IoAF18A", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50035n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f50036o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50038q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50036o = obj;
            this.f50038q |= Integer.MIN_VALUE;
            Object objG = o.this.g(this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : jn0.s.a(objG);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f50039c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Couldn't find an instance of InitializationDataSource. Are you instantiating CustomerSheet unconditionally in your app?";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(wn0.a<Boolean> isLiveModeProvider, wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> googlePayRepositoryFactory, l70.d isFinancialConnectionsAvailable, t60.d lpmRepository, Deferred<? extends c40.l> initializationDataSourceProvider, h70.h errorReporter, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(isLiveModeProvider, "isLiveModeProvider");
        p013kotlin.jvm.internal.s.k(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        p013kotlin.jvm.internal.s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        p013kotlin.jvm.internal.s.k(lpmRepository, "lpmRepository");
        p013kotlin.jvm.internal.s.k(initializationDataSourceProvider, "initializationDataSourceProvider");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.isLiveModeProvider = isLiveModeProvider;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.isFinancialConnectionsAvailable = isFinancialConnectionsAvailable;
        this.lpmRepository = lpmRepository;
        this.initializationDataSourceProvider = initializationDataSourceProvider;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    private final Full d(CustomerSheetSession customerSheetSession, PaymentMethodMetadata metadata, com.stripe.android.customersheet.d.Configuration configuration) {
        w70.j jVar;
        w70.j saved;
        Object next;
        List<PaymentMethod> listE = customerSheetSession.e();
        w70.m savedSelection = customerSheetSession.getSavedSelection();
        if (savedSelection != null) {
            if (savedSelection instanceof w70.m.a) {
                saved = w70.j.c.f121146b;
            } else if (savedSelection instanceof w70.m.b) {
                saved = w70.j.d.f121147b;
            } else {
                if (savedSelection instanceof w70.m.PaymentMethod) {
                    Iterator<T> it = listE.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p013kotlin.jvm.internal.s.f(((PaymentMethod) next).id, ((w70.m.PaymentMethod) savedSelection).getId()));
                    PaymentMethod paymentMethod = (PaymentMethod) next;
                    if (paymentMethod != null) {
                        saved = new w70.j.Saved(paymentMethod, null, null, 6, null);
                    }
                } else if (!(savedSelection instanceof w70.m.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                saved = null;
            }
            jVar = saved;
        } else {
            jVar = null;
        }
        return new Full(configuration, metadata, g40.d.b(customerSheetSession.e(), jVar instanceof w70.j.Saved ? (w70.j.Saved) jVar : null), customerSheetSession.getPermissions(), f(metadata.E()), jVar, w70.q.e(customerSheetSession.getElementsSession().getStripeIntent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(com.stripe.android.customersheet.d.Configuration configuration, CustomerSheetSession customerSheetSession, Continuation<? super PaymentMethodMetadata> continuation) {
        a aVar;
        ElementsSession elementsSession;
        List<SharedDataSpec> listC;
        o oVar;
        Object objFirst;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f50028u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f50028u = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f50026s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f50028u;
        if (i12 == 0) {
            t.b(obj);
            elementsSession = customerSheetSession.getElementsSession();
            listC = this.lpmRepository.b(elementsSession.getStripeIntent(), elementsSession.getPaymentMethodSpecs()).c();
            if (configuration.getGooglePayEnabled()) {
                Flow<Boolean> flowIsReady = this.googlePayRepositoryFactory.invoke(this.isLiveModeProvider.invoke().booleanValue() ? a60.d.Production : a60.d.Test).isReady();
                aVar.f50021n = this;
                aVar.f50022o = configuration;
                aVar.f50023p = customerSheetSession;
                aVar.f50024q = elementsSession;
                aVar.f50025r = listC;
                aVar.f50028u = 1;
                objFirst = FlowKt.first(flowIsReady, aVar);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oVar = this;
            } else {
                oVar = this;
            }
            return PaymentMethodMetadata.INSTANCE.a(elementsSession, configuration, customerSheetSession.getPaymentMethodSaveConsentBehavior(), listC, z, oVar.isFinancialConnectionsAvailable);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<SharedDataSpec> list = (List) aVar.f50025r;
        ElementsSession elementsSession2 = (ElementsSession) aVar.f50024q;
        CustomerSheetSession customerSheetSession2 = (CustomerSheetSession) aVar.f50023p;
        com.stripe.android.customersheet.d.Configuration configuration2 = (com.stripe.android.customersheet.d.Configuration) aVar.f50022o;
        o oVar2 = (o) aVar.f50021n;
        t.b(obj);
        listC = list;
        configuration = configuration2;
        elementsSession = elementsSession2;
        customerSheetSession = customerSheetSession2;
        oVar = oVar2;
        objFirst = obj;
        boolean z11 = ((Boolean) objFirst).booleanValue();
        return PaymentMethodMetadata.INSTANCE.a(elementsSession, configuration, customerSheetSession.getPaymentMethodSaveConsentBehavior(), listC, z11, oVar.isFinancialConnectionsAvailable);
    }

    private final List<SupportedPaymentMethod> f(List<SupportedPaymentMethod> supportedPaymentMethods) {
        Set setK = d1.k(PaymentMethod.p.Card.code, PaymentMethod.p.USBankAccount.code);
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedPaymentMethods) {
            if (setK.contains(((SupportedPaymentMethod) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Continuation<? super jn0.s<? extends c40.l>> continuation) {
        c cVar;
        Object objB;
        o oVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f50038q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f50038q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f50036o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f50038q;
        if (i12 == 0) {
            t.b(obj);
            Deferred<c40.l> deferred = this.initializationDataSourceProvider;
            io0.b.Companion companion = io0.b.INSTANCE;
            long jS = io0.d.s(5, io0.e.SECONDS);
            d dVar = d.f50039c;
            cVar.f50035n = this;
            cVar.f50038q = 1;
            objB = a40.c.b(deferred, jS, dVar, cVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            oVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (o) cVar.f50035n;
            t.b(obj);
            objB = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            h70.h.b.a(oVar.errorReporter, h70.h.d.CUSTOMER_SHEET_ADAPTER_NOT_FOUND, StripeException.INSTANCE.b(thE), null, 4, null);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:44:0x00e4, B:21:0x0050, B:34:0x008b, B:35:0x00a6, B:37:0x00ac, B:39:0x00c2, B:40:0x00c6, B:24:0x005c, B:31:0x0079, B:27:0x0069), top: B:48:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.customersheet.h
    public Object a(com.stripe.android.customersheet.d.Configuration configuration, Continuation<? super jn0.s<Full>> continuation) {
        b bVar;
        Object objG;
        o oVar;
        ArrayList arrayList;
        CustomerSheetSession customerSheetSessionB;
        Object objE;
        com.stripe.android.customersheet.d.Configuration configuration2;
        CustomerSheetSession customerSheetSession;
        o oVar2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f50034s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f50034s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objH = bVar.f50032q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f50034s;
        try {
            if (i12 == 0) {
                t.b(objH);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                bVar.f50029n = this;
                bVar.f50030o = configuration;
                bVar.f50034s = 1;
                objG = g(bVar);
                if (objG != coroutine_suspended) {
                    oVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                configuration = (com.stripe.android.customersheet.d.Configuration) bVar.f50030o;
                oVar = (o) bVar.f50029n;
                t.b(objH);
                objG = ((jn0.s) objH).getValue();
            } else {
                if (i12 == 2) {
                    configuration = (com.stripe.android.customersheet.d.Configuration) bVar.f50030o;
                    oVar = (o) bVar.f50029n;
                    t.b(objH);
                    Object objA = ((c40.j) objH).a();
                    t.b(objA);
                    CustomerSheetSession customerSheetSession2 = (CustomerSheetSession) objA;
                    List<PaymentMethod> listE = customerSheetSession2.e();
                    arrayList = new ArrayList();
                    for (Object obj : listE) {
                        if (new u60.i(configuration.getCardBrandAcceptance()).b((PaymentMethod) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    customerSheetSessionB = CustomerSheetSession.b(customerSheetSession2, null, arrayList, null, null, null, 29, null);
                    bVar.f50029n = oVar;
                    bVar.f50030o = configuration;
                    bVar.f50031p = customerSheetSessionB;
                    bVar.f50034s = 3;
                    objE = oVar.e(configuration, customerSheetSessionB, bVar);
                    if (objE != coroutine_suspended) {
                        configuration2 = configuration;
                        customerSheetSession = customerSheetSessionB;
                        objH = objE;
                        oVar2 = oVar;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                customerSheetSession = (CustomerSheetSession) bVar.f50031p;
                configuration2 = (com.stripe.android.customersheet.d.Configuration) bVar.f50030o;
                oVar2 = (o) bVar.f50029n;
                t.b(objH);
            }
            return jn0.s.b(oVar2.d(customerSheetSession, (PaymentMethodMetadata) objH, configuration2));
            t.b(objG);
            bVar.f50029n = oVar;
            bVar.f50030o = configuration;
            bVar.f50034s = 2;
            objH = ((c40.l) objG).h(bVar);
            if (objH != coroutine_suspended) {
                Object objA2 = ((c40.j) objH).a();
                t.b(objA2);
                CustomerSheetSession customerSheetSession3 = (CustomerSheetSession) objA2;
                List<PaymentMethod> listE2 = customerSheetSession3.e();
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (new u60.i(configuration.getCardBrandAcceptance()).b((PaymentMethod) obj)) {
                        arrayList.add(obj);
                    }
                }
                customerSheetSessionB = CustomerSheetSession.b(customerSheetSession3, null, arrayList, null, null, null, 29, null);
                bVar.f50029n = oVar;
                bVar.f50030o = configuration;
                bVar.f50031p = customerSheetSessionB;
                bVar.f50034s = 3;
                objE = oVar.e(configuration, customerSheetSessionB, bVar);
                if (objE != coroutine_suspended) {
                    configuration2 = configuration;
                    customerSheetSession = customerSheetSessionB;
                    objH = objE;
                    oVar2 = oVar;
                    return jn0.s.b(oVar2.d(customerSheetSession, (PaymentMethodMetadata) objH, configuration2));
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(th2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(wn0.a<Boolean> isLiveModeProvider, wn0.l<a60.d, com.stripe.android.googlepaylauncher.l> googlePayRepositoryFactory, l70.d isFinancialConnectionsAvailable, t60.d lpmRepository, h70.h errorReporter, CoroutineContext workContext) {
        this(isLiveModeProvider, googlePayRepositoryFactory, isFinancialConnectionsAvailable, lpmRepository, g40.a.f67321a.b(), errorReporter, workContext);
        p013kotlin.jvm.internal.s.k(isLiveModeProvider, "isLiveModeProvider");
        p013kotlin.jvm.internal.s.k(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        p013kotlin.jvm.internal.s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        p013kotlin.jvm.internal.s.k(lpmRepository, "lpmRepository");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }
}
