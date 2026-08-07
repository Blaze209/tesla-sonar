package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import ezvcard.property.Gender;
import f30.PaymentSessionConfig;
import f30.PaymentSessionData;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@jn0.e
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J)\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010*\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/r2;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "t", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "Lcom/stripe/android/model/g1;", "shippingMethods", Gender.UNKNOWN, "(Lcom/stripe/android/model/f1;Ljava/util/List;)V", "W", "(Ljava/util/List;)V", "Y", "V", "", "R", "()Z", "S", "X", "Lf30/r$d;", "shippingInfoValidator", "Lf30/r$e;", "shippingMethodsFactory", "Z", "(Lf30/r$d;Lf30/r$e;Lcom/stripe/android/model/f1;)V", "", AnalyticsAttribute.Error, "T", "(Ljava/lang/Throwable;)V", "Lf30/s;", "paymentSessionData", "H", "(Lf30/s;)V", "Lh40/t;", "l", "Lkotlin/Lazy;", Gender.OTHER, "()Lh40/t;", "viewBinding", "Lcom/stripe/android/view/PaymentFlowViewPager;", "m", "Q", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager", "Lf30/f;", "n", "J", "()Lf30/f;", "customerSession", "Lcom/stripe/android/view/y1;", "o", "I", "()Lcom/stripe/android/view/y1;", "args", "Lf30/r;", "p", Gender.MALE, "()Lf30/r;", "paymentSessionConfig", "Lcom/stripe/android/view/b2;", "q", "P", "()Lcom/stripe/android/view/b2;", "viewModel", "Lcom/stripe/android/view/a2;", "r", "L", "()Lcom/stripe/android/view/a2;", "paymentFlowPagerAdapter", "Lcom/stripe/android/view/q1;", "s", "K", "()Lcom/stripe/android/view/q1;", "keyboardController", Gender.NONE, "()Lcom/stripe/android/model/f1;", "shippingInfo", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentFlowActivity extends r2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f54606u = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding = jn0.m.b(new n());

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewPager = jn0.m.b(new p());

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy customerSession = jn0.m.b(c.f54616c);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = jn0.m.b(new b());

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentSessionConfig = jn0.m.b(new j());

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.p003lifecycle.e1(p013kotlin.jvm.internal.o0.b(b2.class), new k(this), new o(), new l(null, this));

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentFlowPagerAdapter = jn0.m.b(new i());

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy keyboardController = jn0.m.b(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/y1;", "b", "()Lcom/stripe/android/view/y1;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Args> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Args invoke() {
            Args.Companion companion = Args.INSTANCE;
            Intent intent = PaymentFlowActivity.this.getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf30/f;", "b", "()Lf30/f;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<f30.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f54616c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f30.f invoke() {
            return f30.f.INSTANCE.a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/q1;", "b", "()Lcom/stripe/android/view/q1;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<q1> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q1 invoke() {
            return new q1(PaymentFlowActivity.this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        e() {
            super(0);
        }

        public final void b() {
            PaymentFlowActivity.this.I();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"com/stripe/android/view/PaymentFlowActivity$f", "Landroidx/viewpager/widget/b$j;", "", IntegerTokenConverter.CONVERTER_KEY, "", "v", "i1", "Ljn0/h0;", "a", "(IFI)V", "c", "(I)V", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements androidx.viewpager.widget.b.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p002activity.b0 f54620b;

        f(androidx.p002activity.b0 b0Var) {
            this.f54620b = b0Var;
        }

        @Override // androidx.viewpager.widget.b.j
        public void a(int i11, float v11, int i12) {
        }

        @Override // androidx.viewpager.widget.b.j
        public void b(int i11) {
        }

        @Override // androidx.viewpager.widget.b.j
        public void c(int i11) {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            paymentFlowActivity.setTitle(paymentFlowActivity.L().s(i11));
            if (PaymentFlowActivity.this.L().r(i11) == z1.ShippingInfo) {
                PaymentFlowActivity.this.P().p(false);
                PaymentFlowActivity.this.L().x(false);
            }
            this.f54620b.setEnabled(PaymentFlowActivity.this.S());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/b0;", "Ljn0/h0;", "a", "(Landroidx/activity/b0;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<androidx.p002activity.b0, jn0.h0> {
        g() {
            super(1);
        }

        public final void a(androidx.p002activity.b0 addCallback) {
            p013kotlin.jvm.internal.s.k(addCallback, "$this$addCallback");
            b2 b2VarP = PaymentFlowActivity.this.P();
            b2VarP.m(b2VarP.getCurrentPage() - 1);
            PaymentFlowActivity.this.Q().setCurrentItem(PaymentFlowActivity.this.P().getCurrentPage());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(androidx.p002activity.b0 b0Var) {
            a(b0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.PaymentFlowActivity$onShippingInfoValidated$1$1", f = "PaymentFlowActivity.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54622n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ShippingInformation f54624p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ List<ShippingMethod> f54625q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ShippingInformation shippingInformation, List<ShippingMethod> list, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f54624p = shippingInformation;
            this.f54625q = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return PaymentFlowActivity.this.new h(this.f54624p, this.f54625q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54622n;
            if (i11 == 0) {
                jn0.t.b(obj);
                b2 b2VarP = PaymentFlowActivity.this.P();
                ShippingInformation shippingInformation = this.f54624p;
                this.f54622n = 1;
                objL = b2VarP.l(shippingInformation, this);
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objL = ((jn0.s) obj).getValue();
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            List<ShippingMethod> list = this.f54625q;
            Throwable thE = jn0.s.e(objL);
            if (thE == null) {
                paymentFlowActivity.U(((Customer) objL).getShippingInformation(), list);
            } else {
                String message = thE.getMessage();
                if (message == null) {
                    message = "";
                }
                paymentFlowActivity.w(message);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/a2;", "b", "()Lcom/stripe/android/view/a2;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<a2> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/g1;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/g1;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ShippingMethod, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PaymentFlowActivity f54627c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaymentFlowActivity paymentFlowActivity) {
                super(1);
                this.f54627c = paymentFlowActivity;
            }

            public final void a(ShippingMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f54627c.P().o(it);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(ShippingMethod shippingMethod) {
                a(shippingMethod);
                return jn0.h0.f84049a;
            }
        }

        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a2 invoke() {
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            return new a2(paymentFlowActivity, paymentFlowActivity.M(), PaymentFlowActivity.this.M().a(), new a(PaymentFlowActivity.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf30/r;", "b", "()Lf30/r;"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<PaymentSessionConfig> {
        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentSessionConfig invoke() {
            return PaymentFlowActivity.this.I().getPaymentSessionConfig();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class k extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f54629c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f54629c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class l extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f54630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f54630c = aVar;
            this.f54631d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f54630c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f54631d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.PaymentFlowActivity$validateShippingInformation$1", f = "PaymentFlowActivity.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54632n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentSessionConfig.d f54634p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PaymentSessionConfig.e f54635q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ShippingInformation f54636r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(PaymentSessionConfig.d dVar, PaymentSessionConfig.e eVar, ShippingInformation shippingInformation, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f54634p = dVar;
            this.f54635q = eVar;
            this.f54636r = shippingInformation;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return PaymentFlowActivity.this.new m(this.f54634p, this.f54635q, this.f54636r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objQ;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54632n;
            if (i11 == 0) {
                jn0.t.b(obj);
                b2 b2VarP = PaymentFlowActivity.this.P();
                PaymentSessionConfig.d dVar = this.f54634p;
                PaymentSessionConfig.e eVar = this.f54635q;
                ShippingInformation shippingInformation = this.f54636r;
                this.f54632n = 1;
                objQ = b2VarP.q(dVar, eVar, shippingInformation, this);
                if (objQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objQ = ((jn0.s) obj).getValue();
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            Throwable thE = jn0.s.e(objQ);
            if (thE == null) {
                paymentFlowActivity.W((List) objQ);
            } else {
                paymentFlowActivity.T(thE);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh40/t;", "b", "()Lh40/t;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.a<h40.t> {
        n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h40.t invoke() {
            PaymentFlowActivity.this.s().setLayoutResource(f30.b0.f63924v);
            View viewInflate = PaymentFlowActivity.this.s().inflate();
            p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            h40.t tVarA = h40.t.a((ViewGroup) viewInflate);
            p013kotlin.jvm.internal.s.j(tVarA, "bind(...)");
            return tVarA;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        o() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new b2.b(PaymentFlowActivity.this.J(), PaymentFlowActivity.this.I().getPaymentSessionData());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewPager;", "b", "()Lcom/stripe/android/view/PaymentFlowViewPager;"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.a<PaymentFlowViewPager> {
        p() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentFlowViewPager invoke() {
            PaymentFlowViewPager shippingFlowViewpager = PaymentFlowActivity.this.O().f70755b;
            p013kotlin.jvm.internal.s.j(shippingFlowViewpager, "shippingFlowViewpager");
            return shippingFlowViewpager;
        }
    }

    private final void H(PaymentSessionData paymentSessionData) {
        setResult(-1, new Intent().putExtra("extra_payment_session_data", paymentSessionData));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Args I() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f30.f J() {
        return (f30.f) this.customerSession.getValue();
    }

    private final q1 K() {
        return (q1) this.keyboardController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a2 L() {
        return (a2) this.paymentFlowPagerAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSessionConfig M() {
        return (PaymentSessionConfig) this.paymentSessionConfig.getValue();
    }

    private final ShippingInformation N() {
        return ((ShippingInfoWidget) Q().findViewById(f30.z.f64270m0)).getShippingInformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h40.t O() {
        return (h40.t) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b2 P() {
        return (b2) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager Q() {
        return (PaymentFlowViewPager) this.viewPager.getValue();
    }

    private final boolean R() {
        return Q().getCurrentItem() + 1 < L().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S() {
        return Q().getCurrentItem() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Throwable error) {
        String message = error.getMessage();
        v(false);
        if (message == null || message.length() == 0) {
            String string = getString(f30.d0.f63985z0);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            w(string);
        } else {
            w(message);
        }
        P().n(PaymentSessionData.b(P().getPaymentSessionData(), false, false, 0L, 0L, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, null));
    }

    private final void V() {
        K().a();
        ShippingInformation shippingInformationN = N();
        if (shippingInformationN != null) {
            P().n(PaymentSessionData.b(P().getPaymentSessionData(), false, false, 0L, 0L, shippingInformationN, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, null));
            v(true);
            Z(M().getShippingInformationValidator(), M().getShippingMethodsFactory(), shippingInformationN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(List<ShippingMethod> shippingMethods) {
        ShippingInformation shippingInformation = P().getPaymentSessionData().getShippingInformation();
        if (shippingInformation != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new h(shippingInformation, shippingMethods, null), 3, null);
        }
    }

    private final void X() {
        H(PaymentSessionData.b(P().getPaymentSessionData(), false, false, 0L, 0L, null, ((SelectShippingMethodWidget) Q().findViewById(f30.z.f64264j0)).getSelectedShippingMethod(), null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
    }

    private final void Y(List<ShippingMethod> shippingMethods) {
        v(false);
        L().z(shippingMethods);
        L().x(true);
        if (!R()) {
            H(P().getPaymentSessionData());
            return;
        }
        b2 b2VarP = P();
        b2VarP.m(b2VarP.getCurrentPage() + 1);
        Q().setCurrentItem(P().getCurrentPage());
    }

    private final void Z(PaymentSessionConfig.d shippingInfoValidator, PaymentSessionConfig.e shippingMethodsFactory, ShippingInformation shippingInformation) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new m(shippingInfoValidator, shippingMethodsFactory, shippingInformation, null), 3, null);
    }

    public final /* synthetic */ void U(ShippingInformation shippingInformation, List shippingMethods) {
        p013kotlin.jvm.internal.s.k(shippingMethods, "shippingMethods");
        Y(shippingMethods);
        P().n(PaymentSessionData.b(P().getPaymentSessionData(), false, false, 0L, 0L, shippingInformation, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, null));
    }

    @Override // com.stripe.android.view.r2, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (s90.a.a(this, new e())) {
            return;
        }
        Args.Companion companion = Args.INSTANCE;
        Intent intent = getIntent();
        p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
        Integer windowFlags = companion.a(intent).getWindowFlags();
        if (windowFlags != null) {
            getWindow().addFlags(windowFlags.intValue());
        }
        ShippingInformation submittedShippingInfo = P().getSubmittedShippingInfo();
        if (submittedShippingInfo == null) {
            submittedShippingInfo = M().getPrepopulatedShippingInfo();
        }
        L().z(P().i());
        L().x(P().getIsShippingInfoSubmitted());
        L().y(submittedShippingInfo);
        L().w(P().getSelectedShippingMethod());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        p013kotlin.jvm.internal.s.j(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        androidx.p002activity.b0 b0VarB = androidx.p002activity.d0.b(onBackPressedDispatcher, null, false, new g(), 3, null);
        Q().setAdapter(L());
        Q().b(new f(b0VarB));
        Q().setCurrentItem(P().getCurrentPage());
        b0VarB.setEnabled(S());
        setTitle(L().s(Q().getCurrentItem()));
    }

    @Override // com.stripe.android.view.r2
    public void t() {
        if (z1.ShippingInfo == L().r(Q().getCurrentItem())) {
            V();
        } else {
            X();
        }
    }
}
