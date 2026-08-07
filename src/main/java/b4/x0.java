package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import z3.ModifierInfo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0002GKB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010\u000eJ\u001e\u0010@\u001a\u00020\u00162\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>H\u0000ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u0010H\u0000¢\u0006\u0004\bC\u0010AJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b1\u0010IR\u001a\u0010O\u001a\u00020J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010U\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bY\u0010W\u001a\u0004\bZ\u0010\bR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\\R\u001c\u0010`\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010_R\u0014\u0010c\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Lb4/x0;", "", "Lb4/g0;", "layoutNode", "<init>", "(Lb4/g0;)V", "Landroidx/compose/ui/d$c;", "v", "()Landroidx/compose/ui/d$c;", "paddedHead", "E", "(Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;", "Ljn0/h0;", "C", "()V", "head", "", "offset", "Lt2/b;", "Landroidx/compose/ui/d$b;", "before", "after", "", "shouldAttachOnInsert", "Lb4/x0$a;", "j", "(Landroidx/compose/ui/d$c;ILt2/b;Lt2/b;Z)Lb4/x0$a;", "start", "Lb4/z0;", "coordinator", "w", "(Landroidx/compose/ui/d$c;Lb4/z0;)V", "tail", "B", "(ILt2/b;Lt2/b;Landroidx/compose/ui/d$c;Z)V", "node", "h", "x", "element", "parent", "g", "(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;", "s", "(Landroidx/compose/ui/d$c;Landroidx/compose/ui/d$c;)Landroidx/compose/ui/d$c;", "prev", "next", "G", "(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$c;)V", "Landroidx/compose/ui/d;", "m", Gender.FEMALE, "(Landroidx/compose/ui/d;)V", "y", "D", "t", "z", "", "Lz3/n0;", "n", "()Ljava/util/List;", "u", "A", "Lb4/b1;", "type", "r", "(I)Z", "mask", "q", "", "toString", "()Ljava/lang/String;", "a", "Lb4/g0;", "()Lb4/g0;", "Lb4/w;", "b", "Lb4/w;", "l", "()Lb4/w;", "innerCoordinator", "<set-?>", "c", "Lb4/z0;", "o", "()Lb4/z0;", "outerCoordinator", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/d$c;", "p", "e", "k", "f", "Lt2/b;", "current", "buffer", "Lb4/x0$a;", "cachedDiffer", IntegerTokenConverter.CONVERTER_KEY, "()I", "aggregateChildKindSet", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w innerCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private z0 outerCoordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d.c tail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.d.c head;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private t2.b<androidx.compose.ui.d.b> current;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private t2.b<androidx.compose.ui.d.b> buffer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a cachedDiffer;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lb4/x0$a;", "Lb4/p;", "Landroidx/compose/ui/d$c;", "node", "", "offset", "Lt2/b;", "Landroidx/compose/ui/d$b;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Lb4/x0;Landroidx/compose/ui/d$c;ILt2/b;Lt2/b;Z)V", "oldIndex", "newIndex", "b", "(II)Z", "Ljn0/h0;", "c", "(I)V", "atIndex", "a", "(II)V", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/d$c;", "getNode", "()Landroidx/compose/ui/d$c;", "g", "(Landroidx/compose/ui/d$c;)V", "I", "getOffset", "()I", "h", "Lt2/b;", "getBefore", "()Lt2/b;", "f", "(Lt2/b;)V", "getAfter", "e", "Z", "getShouldAttachOnInsert", "()Z", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.ui.d.c node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private t2.b<androidx.compose.ui.d.b> before;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private t2.b<androidx.compose.ui.d.b> after;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(androidx.compose.ui.d.c cVar, int i11, t2.b<androidx.compose.ui.d.b> bVar, t2.b<androidx.compose.ui.d.b> bVar2, boolean z11) {
            this.node = cVar;
            this.offset = i11;
            this.before = bVar;
            this.after = bVar2;
            this.shouldAttachOnInsert = z11;
        }

        @Override // b4.p
        public void a(int atIndex, int oldIndex) {
            androidx.compose.ui.d.c child = this.node.getChild();
            p013kotlin.jvm.internal.s.h(child);
            x0.d(x0.this);
            if ((b1.a(2) & child.getKindSet()) != 0) {
                z0 coordinator = child.getCoordinator();
                p013kotlin.jvm.internal.s.h(coordinator);
                z0 z0VarJ2 = coordinator.getWrappedBy();
                z0 z0VarI2 = coordinator.getWrapped();
                p013kotlin.jvm.internal.s.h(z0VarI2);
                if (z0VarJ2 != null) {
                    z0VarJ2.n3(z0VarI2);
                }
                z0VarI2.o3(z0VarJ2);
                x0.this.w(this.node, z0VarI2);
            }
            this.node = x0.this.h(child);
        }

        @Override // b4.p
        public boolean b(int oldIndex, int newIndex) {
            return y0.d(this.before.m()[this.offset + oldIndex], this.after.m()[this.offset + newIndex]) != 0;
        }

        @Override // b4.p
        public void c(int newIndex) {
            int i11 = this.offset + newIndex;
            this.node = x0.this.g(this.after.m()[i11], this.node);
            x0.d(x0.this);
            if (!this.shouldAttachOnInsert) {
                this.node.q2(true);
                return;
            }
            androidx.compose.ui.d.c child = this.node.getChild();
            p013kotlin.jvm.internal.s.h(child);
            z0 coordinator = child.getCoordinator();
            p013kotlin.jvm.internal.s.h(coordinator);
            b0 b0VarD = k.d(this.node);
            if (b0VarD != null) {
                c0 c0Var = new c0(x0.this.getLayoutNode(), b0VarD);
                this.node.w2(c0Var);
                x0.this.w(this.node, c0Var);
                c0Var.o3(coordinator.getWrappedBy());
                c0Var.n3(coordinator);
                coordinator.o3(c0Var);
            } else {
                this.node.w2(coordinator);
            }
            this.node.f2();
            this.node.l2();
            c1.a(this.node);
        }

        @Override // b4.p
        public void d(int oldIndex, int newIndex) {
            androidx.compose.ui.d.c child = this.node.getChild();
            p013kotlin.jvm.internal.s.h(child);
            this.node = child;
            t2.b<androidx.compose.ui.d.b> bVar = this.before;
            androidx.compose.ui.d.b bVar2 = bVar.m()[this.offset + oldIndex];
            t2.b<androidx.compose.ui.d.b> bVar3 = this.after;
            androidx.compose.ui.d.b bVar4 = bVar3.m()[this.offset + newIndex];
            if (p013kotlin.jvm.internal.s.f(bVar2, bVar4)) {
                x0.d(x0.this);
            } else {
                x0.this.G(bVar2, bVar4, this.node);
                x0.d(x0.this);
            }
        }

        public final void e(t2.b<androidx.compose.ui.d.b> bVar) {
            this.after = bVar;
        }

        public final void f(t2.b<androidx.compose.ui.d.b> bVar) {
            this.before = bVar;
        }

        public final void g(androidx.compose.ui.d.c cVar) {
            this.node = cVar;
        }

        public final void h(int i11) {
            this.offset = i11;
        }

        public final void i(boolean z11) {
            this.shouldAttachOnInsert = z11;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lb4/x0$b;", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
    }

    public x0(g0 g0Var) {
        this.layoutNode = g0Var;
        w wVar = new w(g0Var);
        this.innerCoordinator = wVar;
        this.outerCoordinator = wVar;
        v1 v1VarC3 = wVar.H2();
        this.tail = v1VarC3;
        this.head = v1VarC3;
    }

    private final void B(int offset, t2.b<androidx.compose.ui.d.b> before, t2.b<androidx.compose.ui.d.b> after, androidx.compose.ui.d.c tail, boolean shouldAttachOnInsert) {
        v0.e(before.getSize() - offset, after.getSize() - offset, j(tail, offset, before, after, shouldAttachOnInsert));
        C();
    }

    private final void C() {
        int kindSet = 0;
        for (androidx.compose.ui.d.c parent = this.tail.getParent(); parent != null && parent != y0.f16314a; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.n2(kindSet);
        }
    }

    private final androidx.compose.ui.d.c E(androidx.compose.ui.d.c paddedHead) {
        if (!(paddedHead == y0.f16314a)) {
            y3.a.b("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.d.c child = y0.f16314a.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.t2(null);
        y0.f16314a.p2(null);
        y0.f16314a.n2(-1);
        y0.f16314a.w2(null);
        if (!(child != y0.f16314a)) {
            y3.a.b("trimChain did not update the head");
        }
        return child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(androidx.compose.ui.d.b prev, androidx.compose.ui.d.b next, androidx.compose.ui.d.c node) {
        if ((prev instanceof s0) && (next instanceof s0)) {
            y0.f((s0) next, node);
            if (node.getIsAttached()) {
                c1.e(node);
                return;
            } else {
                node.u2(true);
                return;
            }
        }
        if (!(node instanceof c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((c) node).C2(next);
        if (node.getIsAttached()) {
            c1.e(node);
        } else {
            node.u2(true);
        }
    }

    public static final /* synthetic */ b d(x0 x0Var) {
        x0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.d.c g(androidx.compose.ui.d.b element, androidx.compose.ui.d.c parent) {
        androidx.compose.ui.d.c cVar;
        if (element instanceof s0) {
            cVar = ((s0) element).i();
            cVar.r2(c1.h(cVar));
        } else {
            cVar = new c(element);
        }
        if (cVar.getIsAttached()) {
            y3.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar.q2(true);
        return s(cVar, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.d.c h(androidx.compose.ui.d.c node) {
        if (node.getIsAttached()) {
            c1.d(node);
            node.m2();
            node.g2();
        }
        return x(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.head.getAggregateChildKindSet();
    }

    private final a j(androidx.compose.ui.d.c head, int offset, t2.b<androidx.compose.ui.d.b> before, t2.b<androidx.compose.ui.d.b> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.g(head);
        aVar.h(offset);
        aVar.f(before);
        aVar.e(after);
        aVar.i(shouldAttachOnInsert);
        return aVar;
    }

    private final androidx.compose.ui.d.c s(androidx.compose.ui.d.c node, androidx.compose.ui.d.c parent) {
        androidx.compose.ui.d.c child = parent.getChild();
        if (child != null) {
            child.t2(node);
            node.p2(child);
        }
        parent.p2(node);
        node.t2(parent);
        return node;
    }

    private final androidx.compose.ui.d.c v() {
        if (!(this.head != y0.f16314a)) {
            y3.a.b("padChain called on already padded chain");
        }
        androidx.compose.ui.d.c cVar = this.head;
        cVar.t2(y0.f16314a);
        y0.f16314a.p2(cVar);
        return y0.f16314a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(androidx.compose.ui.d.c start, z0 coordinator) {
        for (androidx.compose.ui.d.c parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == y0.f16314a) {
                g0 g0VarN0 = this.layoutNode.n0();
                coordinator.o3(g0VarN0 != null ? g0VarN0.O() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((b1.a(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.w2(coordinator);
            }
        }
    }

    private final androidx.compose.ui.d.c x(androidx.compose.ui.d.c node) {
        androidx.compose.ui.d.c child = node.getChild();
        androidx.compose.ui.d.c parent = node.getParent();
        if (child != null) {
            child.t2(parent);
            node.p2(null);
        }
        if (parent != null) {
            parent.p2(child);
            node.t2(null);
        }
        p013kotlin.jvm.internal.s.h(parent);
        return parent;
    }

    public final void A() {
        for (androidx.compose.ui.d.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.m2();
            }
        }
    }

    public final void D() {
        z0 c0Var;
        z0 z0Var = this.innerCoordinator;
        for (androidx.compose.ui.d.c parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            b0 b0VarD = k.d(parent);
            if (b0VarD != null) {
                if (parent.getCoordinator() != null) {
                    z0 coordinator = parent.getCoordinator();
                    p013kotlin.jvm.internal.s.i(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    c0Var = (c0) coordinator;
                    b0 b0VarD3 = c0Var.getLayoutModifierNode();
                    c0Var.H3(b0VarD);
                    if (b0VarD3 != parent) {
                        c0Var.X2();
                    }
                } else {
                    c0Var = new c0(this.layoutNode, b0VarD);
                    parent.w2(c0Var);
                }
                z0Var.o3(c0Var);
                c0Var.n3(z0Var);
                z0Var = c0Var;
            } else {
                parent.w2(z0Var);
            }
        }
        g0 g0VarN0 = this.layoutNode.n0();
        z0Var.o3(g0VarN0 != null ? g0VarN0.O() : null);
        this.outerCoordinator = z0Var;
    }

    public final void F(androidx.compose.ui.d m11) {
        x0 x0Var;
        androidx.compose.ui.d.c cVarV = v();
        t2.b<androidx.compose.ui.d.b> bVar = this.current;
        int i11 = 0;
        int iN = bVar != null ? bVar.getSize() : 0;
        t2.b<androidx.compose.ui.d.b> bVar2 = this.buffer;
        if (bVar2 == null) {
            bVar2 = new t2.b<>(new androidx.compose.ui.d.b[16], 0);
        }
        t2.b<androidx.compose.ui.d.b> bVarE = y0.e(m11, bVar2);
        t2.b<androidx.compose.ui.d.b> bVar3 = null;
        if (bVarE.getSize() == iN) {
            androidx.compose.ui.d.c child = cVarV.getChild();
            int i12 = 0;
            while (child != null && i12 < iN) {
                if (bVar == null) {
                    y3.a.c("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.d.b bVar4 = bVar.m()[i12];
                androidx.compose.ui.d.b bVar5 = bVarE.m()[i12];
                int iD = y0.d(bVar4, bVar5);
                if (iD == 0) {
                    child = child.getParent();
                    break;
                }
                if (iD == 1) {
                    G(bVar4, bVar5, child);
                }
                child = child.getChild();
                i12++;
            }
            androidx.compose.ui.d.c cVar = child;
            if (i12 >= iN) {
                x0Var = this;
            } else {
                if (bVar == null) {
                    y3.a.c("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                if (cVar == null) {
                    y3.a.c("structuralUpdate requires a non-null tail");
                    throw new KotlinNothingValueException();
                }
                x0Var = this;
                x0Var.B(i12, bVar, bVarE, cVar, !this.layoutNode.C());
                i11 = 1;
            }
        } else {
            x0Var = this;
            if (x0Var.layoutNode.C() && iN == 0) {
                androidx.compose.ui.d.c cVarG = cVarV;
                while (i11 < bVarE.getSize()) {
                    cVarG = g(bVarE.m()[i11], cVarG);
                    i11++;
                }
                C();
            } else if (bVarE.getSize() != 0) {
                if (bVar == null) {
                    bVar = new t2.b<>(new androidx.compose.ui.d.b[16], 0);
                }
                t2.b<androidx.compose.ui.d.b> bVar6 = bVar;
                x0Var.B(0, bVar6, bVarE, cVarV, !x0Var.layoutNode.C());
                x0Var = x0Var;
                bVar = bVar6;
            } else {
                if (bVar == null) {
                    y3.a.c("expected prior modifier list to be non-empty");
                    throw new KotlinNothingValueException();
                }
                androidx.compose.ui.d.c child2 = cVarV.getChild();
                for (int i13 = 0; child2 != null && i13 < bVar.getSize(); i13++) {
                    child2 = h(child2).getChild();
                }
                w wVar = x0Var.innerCoordinator;
                g0 g0VarN0 = x0Var.layoutNode.n0();
                wVar.o3(g0VarN0 != null ? g0VarN0.O() : null);
                x0Var.outerCoordinator = x0Var.innerCoordinator;
            }
            i11 = 1;
        }
        x0Var.current = bVarE;
        if (bVar != null) {
            bVar.h();
            bVar3 = bVar;
        }
        x0Var.buffer = bVar3;
        x0Var.head = E(cVarV);
        if (i11 != 0) {
            D();
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.d.c getHead() {
        return this.head;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final w getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final g0 getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> n() {
        t2.b<androidx.compose.ui.d.b> bVar = this.current;
        if (bVar == null) {
            return p013kotlin.collections.v.m();
        }
        int i11 = 0;
        t2.b bVar2 = new t2.b(new ModifierInfo[bVar.getSize()], 0);
        androidx.compose.ui.d.c head = getHead();
        while (head != null && head != getTail()) {
            z0 coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            i1 i1VarC2 = coordinator.getLayer();
            i1 i1VarC3 = this.innerCoordinator.getLayer();
            androidx.compose.ui.d.c child = head.getChild();
            if (child != this.tail || head.getCoordinator() == child.getCoordinator()) {
                i1VarC3 = null;
            }
            if (i1VarC2 == null) {
                i1VarC2 = i1VarC3;
            }
            bVar2.b(new ModifierInfo(bVar.m()[i11], coordinator, i1VarC2));
            head = head.getChild();
            i11++;
        }
        return bVar2.g();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z0 getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final androidx.compose.ui.d.c getTail() {
        return this.tail;
    }

    public final boolean q(int mask) {
        return (mask & i()) != 0;
    }

    public final boolean r(int type) {
        return (type & i()) != 0;
    }

    public final void t() {
        for (androidx.compose.ui.d.c head = getHead(); head != null; head = head.getChild()) {
            head.f2();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.head == this.tail) {
            sb2.append("]");
        } else {
            for (androidx.compose.ui.d.c head = getHead(); head != null && head != getTail(); head = head.getChild()) {
                sb2.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void u() {
        for (androidx.compose.ui.d.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.g2();
            }
        }
    }

    public final void y() {
        for (androidx.compose.ui.d.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.k2();
            }
        }
        A();
        u();
    }

    public final void z() {
        for (androidx.compose.ui.d.c head = getHead(); head != null; head = head.getChild()) {
            head.l2();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                c1.a(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                c1.e(head);
            }
            head.q2(false);
            head.u2(false);
        }
    }
}
