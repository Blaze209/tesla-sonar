package androidx.compose.ui;

import b4.b0;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: androidx.compose.ui.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/e;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "", "zIndex", "<init>", "(F)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "n", Gender.FEMALE, "x2", "()F", "y2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ZIndexModifier extends d.c implements b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private float zIndex;

    /* JADX INFO: renamed from: androidx.compose.ui.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f5316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ZIndexModifier f5317d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var, ZIndexModifier zIndexModifier) {
            super(1);
            this.f5316c = w0Var;
            this.f5317d = zIndexModifier;
        }

        public final void a(w0.a aVar) {
            aVar.g(this.f5316c, 0, 0, this.f5317d.getZIndex());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public ZIndexModifier(float f11) {
        this.zIndex = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(j11);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void y2(float f11) {
        this.zIndex = f11;
    }
}
