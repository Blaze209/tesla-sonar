package s2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p020r2.SlotWriter;
import p020r2.a3;
import p020r2.e0;
import p020r2.j1;
import p020r2.j2;
import p020r2.k1;
import p020r2.l2;
import p020r2.o;
import p020r2.q;
import p020r2.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lr2/d3;", "slots", "Lr2/f;", "", "applier", "", "index", "Ljn0/h0;", "f", "(Lr2/d3;Lr2/f;I)V", DateTokenConverter.CONVERTER_KEY, "(Lr2/d3;)I", "Lr2/d;", "anchor", "e", "(Lr2/d3;Lr2/d;Lr2/f;)I", "Lr2/e0;", "composition", "Lr2/q;", "parentContext", "Lr2/k1;", "reference", "g", "(Lr2/e0;Lr2/q;Lr2/k1;Lr2/d3;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    private static final int d(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.t0(parent)) {
            parent = slotWriter.H0(parent);
        }
        int iM0 = parent + 1;
        int iF0 = 0;
        while (iM0 < currentGroup) {
            if (slotWriter.o0(currentGroup, iM0)) {
                if (slotWriter.t0(iM0)) {
                    iF0 = 0;
                }
                iM0++;
            } else {
                iF0 += slotWriter.t0(iM0) ? 1 : slotWriter.F0(iM0);
                iM0 += slotWriter.m0(iM0);
            }
        }
        return iF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SlotWriter slotWriter, p020r2.d dVar, p020r2.f<Object> fVar) {
        int iF = slotWriter.F(dVar);
        o.Q(slotWriter.getCurrentGroup() < iF);
        f(slotWriter, fVar, iF);
        int iD = d(slotWriter);
        while (slotWriter.getCurrentGroup() < iF) {
            if (slotWriter.n0(iF)) {
                if (slotWriter.s0()) {
                    fVar.h(slotWriter.D0(slotWriter.getCurrentGroup()));
                    iD = 0;
                }
                slotWriter.j1();
            } else {
                iD += slotWriter.Y0();
            }
        }
        o.Q(slotWriter.getCurrentGroup() == iF);
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SlotWriter slotWriter, p020r2.f<Object> fVar, int i11) {
        while (!slotWriter.p0(i11)) {
            slotWriter.Z0();
            if (slotWriter.t0(slotWriter.getParent())) {
                fVar.i();
            }
            slotWriter.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e0 e0Var, q qVar, k1 k1Var, SlotWriter slotWriter) {
        a3 a3Var = new a3();
        if (slotWriter.b0()) {
            a3Var.j();
        }
        if (slotWriter.a0()) {
            a3Var.i();
        }
        SlotWriter slotWriterW = a3Var.w();
        try {
            slotWriterW.I();
            slotWriterW.k1(126665345, k1Var.c());
            SlotWriter.v0(slotWriterW, 0, 1, null);
            slotWriterW.p1(k1Var.getParameter());
            List<p020r2.d> listC0 = slotWriter.C0(k1Var.getAnchor(), 1, slotWriterW);
            slotWriterW.Y0();
            slotWriterW.T();
            slotWriterW.U();
            slotWriterW.L(true);
            j1 j1Var = new j1(a3Var);
            j2.Companion companion = j2.INSTANCE;
            if (companion.b(a3Var, listC0)) {
                a aVar = new a(e0Var, k1Var);
                SlotWriter slotWriterW2 = a3Var.w();
                try {
                    companion.a(slotWriterW2, listC0, aVar);
                    h0 h0Var = h0.f84049a;
                    slotWriterW2.L(true);
                } catch (Throwable th2) {
                    slotWriterW2.L(false);
                    throw th2;
                }
            }
            qVar.m(k1Var, j1Var);
        } catch (Throwable th3) {
            slotWriterW.L(false);
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"s2/f$a", "Lr2/l2;", "Lr2/j2;", "scope", "", "instance", "Lr2/x0;", "g", "(Lr2/j2;Ljava/lang/Object;)Lr2/x0;", "Ljn0/h0;", "l", "(Lr2/j2;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements l2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f109740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1 f109741b;

        a(e0 e0Var, k1 k1Var) {
            this.f109740a = e0Var;
            this.f109741b = k1Var;
        }

        @Override // p020r2.l2
        public x0 g(j2 scope, Object instance) {
            x0 x0VarG;
            e0 e0Var = this.f109740a;
            l2 l2Var = e0Var instanceof l2 ? (l2) e0Var : null;
            if (l2Var == null || (x0VarG = l2Var.g(scope, instance)) == null) {
                x0VarG = x0.IGNORED;
            }
            if (x0VarG != x0.IGNORED) {
                return x0VarG;
            }
            k1 k1Var = this.f109741b;
            k1Var.h(v.Q0(k1Var.d(), x.a(scope, instance)));
            return x0.SCHEDULED;
        }

        @Override // p020r2.l2
        public void a(Object value) {
        }

        @Override // p020r2.l2
        public void l(j2 scope) {
        }
    }
}
