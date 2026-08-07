package qg;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Stack<e> f105431a = new Stack<>();

    public void a() {
        if (c()) {
            return;
        }
        Iterator<e> it = this.f105431a.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        this.f105431a.clear();
    }

    public void b(e eVar) {
        this.f105431a.push(eVar);
    }

    public boolean c() {
        return this.f105431a.isEmpty();
    }

    public e d() {
        return this.f105431a.pop();
    }
}
