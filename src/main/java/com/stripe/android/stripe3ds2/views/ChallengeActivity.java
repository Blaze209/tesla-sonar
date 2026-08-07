package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.b0;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.j0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import ezvcard.property.Gender;
import jn0.h0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o0;
import r80.Stripe3ds2ErrorReporterConfig;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001a\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u001a\u001a\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/stripe/android/stripe3ds2/transactions/b;", "cres", "Ljn0/h0;", Gender.NONE, "(Lcom/stripe/android/stripe3ds2/transactions/b;)V", "C", "z", "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onLowMemory", "", "level", "onTrimMemory", "(I)V", "onPause", "onResume", "onDestroy", "Lt80/v;", "f", "Lkotlin/Lazy;", "J", "()Lt80/v;", "transactionTimer", "Lr80/c;", "g", "E", "()Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/views/i;", "h", "G", "()Lcom/stripe/android/stripe3ds2/views/i;", "fragment", "Lo80/c;", IntegerTokenConverter.CONVERTER_KEY, "getFragmentViewBinding$3ds2sdk_release", "()Lo80/c;", "fragmentViewBinding", "Lo80/b;", "j", "L", "()Lo80/b;", "viewBinding", "Lcom/stripe/android/stripe3ds2/transaction/b;", "k", "D", "()Lcom/stripe/android/stripe3ds2/transaction/b;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/k;", "l", Gender.FEMALE, "()Lcom/stripe/android/stripe3ds2/transaction/k;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/views/d;", "m", Gender.MALE, "()Lcom/stripe/android/stripe3ds2/views/d;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/m;", "n", "K", "()Lcom/stripe/android/stripe3ds2/views/m;", "viewArgs", "Lcom/stripe/android/stripe3ds2/views/w;", "o", "H", "()Lcom/stripe/android/stripe3ds2/views/w;", "keyboardController", "Lcom/stripe/android/stripe3ds2/views/l;", "p", "I", "()Lcom/stripe/android/stripe3ds2/views/l;", "progressDialogFactory", "Landroid/app/Dialog;", "q", "Landroid/app/Dialog;", "progressDialog", "r", "a", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f54155r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final CoroutineDispatcher f54156s = Dispatchers.getIO();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy transactionTimer = jn0.m.b(new q());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorReporter = jn0.m.b(new c());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragment = jn0.m.b(new e());

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy fragmentViewBinding = jn0.m.b(new f());

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding = jn0.m.b(new s());

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy challengeActionHandler = jn0.m.b(new b());

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorRequestExecutor = jn0.m.b(new d());

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(com.stripe.android.stripe3ds2.views.d.class), new o(this), new t(), new p(null, this));

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewArgs = jn0.m.b(new r());

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy keyboardController = jn0.m.b(new g());

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy progressDialogFactory = jn0.m.b(new m());

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Dialog progressDialog;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$a;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "WORK_CONTEXT", "Lkotlinx/coroutines/CoroutineDispatcher;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/b$a;", "b", "()Lcom/stripe/android/stripe3ds2/transaction/b$a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.transaction.b.a> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.transaction.b.a invoke() {
            return new com.stripe.android.stripe3ds2.transaction.b.a(ChallengeActivity.this.K().getCreqData(), ChallengeActivity.this.E(), ChallengeActivity.this.K().getCreqExecutorFactory(), ChallengeActivity.f54156s);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr80/a;", "b", "()Lr80/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<r80.a> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r80.a invoke() {
            Context applicationContext = ChallengeActivity.this.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            return new r80.a(applicationContext, new Stripe3ds2ErrorReporterConfig(ChallengeActivity.this.K().f()), null, null, null, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/k;", "b", "()Lcom/stripe/android/stripe3ds2/transaction/k;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.transaction.k> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.transaction.k invoke() {
            return new com.stripe.android.stripe3ds2.transaction.q.b(ChallengeActivity.f54156s).a(ChallengeActivity.this.K().getCreqExecutorConfig().getAcsUrl(), ChallengeActivity.this.E());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/i;", "b", "()Lcom/stripe/android/stripe3ds2/views/i;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.i> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.i invoke() {
            return (com.stripe.android.stripe3ds2.views.i) ChallengeActivity.this.L().f96847b.getFragment();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo80/c;", "b", "()Lo80/c;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<o80.c> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o80.c invoke() {
            return ChallengeActivity.this.G().D();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/w;", "b", "()Lcom/stripe/android/stripe3ds2/views/w;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<w> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return new w(ChallengeActivity.this);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/stripe/android/stripe3ds2/views/ChallengeActivity$h", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends b0 {
        h() {
            super(true);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            ChallengeActivity.this.M().x(com.stripe.android.stripe3ds2.transaction.a.C1068a.f53959a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/a;", "kotlin.jvm.PlatformType", "challengeAction", "Ljn0/h0;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.stripe3ds2.transaction.a, h0> {
        i() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.a aVar) {
            if (ChallengeActivity.this.isFinishing()) {
                return;
            }
            ChallengeActivity.this.C();
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            Dialog dialogA = challengeActivity.I().a();
            dialogA.show();
            challengeActivity.progressDialog = dialogA;
            com.stripe.android.stripe3ds2.views.d dVarM = ChallengeActivity.this.M();
            p013kotlin.jvm.internal.s.h(aVar);
            dVarM.x(aVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.stripe3ds2.transaction.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/h;", "kotlin.jvm.PlatformType", "challengeResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.stripe3ds2.transaction.h, h0> {
        j() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.h hVar) {
            ChallengeActivity.this.setResult(-1, new Intent().putExtras(hVar.c()));
            if (ChallengeActivity.this.isFinishing()) {
                return;
            }
            ChallengeActivity.this.finish();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.stripe3ds2.transaction.h hVar) {
            a(hVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/b;", "kotlin.jvm.PlatformType", "cres", "Ljn0/h0;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<ChallengeResponseData, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<String> f54179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(n0<String> n0Var) {
            super(1);
            this.f54179d = n0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [T] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v7 */
        public final void a(ChallengeResponseData challengeResponseData) {
            ?? r11;
            String code;
            ChallengeActivity.this.B();
            if (challengeResponseData != null) {
                ChallengeActivity.this.N(challengeResponseData);
                n0<String> n0Var = this.f54179d;
                com.stripe.android.stripe3ds2.transactions.d uiType = challengeResponseData.getUiType();
                if (uiType != null) {
                    code = uiType.getCode();
                } else {
                    r11 = 0;
                }
                if (r11 == 0) {
                    r11 = code;
                    r11 = "";
                }
                r11 = code;
                n0Var.f86529a = r11;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ChallengeResponseData challengeResponseData) {
            a(challengeResponseData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isTimeout", "Ljn0/h0;", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<String> f54181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n0<String> n0Var) {
            super(1);
            this.f54181d = n0Var;
        }

        public final void a(Boolean bool) {
            if (p013kotlin.jvm.internal.s.f(bool, Boolean.TRUE)) {
                ChallengeActivity.this.M().q(new com.stripe.android.stripe3ds2.transaction.h.Timeout(this.f54181d.f86529a, ChallengeActivity.this.K().getCresData().getUiType(), ChallengeActivity.this.K().getIntentData()));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Boolean bool) {
            a(bool);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/l;", "b", "()Lcom/stripe/android/stripe3ds2/views/l;"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.l> {
        m() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.l invoke() {
            ChallengeActivity challengeActivity = ChallengeActivity.this;
            return new com.stripe.android.stripe3ds2.views.l(challengeActivity, challengeActivity.K().getUiCustomization());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n implements j0, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f54183a;

        n(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f54183a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof j0) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f54183a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p003lifecycle.j0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54183a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class o extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f54184c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f54184c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class p extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f54185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f54186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f54185c = aVar;
            this.f54186d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f54185c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f54186d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt80/j;", "b", "()Lt80/j;"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.a<t80.j> {
        q() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t80.j invoke() {
            return new t80.j(ChallengeActivity.this.K().getTimeoutMins(), ChallengeActivity.this.F(), ChallengeActivity.this.K().getCreqData());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/m;", "b", "()Lcom/stripe/android/stripe3ds2/views/m;"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<ChallengeViewArgs> {
        r() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeViewArgs invoke() {
            ChallengeViewArgs.Companion companion = ChallengeViewArgs.INSTANCE;
            Bundle extras = ChallengeActivity.this.getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            p013kotlin.jvm.internal.s.h(extras);
            return companion.a(extras);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo80/b;", "b", "()Lo80/b;"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.a<o80.b> {
        s() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o80.b invoke() {
            o80.b bVarC = o80.b.c(ChallengeActivity.this.getLayoutInflater());
            p013kotlin.jvm.internal.s.j(bVarC, "inflate(...)");
            return bVarC;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        t() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new com.stripe.android.stripe3ds2.views.d.b(ChallengeActivity.this.D(), ChallengeActivity.this.J(), ChallengeActivity.this.E(), ChallengeActivity.f54156s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.M().x(com.stripe.android.stripe3ds2.transaction.a.C1068a.f53959a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        H().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.b D() {
        return (com.stripe.android.stripe3ds2.transaction.b) this.challengeActionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r80.c E() {
        return (r80.c) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.transaction.k F() {
        return (com.stripe.android.stripe3ds2.transaction.k) this.errorRequestExecutor.getValue();
    }

    private final w H() {
        return (w) this.keyboardController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.views.l I() {
        return (com.stripe.android.stripe3ds2.views.l) this.progressDialogFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t80.v J() {
        return (t80.v) this.transactionTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeViewArgs K() {
        return (ChallengeViewArgs) this.viewArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(ChallengeResponseData cres) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        p013kotlin.jvm.internal.s.j(supportFragmentManager, "getSupportFragmentManager(...)");
        r0 r0VarR = supportFragmentManager.r();
        p013kotlin.jvm.internal.s.j(r0VarR, "beginTransaction()");
        com.stripe.android.stripe3ds2.views.a aVar = com.stripe.android.stripe3ds2.views.a.f54216a;
        r0VarR.v(aVar.a(), aVar.b(), aVar.a(), aVar.b());
        r0VarR.q(L().f96847b.getId(), com.stripe.android.stripe3ds2.views.i.class, q5.d.b(jn0.x.a("arg_cres", cres)));
        r0VarR.g();
    }

    private final void z() {
        final ThreeDS2Button threeDS2ButtonA = new com.stripe.android.stripe3ds2.views.r(this).a(K().getUiCustomization().e(), K().getUiCustomization().c(q80.q.a.CANCEL));
        if (threeDS2ButtonA != null) {
            threeDS2ButtonA.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.A(threeDS2ButtonA, this, view);
                }
            });
        }
    }

    public final com.stripe.android.stripe3ds2.views.i G() {
        return (com.stripe.android.stripe3ds2.views.i) this.fragment.getValue();
    }

    public final o80.b L() {
        return (o80.b) this.viewBinding.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.d M() {
        return (com.stripe.android.stripe3ds2.views.d) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getSupportFragmentManager().v1(new com.stripe.android.stripe3ds2.views.j(K().getUiCustomization(), J(), F(), E(), D(), K().getCresData().getUiType(), K().getIntentData(), f54156s));
        super.onCreate(savedInstanceState);
        getOnBackPressedDispatcher().h(new h());
        getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        setContentView(L().getRoot());
        M().o().observe(this, new n(new i()));
        M().m().observe(this, new n(new j()));
        z();
        n0 n0Var = new n0();
        n0Var.f86529a = "";
        M().k().observe(this, new n(new k(n0Var)));
        if (savedInstanceState == null) {
            M().s(K().getCresData());
        }
        M().p().observe(this, new n(new l(n0Var)));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        B();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        M().r();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        super.onPause();
        M().v(true);
        C();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (M().getShouldRefreshUi()) {
            M().t();
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        M().r();
    }
}
