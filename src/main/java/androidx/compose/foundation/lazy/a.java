package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.d;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p019p1.g0;
import p020r2.e3;
import p020r2.m1;
import w1.c;
import w4.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJC\u0010\u0015\u001a\u00020\n*\u00020\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/a;", "Lw1/c;", "<init>", "()V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Ljn0/h0;", "h", "(II)V", "Landroidx/compose/ui/d;", "", "fraction", "f", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "e", "Lp1/g0;", "fadeInSpec", "Lw4/n;", "placementSpec", "fadeOutSpec", "g", "(Landroidx/compose/ui/d;Lp1/g0;Lp1/g0;Lp1/g0;)Landroidx/compose/ui/d;", "Lr2/m1;", "a", "Lr2/m1;", "maxWidthState", "b", "maxHeightState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m1 maxWidthState = e3.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private m1 maxHeightState = e3.a(Integer.MAX_VALUE);

    @Override // w1.c
    public d e(d dVar, float f11) {
        return dVar.g(new ParentSizeElement(f11, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // w1.c
    public d f(d dVar, float f11) {
        return dVar.g(new ParentSizeElement(f11, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    @Override // w1.c
    public d g(d dVar, g0<Float> g0Var, g0<n> g0Var2, g0<Float> g0Var3) {
        return (g0Var == null && g0Var2 == null && g0Var3 == null) ? dVar : dVar.g(new LazyLayoutAnimateItemElement(g0Var, g0Var2, g0Var3));
    }

    public final void h(int width, int height) {
        this.maxWidthState.a(width);
        this.maxHeightState.a(height);
    }
}
