package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityQueue<aq.b> f39216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<aq.b> f39217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<aq.b> f39218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f39219d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f39220e;

    class a implements Comparator<aq.b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(aq.b bVar, aq.b bVar2) {
            if (bVar.a() == bVar2.a()) {
                return 0;
            }
            return bVar.a() > bVar2.a() ? 1 : -1;
        }
    }

    public b() {
        a aVar = new a();
        this.f39220e = aVar;
        this.f39217b = new PriorityQueue<>(dq.a.C1240a.f60817a, aVar);
        this.f39216a = new PriorityQueue<>(dq.a.C1240a.f60817a, aVar);
        this.f39218c = new ArrayList();
    }

    private void a(Collection<aq.b> collection, aq.b bVar) {
        Iterator<aq.b> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().equals(bVar)) {
                bVar.d().recycle();
                return;
            }
        }
        collection.add(bVar);
    }

    private static aq.b e(PriorityQueue<aq.b> priorityQueue, aq.b bVar) {
        for (aq.b bVar2 : priorityQueue) {
            if (bVar2.equals(bVar)) {
                return bVar2;
            }
        }
        return null;
    }

    private void h() {
        synchronized (this.f39219d) {
            while (this.f39217b.size() + this.f39216a.size() >= dq.a.C1240a.f60817a && !this.f39216a.isEmpty()) {
                try {
                    this.f39216a.poll().d().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            while (this.f39217b.size() + this.f39216a.size() >= dq.a.C1240a.f60817a && !this.f39217b.isEmpty()) {
                this.f39217b.poll().d().recycle();
            }
        }
    }

    public void b(aq.b bVar) {
        synchronized (this.f39219d) {
            h();
            this.f39217b.offer(bVar);
        }
    }

    public void c(aq.b bVar) {
        synchronized (this.f39218c) {
            while (this.f39218c.size() >= dq.a.C1240a.f60818b) {
                try {
                    this.f39218c.remove(0).d().recycle();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f39218c, bVar);
        }
    }

    public boolean d(int i11, RectF rectF) {
        aq.b bVar = new aq.b(i11, null, rectF, true, 0);
        synchronized (this.f39218c) {
            try {
                Iterator<aq.b> it = this.f39218c.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(bVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<aq.b> f() {
        ArrayList arrayList;
        synchronized (this.f39219d) {
            arrayList = new ArrayList(this.f39216a);
            arrayList.addAll(this.f39217b);
        }
        return arrayList;
    }

    public List<aq.b> g() {
        List<aq.b> list;
        synchronized (this.f39218c) {
            list = this.f39218c;
        }
        return list;
    }

    public void i() {
        synchronized (this.f39219d) {
            this.f39216a.addAll(this.f39217b);
            this.f39217b.clear();
        }
    }

    public void j() {
        synchronized (this.f39219d) {
            try {
                Iterator<aq.b> it = this.f39216a.iterator();
                while (it.hasNext()) {
                    it.next().d().recycle();
                }
                this.f39216a.clear();
                Iterator<aq.b> it2 = this.f39217b.iterator();
                while (it2.hasNext()) {
                    it2.next().d().recycle();
                }
                this.f39217b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f39218c) {
            try {
                Iterator<aq.b> it3 = this.f39218c.iterator();
                while (it3.hasNext()) {
                    it3.next().d().recycle();
                }
                this.f39218c.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean k(int i11, RectF rectF, int i12) {
        aq.b bVar = new aq.b(i11, null, rectF, false, 0);
        synchronized (this.f39219d) {
            try {
                aq.b bVarE = e(this.f39216a, bVar);
                boolean z11 = true;
                if (bVarE == null) {
                    if (e(this.f39217b, bVar) == null) {
                        z11 = false;
                    }
                    return z11;
                }
                this.f39216a.remove(bVarE);
                bVarE.f(i12);
                this.f39217b.offer(bVarE);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
