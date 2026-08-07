package n3;

import k3.p3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm3/f;", "Ln3/c;", "graphicsLayer", "Ljn0/h0;", "a", "(Lm3/f;Ln3/c;)V", "Lk3/p3;", "outline", "b", "(Ln3/c;Lk3/p3;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final void a(m3.f fVar, c cVar) {
        cVar.h(fVar.getDrawContext().a(), fVar.getDrawContext().getGraphicsLayer());
    }

    public static final void b(c cVar, p3 p3Var) {
        if (p3Var instanceof p3.b) {
            p3.b bVar = (p3.b) p3Var;
            cVar.R(j3.h.a(bVar.b().getLeft(), bVar.b().getTop()), j3.n.a(bVar.b().o(), bVar.b().h()));
            return;
        }
        if (p3Var instanceof p3.a) {
            cVar.O(((p3.a) p3Var).getPath());
            return;
        }
        if (p3Var instanceof p3.c) {
            p3.c cVar2 = (p3.c) p3Var;
            if (cVar2.getRoundRectPath() != null) {
                cVar.O(cVar2.getRoundRectPath());
            } else {
                j3.k roundRect = cVar2.getRoundRect();
                cVar.W(j3.h.a(roundRect.getLeft(), roundRect.getTop()), j3.n.a(roundRect.j(), roundRect.d()), j3.a.d(roundRect.getBottomLeftCornerRadius()));
            }
        }
    }
}
