package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lz3/k;", "", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126760a;

    /* JADX INFO: renamed from: z3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001d\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006!"}, d2 = {"Lz3/k$a;", "", "<init>", "()V", "Lz3/k;", "b", "Lz3/k;", "a", "()Lz3/k;", "getCrop$annotations", "Crop", "c", "e", "getFit$annotations", "Fit", DateTokenConverter.CONVERTER_KEY, "getFillHeight$annotations", "FillHeight", "getFillWidth$annotations", "FillWidth", "f", "getInside$annotations", "Inside", "Lz3/n;", "g", "Lz3/n;", "getNone", "()Lz3/n;", "getNone$annotations", "None", "h", "getFillBounds$annotations", "FillBounds", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126760a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final k Crop = new C2748a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final k Fit = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final k FillHeight = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final k FillWidth = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final k Inside = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final FixedScale None = new FixedScale(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final k FillBounds = new b();

        /* JADX INFO: renamed from: z3.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$a", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2748a implements k {
            C2748a() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                float f11 = l.f(srcSize, dstSize);
                return e1.a(f11, f11);
            }
        }

        /* JADX INFO: renamed from: z3.k$a$b */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$b", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements k {
            b() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                return e1.a(l.h(srcSize, dstSize), l.e(srcSize, dstSize));
            }
        }

        /* JADX INFO: renamed from: z3.k$a$c */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$c", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements k {
            c() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                float fE = l.e(srcSize, dstSize);
                return e1.a(fE, fE);
            }
        }

        /* JADX INFO: renamed from: z3.k$a$d */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$d", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d implements k {
            d() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                float fH = l.h(srcSize, dstSize);
                return e1.a(fH, fH);
            }
        }

        /* JADX INFO: renamed from: z3.k$a$e */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$e", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements k {
            e() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                float fG = l.g(srcSize, dstSize);
                return e1.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: z3.k$a$f */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"z3/k$a$f", "Lz3/k;", "Lj3/m;", "srcSize", "dstSize", "Lz3/d1;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class f implements k {
            f() {
            }

            @Override // z3.k
            public long a(long srcSize, long dstSize) {
                if (j3.m.k(srcSize) <= j3.m.k(dstSize) && j3.m.i(srcSize) <= j3.m.i(dstSize)) {
                    return e1.a(1.0f, 1.0f);
                }
                float fG = l.g(srcSize, dstSize);
                return e1.a(fG, fG);
            }
        }

        private Companion() {
        }

        public final k a() {
            return Crop;
        }

        public final k b() {
            return FillBounds;
        }

        public final k c() {
            return FillHeight;
        }

        public final k d() {
            return FillWidth;
        }

        public final k e() {
            return Fit;
        }

        public final k f() {
            return Inside;
        }
    }

    long a(long srcSize, long dstSize);
}
