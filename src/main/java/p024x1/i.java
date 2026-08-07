package p024x1;

import androidx.compose.ui.d;
import b4.m1;
import p013kotlin.Metadata;
import p019p1.g0;
import w4.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\f*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lx1/i;", "Landroidx/compose/ui/d$c;", "Lb4/m1;", "Lp1/g0;", "", "fadeInSpec", "Lw4/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lp1/g0;Lp1/g0;Lp1/g0;)V", "Lw4/d;", "", "parentData", "G", "(Lw4/d;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Lp1/g0;", "x2", "()Lp1/g0;", "A2", "(Lp1/g0;)V", "o", "z2", "C2", "p", "y2", "B2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends d.c implements m1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private g0<Float> fadeInSpec;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private g0<n> placementSpec;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private g0<Float> fadeOutSpec;

    public i(g0<Float> g0Var, g0<n> g0Var2, g0<Float> g0Var3) {
        this.fadeInSpec = g0Var;
        this.placementSpec = g0Var2;
        this.fadeOutSpec = g0Var3;
    }

    public final void A2(g0<Float> g0Var) {
        this.fadeInSpec = g0Var;
    }

    public final void B2(g0<Float> g0Var) {
        this.fadeOutSpec = g0Var;
    }

    public final void C2(g0<n> g0Var) {
        this.placementSpec = g0Var;
    }

    public final g0<Float> x2() {
        return this.fadeInSpec;
    }

    public final g0<Float> y2() {
        return this.fadeOutSpec;
    }

    public final g0<n> z2() {
        return this.placementSpec;
    }

    @Override // b4.m1
    public Object G(w4.d dVar, Object obj) {
        return this;
    }
}
