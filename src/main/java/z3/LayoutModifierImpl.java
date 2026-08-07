package z3;

import ch.qos.logback.core.CoreConstants;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: z3.c0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lz3/c0;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function3;", "Lz3/k0;", "Lz3/h0;", "Lw4/b;", "Lz3/j0;", "measureBlock", "<init>", "(Lwn0/q;)V", "measurable", CryptoServicesPermission.CONSTRAINTS, "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "n", "Lwn0/q;", "getMeasureBlock", "()Lwn0/q;", "x2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutModifierImpl extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.q<? super k0, ? super h0, ? super w4.b, ? extends j0> measureBlock;

    public LayoutModifierImpl(wn0.q<? super k0, ? super h0, ? super w4.b, ? extends j0> qVar) {
        this.measureBlock = qVar;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, h0 h0Var, long j11) {
        return this.measureBlock.invoke(k0Var, h0Var, w4.b.a(j11));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void x2(wn0.q<? super k0, ? super h0, ? super w4.b, ? extends j0> qVar) {
        this.measureBlock = qVar;
    }
}
