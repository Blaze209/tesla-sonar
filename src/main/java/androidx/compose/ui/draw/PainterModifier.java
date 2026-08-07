package androidx.compose.ui.draw;

import b4.b0;
import b4.r;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import j3.m;
import j3.n;
import jn0.h0;
import k3.q1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w4.s;
import wn0.l;
import z3.e1;
import z3.j0;
import z3.k;
import z3.k0;
import z3.q;
import z3.w0;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010.\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010:R\u0014\u0010V\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lb4/r;", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "Ld3/c;", "alignment", "Lz3/k;", "contentScale", "", "alpha", "Lk3/q1;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/b;ZLd3/c;Lz3/k;FLk3/q1;)V", "Lj3/m;", "dstSize", "x2", "(J)J", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "D2", "C2", "(J)Z", "B2", "Lz3/k0;", "Lz3/h0;", "measurable", "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Gender.MALE, Snapshot.WIDTH, "q", "n", "Lm3/c;", "Ljn0/h0;", Gender.FEMALE, "(Lm3/c;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/b;", "y2", "()Landroidx/compose/ui/graphics/painter/b;", "H2", "(Landroidx/compose/ui/graphics/painter/b;)V", "Z", "z2", "()Z", "I2", "(Z)V", "o", "Ld3/c;", "getAlignment", "()Ld3/c;", "E2", "(Ld3/c;)V", "p", "Lz3/k;", "getContentScale", "()Lz3/k;", "G2", "(Lz3/k;)V", "getAlpha", "()F", "a", "(F)V", "r", "Lk3/q1;", "getColorFilter", "()Lk3/q1;", "F2", "(Lk3/q1;)V", "A2", "useIntrinsicSize", "c2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PainterModifier extends androidx.compose.ui.d.c implements b0, r {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private d3.c alignment;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private k contentScale;
    private androidx.compose.ui.graphics.painter.b painter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private q1 colorFilter;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f5298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f5298c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f5298c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public PainterModifier(androidx.compose.ui.graphics.painter.b bVar, boolean z11, d3.c cVar, k kVar, float f11, q1 q1Var) {
        this.painter = bVar;
        this.sizeToIntrinsics = z11;
        this.alignment = cVar;
        this.contentScale = kVar;
        this.alpha = f11;
        this.colorFilter = q1Var;
    }

    private final boolean A2() {
        return this.sizeToIntrinsics && this.painter.mo1getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    private final boolean B2(long j11) {
        if (m.h(j11, m.INSTANCE.a())) {
            return false;
        }
        float fI = m.i(j11);
        return (Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true;
    }

    private final boolean C2(long j11) {
        if (m.h(j11, m.INSTANCE.a())) {
            return false;
        }
        float fK = m.k(j11);
        return (Float.isInfinite(fK) || Float.isNaN(fK)) ? false : true;
    }

    private final long D2(long constraints) {
        boolean z11 = false;
        boolean z12 = w4.b.h(constraints) && w4.b.g(constraints);
        if (w4.b.j(constraints) && w4.b.i(constraints)) {
            z11 = true;
        }
        if ((!A2() && z12) || z11) {
            return w4.b.d(constraints, w4.b.l(constraints), 0, w4.b.k(constraints), 0, 10, null);
        }
        long jMo1getIntrinsicSizeNHjbRc = this.painter.mo1getIntrinsicSizeNHjbRc();
        long jX2 = x2(n.a(w4.c.i(constraints, C2(jMo1getIntrinsicSizeNHjbRc) ? Math.round(m.k(jMo1getIntrinsicSizeNHjbRc)) : w4.b.n(constraints)), w4.c.h(constraints, B2(jMo1getIntrinsicSizeNHjbRc) ? Math.round(m.i(jMo1getIntrinsicSizeNHjbRc)) : w4.b.m(constraints))));
        return w4.b.d(constraints, w4.c.i(constraints, Math.round(m.k(jX2))), 0, w4.c.h(constraints, Math.round(m.i(jX2))), 0, 10, null);
    }

    private final long x2(long dstSize) {
        if (!A2()) {
            return dstSize;
        }
        long jA = n.a(!C2(this.painter.mo1getIntrinsicSizeNHjbRc()) ? m.k(dstSize) : m.k(this.painter.mo1getIntrinsicSizeNHjbRc()), !B2(this.painter.mo1getIntrinsicSizeNHjbRc()) ? m.i(dstSize) : m.i(this.painter.mo1getIntrinsicSizeNHjbRc()));
        return (m.k(dstSize) == BitmapDescriptorFactory.HUE_RED || m.i(dstSize) == BitmapDescriptorFactory.HUE_RED) ? m.INSTANCE.b() : e1.b(jA, this.contentScale.a(jA, dstSize));
    }

    @Override // b4.b0
    public int B(z3.r rVar, q qVar, int i11) {
        if (!A2()) {
            return qVar.s0(i11);
        }
        long jD2 = D2(w4.c.b(0, 0, 0, i11, 7, null));
        return Math.max(w4.b.n(jD2), qVar.s0(i11));
    }

    public final void E2(d3.c cVar) {
        this.alignment = cVar;
    }

    @Override // b4.r
    public void F(m3.c cVar) throws Throwable {
        m3.c cVar2;
        long jMo1getIntrinsicSizeNHjbRc = this.painter.mo1getIntrinsicSizeNHjbRc();
        long jA = n.a(C2(jMo1getIntrinsicSizeNHjbRc) ? m.k(jMo1getIntrinsicSizeNHjbRc) : m.k(cVar.b()), B2(jMo1getIntrinsicSizeNHjbRc) ? m.i(jMo1getIntrinsicSizeNHjbRc) : m.i(cVar.b()));
        long jB = (m.k(cVar.b()) == BitmapDescriptorFactory.HUE_RED || m.i(cVar.b()) == BitmapDescriptorFactory.HUE_RED) ? m.INSTANCE.b() : e1.b(jA, this.contentScale.a(jA, cVar.b()));
        long jA2 = this.alignment.a(s.a(Math.round(m.k(jB)), Math.round(m.i(jB))), s.a(Math.round(m.k(cVar.b())), Math.round(m.i(cVar.b()))), cVar.getLayoutDirection());
        float fH = w4.n.h(jA2);
        float fI = w4.n.i(jA2);
        cVar.getDrawContext().getTransform().c(fH, fI);
        try {
            cVar2 = cVar;
            try {
                this.painter.m3drawx_KDEd0(cVar2, jB, this.alpha, this.colorFilter);
                cVar2.getDrawContext().getTransform().c(-fH, -fI);
                cVar2.M0();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                cVar2.getDrawContext().getTransform().c(-fH, -fI);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            cVar2 = cVar;
        }
    }

    public final void F2(q1 q1Var) {
        this.colorFilter = q1Var;
    }

    public final void G2(k kVar) {
        this.contentScale = kVar;
    }

    public final void H2(androidx.compose.ui.graphics.painter.b bVar) {
        this.painter = bVar;
    }

    public final void I2(boolean z11) {
        this.sizeToIntrinsics = z11;
    }

    @Override // b4.b0
    public int M(z3.r rVar, q qVar, int i11) {
        if (!A2()) {
            return qVar.t0(i11);
        }
        long jD2 = D2(w4.c.b(0, 0, 0, i11, 7, null));
        return Math.max(w4.b.n(jD2), qVar.t0(i11));
    }

    public final void a(float f11) {
        this.alpha = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(D2(j11));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b4.b0
    public int n(z3.r rVar, q qVar, int i11) {
        if (!A2()) {
            return qVar.V(i11);
        }
        long jD2 = D2(w4.c.b(0, i11, 0, 0, 13, null));
        return Math.max(w4.b.m(jD2), qVar.V(i11));
    }

    @Override // b4.b0
    public int q(z3.r rVar, q qVar, int i11) {
        if (!A2()) {
            return qVar.m0(i11);
        }
        long jD2 = D2(w4.c.b(0, i11, 0, 0, 13, null));
        return Math.max(w4.b.m(jD2), qVar.m0(i11));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final androidx.compose.ui.graphics.painter.b getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }
}
