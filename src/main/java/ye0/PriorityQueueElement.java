package ye0;

import ce0.TeslaCommandRequest;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ye0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lye0/c;", "", "", "priority", "Lce0/j;", "value", "<init>", "(ILce0/j;)V", "other", "a", "(Lye0/c;)I", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "I", "b", "Lce0/j;", "c", "()Lce0/j;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PriorityQueueElement implements Comparable<PriorityQueueElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int priority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TeslaCommandRequest value;

    public PriorityQueueElement(int i11, TeslaCommandRequest value) {
        s.k(value, "value");
        this.priority = i11;
        this.value = value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(PriorityQueueElement other) {
        s.k(other, "other");
        return s.m(this.priority, other.priority);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TeslaCommandRequest getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(PriorityQueueElement.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.teslamotors.plugins.ble.commandcenter.PriorityQueueElement");
        PriorityQueueElement priorityQueueElement = (PriorityQueueElement) other;
        if (this.priority != priorityQueueElement.priority) {
            return false;
        }
        TeslaCommandRequest teslaCommandRequest = priorityQueueElement.value;
        if (this.value.j0() && teslaCommandRequest.j0()) {
            return true;
        }
        return s.f(this.value.I(), teslaCommandRequest.I());
    }

    public int hashCode() {
        return (this.priority * 31) + this.value.hashCode();
    }

    public String toString() {
        return "PriorityQueueElement(priority=" + this.priority + ", value=" + this.value + ")";
    }
}
