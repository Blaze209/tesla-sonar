package s2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import p020r2.SlotWriter;
import p020r2.a2;
import p020r2.o;
import p020r2.q2;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J)\u0010\u000f\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0003J;\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006&"}, d2 = {"Ls2/c;", "Ls2/h;", "<init>", "()V", "", "e", "()Z", "Ljn0/h0;", "a", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", DateTokenConverter.CONVERTER_KEY, "(Lr2/f;Lr2/d3;Lr2/q2;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Lr2/d;", "groupAnchor", "b", "(Lwn0/a;ILr2/d;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;Lwn0/p;)V", "Ls2/g;", "Ls2/g;", "operations", "pendingOperations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g operations = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g pendingOperations = new g();

    public final void a() {
        this.pendingOperations.m();
        this.operations.m();
    }

    public final void b(wn0.a<? extends Object> factory, int insertIndex, p020r2.d groupAnchor) {
        int i11;
        int i12;
        int i13;
        g gVar = this.operations;
        d.n nVar = d.n.f109729c;
        gVar.y(nVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), factory);
        g.c.c(gVarA, d.q.a(0), insertIndex);
        g.c.d(gVarA, d.t.a(1), groupAnchor);
        if (gVar.pushedIntMask == gVar.n(nVar.getInts()) && gVar.pushedObjectMask == gVar.n(nVar.getObjects())) {
            i11 = 0;
            i12 = 1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            i11 = 0;
            i12 = 1;
            int i14 = 0;
            int i15 = 0;
            for (int iB = nVar.getInts(); i15 < iB; iB = iB) {
                if (((1 << i15) & gVar.pushedIntMask) != 0) {
                    if (i14 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.e(d.q.a(i15)));
                    i14++;
                }
                i15++;
            }
            String string = sb2.toString();
            s.j(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = nVar.getObjects();
            int i16 = 0;
            int i17 = 0;
            while (i17 < iD) {
                if (((1 << i17) & gVar.pushedObjectMask) != 0) {
                    if (i14 > 0) {
                        sb3.append(", ");
                    }
                    i13 = i17;
                    sb3.append(nVar.f(d.t.a(i13)));
                    i16++;
                } else {
                    i13 = i17;
                }
                i17 = i13 + 1;
            }
            String string2 = sb3.toString();
            s.j(string2, "StringBuilder().apply(builderAction).toString()");
            a2.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i14 + " int arguments (" + string + ") and " + i16 + " object arguments (" + string2 + ").");
        }
        g gVar2 = this.pendingOperations;
        d.u uVar = d.u.f109734c;
        gVar2.y(uVar);
        g gVarA2 = g.c.a(gVar2);
        g.c.c(gVarA2, d.q.a(i11), insertIndex);
        g.c.d(gVarA2, d.t.a(i11), groupAnchor);
        if (((gVar2.pushedIntMask == gVar2.n(uVar.getInts()) && gVar2.pushedObjectMask == gVar2.n(uVar.getObjects())) ? i12 : i11) == 0) {
            StringBuilder sb4 = new StringBuilder();
            int iB2 = uVar.getInts();
            int i18 = i11;
            int i19 = i18;
            while (i18 < iB2) {
                if (((i12 << i18) & gVar2.pushedIntMask) != 0) {
                    if (i19 > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(uVar.e(d.q.a(i18)));
                    i19++;
                }
                i18++;
            }
            String string3 = sb4.toString();
            s.j(string3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder();
            int iD2 = uVar.getObjects();
            int i21 = i11;
            int i22 = i21;
            while (i22 < iD2) {
                if (((i12 << i22) & gVar2.pushedObjectMask) != 0) {
                    if (i19 > 0) {
                        sb5.append(", ");
                    }
                    sb5.append(uVar.f(d.t.a(i22)));
                    i21++;
                }
                i22++;
                gVar2 = gVar2;
            }
            String string4 = sb5.toString();
            s.j(string4, "StringBuilder().apply(builderAction).toString()");
            a2.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i19 + " int arguments (" + string3 + ") and " + i21 + " object arguments (" + string4 + ").");
        }
    }

    public final void c() {
        if (!this.pendingOperations.u()) {
            o.s("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.w(this.operations);
    }

    public final void d(p020r2.f<?> applier, SlotWriter slots, q2 rememberManager) {
        if (!this.pendingOperations.t()) {
            o.s("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.r(applier, slots, rememberManager);
    }

    public final boolean e() {
        return this.operations.t();
    }

    public final <V, T> void f(V value, p<? super T, ? super V, h0> block) {
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
}
