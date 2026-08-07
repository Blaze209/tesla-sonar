package jj;

import androidx.annotation.NonNull;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class n<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xj.h<b<A>, B> f83868a;

    class a extends xj.h<b<A>, B> {
        a(long j11) {
            super(j11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // xj.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(@NonNull b<A> bVar, B b11) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f83870d = xj.l.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f83871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f83872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A f83873c;

        private b() {
        }

        static <A> b<A> a(A a11, int i11, int i12) {
            b<A> bVar;
            Queue<b<?>> queue = f83870d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a11, i11, i12);
            return bVar;
        }

        private void b(A a11, int i11, int i12) {
            this.f83873c = a11;
            this.f83872b = i11;
            this.f83871a = i12;
        }

        public void c() {
            Queue<b<?>> queue = f83870d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f83872b == bVar.f83872b && this.f83871a == bVar.f83871a && this.f83873c.equals(bVar.f83873c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f83871a * 31) + this.f83872b) * 31) + this.f83873c.hashCode();
        }
    }

    public n(long j11) {
        this.f83868a = new a(j11);
    }

    public B a(A a11, int i11, int i12) {
        b<A> bVarA = b.a(a11, i11, i12);
        B bG = this.f83868a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a11, int i11, int i12, B b11) {
        this.f83868a.k(b.a(a11, i11, i12), b11);
    }
}
