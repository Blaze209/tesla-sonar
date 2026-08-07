package k3;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"", Snapshot.WIDTH, Snapshot.HEIGHT, "Lk3/j3;", "config", "", "hasAlpha", "Ll3/c;", "colorSpace", "Lk3/i3;", "a", "(IIIZLl3/c;)Lk3/i3;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k3 {
    public static final i3 a(int i11, int i12, int i13, boolean z11, l3.c cVar) {
        return n0.a(i11, i12, i13, z11, cVar);
    }

    public static /* synthetic */ i3 b(int i11, int i12, int i13, boolean z11, l3.c cVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = j3.INSTANCE.b();
        }
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        if ((i14 & 16) != 0) {
            cVar = l3.g.f89510a.w();
        }
        return a(i11, i12, i13, z11, cVar);
    }
}
