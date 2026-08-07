package z3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lz3/a;", "", "position1", "position2", "c", "(Lz3/a;II)I", "Lz3/p;", "a", "Lz3/p;", "()Lz3/p;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f126645a = new p(a.f126647a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f126646b = new p(C2746b.f126648a);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f126647a = new a();

        a() {
            super(2, yn0.a.class, "min", "min(II)I", 1);
        }

        public final Integer a(int i11, int i12) {
            return Integer.valueOf(Math.min(i11, i12));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: z3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C2746b extends p013kotlin.jvm.internal.p implements wn0.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2746b f126648a = new C2746b();

        C2746b() {
            super(2, yn0.a.class, "max", "max(II)I", 1);
        }

        public final Integer a(int i11, int i12) {
            return Integer.valueOf(Math.max(i11, i12));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }
    }

    public static final p a() {
        return f126645a;
    }

    public static final p b() {
        return f126646b;
    }

    public static final int c(z3.a aVar, int i11, int i12) {
        return aVar.a().invoke(Integer.valueOf(i11), Integer.valueOf(i12)).intValue();
    }
}
