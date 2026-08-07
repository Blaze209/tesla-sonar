package wf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A f121784i;

    public q(ig.c<A> cVar) {
        this(cVar, null);
    }

    @Override // wf.a
    float c() {
        return 1.0f;
    }

    @Override // wf.a
    public A h() {
        ig.c<A> cVar = this.f121721e;
        A a11 = this.f121784i;
        return cVar.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a11, a11, f(), f(), f());
    }

    @Override // wf.a
    A i(ig.a<K> aVar, float f11) {
        return h();
    }

    @Override // wf.a
    public void l() {
        if (this.f121721e != null) {
            super.l();
        }
    }

    @Override // wf.a
    public void n(float f11) {
        this.f121720d = f11;
    }

    public q(ig.c<A> cVar, A a11) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f121784i = a11;
    }
}
