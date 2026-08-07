package g4;

import b4.s1;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0015\u0010\u0013R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lg4/d;", "Landroidx/compose/ui/d$c;", "Lb4/s1;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Lg4/y;", "Ljn0/h0;", "properties", "<init>", "(ZZLwn0/l;)V", "G0", "(Lg4/y;)V", "n", "Z", "getMergeDescendants", "()Z", "x2", "(Z)V", "o", "setClearingSemantics", "p", "Lwn0/l;", "getProperties", "()Lwn0/l;", "y2", "(Lwn0/l;)V", "a1", "shouldClearDescendantSemantics", "L0", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends androidx.compose.ui.d.c implements s1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean mergeDescendants;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super y, h0> properties;

    public d(boolean z11, boolean z12, wn0.l<? super y, h0> lVar) {
        this.mergeDescendants = z11;
        this.isClearingSemantics = z12;
        this.properties = lVar;
    }

    @Override // b4.s1
    public void G0(y yVar) {
        this.properties.invoke(yVar);
    }

    @Override // b4.s1
    /* JADX INFO: renamed from: L0, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @Override // b4.s1
    /* JADX INFO: renamed from: a1, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void x2(boolean z11) {
        this.mergeDescendants = z11;
    }

    public final void y2(wn0.l<? super y, h0> lVar) {
        this.properties = lVar;
    }
}
