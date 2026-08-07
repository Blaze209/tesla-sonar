package du;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f61030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f61031c;

    p(r rVar, IBinder iBinder) {
        this.f61030b = iBinder;
        this.f61031c = rVar;
    }

    @Override // du.j
    public final void a() {
        this.f61031c.f61033a.f61047m = e.S2(this.f61030b);
        t.q(this.f61031c.f61033a);
        this.f61031c.f61033a.f61041g = false;
        Iterator it = this.f61031c.f61033a.f61038d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f61031c.f61033a.f61038d.clear();
    }
}
