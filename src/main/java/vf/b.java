package vf;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f119099a = new ArrayList();

    void a(u uVar) {
        this.f119099a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f119099a.size() - 1; size >= 0; size--) {
            hg.l.b(path, this.f119099a.get(size));
        }
    }
}
