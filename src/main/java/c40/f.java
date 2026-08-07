package c40;

import a40.CustomerPermissions;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc40/f;", "Lc40/l;", "Lc40/e;", "elementsSessionManager", "Lc40/o;", "savedSelectionDataSource", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lc40/e;Lc40/o;Lkotlin/coroutines/CoroutineContext;)V", "Lc40/j;", "Lc40/p;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lc40/e;", "b", "Lc40/o;", "c", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e elementsSessionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o savedSelectionDataSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "Lc40/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource$loadCustomerSheetSession$2", f = "CustomerSessionInitializationDataSource.kt", i = {1}, l = {19, 21}, m = "invokeSuspend", n = {"customerSessionElementsSession"}, s = {"L$0"})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<CustomerSheetSession>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18664n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f18665o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x008a A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:23:0x0059, B:25:0x008a, B:29:0x0096, B:26:0x0091, B:30:0x00a3, B:31:0x00a8, B:19:0x0046), top: B:36:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0091 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:23:0x0059, B:25:0x008a, B:29:0x0096, B:26:0x0091, B:30:0x00a3, B:31:0x00a8, B:19:0x0046), top: B:36:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a3 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:23:0x0059, B:25:0x008a, B:29:0x0096, B:26:0x0091, B:30:0x00a3, B:31:0x00a8, B:19:0x0046), top: B:36:0x0008 }] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objB;
            CustomerSessionElementsSession customerSessionElementsSession;
            ElementsSession.Customer.Components.b customerSheet;
            boolean isPaymentMethodRemoveEnabled;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18665o;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    e eVar = f.this.elementsSessionManager;
                    this.f18665o = 1;
                    objA = eVar.b(this);
                    if (objA != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    t.b(obj);
                    objA = ((s) obj).getValue();
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    customerSessionElementsSession = (CustomerSessionElementsSession) this.f18664n;
                    t.b(obj);
                }
                Object objA2 = ((j) obj).a();
                t.b(objA2);
                w70.m mVar = (w70.m) objA2;
                ElementsSession.Customer customer = customerSessionElementsSession.getCustomer();
                ElementsSession elementsSession = customerSessionElementsSession.getElementsSession();
                List<PaymentMethod> listA = customer.a();
                u60.h.Disabled disabled = new u60.h.Disabled(PaymentMethod.b.ALWAYS);
                customerSheet = customer.getSession().getComponents().getCustomerSheet();
                if (customerSheet instanceof ElementsSession.Customer.Components.b.Enabled) {
                    isPaymentMethodRemoveEnabled = ((ElementsSession.Customer.Components.b.Enabled) customerSheet).getIsPaymentMethodRemoveEnabled();
                } else {
                    if (customerSheet instanceof ElementsSession.Customer.Components.b.C0892a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    isPaymentMethodRemoveEnabled = false;
                }
                objB = s.b(new CustomerSheetSession(elementsSession, listA, mVar, disabled, new CustomerPermissions(isPaymentMethodRemoveEnabled)));
                return k.c(objB);
                f fVar = f.this;
                if (s.h(objA)) {
                    CustomerSessionElementsSession customerSessionElementsSession2 = (CustomerSessionElementsSession) objA;
                    o oVar = fVar.savedSelectionDataSource;
                    this.f18664n = customerSessionElementsSession2;
                    this.f18665o = 2;
                    Object objI = oVar.i(this);
                    if (objI != coroutine_suspended) {
                        customerSessionElementsSession = customerSessionElementsSession2;
                        obj = objI;
                        Object objA3 = ((j) obj).a();
                        t.b(objA3);
                        w70.m mVar2 = (w70.m) objA3;
                        ElementsSession.Customer customer2 = customerSessionElementsSession.getCustomer();
                        ElementsSession elementsSession2 = customerSessionElementsSession.getElementsSession();
                        List<PaymentMethod> listA2 = customer2.a();
                        u60.h.Disabled disabled2 = new u60.h.Disabled(PaymentMethod.b.ALWAYS);
                        customerSheet = customer2.getSession().getComponents().getCustomerSheet();
                        if (customerSheet instanceof ElementsSession.Customer.Components.b.Enabled) {
                            isPaymentMethodRemoveEnabled = ((ElementsSession.Customer.Components.b.Enabled) customerSheet).getIsPaymentMethodRemoveEnabled();
                        } else {
                            if (customerSheet instanceof ElementsSession.Customer.Components.b.C0892a) {
                                throw new NoWhenBranchMatchedException();
                            }
                            isPaymentMethodRemoveEnabled = false;
                        }
                        objB = s.b(new CustomerSheetSession(elementsSession2, listA2, mVar2, disabled2, new CustomerPermissions(isPaymentMethodRemoveEnabled)));
                    }
                    return coroutine_suspended;
                }
                objB = s.b(objA);
            } catch (Throwable th2) {
                s.Companion companion = s.INSTANCE;
                objA = t.a(th2);
            }
            return k.c(objB);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super j<CustomerSheetSession>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(e elementsSessionManager, o savedSelectionDataSource, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(elementsSessionManager, "elementsSessionManager");
        p013kotlin.jvm.internal.s.k(savedSelectionDataSource, "savedSelectionDataSource");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.savedSelectionDataSource = savedSelectionDataSource;
        this.workContext = workContext;
    }

    @Override // c40.l
    public Object h(Continuation<? super j<CustomerSheetSession>> continuation) {
        return BuildersKt.withContext(this.workContext, new a(null), continuation);
    }
}
