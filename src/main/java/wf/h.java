package wf;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<cg.o, Path>> f121742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f121743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<cg.i> f121744c;

    public h(List<cg.i> list) {
        this.f121744c = list;
        this.f121742a = new ArrayList(list.size());
        this.f121743b = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f121742a.add(list.get(i11).b().a());
            this.f121743b.add(list.get(i11).c().a());
        }
    }

    public List<a<cg.o, Path>> a() {
        return this.f121742a;
    }

    public List<cg.i> b() {
        return this.f121744c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f121743b;
    }
}
