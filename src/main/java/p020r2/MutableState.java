package p020r2;

import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import b3.g;
import b3.l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: r2.l3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lr2/l3;", "T", "Lb3/l;", "Lb3/g;", "value", "Lr2/m3;", "policy", "<init>", "(Ljava/lang/Object;Lr2/m3;)V", "Landroidx/compose/runtime/snapshots/n;", "Ljn0/h0;", "k", "(Landroidx/compose/runtime/snapshots/n;)V", "previous", "current", "applied", "q", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "", "toString", "()Ljava/lang/String;", "b", "Lr2/m3;", "e", "()Lr2/m3;", "Lr2/l3$a;", "c", "Lr2/l3$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "u", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MutableState<T> extends l implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m3<T> policy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a<T> next;

    /* JADX INFO: renamed from: r2.l3$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Lr2/l3$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "myValue", "<init>", "(Ljava/lang/Object;)V", "value", "Ljn0/h0;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/runtime/snapshots/n;", "Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private T value;

        public a(T t11) {
            this.value = t11;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.value);
        }

        public final T i() {
            return this.value;
        }

        public final void j(T t11) {
            this.value = t11;
        }
    }

    public MutableState(T t11, m3<T> m3Var) {
        this.policy = m3Var;
        a<T> aVar = new a<>(t11);
        if (androidx.compose.runtime.snapshots.g.INSTANCE.e()) {
            a aVar2 = new a(t11);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.next = aVar;
    }

    @Override // b3.g
    public m3<T> e() {
        return this.policy;
    }

    @Override // p020r2.p1, p020r2.y3
    public T getValue() {
        return (T) ((a) j.X(this.next, this)).i();
    }

    @Override // b3.k
    public void k(n value) {
        s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (a) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b3.k
    public n q(n previous, n current, n applied) {
        s.i(previous, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) previous;
        s.i(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) current;
        s.i(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) applied;
        if (e().a(aVar2.i(), aVar3.i())) {
            return current;
        }
        Object objB = e().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        n nVarD = aVar3.d();
        s.i(nVarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) nVarD).j(objB);
        return nVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p020r2.p1
    public void setValue(T t11) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) j.F(this.next);
        if (e().a(aVar.i(), t11)) {
            return;
        }
        a<T> aVar2 = this.next;
        j.J();
        synchronized (j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            ((a) j.S(aVar2, this, gVarC, aVar)).j(t11);
            h0 h0Var = h0.f84049a;
        }
        j.Q(gVarC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) j.F(this.next)).i() + ")@" + hashCode();
    }

    @Override // b3.k
    /* JADX INFO: renamed from: u */
    public n getFirstStateRecord() {
        return this.next;
    }
}
