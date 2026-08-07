package f4;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import g4.r;
import java.util.function.Consumer;
import jn0.h0;
import k3.z3;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.u;
import p020r2.p1;
import p020r2.s3;
import w4.n;
import w4.q;
import wn0.l;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf4/h;", "Lf4/b$a;", "<init>", "()V", "Landroid/view/View;", "view", "Lg4/r;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Lg4/r;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "b", "a", "", "<set-?>", "Lr2/p1;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements f4.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 scrollCaptureInProgress = s3.d(Boolean.FALSE, null, 2, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.a implements l<ScrollCaptureCandidate, h0> {
        a(Object obj) {
            super(1, obj, t2.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((t2.b) this.receiver).b(scrollCaptureCandidate);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            a(scrollCaptureCandidate);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf4/i;", "it", "", "a", "(Lf4/i;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<ScrollCaptureCandidate, Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f64335c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getDepth());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf4/i;", "it", "", "a", "(Lf4/i;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<ScrollCaptureCandidate, Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f64336c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().e());
        }
    }

    private final void e(boolean z11) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z11));
    }

    @Override // f4.b.a
    public void a() {
        e(false);
    }

    @Override // f4.b.a
    public void b() {
        e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void d(View view, r semanticsOwner, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        t2.b bVar = new t2.b(new ScrollCaptureCandidate[16], 0);
        j.e(semanticsOwner.a(), 0, new a(bVar), 2, null);
        bVar.A(mn0.a.b(b.f64335c, c.f64336c));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (bVar.p() ? null : bVar.m()[bVar.getSize() - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        f4.b bVar2 = new f4.b(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), CoroutineScopeKt.CoroutineScope(coroutineContext), this);
        j3.i iVarB = w.b(scrollCaptureCandidate.getCoordinates());
        long j11 = scrollCaptureCandidate.getViewportBoundsInWindow().j();
        ScrollCaptureTarget scrollCaptureTargetA = g.a(view, z3.b(q.b(iVarB)), new Point(n.h(j11), n.i(j11)), bVar2);
        scrollCaptureTargetA.setScrollBounds(z3.b(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetA);
    }
}
