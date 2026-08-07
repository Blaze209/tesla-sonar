package p022s40;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.model.Image;
import i4.TextStyle;
import java.text.SimpleDateFormat;
import java.util.Locale;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p023w50.Function0;
import v1.g0;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00122\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001ak\u0010#\u001a\u00020\u00032\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010 2\u001c\b\u0002\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010 H\u0001¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"", "allowManualEntry", "Lkotlin/Function0;", "Ljn0/h0;", "onCtaClick", "h", "(ZLwn0/a;Lr2/l;II)V", "onSelectAnotherBank", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "exception", "onEnterDetailsManually", "e", "(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lwn0/a;Lwn0/a;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "c", "(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lwn0/a;Lwn0/a;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "g", "(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lwn0/a;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "onTryAgain", "f", "(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lwn0/a;Lwn0/a;Lwn0/a;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;", "a", "(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lwn0/a;Lwn0/a;Lr2/l;I)V", "iconContent", "", "title", "content", "Lkotlin/Pair;", "primaryCta", "secondaryCta", "b", "(Lwn0/p;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Lr2/l;II)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNumberRetrievalError f109868c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AccountNumberRetrievalError accountNumberRetrievalError) {
            super(2);
            this.f109868c = accountNumberRetrievalError;
        }

        public final void a(p020r2.l lVar, int i11) {
            String str;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1439106829, i11, -1, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent.<anonymous> (ErrorContent.kt:236)");
            }
            Image icon = this.f109868c.getInstitution().getIcon();
            if (icon == null || (str = icon.getDefault()) == null) {
                str = "";
            }
            p022s40.h.a(str, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNumberRetrievalError f109869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109872f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AccountNumberRetrievalError accountNumberRetrievalError, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f109869c = accountNumberRetrievalError;
            this.f109870d = aVar;
            this.f109871e = aVar2;
            this.f109872f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.a(this.f109869c, this.f109870d, this.f109871e, lVar, k2.a(this.f109872f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.common.ErrorContentKt$ErrorContent$1", f = "ErrorContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109873n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f109874o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109874o = view;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f109874o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109873n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f109874o.performHapticFeedback(17);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<String, wn0.a<h0>> f109875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pair<String, wn0.a<h0>> f109876d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements q<g0, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f109877c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(3);
                this.f109877c = str;
            }

            public final void a(g0 FinancialConnectionsButton, p020r2.l lVar, int i11) {
                s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1386379374, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:308)");
                }
                v2.b(this.f109877c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
                a(g0Var, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements q<g0, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f109878c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f109878c = str;
            }

            public final void a(g0 FinancialConnectionsButton, p020r2.l lVar, int i11) {
                s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1468080297, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:318)");
                }
                v2.b(this.f109878c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
                a(g0Var, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Pair<String, ? extends wn0.a<h0>> pair, Pair<String, ? extends wn0.a<h0>> pair2) {
            super(2);
            this.f109875c = pair;
            this.f109876d = pair2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(357436534, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous> (ErrorContent.kt:298)");
            }
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(8));
            Pair<String, wn0.a<h0>> pair = this.f109875c;
            Pair<String, wn0.a<h0>> pair2 = this.f109876d;
            lVar.H(-483455358);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVar, 6);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            lVar.H(447235055);
            if (pair != null) {
                Function0.a(pair.b(), androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w50.f.b.f120923a, null, false, false, z2.c.b(lVar, 1386379374, true, new a(pair.a())), lVar, 1573296, 56);
            }
            lVar.T();
            lVar.H(447248237);
            if (pair2 != null) {
                Function0.a(pair2.b(), androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w50.f.a.f120922a, null, false, false, z2.c.b(lVar, -1468080297, true, new b(pair2.a())), lVar, 1573296, 56);
            }
            lVar.T();
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/x;", "Ljn0/h0;", "a", "(Lw1/x;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<w1.x, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f109879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f109880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f109881e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements q<w1.c, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f109882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
                super(3);
                this.f109882c = pVar;
            }

            public final void a(w1.c item, p020r2.l lVar, int i11) {
                s.k(item, "$this$item");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1491472909, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:280)");
                }
                androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                wn0.p<p020r2.l, Integer, h0> pVar = this.f109882c;
                lVar.H(733328855);
                i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVar, 0);
                lVar.H(-1323940314);
                int iA = p020r2.j.a(lVar, 0);
                x xVarC = lVar.c();
                b4.g.Companion companion = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA = companion.a();
                q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarM);
                if (lVar.w() == null) {
                    p020r2.j.c();
                }
                lVar.h();
                if (lVar.getInserting()) {
                    lVar.z(aVarA);
                } else {
                    lVar.d();
                }
                p020r2.l lVarA = d4.a(lVar);
                d4.b(lVarA, i0VarJ, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                wn0.p<b4.g, Integer, h0> pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
                lVar.H(2058660585);
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVar, 0);
                lVar.T();
                lVar.g();
                lVar.T();
                lVar.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
                a(cVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements q<w1.c, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f109883c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f109883c = str;
            }

            public final void a(w1.c item, p020r2.l lVar, int i11) {
                s.k(item, "$this$item");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1547456032, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:283)");
                }
                p026y50.d dVar = p026y50.d.f125064a;
                TextStyle headingXLarge = dVar.b(lVar, 6).getHeadingXLarge();
                v2.b(this.f109883c, null, dVar.a(lVar, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headingXLarge, lVar, 0, 0, 65530);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
                a(cVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements q<w1.c, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f109884c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(3);
                this.f109884c = str;
            }

            public final void a(w1.c item, p020r2.l lVar, int i11) {
                s.k(item, "$this$item");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(260799369, i11, -1, "com.stripe.android.financialconnections.features.common.ErrorContent.<anonymous>.<anonymous>.<anonymous> (ErrorContent.kt:290)");
                }
                p026y50.d dVar = p026y50.d.f125064a;
                TextStyle bodyMedium = dVar.b(lVar, 6).getBodyMedium();
                v2.b(this.f109884c, null, dVar.a(lVar, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, lVar, 0, 0, 65530);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
                a(cVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(wn0.p<? super p020r2.l, ? super Integer, h0> pVar, String str, String str2) {
            super(1);
            this.f109879c = pVar;
            this.f109880d = str;
            this.f109881e = str2;
        }

        public final void a(w1.x LazyLayout) {
            s.k(LazyLayout, "$this$LazyLayout");
            wn0.p<p020r2.l, Integer, h0> pVar = this.f109879c;
            if (pVar != null) {
                w1.x.e(LazyLayout, null, null, z2.c.c(1491472909, true, new a(pVar)), 3, null);
            }
            w1.x.e(LazyLayout, null, null, z2.c.c(1547456032, true, new b(this.f109880d)), 3, null);
            w1.x.e(LazyLayout, null, null, z2.c.c(260799369, true, new c(this.f109881e)), 3, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w1.x xVar) {
            a(xVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2334f extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f109885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f109886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f109887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Pair<String, wn0.a<h0>> f109888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Pair<String, wn0.a<h0>> f109889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f109890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f109891i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2334f(wn0.p<? super p020r2.l, ? super Integer, h0> pVar, String str, String str2, Pair<String, ? extends wn0.a<h0>> pair, Pair<String, ? extends wn0.a<h0>> pair2, int i11, int i12) {
            super(2);
            this.f109885c = pVar;
            this.f109886d = str;
            this.f109887e = str2;
            this.f109888f = pair;
            this.f109889g = pair2;
            this.f109890h = i11;
            this.f109891i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.b(this.f109885c, this.f109886d, this.f109887e, this.f109888f, this.f109889g, lVar, k2.a(this.f109890h | 1), this.f109891i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionPlannedDowntimeError f109892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InstitutionPlannedDowntimeError institutionPlannedDowntimeError) {
            super(2);
            this.f109892c = institutionPlannedDowntimeError;
        }

        public final void a(p020r2.l lVar, int i11) {
            String str;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(443511827, i11, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent.<anonymous> (ErrorContent.kt:124)");
            }
            Image icon = this.f109892c.getInstitution().getIcon();
            if (icon == null || (str = icon.getDefault()) == null) {
                str = "";
            }
            p022s40.h.a(str, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionPlannedDowntimeError f109893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109896f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InstitutionPlannedDowntimeError institutionPlannedDowntimeError, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f109893c = institutionPlannedDowntimeError;
            this.f109894d = aVar;
            this.f109895e = aVar2;
            this.f109896f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.c(this.f109893c, this.f109894d, this.f109895e, lVar, k2.a(this.f109896f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f109898d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(wn0.a<h0> aVar, int i11) {
            super(2);
            this.f109897c = aVar;
            this.f109898d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.d(this.f109897c, lVar, k2.a(this.f109898d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionUnplannedDowntimeError f109899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError) {
            super(2);
            this.f109899c = institutionUnplannedDowntimeError;
        }

        public final void a(p020r2.l lVar, int i11) {
            String str;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1017903923, i11, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent.<anonymous> (ErrorContent.kt:90)");
            }
            Image icon = this.f109899c.getInstitution().getIcon();
            if (icon == null || (str = icon.getDefault()) == null) {
                str = "";
            }
            p022s40.h.a(str, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionUnplannedDowntimeError f109900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109903f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f109900c = institutionUnplannedDowntimeError;
            this.f109901d = aVar;
            this.f109902e = aVar2;
            this.f109903f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.e(this.f109900c, this.f109901d, this.f109902e, lVar, k2.a(this.f109903f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountLoadError f109904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AccountLoadError accountLoadError) {
            super(2);
            this.f109904c = accountLoadError;
        }

        public final void a(p020r2.l lVar, int i11) {
            String str;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2003844872, i11, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent.<anonymous> (ErrorContent.kt:216)");
            }
            Image icon = this.f109904c.getInstitution().getIcon();
            if (icon == null || (str = icon.getDefault()) == null) {
                str = "";
            }
            p022s40.h.a(str, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class m extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountLoadError f109905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f109909g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(AccountLoadError accountLoadError, wn0.a<h0> aVar, wn0.a<h0> aVar2, wn0.a<h0> aVar3, int i11) {
            super(2);
            this.f109905c = accountLoadError;
            this.f109906d = aVar;
            this.f109907e = aVar2;
            this.f109908f = aVar3;
            this.f109909g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.f(this.f109905c, this.f109906d, this.f109907e, this.f109908f, lVar, k2.a(this.f109909g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNoneEligibleForPaymentMethodError f109910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError) {
            super(2);
            this.f109910c = accountNoneEligibleForPaymentMethodError;
        }

        public final void a(p020r2.l lVar, int i11) {
            String str;
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-919686847, i11, -1, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent.<anonymous> (ErrorContent.kt:156)");
            }
            Image icon = this.f109910c.getInstitution().getIcon();
            if (icon == null || (str = icon.getDefault()) == null) {
                str = "";
            }
            p022s40.h.a(str, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountNoneEligibleForPaymentMethodError f109911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109913e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f109911c = accountNoneEligibleForPaymentMethodError;
            this.f109912d = aVar;
            this.f109913e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.g(this.f109911c, this.f109912d, lVar, k2.a(this.f109913e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f109914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109917f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(boolean z11, wn0.a<h0> aVar, int i11, int i12) {
            super(2);
            this.f109914c = z11;
            this.f109915d = aVar;
            this.f109916e = i11;
            this.f109917f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.h(this.f109914c, this.f109915d, lVar, k2.a(this.f109916e | 1), this.f109917f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(AccountNumberRetrievalError exception, wn0.a<h0> onSelectAnotherBank, wn0.a<h0> onEnterDetailsManually, p020r2.l lVar, int i11) {
        int i12;
        int i13;
        s.k(exception, "exception");
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        s.k(onEnterDetailsManually, "onEnterDetailsManually");
        p020r2.l lVarV = lVar.v(1714910993);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(exception) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1714910993, i12, -1, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent (ErrorContent.kt:233)");
            }
            z2.a aVarB = z2.c.b(lVarV, -1439106829, true, new a(exception));
            String strC = e4.i.c(i40.k.f75868j, lVarV, 0);
            boolean showManualEntry = exception.getShowManualEntry();
            if (showManualEntry) {
                i13 = i40.k.f75866i;
            } else {
                if (showManualEntry) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = i40.k.f75864h;
            }
            String strC2 = e4.i.c(i13, lVarV, 0);
            Pair pair = new Pair(e4.i.c(i40.k.f75880p, lVarV, 0), onSelectAnotherBank);
            lVarV.H(1375130891);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(e4.i.c(i40.k.f75876n, lVarV, 0), onEnterDetailsManually) : null;
            lVarV.T();
            b(aVarB, strC, strC2, pair, pair2, lVarV, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(exception, onSelectAnotherBank, onEnterDetailsManually, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:94:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(wn0.p<? super p020r2.l, ? super Integer, h0> pVar, String title, String content, Pair<String, ? extends wn0.a<h0>> pair, Pair<String, ? extends wn0.a<h0>> pair2, p020r2.l lVar, int i11, int i12) {
        int i13;
        Pair<String, ? extends wn0.a<h0>> pair3;
        int i14;
        Pair<String, ? extends wn0.a<h0>> pair4;
        int i15;
        Pair<String, ? extends wn0.a<h0>> pair5;
        Pair<String, ? extends wn0.a<h0>> pair6;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objI;
        p020r2.l lVar2;
        Pair<String, ? extends wn0.a<h0>> pair7;
        Pair<String, ? extends wn0.a<h0>> pair8;
        w2 w2VarX;
        s.k(title, "title");
        s.k(content, "content");
        p020r2.l lVarV = lVar.v(-1451870359);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(title) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.n(content) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 == 0) {
            if ((i11 & 7168) == 0) {
                pair3 = pair;
                i13 |= lVarV.n(pair3) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    pair4 = pair2;
                    if (lVarV.n(pair4)) {
                        i15 = 16384;
                    } else {
                        i15 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i15;
                }
                if ((46811 & i13) == 9362 || !lVarV.b()) {
                    if (i16 != 0) {
                        pair5 = null;
                    } else {
                        pair5 = pair3;
                    }
                    if (i14 != 0) {
                        pair6 = null;
                    } else {
                        pair6 = pair4;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
                    }
                    p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
                    v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(16));
                    z2.a aVarB = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
                    lVarV.H(-1418132229);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i13 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12 | ((i13 & 896) == 256);
                    objI = lVarV.I();
                    if (z13 || objI == p020r2.l.INSTANCE.a()) {
                        objI = new e(pVar, title, content);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    Pair<String, ? extends wn0.a<h0>> pair9 = pair5;
                    Pair<String, ? extends wn0.a<h0>> pair10 = pair6;
                    lVar2 = lVarV;
                    p026y50.f.d(null, null, false, false, false, fVarN, false, null, aVarB, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pair7 = pair9;
                    pair8 = pair10;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    pair7 = pair3;
                    pair8 = pair4;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new C2334f(pVar, title, content, pair7, pair8, i11, i12));
                }
            }
            i13 |= 24576;
            pair4 = pair2;
            if ((46811 & i13) == 9362) {
                if (i16 != 0) {
                    pair5 = null;
                } else {
                    pair5 = pair3;
                }
                if (i14 != 0) {
                    pair6 = null;
                } else {
                    pair6 = pair4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
                }
                p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
                v1.b.f fVarN2 = v1.b.f117444a.n(w4.h.g(16));
                z2.a aVarB2 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
                lVarV.H(-1418132229);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12 | ((i13 & 896) == 256);
                objI = lVarV.I();
                if (z13) {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                } else {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                }
                lVarV.T();
                Pair<String, ? extends wn0.a<h0>> pair11 = pair5;
                Pair<String, ? extends wn0.a<h0>> pair12 = pair6;
                lVar2 = lVarV;
                p026y50.f.d(null, null, false, false, false, fVarN2, false, null, aVarB2, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pair7 = pair11;
                pair8 = pair12;
            } else {
                if (i16 != 0) {
                    pair5 = null;
                } else {
                    pair5 = pair3;
                }
                if (i14 != 0) {
                    pair6 = null;
                } else {
                    pair6 = pair4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
                }
                p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
                v1.b.f fVarN3 = v1.b.f117444a.n(w4.h.g(16));
                z2.a aVarB3 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
                lVarV.H(-1418132229);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12 | ((i13 & 896) == 256);
                objI = lVarV.I();
                if (z13) {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                } else {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                }
                lVarV.T();
                Pair<String, ? extends wn0.a<h0>> pair13 = pair5;
                Pair<String, ? extends wn0.a<h0>> pair14 = pair6;
                lVar2 = lVarV;
                p026y50.f.d(null, null, false, false, false, fVarN3, false, null, aVarB3, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pair7 = pair13;
                pair8 = pair14;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new C2334f(pVar, title, content, pair7, pair8, i11, i12));
            }
        }
        i13 |= 3072;
        pair3 = pair;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                pair4 = pair2;
                if (lVarV.n(pair4)) {
                    i15 = 16384;
                } else {
                    i15 = PKIFailureInfo.certRevoked;
                }
                i13 |= i15;
            }
            if ((46811 & i13) == 9362) {
                if (i16 != 0) {
                    pair5 = null;
                } else {
                    pair5 = pair3;
                }
                if (i14 != 0) {
                    pair6 = null;
                } else {
                    pair6 = pair4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
                }
                p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
                v1.b.f fVarN4 = v1.b.f117444a.n(w4.h.g(16));
                z2.a aVarB4 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
                lVarV.H(-1418132229);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12 | ((i13 & 896) == 256);
                objI = lVarV.I();
                if (z13) {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                } else {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                }
                lVarV.T();
                Pair<String, ? extends wn0.a<h0>> pair15 = pair5;
                Pair<String, ? extends wn0.a<h0>> pair16 = pair6;
                lVar2 = lVarV;
                p026y50.f.d(null, null, false, false, false, fVarN4, false, null, aVarB4, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pair7 = pair15;
                pair8 = pair16;
            } else {
                if (i16 != 0) {
                    pair5 = null;
                } else {
                    pair5 = pair3;
                }
                if (i14 != 0) {
                    pair6 = null;
                } else {
                    pair6 = pair4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
                }
                p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
                v1.b.f fVarN5 = v1.b.f117444a.n(w4.h.g(16));
                z2.a aVarB5 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
                lVarV.H(-1418132229);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12 | ((i13 & 896) == 256);
                objI = lVarV.I();
                if (z13) {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                } else {
                    objI = new e(pVar, title, content);
                    lVarV.B(objI);
                }
                lVarV.T();
                Pair<String, ? extends wn0.a<h0>> pair17 = pair5;
                Pair<String, ? extends wn0.a<h0>> pair18 = pair6;
                lVar2 = lVarV;
                p026y50.f.d(null, null, false, false, false, fVarN5, false, null, aVarB5, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pair7 = pair17;
                pair8 = pair18;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new C2334f(pVar, title, content, pair7, pair8, i11, i12));
            }
        }
        i13 |= 24576;
        pair4 = pair2;
        if ((46811 & i13) == 9362) {
            if (i16 != 0) {
                pair5 = null;
            } else {
                pair5 = pair3;
            }
            if (i14 != 0) {
                pair6 = null;
            } else {
                pair6 = pair4;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
            }
            p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
            v1.b.f fVarN6 = v1.b.f117444a.n(w4.h.g(16));
            z2.a aVarB6 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
            lVarV.H(-1418132229);
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i13 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12 | ((i13 & 896) == 256);
            objI = lVarV.I();
            if (z13) {
                objI = new e(pVar, title, content);
                lVarV.B(objI);
            } else {
                objI = new e(pVar, title, content);
                lVarV.B(objI);
            }
            lVarV.T();
            Pair<String, ? extends wn0.a<h0>> pair19 = pair5;
            Pair<String, ? extends wn0.a<h0>> pair110 = pair6;
            lVar2 = lVarV;
            p026y50.f.d(null, null, false, false, false, fVarN6, false, null, aVarB6, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pair7 = pair19;
            pair8 = pair110;
        } else {
            if (i16 != 0) {
                pair5 = null;
            } else {
                pair5 = pair3;
            }
            if (i14 != 0) {
                pair6 = null;
            } else {
                pair6 = pair4;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1451870359, i13, -1, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:269)");
            }
            p020r2.Function0.g(h0.f84049a, new c((View) lVarV.U(AndroidCompositionLocals_androidKt.k()), null), lVarV, 70);
            v1.b.f fVarN7 = v1.b.f117444a.n(w4.h.g(16));
            z2.a aVarB7 = z2.c.b(lVarV, 357436534, true, new d(pair6, pair5));
            lVarV.H(-1418132229);
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i13 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12 | ((i13 & 896) == 256);
            objI = lVarV.I();
            if (z13) {
                objI = new e(pVar, title, content);
                lVarV.B(objI);
            } else {
                objI = new e(pVar, title, content);
                lVarV.B(objI);
            }
            lVarV.T();
            Pair<String, ? extends wn0.a<h0>> pair111 = pair5;
            Pair<String, ? extends wn0.a<h0>> pair112 = pair6;
            lVar2 = lVarV;
            p026y50.f.d(null, null, false, false, false, fVarN7, false, null, aVarB7, (wn0.l) objI, lVar2, 100859904, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pair7 = pair111;
            pair8 = pair112;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new C2334f(pVar, title, content, pair7, pair8, i11, i12));
        }
    }

    public static final void c(InstitutionPlannedDowntimeError exception, wn0.a<h0> onSelectAnotherBank, wn0.a<h0> onEnterDetailsManually, p020r2.l lVar, int i11) {
        int i12;
        s.k(exception, "exception");
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        s.k(onEnterDetailsManually, "onEnterDetailsManually");
        p020r2.l lVarV = lVar.v(118813745);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(exception) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(118813745, i12, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent (ErrorContent.kt:117)");
            }
            lVarV.H(1764458787);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new Locale(p4.d.INSTANCE.a().a());
                lVarV.B(objI);
            }
            Locale locale = (Locale) objI;
            lVarV.T();
            long backUpAt = exception.getBackUpAt();
            lVarV.H(1764461349);
            boolean zS = lVarV.s(backUpAt);
            Object objI2 = lVarV.I();
            if (zS || objI2 == companion.a()) {
                objI2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale).format(Long.valueOf(exception.getBackUpAt()));
                lVarV.B(objI2);
            }
            String str = (String) objI2;
            lVarV.T();
            z2.a aVarB = z2.c.b(lVarV, 443511827, true, new g(exception));
            String strD = e4.i.d(i40.k.f75888t, new Object[]{exception.getInstitution().getName()}, lVarV, 64);
            int i13 = i40.k.f75886s;
            s.h(str);
            String strD2 = e4.i.d(i13, new Object[]{str}, lVarV, 64);
            Pair pair = new Pair(e4.i.c(i40.k.f75880p, lVarV, 0), onSelectAnotherBank);
            lVarV.H(1764483784);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(e4.i.c(i40.k.f75876n, lVarV, 0), onEnterDetailsManually) : null;
            lVarV.T();
            b(aVarB, strD, strD2, pair, pair2, lVarV, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new h(exception, onSelectAnotherBank, onEnterDetailsManually, i11));
        }
    }

    public static final void d(wn0.a<h0> onSelectAnotherBank, p020r2.l lVar, int i11) {
        int i12;
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        p020r2.l lVarV = lVar.v(517513307);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.K(onSelectAnotherBank) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(517513307, i12, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnknownErrorContent (ErrorContent.kt:65)");
            }
            b(p022s40.c.f109816a.b(), e4.i.c(i40.k.f75884r, lVarV, 0), e4.i.c(i40.k.f75890u, lVarV, 0), new Pair(e4.i.c(i40.k.f75880p, lVarV, 0), onSelectAnotherBank), null, lVarV, 6, 16);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new i(onSelectAnotherBank, i11));
        }
    }

    public static final void e(InstitutionUnplannedDowntimeError exception, wn0.a<h0> onSelectAnotherBank, wn0.a<h0> onEnterDetailsManually, p020r2.l lVar, int i11) {
        int i12;
        s.k(exception, "exception");
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        s.k(onEnterDetailsManually, "onEnterDetailsManually");
        p020r2.l lVarV = lVar.v(1547189329);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(exception) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1547189329, i12, -1, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent (ErrorContent.kt:87)");
            }
            z2.a aVarB = z2.c.b(lVarV, 1017903923, true, new j(exception));
            String strD = e4.i.d(i40.k.f75891v, new Object[]{exception.getInstitution().getName()}, lVarV, 64);
            String strC = e4.i.c(i40.k.f75890u, lVarV, 0);
            Pair pair = new Pair(e4.i.c(i40.k.f75880p, lVarV, 0), onSelectAnotherBank);
            lVarV.H(604419567);
            Pair pair2 = exception.getShowManualEntry() ? new Pair(e4.i.c(i40.k.f75876n, lVarV, 0), onEnterDetailsManually) : null;
            lVarV.T();
            b(aVarB, strD, strC, pair, pair2, lVarV, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new k(exception, onSelectAnotherBank, onEnterDetailsManually, i11));
        }
    }

    public static final void f(AccountLoadError exception, wn0.a<h0> onSelectAnotherBank, wn0.a<h0> onEnterDetailsManually, wn0.a<h0> onTryAgain, p020r2.l lVar, int i11) {
        int i12;
        Pair pair;
        int i13;
        s.k(exception, "exception");
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        s.k(onEnterDetailsManually, "onEnterDetailsManually");
        s.k(onTryAgain, "onTryAgain");
        p020r2.l lVarV = lVar.v(-162660842);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(exception) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(onEnterDetailsManually) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(onTryAgain) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-162660842, i12, -1, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent (ErrorContent.kt:182)");
            }
            boolean showManualEntry = exception.getShowManualEntry();
            boolean canRetry = exception.getCanRetry();
            lVarV.H(689648952);
            boolean zP = lVarV.p(showManualEntry) | lVarV.p(canRetry);
            Object objI = lVarV.I();
            if (zP || objI == p020r2.l.INSTANCE.a()) {
                if (exception.getCanRetry()) {
                    pair = new Pair(jn0.x.a(Integer.valueOf(i40.k.f75878o), onTryAgain), jn0.x.a(Integer.valueOf(i40.k.f75880p), onSelectAnotherBank));
                } else {
                    pair = exception.getShowManualEntry() ? new Pair(jn0.x.a(Integer.valueOf(i40.k.f75876n), onEnterDetailsManually), jn0.x.a(Integer.valueOf(i40.k.f75880p), onSelectAnotherBank)) : new Pair(jn0.x.a(Integer.valueOf(i40.k.f75880p), onSelectAnotherBank), null);
                }
                objI = pair;
                lVarV.B(objI);
            }
            Pair pair2 = (Pair) objI;
            lVarV.T();
            Pair pair3 = (Pair) pair2.a();
            Pair pair4 = (Pair) pair2.b();
            boolean showManualEntry2 = exception.getShowManualEntry();
            boolean canRetry2 = exception.getCanRetry();
            lVarV.H(689673904);
            boolean zP2 = lVarV.p(showManualEntry2) | lVarV.p(canRetry2);
            Object objI2 = lVarV.I();
            if (zP2 || objI2 == p020r2.l.INSTANCE.a()) {
                if (exception.getCanRetry()) {
                    i13 = i40.k.f75862g;
                } else {
                    i13 = exception.getShowManualEntry() ? i40.k.f75858e : i40.k.f75860f;
                }
                objI2 = Integer.valueOf(i13);
                lVarV.B(objI2);
            }
            int iIntValue = ((Number) objI2).intValue();
            lVarV.T();
            z2.a aVarB = z2.c.b(lVarV, -2003844872, true, new l(exception));
            String strD = e4.i.d(i40.k.f75850a, new Object[]{exception.getInstitution().getName()}, lVarV, 64);
            String strC = e4.i.c(iIntValue, lVarV, 0);
            Pair pairA = jn0.x.a(e4.i.c(((Number) pair3.e()).intValue(), lVarV, 0), pair3.f());
            lVarV.H(689698623);
            Pair pairA2 = pair4 != null ? jn0.x.a(e4.i.c(((Number) pair4.e()).intValue(), lVarV, 0), pair4.f()) : null;
            lVarV.T();
            b(aVarB, strD, strC, pairA, pairA2, lVarV, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new m(exception, onSelectAnotherBank, onEnterDetailsManually, onTryAgain, i11));
        }
    }

    public static final void g(AccountNoneEligibleForPaymentMethodError exception, wn0.a<h0> onSelectAnotherBank, p020r2.l lVar, int i11) {
        int i12;
        s.k(exception, "exception");
        s.k(onSelectAnotherBank, "onSelectAnotherBank");
        p020r2.l lVarV = lVar.v(-1621855517);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(exception) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onSelectAnotherBank) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1621855517, i12, -1, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent (ErrorContent.kt:153)");
            }
            b(z2.c.b(lVarV, -919686847, true, new n(exception)), e4.i.c(i40.k.f75852b, lVarV, 0), e4.i.b(i40.j.f75846b, exception.getAccountsCount(), new Object[]{String.valueOf(exception.getAccountsCount()), exception.getInstitution().getName(), exception.getMerchantName()}, lVarV, 512), new Pair(e4.i.c(i40.k.f75880p, lVarV, 0), onSelectAnotherBank), null, lVarV, 24582, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new o(exception, onSelectAnotherBank, i11));
        }
    }

    public static final void h(boolean z11, wn0.a<h0> onCtaClick, p020r2.l lVar, int i11, int i12) {
        int i13;
        s.k(onCtaClick, "onCtaClick");
        p020r2.l lVarV = lVar.v(-406772431);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.K(onCtaClick) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                z11 = false;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-406772431, i13, -1, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContent (ErrorContent.kt:43)");
            }
            b(p022s40.c.f109816a.a(), e4.i.c(i40.k.f75884r, lVarV, 0), e4.i.c(i40.k.f75882q, lVarV, 0), new Pair(e4.i.c(z11 ? i40.k.f75876n : i40.k.f75874m, lVarV, 0), onCtaClick), null, lVarV, 6, 16);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new p(z11, onCtaClick, i11, i12));
        }
    }
}
