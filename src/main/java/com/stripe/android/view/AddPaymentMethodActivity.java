package com.stripe.android.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import ezvcard.property.Gender;
import f30.PaymentConfiguration;
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
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006*\u0001D\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J!\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0005\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010;R\u001b\u0010@\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010?R\u001b\u0010\"\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/r2;", "<init>", "()V", "Lcom/stripe/android/view/b;", "args", "Ljn0/h0;", "G", "(Lcom/stripe/android/view/b;)V", "Lcom/stripe/android/view/i;", "J", "(Lcom/stripe/android/view/b;)Lcom/stripe/android/view/i;", "Landroid/view/ViewGroup;", "contentRoot", "Landroid/view/View;", "H", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/stripe/android/model/v0;", "paymentMethod", Gender.FEMALE, "(Lcom/stripe/android/model/v0;)V", "K", "Lcom/stripe/android/view/c;", "result", "L", "(Lcom/stripe/android/view/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onUserInteraction", "t", "Lcom/stripe/android/view/j;", "viewModel", "Lcom/stripe/android/model/w0;", "params", "I", "(Lcom/stripe/android/view/j;Lcom/stripe/android/model/w0;)V", "", "visible", "u", "(Z)V", "l", "Lkotlin/Lazy;", Gender.NONE, "()Lcom/stripe/android/view/b;", "Lf30/h0;", "m", "Q", "()Lf30/h0;", "stripe", "Lcom/stripe/android/model/v0$p;", "n", Gender.OTHER, "()Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "o", "P", "()Z", "shouldAttachToCustomer", "p", Gender.MALE, "()Lcom/stripe/android/view/i;", "addPaymentMethodView", "q", "S", "()Lcom/stripe/android/view/j;", "com/stripe/android/view/AddPaymentMethodActivity$f", "r", "Lcom/stripe/android/view/AddPaymentMethodActivity$f;", "cardInputListener", "", "R", "()I", "titleStringRes", "s", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddPaymentMethodActivity extends r2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f54396t = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy args = jn0.m.b(new d());

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy stripe = jn0.m.b(new m());

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentMethodType = jn0.m.b(new i());

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy shouldAttachToCustomer = jn0.m.b(new j());

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy addPaymentMethodView = jn0.m.b(new c());

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.p003lifecycle.e1(p013kotlin.jvm.internal.o0.b(com.stripe.android.view.j.class), new k(this), new n(), new l(null, this));

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final f cardInputListener = new f();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54404a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.p.Netbanking.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54404a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/i;", "b", "()Lcom/stripe/android/view/i;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.view.i> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.view.i invoke() {
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            com.stripe.android.view.i iVarJ = addPaymentMethodActivity.J(addPaymentMethodActivity.N());
            iVarJ.setId(f30.z.f64276p0);
            return iVarJ;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/b;", "b", "()Lcom/stripe/android/view/b;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<Args> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Args invoke() {
            Args.Companion companion = Args.INSTANCE;
            Intent intent = AddPaymentMethodActivity.this.getIntent();
            p013kotlin.jvm.internal.s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1", f = "AddPaymentMethodActivity.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54407n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f30.f f54409p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f54410q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f30.f fVar, PaymentMethod paymentMethod, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f54409p = fVar;
            this.f54410q = paymentMethod;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return AddPaymentMethodActivity.this.new e(this.f54409p, this.f54410q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54407n;
            if (i11 == 0) {
                jn0.t.b(obj);
                com.stripe.android.view.j jVarS = AddPaymentMethodActivity.this.S();
                f30.f fVar = this.f54409p;
                PaymentMethod paymentMethod = this.f54410q;
                this.f54407n = 1;
                objG = jVarS.g(fVar, paymentMethod, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objG = ((jn0.s) obj).getValue();
            }
            AddPaymentMethodActivity addPaymentMethodActivity = AddPaymentMethodActivity.this;
            Throwable thE = jn0.s.e(objG);
            if (thE == null) {
                addPaymentMethodActivity.K((PaymentMethod) objG);
            } else {
                addPaymentMethodActivity.v(false);
                String message = thE.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.w(message);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"com/stripe/android/view/AddPaymentMethodActivity$f", "Lcom/stripe/android/view/f0;", "Lcom/stripe/android/view/f0$a;", "focusField", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/view/f0$a;)V", "e", "()V", "b", "a", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements f0 {
        f() {
        }

        @Override // com.stripe.android.view.f0
        public void a() {
        }

        @Override // com.stripe.android.view.f0
        public void b() {
        }

        @Override // com.stripe.android.view.f0
        public void c() {
        }

        @Override // com.stripe.android.view.f0
        public void d(f0.a focusField) {
            p013kotlin.jvm.internal.s.k(focusField, "focusField");
        }

        @Override // com.stripe.android.view.f0
        public void e() {
            AddPaymentMethodActivity.this.S().k();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.AddPaymentMethodActivity$createPaymentMethod$1", f = "AddPaymentMethodActivity.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54412n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.view.j f54413o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f54414p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AddPaymentMethodActivity f54415q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.view.j jVar, PaymentMethodCreateParams paymentMethodCreateParams, AddPaymentMethodActivity addPaymentMethodActivity, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f54413o = jVar;
            this.f54414p = paymentMethodCreateParams;
            this.f54415q = addPaymentMethodActivity;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f54413o, this.f54414p, this.f54415q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54412n;
            if (i11 == 0) {
                jn0.t.b(obj);
                com.stripe.android.view.j jVar = this.f54413o;
                PaymentMethodCreateParams paymentMethodCreateParams = this.f54414p;
                this.f54412n = 1;
                objH = jVar.h(paymentMethodCreateParams, this);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objH = ((jn0.s) obj).getValue();
            }
            AddPaymentMethodActivity addPaymentMethodActivity = this.f54415q;
            Throwable thE = jn0.s.e(objH);
            if (thE == null) {
                PaymentMethod paymentMethod = (PaymentMethod) objH;
                if (addPaymentMethodActivity.P()) {
                    addPaymentMethodActivity.F(paymentMethod);
                } else {
                    addPaymentMethodActivity.K(paymentMethod);
                }
            } else {
                addPaymentMethodActivity.v(false);
                String message = thE.getMessage();
                if (message == null) {
                    message = "";
                }
                addPaymentMethodActivity.w(message);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        h() {
            super(0);
        }

        public final void b() {
            AddPaymentMethodActivity.this.N();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/v0$p;", "b", "()Lcom/stripe/android/model/v0$p;"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<PaymentMethod.p> {
        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod.p invoke() {
            return AddPaymentMethodActivity.this.N().getPaymentMethodType();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AddPaymentMethodActivity.this.O().isReusable && AddPaymentMethodActivity.this.N().getShouldAttachToCustomer());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class k extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f54419c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f54419c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class l extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f54420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54421d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f54420c = aVar;
            this.f54421d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f54420c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f54421d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf30/h0;", "b", "()Lf30/h0;"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.a<f30.h0> {
        m() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f30.h0 invoke() {
            PaymentConfiguration paymentConfiguration = AddPaymentMethodActivity.this.N().getPaymentConfiguration();
            if (paymentConfiguration == null) {
                paymentConfiguration = PaymentConfiguration.INSTANCE.a(AddPaymentMethodActivity.this);
            }
            Context applicationContext = AddPaymentMethodActivity.this.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            return new f30.h0(applicationContext, paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId(), false, null, 24, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new com.stripe.android.view.j.b(AddPaymentMethodActivity.this.Q(), AddPaymentMethodActivity.this.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(PaymentMethod paymentMethod) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(f30.f.INSTANCE.a());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new e((f30.f) objB, paymentMethod, null), 3, null);
        } else {
            L(new com.stripe.android.view.c.Failure(thE));
        }
    }

    private final void G(Args args) {
        Integer windowFlags = args.getWindowFlags();
        if (windowFlags != null) {
            getWindow().addFlags(windowFlags.intValue());
        }
        s().setLayoutResource(f30.b0.f63905c);
        View viewInflate = s().inflate();
        p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        h40.c cVarA = h40.c.a((ViewGroup) viewInflate);
        p013kotlin.jvm.internal.s.j(cVarA, "bind(...)");
        cVarA.f70664b.addView(M());
        LinearLayout root = cVarA.f70664b;
        p013kotlin.jvm.internal.s.j(root, "root");
        View viewH = H(root);
        if (viewH != null) {
            M().setAccessibilityTraversalBefore(viewH.getId());
            viewH.setAccessibilityTraversalAfter(M().getId());
            cVarA.f70664b.addView(viewH);
        }
        setTitle(R());
    }

    private final View H(ViewGroup contentRoot) {
        if (N().getAddPaymentMethodFooterLayoutId() <= 0) {
            return null;
        }
        View viewInflate = getLayoutInflater().inflate(N().getAddPaymentMethodFooterLayoutId(), contentRoot, false);
        viewInflate.setId(f30.z.f64274o0);
        if (viewInflate instanceof TextView) {
            TextView textView = (TextView) viewInflate;
            t5.c.d(textView, 15);
            ViewCompat.j(viewInflate);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.view.i J(Args args) {
        int i11 = b.f54404a[O().ordinal()];
        if (i11 == 1) {
            com.stripe.android.view.d dVar = new com.stripe.android.view.d(this, null, 0, args.getBillingAddressFields(), 6, null);
            dVar.setCardInputListener(this.cardInputListener);
            return dVar;
        }
        if (i11 == 2) {
            return com.stripe.android.view.e.INSTANCE.a(this);
        }
        if (i11 == 3) {
            return com.stripe.android.view.h.INSTANCE.a(this);
        }
        throw new IllegalArgumentException("Unsupported Payment Method type: " + O().code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(PaymentMethod paymentMethod) {
        L(new com.stripe.android.view.c.Success(paymentMethod));
    }

    private final void L(com.stripe.android.view.c result) {
        v(false);
        setResult(-1, new Intent().putExtras(result.a()));
        finish();
    }

    private final com.stripe.android.view.i M() {
        return (com.stripe.android.view.i) this.addPaymentMethodView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Args N() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethod.p O() {
        return (PaymentMethod.p) this.paymentMethodType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        return ((Boolean) this.shouldAttachToCustomer.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f30.h0 Q() {
        return (f30.h0) this.stripe.getValue();
    }

    private final int R() {
        int i11 = b.f54404a[O().ordinal()];
        if (i11 == 1) {
            return f30.d0.J0;
        }
        if (i11 == 2) {
            return f30.d0.L0;
        }
        if (i11 == 3) {
            return f30.d0.L0;
        }
        throw new IllegalArgumentException("Unsupported Payment Method type: " + O().code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.view.j S() {
        return (com.stripe.android.view.j) this.viewModel.getValue();
    }

    public final void I(com.stripe.android.view.j viewModel, PaymentMethodCreateParams params) {
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        if (params == null) {
            return;
        }
        v(true);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new g(viewModel, params, this, null), 3, null);
    }

    @Override // com.stripe.android.view.r2, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (s90.a.a(this, new h())) {
            return;
        }
        S().m();
        G(N());
        setResult(-1, new Intent().putExtras(com.stripe.android.view.c.a.f54810b.a()));
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        M().requestFocus();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        S().l();
    }

    @Override // com.stripe.android.view.r2
    public void t() {
        S().n();
        I(S(), M().getCreateParams());
    }

    @Override // com.stripe.android.view.r2
    protected void u(boolean visible) {
        M().setCommunicatingProgress(visible);
    }
}
