package com.stripe.android.paymentsheet.analytics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.h;
import com.stripe.android.model.n0;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import n70.f;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import w70.j;
import wn0.p;
import z30.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B3\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJS\u0010+\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u0006\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00103J\u001b\u00107\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0013j\u0002`6H\u0016¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0013j\u0002`6H\u0016¢\u0006\u0004\b9\u00108J\u001b\u0010:\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0013j\u0002`6H\u0016¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u00103J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b>\u0010=J#\u0010A\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010.\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u00102\b\u0010F\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\bG\u00108J\u0017\u0010I\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bI\u00108J\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u00103J\u000f\u0010K\u001a\u00020\u0010H\u0016¢\u0006\u0004\bK\u00103J\u001f\u0010P\u001a\u00020\u00102\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ!\u0010R\u001a\u00020\u00102\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bR\u0010QJ\u0017\u0010S\u001a\u00020\u00102\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00102\u0006\u0010O\u001a\u00020N2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0010H\u0016¢\u0006\u0004\bW\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010YR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010ZR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\\R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010]R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010^R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010]R\u0018\u0010%\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010_R\u0014\u0010b\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/a;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lz30/d;", "durationProvider", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lz30/d;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/paymentsheet/analytics/c;", "event", "Ljn0/h0;", "B", "(Lcom/stripe/android/paymentsheet/analytics/c;)V", "", "code", "A", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "", "isDeferred", "t", "(Lcom/stripe/android/paymentsheet/y$h;Z)V", "initializedViaCompose", "g", "(Z)V", "Lw70/j;", "paymentSelection", "Lcom/stripe/android/model/n0;", "linkMode", "googlePaySupported", "currency", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "", "orderedLpms", "requireCvcRecollection", "s", "(Lw70/j;Lcom/stripe/android/model/n0;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/y$m;Ljava/util/List;Z)V", "", AnalyticsAttribute.Error, "u", "(Ljava/lang/Throwable;)V", DateTokenConverter.CONVERTER_KEY, "onDismiss", "()V", "e", "w", "Lcom/stripe/android/model/PaymentMethodCode;", "q", "(Ljava/lang/String;)V", "j", "n", "a", "h", "(Lw70/j;)V", "k", "Ln70/f;", "deferredIntentConfirmationType", "r", "(Lw70/j;Ln70/f;)V", "Lq70/b;", "l", "(Lw70/j;Lq70/b;)V", "errorMessage", "v", "type", "o", "p", "x", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$a;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", "f", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$a;Lcom/stripe/android/model/h;)V", IntegerTokenConverter.CONVERTER_KEY, "b", "(Lcom/stripe/android/model/h;)V", "c", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;)V", "m", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "Lw30/c;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lz30/d;", "Lkotlin/coroutines/CoroutineContext;", "Z", "Lcom/stripe/android/model/n0;", "Ljava/lang/String;", "C", "()Z", "linkEnabled", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements EventReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EventReporter.Mode mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d durationProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDeferred;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private n0 linkMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean googlePaySupported;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String currency;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.analytics.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C0993a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52543a;

        static {
            int[] iArr = new int[EventReporter.a.values().length];
            try {
                iArr[EventReporter.a.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventReporter.a.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52543a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.DefaultEventReporter$fireEvent$1", f = "DefaultEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52544n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f52546p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f52546p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f52546p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f52544n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w30.c cVar = a.this.analyticsRequestExecutor;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.paymentAnalyticsRequestFactory;
            c cVar2 = this.f52546p;
            cVar.a(paymentAnalyticsRequestFactory.g(cVar2, cVar2.d()));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(EventReporter.Mode mode, w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, d durationProvider, CoroutineContext workContext) {
        s.k(mode, "mode");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(durationProvider, "durationProvider");
        s.k(workContext, "workContext");
        this.mode = mode;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.durationProvider = durationProvider;
        this.workContext = workContext;
    }

    private final String A(String code) {
        if (s.f(code, "link")) {
            return this.linkMode == n0.LinkCardBrand ? "link_card_brand" : "instant_debits";
        }
        return null;
    }

    private final void B(c event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new b(event, null), 3, null);
    }

    private final boolean C() {
        return this.linkMode != null;
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void a() {
        B(new c.C0994c(this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void b(h selectedBrand) {
        s.k(selectedBrand, "selectedBrand");
        B(new c.y(selectedBrand, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void c(h selectedBrand, Throwable error) {
        s.k(selectedBrand, "selectedBrand");
        s.k(error, "error");
        B(new c.x(selectedBrand, error, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void d(Throwable error) {
        s.k(error, "error");
        B(new c.f(error, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void e() {
        B(new c.t(this.mode, this.currency, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void f(EventReporter.a source, h selectedBrand) {
        c.v.a aVar;
        s.k(source, "source");
        s.k(selectedBrand, "selectedBrand");
        int i11 = C0993a.f52543a[source.ordinal()];
        if (i11 == 1) {
            aVar = c.v.a.Add;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = c.v.a.Edit;
        }
        B(new c.v(aVar, selectedBrand, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void g(boolean initializedViaCompose) {
        d.a.a(this.durationProvider, d.b.Loading, false, 2, null);
        B(new c.k(this.isDeferred, C(), this.googlePaySupported, initializedViaCompose));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void h(j paymentSelection) {
        s.k(paymentSelection, "paymentSelection");
        B(new c.r(this.mode, paymentSelection, this.currency, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void i(EventReporter.a source, h selectedBrand) {
        c.h.a aVar;
        s.k(source, "source");
        int i11 = C0993a.f52543a[source.ordinal()];
        if (i11 == 1) {
            aVar = c.h.a.Add;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = c.h.a.Edit;
        }
        B(new c.h(aVar, selectedBrand, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void j(String code) {
        s.k(code, "code");
        d.a.a(this.durationProvider, d.b.ConfirmButtonClicked, false, 2, null);
        B(new c.w(code, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void k(j paymentSelection) {
        B(new c.p(this.currency, this.durationProvider.b(d.b.ConfirmButtonClicked), q70.c.c(paymentSelection), q70.c.e(paymentSelection), this.isDeferred, C(), this.googlePaySupported, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void l(j paymentSelection, q70.b error) {
        s.k(error, "error");
        B(new c.n(this.mode, new c.n.a.Failure(error), this.durationProvider.b(d.b.Checkout), paymentSelection, this.currency, this.isDeferred, C(), this.googlePaySupported, null, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void m() {
        B(new c.b(this.mode));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void n(String code) {
        s.k(code, "code");
        B(new c.o(code, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void o(String type) {
        s.k(type, "type");
        B(new c.a(type, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void onDismiss() {
        B(new c.e(this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void p() {
        B(new c.s(this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void q(String code) {
        s.k(code, "code");
        boolean z11 = this.isDeferred;
        B(new c.q(code, this.currency, A(code), z11, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void r(j paymentSelection, f deferredIntentConfirmationType) {
        j.Saved.b walletType;
        j paymentSelection2;
        j.Saved saved = paymentSelection instanceof j.Saved ? (j.Saved) paymentSelection : null;
        j jVar = (saved == null || (walletType = saved.getWalletType()) == null || (paymentSelection2 = walletType.getPaymentSelection()) == null) ? paymentSelection : paymentSelection2;
        B(new c.n(this.mode, c.n.a.C0996c.f52622a, this.durationProvider.b(d.b.Checkout), jVar, this.currency, deferredIntentConfirmationType != null, C(), this.googlePaySupported, deferredIntentConfirmationType, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void s(j paymentSelection, n0 linkMode, boolean googlePaySupported, String currency, y.m initializationMode, List<String> orderedLpms, boolean requireCvcRecollection) {
        s.k(initializationMode, "initializationMode");
        s.k(orderedLpms, "orderedLpms");
        this.currency = currency;
        this.linkMode = linkMode;
        this.googlePaySupported = googlePaySupported;
        d.a.a(this.durationProvider, d.b.Checkout, false, 2, null);
        B(new c.l(paymentSelection, initializationMode, orderedLpms, this.durationProvider.b(d.b.Loading), linkMode, this.isDeferred, googlePaySupported, requireCvcRecollection, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void t(y.Configuration configuration, boolean isDeferred) {
        s.k(configuration, "configuration");
        this.isDeferred = isDeferred;
        B(new c.i(this.mode, configuration, isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void u(Throwable error) {
        s.k(error, "error");
        B(new c.j(this.durationProvider.b(d.b.Loading), error, this.isDeferred, C(), this.googlePaySupported, null));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void v(String errorMessage) {
        B(new c.m(this.isDeferred, C(), this.googlePaySupported, errorMessage));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void w() {
        B(new c.u(this.mode, this.currency, this.isDeferred, C(), this.googlePaySupported));
    }

    @Override // com.stripe.android.paymentsheet.analytics.EventReporter
    public void x() {
        B(new c.g(this.isDeferred, C(), this.googlePaySupported));
    }
}
