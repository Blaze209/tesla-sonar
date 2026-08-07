package m60;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import c60.LinkConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc60/d;", "linkConfigurationCoordinator", "Lc60/c;", "configuration", "Lm60/k;", "linkSignupMode", "", "enabled", "Lkotlin/Function1;", "Lm60/e;", "Ljn0/h0;", "onLinkSignupStateChanged", "a", "(Lc60/d;Lc60/c;Lm60/k;ZLwn0/l;Lr2/l;I)V", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c60.d f91383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinkConfiguration f91384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f91385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f91386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<InlineSignupViewState, h0> f91387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f91388h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c60.d dVar, LinkConfiguration linkConfiguration, k kVar, boolean z11, wn0.l<? super InlineSignupViewState, h0> lVar, int i11) {
            super(2);
            this.f91383c = dVar;
            this.f91384d = linkConfiguration;
            this.f91385e = kVar;
            this.f91386f = z11;
            this.f91387g = lVar;
            this.f91388h = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.a(this.f91383c, this.f91384d, this.f91385e, this.f91386f, this.f91387g, lVar, k2.a(this.f91388h | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f91389c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91390a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.InsteadOfSaveForFutureUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AlongsideSaveForFutureUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91390a = iArr;
        }
    }

    public static final void a(c60.d linkConfigurationCoordinator, LinkConfiguration configuration, k linkSignupMode, boolean z11, wn0.l<? super InlineSignupViewState, h0> onLinkSignupStateChanged, p020r2.l lVar, int i11) {
        s.k(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        s.k(configuration, "configuration");
        s.k(linkSignupMode, "linkSignupMode");
        s.k(onLinkSignupStateChanged, "onLinkSignupStateChanged");
        p020r2.l lVarV = lVar.v(-868353516);
        if (o.J()) {
            o.S(-868353516, i11, -1, "com.stripe.android.link.ui.inline.LinkElement (LinkElement.kt:24)");
        }
        lVarV.H(1371639076);
        boolean zN = ((((i11 & 14) ^ 6) > 4 && lVarV.n(linkConfigurationCoordinator)) || (i11 & 6) == 4) | lVarV.n(configuration);
        Object objI = lVarV.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = linkConfigurationCoordinator.f(configuration);
            lVarV.B(objI);
        }
        lVarV.T();
        Object objC = a3.b.c(new Object[]{linkConfigurationCoordinator, configuration}, null, null, b.f91389c, lVarV, 3080, 6);
        s.j(objC, "rememberSaveable(...)");
        String str = (String) objC;
        m60.c.a aVar = new m60.c.a(linkSignupMode, (f60.b) objI);
        lVarV.H(1729797275);
        f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c1 c1VarC = n7.c.c(m60.c.class, f1VarA, str, aVar, f1VarA instanceof n ? ((n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
        lVarV.T();
        m60.c cVar = (m60.c) c1VarC;
        int i12 = c.f91390a[cVar.getSignupMode().ordinal()];
        if (i12 == 1) {
            lVarV.H(-428303447);
            int i13 = i11 >> 6;
            h.g(cVar, z11, onLinkSignupStateChanged, x.h(t.k(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(6), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, (i13 & 112) | 3080 | (i13 & 896), 0);
            lVarV.T();
        } else if (i12 != 2) {
            lVarV.H(-427637412);
            lVarV.T();
        } else {
            lVarV.H(-427946079);
            int i14 = i11 >> 6;
            i.d(cVar, z11, onLinkSignupStateChanged, x.h(t.k(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(6), 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), lVarV, (i14 & 112) | 3080 | (i14 & 896), 0);
            lVarV.T();
        }
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(linkConfigurationCoordinator, configuration, linkSignupMode, z11, onLinkSignupStateChanged, i11));
        }
    }
}
