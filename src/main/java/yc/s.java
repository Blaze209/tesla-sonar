package yc;

import p013kotlin.Metadata;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lyc/s;", "Lyc/n;", "Lyc/t;", "logger", "<init>", "(Lyc/t;)V", "Lsc/g;", "size", "", "a", "(Lsc/g;)Z", "b", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements n {
    public s(t tVar) {
    }

    @Override // yc.n
    public boolean a(Size size) {
        sc.a width = size.getWidth();
        if ((width instanceof sc.a.C2364a ? ((sc.a.C2364a) width).getPx() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        sc.a height = size.getHeight();
        return (height instanceof sc.a.C2364a ? ((sc.a.C2364a) height).getPx() : Integer.MAX_VALUE) > 100;
    }

    @Override // yc.n
    /* JADX INFO: renamed from: b */
    public boolean getAllowHardware() {
        return j.f125349a.b(null);
    }
}
