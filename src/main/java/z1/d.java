package z1;

import android.graphics.Rect;
import android.view.View;
import b4.j;
import b4.l;
import j3.i;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb4/j;", "Lz1/a;", "b", "(Lb4/j;)Lz1/a;", "Lj3/i;", "Landroid/graphics/Rect;", "c", "(Lj3/i;)Landroid/graphics/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz3/v;", "childCoordinates", "Lkotlin/Function0;", "Lj3/i;", "boundsProvider", "Ljn0/h0;", "x1", "(Lz3/v;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a implements z1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f126439a;

        a(j jVar) {
            this.f126439a = jVar;
        }

        @Override // z1.a
        public final Object x1(v vVar, wn0.a<i> aVar, Continuation<? super h0> continuation) {
            View viewA = l.a(this.f126439a);
            long jF = w.f(vVar);
            i iVarInvoke = aVar.invoke();
            i iVarU = iVarInvoke != null ? iVarInvoke.u(jF) : null;
            if (iVarU != null) {
                viewA.requestRectangleOnScreen(d.c(iVarU), false);
            }
            return h0.f84049a;
        }
    }

    public static final z1.a b(j jVar) {
        return new a(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(i iVar) {
        return new Rect((int) iVar.getLeft(), (int) iVar.getTop(), (int) iVar.getRight(), (int) iVar.getBottom());
    }
}
