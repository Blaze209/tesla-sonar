package v50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import jn0.h0;
import l50.FinancialConnectionsSheetNativeActivityArgs;
import o50.i;
import p011ja.g0;
import p011ja.w;
import p011ja.z;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p026y50.h;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\" \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0018\u0010 \u001a\u00020\t*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lja/z;", "", "currentRoute", "Lo50/i;", "popUpTo", "Ljn0/h0;", "c", "(Lja/z;Ljava/lang/String;Lo50/i;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "Ly50/h;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Ly50/h;", "Lr2/g2;", "Lja/w;", "a", "Lr2/g2;", "e", "()Lr2/g2;", "LocalNavHostController", "", "b", "f", "LocalTestMode", "Lo90/f;", DateTokenConverter.CONVERTER_KEY, "LocalImageLoader", "Lq50/a;", "g", "LocalTopAppBarHost", "Ll50/e;", "h", "(Ll50/e;)Ly50/h;", "theme", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<w> f117896a = p020r2.w.f(C2532b.f117901c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<Boolean> f117897b = p020r2.w.f(c.f117902c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g2<o90.f> f117898c = p020r2.w.f(a.f117900c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g2<q50.a> f117899d = p020r2.w.f(d.f117903c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo90/f;", "b", "()Lo90/f;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<o90.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f117900c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o90.f invoke() {
            throw new IllegalStateException("No ImageLoader provided");
        }
    }

    /* JADX INFO: renamed from: v50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/w;", "b", "()Lja/w;"}, k = 3, mv = {1, 9, 0})
    static final class C2532b extends u implements wn0.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2532b f117901c = new C2532b();

        C2532b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            throw new IllegalStateException("No NavHostController provided");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f117902c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            throw new IllegalStateException("No TestMode provided");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq50/a;", "b", "()Lq50/a;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<q50.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f117903c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q50.a invoke() {
            throw new IllegalStateException("No TopAppBarHost provided");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117904a;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Theme.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.DASHBOARD_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LINK_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117904a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/g0;", "Ljn0/h0;", "a", "(Lja/g0;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements l<g0, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f117905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(1);
            this.f117905c = iVar;
        }

        public final void a(g0 popUpTo) {
            s.k(popUpTo, "$this$popUpTo");
            popUpTo.c(this.f117905c.getInclusive());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var) {
            a(g0Var);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(z zVar, String str, i iVar) {
        if (!(iVar instanceof i.Current)) {
            if (!(iVar instanceof i.Route)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((i.Route) iVar).getRoute();
        }
        if (str != null) {
            zVar.d(str, new f(iVar));
        }
    }

    public static final g2<o90.f> d() {
        return f117898c;
    }

    public static final g2<w> e() {
        return f117896a;
    }

    public static final g2<Boolean> f() {
        return f117897b;
    }

    public static final g2<q50.a> g() {
        return f117899d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h h(FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs) {
        h hVarI;
        FinancialConnectionsSessionManifest.Theme theme = financialConnectionsSheetNativeActivityArgs.getInitialSyncResponse().getManifest().getTheme();
        return (theme == null || (hVarI = i(theme)) == null) ? h.INSTANCE.a() : hVarI;
    }

    public static final h i(FinancialConnectionsSessionManifest.Theme theme) {
        s.k(theme, "<this>");
        int i11 = e.f117904a[theme.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return h.DefaultLight;
        }
        if (i11 == 3) {
            return h.LinkLight;
        }
        throw new NoWhenBranchMatchedException();
    }
}
