package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/u;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lw4/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", Gender.FEMALE, "y2", "()F", "D2", "(F)V", "o", "z2", "E2", "p", "getEnd-D9Ej5fM", "B2", "q", "getBottom-D9Ej5fM", "A2", "r", "Z", "x2", "()Z", "C2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f4636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f4637e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, k0 k0Var) {
            super(1);
            this.f4636d = w0Var;
            this.f4637e = k0Var;
        }

        public final void a(w0.a aVar) {
            if (u.this.getRtlAware()) {
                w0.a.l(aVar, this.f4636d, this.f4637e.i1(u.this.getStart()), this.f4637e.i1(u.this.getTop()), BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                w0.a.h(aVar, this.f4636d, this.f4637e.i1(u.this.getStart()), this.f4637e.i1(u.this.getTop()), BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ u(float f11, float f12, float f13, float f14, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, z11);
    }

    public final void A2(float f11) {
        this.bottom = f11;
    }

    public final void B2(float f11) {
        this.end = f11;
    }

    public final void C2(boolean z11) {
        this.rtlAware = z11;
    }

    public final void D2(float f11) {
        this.start = f11;
    }

    public final void E2(float f11) {
        this.top = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        int iI1 = k0Var.i1(this.start) + k0Var.i1(this.end);
        int iI2 = k0Var.i1(this.top) + k0Var.i1(this.bottom);
        w0 w0VarX0 = h0Var.x0(w4.c.o(j11, -iI1, -iI2));
        return k0.N1(k0Var, w4.c.i(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + iI1), w4.c.h(j11, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iI2), null, new a(w0VarX0, k0Var), 4, null);
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    private u(float f11, float f12, float f13, float f14, boolean z11) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        this.rtlAware = z11;
    }
}
