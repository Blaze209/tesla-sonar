package pq0;

import java.util.LinkedList;
import java.util.ListIterator;
import sq0.w;

/* JADX INFO: loaded from: classes10.dex */
class s implements vq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f103742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103743b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<vq0.a> f103744c = new LinkedList<>();

    s(char c11) {
        this.f103742a = c11;
    }

    private vq0.a g(int i11) {
        for (vq0.a aVar : this.f103744c) {
            if (aVar.b() <= i11) {
                return aVar;
            }
        }
        return this.f103744c.getFirst();
    }

    @Override // vq0.a
    public char a() {
        return this.f103742a;
    }

    @Override // vq0.a
    public int b() {
        return this.f103743b;
    }

    @Override // vq0.a
    public char c() {
        return this.f103742a;
    }

    @Override // vq0.a
    public int d(vq0.b bVar, vq0.b bVar2) {
        return g(bVar.length()).d(bVar, bVar2);
    }

    @Override // vq0.a
    public void e(w wVar, w wVar2, int i11) {
        g(i11).e(wVar, wVar2, i11);
    }

    void f(vq0.a aVar) {
        int iB = aVar.b();
        ListIterator<vq0.a> listIterator = this.f103744c.listIterator();
        while (listIterator.hasNext()) {
            int iB2 = listIterator.next().b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f103742a + "' and minimum length " + iB);
            }
        }
        this.f103744c.add(aVar);
        this.f103743b = iB;
    }
}
