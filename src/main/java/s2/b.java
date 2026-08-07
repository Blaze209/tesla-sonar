package s2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.SlotReader;
import p020r2.a3;
import p020r2.e0;
import p020r2.j1;
import p020r2.k1;
import p020r2.m;
import p020r2.o;
import p020r2.q;
import p020r2.r2;
import p020r2.u0;
import p020r2.x3;
import wn0.l;
import wn0.p;
import z2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\nJ\u0017\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u0010\nJ\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ\u001d\u0010=\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0018¢\u0006\u0004\bD\u0010%J)\u0010I\u001a\u00020\b2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0E2\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bL\u00107J;\u0010Q\u001a\u00020\b\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N2\u0006\u0010)\u001a\u00028\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bT\u0010\u001cJ%\u0010U\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bU\u0010!J\r\u0010V\u001a\u00020\b¢\u0006\u0004\bV\u0010\nJ\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\nJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0018¢\u0006\u0004\bY\u0010\u001cJ\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ\u0017\u0010[\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b[\u00107J\u001b\u0010N\u001a\u00020\b2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\¢\u0006\u0004\bN\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\ba\u0010bJ%\u0010f\u001a\u00020\b2\u000e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010c2\u0006\u0010e\u001a\u00020_¢\u0006\u0004\bf\u0010gJ/\u0010m\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020j2\u0006\u0010\u001e\u001a\u00020l2\u0006\u0010\u001d\u001a\u00020l¢\u0006\u0004\bm\u0010nJ%\u0010q\u001a\u00020\b2\u0006\u0010H\u001a\u00020o2\u0006\u0010k\u001a\u00020j2\u0006\u0010p\u001a\u00020l¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\nJ!\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00042\n\b\u0002\u0010e\u001a\u0004\u0018\u00010_¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\nJ\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\nJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010zR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010{\u001a\u0004\b|\u0010}\"\u0004\bM\u0010~R\u0016\u0010\u007f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u00106R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\ba\u00106\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010\u000fR\u0017\u0010\u0087\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0016R\u0017\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u0016R!\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u008a\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0016R\u0017\u0010\u008c\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010\u0016R\u0017\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0014\u0010\u0093\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0084\u0001¨\u0006\u0094\u0001"}, d2 = {"Ls2/b;", "", "Lr2/m;", "composer", "Ls2/a;", "changeList", "<init>", "(Lr2/m;Ls2/a;)V", "Ljn0/h0;", "B", "()V", "D", "", "useParentSlot", "E", "(Z)V", "m", "Lr2/d;", "anchor", "l", "(Lr2/d;)V", "forParent", "I", "H", "", "removeFrom", "moveCount", "K", "(II)V", "to", "from", "count", "G", "(III)V", "C", "location", "y", "(I)V", "z", "L", "Lr2/r2;", "value", Gender.OTHER, "(Lr2/r2;)V", "groupSlotIndex", "b0", "(Ljava/lang/Object;I)V", "Y", "(Ljava/lang/Object;Lr2/d;I)V", "a", "(Lr2/d;Ljava/lang/Object;)V", "X", "R", "data", "Z", "(Ljava/lang/Object;)V", "k", "g", "W", "P", "Lr2/a3;", "t", "(Lr2/d;Lr2/a3;)V", "Ls2/c;", "fixups", "u", "(Lr2/d;Lr2/a3;Ls2/c;)V", "offset", "v", "Lkotlin/Function1;", "Lr2/p;", "action", "composition", "f", "(Lwn0/l;Lr2/p;)V", "node", "c0", "T", "V", "Lkotlin/Function2;", "block", "a0", "(Ljava/lang/Object;Lwn0/p;)V", "nodeIndex", "Q", "x", Gender.MALE, IntegerTokenConverter.CONVERTER_KEY, Kind.GROUP, "j", "A", "w", "Lkotlin/Function0;", "effect", "(Lwn0/a;)V", "Lz2/d;", "effectiveNodeIndexOut", "e", "(Lz2/d;Lr2/d;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;Lz2/d;)V", "Lr2/j1;", "resolvedState", "Lr2/q;", "parentContext", "Lr2/k1;", "c", "(Lr2/j1;Lr2/q;Lr2/k1;Lr2/k1;)V", "Lr2/e0;", "reference", Gender.NONE, "(Lr2/e0;Lr2/q;Lr2/k1;)V", "h", "other", "s", "(Ls2/a;Lz2/d;)V", "n", "S", DateTokenConverter.CONVERTER_KEY, "Lr2/m;", "Ls2/a;", "o", "()Ls2/a;", "(Ls2/a;)V", "startedGroup", "Lr2/u0;", "Lr2/u0;", "startedGroups", "p", "()Z", Gender.UNKNOWN, "implicitRootStart", "writersReaderDelta", "pendingUps", "Lr2/x3;", "Lr2/x3;", "pendingDownNodes", "moveFrom", "moveTo", "Lr2/z2;", "r", "()Lr2/z2;", "reader", "q", "pastParent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f109690n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m composer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a changeList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writersReaderDelta;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int moveCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0 startedGroups = new u0();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private x3<Object> pendingDownNodes = new x3<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int removeFrom = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int moveFrom = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int moveTo = -1;

    public b(m mVar, a aVar) {
        this.composer = mVar;
        this.changeList = aVar;
    }

    private final void B() {
        C();
    }

    private final void C() {
        int i11 = this.pendingUps;
        if (i11 > 0) {
            this.changeList.H(i11);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.d()) {
            this.changeList.k(this.pendingDownNodes.i());
            this.pendingDownNodes.a();
        }
    }

    private final void D() {
        J(this, false, 1, null);
        L();
    }

    private final void E(boolean useParentSlot) {
        I(useParentSlot);
    }

    static /* synthetic */ void F(b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        bVar.E(z11);
    }

    private final void G(int to2, int from, int count) {
        B();
        this.changeList.u(to2, from, count);
    }

    private final void H() {
        int i11 = this.moveCount;
        if (i11 > 0) {
            int i12 = this.removeFrom;
            if (i12 >= 0) {
                K(i12, i11);
                this.removeFrom = -1;
            } else {
                G(this.moveTo, this.moveFrom, i11);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void I(boolean forParent) {
        int parent = forParent ? r().getParent() : r().getCurrent();
        int i11 = parent - this.writersReaderDelta;
        if (!(i11 >= 0)) {
            o.s("Tried to seek backward");
        }
        if (i11 > 0) {
            this.changeList.e(i11);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void J(b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        bVar.I(z11);
    }

    private final void K(int removeFrom, int moveCount) {
        B();
        this.changeList.y(removeFrom, moveCount);
    }

    private final void l(p020r2.d anchor) {
        F(this, false, 1, null);
        this.changeList.o(anchor);
        this.startedGroup = true;
    }

    private final void m() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        F(this, false, 1, null);
        this.changeList.p();
        this.startedGroup = true;
    }

    private final SlotReader r() {
        return this.composer.getReader();
    }

    public final void A() {
        H();
        if (this.pendingDownNodes.d()) {
            this.pendingDownNodes.g();
        } else {
            this.pendingUps++;
        }
    }

    public final void L() {
        SlotReader slotReaderR;
        int parent;
        if (r().getGroupsSize() <= 0 || this.startedGroups.h(-2) == (parent = (slotReaderR = r()).getParent())) {
            return;
        }
        m();
        if (parent > 0) {
            p020r2.d dVarA = slotReaderR.a(parent);
            this.startedGroups.j(parent);
            l(dVarA);
        }
    }

    public final void M() {
        C();
        if (this.startedGroup) {
            W();
            k();
        }
    }

    public final void N(e0 composition, q parentContext, k1 reference) {
        this.changeList.v(composition, parentContext, reference);
    }

    public final void O(r2 value) {
        this.changeList.w(value);
    }

    public final void P() {
        D();
        this.changeList.x();
        this.writersReaderDelta += r().p();
    }

    public final void Q(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                o.s("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            H();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void R() {
        this.changeList.z();
    }

    public final void S() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
    }

    public final void T(a aVar) {
        this.changeList = aVar;
    }

    public final void U(boolean z11) {
        this.implicitRootStart = z11;
    }

    public final void V(wn0.a<h0> effect) {
        this.changeList.A(effect);
    }

    public final void W() {
        this.changeList.B();
    }

    public final void X(int count) {
        if (count > 0) {
            D();
            this.changeList.C(count);
        }
    }

    public final void Y(Object value, p020r2.d anchor, int groupSlotIndex) {
        this.changeList.D(value, anchor, groupSlotIndex);
    }

    public final void Z(Object data) {
        F(this, false, 1, null);
        this.changeList.E(data);
    }

    public final void a(p020r2.d anchor, Object value) {
        this.changeList.f(anchor, value);
    }

    public final <T, V> void a0(V value, p<? super T, ? super V, h0> block) {
        B();
        this.changeList.F(value, block);
    }

    public final void b(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.g(nodes, effectiveNodeIndex);
    }

    public final void b0(Object value, int groupSlotIndex) {
        E(true);
        this.changeList.G(value, groupSlotIndex);
    }

    public final void c(j1 resolvedState, q parentContext, k1 from, k1 to2) {
        this.changeList.h(resolvedState, parentContext, from, to2);
    }

    public final void c0(Object node) {
        B();
        this.changeList.I(node);
    }

    public final void d() {
        F(this, false, 1, null);
        this.changeList.i();
    }

    public final void e(IntRef effectiveNodeIndexOut, p020r2.d anchor) {
        C();
        this.changeList.j(effectiveNodeIndexOut, anchor);
    }

    public final void f(l<? super p020r2.p, h0> action, p020r2.p composition) {
        this.changeList.l(action, composition);
    }

    public final void g() {
        int parent = r().getParent();
        if (!(this.startedGroups.h(-1) <= parent)) {
            o.s("Missed recording an endGroup");
        }
        if (this.startedGroups.h(-1) == parent) {
            F(this, false, 1, null);
            this.startedGroups.i();
            this.changeList.m();
        }
    }

    public final void h() {
        this.changeList.n();
        this.writersReaderDelta = 0;
    }

    public final void i() {
        H();
    }

    public final void j(int nodeIndex, int group) {
        i();
        C();
        int iN = r().J(group) ? 1 : r().N(group);
        if (iN > 0) {
            Q(nodeIndex, iN);
        }
    }

    public final void k() {
        if (this.startedGroup) {
            F(this, false, 1, null);
            F(this, false, 1, null);
            this.changeList.m();
            this.startedGroup = false;
        }
    }

    public final void n() {
        C();
        if (this.startedGroups.d()) {
            return;
        }
        o.s("Missed recording an endGroup()");
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final a getChangeList() {
        return this.changeList;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean q() {
        return r().getParent() - this.writersReaderDelta < 0;
    }

    public final void s(a other, IntRef effectiveNodeIndex) {
        this.changeList.q(other, effectiveNodeIndex);
    }

    public final void t(p020r2.d anchor, a3 from) {
        C();
        D();
        H();
        this.changeList.r(anchor, from);
    }

    public final void u(p020r2.d anchor, a3 from, c fixups) {
        C();
        D();
        H();
        this.changeList.s(anchor, from, fixups);
    }

    public final void v(int offset) {
        D();
        this.changeList.t(offset);
    }

    public final void w(Object node) {
        H();
        this.pendingDownNodes.h(node);
    }

    public final void x(int from, int to2, int count) {
        if (count > 0) {
            int i11 = this.moveCount;
            if (i11 > 0 && this.moveFrom == from - i11 && this.moveTo == to2 - i11) {
                this.moveCount = i11 + count;
                return;
            }
            H();
            this.moveFrom = from;
            this.moveTo = to2;
            this.moveCount = count;
        }
    }

    public final void y(int location) {
        this.writersReaderDelta += location - r().getCurrent();
    }

    public final void z(int location) {
        this.writersReaderDelta = location;
    }
}
