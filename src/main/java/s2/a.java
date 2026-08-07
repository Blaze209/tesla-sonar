package s2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import p020r2.SlotWriter;
import p020r2.a2;
import p020r2.a3;
import p020r2.e0;
import p020r2.j1;
import p020r2.k;
import p020r2.k1;
import p020r2.q;
import p020r2.q2;
import p020r2.r2;
import wn0.l;
import wn0.p;
import z2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\u001d\u00101\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0017¢\u0006\u0004\b8\u0010#J)\u0010=\u001a\u00020\b2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b092\u0006\u0010<\u001a\u00020:¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b@\u0010(J;\u0010E\u001a\u00020\b\"\u0004\b\u0000\u0010A\"\u0004\b\u0001\u0010B2\u0006\u0010\u0013\u001a\u00028\u00012\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0C¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0017¢\u0006\u0004\bO\u0010#J\u0015\u0010P\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bP\u0010#J\u001d\u0010S\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160Q¢\u0006\u0004\bS\u0010TJ\u001b\u0010W\u001a\u00020\b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0U¢\u0006\u0004\bW\u0010XJ\u001d\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\J%\u0010_\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160]2\u0006\u0010^\u001a\u00020Y¢\u0006\u0004\b_\u0010`J/\u0010f\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020c2\u0006\u00100\u001a\u00020e2\u0006\u0010K\u001a\u00020e¢\u0006\u0004\bf\u0010gJ%\u0010j\u001a\u00020\b2\u0006\u0010<\u001a\u00020h2\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020e¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\b¢\u0006\u0004\bl\u0010\u0003J!\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\u00002\n\b\u0002\u0010^\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010q¨\u0006s"}, d2 = {"Ls2/a;", "Ls2/h;", "<init>", "()V", "", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "a", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "b", "(Lr2/f;Lr2/d3;Lr2/q2;)V", "Lr2/r2;", "value", "w", "(Lr2/r2;)V", "", "", "groupSlotIndex", "G", "(Ljava/lang/Object;I)V", "Lr2/d;", "anchor", "D", "(Ljava/lang/Object;Lr2/d;I)V", "f", "(Lr2/d;Ljava/lang/Object;)V", "count", "C", "(I)V", "z", IntegerTokenConverter.CONVERTER_KEY, "data", "E", "(Ljava/lang/Object;)V", "p", "o", "(Lr2/d;)V", "m", "B", "x", "Lr2/a3;", "from", "r", "(Lr2/d;Lr2/a3;)V", "Ls2/c;", "fixups", "s", "(Lr2/d;Lr2/a3;Ls2/c;)V", "offset", "t", "Lkotlin/Function1;", "Lr2/p;", "action", "composition", "l", "(Lwn0/l;Lr2/p;)V", "node", "I", "T", "V", "Lkotlin/Function2;", "block", Gender.FEMALE, "(Ljava/lang/Object;Lwn0/p;)V", "removeFrom", "moveCount", "y", "(II)V", "to", "u", "(III)V", "distance", "e", "H", "", "nodes", "k", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "A", "(Lwn0/a;)V", "Lz2/d;", "effectiveNodeIndexOut", "j", "(Lz2/d;Lr2/d;)V", "", "effectiveNodeIndex", "g", "(Ljava/util/List;Lz2/d;)V", "Lr2/j1;", "resolvedState", "Lr2/q;", "parentContext", "Lr2/k1;", "h", "(Lr2/j1;Lr2/q;Lr2/k1;Lr2/k1;)V", "Lr2/e0;", "reference", "v", "(Lr2/e0;Lr2/q;Lr2/k1;)V", "n", "changeList", "q", "(Ls2/a;Lz2/d;)V", "Ls2/g;", "Ls2/g;", "operations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g operations = new g();

    public final void A(wn0.a<h0> effect) {
        g gVar = this.operations;
        d.a0 a0Var = d.a0.f109708c;
        gVar.y(a0Var);
        g.c.d(g.c.a(gVar), d.t.a(0), effect);
        if (gVar.pushedIntMask == gVar.n(a0Var.getInts()) && gVar.pushedObjectMask == gVar.n(a0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = a0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = a0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(a0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + a0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void B() {
        this.operations.x(d.b0.f109710c);
    }

    public final void C(int count) {
        g gVar = this.operations;
        d.c0 c0Var = d.c0.f109712c;
        gVar.y(c0Var);
        g.c.c(g.c.a(gVar), d.q.a(0), count);
        if (gVar.pushedIntMask == gVar.n(c0Var.getInts()) && gVar.pushedObjectMask == gVar.n(c0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + c0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void D(Object value, p020r2.d anchor, int groupSlotIndex) {
        g gVar = this.operations;
        d.d0 d0Var = d.d0.f109714c;
        gVar.y(d0Var);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        g.c.d(gVarA, d.t.a(1), anchor);
        g.c.c(gVarA, d.q.a(0), groupSlotIndex);
        if (gVar.pushedIntMask == gVar.n(d0Var.getInts()) && gVar.pushedObjectMask == gVar.n(d0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = d0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = d0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(d0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + d0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void E(Object data) {
        g gVar = this.operations;
        d.e0 e0Var = d.e0.f109716c;
        gVar.y(e0Var);
        g.c.d(g.c.a(gVar), d.t.a(0), data);
        if (gVar.pushedIntMask == gVar.n(e0Var.getInts()) && gVar.pushedObjectMask == gVar.n(e0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = e0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = e0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(e0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + e0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final <T, V> void F(V value, p<? super T, ? super V, h0> block) {
        g gVar = this.operations;
        d.f0 f0Var = d.f0.f109718c;
        gVar.y(f0Var);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        int iA = d.t.a(1);
        s.i(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(gVarA, iA, (p) u0.g(block, 2));
        if (gVar.pushedIntMask == gVar.n(f0Var.getInts()) && gVar.pushedObjectMask == gVar.n(f0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = f0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(f0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = f0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(f0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + f0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void G(Object value, int groupSlotIndex) {
        g gVar = this.operations;
        d.g0 g0Var = d.g0.f109720c;
        gVar.y(g0Var);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        g.c.c(gVarA, d.q.a(0), groupSlotIndex);
        if (gVar.pushedIntMask == gVar.n(g0Var.getInts()) && gVar.pushedObjectMask == gVar.n(g0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = g0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(g0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = g0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(g0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + g0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void H(int count) {
        g gVar = this.operations;
        d.h0 h0Var = d.h0.f109722c;
        gVar.y(h0Var);
        g.c.c(g.c.a(gVar), d.q.a(0), count);
        if (gVar.pushedIntMask == gVar.n(h0Var.getInts()) && gVar.pushedObjectMask == gVar.n(h0Var.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = h0Var.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(h0Var.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = h0Var.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(h0Var.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + h0Var + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void I(Object node) {
        if (node instanceof k) {
            this.operations.x(d.i0.f109724c);
        }
    }

    public final void a() {
        this.operations.m();
    }

    public final void b(p020r2.f<?> applier, SlotWriter slots, q2 rememberManager) {
        this.operations.r(applier, slots, rememberManager);
    }

    public final boolean c() {
        return this.operations.t();
    }

    public final boolean d() {
        return this.operations.u();
    }

    public final void e(int distance) {
        g gVar = this.operations;
        d.a aVar = d.a.f109707c;
        gVar.y(aVar);
        g.c.c(g.c.a(gVar), d.q.a(0), distance);
        if (gVar.pushedIntMask == gVar.n(aVar.getInts()) && gVar.pushedObjectMask == gVar.n(aVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = aVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(aVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = aVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(aVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + aVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void f(p020r2.d anchor, Object value) {
        g gVar = this.operations;
        d.b bVar = d.b.f109709c;
        gVar.y(bVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), value);
        if (gVar.pushedIntMask == gVar.n(bVar.getInts()) && gVar.pushedObjectMask == gVar.n(bVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = bVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(bVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = bVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(bVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + bVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void g(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        g gVar = this.operations;
        d.C2327d c2327d = d.C2327d.f109713c;
        gVar.y(c2327d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(1), nodes);
        g.c.d(gVarA, d.t.a(0), effectiveNodeIndex);
        if (gVar.pushedIntMask == gVar.n(c2327d.getInts()) && gVar.pushedObjectMask == gVar.n(c2327d.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c2327d.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c2327d.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c2327d.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c2327d.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + c2327d + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void h(j1 resolvedState, q parentContext, k1 from, k1 to2) {
        g gVar = this.operations;
        d.e eVar = d.e.f109715c;
        gVar.y(eVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), resolvedState);
        g.c.d(gVarA, d.t.a(1), parentContext);
        g.c.d(gVarA, d.t.a(3), to2);
        g.c.d(gVarA, d.t.a(2), from);
        if (gVar.pushedIntMask == gVar.n(eVar.getInts()) && gVar.pushedObjectMask == gVar.n(eVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = eVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(eVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = eVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(eVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + eVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void i() {
        this.operations.x(d.f.f109717c);
    }

    public final void j(IntRef effectiveNodeIndexOut, p020r2.d anchor) {
        g gVar = this.operations;
        d.g gVar2 = d.g.f109719c;
        gVar.y(gVar2);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), effectiveNodeIndexOut);
        g.c.d(gVarA, d.t.a(1), anchor);
        if (gVar.pushedIntMask == gVar.n(gVar2.getInts()) && gVar.pushedObjectMask == gVar.n(gVar2.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = gVar2.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(gVar2.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = gVar2.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(gVar2.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void k(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        g gVar = this.operations;
        d.h hVar = d.h.f109721c;
        gVar.y(hVar);
        g.c.d(g.c.a(gVar), d.t.a(0), nodes);
        if (gVar.pushedIntMask == gVar.n(hVar.getInts()) && gVar.pushedObjectMask == gVar.n(hVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = hVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = hVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(hVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void l(l<? super p020r2.p, h0> action, p020r2.p composition) {
        g gVar = this.operations;
        d.i iVar = d.i.f109723c;
        gVar.y(iVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), action);
        g.c.d(gVarA, d.t.a(1), composition);
        if (gVar.pushedIntMask == gVar.n(iVar.getInts()) && gVar.pushedObjectMask == gVar.n(iVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = iVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(iVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = iVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(iVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + iVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void m() {
        this.operations.x(d.j.f109725c);
    }

    public final void n() {
        this.operations.x(d.k.f109726c);
    }

    public final void o(p020r2.d anchor) {
        g gVar = this.operations;
        d.l lVar = d.l.f109727c;
        gVar.y(lVar);
        g.c.d(g.c.a(gVar), d.t.a(0), anchor);
        if (gVar.pushedIntMask == gVar.n(lVar.getInts()) && gVar.pushedObjectMask == gVar.n(lVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = lVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(lVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = lVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(lVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void p() {
        this.operations.x(d.m.f109728c);
    }

    public final void q(a changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            g gVar = this.operations;
            d.c cVar = d.c.f109711c;
            gVar.y(cVar);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.t.a(0), changeList);
            g.c.d(gVarA, d.t.a(1), effectiveNodeIndex);
            if (gVar.pushedIntMask == gVar.n(cVar.getInts()) && gVar.pushedObjectMask == gVar.n(cVar.getObjects())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = cVar.getInts();
            int i11 = 0;
            for (int i12 = 0; i12 < iB; i12++) {
                if (((1 << i12) & gVar.pushedIntMask) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(cVar.e(d.q.a(i12)));
                    i11++;
                }
            }
            String string = sb2.toString();
            s.j(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = cVar.getObjects();
            int i13 = 0;
            for (int i14 = 0; i14 < iD; i14++) {
                if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                    if (i11 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(cVar.f(d.t.a(i14)));
                    i13++;
                }
            }
            String string2 = sb3.toString();
            s.j(string2, "StringBuilder().apply(builderAction).toString()");
            a2.b("Error while pushing " + cVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
        }
    }

    public final void r(p020r2.d anchor, a3 from) {
        g gVar = this.operations;
        d.o oVar = d.o.f109730c;
        gVar.y(oVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), from);
        if (gVar.pushedIntMask == gVar.n(oVar.getInts()) && gVar.pushedObjectMask == gVar.n(oVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = oVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = oVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(oVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void s(p020r2.d anchor, a3 from, c fixups) {
        g gVar = this.operations;
        d.p pVar = d.p.f109731c;
        gVar.y(pVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), from);
        g.c.d(gVarA, d.t.a(2), fixups);
        if (gVar.pushedIntMask == gVar.n(pVar.getInts()) && gVar.pushedObjectMask == gVar.n(pVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = pVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = pVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(pVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void t(int offset) {
        g gVar = this.operations;
        d.r rVar = d.r.f109732c;
        gVar.y(rVar);
        g.c.c(g.c.a(gVar), d.q.a(0), offset);
        if (gVar.pushedIntMask == gVar.n(rVar.getInts()) && gVar.pushedObjectMask == gVar.n(rVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = rVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = rVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(rVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void u(int to2, int from, int count) {
        g gVar = this.operations;
        d.s sVar = d.s.f109733c;
        gVar.y(sVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(1), to2);
        g.c.c(gVarA, d.q.a(0), from);
        g.c.c(gVarA, d.q.a(2), count);
        if (gVar.pushedIntMask == gVar.n(sVar.getInts()) && gVar.pushedObjectMask == gVar.n(sVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = sVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = sVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(sVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void v(e0 composition, q parentContext, k1 reference) {
        g gVar = this.operations;
        d.v vVar = d.v.f109735c;
        gVar.y(vVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), composition);
        g.c.d(gVarA, d.t.a(1), parentContext);
        g.c.d(gVarA, d.t.a(2), reference);
        if (gVar.pushedIntMask == gVar.n(vVar.getInts()) && gVar.pushedObjectMask == gVar.n(vVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = vVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = vVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(vVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void w(r2 value) {
        g gVar = this.operations;
        d.w wVar = d.w.f109736c;
        gVar.y(wVar);
        g.c.d(g.c.a(gVar), d.t.a(0), value);
        if (gVar.pushedIntMask == gVar.n(wVar.getInts()) && gVar.pushedObjectMask == gVar.n(wVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = wVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(wVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = wVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(wVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + wVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void x() {
        this.operations.x(d.x.f109737c);
    }

    public final void y(int removeFrom, int moveCount) {
        g gVar = this.operations;
        d.y yVar = d.y.f109738c;
        gVar.y(yVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(0), removeFrom);
        g.c.c(gVarA, d.q.a(1), moveCount);
        if (gVar.pushedIntMask == gVar.n(yVar.getInts()) && gVar.pushedObjectMask == gVar.n(yVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = yVar.getInts();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.pushedIntMask) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(yVar.e(d.q.a(i12)));
                i11++;
            }
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = yVar.getObjects();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.pushedObjectMask) != 0) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(yVar.f(d.t.a(i14)));
                i13++;
            }
        }
        String string2 = sb3.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        a2.b("Error while pushing " + yVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
    }

    public final void z() {
        this.operations.x(d.z.f109739c);
    }
}
