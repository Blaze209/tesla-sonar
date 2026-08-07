package ql0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
class p implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i> f105675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i> f105676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<i> f105677c = new HashSet(3);

    p(@NonNull List<i> list) {
        this.f105675a = list;
        this.f105676b = new ArrayList(list.size());
    }

    private void a(@NonNull i iVar) {
        if (this.f105676b.contains(iVar)) {
            return;
        }
        if (this.f105677c.contains(iVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f105677c);
        }
        this.f105677c.add(iVar);
        iVar.f(this);
        this.f105677c.remove(iVar);
        if (this.f105676b.contains(iVar)) {
            return;
        }
        if (rl0.a.class.isAssignableFrom(iVar.getClass())) {
            this.f105676b.add(0, iVar);
        } else {
            this.f105676b.add(iVar);
        }
    }

    @NonNull
    List<i> b() {
        Iterator<i> it = this.f105675a.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this.f105676b;
    }
}
