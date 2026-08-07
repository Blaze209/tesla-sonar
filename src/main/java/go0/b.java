package go0;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class b implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f69263a;

    public b(Map map) {
        this.f69263a = map;
    }

    @Override // wn0.a
    public Object invoke() {
        return Integer.valueOf(f.j(this.f69263a));
    }
}
