package go0;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class c implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f69264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f69265b;

    public c(Class cls, Map map) {
        this.f69264a = cls;
        this.f69265b = map;
    }

    @Override // wn0.a
    public Object invoke() {
        return f.l(this.f69264a, this.f69265b);
    }
}
