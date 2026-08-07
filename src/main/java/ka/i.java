package ka;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import p011ja.d0;
import p011ja.r;
import p011ja.y;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@d0.b("dialog")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lka/i;", "Lja/d0;", "Lka/i$b;", "<init>", "()V", "Lja/k;", "backStackEntry", "Ljn0/h0;", "m", "(Lja/k;)V", "", "entries", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "e", "(Ljava/util/List;Lja/y;Lja/d0$a;)V", "l", "()Lka/i$b;", "popUpTo", "", "savedState", "j", "(Lja/k;Z)V", "entry", "p", "Lkotlinx/coroutines/flow/StateFlow;", "n", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "", "o", "transitionInProgress", "c", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends d0<b> {
    @Override // p011ja.d0
    public void e(List<p011ja.k> entries, y navOptions, d0.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            b().j((p011ja.k) it.next());
        }
    }

    @Override // p011ja.d0
    public void j(p011ja.k popUpTo, boolean savedState) {
        b().h(popUpTo, savedState);
        int iS0 = v.s0(b().c().getValue(), popUpTo);
        int i11 = 0;
        for (Object obj : b().c().getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            p011ja.k kVar = (p011ja.k) obj;
            if (i11 > iS0) {
                p(kVar);
            }
            i11 = i12;
        }
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, null, c.f85590a.a(), 2, null);
    }

    public final void m(p011ja.k backStackEntry) {
        j(backStackEntry, false);
    }

    public final StateFlow<List<p011ja.k>> n() {
        return b().b();
    }

    public final StateFlow<Set<p011ja.k>> o() {
        return b().c();
    }

    public final void p(p011ja.k entry) {
        b().e(entry);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lka/i$b;", "Lja/r;", "Lja/d;", "Lka/i;", "navigator", "Landroidx/compose/ui/window/j;", "dialogProperties", "Lkotlin/Function1;", "Lja/k;", "Ljn0/h0;", "content", "<init>", "(Lka/i;Landroidx/compose/ui/window/j;Lwn0/q;)V", "m", "Landroidx/compose/ui/window/j;", "B", "()Landroidx/compose/ui/window/j;", "n", "Lwn0/q;", "A", "()Lwn0/q;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends r implements p011ja.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.window.j dialogProperties;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final q<p011ja.k, p020r2.l, Integer, h0> content;

        public /* synthetic */ b(i iVar, androidx.compose.ui.window.j jVar, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(iVar, (i11 & 2) != 0 ? new androidx.compose.ui.window.j(false, false, false, 7, (DefaultConstructorMarker) null) : jVar, qVar);
        }

        public final q<p011ja.k, p020r2.l, Integer, h0> A() {
            return this.content;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final androidx.compose.ui.window.j getDialogProperties() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(i iVar, androidx.compose.ui.window.j jVar, q<? super p011ja.k, ? super p020r2.l, ? super Integer, h0> qVar) {
            super(iVar);
            this.dialogProperties = jVar;
            this.content = qVar;
        }
    }
}
