package g4;

import b4.b1;
import b4.g0;
import b4.s1;
import b4.t1;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import z3.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010 \u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00102R\u0014\u0010H\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u00102R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0017\u0010T\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0011\u0010[\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bZ\u0010OR\u0014\u0010]\u001a\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010OR\u0014\u0010_\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0011\u0010a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b`\u00108R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Lg4/p;", "", "Landroidx/compose/ui/d$c;", "outerSemanticsNode", "", "mergingEnabled", "Lb4/g0;", "layoutNode", "Lg4/l;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/d$c;ZLb4/g0;Lg4/l;)V", "mergedConfig", "Ljn0/h0;", "B", "(Lg4/l;)V", "", "list", "includeDeactivatedNodes", DateTokenConverter.CONVERTER_KEY, "(Lb4/g0;Ljava/util/List;Z)V", "", "f", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "b", "(Ljava/util/List;)V", "Lg4/i;", "role", "Lkotlin/Function1;", "Lg4/y;", "properties", "c", "(Lg4/i;Lwn0/l;)Lg4/p;", "includeFakeNodes", "C", "(ZZ)Ljava/util/List;", "includeReplacedSemantics", "l", "(ZZZ)Ljava/util/List;", "Lb4/z0;", "e", "()Lb4/z0;", "a", "()Lg4/p;", "Landroidx/compose/ui/d$c;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/d$c;", "Z", "getMergingEnabled", "()Z", "Lb4/g0;", "q", "()Lb4/g0;", "Lg4/l;", "w", "()Lg4/l;", "x", "setFake$ui_release", "(Z)V", "isFake", "Lg4/p;", "fakeNodeParent", "", "g", "I", "o", "()I", "id", "y", "isMergingSemanticsOfDescendants", "A", "isUnmergedLeafNode", "Lz3/z;", "p", "()Lz3/z;", "layoutInfo", "Lj3/i;", "v", "()Lj3/i;", "touchBoundsInRoot", "Lw4/r;", "u", "()J", "size", IntegerTokenConverter.CONVERTER_KEY, "boundsInRoot", "Lj3/g;", "s", "positionInRoot", "j", "boundsInWindow", "h", "boundsInParent", "z", "isTransparent", "n", "config", "k", "()Ljava/util/List;", "children", "t", "replacedChildren", "r", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d.c outerSemanticsNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l unmergedConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p fakeNodeParent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int id;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f67263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f67263c = iVar;
        }

        public final void a(y yVar) {
            v.k0(yVar, this.f67263c.getValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f67264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f67264c = str;
        }

        public final void a(y yVar) {
            v.c0(yVar, this.f67264c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"g4/p$c", "Lb4/s1;", "Landroidx/compose/ui/d$c;", "Lg4/y;", "Ljn0/h0;", "G0", "(Lg4/y;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends androidx.compose.ui.d.c implements s1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ wn0.l<y, h0> f67265n;

        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super y, h0> lVar) {
            this.f67265n = lVar;
        }

        @Override // b4.s1
        public void G0(y yVar) {
            this.f67265n.invoke(yVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "it", "", "a", "(Lb4/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<g0, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f67266c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(g0 g0Var) {
            l lVarH = g0Var.H();
            boolean z11 = false;
            if (lVarH != null && lVarH.getIsMergingSemanticsOfDescendants()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "it", "", "a", "(Lb4/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<g0, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f67267c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(g0 g0Var) {
            l lVarH = g0Var.H();
            boolean z11 = false;
            if (lVarH != null && lVarH.getIsMergingSemanticsOfDescendants()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g0;", "it", "", "a", "(Lb4/g0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<g0, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f67268c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(g0 g0Var) {
            return Boolean.valueOf(g0Var.getNodes().r(b1.a(8)));
        }
    }

    public p(androidx.compose.ui.d.c cVar, boolean z11, g0 g0Var, l lVar) {
        this.outerSemanticsNode = cVar;
        this.mergingEnabled = z11;
        this.layoutNode = g0Var;
        this.unmergedConfig = lVar;
        this.id = g0Var.getSemanticsId();
    }

    private final void B(l mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = (p) listD.get(i11);
            if (!pVar.y()) {
                mergedConfig.o(pVar.unmergedConfig);
                pVar.B(mergedConfig);
            }
        }
    }

    public static /* synthetic */ List D(p pVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return pVar.C(z11, z12);
    }

    private final void b(List<p> unmergedChildren) {
        i iVarH = q.h(this);
        if (iVarH != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(c(iVarH, new a(iVarH)));
        }
        l lVar = this.unmergedConfig;
        s sVar = s.f67271a;
        if (lVar.e(sVar.d()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) m.a(this.unmergedConfig, sVar.d());
            String str = list != null ? (String) p013kotlin.collections.v.q0(list) : null;
            if (str != null) {
                unmergedChildren.add(0, c(null, new b(str)));
            }
        }
    }

    private final p c(i role, wn0.l<? super y, h0> properties) {
        l lVar = new l();
        lVar.q(false);
        lVar.p(false);
        properties.invoke(lVar);
        p pVar = new p(new c(properties), false, new g0(true, role != null ? q.i(this) : q.e(this)), lVar);
        pVar.isFake = true;
        pVar.fakeNodeParent = this;
        return pVar;
    }

    private final void d(g0 g0Var, List<p> list, boolean z11) {
        t2.b<g0> bVarV0 = g0Var.v0();
        int size = bVarV0.getSize();
        if (size > 0) {
            g0[] g0VarArrM = bVarV0.m();
            int i11 = 0;
            do {
                g0 g0Var2 = g0VarArrM[i11];
                if (g0Var2.K0() && (z11 || !g0Var2.getIsDeactivated())) {
                    if (g0Var2.getNodes().r(b1.a(8))) {
                        list.add(q.a(g0Var2, this.mergingEnabled));
                    } else {
                        d(g0Var2, list, z11);
                    }
                }
                i11++;
            } while (i11 < size);
        }
    }

    private final List<p> f(List<p> list) {
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i11 = 0; i11 < size; i11++) {
            p pVar = (p) listD.get(i11);
            if (pVar.y()) {
                list.add(pVar);
            } else if (!pVar.unmergedConfig.getIsClearingSemantics()) {
                pVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(p pVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    public static /* synthetic */ List m(p pVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = !pVar.mergingEnabled;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        return pVar.l(z11, z12, z13);
    }

    private final boolean y() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public final boolean A() {
        return !this.isFake && t().isEmpty() && q.f(this.layoutNode, d.f67266c) == null;
    }

    public final List<p> C(boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        d(this.layoutNode, arrayList, includeDeactivatedNodes);
        if (includeFakeNodes) {
            b(arrayList);
        }
        return arrayList;
    }

    public final p a() {
        return new p(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final z0 e() {
        if (this.isFake) {
            p pVarR = r();
            if (pVarR != null) {
                return pVarR.e();
            }
            return null;
        }
        b4.j jVarG = q.g(this.layoutNode);
        if (jVarG == null) {
            jVarG = this.outerSemanticsNode;
        }
        return b4.k.h(jVarG, b1.a(8));
    }

    public final j3.i h() {
        z3.v vVarT1;
        p pVarR = r();
        if (pVarR == null) {
            return j3.i.INSTANCE.a();
        }
        z0 z0VarE = e();
        if (z0VarE != null) {
            if (!z0VarE.b0()) {
                z0VarE = null;
            }
            if (z0VarE != null && (vVarT1 = z0VarE.t1()) != null) {
                return z3.v.A0(b4.k.h(pVarR.outerSemanticsNode, b1.a(8)), vVarT1, false, 2, null);
            }
        }
        return j3.i.INSTANCE.a();
    }

    public final j3.i i() {
        j3.i iVarB;
        z0 z0VarE = e();
        if (z0VarE != null) {
            if (!z0VarE.b0()) {
                z0VarE = null;
            }
            if (z0VarE != null && (iVarB = z3.w.b(z0VarE)) != null) {
                return iVarB;
            }
        }
        return j3.i.INSTANCE.a();
    }

    public final j3.i j() {
        j3.i iVarC;
        z0 z0VarE = e();
        if (z0VarE != null) {
            if (!z0VarE.b0()) {
                z0VarE = null;
            }
            if (z0VarE != null && (iVarC = z3.w.c(z0VarE)) != null) {
                return iVarC;
            }
        }
        return j3.i.INSTANCE.a();
    }

    public final List<p> k() {
        return m(this, false, false, false, 7, null);
    }

    public final List<p> l(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) {
            return y() ? g(this, null, 1, null) : C(includeFakeNodes, includeDeactivatedNodes);
        }
        return p013kotlin.collections.v.m();
    }

    public final l n() {
        if (!y()) {
            return this.unmergedConfig;
        }
        l lVarI = this.unmergedConfig.i();
        B(lVarI);
        return lVarI;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final z p() {
        return this.layoutNode;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final g0 getLayoutNode() {
        return this.layoutNode;
    }

    public final p r() {
        p pVar = this.fakeNodeParent;
        if (pVar != null) {
            return pVar;
        }
        g0 g0VarF = this.mergingEnabled ? q.f(this.layoutNode, e.f67267c) : null;
        if (g0VarF == null) {
            g0VarF = q.f(this.layoutNode, f.f67268c);
        }
        if (g0VarF == null) {
            return null;
        }
        return q.a(g0VarF, this.mergingEnabled);
    }

    public final long s() {
        z0 z0VarE = e();
        if (z0VarE != null) {
            if (!z0VarE.b0()) {
                z0VarE = null;
            }
            if (z0VarE != null) {
                return z3.w.f(z0VarE);
            }
        }
        return j3.g.INSTANCE.c();
    }

    public final List<p> t() {
        return m(this, false, true, false, 4, null);
    }

    public final long u() {
        z0 z0VarE = e();
        return z0VarE != null ? z0VarE.e() : w4.r.INSTANCE.a();
    }

    public final j3.i v() {
        b4.j jVarG;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (jVarG = q.g(this.layoutNode)) == null) {
            jVarG = this.outerSemanticsNode;
        }
        return t1.c(jVarG.getNode(), t1.a(this.unmergedConfig));
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final l getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean z() {
        z0 z0VarE = e();
        if (z0VarE != null) {
            return z0VarE.U2();
        }
        return false;
    }
}
