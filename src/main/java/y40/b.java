package y40;

import androidx.compose.ui.platform.s2;
import androidx.compose.ui.platform.z0;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import ezvcard.property.Gender;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.List;
import k3.h1;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.e1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import p022s40.Function1;
import p026y50.FinancialConnectionsColors;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000f2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008b\u0001\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aq\u0010\u001f\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010&\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b&\u0010'\u001a=\u0010+\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b+\u0010,\u001a+\u0010/\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100\u001a/\u00102\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\u0006\u00101\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0003¢\u0006\u0004\b2\u00103\u001a/\u00105\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u00101\u001a\u00020\u0013H\u0003¢\u0006\u0004\b5\u00106\u001aI\u00109\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020!2\u0006\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010;\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b;\u0010<¨\u0006A²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\u000e\u0010?\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010@\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lja/k;", "backStackEntry", "Ljn0/h0;", "c", "(Lja/k;Lr2/l;I)V", "Lw1/a0;", "listState", "Ls50/a;", "Ly40/c$a;", StatusResponse.PAYLOAD, "Lcom/stripe/android/financialconnections/model/s;", "institutions", "", "previewText", "selectedInstitutionId", "Lkotlin/Function1;", "onQueryChanged", "Lkotlin/Function2;", "Lcom/stripe/android/financialconnections/model/q;", "", "onInstitutionSelected", "Lkotlin/Function0;", "onManualEntryClick", "onScrollChanged", "b", "(Lw1/a0;Ls50/a;Ls50/a;Ljava/lang/String;Ljava/lang/String;Lwn0/l;Lwn0/p;Lwn0/a;Lwn0/a;Lr2/l;I)V", "g", "(Lw1/a0;Ljava/lang/String;Ljava/lang/String;Lwn0/l;Ls50/a;Lwn0/p;Ly40/c$a;Lwn0/a;Lwn0/a;Lr2/l;I)V", "Lw1/x;", "isInputEmpty", "onSearchMoreClick", Gender.FEMALE, "(Lw1/x;ZLy40/c$a;Ljava/lang/String;Lwn0/p;Ls50/a;Lwn0/a;Lwn0/a;)V", "Landroidx/compose/ui/d;", "modifier", "showManualEntry", "m", "(Landroidx/compose/ui/d;Ljava/lang/Boolean;Lwn0/a;Lr2/l;II)V", "p", "(Landroidx/compose/ui/d;Lr2/l;II)V", "Landroidx/compose/ui/focus/o;", "focusRequester", SearchIntents.EXTRA_QUERY, "o", "(Landroidx/compose/ui/d;Landroidx/compose/ui/focus/o;Ljava/lang/String;Lwn0/l;Lr2/l;II)V", "Ly50/b;", "colors", "a", "(Lwn0/l;Ly50/b;Lr2/l;I)V", "enabled", "l", "(Landroidx/compose/ui/d;ZLwn0/a;Lr2/l;II)V", "onClick", "n", "(Landroidx/compose/ui/d;Lwn0/a;ZLr2/l;II)V", "institution", "loading", "f", "(Landroidx/compose/ui/d;Lcom/stripe/android/financialconnections/model/q;ZZLwn0/l;Lr2/l;II)V", "e", "(Landroidx/compose/ui/d;Lr2/l;I)V", "Ly40/c;", "state", "input", "shouldEmitScrollEvent", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super String, jn0.h0> lVar) {
            super(0);
            this.f124759c = lVar;
        }

        public final void b() {
            this.f124759c.invoke("");
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f124762e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f124760c = dVar;
            this.f124761d = i11;
            this.f124762e = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.p(this.f124760c, lVar, k2.a(this.f124761d | 1), this.f124762e);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: y40.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2699b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsColors f124764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f124765e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2699b(wn0.l<? super String, jn0.h0> lVar, FinancialConnectionsColors financialConnectionsColors, int i11) {
            super(2);
            this.f124763c = lVar;
            this.f124764d = financialConnectionsColors;
            this.f124765e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.a(this.f124763c, this.f124764d, lVar, k2.a(this.f124765e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    public static final class b0 extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f124766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f124767d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(wn0.l lVar, List list) {
            super(1);
            this.f124766c = lVar;
            this.f124767d = list;
        }

        public final Object a(int i11) {
            return this.f124766c.invoke(this.f124767d.get(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1.a0 f124768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionPickerState.Payload> f124769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionResponse> f124770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f124771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f124772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> f124774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124775j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124776k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f124777l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(w1.a0 a0Var, s50.a<InstitutionPickerState.Payload> aVar, s50.a<InstitutionResponse> aVar2, String str, String str2, wn0.l<? super String, jn0.h0> lVar, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, wn0.a<jn0.h0> aVar3, wn0.a<jn0.h0> aVar4, int i11) {
            super(2);
            this.f124768c = a0Var;
            this.f124769d = aVar;
            this.f124770e = aVar2;
            this.f124771f = str;
            this.f124772g = str2;
            this.f124773h = lVar;
            this.f124774i = pVar;
            this.f124775j = aVar3;
            this.f124776k = aVar4;
            this.f124777l = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.b(this.f124768c, this.f124769d, this.f124770e, this.f124771f, this.f124772g, this.f124773h, this.f124774i, this.f124775j, this.f124776k, lVar, k2.a(this.f124777l | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    public static final class c0 extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f124778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f124779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(wn0.l lVar, List list) {
            super(1);
            this.f124778c = lVar;
            this.f124779d = list;
        }

        public final Object a(int i11) {
            return this.f124778c.invoke(this.f124779d.get(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l<String, jn0.h0> {
        d(Object obj) {
            super(1, obj, y40.d.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
            o(str);
            return jn0.h0.f84049a;
        }

        public final void o(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((y40.d) this.receiver).D(p11);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    public static final class d0 extends p013kotlin.jvm.internal.u implements wn0.r<w1.c, Integer, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f124780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f124781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p f124782e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(List list, String str, wn0.p pVar) {
            super(4);
            this.f124780c = list;
            this.f124781d = str;
            this.f124782e = pVar;
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
            FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) this.f124780c.get(i11);
            lVar.H(1558903375);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8));
            boolean zF = p013kotlin.jvm.internal.s.f(this.f124781d, financialConnectionsInstitution.getId());
            String str = this.f124781d;
            boolean zF2 = str != null ? p013kotlin.jvm.internal.s.f(str, financialConnectionsInstitution.getId()) : true;
            lVar.H(-1612269305);
            boolean zN = lVar.n(this.f124782e);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new s0(this.f124782e);
                lVar.B(objI);
            }
            lVar.T();
            b.f(dVarI, financialConnectionsInstitution, zF, zF2, (wn0.l) objI, lVar, 6, 0);
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, Integer num, p020r2.l lVar, Integer num2) {
            a(cVar, num.intValue(), lVar, num2.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> {
        e(Object obj) {
            super(2, obj, y40.d.class, "onInstitutionSelected", "onInstitutionSelected(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)V", 0);
        }

        public final void a(FinancialConnectionsInstitution p11, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((y40.d) this.receiver).B(p11, z11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(FinancialConnectionsInstitution financialConnectionsInstitution, Boolean bool) {
            a(financialConnectionsInstitution, bool.booleanValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    public static final class e0 extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f124783c = new e0();

        public e0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FinancialConnectionsInstitution financialConnectionsInstitution) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        f(Object obj) {
            super(0, obj, y40.d.class, "onManualEntryClick", "onManualEntryClick()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            o();
            return jn0.h0.f84049a;
        }

        public final void o() {
            ((y40.d) this.receiver).C();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    public static final class f0 extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f124784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f124785d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(wn0.l lVar, List list) {
            super(1);
            this.f124784c = lVar;
            this.f124785d = list;
        }

        public final Object a(int i11) {
            return this.f124784c.invoke(this.f124785d.get(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.a<jn0.h0> {
        g(Object obj) {
            super(0, obj, y40.d.class, "onScrollChanged", "onScrollChanged()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            o();
            return jn0.h0.f84049a;
        }

        public final void o() {
            ((y40.d) this.receiver).E();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    public static final class g0 extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f124786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f124787d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(wn0.l lVar, List list) {
            super(1);
            this.f124786c = lVar;
            this.f124787d = list;
        }

        public final Object a(int i11) {
            return this.f124786c.invoke(this.f124787d.get(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p011ja.k f124788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124789d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p011ja.k kVar, int i11) {
            super(2);
            this.f124788c = kVar;
            this.f124789d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.c(this.f124788c, lVar, k2.a(this.f124789d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    public static final class h0 extends p013kotlin.jvm.internal.u implements wn0.r<w1.c, Integer, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f124790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f124791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p f124792e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(List list, String str, wn0.p pVar) {
            super(4);
            this.f124790c = list;
            this.f124791d = str;
            this.f124792e = pVar;
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
            FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) this.f124790c.get(i11);
            lVar.H(1556832296);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8));
            boolean zF = p013kotlin.jvm.internal.s.f(this.f124791d, financialConnectionsInstitution.getId());
            String str = this.f124791d;
            boolean zF2 = str != null ? p013kotlin.jvm.internal.s.f(str, financialConnectionsInstitution.getId()) : true;
            lVar.H(-1612336730);
            boolean zN = lVar.n(this.f124792e);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new n0(this.f124792e);
                lVar.B(objI);
            }
            lVar.T();
            b.f(dVarI, financialConnectionsInstitution, zF, zF2, (wn0.l) objI, lVar, 6, 0);
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, Integer num, p020r2.l lVar, Integer num2) {
            a(cVar, num.intValue(), lVar, num2.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "shimmer", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.q<h1, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124793c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.d dVar) {
            super(3);
            this.f124793c = dVar;
        }

        public final void a(h1 shimmer, p020r2.l lVar, int i11) {
            int i12;
            p013kotlin.jvm.internal.s.k(shimmer, "shimmer");
            if ((i11 & 14) == 0) {
                i12 = i11 | (lVar.n(shimmer) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1621225646, i12, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultShimmer.<anonymous> (InstitutionPickerScreen.kt:551)");
            }
            d3.c.Companion companion = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI = companion.i();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(this.f124793c, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVar.H(693286680);
            v1.b bVar = v1.b.f117444a;
            z3.i0 i0VarB = v1.e0.b(bVar.f(), interfaceC1212cI, lVar, 48);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarF);
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
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
            float f11 = 6;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.q(companion3, w4.h.g(56)), a2.g.c(w4.h.g(f11))), shimmer, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            float f12 = 8;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion3, w4.h.g(f12)), lVar, 6);
            lVar.H(-483455358);
            z3.i0 i0VarA = v1.g.a(bVar.g(), companion.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            wn0.a<b4.g> aVarA2 = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(companion3);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA2);
            } else {
                lVar.d();
            }
            p020r2.l lVarA2 = d4.a(lVar);
            d4.b(lVarA2, i0VarA, companion2.c());
            d4.b(lVarA2, xVarC2, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion2.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            float f13 = 16;
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.g(companion3, 0.75f), w4.h.g(f13)), a2.g.c(w4.h.g(f11))), shimmer, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion3, w4.h.g(f12)), lVar, 6);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.g(companion3, 0.5f), w4.h.g(f13)), a2.g.c(w4.h.g(f11))), shimmer, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            lVar.T();
            lVar.g();
            lVar.T();
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
        public /* bridge */ /* synthetic */ jn0.h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    public static final class i0 extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i0 f124794c = new i0();

        public i0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Integer num) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f124796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.d dVar, int i11) {
            super(2);
            this.f124795c = dVar;
            this.f124796d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.e(this.f124795c, lVar, k2.a(this.f124796d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    public static final class j0 extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f124797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f124798d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(wn0.l lVar, List list) {
            super(1);
            this.f124797c = lVar;
            this.f124798d = list;
        }

        public final Object a(int i11) {
            return this.f124797c.invoke(this.f124798d.get(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f124799c = new k();

        k() {
            super(1);
        }

        public final void a(g4.y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            g4.w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    public static final class k0 extends p013kotlin.jvm.internal.u implements wn0.r<w1.c, Integer, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f124800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(List list) {
            super(4);
            this.f124800c = list;
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
            ((Number) this.f124800c.get(i11)).intValue();
            lVar.H(1558054719);
            b.e(androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), lVar, 6);
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, Integer num, p020r2.l lVar, Integer num2) {
            a(cVar, num.intValue(), lVar, num2.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f124801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<FinancialConnectionsInstitution, jn0.h0> f124802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f124803e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(i3.f fVar, wn0.l<? super FinancialConnectionsInstitution, jn0.h0> lVar, FinancialConnectionsInstitution financialConnectionsInstitution) {
            super(0);
            this.f124801c = fVar;
            this.f124802d = lVar;
            this.f124803e = financialConnectionsInstitution;
        }

        public final void b() {
            i3.f.a(this.f124801c, false, 1, null);
            this.f124802d.invoke(this.f124803e);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    public static final class l0 extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l0 f124804c = new l0();

        public l0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FinancialConnectionsInstitution financialConnectionsInstitution) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class m extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsInstitution f124806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f124807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f124808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<FinancialConnectionsInstitution, jn0.h0> f124809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f124810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f124811i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(androidx.compose.ui.d dVar, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z11, boolean z12, wn0.l<? super FinancialConnectionsInstitution, jn0.h0> lVar, int i11, int i12) {
            super(2);
            this.f124805c = dVar;
            this.f124806d = financialConnectionsInstitution;
            this.f124807e = z11;
            this.f124808f = z12;
            this.f124809g = lVar;
            this.f124810h = i11;
            this.f124811i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.f(this.f124805c, this.f124806d, this.f124807e, this.f124808f, this.f124809g, lVar, k2.a(this.f124810h | 1), this.f124811i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "it", "", "a", "(Lcom/stripe/android/financialconnections/model/q;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class m0 extends p013kotlin.jvm.internal.u implements wn0.l<FinancialConnectionsInstitution, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0 f124812c = new m0();

        m0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FinancialConnectionsInstitution it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.getId();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$LoadedContent$1$1", f = "InstitutionPickerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124813n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f124814o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(p1<Boolean> p1Var, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f124814o = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new n(this.f124814o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124813n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.k(this.f124814o, true);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/model/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class n0 extends p013kotlin.jvm.internal.u implements wn0.l<FinancialConnectionsInstitution, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> f124815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n0(wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar) {
            super(1);
            this.f124815c = pVar;
        }

        public final void a(FinancialConnectionsInstitution it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f124815c.invoke(it, Boolean.TRUE);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(FinancialConnectionsInstitution financialConnectionsInstitution) {
            a(financialConnectionsInstitution);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$LoadedContent$2", f = "InstitutionPickerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124816n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionResponse> f124817o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w1.a0 f124818p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124819q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f124820r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(s50.a<InstitutionResponse> aVar, w1.a0 a0Var, wn0.a<jn0.h0> aVar2, p1<Boolean> p1Var, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f124817o = aVar;
            this.f124818p = a0Var;
            this.f124819q = aVar2;
            this.f124820r = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new o(this.f124817o, this.f124818p, this.f124819q, this.f124820r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<FinancialConnectionsInstitution> listB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f124816n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            InstitutionResponse institutionResponseA = this.f124817o.a();
            if (institutionResponseA != null && (listB = institutionResponseA.b()) != null && (!listB.isEmpty()) && !this.f124818p.a() && b.j(this.f124820r)) {
                this.f124819q.invoke();
                b.k(this.f124820r, false);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class o0 extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f124822d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(wn0.a<jn0.h0> aVar, String str) {
            super(3);
            this.f124821c = aVar;
            this.f124822d = str;
        }

        public final void a(w1.c item, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1112912850, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.searchResults.<anonymous> (InstitutionPickerScreen.kt:234)");
            }
            b.n(androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), this.f124821c, this.f124822d == null, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/x;", "Ljn0/h0;", "a", "(Lw1/x;)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.l<w1.x, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionPickerState.Payload f124823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f124824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> f124825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionResponse> f124826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f124828h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p1<String> f124829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f124831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ w1.a0 f124832l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f124833c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p1<String> f124834d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ wn0.l<String, jn0.h0> f124835e;

            /* JADX INFO: renamed from: y40.b$p$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
            static final class C2700a extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.l<String, jn0.h0> f124836c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ p1<String> f124837d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2700a(wn0.l<? super String, jn0.h0> lVar, p1<String> p1Var) {
                    super(1);
                    this.f124836c = lVar;
                    this.f124837d = p1Var;
                }

                public final void a(String it) {
                    p013kotlin.jvm.internal.s.k(it, "it");
                    b.i(this.f124837d, it);
                    this.f124836c.invoke(b.h(this.f124837d));
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
                    a(str);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.ui.focus.o oVar, p1<String> p1Var, wn0.l<? super String, jn0.h0> lVar) {
                super(3);
                this.f124833c = oVar;
                this.f124834d = p1Var;
                this.f124835e = lVar;
            }

            public final void a(w1.c stickyHeader, p020r2.l lVar, int i11) {
                p013kotlin.jvm.internal.s.k(stickyHeader, "$this$stickyHeader");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1698365372, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.LoadedContent.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:181)");
                }
                androidx.compose.ui.focus.o oVar = this.f124833c;
                String strH = b.h(this.f124834d);
                lVar.H(598984900);
                boolean zN = lVar.n(this.f124834d) | lVar.n(this.f124835e);
                wn0.l<String, jn0.h0> lVar2 = this.f124835e;
                p1<String> p1Var = this.f124834d;
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new C2700a(lVar2, p1Var);
                    lVar.B(objI);
                }
                lVar.T();
                b.o(null, oVar, strH, (wn0.l) objI, lVar, 48, 1);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
                a(cVar, lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: y40.b$p$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C2701b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f124838c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.o f124839d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w1.a0 f124840e;

            /* JADX INFO: renamed from: y40.b$p$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$LoadedContent$3$2$1", f = "InstitutionPickerScreen.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f124841n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ w1.a0 f124842o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(w1.a0 a0Var, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f124842o = a0Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f124842o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f124841n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        w1.a0 a0Var = this.f124842o;
                        this.f124841n = 1;
                        if (w1.a0.m(a0Var, 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    return jn0.h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2701b(CoroutineScope coroutineScope, androidx.compose.ui.focus.o oVar, w1.a0 a0Var) {
                super(0);
                this.f124838c = coroutineScope;
                this.f124839d = oVar;
                this.f124840e = a0Var;
            }

            public final void b() {
                BuildersKt__Builders_commonKt.launch$default(this.f124838c, null, null, new a(this.f124840e, null), 3, null);
                this.f124839d.f();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(InstitutionPickerState.Payload payload, String str, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, s50.a<InstitutionResponse> aVar, wn0.a<jn0.h0> aVar2, androidx.compose.ui.focus.o oVar, p1<String> p1Var, wn0.l<? super String, jn0.h0> lVar, CoroutineScope coroutineScope, w1.a0 a0Var) {
            super(1);
            this.f124823c = payload;
            this.f124824d = str;
            this.f124825e = pVar;
            this.f124826f = aVar;
            this.f124827g = aVar2;
            this.f124828h = oVar;
            this.f124829i = p1Var;
            this.f124830j = lVar;
            this.f124831k = coroutineScope;
            this.f124832l = a0Var;
        }

        public final void a(w1.x LazyLayout) {
            p013kotlin.jvm.internal.s.k(LazyLayout, "$this$LazyLayout");
            y40.a aVar = y40.a.f124748a;
            w1.x.e(LazyLayout, null, null, aVar.a(), 3, null);
            w1.x.e(LazyLayout, null, null, aVar.b(), 3, null);
            w1.x.a(LazyLayout, "searchRow", null, z2.c.c(1698365372, true, new a(this.f124828h, this.f124829i, this.f124830j)), 2, null);
            w1.x.e(LazyLayout, null, null, aVar.c(), 3, null);
            b.F(LazyLayout, p013kotlin.text.t.y0(b.h(this.f124829i)), this.f124823c, this.f124824d, this.f124825e, this.f124826f, this.f124827g, new C2701b(this.f124831k, this.f124828h, this.f124832l));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.x xVar) {
            a(xVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class p0 extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstitutionPickerState.Payload f124843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(InstitutionPickerState.Payload payload, wn0.a<jn0.h0> aVar) {
            super(3);
            this.f124843c = payload;
            this.f124844d = aVar;
        }

        public final void a(w1.c item, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1155988401, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.searchResults.<anonymous> (InstitutionPickerScreen.kt:245)");
            }
            b.m(androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), this.f124843c.getFeaturedInstitutions().getShowManualEntry(), this.f124844d, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class q extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1.a0 f124845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f124846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f124847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionResponse> f124849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> f124850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ InstitutionPickerState.Payload f124851i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124853k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f124854l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(w1.a0 a0Var, String str, String str2, wn0.l<? super String, jn0.h0> lVar, s50.a<InstitutionResponse> aVar, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, InstitutionPickerState.Payload payload, wn0.a<jn0.h0> aVar2, wn0.a<jn0.h0> aVar3, int i11) {
            super(2);
            this.f124845c = a0Var;
            this.f124846d = str;
            this.f124847e = str2;
            this.f124848f = lVar;
            this.f124849g = aVar;
            this.f124850h = pVar;
            this.f124851i = payload;
            this.f124852j = aVar2;
            this.f124853k = aVar3;
            this.f124854l = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.g(this.f124845c, this.f124846d, this.f124847e, this.f124848f, this.f124849g, this.f124850h, this.f124851i, this.f124852j, this.f124853k, lVar, k2.a(this.f124854l | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class q0 extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s50.a<InstitutionResponse> f124855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124856d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(s50.a<InstitutionResponse> aVar, wn0.a<jn0.h0> aVar2) {
            super(3);
            this.f124855c = aVar;
            this.f124856d = aVar2;
        }

        public final void a(w1.c item, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(783719406, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.searchResults.<anonymous> (InstitutionPickerScreen.kt:264)");
            }
            b.m(androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), ((InstitutionResponse) ((s50.a.Success) this.f124855c).a()).getShowManualEntry(), this.f124856d, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<p1<String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f124857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str) {
            super(0);
            this.f124857c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<String> invoke() {
            String str = this.f124857c;
            if (str == null) {
                str = "";
            }
            return s3.d(str, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "it", "", "a", "(Lcom/stripe/android/financialconnections/model/q;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class r0 extends p013kotlin.jvm.internal.u implements wn0.l<FinancialConnectionsInstitution, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r0 f124858c = new r0();

        r0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FinancialConnectionsInstitution it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.getId();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class s extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f124860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f124862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f124863g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(androidx.compose.ui.d dVar, boolean z11, wn0.a<jn0.h0> aVar, int i11, int i12) {
            super(2);
            this.f124859c = dVar;
            this.f124860d = z11;
            this.f124861e = aVar;
            this.f124862f = i11;
            this.f124863g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.l(this.f124859c, this.f124860d, this.f124861e, lVar, k2.a(this.f124862f | 1), this.f124863g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/model/q;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/model/q;)V"}, k = 3, mv = {1, 9, 0})
    static final class s0 extends p013kotlin.jvm.internal.u implements wn0.l<FinancialConnectionsInstitution, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<FinancialConnectionsInstitution, Boolean, jn0.h0> f124864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s0(wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar) {
            super(1);
            this.f124864c = pVar;
        }

        public final void a(FinancialConnectionsInstitution it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f124864c.invoke(it, Boolean.FALSE);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(FinancialConnectionsInstitution financialConnectionsInstitution) {
            a(financialConnectionsInstitution);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(wn0.a<jn0.h0> aVar) {
            super(1);
            this.f124865c = aVar;
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f124865c.invoke();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
            a(str);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class t0 extends p013kotlin.jvm.internal.u implements wn0.q<w1.c, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f124866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124867d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str, wn0.a<jn0.h0> aVar) {
            super(3);
            this.f124866c = str;
            this.f124867d = aVar;
        }

        public final void a(w1.c item, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1239708726, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.searchResults.<anonymous> (InstitutionPickerScreen.kt:287)");
            }
            b.l(androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), this.f124866c == null, this.f124867d, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class u extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f124869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f124871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f124872g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(androidx.compose.ui.d dVar, Boolean bool, wn0.a<jn0.h0> aVar, int i11, int i12) {
            super(2);
            this.f124868c = dVar;
            this.f124869d = bool;
            this.f124870e = aVar;
            this.f124871f = i11;
            this.f124872g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.m(this.f124868c, this.f124869d, this.f124870e, lVar, k2.a(this.f124871f | 1), this.f124872g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class v extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f124874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f124875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f124876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f124877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(androidx.compose.ui.d dVar, wn0.a<jn0.h0> aVar, boolean z11, int i11, int i12) {
            super(2);
            this.f124873c = dVar;
            this.f124874d = aVar;
            this.f124875e = z11;
            this.f124876f = i11;
            this.f124877g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.n(this.f124873c, this.f124874d, this.f124875e, lVar, k2.a(this.f124876f | 1), this.f124877g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb2/y;", "Ljn0/h0;", "a", "(Lb2/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class w extends p013kotlin.jvm.internal.u implements wn0.l<kotlin.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f124878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(i3.f fVar) {
            super(1);
            this.f124878c = fVar;
        }

        public final void a(kotlin.y $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            i3.f.a(this.f124878c, false, 1, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(kotlin.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class x extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(wn0.l<? super String, jn0.h0> lVar) {
            super(2);
            this.f124879c = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1918857846, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchRow.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:380)");
            }
            b.a(this.f124879c, p026y50.d.f125064a.a(lVar, 6), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(wn0.l<? super String, jn0.h0> lVar) {
            super(1);
            this.f124880c = lVar;
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f124880c.invoke(it);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
            a(str);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class z extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f124881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f124882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f124883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f124884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f124885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f124886h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(androidx.compose.ui.d dVar, androidx.compose.ui.focus.o oVar, String str, wn0.l<? super String, jn0.h0> lVar, int i11, int i12) {
            super(2);
            this.f124881c = dVar;
            this.f124882d = oVar;
            this.f124883e = str;
            this.f124884f = lVar;
            this.f124885g = i11;
            this.f124886h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.o(this.f124881c, this.f124882d, this.f124883e, this.f124884f, lVar, k2.a(this.f124885g | 1), this.f124886h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(w1.x xVar, boolean z11, InstitutionPickerState.Payload payload, String str, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, s50.a<InstitutionResponse> aVar, wn0.a<jn0.h0> aVar2, wn0.a<jn0.h0> aVar3) {
        if (z11) {
            List<FinancialConnectionsInstitution> listB = payload.getFeaturedInstitutions().b();
            m0 m0Var = m0.f124812c;
            xVar.d(listB.size(), m0Var != null ? new f0(m0Var, listB) : null, new g0(e0.f124783c, listB), z2.c.c(-632812321, true, new h0(listB, str, pVar)));
            w1.x.e(xVar, "search_more", null, z2.c.c(1112912850, true, new o0(aVar3, str)), 2, null);
            return;
        }
        if (aVar instanceof s50.a.Fail) {
            w1.x.e(xVar, null, null, z2.c.c(1155988401, true, new p0(payload, aVar2)), 3, null);
            return;
        }
        if (aVar instanceof s50.a.d ? true : aVar instanceof s50.a.Loading) {
            List listM1 = p013kotlin.collections.v.m1(new bo0.j(0, 10));
            xVar.d(listM1.size(), null, new j0(i0.f124794c, listM1), z2.c.c(-632812321, true, new k0(listM1)));
            return;
        }
        if (aVar instanceof s50.a.Success) {
            s50.a.Success success = (s50.a.Success) aVar;
            if (((InstitutionResponse) success.a()).b().isEmpty()) {
                w1.x.e(xVar, null, null, z2.c.c(783719406, true, new q0(aVar, aVar2)), 3, null);
                return;
            }
            List<FinancialConnectionsInstitution> listB2 = ((InstitutionResponse) success.a()).b();
            r0 r0Var = r0.f124858c;
            xVar.d(listB2.size(), r0Var != null ? new b0(r0Var, listB2) : null, new c0(l0.f124804c, listB2), z2.c.c(-632812321, true, new d0(listB2, str, pVar)));
            if (p013kotlin.jvm.internal.s.f(((InstitutionResponse) success.a()).getShowManualEntry(), Boolean.TRUE)) {
                w1.x.e(xVar, null, null, z2.c.c(-1239708726, true, new t0(str, aVar2)), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wn0.l<? super String, jn0.h0> lVar, FinancialConnectionsColors financialConnectionsColors, p020r2.l lVar2, int i11) {
        int i12;
        p020r2.l lVarV = lVar2.v(-1929891156);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.K(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.n(financialConnectionsColors) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1929891156, i12, -1, "com.stripe.android.financialconnections.features.institutionpicker.ClearSearchButton (InstitutionPickerScreen.kt:401)");
            }
            androidx.compose.ui.d dVarQ = androidx.compose.foundation.layout.x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(16));
            lVarV.H(44929267);
            boolean z11 = (i12 & 14) == 4;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(lVar);
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.foundation.b.c(androidx.compose.foundation.d.d(dVarQ, false, null, null, (wn0.a) objI, 7, null), financialConnectionsColors.getTextSubdued(), a2.g.f()), w4.h.g(2));
            lVarV.H(733328855);
            z3.i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarI);
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
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            e1.b(l2.c.a(j2.b.a.f82426a), "Clear search", null, financialConnectionsColors.getBackgroundSurface(), lVarV, 48, 4);
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
            w2VarX.a(new C2699b(lVar, financialConnectionsColors, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(w1.a0 a0Var, s50.a<InstitutionPickerState.Payload> aVar, s50.a<InstitutionResponse> aVar2, String str, String str2, wn0.l<? super String, jn0.h0> lVar, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, wn0.a<jn0.h0> aVar3, wn0.a<jn0.h0> aVar4, p020r2.l lVar2, int i11) {
        p020r2.l lVar3;
        p020r2.l lVarV = lVar2.v(-941302567);
        if (p020r2.o.J()) {
            p020r2.o.S(-941302567, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerContent (InstitutionPickerScreen.kt:121)");
        }
        lVarV.H(733328855);
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        z3.i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
        lVarV.H(-1323940314);
        int iA = p020r2.j.a(lVarV, 0);
        p020r2.x xVarC = lVarV.c();
        b4.g.Companion companion2 = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion2.a();
        wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(companion);
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
        d4.b(lVarA, i0VarJ, companion2.c());
        d4.b(lVarA, xVarC, companion2.e());
        wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
        if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
        lVarV.H(2058660585);
        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
        if (aVar instanceof s50.a.d ? true : aVar instanceof s50.a.Loading ? true : aVar instanceof s50.a.Fail) {
            lVarV.H(-1580720202);
            Function1.a(lVarV, 0);
            lVarV.T();
            lVar3 = lVarV;
        } else if (aVar instanceof s50.a.Success) {
            lVarV.H(-1580718026);
            int i12 = i11 >> 6;
            g(a0Var, str, str2, lVar, aVar2, pVar, (InstitutionPickerState.Payload) ((s50.a.Success) aVar).a(), aVar3, aVar4, lVarV, (i11 & 14) | 2129920 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i11 >> 3) & 458752) | (29360128 & i11) | (234881024 & i11));
            lVar3 = lVarV;
            lVar3.T();
        } else {
            lVar3 = lVarV;
            lVar3.H(-1757153114);
            lVar3.T();
        }
        lVar3.T();
        lVar3.g();
        lVar3.T();
        lVar3.T();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new c(a0Var, aVar, aVar2, str, str2, lVar, pVar, aVar3, aVar4, i11));
        }
    }

    public static final void c(p011ja.k backStackEntry, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(773007774);
        if (p020r2.o.J()) {
            p020r2.o.S(773007774, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreen (InstitutionPickerScreen.kt:88)");
        }
        lVarV.H(1481344674);
        ViewModelProvider.Factory factoryA = y40.d.INSTANCE.a(s50.b.b(lVarV, 0).w().getActivityRetainedComponent(), backStackEntry.c());
        lVarV.H(1729797275);
        f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c1 c1VarC = n7.c.c(y40.d.class, f1VarA, null, factoryA, f1VarA instanceof androidx.p003lifecycle.n ? ((androidx.p003lifecycle.n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
        lVarV.T();
        lVarV.T();
        y40.d dVar = (y40.d) ((s50.i) c1VarC);
        y3 y3VarA = r90.f.a(dVar.h(), lVarV, 8);
        b(w1.b0.c(0, 0, lVarV, 0, 3), d(y3VarA).d(), d(y3VarA).g(), d(y3VarA).getPreviewText(), d(y3VarA).getSelectedInstitutionId(), new d(dVar), new e(dVar), new f(dVar), new g(dVar), lVarV, 576);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new h(backStackEntry, i11));
        }
    }

    private static final InstitutionPickerState d(y3<InstitutionPickerState> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1566161485);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1566161485, i12, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultShimmer (InstitutionPickerScreen.kt:549)");
            }
            Function1.f(z2.c.b(lVarV, -1621225646, true, new i(dVar)), lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new j(dVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x0229  */
    /* JADX WARN: Code duplicated, block: B:107:0x0235  */
    /* JADX WARN: Code duplicated, block: B:108:0x0239  */
    /* JADX WARN: Code duplicated, block: B:111:0x0258  */
    /* JADX WARN: Code duplicated, block: B:113:0x0266  */
    /* JADX WARN: Code duplicated, block: B:116:0x031a  */
    /* JADX WARN: Code duplicated, block: B:119:0x034c  */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:95:0x019c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa  */
    public static final void f(androidx.compose.ui.d dVar, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z11, boolean z12, wn0.l<? super FinancialConnectionsInstitution, jn0.h0> lVar, p020r2.l lVar2, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        int i16;
        androidx.compose.ui.d dVar3;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objI;
        float f11;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        Image icon;
        String str;
        androidx.compose.ui.d.Companion companion;
        float f12;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        androidx.compose.ui.d dVar4;
        boolean z18;
        boolean z19;
        w2 w2VarX;
        p020r2.l lVarV = lVar2.v(1318839485);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(financialConnectionsInstitution) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & 896) == 0) {
                z13 = z11;
                i13 |= lVarV.p(z13) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((57344 & i11) == 0) {
                    if (lVarV.K(lVar)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i16;
                }
                if ((46811 & i13) == 9362 || !lVarV.b()) {
                    if (i17 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
                    }
                    i3.f fVar = (i3.f) lVarV.U(z0.h());
                    d3.c.Companion companion2 = d3.c.INSTANCE;
                    d3.c.InterfaceC1212c interfaceC1212cI = companion2.i();
                    androidx.compose.ui.d dVarA = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
                    if (z16 || z15) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    lVarV.H(-1190550912);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = u1.k.a();
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(dVarA, (u1.l) objI, null, z17, null, null, new l(fVar, lVar, financialConnectionsInstitution), 24, null);
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.3f;
                    }
                    androidx.compose.ui.d dVarA2 = h3.a.a(dVarB, f11);
                    lVarV.H(693286680);
                    v1.b bVar = v1.b.f117444a;
                    z3.i0 i0VarB = v1.e0.b(bVar.f(), interfaceC1212cI, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC = lVarV.c();
                    b4.g.Companion companion3 = b4.g.INSTANCE;
                    aVarA = companion3.a();
                    wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarA2);
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarB, companion3.c());
                    d4.b(lVarA, xVarC, companion3.e());
                    pVarB = companion3.b();
                    if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.h0 h0Var = v1.h0.f117504a;
                    icon = financialConnectionsInstitution.getIcon();
                    if (icon != null) {
                        str = icon.getDefault();
                    } else {
                        str = null;
                    }
                    p022s40.h.a(str, null, false, lVarV, 0, 6);
                    companion = androidx.compose.ui.d.INSTANCE;
                    f12 = 8;
                    v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                    androidx.compose.ui.d dVarC = v1.g0.c(h0Var, companion, 1.0f, false, 2, null);
                    lVarV.H(-483455358);
                    z3.i0 i0VarA = v1.g.a(bVar.g(), companion2.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC2 = lVarV.c();
                    aVarA2 = companion3.a();
                    wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(dVarC);
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = d4.a(lVarV);
                    d4.b(lVarA2, i0VarA, companion3.c());
                    d4.b(lVarA2, xVarC2, companion3.e());
                    pVarB2 = companion3.b();
                    if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar = v1.j.f117505a;
                    String name = financialConnectionsInstitution.getName();
                    p026y50.d dVar5 = p026y50.d.f125064a;
                    long textDefault = dVar5.a(lVarV, 6).getTextDefault();
                    TextStyle labelLargeEmphasized = dVar5.b(lVarV, 6).getLabelLargeEmphasized();
                    t4.t.Companion companion4 = t4.t.INSTANCE;
                    v2.b(name, null, textDefault, 0L, null, null, null, 0L, null, null, 0L, companion4.b(), false, 1, 0, null, labelLargeEmphasized, lVarV, 0, 3120, 55290);
                    v2.b(financialConnectionsInstitution.a(), null, dVar5.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion4.b(), false, 1, 0, null, dVar5.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
                    lVarV = lVarV;
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    lVarV.H(-969287841);
                    if (z15) {
                        v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                        Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z18 = z15;
                    z19 = z16;
                } else {
                    lVarV.j();
                    dVar4 = dVar2;
                    z18 = z13;
                    z19 = z14;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new m(dVar4, financialConnectionsInstitution, z18, z19, lVar, i11, i12));
                }
            }
            i13 |= 3072;
            z14 = z12;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (lVarV.K(lVar)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i13 |= i16;
            }
            if ((46811 & i13) == 9362) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
                }
                i3.f fVar2 = (i3.f) lVarV.U(z0.h());
                d3.c.Companion companion5 = d3.c.INSTANCE;
                d3.c.InterfaceC1212c interfaceC1212cI2 = companion5.i();
                androidx.compose.ui.d dVarA3 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                lVarV.H(-1190550912);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = u1.k.a();
                    lVarV.B(objI);
                }
                lVarV.T();
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.d.b(dVarA3, (u1.l) objI, null, z17, null, null, new l(fVar2, lVar, financialConnectionsInstitution), 24, null);
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                androidx.compose.ui.d dVarA4 = h3.a.a(dVarB2, f11);
                lVarV.H(693286680);
                v1.b bVar2 = v1.b.f117444a;
                z3.i0 i0VarB2 = v1.e0.b(bVar2.f(), interfaceC1212cI2, lVarV, 48);
                lVarV.H(-1323940314);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                b4.g.Companion companion6 = b4.g.INSTANCE;
                aVarA = companion6.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA3 = z3.a0.a(dVarA4);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarB2, companion6.c());
                d4.b(lVarA, xVarC3, companion6.e());
                pVarB = companion6.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var2 = v1.h0.f117504a;
                icon = financialConnectionsInstitution.getIcon();
                if (icon != null) {
                    str = icon.getDefault();
                } else {
                    str = null;
                }
                p022s40.h.a(str, null, false, lVarV, 0, 6);
                companion = androidx.compose.ui.d.INSTANCE;
                f12 = 8;
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                androidx.compose.ui.d dVarC2 = v1.g0.c(h0Var2, companion, 1.0f, false, 2, null);
                lVarV.H(-483455358);
                z3.i0 i0VarA2 = v1.g.a(bVar2.g(), companion5.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC4 = lVarV.c();
                aVarA2 = companion6.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA4 = z3.a0.a(dVarC2);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA2, companion6.c());
                d4.b(lVarA2, xVarC4, companion6.e());
                pVarB2 = companion6.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar2 = v1.j.f117505a;
                String name2 = financialConnectionsInstitution.getName();
                p026y50.d dVar6 = p026y50.d.f125064a;
                long textDefault2 = dVar6.a(lVarV, 6).getTextDefault();
                TextStyle labelLargeEmphasized2 = dVar6.b(lVarV, 6).getLabelLargeEmphasized();
                t4.t.Companion companion7 = t4.t.INSTANCE;
                v2.b(name2, null, textDefault2, 0L, null, null, null, 0L, null, null, 0L, companion7.b(), false, 1, 0, null, labelLargeEmphasized2, lVarV, 0, 3120, 55290);
                v2.b(financialConnectionsInstitution.a(), null, dVar6.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion7.b(), false, 1, 0, null, dVar6.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
                lVarV = lVarV;
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                lVarV.H(-969287841);
                if (z15) {
                    v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                    Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z18 = z15;
                z19 = z16;
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
                }
                i3.f fVar3 = (i3.f) lVarV.U(z0.h());
                d3.c.Companion companion8 = d3.c.INSTANCE;
                d3.c.InterfaceC1212c interfaceC1212cI3 = companion8.i();
                androidx.compose.ui.d dVarA5 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                lVarV.H(-1190550912);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = u1.k.a();
                    lVarV.B(objI);
                }
                lVarV.T();
                androidx.compose.ui.d dVarB3 = androidx.compose.foundation.d.b(dVarA5, (u1.l) objI, null, z17, null, null, new l(fVar3, lVar, financialConnectionsInstitution), 24, null);
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                androidx.compose.ui.d dVarA6 = h3.a.a(dVarB3, f11);
                lVarV.H(693286680);
                v1.b bVar3 = v1.b.f117444a;
                z3.i0 i0VarB3 = v1.e0.b(bVar3.f(), interfaceC1212cI3, lVarV, 48);
                lVarV.H(-1323940314);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC5 = lVarV.c();
                b4.g.Companion companion9 = b4.g.INSTANCE;
                aVarA = companion9.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA5 = z3.a0.a(dVarA6);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarB3, companion9.c());
                d4.b(lVarA, xVarC5, companion9.e());
                pVarB = companion9.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var3 = v1.h0.f117504a;
                icon = financialConnectionsInstitution.getIcon();
                if (icon != null) {
                    str = icon.getDefault();
                } else {
                    str = null;
                }
                p022s40.h.a(str, null, false, lVarV, 0, 6);
                companion = androidx.compose.ui.d.INSTANCE;
                f12 = 8;
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                androidx.compose.ui.d dVarC3 = v1.g0.c(h0Var3, companion, 1.0f, false, 2, null);
                lVarV.H(-483455358);
                z3.i0 i0VarA3 = v1.g.a(bVar3.g(), companion8.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC6 = lVarV.c();
                aVarA2 = companion9.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA6 = z3.a0.a(dVarC3);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA3, companion9.c());
                d4.b(lVarA2, xVarC6, companion9.e());
                pVarB2 = companion9.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA6.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar3 = v1.j.f117505a;
                String name3 = financialConnectionsInstitution.getName();
                p026y50.d dVar7 = p026y50.d.f125064a;
                long textDefault3 = dVar7.a(lVarV, 6).getTextDefault();
                TextStyle labelLargeEmphasized3 = dVar7.b(lVarV, 6).getLabelLargeEmphasized();
                t4.t.Companion companion10 = t4.t.INSTANCE;
                v2.b(name3, null, textDefault3, 0L, null, null, null, 0L, null, null, 0L, companion10.b(), false, 1, 0, null, labelLargeEmphasized3, lVarV, 0, 3120, 55290);
                v2.b(financialConnectionsInstitution.a(), null, dVar7.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion10.b(), false, 1, 0, null, dVar7.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
                lVarV = lVarV;
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                lVarV.H(-969287841);
                if (z15) {
                    v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                    Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z18 = z15;
                z19 = z16;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new m(dVar4, financialConnectionsInstitution, z18, z19, lVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z13 = z11;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                z14 = z12;
                if (lVarV.p(z14)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (lVarV.K(lVar)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i13 |= i16;
            }
            if ((46811 & i13) == 9362) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
                }
                i3.f fVar4 = (i3.f) lVarV.U(z0.h());
                d3.c.Companion companion11 = d3.c.INSTANCE;
                d3.c.InterfaceC1212c interfaceC1212cI4 = companion11.i();
                androidx.compose.ui.d dVarA7 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                lVarV.H(-1190550912);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = u1.k.a();
                    lVarV.B(objI);
                }
                lVarV.T();
                androidx.compose.ui.d dVarB4 = androidx.compose.foundation.d.b(dVarA7, (u1.l) objI, null, z17, null, null, new l(fVar4, lVar, financialConnectionsInstitution), 24, null);
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                androidx.compose.ui.d dVarA8 = h3.a.a(dVarB4, f11);
                lVarV.H(693286680);
                v1.b bVar4 = v1.b.f117444a;
                z3.i0 i0VarB4 = v1.e0.b(bVar4.f(), interfaceC1212cI4, lVarV, 48);
                lVarV.H(-1323940314);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC7 = lVarV.c();
                b4.g.Companion companion12 = b4.g.INSTANCE;
                aVarA = companion12.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA7 = z3.a0.a(dVarA8);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarB4, companion12.c());
                d4.b(lVarA, xVarC7, companion12.e());
                pVarB = companion12.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA7.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var4 = v1.h0.f117504a;
                icon = financialConnectionsInstitution.getIcon();
                if (icon != null) {
                    str = icon.getDefault();
                } else {
                    str = null;
                }
                p022s40.h.a(str, null, false, lVarV, 0, 6);
                companion = androidx.compose.ui.d.INSTANCE;
                f12 = 8;
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                androidx.compose.ui.d dVarC4 = v1.g0.c(h0Var4, companion, 1.0f, false, 2, null);
                lVarV.H(-483455358);
                z3.i0 i0VarA4 = v1.g.a(bVar4.g(), companion11.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC8 = lVarV.c();
                aVarA2 = companion12.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA8 = z3.a0.a(dVarC4);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA4, companion12.c());
                d4.b(lVarA2, xVarC8, companion12.e());
                pVarB2 = companion12.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA8.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar4 = v1.j.f117505a;
                String name4 = financialConnectionsInstitution.getName();
                p026y50.d dVar8 = p026y50.d.f125064a;
                long textDefault4 = dVar8.a(lVarV, 6).getTextDefault();
                TextStyle labelLargeEmphasized4 = dVar8.b(lVarV, 6).getLabelLargeEmphasized();
                t4.t.Companion companion13 = t4.t.INSTANCE;
                v2.b(name4, null, textDefault4, 0L, null, null, null, 0L, null, null, 0L, companion13.b(), false, 1, 0, null, labelLargeEmphasized4, lVarV, 0, 3120, 55290);
                v2.b(financialConnectionsInstitution.a(), null, dVar8.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion13.b(), false, 1, 0, null, dVar8.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
                lVarV = lVarV;
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                lVarV.H(-969287841);
                if (z15) {
                    v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                    Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z18 = z15;
                z19 = z16;
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
                }
                i3.f fVar5 = (i3.f) lVarV.U(z0.h());
                d3.c.Companion companion14 = d3.c.INSTANCE;
                d3.c.InterfaceC1212c interfaceC1212cI5 = companion14.i();
                androidx.compose.ui.d dVarA9 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                lVarV.H(-1190550912);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = u1.k.a();
                    lVarV.B(objI);
                }
                lVarV.T();
                androidx.compose.ui.d dVarB5 = androidx.compose.foundation.d.b(dVarA9, (u1.l) objI, null, z17, null, null, new l(fVar5, lVar, financialConnectionsInstitution), 24, null);
                if (z16) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                androidx.compose.ui.d dVarA10 = h3.a.a(dVarB5, f11);
                lVarV.H(693286680);
                v1.b bVar5 = v1.b.f117444a;
                z3.i0 i0VarB5 = v1.e0.b(bVar5.f(), interfaceC1212cI5, lVarV, 48);
                lVarV.H(-1323940314);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC9 = lVarV.c();
                b4.g.Companion companion15 = b4.g.INSTANCE;
                aVarA = companion15.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA9 = z3.a0.a(dVarA10);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarB5, companion15.c());
                d4.b(lVarA, xVarC9, companion15.e());
                pVarB = companion15.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA9.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var5 = v1.h0.f117504a;
                icon = financialConnectionsInstitution.getIcon();
                if (icon != null) {
                    str = icon.getDefault();
                } else {
                    str = null;
                }
                p022s40.h.a(str, null, false, lVarV, 0, 6);
                companion = androidx.compose.ui.d.INSTANCE;
                f12 = 8;
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                androidx.compose.ui.d dVarC5 = v1.g0.c(h0Var5, companion, 1.0f, false, 2, null);
                lVarV.H(-483455358);
                z3.i0 i0VarA5 = v1.g.a(bVar5.g(), companion14.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC10 = lVarV.c();
                aVarA2 = companion15.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA10 = z3.a0.a(dVarC5);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA5, companion15.c());
                d4.b(lVarA2, xVarC10, companion15.e());
                pVarB2 = companion15.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA10.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar5 = v1.j.f117505a;
                String name5 = financialConnectionsInstitution.getName();
                p026y50.d dVar9 = p026y50.d.f125064a;
                long textDefault5 = dVar9.a(lVarV, 6).getTextDefault();
                TextStyle labelLargeEmphasized5 = dVar9.b(lVarV, 6).getLabelLargeEmphasized();
                t4.t.Companion companion16 = t4.t.INSTANCE;
                v2.b(name5, null, textDefault5, 0L, null, null, null, 0L, null, null, 0L, companion16.b(), false, 1, 0, null, labelLargeEmphasized5, lVarV, 0, 3120, 55290);
                v2.b(financialConnectionsInstitution.a(), null, dVar9.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion16.b(), false, 1, 0, null, dVar9.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
                lVarV = lVarV;
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                lVarV.H(-969287841);
                if (z15) {
                    v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                    Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z18 = z15;
                z19 = z16;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new m(dVar4, financialConnectionsInstitution, z18, z19, lVar, i11, i12));
            }
        }
        i13 |= 3072;
        z14 = z12;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (lVarV.K(lVar)) {
                i16 = 16384;
            } else {
                i16 = PKIFailureInfo.certRevoked;
            }
            i13 |= i16;
        }
        if ((46811 & i13) == 9362) {
            if (i17 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i18 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i14 != 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
            }
            i3.f fVar6 = (i3.f) lVarV.U(z0.h());
            d3.c.Companion companion17 = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI6 = companion17.i();
            androidx.compose.ui.d dVarA11 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            lVarV.H(-1190550912);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarB6 = androidx.compose.foundation.d.b(dVarA11, (u1.l) objI, null, z17, null, null, new l(fVar6, lVar, financialConnectionsInstitution), 24, null);
            if (z16) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            androidx.compose.ui.d dVarA12 = h3.a.a(dVarB6, f11);
            lVarV.H(693286680);
            v1.b bVar6 = v1.b.f117444a;
            z3.i0 i0VarB6 = v1.e0.b(bVar6.f(), interfaceC1212cI6, lVarV, 48);
            lVarV.H(-1323940314);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC11 = lVarV.c();
            b4.g.Companion companion18 = b4.g.INSTANCE;
            aVarA = companion18.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA11 = z3.a0.a(dVarA12);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB6, companion18.c());
            d4.b(lVarA, xVarC11, companion18.e());
            pVarB = companion18.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA11.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var6 = v1.h0.f117504a;
            icon = financialConnectionsInstitution.getIcon();
            if (icon != null) {
                str = icon.getDefault();
            } else {
                str = null;
            }
            p022s40.h.a(str, null, false, lVarV, 0, 6);
            companion = androidx.compose.ui.d.INSTANCE;
            f12 = 8;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
            androidx.compose.ui.d dVarC6 = v1.g0.c(h0Var6, companion, 1.0f, false, 2, null);
            lVarV.H(-483455358);
            z3.i0 i0VarA6 = v1.g.a(bVar6.g(), companion17.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC12 = lVarV.c();
            aVarA2 = companion18.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA12 = z3.a0.a(dVarC6);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA6, companion18.c());
            d4.b(lVarA2, xVarC12, companion18.e());
            pVarB2 = companion18.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA12.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar6 = v1.j.f117505a;
            String name6 = financialConnectionsInstitution.getName();
            p026y50.d dVar10 = p026y50.d.f125064a;
            long textDefault6 = dVar10.a(lVarV, 6).getTextDefault();
            TextStyle labelLargeEmphasized6 = dVar10.b(lVarV, 6).getLabelLargeEmphasized();
            t4.t.Companion companion19 = t4.t.INSTANCE;
            v2.b(name6, null, textDefault6, 0L, null, null, null, 0L, null, null, 0L, companion19.b(), false, 1, 0, null, labelLargeEmphasized6, lVarV, 0, 3120, 55290);
            v2.b(financialConnectionsInstitution.a(), null, dVar10.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion19.b(), false, 1, 0, null, dVar10.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
            lVarV = lVarV;
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.H(-969287841);
            if (z15) {
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z18 = z15;
            z19 = z16;
        } else {
            if (i17 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i18 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i14 != 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1318839485, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:502)");
            }
            i3.f fVar7 = (i3.f) lVarV.U(z0.h());
            d3.c.Companion companion110 = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI7 = companion110.i();
            androidx.compose.ui.d dVarA13 = s2.a(g4.o.d(androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, k.f124799c, 1, null), financialConnectionsInstitution.getId());
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            lVarV.H(-1190550912);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarB7 = androidx.compose.foundation.d.b(dVarA13, (u1.l) objI, null, z17, null, null, new l(fVar7, lVar, financialConnectionsInstitution), 24, null);
            if (z16) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            androidx.compose.ui.d dVarA14 = h3.a.a(dVarB7, f11);
            lVarV.H(693286680);
            v1.b bVar7 = v1.b.f117444a;
            z3.i0 i0VarB7 = v1.e0.b(bVar7.f(), interfaceC1212cI7, lVarV, 48);
            lVarV.H(-1323940314);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC13 = lVarV.c();
            b4.g.Companion companion111 = b4.g.INSTANCE;
            aVarA = companion111.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA13 = z3.a0.a(dVarA14);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB7, companion111.c());
            d4.b(lVarA, xVarC13, companion111.e());
            pVarB = companion111.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA13.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var7 = v1.h0.f117504a;
            icon = financialConnectionsInstitution.getIcon();
            if (icon != null) {
                str = icon.getDefault();
            } else {
                str = null;
            }
            p022s40.h.a(str, null, false, lVarV, 0, 6);
            companion = androidx.compose.ui.d.INSTANCE;
            f12 = 8;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
            androidx.compose.ui.d dVarC7 = v1.g0.c(h0Var7, companion, 1.0f, false, 2, null);
            lVarV.H(-483455358);
            z3.i0 i0VarA7 = v1.g.a(bVar7.g(), companion110.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC14 = lVarV.c();
            aVarA2 = companion111.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA14 = z3.a0.a(dVarC7);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA7, companion111.c());
            d4.b(lVarA2, xVarC14, companion111.e());
            pVarB2 = companion111.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA14.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar7 = v1.j.f117505a;
            String name7 = financialConnectionsInstitution.getName();
            p026y50.d dVar11 = p026y50.d.f125064a;
            long textDefault7 = dVar11.a(lVarV, 6).getTextDefault();
            TextStyle labelLargeEmphasized7 = dVar11.b(lVarV, 6).getLabelLargeEmphasized();
            t4.t.Companion companion112 = t4.t.INSTANCE;
            v2.b(name7, null, textDefault7, 0L, null, null, null, 0L, null, null, 0L, companion112.b(), false, 1, 0, null, labelLargeEmphasized7, lVarV, 0, 3120, 55290);
            v2.b(financialConnectionsInstitution.a(), null, dVar11.a(lVarV, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, companion112.b(), false, 1, 0, null, dVar11.b(lVarV, 6).getLabelMedium(), lVarV, 0, 3120, 55290);
            lVarV = lVarV;
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.H(-969287841);
            if (z15) {
                v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(f12)), lVarV, 6);
                Function1.g(androidx.compose.foundation.layout.x.q(companion, w4.h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z18 = z15;
            z19 = z16;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new m(dVar4, financialConnectionsInstitution, z18, z19, lVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(w1.a0 a0Var, String str, String str2, wn0.l<? super String, jn0.h0> lVar, s50.a<InstitutionResponse> aVar, wn0.p<? super FinancialConnectionsInstitution, ? super Boolean, jn0.h0> pVar, InstitutionPickerState.Payload payload, wn0.a<jn0.h0> aVar2, wn0.a<jn0.h0> aVar3, p020r2.l lVar2, int i11) {
        p020r2.l lVarV = lVar2.v(-1197786032);
        if (p020r2.o.J()) {
            p020r2.o.S(-1197786032, i11, -1, "com.stripe.android.financialconnections.features.institutionpicker.LoadedContent (InstitutionPickerScreen.kt:155)");
        }
        Object[] objArr = new Object[0];
        lVarV.H(-453716433);
        boolean z11 = (((i11 & 112) ^ 48) > 32 && lVarV.n(str)) || (i11 & 48) == 32;
        Object objI = lVarV.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new r(str);
            lVarV.B(objI);
        }
        lVarV.T();
        p1 p1Var = (p1) a3.b.c(objArr, null, null, (wn0.a) objI, lVarV, 8, 6);
        lVarV.H(-453714165);
        Object objI2 = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI2 == companion.a()) {
            objI2 = s3.d(Boolean.TRUE, null, 2, null);
            lVarV.B(objI2);
        }
        p1 p1Var2 = (p1) objI2;
        lVarV.T();
        lVarV.H(-453711929);
        Object objI3 = lVarV.I();
        if (objI3 == companion.a()) {
            objI3 = new androidx.compose.ui.focus.o();
            lVarV.B(objI3);
        }
        androidx.compose.ui.focus.o oVar = (androidx.compose.ui.focus.o) objI3;
        lVarV.T();
        lVarV.H(773894976);
        lVarV.H(-492369756);
        Object objI4 = lVarV.I();
        if (objI4 == companion.a()) {
            p020r2.a0 a0Var2 = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
            lVarV.B(a0Var2);
            objI4 = a0Var2;
        }
        lVarV.T();
        CoroutineScope coroutineScope = ((p020r2.a0) objI4).getCoroutineScope();
        lVarV.T();
        lVarV.H(-453706390);
        Object objI5 = lVarV.I();
        if (objI5 == companion.a()) {
            objI5 = new n(p1Var2, null);
            lVarV.B(objI5);
        }
        lVarV.T();
        Function0.g(aVar, (wn0.p) objI5, lVarV, 72);
        Function0.g(Boolean.valueOf(a0Var.a()), new o(aVar, a0Var, aVar3, p1Var2, null), lVarV, 64);
        p026y50.f.d(null, androidx.compose.foundation.layout.t.c(w4.h.g(16), BitmapDescriptorFactory.HUE_RED, 2, null), false, false, false, null, false, a0Var, null, new p(payload, str2, pVar, aVar, aVar2, oVar, p1Var, lVar, coroutineScope, a0Var), lVarV, ((i11 << 21) & 29360128) | 48, 381);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new q(a0Var, str, str2, lVar, aVar, pVar, payload, aVar2, aVar3, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(p1<String> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(androidx.compose.ui.d dVar, boolean z11, wn0.a<jn0.h0> aVar, p020r2.l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        wn0.a<jn0.h0> aVar2;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar3;
        p020r2.l lVarV = lVar.v(709966841);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 896) == 0) {
                i13 |= lVarV.K(aVar2) ? 256 : 128;
            }
        }
        if ((i13 & 731) == 146 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
            lVar2 = lVarV;
        } else {
            androidx.compose.ui.d dVar4 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(709966841, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.ManualEntryRow (InstitutionPickerScreen.kt:425)");
            }
            d3.c.Companion companion = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI = companion.i();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(42395455);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarA = h3.a.a(androidx.compose.foundation.d.b(dVarF, (u1.l) objI, null, z11, null, null, aVar2, 24, null), z11 ? 1.0f : 0.3f);
            lVarV.H(693286680);
            v1.b bVar = v1.b.f117444a;
            z3.i0 i0VarB = v1.e0.b(bVar.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarA);
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
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVar2 = lVarV;
            p022s40.m.c(e4.e.c(i40.i.f75835a, lVarV, 0), null, null, a2.g.c(w4.h.g(12)), "Manually enter details", lVar2, 24584, 6);
            androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion3, w4.h.g(8)), lVar2, 6);
            lVar2.H(-483455358);
            z3.i0 i0VarA = v1.g.a(bVar.g(), companion.k(), lVar2, 0);
            lVar2.H(-1323940314);
            int iA2 = p020r2.j.a(lVar2, 0);
            p020r2.x xVarC2 = lVar2.c();
            wn0.a<b4.g> aVarA2 = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(companion3);
            if (lVar2.w() == null) {
                p020r2.j.c();
            }
            lVar2.h();
            if (lVar2.getInserting()) {
                lVar2.z(aVarA2);
            } else {
                lVar2.d();
            }
            p020r2.l lVarA2 = d4.a(lVar2);
            d4.b(lVarA2, i0VarA, companion2.c());
            d4.b(lVarA2, xVarC2, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion2.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVar2)), lVar2, 0);
            lVar2.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            String strC = e4.i.c(i40.k.C, lVar2, 0);
            p026y50.d dVar5 = p026y50.d.f125064a;
            dVar3 = dVar4;
            v2.b(strC, null, dVar5.a(lVar2, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar5.b(lVar2, 6).getLabelLargeEmphasized(), lVar2, 0, 0, 65530);
            v2.b(e4.i.c(i40.k.B, lVar2, 0), null, dVar5.a(lVar2, 6).getTextSubdued(), 0L, null, null, null, 0L, null, null, 0L, t4.t.INSTANCE.b(), false, 1, 0, null, dVar5.b(lVar2, 6).getLabelMedium(), lVar2, 0, 3120, 55290);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new s(dVar3, z11, aVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(androidx.compose.ui.d dVar, Boolean bool, wn0.a<jn0.h0> aVar, p020r2.l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        v50.g.StringId stringId;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar3;
        p020r2.l lVarV = lVar.v(-864577888);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(bool) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.K(aVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
            lVar2 = lVarV;
        } else {
            androidx.compose.ui.d dVar4 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(-864577888, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.NoResultsTile (InstitutionPickerScreen.kt:304)");
            }
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            d3.c.b bVarG = d3.c.INSTANCE.g();
            v1.b.f fVarB = v1.b.f117444a.b();
            lVarV.H(-483455358);
            z3.i0 i0VarA = v1.g.a(fVarB, bVarG, lVarV, 54);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarH);
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
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            String strC = e4.i.c(i40.k.F, lVarV, 0);
            p026y50.d dVar5 = p026y50.d.f125064a;
            int i15 = i13;
            androidx.compose.ui.d dVar6 = dVar4;
            v2.b(strC, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar5.b(lVarV, 6).getHeadingLarge(), lVarV, 0, 0, 65534);
            v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(16)), lVarV, 6);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (zBooleanValue) {
                stringId = new v50.g.StringId(i40.k.E, null, 2, null);
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                stringId = new v50.g.StringId(i40.k.D, null, 2, null);
            }
            lVarV.H(-246250032);
            boolean z11 = (i15 & 896) == 256;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new t(aVar);
                lVarV.B(objI);
            }
            lVarV.T();
            p023w50.n.a(stringId, (wn0.l) objI, TextStyle.e(dVar5.b(lVarV, 6).getBodyMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, t4.j.h(t4.j.INSTANCE.a()), null, 0L, null, null, null, null, null, null, 16744447, null), null, v0.f(jn0.x.a(p023w50.k.CLICKABLE, SpanStyle.b(dVar5.b(lVarV, 6).getBodyMediumEmphasized().O(), dVar5.a(lVarV, 6).getTextBrand(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null))), 0, 0, lVarV, 8, 104);
            lVar2 = lVarV;
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar3 = dVar6;
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new u(dVar3, bool, aVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(androidx.compose.ui.d dVar, wn0.a<jn0.h0> aVar, boolean z11, p020r2.l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        wn0.a<jn0.h0> aVar2;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar3;
        p020r2.l lVarV = lVar.v(533219366);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 112) == 0) {
                i13 |= lVarV.K(aVar2) ? 32 : 16;
            }
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.p(z11) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
            lVar2 = lVarV;
        } else {
            androidx.compose.ui.d dVar4 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(533219366, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchMoreRow (InstitutionPickerScreen.kt:467)");
            }
            d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(503645754);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVarV.B(objI);
            }
            lVarV.T();
            androidx.compose.ui.d dVarA = h3.a.a(androidx.compose.foundation.d.b(dVarF, (u1.l) objI, null, z11, null, null, aVar2, 24, null), z11 ? 1.0f : 0.3f);
            lVarV.H(693286680);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarA);
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
            d4.b(lVarA, i0VarB, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVar2 = lVarV;
            p022s40.m.c(e4.e.c(i40.i.f75842h, lVarV, 0), null, null, a2.g.c(w4.h.g(12)), "Add icon", lVar2, 24584, 6);
            v1.i0.a(androidx.compose.foundation.layout.x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), lVar2, 6);
            String strC = e4.i.c(i40.k.H, lVar2, 0);
            p026y50.d dVar5 = p026y50.d.f125064a;
            dVar3 = dVar4;
            v2.b(strC, null, dVar5.a(lVar2, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar5.b(lVar2, 6).getLabelLargeEmphasized(), lVar2, 0, 0, 65530);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new v(dVar3, aVar, z11, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0234  */
    /* JADX WARN: Code duplicated, block: B:90:0x023e  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void o(androidx.compose.ui.d dVar, androidx.compose.ui.focus.o oVar, String str, wn0.l<? super String, jn0.h0> lVar, p020r2.l lVar2, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        String str2;
        int i14;
        androidx.compose.ui.d dVar3;
        z2.a aVarB;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        String str3;
        boolean z11;
        boolean z12;
        Object objI;
        p020r2.l lVar3;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        p020r2.l lVarV = lVar2.v(1724050851);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(oVar) ? 32 : 16;
        }
        if ((i12 & 4) == 0) {
            if ((i11 & 896) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (lVarV.K(lVar)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 5851) == 1170 || !lVarV.b()) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1724050851, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchRow (InstitutionPickerScreen.kt:350)");
                }
                i3.f fVar = (i3.f) lVarV.U(z0.h());
                aVarB = null;
                float f11 = 8;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.t.l(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), p026y50.d.f125064a.a(lVarV, 6).getBackgroundSurface(), null, 2, null), w4.h.g(f11), w4.h.g(0), w4.h.g(f11), w4.h.g(f11));
                lVarV.H(733328855);
                z3.i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
                lVarV.H(-1323940314);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                b4.g.Companion companion = b4.g.INSTANCE;
                aVarA = companion.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarL);
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarJ, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                androidx.compose.ui.d dVarA = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), oVar);
                KeyboardOptions keyboardOptions = new KeyboardOptions(o4.x.INSTANCE.e(), false, 0, o4.r.INSTANCE.g(), 6, null);
                kotlin.z zVar = new kotlin.z(null, null, null, null, new w(fVar), null, 47, null);
                if (str2.length() > 0) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    z11 = true;
                    aVarB = z2.c.b(lVarV, 1918857846, true, new x(lVar));
                } else {
                    z11 = true;
                }
                lVarV.H(-2000649891);
                if ((i13 & 7168) == 2048) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                objI = lVarV.I();
                if (z12 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new y(lVar);
                    lVarV.B(objI);
                }
                wn0.l lVar4 = (wn0.l) objI;
                lVarV.T();
                y40.a aVar = y40.a.f124748a;
                lVar3 = lVarV;
                p023w50.m.a(str2, true, dVarA, lVar4, false, false, keyboardOptions, zVar, aVar.d(), null, aVarB, aVar.e(), null, lVar3, ((i13 >> 6) & 14) | 102236208, 48, 4656);
                lVar3.T();
                lVar3.g();
                lVar3.T();
                lVar3.T();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
            } else {
                lVarV.j();
                lVar3 = lVarV;
                dVar4 = dVar2;
            }
            w2VarX = lVar3.x();
            if (w2VarX != null) {
                w2VarX.a(new z(dVar4, oVar, str, lVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        str2 = str;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (lVarV.K(lVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1724050851, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchRow (InstitutionPickerScreen.kt:350)");
            }
            i3.f fVar2 = (i3.f) lVarV.U(z0.h());
            aVarB = null;
            float f12 = 8;
            androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.t.l(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), p026y50.d.f125064a.a(lVarV, 6).getBackgroundSurface(), null, 2, null), w4.h.g(f12), w4.h.g(0), w4.h.g(f12), w4.h.g(f12));
            lVarV.H(733328855);
            z3.i0 i0VarJ2 = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
            lVarV.H(-1323940314);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            aVarA = companion2.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(dVarL2);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ2, companion2.c());
            d4.b(lVarA, xVarC2, companion2.e());
            pVarB = companion2.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), oVar);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(o4.x.INSTANCE.e(), false, 0, o4.r.INSTANCE.g(), 6, null);
            kotlin.z zVar2 = new kotlin.z(null, null, null, null, new w(fVar2), null, 47, null);
            if (str2.length() > 0) {
                str3 = str2;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                z11 = true;
                aVarB = z2.c.b(lVarV, 1918857846, true, new x(lVar));
            } else {
                z11 = true;
            }
            lVarV.H(-2000649891);
            if ((i13 & 7168) == 2048) {
                z12 = z11;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (z12) {
                objI = new y(lVar);
                lVarV.B(objI);
            } else {
                objI = new y(lVar);
                lVarV.B(objI);
            }
            wn0.l lVar5 = (wn0.l) objI;
            lVarV.T();
            y40.a aVar2 = y40.a.f124748a;
            lVar3 = lVarV;
            p023w50.m.a(str2, true, dVarA2, lVar5, false, false, keyboardOptions2, zVar2, aVar2.d(), null, aVarB, aVar2.e(), null, lVar3, ((i13 >> 6) & 14) | 102236208, 48, 4656);
            lVar3.T();
            lVar3.g();
            lVar3.T();
            lVar3.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
        } else {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1724050851, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchRow (InstitutionPickerScreen.kt:350)");
            }
            i3.f fVar3 = (i3.f) lVarV.U(z0.h());
            aVarB = null;
            float f13 = 8;
            androidx.compose.ui.d dVarL3 = androidx.compose.foundation.layout.t.l(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), p026y50.d.f125064a.a(lVarV, 6).getBackgroundSurface(), null, 2, null), w4.h.g(f13), w4.h.g(0), w4.h.g(f13), w4.h.g(f13));
            lVarV.H(733328855);
            z3.i0 i0VarJ3 = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVarV, 0);
            lVarV.H(-1323940314);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            b4.g.Companion companion3 = b4.g.INSTANCE;
            aVarA = companion3.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA3 = z3.a0.a(dVarL3);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ3, companion3.c());
            d4.b(lVarA, xVarC3, companion3.e());
            pVarB = companion3.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarA3 = androidx.compose.ui.focus.p.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), oVar);
            KeyboardOptions keyboardOptions3 = new KeyboardOptions(o4.x.INSTANCE.e(), false, 0, o4.r.INSTANCE.g(), 6, null);
            kotlin.z zVar3 = new kotlin.z(null, null, null, null, new w(fVar3), null, 47, null);
            if (str2.length() > 0) {
                str3 = str2;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                z11 = true;
                aVarB = z2.c.b(lVarV, 1918857846, true, new x(lVar));
            } else {
                z11 = true;
            }
            lVarV.H(-2000649891);
            if ((i13 & 7168) == 2048) {
                z12 = z11;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (z12) {
                objI = new y(lVar);
                lVarV.B(objI);
            } else {
                objI = new y(lVar);
                lVarV.B(objI);
            }
            wn0.l lVar6 = (wn0.l) objI;
            lVarV.T();
            y40.a aVar3 = y40.a.f124748a;
            lVar3 = lVarV;
            p023w50.m.a(str2, true, dVarA3, lVar6, false, false, keyboardOptions3, zVar3, aVar3.d(), null, aVarB, aVar3.e(), null, lVar3, ((i13 >> 6) & 14) | 102236208, 48, 4656);
            lVar3.T();
            lVar3.g();
            lVar3.T();
            lVar3.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
        }
        w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new z(dVar4, oVar, str, lVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar3;
        p020r2.l lVarV = lVar.v(-827300725);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
            dVar3 = dVar2;
        } else {
            androidx.compose.ui.d dVar4 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(-827300725, i13, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchTitle (InstitutionPickerScreen.kt:335)");
            }
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(dVar4, BitmapDescriptorFactory.HUE_RED, 1, null);
            String strC = e4.i.c(i40.k.G, lVarV, 0);
            p026y50.d dVar5 = p026y50.d.f125064a;
            lVar2 = lVarV;
            dVar3 = dVar4;
            v2.b(strC, dVarH, dVar5.a(lVarV, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar5.b(lVarV, 6).getHeadingXLarge(), lVar2, 0, 0, 65528);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a0(dVar3, i11, i12));
        }
    }
}
