package pk;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n<Boolean> f103135a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n<Boolean> f103136b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n<String> f103137c = new d();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f103138a;

        a(Object obj) {
            this.f103138a = obj;
        }

        @Override // pk.n
        public T get() {
            return (T) this.f103138a;
        }
    }

    class b implements n<Boolean> {
        b() {
        }

        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements n<Boolean> {
        c() {
        }

        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    class d implements n<String> {
        d() {
        }

        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    public static <T> n<T> a(T t11) {
        return new a(t11);
    }
}
