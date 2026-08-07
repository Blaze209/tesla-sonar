package pq0;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class m implements tq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<vq0.a> f103695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, sq0.o> f103696b;

    public m(List<vq0.a> list, Map<String, sq0.o> map) {
        this.f103695a = list;
        this.f103696b = map;
    }

    @Override // tq0.b
    public List<vq0.a> a() {
        return this.f103695a;
    }

    @Override // tq0.b
    public sq0.o b(String str) {
        return this.f103696b.get(str);
    }
}
