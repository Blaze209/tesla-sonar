package p020r2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: r2.z2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R6\u0010I\u001a\"\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u00010Ej\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u0001`G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010HR$\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010MR$\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\bO\u0010*R$\u0010R\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bQ\u0010*R$\u0010T\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bS\u0010*R\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R$\u0010`\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b_\u0010MR\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010*R\u0011\u0010c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010MR\u0011\u0010e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0011\u0010g\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010MR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010*R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010MR\u0013\u0010p\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b^\u0010!R\u0013\u0010q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010!R\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, d2 = {"Lr2/z2;", "", "Lr2/a3;", "table", "<init>", "(Lr2/a3;)V", "", "", "index", Gender.MALE, "([II)Ljava/lang/Object;", "b", Gender.OTHER, "P", "(I)I", "", "J", "(I)Z", Gender.NONE, "L", "(I)Ljava/lang/Object;", "E", "C", "G", "D", "z", Gender.FEMALE, "e", "A", Kind.GROUP, "B", "(II)Ljava/lang/Object;", "K", "()Ljava/lang/Object;", "Ljn0/h0;", "c", "()V", "f", DateTokenConverter.CONVERTER_KEY, Gender.UNKNOWN, "V", "S", "()I", "T", "Q", "(I)V", "R", "g", "", "Lr2/z0;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Lr2/d;", "a", "(I)Lr2/d;", "Lr2/a3;", "y", "()Lr2/a3;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Lr2/t0;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "closed", "k", "currentGroup", "j", "currentEnd", "u", "parent", "Lr2/u0;", "Lr2/u0;", "currentSlotStack", "l", "emptyCount", "m", "currentSlot", "n", "currentSlotEnd", "o", "r", "hadNext", "x", "size", "isNode", "H", "isGroupEnd", "t", "inEmpty", "p", "groupSize", "groupEnd", "groupKey", "q", "groupSlotIndex", "s", "hasObjectKey", "groupObjectKey", "groupAux", "v", "parentNodes", "w", "remainingSlots", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SlotReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object[] slots;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private HashMap<d, t0> sourceInformationMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int current;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int parent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final u0 currentSlotStack;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hadNext;

    public SlotReader(a3 a3Var) {
        this.table = a3Var;
        this.groups = a3Var.getGroups();
        int groupsSize = a3Var.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = a3Var.getSlots();
        this.slotsSize = a3Var.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new u0();
    }

    private final Object M(int[] iArr, int i11) {
        return c3.N(iArr, i11) ? this.slots[c3.R(iArr, i11)] : l.INSTANCE.a();
    }

    private final Object O(int[] iArr, int i11) {
        if (c3.L(iArr, i11)) {
            return this.slots[c3.S(iArr, i11)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i11) {
        return c3.J(iArr, i11) ? this.slots[c3.B(iArr, i11)] : l.INSTANCE.a();
    }

    public final Object A(int index) {
        return B(this.current, index);
    }

    public final Object B(int group, int index) {
        int iV = c3.V(this.groups, group);
        int i11 = group + 1;
        int i12 = iV + index;
        return i12 < (i11 < this.groupsSize ? c3.F(this.groups, i11) : this.slotsSize) ? this.slots[i12] : l.INSTANCE.a();
    }

    public final int C(int index) {
        return c3.O(this.groups, index);
    }

    public final Object D(int index) {
        return O(this.groups, index);
    }

    public final int E(int index) {
        return c3.I(this.groups, index);
    }

    public final boolean F(int index) {
        return c3.K(this.groups, index);
    }

    public final boolean G(int index) {
        return c3.L(this.groups, index);
    }

    public final boolean H() {
        return t() || this.current == this.end;
    }

    public final boolean I() {
        return c3.N(this.groups, this.current);
    }

    public final boolean J(int index) {
        return c3.N(this.groups, index);
    }

    public final Object K() {
        int i11;
        if (this.emptyCount > 0 || (i11 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return l.INSTANCE.a();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i11 + 1;
        return objArr[i11];
    }

    public final Object L(int index) {
        if (c3.N(this.groups, index)) {
            return M(this.groups, index);
        }
        return null;
    }

    public final int N(int index) {
        return c3.Q(this.groups, index);
    }

    public final int P(int index) {
        return c3.T(this.groups, index);
    }

    public final void Q(int index) {
        if (!(this.emptyCount == 0)) {
            o.s("Cannot reposition while in an empty region");
        }
        this.current = index;
        int iT = index < this.groupsSize ? c3.T(this.groups, index) : -1;
        this.parent = iT;
        if (iT < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iT + c3.I(this.groups, iT);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void R(int index) {
        int I = c3.I(this.groups, index) + index;
        int i11 = this.current;
        if (!(i11 >= index && i11 <= I)) {
            o.s("Index " + index + " is not a parent of " + i11);
        }
        this.parent = index;
        this.end = I;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int S() {
        if (!(this.emptyCount == 0)) {
            o.s("Cannot skip while in an empty region");
        }
        int iQ = c3.N(this.groups, this.current) ? 1 : c3.Q(this.groups, this.current);
        int i11 = this.current;
        this.current = i11 + c3.I(this.groups, i11);
        return iQ;
    }

    public final void T() {
        if (!(this.emptyCount == 0)) {
            o.s("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void U() {
        t0 t0Var;
        if (this.emptyCount <= 0) {
            int i11 = this.parent;
            int i12 = this.current;
            if (!(c3.T(this.groups, i12) == i11)) {
                a2.a("Invalid slot table detected");
            }
            HashMap<d, t0> map = this.sourceInformationMap;
            if (map != null && (t0Var = map.get(a(i11))) != null) {
                t0Var.h(this.table, i12);
            }
            u0 u0Var = this.currentSlotStack;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            if (i13 == 0 && i14 == 0) {
                u0Var.j(-1);
            } else {
                u0Var.j(i13);
            }
            this.parent = i12;
            this.end = c3.I(this.groups, i12) + i12;
            int i15 = i12 + 1;
            this.current = i15;
            this.currentSlot = c3.V(this.groups, i12);
            this.currentSlotEnd = i12 >= this.groupsSize - 1 ? this.slotsSize : c3.F(this.groups, i15);
        }
    }

    public final void V() {
        if (this.emptyCount <= 0) {
            if (!c3.N(this.groups, this.current)) {
                a2.a("Expected a node group");
            }
            U();
        }
    }

    public final d a(int index) {
        ArrayList<d> arrayListL = this.table.l();
        int iU = c3.U(arrayListL, index, this.groupsSize);
        if (iU >= 0) {
            return arrayListL.get(iU);
        }
        d dVar = new d(index);
        arrayListL.add(-(iU + 1), dVar);
        return dVar;
    }

    public final void c() {
        this.emptyCount++;
    }

    public final void d() {
        this.closed = true;
        this.table.e(this, this.sourceInformationMap);
    }

    public final boolean e(int index) {
        return c3.D(this.groups, index);
    }

    public final void f() {
        if (!(this.emptyCount > 0)) {
            a2.a("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void g() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                o.s("endGroup() not called at the end of a group");
            }
            int iT = c3.T(this.groups, this.parent);
            this.parent = iT;
            this.end = iT < 0 ? this.groupsSize : c3.I(this.groups, iT) + iT;
            int i11 = this.currentSlotStack.i();
            if (i11 < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = i11;
                this.currentSlotEnd = iT >= this.groupsSize - 1 ? this.slotsSize : c3.F(this.groups, iT + 1);
            }
        }
    }

    public final List<z0> h() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i11 = 0;
            int I = this.current;
            while (true) {
                int i12 = i11;
                if (I >= this.end) {
                    break;
                }
                i11 = i12 + 1;
                arrayList.add(new z0(c3.O(this.groups, I), O(this.groups, I), I, c3.N(this.groups, I) ? 1 : c3.Q(this.groups, I), i12));
                I += c3.I(this.groups, I);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object l() {
        int i11 = this.current;
        if (i11 < this.end) {
            return b(this.groups, i11);
        }
        return 0;
    }

    public final int m() {
        return this.end;
    }

    public final int n() {
        int i11 = this.current;
        if (i11 < this.end) {
            return c3.O(this.groups, i11);
        }
        return 0;
    }

    public final Object o() {
        int i11 = this.current;
        if (i11 < this.end) {
            return O(this.groups, i11);
        }
        return null;
    }

    public final int p() {
        return c3.I(this.groups, this.current);
    }

    public final int q() {
        return this.currentSlot - c3.V(this.groups, this.parent);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean s() {
        int i11 = this.current;
        return i11 < this.end && c3.L(this.groups, i11);
    }

    public final boolean t() {
        return this.emptyCount > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + n() + ", parent=" + this.parent + ", end=" + this.end + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int v() {
        int i11 = this.parent;
        if (i11 >= 0) {
            return c3.Q(this.groups, i11);
        }
        return 0;
    }

    public final int w() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final a3 getTable() {
        return this.table;
    }

    public final Object z(int index) {
        return b(this.groups, index);
    }
}
