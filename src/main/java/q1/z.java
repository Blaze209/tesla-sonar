package q1;

import b4.x1;
import b4.y1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lq1/z;", "Landroidx/compose/ui/d$c;", "Lb4/x1;", "Lkotlin/Function1;", "Lz3/v;", "Ljn0/h0;", "onPositioned", "<init>", "(Lwn0/l;)V", "focusedBounds", "x2", "(Lz3/v;)V", "n", "Lwn0/l;", "getOnPositioned", "()Lwn0/l;", "setOnPositioned", "", "o", "Ljava/lang/Object;", "P0", "()Ljava/lang/Object;", "traverseKey", "p", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z extends androidx.compose.ui.d.c implements x1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f104369q = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super z3.v, jn0.h0> onPositioned;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* JADX INFO: renamed from: q1.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq1/z$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public z(wn0.l<? super z3.v, jn0.h0> lVar) {
        this.onPositioned = lVar;
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void x2(z3.v focusedBounds) {
        this.onPositioned.invoke(focusedBounds);
        z zVar = (z) y1.b(this);
        if (zVar != null) {
            zVar.x2(focusedBounds);
        }
    }
}
