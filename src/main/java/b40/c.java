package b40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.stripe.android.customersheet.g;
import com.stripe.android.model.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import w30.e;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u001f\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\f2\u0006\u0010.\u001a\u00020-2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010;¨\u0006<"}, d2 = {"Lb40/c;", "Lb40/b;", "Lw30/c;", "analyticsRequestExecutor", "Lw30/e;", "analyticsRequestFactory", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lw30/c;Lw30/e;Lkotlin/coroutines/CoroutineContext;)V", "Lb40/a;", "event", "Ljn0/h0;", "t", "(Lb40/a;)V", "Lcom/stripe/android/customersheet/d$c;", "configuration", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "q", "(Lcom/stripe/android/customersheet/d$c;Lcom/stripe/android/customersheet/g$c;)V", "Lb40/b$c;", AnalyticsContext.Screen, IntegerTokenConverter.CONVERTER_KEY, "(Lb40/b$c;)V", "f", "", "code", "e", "(Ljava/lang/String;)V", "type", "n", "j", "g", "()V", "p", "m", "o", "Lb40/b$a;", "style", "l", "(Lb40/b$a;)V", "k", "Lb40/b$b;", "source", "Lcom/stripe/android/model/h;", "selectedBrand", DateTokenConverter.CONVERTER_KEY, "(Lb40/b$b;Lcom/stripe/android/model/h;)V", "h", "b", "(Lcom/stripe/android/model/h;)V", "", AnalyticsAttribute.Error, "c", "(Lcom/stripe/android/model/h;Ljava/lang/Throwable;)V", "a", "Lw30/c;", "Lw30/e;", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements b40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e analyticsRequestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16411b;

        static {
            int[] iArr = new int[b40.b.c.values().length];
            try {
                iArr[b40.b.c.EditPaymentMethod.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16410a = iArr;
            int[] iArr2 = new int[b40.b.EnumC0322b.values().length];
            try {
                iArr2[b40.b.EnumC0322b.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[b40.b.EnumC0322b.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f16411b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$fireEvent$1", f = "DefaultCustomerSheetEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16412n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b40.a f16414p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b40.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16414p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(this.f16414p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f16412n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w30.c cVar = c.this.analyticsRequestExecutor;
            e eVar = c.this.analyticsRequestFactory;
            b40.a aVar = this.f16414p;
            cVar.a(eVar.g(aVar, aVar.a()));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(w30.c analyticsRequestExecutor, e analyticsRequestFactory, CoroutineContext workContext) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(analyticsRequestFactory, "analyticsRequestFactory");
        s.k(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void t(b40.a event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new b(event, null), 3, null);
    }

    @Override // b40.b
    public void a() {
        t(new b40.a.c());
    }

    @Override // b40.b
    public void b(h selectedBrand) {
        s.k(selectedBrand, "selectedBrand");
        t(new b40.a.r(selectedBrand));
    }

    @Override // b40.b
    public void c(h selectedBrand, Throwable error) {
        s.k(selectedBrand, "selectedBrand");
        s.k(error, "error");
        t(new b40.a.q(selectedBrand, error));
    }

    @Override // b40.b
    public void d(b40.b.EnumC0322b source, h selectedBrand) {
        b40.a.p.EnumC0321a enumC0321a;
        s.k(source, "source");
        s.k(selectedBrand, "selectedBrand");
        int i11 = a.f16411b[source.ordinal()];
        if (i11 == 1) {
            enumC0321a = b40.a.p.EnumC0321a.Add;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC0321a = b40.a.p.EnumC0321a.Edit;
        }
        t(new b40.a.p(enumC0321a, selectedBrand));
    }

    @Override // b40.b
    public void e(String code) {
        s.k(code, "code");
        t(new b40.a.o(code));
    }

    @Override // b40.b
    public void f(b40.b.c screen) {
        s.k(screen, "screen");
        if (a.f16410a[screen.ordinal()] == 1) {
            t(new b40.a.m(screen));
        }
    }

    @Override // b40.b
    public void g() {
        t(new b40.a.h());
    }

    @Override // b40.b
    public void h(b40.b.EnumC0322b source, h selectedBrand) {
        b40.a.i.EnumC0317a enumC0317a;
        s.k(source, "source");
        int i11 = a.f16411b[source.ordinal()];
        if (i11 == 1) {
            enumC0317a = b40.a.i.EnumC0317a.Add;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC0317a = b40.a.i.EnumC0317a.Edit;
        }
        t(new b40.a.i(enumC0317a, selectedBrand));
    }

    @Override // b40.b
    public void i(b40.b.c screen) {
        s.k(screen, "screen");
        t(new b40.a.n(screen));
    }

    @Override // b40.b
    public void j(String type) {
        s.k(type, "type");
        t(new b40.a.e(type));
    }

    @Override // b40.b
    public void k(b40.b.a style) {
        s.k(style, "style");
        t(new b40.a.C0314a(style));
    }

    @Override // b40.b
    public void l(b40.b.a style) {
        s.k(style, "style");
        t(new b40.a.b(style));
    }

    @Override // b40.b
    public void m() {
        t(new b40.a.l());
    }

    @Override // b40.b
    public void n(String type) {
        s.k(type, "type");
        t(new b40.a.f(type));
    }

    @Override // b40.b
    public void o() {
        t(new b40.a.k());
    }

    @Override // b40.b
    public void p() {
        t(new b40.a.g());
    }

    @Override // b40.b
    public void q(com.stripe.android.customersheet.d.Configuration configuration, g.c integrationType) {
        s.k(configuration, "configuration");
        s.k(integrationType, "integrationType");
        t(new b40.a.j(configuration, integrationType));
    }
}
