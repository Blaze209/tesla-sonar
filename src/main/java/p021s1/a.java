package p021s1;

import j3.g;
import java.util.List;
import p013kotlin.Metadata;
import v3.PointerInputChange;
import v3.m;
import w4.d;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Ls1/a;", "Ls1/s;", "<init>", "()V", "Lw4/d;", "Lv3/m;", "event", "Lw4/r;", "bounds", "Lj3/g;", "a", "(Lw4/d;Lv3/m;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f109355a = new a();

    private a() {
    }

    @Override // p021s1.s
    public long a(d dVar, m mVar, long j11) {
        List<PointerInputChange> listC = mVar.c();
        g gVarD = g.d(g.INSTANCE.c());
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            gVarD = g.d(g.r(gVarD.getPackedValue(), listC.get(i11).getScrollDelta()));
        }
        return g.s(gVarD.getPackedValue(), -dVar.O1(h.g(64)));
    }
}
