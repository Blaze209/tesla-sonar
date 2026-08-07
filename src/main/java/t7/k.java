package t7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import s7.c0;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f112819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<c0> f112820b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f112821c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f112822d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f112823e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f112824f;

    private static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f112826b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c0> f112825a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f112826b, aVar.f112826b);
        }

        public void b(long j11, c0 c0Var) {
            s7.a.a(j11 != -9223372036854775807L);
            s7.a.h(this.f112825a.isEmpty());
            this.f112826b = j11;
            this.f112825a.add(c0Var);
        }
    }

    public interface b {
        void a(long j11, c0 c0Var);
    }

    public k(b bVar) {
        this.f112819a = bVar;
    }

    private c0 c(c0 c0Var) {
        c0 c0Var2 = this.f112820b.isEmpty() ? new c0() : this.f112820b.pop();
        c0Var2.X(c0Var.a());
        System.arraycopy(c0Var.f(), c0Var.g(), c0Var2.f(), 0, c0Var2.a());
        return c0Var2;
    }

    private void e(int i11) {
        while (this.f112822d.size() > i11) {
            a aVar = (a) q0.l(this.f112822d.poll());
            for (int i12 = 0; i12 < aVar.f112825a.size(); i12++) {
                this.f112819a.a(aVar.f112826b, aVar.f112825a.get(i12));
                this.f112820b.push(aVar.f112825a.get(i12));
            }
            aVar.f112825a.clear();
            a aVar2 = this.f112824f;
            if (aVar2 != null && aVar2.f112826b == aVar.f112826b) {
                this.f112824f = null;
            }
            this.f112821c.push(aVar);
        }
    }

    public void a(long j11, c0 c0Var) {
        int i11 = this.f112823e;
        if (i11 == 0 || (i11 != -1 && this.f112822d.size() >= this.f112823e && j11 < ((a) q0.l(this.f112822d.peek())).f112826b)) {
            this.f112819a.a(j11, c0Var);
            return;
        }
        c0 c0VarC = c(c0Var);
        a aVar = this.f112824f;
        if (aVar != null && j11 == aVar.f112826b) {
            aVar.f112825a.add(c0VarC);
            return;
        }
        a aVar2 = this.f112821c.isEmpty() ? new a() : this.f112821c.pop();
        aVar2.b(j11, c0VarC);
        this.f112822d.add(aVar2);
        this.f112824f = aVar2;
        int i12 = this.f112823e;
        if (i12 != -1) {
            e(i12);
        }
    }

    public void b() {
        this.f112822d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f112823e;
    }

    public void g(int i11) {
        s7.a.h(i11 >= 0);
        this.f112823e = i11;
        e(i11);
    }
}
