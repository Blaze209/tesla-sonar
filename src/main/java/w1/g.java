package w1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import z3.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001b"}, d2 = {"Lw1/g;", "Lx1/m;", "Lw1/a0;", "state", "", "beyondBoundsItemCount", "<init>", "(Lw1/a0;I)V", "Ljn0/h0;", "b", "()V", "a", "Lw1/a0;", "getState", "()Lw1/a0;", "I", "getBeyondBoundsItemCount", "()I", "itemCount", "", DateTokenConverter.CONVERTER_KEY, "()Z", "hasVisibleItems", "c", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements p024x1.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsItemCount;

    public g(a0 a0Var, int i11) {
        this.state = a0Var;
        this.beyondBoundsItemCount = i11;
    }

    @Override // p024x1.m
    public int a() {
        return this.state.x().getTotalItemsCount();
    }

    @Override // p024x1.m
    public void b() {
        y0 remeasurement = this.state.getRemeasurement();
        if (remeasurement != null) {
            remeasurement.f();
        }
    }

    @Override // p024x1.m
    public int c() {
        return Math.max(0, this.state.s() - this.beyondBoundsItemCount);
    }

    @Override // p024x1.m
    public boolean d() {
        return !this.state.x().j().isEmpty();
    }

    @Override // p024x1.m
    public int e() {
        return Math.min(a() - 1, ((k) p013kotlin.collections.v.A0(this.state.x().j())).getIndex() + this.beyondBoundsItemCount);
    }
}
