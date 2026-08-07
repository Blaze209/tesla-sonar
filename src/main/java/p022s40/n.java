package p022s40;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.s2;
import androidx.compose.ui.platform.x2;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.model.TextUpdate;
import expo.modules.interfaces.permissions.PermissionsResponse;
import g4.y;
import i4.TextStyle;
import i50.SharedPartnerAuthState;
import java.util.List;
import jn0.h0;
import k3.h1;
import k3.r1;
import kotlinx.coroutines.CoroutineScope;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.f0;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import p023w50.Function0;
import s50.FinancialConnectionsSheetNativeState;
import v1.e0;
import v1.g0;
import w1.x;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aq\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aO\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a]\u0010 \u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b \u0010!\u001a\u0017\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b$\u0010%\u001aA\u0010(\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010'\u001a\u00020\u001eH\u0003¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0007H\u0003¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Li50/e;", "state", "Lkotlin/Function0;", "Ljn0/h0;", "onContinueClick", "onCancelClick", "Lkotlin/Function1;", "", "onClickableTextClick", "Ls50/j;", "onWebAuthFlowFinished", "onViewEffectLaunched", "", "inModal", "g", "(Li50/e;Lwn0/a;Lwn0/a;Lwn0/l;Lwn0/l;Lwn0/a;ZLr2/l;I)V", IntegerTokenConverter.CONVERTER_KEY, "(Li50/e;ZLwn0/l;Lwn0/a;Lwn0/a;Lr2/l;I)V", "j", "(ZLr2/l;I)V", "h", "(Li50/e;ZLwn0/a;Lwn0/a;Lwn0/l;Lr2/l;I)V", "showInModal", "Ls50/a;", "Li50/e$a;", "authenticationStatus", "Li50/e$c;", StatusResponse.PAYLOAD, "b", "(ZLs50/a;Li50/e$c;Lwn0/a;Lwn0/a;Lwn0/l;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/model/b0;", "content", "c", "(ZLcom/stripe/android/financialconnections/model/b0;Ls50/a;Lwn0/a;Lwn0/a;Lwn0/l;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/model/o$b;", "bodyItem", "f", "(Lcom/stripe/android/financialconnections/model/o$b;Lr2/l;I)V", PermissionsResponse.STATUS_KEY, "oAuthPrepane", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;Lwn0/a;Ls50/a;Lcom/stripe/android/financialconnections/model/b0;Lr2/l;I)V", "Landroidx/compose/ui/d;", "modifier", "e", "(Lcom/stripe/android/financialconnections/model/b0;Landroidx/compose/ui/d;Lr2/l;II)V", "gifUrl", "a", "(Landroidx/compose/ui/d;Ljava/lang/String;Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroid/webkit/WebView;", "a", "(Landroid/content/Context;)Landroid/webkit/WebView;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Context, WebView> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f110053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f110054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f110055e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, boolean z11, String str) {
            super(1);
            this.f110053c = i11;
            this.f110054d = z11;
            this.f110055e = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke(Context it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            WebView webView = new WebView(it);
            int i11 = this.f110053c;
            boolean z11 = this.f110054d;
            String str = this.f110055e;
            webView.setBackgroundColor(i11);
            webView.setAlpha(0.99f);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (!z11) {
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setVerticalFadingEdgeEnabled(false);
            }
            webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            return webView;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/webkit/WebView;", "it", "Ljn0/h0;", "a", "(Landroid/webkit/WebView;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<WebView, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f110056c = str;
        }

        public final void a(WebView it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            it.loadDataWithBaseURL(null, this.f110056c, "text/html", "UTF-8", null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(WebView webView) {
            a(webView);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f110057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f110058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f110059e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.d dVar, String str, int i11) {
            super(2);
            this.f110057c = dVar;
            this.f110058d = str;
            this.f110059e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.a(this.f110057c, this.f110058d, lVar, k2.a(this.f110059e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s50.a<SharedPartnerAuthState.AuthenticationStatus> f110061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SharedPartnerAuthState.Payload f110062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110065h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f110066i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z11, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar, SharedPartnerAuthState.Payload payload, wn0.a<h0> aVar2, wn0.a<h0> aVar3, wn0.l<? super String, h0> lVar, int i11) {
            super(2);
            this.f110060c = z11;
            this.f110061d = aVar;
            this.f110062e = payload;
            this.f110063f = aVar2;
            this.f110064g = aVar3;
            this.f110065h = lVar;
            this.f110066i = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.b(this.f110060c, this.f110061d, this.f110062e, this.f110063f, this.f110064g, this.f110065h, lVar, k2.a(this.f110066i | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s50.a<SharedPartnerAuthState.AuthenticationStatus> f110069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110070f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(wn0.a<h0> aVar, wn0.a<h0> aVar2, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar3, OauthPrepane oauthPrepane) {
            super(2);
            this.f110067c = aVar;
            this.f110068d = aVar2;
            this.f110069e = aVar3;
            this.f110070f = oauthPrepane;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1357248084, i11, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent.<anonymous> (SharedPartnerAuth.kt:278)");
            }
            n.d(this.f110067c, this.f110068d, this.f110069e, this.f110070f, lVar, 4096);
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
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<x, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110072d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ OauthPrepane f110073c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OauthPrepane oauthPrepane) {
                super(3);
                this.f110073c = oauthPrepane;
            }

            public final void a(w1.c item, p020r2.l lVar, int i11) {
                p013kotlin.jvm.internal.s.k(item, "$this$item");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1628076586, i11, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent.<anonymous>.<anonymous> (SharedPartnerAuth.kt:259)");
                }
                n.e(this.f110073c, androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, w4.h.g(24), BitmapDescriptorFactory.HUE_RED, 2, null), lVar, 56, 0);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
        public static final class b extends p013kotlin.jvm.internal.u implements wn0.l {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f110074c = new b();

            public b() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Void invoke(com.stripe.android.financialconnections.model.o oVar) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l f110075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List f110076d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wn0.l lVar, List list) {
                super(1);
                this.f110075c = lVar;
                this.f110076d = list;
            }

            public final Object a(int i11) {
                return this.f110075c.invoke(this.f110076d.get(i11));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        public static final class d extends p013kotlin.jvm.internal.u implements wn0.r<w1.c, Integer, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f110077c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l f110078d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(List list, wn0.l lVar) {
                super(4);
                this.f110077c = list;
                this.f110078d = lVar;
            }

            public final void a(w1.c items, int i11, p020r2.l lVar, int i12) {
                int i13;
                p013kotlin.jvm.internal.s.k(items, "$this$items");
                if ((i12 & 14) == 0) {
                    i13 = (lVar.n(items) ? 4 : 2) | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    i13 |= lVar.r(i11) ? 32 : 16;
                }
                if ((i13 & 731) == 146 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                }
                com.stripe.android.financialconnections.model.o oVar = (com.stripe.android.financialconnections.model.o) this.f110077c.get(i11);
                lVar.H(265463762);
                if (oVar instanceof com.stripe.android.financialconnections.model.o.Image) {
                    lVar.H(2086774691);
                    n.f((com.stripe.android.financialconnections.model.o.Image) oVar, lVar, 0);
                    lVar.T();
                } else if (oVar instanceof com.stripe.android.financialconnections.model.o.Text) {
                    lVar.H(265575640);
                    p023w50.n.a(new v50.g.Text(x50.b.a(((com.stripe.android.financialconnections.model.o.Text) oVar).getContent())), this.f110078d, p026y50.d.f125064a.b(lVar, 6).getBodyMedium(), androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, w4.h.g(24), BitmapDescriptorFactory.HUE_RED, 2, null), null, 0, 0, lVar, 3080, 112);
                    lVar.T();
                } else {
                    lVar.H(265898133);
                    lVar.T();
                }
                lVar.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.r
            public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, Integer num, p020r2.l lVar, Integer num2) {
                a(cVar, num.intValue(), lVar, num2.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(OauthPrepane oauthPrepane, wn0.l<? super String, h0> lVar) {
            super(1);
            this.f110071c = oauthPrepane;
            this.f110072d = lVar;
        }

        public final void a(x LazyLayout) {
            p013kotlin.jvm.internal.s.k(LazyLayout, "$this$LazyLayout");
            x.e(LazyLayout, null, null, z2.c.c(-1628076586, true, new a(this.f110071c)), 3, null);
            List<com.stripe.android.financialconnections.model.o> listB = this.f110071c.getBody().b();
            wn0.l<String, h0> lVar = this.f110072d;
            LazyLayout.d(listB.size(), null, new c(b.f110074c, listB), z2.c.c(-632812321, true, new d(listB, lVar)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(x xVar) {
            a(xVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s50.a<SharedPartnerAuthState.AuthenticationStatus> f110081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f110085i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z11, OauthPrepane oauthPrepane, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar, wn0.a<h0> aVar2, wn0.a<h0> aVar3, wn0.l<? super String, h0> lVar, int i11) {
            super(2);
            this.f110079c = z11;
            this.f110080d = oauthPrepane;
            this.f110081e = aVar;
            this.f110082f = aVar2;
            this.f110083g = aVar3;
            this.f110084h = lVar;
            this.f110085i = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.c(this.f110079c, this.f110080d, this.f110081e, this.f110082f, this.f110083g, this.f110084h, lVar, k2.a(this.f110085i | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f110086c = new h();

        h() {
            super(1);
        }

        public final void a(y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            g4.w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110087c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(OauthPrepane oauthPrepane) {
            super(3);
            this.f110087c = oauthPrepane;
        }

        public final void a(g0 FinancialConnectionsButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(609372779, i11, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter.<anonymous>.<anonymous> (SharedPartnerAuth.kt:370)");
            }
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            OauthPrepane oauthPrepane = this.f110087c;
            lVar.H(693286680);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVar, 48);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
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
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            v2.b(oauthPrepane.getCta().getText(), null, 0L, 0L, null, null, null, 0L, null, t4.j.h(t4.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 130558);
            Image icon = oauthPrepane.getCta().getIcon();
            String str = icon != null ? icon.getDefault() : null;
            lVar.H(1446050053);
            if (str != null) {
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(12)), lVar, 6);
                com.stripe.android.uicore.image.a.a(str, (o90.f) lVar.U(v50.b.d()), null, androidx.compose.foundation.layout.x.q(companion, w4.h.g(16)), null, null, null, null, false, p022s40.e.f109863a.a(), null, lVar, (o90.f.f96995g << 3) | 805309824, 0, 1520);
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

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f110088c = new j();

        j() {
            super(1);
        }

        public final void a(y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            g4.w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s50.a<SharedPartnerAuthState.AuthenticationStatus> f110091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f110093g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(wn0.a<h0> aVar, wn0.a<h0> aVar2, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar3, OauthPrepane oauthPrepane, int i11) {
            super(2);
            this.f110089c = aVar;
            this.f110090d = aVar2;
            this.f110091e = aVar3;
            this.f110092f = oauthPrepane;
            this.f110093g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.d(this.f110089c, this.f110090d, this.f110091e, this.f110092f, lVar, k2.a(this.f110093g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f110094c = new l();

        l() {
            super(1);
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.l<String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f110095c = new m();

        m() {
            super(1);
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.n$n, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2336n extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OauthPrepane f110096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f110097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f110098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f110099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2336n(OauthPrepane oauthPrepane, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f110096c = oauthPrepane;
            this.f110097d = dVar;
            this.f110098e = i11;
            this.f110099f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.e(this.f110096c, this.f110097d, lVar, k2.a(this.f110098e | 1), this.f110099f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.model.o.Image f110100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f110101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(com.stripe.android.financialconnections.model.o.Image image, int i11) {
            super(2);
            this.f110100c = image;
            this.f110101d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.f(this.f110100c, lVar, k2.a(this.f110101d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$1$1", f = "SharedPartnerAuth.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110102n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<s50.j, h0> f110103o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y3<s50.j> f110104p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(wn0.l<? super s50.j, h0> lVar, y3<? extends s50.j> y3Var, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f110103o = lVar;
            this.f110104p = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new p(this.f110103o, this.f110104p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110102n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f110103o.invoke(this.f110104p.getValue());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$2$1", f = "SharedPartnerAuth.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110105n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ SharedPartnerAuthState.d f110106o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ x2 f110107p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s50.f f110108q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110109r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(SharedPartnerAuthState.d dVar, x2 x2Var, s50.f fVar, wn0.a<h0> aVar, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f110106o = dVar;
            this.f110107p = x2Var;
            this.f110108q = fVar;
            this.f110109r = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new q(this.f110106o, this.f110107p, this.f110108q, this.f110109r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110105n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            SharedPartnerAuthState.d dVar = this.f110106o;
            if (dVar instanceof SharedPartnerAuthState.d.OpenUrl) {
                this.f110107p.a(((SharedPartnerAuthState.d.OpenUrl) dVar).getUrl());
            } else if (dVar instanceof SharedPartnerAuthState.d.OpenPartnerAuth) {
                this.f110108q.d0(((SharedPartnerAuthState.d.OpenPartnerAuth) dVar).getUrl());
            }
            this.f110109r.invoke();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class r extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SharedPartnerAuthState f110110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<s50.j, h0> f110114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110115h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f110116i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f110117j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(SharedPartnerAuthState sharedPartnerAuthState, wn0.a<h0> aVar, wn0.a<h0> aVar2, wn0.l<? super String, h0> lVar, wn0.l<? super s50.j, h0> lVar2, wn0.a<h0> aVar3, boolean z11, int i11) {
            super(2);
            this.f110110c = sharedPartnerAuthState;
            this.f110111d = aVar;
            this.f110112e = aVar2;
            this.f110113f = lVar;
            this.f110114g = lVar2;
            this.f110115h = aVar3;
            this.f110116i = z11;
            this.f110117j = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.g(this.f110110c, this.f110111d, this.f110112e, this.f110113f, this.f110114g, this.f110115h, this.f110116i, lVar, k2.a(this.f110117j | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class t extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SharedPartnerAuthState f110119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f110120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f110124h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(SharedPartnerAuthState sharedPartnerAuthState, boolean z11, wn0.a<h0> aVar, wn0.a<h0> aVar2, wn0.l<? super String, h0> lVar, int i11) {
            super(2);
            this.f110119c = sharedPartnerAuthState;
            this.f110120d = z11;
            this.f110121e = aVar;
            this.f110122f = aVar2;
            this.f110123g = lVar;
            this.f110124h = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.h(this.f110119c, this.f110120d, this.f110121e, this.f110122f, this.f110123g, lVar, k2.a(this.f110124h | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class u extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SharedPartnerAuthState f110125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f110126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f110127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f110129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f110130h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(SharedPartnerAuthState sharedPartnerAuthState, boolean z11, wn0.l<? super String, h0> lVar, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f110125c = sharedPartnerAuthState;
            this.f110126d = z11;
            this.f110127e = lVar;
            this.f110128f = aVar;
            this.f110129g = aVar2;
            this.f110130h = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.i(this.f110125c, this.f110126d, this.f110127e, this.f110128f, this.f110129g, lVar, k2.a(this.f110130h | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "shimmerBrush", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.q<h1, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(boolean z11) {
            super(3);
            this.f110131c = z11;
        }

        public final void a(h1 shimmerBrush, p020r2.l lVar, int i11) {
            int i12;
            float f11;
            int i13;
            int i14;
            int i15;
            p013kotlin.jvm.internal.s.k(shimmerBrush, "shimmerBrush");
            if ((i11 & 14) == 0) {
                i12 = i11 | (lVar.n(shimmerBrush) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-644126576, i12, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerLoading.<anonymous> (SharedPartnerAuth.kt:128)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f12 = 24;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(companion, w4.h.g(f12), BitmapDescriptorFactory.HUE_RED, 2, null);
            boolean z11 = this.f110131c;
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarK);
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
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVar, 6);
            float f13 = 56;
            float f14 = 8;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f13)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, 0);
            float f15 = 16;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f15)), lVar, 6);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(32)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f15)), lVar, 6);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(f15)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f14)), lVar, 6);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.g(companion, 0.5f), w4.h.g(f15)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, 0);
            if (z11) {
                lVar.H(1921528449);
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f15)), lVar, 6);
                lVar.T();
                i14 = 1;
                i15 = 0;
                i13 = 6;
                f11 = f13;
            } else {
                lVar.H(1921606724);
                f11 = f13;
                i13 = 6;
                i14 = 1;
                i15 = 0;
                v1.i0.a(v1.i.b(jVar, companion, 1.0f, false, 2, null), lVar, 0);
                lVar.T();
            }
            int i16 = i15;
            int i17 = i13;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, i14, null), w4.h.g(f11)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, i16);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f15)), lVar, i17);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, i14, null), w4.h.g(f11)), shimmerBrush, a2.g.c(w4.h.g(f14)), BitmapDescriptorFactory.HUE_RED, 4, null), lVar, i16);
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVar, i17);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class w extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f110133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z11, int i11) {
            super(2);
            this.f110132c = z11;
            this.f110133d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            n.j(this.f110132c, lVar, k2.a(this.f110133d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.compose.ui.d dVar, String str, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(1283678679);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.n(str) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1283678679, i12, -1, "com.stripe.android.financialconnections.features.common.GifWebView (SharedPartnerAuth.kt:441)");
            }
            boolean zBooleanValue = ((Boolean) lVarV.U(p1.a())).booleanValue();
            lVarV.H(407225558);
            boolean z11 = (i12 & 112) == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<html><head><style>img{width:100%; height:auto;}</style></head>");
                sb2.append("<body style=\"margin: 0; padding: 0\">");
                sb2.append("<img src=\"" + str + "\" style=\"width:100%;height:auto;\" />");
                sb2.append("</body></html>");
                objI = sb2.toString();
                p013kotlin.jvm.internal.s.j(objI, "toString(...)");
                lVarV.B(objI);
            }
            String str2 = (String) objI;
            lVarV.T();
            int iK = r1.k(p026y50.d.f125064a.a(lVarV, 6).getBackgroundOffset());
            androidx.compose.ui.d dVarD = androidx.compose.foundation.b.d(dVar, k3.p1.INSTANCE.i(), null, 2, null);
            lVarV.H(407241252);
            boolean zR = lVarV.r(iK) | lVarV.p(zBooleanValue) | lVarV.n(str2);
            Object objI2 = lVarV.I();
            if (zR || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new a(iK, zBooleanValue, str2);
                lVarV.B(objI2);
            }
            wn0.l lVar2 = (wn0.l) objI2;
            lVarV.T();
            lVarV.H(407268179);
            boolean zN = lVarV.n(str2);
            Object objI3 = lVarV.I();
            if (zN || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new b(str2);
                lVarV.B(objI3);
            }
            lVarV.T();
            androidx.compose.ui.viewinterop.f.a(lVar2, dVarD, (wn0.l) objI3, lVarV, 0, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(dVar, str, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z11, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar, SharedPartnerAuthState.Payload payload, wn0.a<h0> aVar2, wn0.a<h0> aVar3, wn0.l<? super String, h0> lVar, p020r2.l lVar2, int i11) {
        TextUpdate text;
        p020r2.l lVarV = lVar2.v(-797811877);
        if (p020r2.o.J()) {
            p020r2.o.S(-797811877, i11, -1, "com.stripe.android.financialconnections.features.common.LoadedContent (SharedPartnerAuth.kt:217)");
        }
        if (aVar instanceof s50.a.d ? true : aVar instanceof s50.a.Loading ? true : aVar instanceof s50.a.Fail ? true : aVar instanceof s50.a.Success) {
            boolean zG = payload.getAuthSession().g();
            if (zG) {
                lVarV.H(2095190852);
                Display display = payload.getAuthSession().getDisplay();
                OauthPrepane oauthPrepane = (display == null || (text = display.getText()) == null) ? null : text.getOauthPrepane();
                if (oauthPrepane == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c(z11, oauthPrepane, aVar, aVar2, aVar3, lVar, lVarV, (i11 & 14) | 64 | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11));
                lVarV.T();
            } else if (zG) {
                lVarV.H(2095758927);
                lVarV.T();
            } else {
                lVarV.H(483245780);
                j(z11, lVarV, i11 & 14);
                lVarV.T();
            }
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(z11, aVar, payload, aVar2, aVar3, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z11, OauthPrepane oauthPrepane, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar, wn0.a<h0> aVar2, wn0.a<h0> aVar3, wn0.l<? super String, h0> lVar, p020r2.l lVar2, int i11) {
        p020r2.l lVarV = lVar2.v(-1760376481);
        if (p020r2.o.J()) {
            p020r2.o.S(-1760376481, i11, -1, "com.stripe.android.financialconnections.features.common.PrePaneContent (SharedPartnerAuth.kt:247)");
        }
        lVarV.H(-516893014);
        boolean z12 = (((i11 & 14) ^ 6) > 4 && lVarV.p(z11)) || (i11 & 6) == 4;
        Object objI = lVarV.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            objI = androidx.compose.foundation.layout.t.e(BitmapDescriptorFactory.HUE_RED, w4.h.g(z11 ? 0 : 24), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            lVarV.B(objI);
        }
        lVarV.T();
        p026y50.f.d(null, (v1.y) objI, z11, false, false, v1.b.f117444a.n(w4.h.g(24)), false, null, z2.c.b(lVarV, -1357248084, true, new e(aVar2, aVar3, aVar, oauthPrepane)), new f(oauthPrepane, lVar), lVarV, ((i11 << 6) & 896) | 100859904, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(z11, oauthPrepane, aVar, aVar2, aVar3, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    public static final void d(wn0.a<h0> aVar, wn0.a<h0> aVar2, s50.a<SharedPartnerAuthState.AuthenticationStatus> aVar3, OauthPrepane oauthPrepane, p020r2.l lVar, int i11) {
        boolean z11;
        p020r2.l lVarV = lVar.v(-921989668);
        if (p020r2.o.J()) {
            p020r2.o.S(-921989668, i11, -1, "com.stripe.android.financialconnections.features.common.PrepaneFooter (SharedPartnerAuth.kt:356)");
        }
        v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(16));
        lVarV.H(-483455358);
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVarV, 6);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion2 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion2.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarA, companion2.c());
        d4.b(lVarA, xVarC, companion2.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        w50.f.a aVar4 = w50.f.a.f120922a;
        boolean z12 = aVar3 instanceof s50.a.Loading;
        if (z12) {
            SharedPartnerAuthState.AuthenticationStatus authenticationStatusA = aVar3.a();
            if ((authenticationStatusA != null ? authenticationStatusA.getAction() : null) == SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.AUTHENTICATING) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        Function0.a(aVar, androidx.compose.foundation.layout.x.h(s2.a(g4.o.d(companion, false, h.f110086c, 1, null), "prepane_cta"), BitmapDescriptorFactory.HUE_RED, 1, null), aVar4, null, !z12, z11, z2.c.b(lVarV, 609372779, true, new i(oauthPrepane)), lVarV, (i11 & 14) | 1573248, 8);
        Function0.a(aVar2, androidx.compose.foundation.layout.x.h(s2.a(g4.o.d(companion, false, j.f110088c, 1, null), "cancel_cta"), BitmapDescriptorFactory.HUE_RED, 1, null), w50.f.b.f120923a, null, !z12, false, p022s40.e.f109863a.b(), lVarV, ((i11 >> 3) & 14) | 1573248, 40);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new k(aVar, aVar2, aVar3, oauthPrepane, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(OauthPrepane oauthPrepane, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        p020r2.l lVarV = lVar.v(1907905063);
        androidx.compose.ui.d dVar2 = (i12 & 2) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(1907905063, i11, -1, "com.stripe.android.financialconnections.features.common.PrepaneHeader (SharedPartnerAuth.kt:410)");
        }
        String title = oauthPrepane.getTitle();
        lVarV.H(1488284829);
        boolean zN = lVarV.n(title);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new v50.g.Text(x50.b.a(oauthPrepane.getTitle()));
            lVarV.B(objI);
        }
        v50.g.Text text = (v50.g.Text) objI;
        lVarV.T();
        String subtitle = oauthPrepane.getSubtitle();
        lVarV.H(1488287715);
        boolean zN2 = lVarV.n(subtitle);
        Object objI2 = lVarV.I();
        if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
            objI2 = new v50.g.Text(x50.b.a(oauthPrepane.getSubtitle()));
            lVarV.B(objI2);
        }
        v50.g.Text text2 = (v50.g.Text) objI2;
        lVarV.T();
        v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(16));
        lVarV.H(-483455358);
        i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVarV, 6);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVar2);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarA, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        v1.j jVar = v1.j.f117505a;
        Image institutionIcon = oauthPrepane.getInstitutionIcon();
        String str = institutionIcon != null ? institutionIcon.getDefault() : null;
        lVarV.H(-1009325161);
        if (str != null) {
            p022s40.h.a(str, null, false, lVarV, 0, 6);
        }
        lVarV.T();
        l lVar2 = l.f110094c;
        p026y50.d dVar3 = p026y50.d.f125064a;
        p023w50.n.a(text, lVar2, TextStyle.e(dVar3.b(lVarV, 6).getHeadingLarge(), dVar3.a(lVarV, 6).getTextDefault(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null), null, null, 0, 0, lVarV, 56, 120);
        p023w50.n.a(text2, m.f110095c, TextStyle.e(dVar3.b(lVarV, 6).getBodyMedium(), dVar3.a(lVarV, 6).getTextDefault(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777214, null), null, null, 0, 0, lVarV, 56, 120);
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C2336n(oauthPrepane, dVar2, i11, i12));
        }
    }

    public static final void f(com.stripe.android.financialconnections.model.o.Image bodyItem, p020r2.l lVar, int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(bodyItem, "bodyItem");
        p020r2.l lVarV = lVar.v(-103760569);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(bodyItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-103760569, i12, -1, "com.stripe.android.financialconnections.features.common.PrepaneImage (SharedPartnerAuth.kt:289)");
            }
            v1.b.f fVarB = v1.b.f117444a.b();
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(200));
            lVarV.H(693286680);
            i0 i0VarB = e0.b(fVarB, d3.c.INSTANCE.l(), lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarI);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            h1.Companion companion3 = h1.INSTANCE;
            p026y50.d dVar = p026y50.d.f125064a;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.layout.x.d(g0.c(h0Var, androidx.compose.foundation.b.b(companion, h1.Companion.b(companion3, p013kotlin.collections.v.p(k3.p1.l(dVar.a(lVarV, 6).getBackgroundOffset()), k3.p1.l(dVar.a(lVarV, 6).getBorder())), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 14, null), null, BitmapDescriptorFactory.HUE_RED, 6, null), 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, 0);
            float f11 = 8;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.layout.x.d(androidx.compose.foundation.layout.x.v(androidx.compose.foundation.b.d(companion, dVar.a(lVarV, 6).getBackgroundOffset(), null, 2, null), w4.h.g(f11)), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, 0);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.x.d(androidx.compose.foundation.layout.x.v(companion, w4.h.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)), BitmapDescriptorFactory.HUE_RED, 1, null);
            String str = bodyItem.getContent().getDefault();
            p013kotlin.jvm.internal.s.h(str);
            a(dVarD, str, lVarV, 6);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.layout.x.d(androidx.compose.foundation.layout.x.v(androidx.compose.foundation.b.d(companion, dVar.a(lVarV, 6).getBackgroundOffset(), null, 2, null), w4.h.g(f11)), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, 0);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.layout.x.d(g0.c(h0Var, androidx.compose.foundation.b.b(companion, h1.Companion.b(companion3, p013kotlin.collections.v.p(k3.p1.l(dVar.a(lVarV, 6).getBorder()), k3.p1.l(dVar.a(lVarV, 6).getBackgroundOffset())), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 14, null), null, BitmapDescriptorFactory.HUE_RED, 6, null), 1.0f, false, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new o(bodyItem, i11));
        }
    }

    public static final void g(SharedPartnerAuthState state, wn0.a<h0> onContinueClick, wn0.a<h0> onCancelClick, wn0.l<? super String, h0> onClickableTextClick, wn0.l<? super s50.j, h0> onWebAuthFlowFinished, wn0.a<h0> onViewEffectLaunched, boolean z11, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onContinueClick, "onContinueClick");
        p013kotlin.jvm.internal.s.k(onCancelClick, "onCancelClick");
        p013kotlin.jvm.internal.s.k(onClickableTextClick, "onClickableTextClick");
        p013kotlin.jvm.internal.s.k(onWebAuthFlowFinished, "onWebAuthFlowFinished");
        p013kotlin.jvm.internal.s.k(onViewEffectLaunched, "onViewEffectLaunched");
        p020r2.l lVarV = lVar.v(-1861935187);
        if (p020r2.o.J()) {
            p020r2.o.S(-1861935187, i11, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuth (SharedPartnerAuth.kt:79)");
        }
        s50.f fVarB = s50.g.b(lVarV, 0);
        y3 y3VarA = s50.b.a(fVarB, new f0() { // from class: s40.n.s
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((FinancialConnectionsSheetNativeState) obj).getWebAuthFlow();
            }
        }, lVarV, 72);
        x2 x2Var = (x2) lVarV.U(z0.t());
        Object value = y3VarA.getValue();
        lVarV.H(1738859714);
        boolean zN = ((((i11 & 57344) ^ 24576) > 16384 && lVarV.n(onWebAuthFlowFinished)) || (i11 & 24576) == 16384) | lVarV.n(y3VarA);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = new p(onWebAuthFlowFinished, y3VarA, null);
            lVarV.B(objI);
        }
        lVarV.T();
        p020r2.Function0.g(value, (wn0.p) objI, lVarV, 64);
        SharedPartnerAuthState.d viewEffect = state.getViewEffect();
        lVarV.H(1738862551);
        if (viewEffect != null) {
            p020r2.Function0.g(viewEffect, new q(viewEffect, x2Var, fVarB, onViewEffectLaunched, null), lVarV, 64);
            h0 h0Var = h0.f84049a;
        }
        lVarV.T();
        int i12 = i11 << 6;
        i(state, z11, onClickableTextClick, onContinueClick, onCancelClick, lVarV, ((i11 >> 15) & 112) | 8 | ((i11 >> 3) & 896) | (i12 & 7168) | (i12 & 57344));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new r(state, onContinueClick, onCancelClick, onClickableTextClick, onWebAuthFlowFinished, onViewEffectLaunched, z11, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SharedPartnerAuthState sharedPartnerAuthState, boolean z11, wn0.a<h0> aVar, wn0.a<h0> aVar2, wn0.l<? super String, h0> lVar, p020r2.l lVar2, int i11) {
        boolean z12;
        wn0.a<h0> aVar3;
        wn0.a<h0> aVar4;
        wn0.l<? super String, h0> lVar3;
        p020r2.l lVarV = lVar2.v(-1730645656);
        if (p020r2.o.J()) {
            p020r2.o.S(-1730645656, i11, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuthBody (SharedPartnerAuth.kt:194)");
        }
        h0 h0Var = null;
        androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
        lVarV.H(733328855);
        i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarH);
        if (lVarV.w() == null) {
            p020r2.j.c();
        }
        lVarV.h();
        if (lVarV.getInserting()) {
            lVarV.z(aVarA);
        } else {
            lVarV.d();
        }
        p020r2.l lVarA = d4.a(lVarV);
        d4.b(lVarA, i0VarJ, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        wn0.p<b4.g, Integer, h0> pVarB = companion.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
        SharedPartnerAuthState.Payload payloadA = sharedPartnerAuthState.f().a();
        lVarV.H(59793738);
        if (payloadA == null) {
            lVar3 = lVar;
            aVar3 = aVar2;
            aVar4 = aVar;
            z12 = z11;
        } else {
            b(z11, sharedPartnerAuthState.c(), payloadA, aVar2, aVar, lVar, lVarV, ((i11 >> 3) & 14) | 512 | (i11 & 7168) | ((i11 << 6) & 57344) | ((i11 << 3) & 458752));
            z12 = z11;
            aVar3 = aVar2;
            aVar4 = aVar;
            lVar3 = lVar;
            h0Var = h0.f84049a;
        }
        lVarV.T();
        lVarV.H(59793244);
        if (h0Var == null) {
            j(z12, lVarV, (i11 >> 3) & 14);
        }
        lVarV.T();
        lVarV.T();
        lVarV.g();
        lVarV.T();
        lVarV.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new t(sharedPartnerAuthState, z12, aVar4, aVar3, lVar3, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SharedPartnerAuthState sharedPartnerAuthState, boolean z11, wn0.l<? super String, h0> lVar, wn0.a<h0> aVar, wn0.a<h0> aVar2, p020r2.l lVar2, int i11) {
        p020r2.l lVarV = lVar2.v(919704421);
        if (p020r2.o.J()) {
            p020r2.o.S(919704421, i11, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerAuthContent (SharedPartnerAuth.kt:115)");
        }
        h(sharedPartnerAuthState, z11, aVar2, aVar, lVar, lVarV, (i11 & 112) | 8 | ((i11 >> 6) & 896) | (i11 & 7168) | (57344 & (i11 << 6)));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new u(sharedPartnerAuthState, z11, lVar, aVar, aVar2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z11, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(210017713);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(210017713, i12, -1, "com.stripe.android.financialconnections.features.common.SharedPartnerLoading (SharedPartnerAuth.kt:126)");
            }
            Function1.f(z2.c.b(lVarV, -644126576, true, new v(z11)), lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new w(z11, i11));
        }
    }
}
