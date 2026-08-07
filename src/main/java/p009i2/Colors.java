package p009i2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.n3;
import p020r2.p1;

/* JADX INFO: renamed from: i2.r, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0092\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR1\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR1\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR1\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b(\u0010\u001dR1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b-\u0010\u001dR1\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b/\u0010\u001dR1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b1\u0010\u001dR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b2\u0010\u001dR1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b3\u0010\u001dR1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b4\u0010\u001dR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Li2/r;", "", "Lk3/p1;", "primary", "primaryVariant", "secondary", "secondaryVariant", AppStateModule.APP_STATE_BACKGROUND, "surface", AnalyticsAttribute.Error, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JJJJJJJJJJJJZ)Li2/r;", "", "toString", "()Ljava/lang/String;", "<set-?>", "Lr2/p1;", "j", "()J", "x", "(J)V", "b", "k", "y", "c", "l", "z", DateTokenConverter.CONVERTER_KEY, "m", "A", "e", "p", "f", "n", "B", "g", "q", "h", "u", IntegerTokenConverter.CONVERTER_KEY, "v", "s", "w", "t", "o", "()Z", "r", "(Z)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Colors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 primaryVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 secondary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 secondaryVariant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 background;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 surface;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 error;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p1 onPrimary;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p1 onSecondary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p1 onBackground;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 onSurface;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p1 onError;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p1 isLight;

    public /* synthetic */ Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11);
    }

    public final void A(long j11) {
        this.secondaryVariant.setValue(k3.p1.l(j11));
    }

    public final void B(long j11) {
        this.surface.setValue(k3.p1.l(j11));
    }

    public final Colors a(long primary, long primaryVariant, long secondary, long secondaryVariant, long background, long surface, long error, long onPrimary, long onSecondary, long onBackground, long onSurface, long onError, boolean isLight) {
        return new Colors(primary, primaryVariant, secondary, secondaryVariant, background, surface, error, onPrimary, onSecondary, onBackground, onSurface, onError, isLight, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((k3.p1) this.background.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((k3.p1) this.error.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((k3.p1) this.onBackground.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((k3.p1) this.onError.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((k3.p1) this.onPrimary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((k3.p1) this.onSecondary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        return ((k3.p1) this.onSurface.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j() {
        return ((k3.p1) this.primary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k() {
        return ((k3.p1) this.primaryVariant.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        return ((k3.p1) this.secondary.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((k3.p1) this.secondaryVariant.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n() {
        return ((k3.p1) this.surface.getValue()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        return ((Boolean) this.isLight.getValue()).booleanValue();
    }

    public final void p(long j11) {
        this.background.setValue(k3.p1.l(j11));
    }

    public final void q(long j11) {
        this.error.setValue(k3.p1.l(j11));
    }

    public final void r(boolean z11) {
        this.isLight.setValue(Boolean.valueOf(z11));
    }

    public final void s(long j11) {
        this.onBackground.setValue(k3.p1.l(j11));
    }

    public final void t(long j11) {
        this.onError.setValue(k3.p1.l(j11));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) k3.p1.y(j())) + ", primaryVariant=" + ((Object) k3.p1.y(k())) + ", secondary=" + ((Object) k3.p1.y(l())) + ", secondaryVariant=" + ((Object) k3.p1.y(m())) + ", background=" + ((Object) k3.p1.y(c())) + ", surface=" + ((Object) k3.p1.y(n())) + ", error=" + ((Object) k3.p1.y(d())) + ", onPrimary=" + ((Object) k3.p1.y(g())) + ", onSecondary=" + ((Object) k3.p1.y(h())) + ", onBackground=" + ((Object) k3.p1.y(e())) + ", onSurface=" + ((Object) k3.p1.y(i())) + ", onError=" + ((Object) k3.p1.y(f())) + ", isLight=" + o() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u(long j11) {
        this.onPrimary.setValue(k3.p1.l(j11));
    }

    public final void v(long j11) {
        this.onSecondary.setValue(k3.p1.l(j11));
    }

    public final void w(long j11) {
        this.onSurface.setValue(k3.p1.l(j11));
    }

    public final void x(long j11) {
        this.primary.setValue(k3.p1.l(j11));
    }

    public final void y(long j11) {
        this.primaryVariant.setValue(k3.p1.l(j11));
    }

    public final void z(long j11) {
        this.secondary.setValue(k3.p1.l(j11));
    }

    private Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        this.primary = n3.h(k3.p1.l(j11), n3.q());
        this.primaryVariant = n3.h(k3.p1.l(j12), n3.q());
        this.secondary = n3.h(k3.p1.l(j13), n3.q());
        this.secondaryVariant = n3.h(k3.p1.l(j14), n3.q());
        this.background = n3.h(k3.p1.l(j15), n3.q());
        this.surface = n3.h(k3.p1.l(j16), n3.q());
        this.error = n3.h(k3.p1.l(j17), n3.q());
        this.onPrimary = n3.h(k3.p1.l(j18), n3.q());
        this.onSecondary = n3.h(k3.p1.l(j19), n3.q());
        this.onBackground = n3.h(k3.p1.l(j21), n3.q());
        this.onSurface = n3.h(k3.p1.l(j22), n3.q());
        this.onError = n3.h(k3.p1.l(j23), n3.q());
        this.isLight = n3.h(Boolean.valueOf(z11), n3.q());
    }
}
