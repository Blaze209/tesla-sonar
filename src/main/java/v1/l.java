package v1;

import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.r1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R+\u0010-\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lv1/l;", "Lz3/b0;", "La4/d;", "Landroidx/compose/ui/platform/r1;", "Lv1/m0;", "insets", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "Lkotlin/Function2;", "Lw4/d;", "", "heightCalc", "<init>", "(Lv1/m0;Lwn0/l;Lwn0/p;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "La4/k;", "scope", "h", "(La4/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lv1/m0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "<set-?>", "e", "Lr2/p1;", IntegerTokenConverter.CONVERTER_KEY, "()Lv1/m0;", "m", "(Lv1/m0;)V", "unconsumedInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l extends r1 implements z3.b0, a4.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 insets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<m0, w4.d, Integer> heightCalc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 unconsumedInsets;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f117516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0 w0Var) {
            super(1);
            this.f117516c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f117516c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(m0 m0Var, wn0.l<? super q1, jn0.h0> lVar, wn0.p<? super m0, ? super w4.d, Integer> pVar) {
        super(lVar);
        this.insets = m0Var;
        this.heightCalc = pVar;
        this.unconsumedInsets = s3.d(m0Var, null, 2, null);
    }

    private final m0 i() {
        return (m0) this.unconsumedInsets.getValue();
    }

    private final void m(m0 m0Var) {
        this.unconsumedInsets.setValue(m0Var);
    }

    @Override // z3.b0
    public z3.j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
        int iIntValue = this.heightCalc.invoke(i(), k0Var).intValue();
        if (iIntValue == 0) {
            return z3.k0.N1(k0Var, 0, 0, null, a.f117515c, 4, null);
        }
        w0 w0VarX0 = h0Var.x0(w4.b.d(j11, 0, 0, iIntValue, iIntValue, 3, null));
        return z3.k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), iIntValue, null, new b(w0VarX0), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return p013kotlin.jvm.internal.s.f(this.insets, lVar.insets) && this.heightCalc == lVar.heightCalc;
    }

    @Override // a4.d
    public void h(a4.k scope) {
        m(o0.e(this.insets, (m0) scope.I(p0.a())));
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f117515c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }

        public final void a(w0.a aVar) {
        }
    }
}
