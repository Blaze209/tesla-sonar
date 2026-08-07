package ka;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import p011ja.d0;
import p011ja.r;
import p011ja.y;
import p013kotlin.Metadata;
import p015o1.v;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes3.dex */
@d0.b("composable")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lka/e;", "Lja/d0;", "Lka/e$b;", "<init>", "()V", "", "Lja/k;", "entries", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "Ljn0/h0;", "e", "(Ljava/util/List;Lja/y;Lja/d0$a;)V", "l", "()Lka/e$b;", "popUpTo", "", "savedState", "j", "(Lja/k;Z)V", "entry", "p", "(Lja/k;)V", "o", "Lr2/p1;", "c", "Lr2/p1;", "n", "()Lr2/p1;", "isPop", "Lkotlinx/coroutines/flow/StateFlow;", "m", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", DateTokenConverter.CONVERTER_KEY, "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d0<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1<Boolean> isPop = s3.d(Boolean.FALSE, null, 2, null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR8\u0010\u0018\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R8\u0010!\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R8\u0010%\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R8\u0010*\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u0006+"}, d2 = {"Lka/e$b;", "Lja/r;", "Lka/e;", "navigator", "Lkotlin/Function2;", "Lo1/b;", "Lja/k;", "Ljn0/h0;", "content", "<init>", "(Lka/e;Lwn0/r;)V", "m", "Lwn0/r;", "A", "()Lwn0/r;", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/i;", "n", "Lwn0/l;", "B", "()Lwn0/l;", "G", "(Lwn0/l;)V", "enterTransition", "Landroidx/compose/animation/k;", "o", "C", "H", "exitTransition", "p", "D", "I", "popEnterTransition", "q", "E", "J", "popExitTransition", "Lo1/v;", "r", Gender.FEMALE, "K", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends r {

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final wn0.r<p015o1.b, p011ja.k, p020r2.l, Integer, h0> content;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> enterTransition;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> exitTransition;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> popEnterTransition;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> popExitTransition;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private wn0.l<androidx.compose.animation.d<p011ja.k>, v> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, wn0.r<? super p015o1.b, p011ja.k, ? super p020r2.l, ? super Integer, h0> rVar) {
            super(eVar);
            this.content = rVar;
        }

        public final wn0.r<p015o1.b, p011ja.k, p020r2.l, Integer, h0> A() {
            return this.content;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> B() {
            return this.enterTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> C() {
            return this.exitTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> D() {
            return this.popEnterTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> E() {
            return this.popExitTransition;
        }

        public final wn0.l<androidx.compose.animation.d<p011ja.k>, v> F() {
            return this.sizeTransform;
        }

        public final void G(wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> lVar) {
            this.enterTransition = lVar;
        }

        public final void H(wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> lVar) {
            this.exitTransition = lVar;
        }

        public final void I(wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void J(wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> lVar) {
            this.popExitTransition = lVar;
        }

        public final void K(wn0.l<androidx.compose.animation.d<p011ja.k>, v> lVar) {
            this.sizeTransform = lVar;
        }
    }

    @Override // p011ja.d0
    public void e(List<p011ja.k> entries, y navOptions, d0.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            b().k((p011ja.k) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    @Override // p011ja.d0
    public void j(p011ja.k popUpTo, boolean savedState) {
        b().h(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }

    @Override // p011ja.d0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, ka.b.f85587a.a());
    }

    public final StateFlow<List<p011ja.k>> m() {
        return b().b();
    }

    public final p1<Boolean> n() {
        return this.isPop;
    }

    public final void o(p011ja.k entry) {
        b().e(entry);
    }

    public final void p(p011ja.k entry) {
        b().i(entry);
    }
}
