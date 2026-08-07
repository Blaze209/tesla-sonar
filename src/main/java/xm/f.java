package xm;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray<a<T>> f123723a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a<T> f123724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a<T> f123725c;

    static class a<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a<I> f123726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f123727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList<I> f123728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<I> f123729d;

        public String toString() {
            return "LinkedEntry(key: " + this.f123727b + ")";
        }

        private a(a<I> aVar, int i11, LinkedList<I> linkedList, a<I> aVar2) {
            this.f123726a = aVar;
            this.f123727b = i11;
            this.f123728c = linkedList;
            this.f123729d = aVar2;
        }
    }

    private void b(a<T> aVar) {
        if (aVar == null || !aVar.f123728c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f123723a.remove(aVar.f123727b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(a<T> aVar) {
        if (this.f123724b == aVar) {
            return;
        }
        d(aVar);
        a<T> aVar2 = this.f123724b;
        if (aVar2 == 0) {
            this.f123724b = aVar;
            this.f123725c = aVar;
        } else {
            aVar.f123729d = aVar2;
            aVar2.f123726a = aVar;
            this.f123724b = aVar;
        }
    }

    private synchronized void d(a<T> aVar) {
        try {
            a aVar2 = (a<T>) aVar.f123726a;
            a aVar3 = (a<T>) aVar.f123729d;
            if (aVar2 != null) {
                aVar2.f123729d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f123726a = aVar2;
            }
            aVar.f123726a = null;
            aVar.f123729d = null;
            if (aVar == this.f123724b) {
                this.f123724b = aVar3;
            }
            if (aVar == this.f123725c) {
                this.f123725c = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized T a(int i11) {
        a<T> aVar = this.f123723a.get(i11);
        if (aVar == null) {
            return null;
        }
        T tPollFirst = aVar.f123728c.pollFirst();
        c(aVar);
        return tPollFirst;
    }

    public synchronized void e(int i11, T t11) {
        try {
            a<T> aVar = this.f123723a.get(i11);
            if (aVar == null) {
                a<T> aVar2 = new a<>(null, i11, new LinkedList(), null);
                this.f123723a.put(i11, aVar2);
                aVar = aVar2;
            }
            aVar.f123728c.addLast(t11);
            c(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized T f() {
        a<T> aVar = this.f123725c;
        if (aVar == null) {
            return null;
        }
        T tPollLast = aVar.f123728c.pollLast();
        b(aVar);
        return tPollLast;
    }
}
