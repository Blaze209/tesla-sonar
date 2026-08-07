package p020r2;

import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import b3.g;
import b3.l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: r2.i3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lr2/i3;", "Lb3/l;", "Lr2/l1;", "Lb3/g;", "", "value", "<init>", "(F)V", "Landroidx/compose/runtime/snapshots/n;", "Ljn0/h0;", "k", "(Landroidx/compose/runtime/snapshots/n;)V", "previous", "current", "applied", "q", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "", "toString", "()Ljava/lang/String;", "Lr2/i3$a;", "b", "Lr2/i3$a;", "next", "u", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", DateTokenConverter.CONVERTER_KEY, "()F", "r", "floatValue", "Lr2/m3;", "e", "()Lr2/m3;", "policy", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MutableFloatState extends l implements l1, g<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a next;

    /* JADX INFO: renamed from: r2.i3$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Lr2/i3$a;", "Landroidx/compose/runtime/snapshots/n;", "", "value", "<init>", "(F)V", "Ljn0/h0;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/runtime/snapshots/n;", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "j", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float value;

        public a(float f11) {
            this.value = f11;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((a) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.value);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public final void j(float f11) {
            this.value = f11;
        }
    }

    public MutableFloatState(float f11) {
        a aVar = new a(f11);
        if (androidx.compose.runtime.snapshots.g.INSTANCE.e()) {
            a aVar2 = new a(f11);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.next = aVar;
    }

    @Override // p020r2.l1, p020r2.p0
    public float d() {
        return ((a) j.X(this.next, this)).getValue();
    }

    @Override // b3.g
    public m3<Float> e() {
        return n3.q();
    }

    @Override // b3.k
    public void k(n value) {
        s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (a) value;
    }

    @Override // b3.k
    public n q(n previous, n current, n applied) {
        s.i(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        s.i(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) current).getValue() == ((a) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // p020r2.l1
    public void r(float f11) {
        androidx.compose.runtime.snapshots.g gVarC;
        a aVar = (a) j.F(this.next);
        if (aVar.getValue() == f11) {
            return;
        }
        a aVar2 = this.next;
        j.J();
        synchronized (j.I()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            ((a) j.S(aVar2, this, gVarC, aVar)).j(f11);
            h0 h0Var = h0.f84049a;
        }
        j.Q(gVarC, this);
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) j.F(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // b3.k
    public n u() {
        return this.next;
    }
}
