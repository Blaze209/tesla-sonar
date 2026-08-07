package h30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.t;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010(\u001a\b\u0012\u0004\u0012\u00020 0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006)"}, d2 = {"Lh30/n;", "Lh30/d;", "Lz60/g;", "stripeRepository", "Lw30/l$c;", "requestOptions", "Lh30/e;", "cardAccountRangeStore", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "<init>", "(Lz60/g;Lw30/l$c;Lh30/e;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "Ljn0/h0;", "a", "()V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "c", "(Lh30/f$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "b", "Lw30/l$c;", "Lh30/e;", DateTokenConverter.CONVERTER_KEY, "Lw30/c;", "e", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_loading", "Lkotlinx/coroutines/flow/StateFlow;", "g", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.l.Options requestOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e cardAccountRangeStore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _loading;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.RemoteCardAccountRangeSource", f = "RemoteCardAccountRangeSource.kt", i = {0, 0, 0, 0}, l = {30}, m = "getAccountRanges", n = {"this", "cardNumber", "bin", "this_$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f70648n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f70649o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f70650p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f70651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f70652r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f70654t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70652r = obj;
            this.f70654t |= Integer.MIN_VALUE;
            return n.this.c(null, this);
        }
    }

    public n(z60.g stripeRepository, w30.l.Options requestOptions, e cardAccountRangeStore, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        s.k(stripeRepository, "stripeRepository");
        s.k(requestOptions, "requestOptions");
        s.k(cardAccountRangeStore, "cardAccountRangeStore");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.stripeRepository = stripeRepository;
        this.requestOptions = requestOptions;
        this.cardAccountRangeStore = cardAccountRangeStore;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._loading = MutableStateFlow;
        this.loading = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final void a() {
        this.analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, null, 62, null));
    }

    @Override // h30.d
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h30.d
    public Object c(f.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        a aVar;
        f.Unvalidated unvalidated2;
        h30.a aVar2;
        Object objA;
        n nVar;
        n nVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f70654t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f70654t = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f70652r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f70654t;
        if (i12 == 0) {
            t.b(obj);
            h30.a bin = unvalidated.getBin();
            if (bin == null) {
                return null;
            }
            this._loading.setValue(Boxing.boxBoolean(true));
            z60.g gVar = this.stripeRepository;
            w30.l.Options options = this.requestOptions;
            aVar.f70648n = this;
            aVar.f70649o = unvalidated;
            aVar.f70650p = bin;
            aVar.f70651q = this;
            aVar.f70654t = 1;
            Object objV = gVar.v(bin, options, aVar);
            if (objV == coroutine_suspended) {
                return coroutine_suspended;
            }
            unvalidated2 = unvalidated;
            aVar2 = bin;
            objA = objV;
            nVar = this;
            nVar2 = nVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) aVar.f70651q;
            aVar2 = (h30.a) aVar.f70650p;
            unvalidated2 = (f.Unvalidated) aVar.f70649o;
            nVar2 = (n) aVar.f70648n;
            t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objA)) {
            objA = ((CardMetadata) objA).a();
        }
        Object objB = jn0.s.b(objA);
        nVar._loading.setValue(Boxing.boxBoolean(false));
        if (jn0.s.h(objB)) {
            List<AccountRange> list = (List) objB;
            nVar2.cardAccountRangeStore.a(aVar2, list);
            if (!list.isEmpty()) {
                List<AccountRange> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((AccountRange) it.next()).getBinRange().a(unvalidated2)) {
                            }
                        } else if (unvalidated2.getIsValidLuhn()) {
                            nVar2.a();
                        }
                    }
                } else if (unvalidated2.getIsValidLuhn()) {
                    nVar2.a();
                }
            }
        }
        return (List) (jn0.s.g(objB) ? null : objB);
    }
}
