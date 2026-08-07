package jk0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class c extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f83931a;

    c(d dVar) {
        this.f83931a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f83931a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        d.b[] bVarArr = this.f83931a.f83933a;
        int iIdentityHashCode = key == null ? 0 : System.identityHashCode(key);
        for (d.b bVar = bVarArr[(Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length]; bVar != null; bVar = bVar.f83944d) {
            if (bVar.f83941a == iIdentityHashCode && bVar.equals(entry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f83931a.j(2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        d.b[] bVarArr = this.f83931a.f83933a;
        int iIdentityHashCode = key == null ? 0 : System.identityHashCode(key);
        int length = (Integer.MAX_VALUE & iIdentityHashCode) % bVarArr.length;
        d.b bVar = null;
        for (d.b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f83944d) {
            if (bVar2.f83941a == iIdentityHashCode && bVar2.equals(entry)) {
                d.i(this.f83931a);
                if (bVar != null) {
                    bVar.f83944d = bVar2.f83944d;
                } else {
                    bVarArr[length] = bVar2.f83944d;
                }
                d.d(this.f83931a);
                bVar2.f83943c = null;
                return true;
            }
            bVar = bVar2;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f83931a.f83934b;
    }
}
