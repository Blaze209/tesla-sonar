package androidx.compose.foundation.relocation;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/relocation/e;", "Landroidx/compose/ui/d$c;", "Lz1/b;", "requester", "<init>", "(Lz1/b;)V", "Ljn0/h0;", "x2", "()V", "h2", "y2", "i2", "n", "Lz1/b;", "", "o", "Z", "c2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private z1.b requester;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    public e(z1.b bVar) {
        this.requester = bVar;
    }

    private final void x2() {
        z1.b bVar = this.requester;
        if (bVar instanceof a) {
            s.i(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((a) bVar).c().t(this);
        }
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        y2(this.requester);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        x2();
    }

    public final void y2(z1.b requester) {
        x2();
        if (requester instanceof a) {
            ((a) requester).c().b(this);
        }
        this.requester = requester;
    }
}
