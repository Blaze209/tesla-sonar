package iu;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class b extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f81873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f81874c;

    b(d dVar, IBinder iBinder) {
        this.f81873b = iBinder;
        Objects.requireNonNull(dVar);
        this.f81874c = dVar;
    }

    @Override // iu.m0
    public final void b() {
        f fVar = this.f81874c.f81876a;
        fVar.f81893n = (IInterface) fVar.f81888i.a(this.f81873b);
        f.s(fVar);
        fVar.f81886g = false;
        Iterator it = fVar.f81883d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        fVar.f81883d.clear();
    }
}
