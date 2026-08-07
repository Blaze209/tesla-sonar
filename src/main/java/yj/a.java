package yj;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g<Object> f125619a = new C2730a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // yj.a.d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // yj.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T create();
    }

    private static final class e<T> implements u5.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f125620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g<T> f125621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u5.f<T> f125622c;

        e(@NonNull u5.f<T> fVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
            this.f125622c = fVar;
            this.f125620a = dVar;
            this.f125621b = gVar;
        }

        @Override // u5.f
        public boolean a(@NonNull T t11) {
            if (t11 instanceof f) {
                ((f) t11).e().b(true);
            }
            this.f125621b.a(t11);
            return this.f125622c.a(t11);
        }

        @Override // u5.f
        public T b() {
            T tB = this.f125622c.b();
            if (tB == null) {
                tB = this.f125620a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tB.getClass());
                }
            }
            if (tB instanceof f) {
                ((f) tB).e().b(false);
            }
            return tB;
        }
    }

    public interface f {
        @NonNull
        yj.c e();
    }

    public interface g<T> {
        void a(@NonNull T t11);
    }

    @NonNull
    private static <T extends f> u5.f<T> a(@NonNull u5.f<T> fVar, @NonNull d<T> dVar) {
        return b(fVar, dVar, c());
    }

    @NonNull
    private static <T> u5.f<T> b(@NonNull u5.f<T> fVar, @NonNull d<T> dVar, @NonNull g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    @NonNull
    private static <T> g<T> c() {
        return (g<T>) f125619a;
    }

    @NonNull
    public static <T extends f> u5.f<T> d(int i11, @NonNull d<T> dVar) {
        return a(new u5.g(i11), dVar);
    }

    @NonNull
    public static <T> u5.f<List<T>> e() {
        return f(20);
    }

    @NonNull
    public static <T> u5.f<List<T>> f(int i11) {
        return b(new u5.g(i11), new b(), new c());
    }

    /* JADX INFO: renamed from: yj.a$a, reason: collision with other inner class name */
    class C2730a implements g<Object> {
        C2730a() {
        }

        @Override // yj.a.g
        public void a(@NonNull Object obj) {
        }
    }
}
