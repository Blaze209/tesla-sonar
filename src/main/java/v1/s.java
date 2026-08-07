package v1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0007R+\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010\u0007R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lv1/s;", "Lz3/b0;", "La4/d;", "La4/j;", "Lv1/m0;", "insets", "<init>", "(Lv1/m0;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "La4/k;", "scope", "Ljn0/h0;", "h", "(La4/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lv1/m0;", "<set-?>", "Lr2/p1;", "m", "()Lv1/m0;", "r", "unconsumedInsets", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "p", "consumedInsets", "La4/l;", "getKey", "()La4/l;", Action.KEY_ATTRIBUTE, "o", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements z3.b0, a4.d, a4.j<m0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 insets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 unconsumedInsets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 consumedInsets;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f117576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f117577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f117578e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, int i11, int i12) {
            super(1);
            this.f117576c = w0Var;
            this.f117577d = i11;
            this.f117578e = i12;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f117576c, this.f117577d, this.f117578e, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    public s(m0 m0Var) {
        this.insets = m0Var;
        this.unconsumedInsets = s3.d(m0Var, null, 2, null);
        this.consumedInsets = s3.d(m0Var, null, 2, null);
    }

    private final m0 i() {
        return (m0) this.consumedInsets.getValue();
    }

    private final m0 m() {
        return (m0) this.unconsumedInsets.getValue();
    }

    private final void p(m0 m0Var) {
        this.consumedInsets.setValue(m0Var);
    }

    private final void r(m0 m0Var) {
        this.unconsumedInsets.setValue(m0Var);
    }

    @Override // z3.b0
    public z3.j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
        int iC = m().c(k0Var, k0Var.getLayoutDirection());
        int iD = m().d(k0Var);
        int iA = m().a(k0Var, k0Var.getLayoutDirection()) + iC;
        int iB = m().b(k0Var) + iD;
        w0 w0VarX0 = h0Var.x0(w4.c.o(j11, -iA, -iB));
        return z3.k0.N1(k0Var, w4.c.i(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + iA), w4.c.h(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iB), null, new a(w0VarX0, iC, iD), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof s) {
            return p013kotlin.jvm.internal.s.f(((s) other).insets, this.insets);
        }
        return false;
    }

    @Override // a4.j
    public a4.l<m0> getKey() {
        return p0.a();
    }

    @Override // a4.d
    public void h(a4.k scope) {
        m0 m0Var = (m0) scope.I(p0.a());
        r(o0.e(this.insets, m0Var));
        p(o0.f(m0Var, this.insets));
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // a4.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m0 getValue() {
        return i();
    }
}
