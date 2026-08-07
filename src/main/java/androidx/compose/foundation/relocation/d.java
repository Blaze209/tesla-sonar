package androidx.compose.foundation.relocation;

import b4.j;
import b4.y1;
import j3.i;
import p013kotlin.Metadata;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb4/j;", "Lz1/a;", "b", "(Lb4/j;)Lz1/a;", "Lz3/v;", "sourceCoordinates", "Lj3/i;", "rect", "c", "(Lz3/v;Lz3/v;Lj3/i;)Lj3/i;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
final /* synthetic */ class d {
    public static final z1.a b(j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            return null;
        }
        z1.a aVar = (z1.a) y1.a(jVar, f.f4868q);
        return aVar == null ? z1.d.b(jVar) : aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i c(v vVar, v vVar2, i iVar) {
        return iVar.u(vVar.F(vVar2, false).m());
    }
}
