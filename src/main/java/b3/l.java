package b3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lb3/l;", "Lb3/k;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/e;", "reader", "Ljn0/h0;", "E", "(I)V", "", "D", "(I)Z", "Lr2/g;", "a", "Lr2/g;", "readerKind", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p020r2.g readerKind = new p020r2.g(0);

    public final boolean D(int reader) {
        return (reader & androidx.compose.runtime.snapshots.e.a(this.readerKind.get())) != 0;
    }

    public final void E(int reader) {
        int iA;
        do {
            iA = androidx.compose.runtime.snapshots.e.a(this.readerKind.get());
            if ((iA & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iA, androidx.compose.runtime.snapshots.e.a(iA | reader)));
    }
}
