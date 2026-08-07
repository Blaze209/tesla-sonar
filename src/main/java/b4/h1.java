package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lb4/h1;", "", "<init>", "()V", "Lb4/g0;", "layoutNode", "Ljn0/h0;", "b", "(Lb4/g0;)V", "", "c", "()Z", "node", DateTokenConverter.CONVERTER_KEY, "f", "rootNode", "e", "a", "Lt2/b;", "Lt2/b;", "layoutNodes", "", "[Lb4/g0;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16110d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2.b<g0> layoutNodes = new t2.b<>(new g0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g0[] cachedNodes;

    private final void b(g0 layoutNode) {
        layoutNode.z();
        int i11 = 0;
        layoutNode.F1(false);
        t2.b<g0> bVarW0 = layoutNode.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            g0[] g0VarArrM = bVarW0.m();
            do {
                b(g0VarArrM[i11]);
                i11++;
            } while (i11 < size);
        }
    }

    public final void a() {
        this.layoutNodes.A(Companion.C0308a.f16113a);
        int size = this.layoutNodes.getSize();
        g0[] g0VarArr = this.cachedNodes;
        if (g0VarArr == null || g0VarArr.length < size) {
            g0VarArr = new g0[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i11 = 0; i11 < size; i11++) {
            g0VarArr[i11] = this.layoutNodes.m()[i11];
        }
        this.layoutNodes.h();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = g0VarArr;
                return;
            }
            g0 g0Var = g0VarArr[size];
            p013kotlin.jvm.internal.s.h(g0Var);
            if (g0Var.getNeedsOnPositionedDispatch()) {
                b(g0Var);
            }
        }
    }

    public final boolean c() {
        return this.layoutNodes.q();
    }

    public final void d(g0 node) {
        this.layoutNodes.b(node);
        node.F1(true);
    }

    public final void e(g0 rootNode) {
        this.layoutNodes.h();
        this.layoutNodes.b(rootNode);
        rootNode.F1(true);
    }

    public final void f(g0 node) {
        this.layoutNodes.t(node);
    }
}
