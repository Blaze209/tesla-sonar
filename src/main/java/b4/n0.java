package b4;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Lb4/n0;", "", "Lb4/g0;", "root", "Lb4/o;", "relayoutNodes", "", "Lb4/r0$a;", "postponedMeasureRequests", "<init>", "(Lb4/g0;Lb4/o;Ljava/util/List;)V", "node", "", "c", "(Lb4/g0;)Z", "b", "", "f", "(Lb4/g0;)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljn0/h0;", "a", "()V", "Lb4/g0;", "Lb4/o;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o relayoutNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<r0.a> postponedMeasureRequests;

    public n0(g0 g0Var, o oVar, List<r0.a> list) {
        this.root = g0Var;
        this.relayoutNodes = oVar;
        this.postponedMeasureRequests = list;
    }

    private final boolean b(g0 g0Var) {
        r0.a aVar;
        g0 g0VarN0 = g0Var.n0();
        r0.a aVar2 = null;
        g0.e eVarV = g0VarN0 != null ? g0VarN0.V() : null;
        if (g0Var.y() || (g0Var.o0() != Integer.MAX_VALUE && g0VarN0 != null && g0VarN0.y())) {
            if (g0Var.c0()) {
                List<r0.a> list = this.postponedMeasureRequests;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i11);
                    r0.a aVar3 = aVar;
                    if (p013kotlin.jvm.internal.s.f(aVar3.getNode(), g0Var) && !aVar3.getIsLookahead()) {
                        break;
                    }
                    i11++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (g0Var.c0()) {
                return this.relayoutNodes.d(g0Var) || g0Var.V() == g0.e.LookaheadMeasuring || (g0VarN0 != null && g0VarN0.c0()) || ((g0VarN0 != null && g0VarN0.X()) || eVarV == g0.e.Measuring);
            }
            if (g0Var.U()) {
                return this.relayoutNodes.d(g0Var) || g0VarN0 == null || g0VarN0.c0() || g0VarN0.U() || eVarV == g0.e.Measuring || eVarV == g0.e.LayingOut;
            }
        }
        if (p013kotlin.jvm.internal.s.f(g0Var.N0(), Boolean.TRUE)) {
            if (g0Var.X()) {
                List<r0.a> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    r0.a aVar4 = list2.get(i12);
                    r0.a aVar5 = aVar4;
                    if (p013kotlin.jvm.internal.s.f(aVar5.getNode(), g0Var) && aVar5.getIsLookahead()) {
                        aVar2 = aVar4;
                        break;
                    }
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (g0Var.X()) {
                return this.relayoutNodes.e(g0Var, true) || (g0VarN0 != null && g0VarN0.X()) || eVarV == g0.e.LookaheadMeasuring || (g0VarN0 != null && g0VarN0.c0() && p013kotlin.jvm.internal.s.f(g0Var.getLookaheadRoot(), g0Var));
            }
            if (g0Var.W() && !this.relayoutNodes.e(g0Var, true) && g0VarN0 != null && !g0VarN0.X() && !g0VarN0.W() && eVarV != g0.e.LookaheadMeasuring && eVarV != g0.e.LookaheadLayingOut && (!g0VarN0.U() || !p013kotlin.jvm.internal.s.f(g0Var.getLookaheadRoot(), g0Var))) {
                return false;
            }
        }
        return true;
    }

    private final boolean c(g0 node) {
        if (!b(node)) {
            return false;
        }
        List<g0> listG = node.G();
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!c(listG.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        p013kotlin.jvm.internal.s.j(sb2, "append(value)");
        sb2.append('\n');
        p013kotlin.jvm.internal.s.j(sb2, "append('\\n')");
        e(this, sb2, this.root, 0);
        return sb2.toString();
    }

    private static final void e(n0 n0Var, StringBuilder sb2, g0 g0Var, int i11) {
        String strF = n0Var.f(g0Var);
        if (strF.length() > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            }
            sb2.append(strF);
            p013kotlin.jvm.internal.s.j(sb2, "append(value)");
            sb2.append('\n');
            p013kotlin.jvm.internal.s.j(sb2, "append('\\n')");
            i11++;
        }
        List<g0> listG = g0Var.G();
        int size = listG.size();
        for (int i13 = 0; i13 < size; i13++) {
            e(n0Var, sb2, listG.get(i13), i11);
        }
    }

    private final String f(g0 node) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(node);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(node.V());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!node.y()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + node.e0() + ']');
        if (!b(node)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (c(this.root)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
