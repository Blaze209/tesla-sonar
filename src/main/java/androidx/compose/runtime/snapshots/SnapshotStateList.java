package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.a2;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001BB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010(J%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u0014J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b2\u0010\u0018J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0007J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010\u0014J\u001d\u00106\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b6\u0010\u0018J\u0017\u00107\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u001d\u00108\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b8\u0010\u0018J \u00109\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J-\u0010?\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0000¢\u0006\u0004\b?\u0010@R$\u0010F\u001a\u00020\r2\u0006\u0010A\u001a\u00020\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR \u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000J8@X\u0080\u0004¢\u0006\f\u0012\u0004\bM\u0010\u0007\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010H¨\u0006Q"}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "T", "Lb3/k;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Lkotlin/Function1;", "", "block", "h", "(Lwn0/l;)Z", "Landroidx/compose/runtime/snapshots/n;", "value", "Ljn0/h0;", "k", "(Landroidx/compose/runtime/snapshots/n;)V", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", IntegerTokenConverter.CONVERTER_KEY, "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "j", "(II)V", "start", "end", "l", "(Ljava/util/Collection;II)I", "<set-?>", "a", "Landroidx/compose/runtime/snapshots/n;", "u", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "e", "()I", "structure", "Landroidx/compose/runtime/snapshots/k$a;", "b", "()Landroidx/compose/runtime/snapshots/k$a;", "getReadable$runtime_release$annotations", "readable", DateTokenConverter.CONVERTER_KEY, "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnapshotStateList<T> implements b3.k, List<T>, RandomAccess, xn0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private n firstStateRecord;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k$a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R\"\u0010\u0017\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/k$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "Lu2/e;", "list", "<init>", "(Lu2/e;)V", "value", "Ljn0/h0;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/runtime/snapshots/n;", "Lu2/e;", IntegerTokenConverter.CONVERTER_KEY, "()Lu2/e;", "l", "", "I", "j", "()I", "m", "(I)V", "modification", "e", "k", "n", "structuralChange", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private u2.e<? extends T> list;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int modification;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int structuralChange;

        public a(u2.e<? extends T> eVar) {
            this.list = eVar;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            synchronized (b3.h.f15987a) {
                s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((a) value).list;
                this.modification = ((a) value).modification;
                this.structuralChange = ((a) value).structuralChange;
                h0 h0Var = h0.f84049a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.list);
        }

        public final u2.e<T> i() {
            return this.list;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void l(u2.e<? extends T> eVar) {
            this.list = eVar;
        }

        public final void m(int i11) {
            this.modification = i11;
        }

        public final void n(int i11) {
            this.structuralChange = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<List<T>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Collection<T> f5209d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i11, Collection<? extends T> collection) {
            super(1);
            this.f5208c = i11;
            this.f5209d = collection;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.addAll(this.f5208c, this.f5209d));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.k$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<List<T>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection<T> f5210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f5210c = collection;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f5210c));
        }
    }

    public SnapshotStateList() {
        u2.e eVarA = u2.a.a();
        a aVar = new a(eVarA);
        if (g.INSTANCE.e()) {
            a aVar2 = new a(eVarA);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.firstStateRecord = aVar;
    }

    private final boolean h(wn0.l<? super List<T>, Boolean> block) {
        int modification;
        u2.e<T> eVarI;
        Boolean boolInvoke;
        g gVarC;
        boolean z11;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e.a<T> aVarBuilder = eVarI.builder();
            boolInvoke = block.invoke(aVarBuilder);
            u2.e<T> eVarBuild = aVarBuilder.build();
            if (s.f(eVarBuild, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarBuild);
                        z11 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        u2.e<T> eVarI;
        boolean z11;
        g gVarC;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarAdd = eVarI.add(element);
            z11 = false;
            if (s.f(eVarAdd, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z11 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        return h(new b(index, elements));
    }

    public final a<T> b() {
        n firstStateRecord = getFirstStateRecord();
        s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) j.X((a) firstStateRecord, this);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        g gVarC;
        n firstStateRecord = getFirstStateRecord();
        s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) firstStateRecord;
        j.J();
        synchronized (j.I()) {
            gVarC = g.INSTANCE.c();
            a aVar2 = (a) j.h0(aVar, this, gVarC);
            synchronized (b3.h.f15987a) {
                aVar2.l(u2.a.a());
                aVar2.m(aVar2.getModification() + 1);
                aVar2.n(aVar2.getStructuralChange() + 1);
            }
        }
        j.Q(gVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return b().i().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return b().i().containsAll(elements);
    }

    public int d() {
        return b().i().size();
    }

    public final int e() {
        n firstStateRecord = getFirstStateRecord();
        s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) j.F((a) firstStateRecord)).getStructuralChange();
    }

    @Override // java.util.List
    public T get(int index) {
        return b().i().get(index);
    }

    public T i(int index) {
        int modification;
        u2.e<T> eVarI;
        g gVarC;
        boolean z11;
        T t11 = get(index);
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarD2 = eVarI.d2(index);
            if (s.f(eVarD2, eVarI)) {
                return t11;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarD2);
                        z11 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return t11;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return b().i().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return b().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r8, int r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = b3.h.a()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.n r1 = r7.getFirstStateRecord()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p013kotlin.jvm.internal.s.i(r1, r2)     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.k$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.n r1 = androidx.compose.runtime.snapshots.j.F(r1)     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.k$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L8a
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L8a
            u2.e r1 = r1.i()     // Catch: java.lang.Throwable -> L8a
            jn0.h0 r3 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r0)
            p013kotlin.jvm.internal.s.h(r1)
            u2.e$a r0 = r1.builder()
            java.util.List r3 = r0.subList(r8, r9)
            r3.clear()
            u2.e r0 = r0.build()
            boolean r1 = p013kotlin.jvm.internal.s.f(r0, r1)
            if (r1 != 0) goto L89
            androidx.compose.runtime.snapshots.n r1 = r7.getFirstStateRecord()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            p013kotlin.jvm.internal.s.i(r1, r3)
            androidx.compose.runtime.snapshots.k$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1
            androidx.compose.runtime.snapshots.j.J()
            java.lang.Object r3 = androidx.compose.runtime.snapshots.j.I()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.g$a r4 = androidx.compose.runtime.snapshots.g.INSTANCE     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.g r4 = r4.c()     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.n r1 = androidx.compose.runtime.snapshots.j.h0(r1, r7, r4)     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.k$a r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.a) r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = b3.h.a()     // Catch: java.lang.Throwable -> L83
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L83
            int r6 = r1.getModification()     // Catch: java.lang.Throwable -> L78
            if (r6 != r2) goto L7a
            r1.l(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L78
            r2 = 1
            int r0 = r0 + r2
            r1.m(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + r2
            r1.n(r0)     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r8 = move-exception
            goto L85
        L7a:
            r2 = 0
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r3)
            androidx.compose.runtime.snapshots.j.Q(r4, r7)
            if (r2 == 0) goto L0
            goto L89
        L83:
            r8 = move-exception
            goto L87
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            throw r8     // Catch: java.lang.Throwable -> L83
        L87:
            monitor-exit(r3)
            throw r8
        L89:
            return
        L8a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.j(int, int):void");
    }

    @Override // b3.k
    public void k(n value) {
        value.g(getFirstStateRecord());
        s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (a) value;
    }

    public final int l(Collection<? extends T> elements, int start, int end) {
        int modification;
        u2.e<T> eVarI;
        g gVarC;
        boolean z11;
        int size = size();
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e.a<T> aVarBuilder = eVarI.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            u2.e<T> eVarBuild = aVarBuilder.build();
            if (s.f(eVarBuild, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarBuild);
                        z11 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return size - size();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return b().i().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new m(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return i(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int modification;
        u2.e<T> eVarI;
        boolean z11;
        g gVarC;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarRemoveAll = eVarI.removeAll((Collection<? extends T>) elements);
            z11 = false;
            if (s.f(eVarRemoveAll, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarRemoveAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z11 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return h(new c(elements));
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        u2.e<T> eVarI;
        g gVarC;
        boolean z11;
        T t11 = get(index);
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVar = eVarI.set(index, element);
            if (s.f(eVar, eVarI)) {
                return t11;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVar);
                        z11 = true;
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            a2.a("fromIndex or toIndex are out of bounds");
        }
        return new o(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p013kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        n firstStateRecord = getFirstStateRecord();
        s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) j.F((a) firstStateRecord)).i() + ")@" + hashCode();
    }

    @Override // b3.k
    /* JADX INFO: renamed from: u, reason: from getter */
    public n getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        u2.e<T> eVarI;
        boolean z11;
        g gVarC;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarAddAll = eVarI.addAll(elements);
            z11 = false;
            if (s.f(eVarAddAll, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAddAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z11 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new m(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        u2.e<T> eVarI;
        boolean z11;
        g gVarC;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarRemove = eVarI.remove(element);
            z11 = false;
            if (s.f(eVarRemove, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarRemove);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z11 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p013kotlin.jvm.internal.j.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        u2.e<T> eVarI;
        g gVarC;
        boolean z11;
        do {
            synchronized (b3.h.f15987a) {
                n firstStateRecord = getFirstStateRecord();
                s.i(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                h0 h0Var = h0.f84049a;
            }
            s.h(eVarI);
            u2.e<T> eVarAdd = eVarI.add(index, element);
            if (s.f(eVarAdd, eVarI)) {
                return;
            }
            n firstStateRecord2 = getFirstStateRecord();
            s.i(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (b3.h.f15987a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAdd);
                        z11 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z11 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z11);
    }
}
