package p019p1;

import androidx.collection.b0;
import androidx.collection.c0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lp1/r0;", "T", "Lp1/c0;", "Lp1/r0$b;", "config", "<init>", "(Lp1/r0$b;)V", "Lp1/q;", "V", "Lp1/p1;", "converter", "Lp1/b2;", "f", "(Lp1/p1;)Lp1/b2;", "a", "Lp1/r0$b;", "getConfig", "()Lp1/r0$b;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0<T> implements c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> config;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lp1/r0$a;", "T", "Lp1/q0;", "value", "Lp1/d0;", "easing", "Lp1/t;", "arcMode", "<init>", "(Ljava/lang/Object;Lp1/d0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", DateTokenConverter.CONVERTER_KEY, "setArcMode-Rur9ykg$animation_core_release", "(I)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends q0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int arcMode;

        public /* synthetic */ a(Object obj, d0 d0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, d0Var, i11);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return s.f(aVar.b(), b()) && s.f(aVar.getEasing(), getEasing()) && t.c(aVar.arcMode, this.arcMode);
        }

        public int hashCode() {
            T tB = b();
            return ((((tB != null ? tB.hashCode() : 0) * 31) + t.d(this.arcMode)) * 31) + getEasing().hashCode();
        }

        public /* synthetic */ a(Object obj, d0 d0Var, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i12 & 2) != 0 ? f0.d() : d0Var, (i12 & 4) != 0 ? t.INSTANCE.a() : i11, null);
        }

        private a(T t11, d0 d0Var, int i11) {
            super(t11, d0Var, null);
            this.arcMode = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp1/r0$b;", "T", "Lp1/s0;", "Lp1/r0$a;", "<init>", "()V", "", "timeStamp", "g", "(Ljava/lang/Object;I)Lp1/r0$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends s0<T, a<T>> {
        public b() {
            super(null);
        }

        public a<T> g(T t11, int i11) {
            a<T> aVar = new a<>(t11, null, 0, 6, null);
            c().t(i11, aVar);
            return aVar;
        }
    }

    public r0(b<T> bVar) {
        this.config = bVar;
    }

    @Override // p019p1.g0, p019p1.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends q> b2<V> a(p1<T, V> converter) {
        long[] jArr;
        int[] iArr;
        b0 b0Var = new b0(this.config.c().get_size() + 2);
        c0 c0Var = new c0(this.config.c().get_size());
        c0<a<T>> c0VarC = this.config.c();
        int[] iArr2 = c0VarC.keys;
        Object[] objArr = c0VarC.values;
        long[] jArr2 = c0VarC.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j11) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr2[i15];
                            a aVar = (a) objArr[i15];
                            b0Var.g(i16);
                            c0Var.t(i16, new VectorizedKeyframeSpecElementInfo(converter.a().invoke(aVar.b()), aVar.getEasing(), aVar.getArcMode(), null));
                        }
                        j11 >>= i12;
                        i14++;
                        i12 = i12;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        }
        if (!this.config.c().a(0)) {
            b0Var.f(0, 0);
        }
        if (!this.config.c().a(this.config.getDurationMillis())) {
            b0Var.g(this.config.getDurationMillis());
        }
        b0Var.n();
        return new b2<>(b0Var, c0Var, this.config.getDurationMillis(), this.config.getDelayMillis(), f0.d(), t.INSTANCE.a(), null);
    }
}
