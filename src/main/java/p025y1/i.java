package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p024x1.m;
import z3.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Ly1/i;", "Lx1/m;", "Ly1/c0;", "state", "", "beyondViewportPageCount", "<init>", "(Ly1/c0;I)V", "Ljn0/h0;", "b", "()V", "a", "Ly1/c0;", "I", "()I", "itemCount", "", DateTokenConverter.CONVERTER_KEY, "()Z", "hasVisibleItems", "c", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    public i(c0 c0Var, int i11) {
        this.state = c0Var;
        this.beyondViewportPageCount = i11;
    }

    @Override // p024x1.m
    public int a() {
        return this.state.F();
    }

    @Override // p024x1.m
    public void b() {
        y0 y0VarO = this.state.O();
        if (y0VarO != null) {
            y0VarO.f();
        }
    }

    @Override // p024x1.m
    public int c() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondViewportPageCount);
    }

    @Override // p024x1.m
    public boolean d() {
        return !this.state.C().l().isEmpty();
    }

    @Override // p024x1.m
    public int e() {
        return Math.min(a() - 1, ((f) v.A0(this.state.C().l())).getIndex() + this.beyondViewportPageCount);
    }
}
