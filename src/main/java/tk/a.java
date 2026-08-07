package tk;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f114644f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f114647a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final SharedReference<T> f114648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f114649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Throwable f114650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class<a> f114643e = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h<Closeable> f114645g = new C2449a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f114646h = new b();

    /* JADX INFO: renamed from: tk.a$a, reason: collision with other inner class name */
    class C2449a implements h<Closeable> {
        C2449a() {
        }

        @Override // tk.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                pk.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        @Override // tk.a.c
        public boolean a() {
            return false;
        }

        @Override // tk.a.c
        public void b(SharedReference<Object> sharedReference, Throwable th2) {
            Object objF = sharedReference.f();
            qk.a.G(a.f114643e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objF == null ? null : objF.getClass().getName());
        }
    }

    public interface c {
        boolean a();

        void b(SharedReference<Object> sharedReference, Throwable th2);
    }

    protected a(SharedReference<T> sharedReference, c cVar, Throwable th2) {
        this.f114648b = (SharedReference) k.g(sharedReference);
        sharedReference.b();
        this.f114649c = cVar;
        this.f114650d = th2;
    }

    public static void B(Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends a<?>> it = iterable.iterator();
            while (it.hasNext()) {
                C(it.next());
            }
        }
    }

    public static void C(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static boolean b0(a<?> aVar) {
        return aVar != null && aVar.J();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Ltk/a<TT;>; */
    public static a c0(Closeable closeable) {
        return k0(closeable, f114645g);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Ltk/a$c;)Ltk/a<TT;>; */
    public static a e0(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return r0(closeable, f114645g, cVar, cVar.a() ? new Throwable() : null);
    }

    public static <T> a<T> k0(T t11, h<T> hVar) {
        return n0(t11, hVar, f114646h);
    }

    public static <T> a<T> n0(T t11, h<T> hVar, c cVar) {
        if (t11 == null) {
            return null;
        }
        return r0(t11, hVar, cVar, cVar.a() ? new Throwable() : null);
    }

    public static <T> List<a<T>> o(Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<a<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(t(it.next()));
        }
        return arrayList;
    }

    public static <T> a<T> r0(T t11, h<T> hVar, c cVar, Throwable th2) {
        if (t11 == null) {
            return null;
        }
        if ((t11 instanceof Bitmap) || (t11 instanceof d)) {
            int i11 = f114644f;
            if (i11 == 1) {
                return new tk.c(t11, hVar, cVar, th2);
            }
            if (i11 == 2) {
                return new g(t11, hVar, cVar, th2);
            }
            if (i11 == 3) {
                return new e(t11);
            }
        }
        return new tk.b(t11, hVar, cVar, th2);
    }

    public static <T> a<T> t(a<T> aVar) {
        if (aVar != null) {
            return aVar.p();
        }
        return null;
    }

    public synchronized T H() {
        k.i(!this.f114647a);
        return (T) k.g(this.f114648b.f());
    }

    public int I() {
        if (J()) {
            return System.identityHashCode(this.f114648b.f());
        }
        return 0;
    }

    public synchronized boolean J() {
        return !this.f114647a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f114647a) {
                    return;
                }
                this.f114647a = true;
                this.f114648b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract a<T> clone();

    public synchronized a<T> p() {
        if (!J()) {
            return null;
        }
        return clone();
    }

    protected a(T t11, h<T> hVar, c cVar, Throwable th2, boolean z11) {
        this.f114648b = new SharedReference<>(t11, hVar, z11);
        this.f114649c = cVar;
        this.f114650d = th2;
    }
}
