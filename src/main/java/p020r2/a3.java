package p020r2;

import androidx.collection.c0;
import androidx.collection.d0;
import c3.a;
import c3.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b)\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000b2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u008f\u0001\u00101\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u0087\u0001\u00103\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020 ¢\u0006\u0004\b;\u0010\u0005J!\u0010=\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0096\u0002¢\u0006\u0004\b@\u0010AR$\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010&\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010IR4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR$\u0010*\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bN\u0010IR\u0016\u0010O\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010GR$\u0010#\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u00106R\"\u0010W\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010G\u001a\u0004\bT\u0010I\"\u0004\bU\u0010VR2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\RB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR*\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u00106¨\u0006h"}, d2 = {"Lr2/a3;", "Lc3/a;", "", "Lc3/b;", "<init>", "()V", "", "index", "Lr2/d;", "B", "(I)Lr2/d;", "Lr2/z2;", "v", "()Lr2/z2;", "Lr2/d3;", "w", "()Lr2/d3;", "b", "anchor", DateTokenConverter.CONVERTER_KEY, "(Lr2/d;)I", "", "x", "(Lr2/d;)Z", "groupIndex", "u", "(ILr2/d;)Z", "reader", "Ljava/util/HashMap;", "Lr2/t0;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Ljn0/h0;", "e", "(Lr2/z2;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/c0;", "Landroidx/collection/d0;", "calledByMap", "h", "(Lr2/d3;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/c0;)V", "y", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/c0;)V", "k", "()Z", Kind.GROUP, "A", "(I)Lr2/t0;", IntegerTokenConverter.CONVERTER_KEY, "j", "slotIndex", "z", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "<set-?>", "a", "[I", "n", "()[I", "I", "o", "()I", "c", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "q", "readers", "f", "Z", "t", "g", "s", "setVersion$runtime_release", "(I)V", "version", "Ljava/util/ArrayList;", "l", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "r", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "Landroidx/collection/c0;", "m", "()Landroidx/collection/c0;", "setCalledByMap$runtime_release", "(Landroidx/collection/c0;)V", "isEmpty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a3 implements a, Iterable<b>, xn0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private HashMap<d, t0> sourceInformationMap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private c0<d0> calledByMap;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] groups = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ArrayList<d> anchors = new ArrayList<>();

    private final d B(int index) {
        int i11;
        if (this.writer) {
            o.s("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i11 = this.groupsSize)) {
            return null;
        }
        return c3.G(this.anchors, index, i11);
    }

    public final t0 A(int group) {
        d dVarB;
        HashMap<d, t0> map = this.sourceInformationMap;
        if (map == null || (dVarB = B(group)) == null) {
            return null;
        }
        return map.get(dVarB);
    }

    public final d b(int index) {
        if (this.writer) {
            o.s("use active SlotWriter to create an anchor location instead");
        }
        boolean z11 = false;
        if (index >= 0 && index < this.groupsSize) {
            z11 = true;
        }
        if (!z11) {
            a2.a("Parameter index is out of range");
        }
        ArrayList<d> arrayList = this.anchors;
        int iU = c3.U(arrayList, index, this.groupsSize);
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        d dVar = new d(index);
        arrayList.add(-(iU + 1), dVar);
        return dVar;
    }

    public final int d(d anchor) {
        if (this.writer) {
            o.s("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.b()) {
            a2.a("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void e(SlotReader reader, HashMap<d, t0> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            o.s("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                try {
                    HashMap<d, t0> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<d> anchors, HashMap<d, t0> sourceInformationMap, c0<d0> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            a2.a("Unexpected writer close()");
        }
        this.writer = false;
        y(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void i() {
        this.calledByMap = new c0<>(0, 1, null);
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<b> iterator() {
        return new r0(this, 0, this.groupsSize);
    }

    public final void j() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean k() {
        return this.groupsSize > 0 && c3.D(this.groups, 0);
    }

    public final ArrayList<d> l() {
        return this.anchors;
    }

    public final c0<d0> m() {
        return this.calledByMap;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<d, t0> r() {
        return this.sourceInformationMap;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean u(int groupIndex, d anchor) {
        if (this.writer) {
            o.s("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            o.s("Invalid group index");
        }
        if (x(anchor)) {
            int I = c3.I(this.groups, groupIndex) + groupIndex;
            int iA = anchor.getLocation();
            if (groupIndex <= iA && iA < I) {
                return true;
            }
        }
        return false;
    }

    public final SlotReader v() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter w() {
        if (this.writer) {
            o.s("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            o.s("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean x(d anchor) {
        int iU;
        return anchor.b() && (iU = c3.U(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && s.f(this.anchors.get(iU), anchor);
    }

    public final void y(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<d> anchors, HashMap<d, t0> sourceInformationMap, c0<d0> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final Object z(int group, int slotIndex) {
        int iV = c3.V(this.groups, group);
        int i11 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i11 < this.groupsSize ? c3.F(this.groups, i11) : this.slots.length) - iV) ? l.INSTANCE.a() : this.slots[iV + slotIndex];
    }
}
