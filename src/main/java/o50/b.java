package o50;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p011ja.b0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.k2;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b0\u0018\u0000 *2\u00020\u0001:\u0016\u0011\u001b\u001f!%\u0019\u0016,-./0123456789:BE\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001b\u0010+\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0001\u0015;<=>?@ABCDEFGHIJKLMNO¨\u0006Q²\u0006\u000e\u0010P\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lo50/b;", "", "", PlaceTypes.ROUTE, "", "closeWithoutConfirmation", "logPaneLaunched", "", "Lja/e;", "extraArgs", "Lkotlin/Function1;", "Lja/k;", "Ljn0/h0;", "composable", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Lwn0/q;)V", "navBackStackEntry", "a", "(Lja/k;Lr2/l;I)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "", "j", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Ljava/lang/String;", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Z", "f", "()Z", "c", "h", DateTokenConverter.CONVERTER_KEY, "Lwn0/q;", "getComposable", "()Lwn0/q;", "e", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "Lkotlin/Lazy;", "g", "fullRoute", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Lo50/b$a;", "Lo50/b$b;", "Lo50/b$c;", "Lo50/b$d;", "Lo50/b$i;", "Lo50/b$j;", "Lo50/b$k;", "Lo50/b$l;", "Lo50/b$m;", "Lo50/b$n;", "Lo50/b$o;", "Lo50/b$p;", "Lo50/b$q;", "Lo50/b$r;", "Lo50/b$s;", "Lo50/b$t;", "Lo50/b$u;", "Lo50/b$v;", "Lo50/b$w;", "Lo50/b$x;", "Lo50/b$y;", "paneLaunchedTriggered", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f96727h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean closeWithoutConfirmation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean logPaneLaunched;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.q<p011ja.k, p020r2.l, Integer, h0> composable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p011ja.e> arguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy fullRoute;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$a;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f96734i = new a();

        private a() {
            super(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER.getValue(), false, true, null, o50.a.f96683a.q(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1299547952;
        }

        public String toString() {
            return "AccountPicker";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        a0() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            List<p011ja.e> listE = b.this.e();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((p011ja.e) it.next()).c());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(p013kotlin.collections.v.y(arrayList, 10)), 16));
            for (Object obj : arrayList) {
                linkedHashMap.put(obj, "{" + ((String) obj) + "}");
            }
            return o50.c.a(b.this.getRoute(), linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: o50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$b;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C2057b extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C2057b f96736i = new C2057b();

        private C2057b() {
            super(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED.getValue(), false, false, null, o50.a.f96683a.j(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C2057b);
        }

        public int hashCode() {
            return -283574838;
        }

        public String toString() {
            return "AccountUpdateRequired";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$c;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f96737i = new c();

        private c() {
            super(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT.getValue(), false, true, null, o50.a.f96683a.t(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1220396016;
        }

        public String toString() {
            return "AttachLinkedPaymentAccount";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$d;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f96738i = new d();

        private d() {
            super(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.getValue(), false, true, null, o50.a.f96683a.m(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -501991012;
        }

        public String toString() {
            return "BankAuthRepair";
        }
    }

    /* JADX INFO: renamed from: o50.b$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lo50/b$e;", "", "<init>", "()V", "Landroid/os/Bundle;", "args", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "a", "(Landroid/os/Bundle;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "KEY_NEXT_PANE_ON_DISABLE_NETWORKING", "Ljava/lang/String;", "KEY_REFERRER", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSessionManifest.Pane a(Bundle args) {
            String string;
            FinancialConnectionsSessionManifest.Pane pane = null;
            if (args == null || (string = args.getString("referrer")) == null) {
                return null;
            }
            for (FinancialConnectionsSessionManifest.Pane pane2 : FinancialConnectionsSessionManifest.Pane.getEntries()) {
                if (p013kotlin.jvm.internal.s.f(pane2.getValue(), string)) {
                    pane = pane2;
                    break;
                }
            }
            return pane;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.Destination$Composable$1", f = "Destination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96739n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p011ja.k f96740o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ s50.f f96741p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f96742q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p011ja.k kVar, s50.f fVar, p1<Boolean> p1Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f96740o = kVar;
            this.f96741p = fVar;
            this.f96742q = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f96740o, this.f96741p, this.f96742q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f96739n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            FinancialConnectionsSessionManifest.Pane paneA = b.INSTANCE.a(this.f96740o.c());
            this.f96741p.Z(o50.d.b(this.f96740o.getDestination()), paneA);
            b.c(this.f96742q, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p011ja.k f96744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96745e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p011ja.k kVar, int i11) {
            super(2);
            this.f96744d = kVar;
            this.f96745e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.this.a(this.f96744d, lVar, k2.a(this.f96745e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f96746c = new h();

        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.FALSE, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$i;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final i f96747i = new i();

        private i() {
            super(FinancialConnectionsSessionManifest.Pane.CONSENT.getValue(), true, true, null, o50.a.f96683a.l(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 170523535;
        }

        public String toString() {
            return "Consent";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$j;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final j f96748i = new j();

        private j() {
            super(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR.getValue(), false, false, null, o50.a.f96683a.k(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return -498440515;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$k;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final k f96749i = new k();

        private k() {
            super(FinancialConnectionsSessionManifest.Pane.EXIT.getValue(), false, false, null, o50.a.f96683a.h(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        public int hashCode() {
            return -1124451895;
        }

        public String toString() {
            return "Exit";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$l;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final l f96750i = new l();

        private l() {
            super(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.getValue(), false, true, null, o50.a.f96683a.a(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return -1980129893;
        }

        public String toString() {
            return "InstitutionPicker";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$m;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final m f96751i = new m();

        private m() {
            super(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER.getValue(), false, true, null, o50.a.f96683a.e(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return 637099126;
        }

        public String toString() {
            return "LinkAccountPicker";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$n;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final n f96752i = new n();

        private n() {
            super(FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION.getValue(), false, true, null, o50.a.f96683a.f(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        public int hashCode() {
            return 2029654983;
        }

        public String toString() {
            return "LinkStepUpVerification";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$o;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final o f96753i = new o();

        private o() {
            super(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue(), false, true, null, o50.a.f96683a.s(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        public int hashCode() {
            return 299603265;
        }

        public String toString() {
            return "ManualEntry";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$p;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final p f96754i = new p();

        private p() {
            super(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS.getValue(), true, true, null, o50.a.f96683a.n(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof p);
        }

        public int hashCode() {
            return -1795356798;
        }

        public String toString() {
            return "ManualEntrySuccess";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$q;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final q f96755i = new q();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/i;", "Ljn0/h0;", "a", "(Lja/i;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<p011ja.i, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f96756c = new a();

            a() {
                super(1);
            }

            public final void a(p011ja.i navArgument) {
                p013kotlin.jvm.internal.s.k(navArgument, "$this$navArgument");
                navArgument.c(b0.f83209q);
                navArgument.b(true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p011ja.i iVar) {
                a(iVar);
                return h0.f84049a;
            }
        }

        private q() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP.getValue(), false, true, p013kotlin.collections.v.e(p011ja.f.a("next_pane_on_disable_networking", a.f96756c)), o50.a.f96683a.b(), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q);
        }

        public int hashCode() {
            return 2003945200;
        }

        public String toString() {
            return "NetworkingLinkLoginWarmup";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$r;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final r f96757i = new r();

        private r() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE.getValue(), false, true, null, o50.a.f96683a.u(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        public int hashCode() {
            return -498526607;
        }

        public String toString() {
            return "NetworkingLinkSignup";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$s;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final s f96758i = new s();

        private s() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION.getValue(), false, true, null, o50.a.f96683a.c(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof s);
        }

        public int hashCode() {
            return -309046092;
        }

        public String toString() {
            return "NetworkingLinkVerification";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$t;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final t f96759i = new t();

        private t() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION.getValue(), false, true, null, o50.a.f96683a.d(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof t);
        }

        public int hashCode() {
            return -206442900;
        }

        public String toString() {
            return "NetworkingSaveToLinkVerification";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$u;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final u f96760i = new u();

        private u() {
            super(FinancialConnectionsSessionManifest.Pane.NOTICE.getValue(), false, false, null, o50.a.f96683a.i(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof u);
        }

        public int hashCode() {
            return 1983158467;
        }

        public String toString() {
            return "Notice";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$v;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final v f96761i = new v();

        private v() {
            super(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue(), false, true, null, o50.a.f96683a.p(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof v);
        }

        public int hashCode() {
            return 1608450949;
        }

        public String toString() {
            return "PartnerAuth";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$w;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final w f96762i = new w();

        private w() {
            super(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.getValue(), false, true, null, o50.a.f96683a.o(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof w);
        }

        public int hashCode() {
            return 1701540054;
        }

        public String toString() {
            return "PartnerAuthDrawer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$x;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final x f96763i = new x();

        private x() {
            super(FinancialConnectionsSessionManifest.Pane.RESET.getValue(), false, true, null, o50.a.f96683a.g(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof x);
        }

        public int hashCode() {
            return -486821372;
        }

        public String toString() {
            return "Reset";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo50/b$y;", "Lo50/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final y f96764i = new y();

        private y() {
            super(FinancialConnectionsSessionManifest.Pane.SUCCESS.getValue(), true, true, null, o50.a.f96683a.r(), 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof y);
        }

        public int hashCode() {
            return 1646820216;
        }

        public String toString() {
            return "Success";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/i;", "Ljn0/h0;", "a", "(Lja/i;)V"}, k = 3, mv = {1, 9, 0})
    static final class z extends p013kotlin.jvm.internal.u implements wn0.l<p011ja.i, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f96765c = new z();

        z() {
            super(1);
        }

        public final void a(p011ja.i navArgument) {
            p013kotlin.jvm.internal.s.k(navArgument, "$this$navArgument");
            navArgument.c(b0.f83209q);
            navArgument.b(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p011ja.i iVar) {
            a(iVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ b(String str, boolean z11, boolean z12, List list, wn0.q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, z12, list, qVar);
    }

    private static final boolean b(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String k(b bVar, FinancialConnectionsSessionManifest.Pane pane, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i11 & 2) != 0) {
            map = v0.i();
        }
        return bVar.j(pane, map);
    }

    public final void a(p011ja.k navBackStackEntry, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(navBackStackEntry, "navBackStackEntry");
        p020r2.l lVarV = lVar.v(-1572890450);
        if (p020r2.o.J()) {
            p020r2.o.S(-1572890450, i11, -1, "com.stripe.android.financialconnections.navigation.Destination.Composable (Destination.kt:69)");
        }
        s50.f fVarB = s50.g.b(lVarV, 0);
        p1 p1Var = (p1) a3.b.c(new Object[0], null, null, h.f96746c, lVarV, 3080, 6);
        lVarV.H(2000782973);
        if (!b(p1Var)) {
            Function0.g(h0.f84049a, new f(navBackStackEntry, fVarB, p1Var, null), lVarV, 70);
        }
        lVarV.T();
        this.composable.invoke(navBackStackEntry, lVarV, 8);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(navBackStackEntry, i11));
        }
    }

    public final List<p011ja.e> e() {
        return this.arguments;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCloseWithoutConfirmation() {
        return this.closeWithoutConfirmation;
    }

    public final String g() {
        return (String) this.fullRoute.getValue();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getLogPaneLaunched() {
        return this.logPaneLaunched;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final String getRoute() {
        return this.route;
    }

    public final String j(FinancialConnectionsSessionManifest.Pane referrer, Map<String, String> extraArgs) {
        p013kotlin.jvm.internal.s.k(referrer, "referrer");
        p013kotlin.jvm.internal.s.k(extraArgs, "extraArgs");
        return o50.c.a(this.route, v0.s(extraArgs, jn0.x.a("referrer", referrer.getValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(String str, boolean z11, boolean z12, List<p011ja.e> list, wn0.q<? super p011ja.k, ? super p020r2.l, ? super Integer, h0> qVar) {
        this.route = str;
        this.closeWithoutConfirmation = z11;
        this.logPaneLaunched = z12;
        this.composable = qVar;
        this.arguments = p013kotlin.collections.v.P0(p013kotlin.collections.v.e(p011ja.f.a("referrer", z.f96765c)), list);
        this.fullRoute = jn0.m.b(new a0());
    }

    public /* synthetic */ b(String str, boolean z11, boolean z12, List list, wn0.q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, z12, (i11 & 8) != 0 ? p013kotlin.collections.v.m() : list, qVar, null);
    }
}
