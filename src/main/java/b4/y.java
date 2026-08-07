package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"Lb4/y;", "", "Lb4/g0;", "layoutNode", "Lz3/i0;", "policy", "<init>", "(Lb4/g0;Lz3/i0;)V", "measurePolicy", "Ljn0/h0;", "k", "(Lz3/i0;)V", "", Snapshot.HEIGHT, "g", "(I)I", Snapshot.WIDTH, "f", "c", "b", IntegerTokenConverter.CONVERTER_KEY, "h", "e", DateTokenConverter.CONVERTER_KEY, "a", "Lb4/g0;", "getLayoutNode", "()Lb4/g0;", "<set-?>", "Lr2/p1;", "()Lz3/i0;", "j", "measurePolicyState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 measurePolicyState;

    public y(g0 g0Var, z3.i0 i0Var) {
        this.layoutNode = g0Var;
        this.measurePolicyState = s3.d(i0Var, null, 2, null);
    }

    private final z3.i0 a() {
        return (z3.i0) this.measurePolicyState.getValue();
    }

    private final void j(z3.i0 i0Var) {
        this.measurePolicyState.setValue(i0Var);
    }

    public final int b(int width) {
        return a().i(this.layoutNode.l0(), this.layoutNode.F(), width);
    }

    public final int c(int height) {
        return a().d(this.layoutNode.l0(), this.layoutNode.F(), height);
    }

    public final int d(int width) {
        return a().i(this.layoutNode.l0(), this.layoutNode.E(), width);
    }

    public final int e(int height) {
        return a().d(this.layoutNode.l0(), this.layoutNode.E(), height);
    }

    public final int f(int width) {
        return a().j(this.layoutNode.l0(), this.layoutNode.F(), width);
    }

    public final int g(int height) {
        return a().g(this.layoutNode.l0(), this.layoutNode.F(), height);
    }

    public final int h(int width) {
        return a().j(this.layoutNode.l0(), this.layoutNode.E(), width);
    }

    public final int i(int height) {
        return a().g(this.layoutNode.l0(), this.layoutNode.E(), height);
    }

    public final void k(z3.i0 measurePolicy) {
        j(measurePolicy);
    }
}
