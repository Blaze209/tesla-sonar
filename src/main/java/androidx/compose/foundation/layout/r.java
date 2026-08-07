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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/r;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lw4/h;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", Gender.FEMALE, "y2", "()F", "B2", "(F)V", "o", "z2", "C2", "p", "Z", "x2", "()Z", "A2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f4615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f4616e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, k0 k0Var) {
            super(1);
            this.f4615d = w0Var;
            this.f4616e = k0Var;
        }

        public final void a(w0.a aVar) {
            if (r.this.getRtlAware()) {
                w0.a.l(aVar, this.f4615d, this.f4616e.i1(r.this.getX()), this.f4616e.i1(r.this.getY()), BitmapDescriptorFactory.HUE_RED, 4, null);
            } else {
                w0.a.h(aVar, this.f4615d, this.f4616e.i1(r.this.getX()), this.f4616e.i1(r.this.getY()), BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ r(float f11, float f12, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, z11);
    }

    public final void A2(boolean z11) {
        this.rtlAware = z11;
    }

    public final void B2(float f11) {
        this.x = f11;
    }

    public final void C2(float f11) {
        this.y = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0, k0Var), 4, null);
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    private r(float f11, float f12, boolean z11) {
        this.x = f11;
        this.y = f12;
        this.rtlAware = z11;
    }
}
