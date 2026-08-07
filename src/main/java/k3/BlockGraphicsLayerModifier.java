package k3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: k3.g1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lk3/g1;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "layerBlock", "<init>", "(Lwn0/l;)V", "y2", "()V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "n", "Lwn0/l;", "x2", "()Lwn0/l;", "z2", "", "c2", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlockGraphicsLayerModifier extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> block;

    /* JADX INFO: renamed from: k3.g1$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<z3.w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z3.w0 f84784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BlockGraphicsLayerModifier f84785d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z3.w0 w0Var, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
            super(1);
            this.f84784c = w0Var;
            this.f84785d = blockGraphicsLayerModifier;
        }

        public final void a(z3.w0.a aVar) {
            z3.w0.a.v(aVar, this.f84784c, 0, 0, BitmapDescriptorFactory.HUE_RED, this.f84785d.x2(), 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(z3.w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    public BlockGraphicsLayerModifier(wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
        this.block = lVar;
    }

    @Override // b4.b0
    public z3.j0 c(z3.k0 k0Var, z3.h0 h0Var, long j11) {
        z3.w0 w0VarX0 = h0Var.x0(j11);
        return z3.k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0, this), 4, null);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.block + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final wn0.l<androidx.compose.ui.graphics.c, jn0.h0> x2() {
        return this.block;
    }

    public final void y2() {
        b4.z0 wrapped = b4.k.h(this, b4.b1.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.x3(this.block, true);
        }
    }

    public final void z2(wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
        this.block = lVar;
    }
}
