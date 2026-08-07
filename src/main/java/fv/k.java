package fv;

import gv.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f66657a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66658b;

    public k(int i11) {
        this.f66658b = i11;
    }

    public List<f0.e.d.AbstractC1440e> a() {
        List<j> listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listB.size(); i11++) {
            arrayList.add(listB.get(i11).h());
        }
        return arrayList;
    }

    public synchronized List<j> b() {
        return Collections.unmodifiableList(new ArrayList(this.f66657a));
    }

    public synchronized boolean c(List<j> list) {
        this.f66657a.clear();
        if (list.size() <= this.f66658b) {
            return this.f66657a.addAll(list);
        }
        bv.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f66658b);
        return this.f66657a.addAll(list.subList(0, this.f66658b));
    }
}
