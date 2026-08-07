package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lr2/d;", "", "", "loc", "<init>", "(I)V", "Lr2/a3;", "slots", DateTokenConverter.CONVERTER_KEY, "(Lr2/a3;)I", "Lr2/d3;", "writer", "e", "(Lr2/d3;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "c", "location", "", "b", "()Z", "valid", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int location;

    public d(int i11) {
        this.location = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean b() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void c(int i11) {
        this.location = i11;
    }

    public final int d(a3 slots) {
        return slots.d(this);
    }

    public final int e(SlotWriter writer) {
        return writer.F(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }
}
