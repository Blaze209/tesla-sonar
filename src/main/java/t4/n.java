package t4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.SolidColor;
import k3.c4;
import k3.h1;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0011J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lt4/n;", "", "other", DateTokenConverter.CONVERTER_KEY, "(Lt4/n;)Lt4/n;", "Lkotlin/Function0;", "a", "(Lwn0/a;)Lt4/n;", "Lk3/p1;", "c", "()J", "color", "Lk3/h1;", "e", "()Lk3/h1;", "brush", "", "b", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112353a;

    /* JADX INFO: renamed from: t4.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lt4/n$a;", "", "<init>", "()V", "Lk3/p1;", "color", "Lt4/n;", "b", "(J)Lt4/n;", "Lk3/h1;", "brush", "", "alpha", "a", "(Lk3/h1;F)Lt4/n;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f112353a = new Companion();

        private Companion() {
        }

        public final n a(h1 brush, float alpha) {
            if (brush == null) {
                return b.f112354b;
            }
            if (brush instanceof SolidColor) {
                return b(m.c(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof c4) {
                return new BrushStyle((c4) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final n b(long color) {
            return color != 16 ? new ColorStyle(color, null) : b.f112354b;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lt4/n$b;", "Lt4/n;", "<init>", "()V", "Lk3/p1;", "c", "()J", "color", "Lk3/h1;", "e", "()Lk3/h1;", "brush", "", "b", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f112354b = new b();

        private b() {
        }

        @Override // t4.n
        /* JADX INFO: renamed from: b */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // t4.n
        /* JADX INFO: renamed from: c */
        public long getValue() {
            return p1.INSTANCE.j();
        }

        @Override // t4.n
        public h1 e() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<Float> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getAlpha());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt4/n;", "b", "()Lt4/n;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<n> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return n.this;
        }
    }

    default n a(wn0.a<? extends n> other) {
        return !p013kotlin.jvm.internal.s.f(this, b.f112354b) ? this : other.invoke();
    }

    /* JADX INFO: renamed from: b */
    float getAlpha();

    /* JADX INFO: renamed from: c */
    long getValue();

    default n d(n other) {
        boolean z11 = other instanceof BrushStyle;
        if (z11 && (this instanceof BrushStyle)) {
            return new BrushStyle(((BrushStyle) other).getValue(), m.d(other.getAlpha(), new c()));
        }
        if (!z11 || (this instanceof BrushStyle)) {
            return (z11 || !(this instanceof BrushStyle)) ? other.a(new d()) : this;
        }
        return other;
    }

    h1 e();
}
