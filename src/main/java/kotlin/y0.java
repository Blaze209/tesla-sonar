package kotlin;

import a3.j;
import a3.l;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.p0;
import j3.i;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.b2;
import p020r2.l1;
import p020r2.n3;
import p020r2.p1;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R(\u0010,\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lb2/y0;", "", "Ls1/p;", "initialOrientation", "", "initial", "<init>", "(Ls1/p;F)V", "()V", "orientation", "Lj3/i;", "cursorRect", "", "containerSize", "textFieldSize", "Ljn0/h0;", "j", "(Ls1/p;Lj3/i;II)V", "cursorStart", "cursorEnd", "b", "(FFI)V", "Li4/p0;", "selection", "e", "(J)I", "<set-?>", "a", "Lr2/l1;", DateTokenConverter.CONVERTER_KEY, "()F", "h", "(F)V", "offset", "c", "g", "maximum", "Lj3/i;", "previousCursorRect", "J", "getPreviousSelection-d9O1mEE", "()J", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "previousSelection", "Lr2/p1;", "f", "()Ls1/p;", "setOrientation", "(Ls1/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j<y0, Object> f15954g = a3.a.a(a.f15960c, b.f15961c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l1 offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1 maximum;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i previousCursorRect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long previousSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 orientation;

    @p013kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La3/l;", "Lb2/y0;", "it", "", "", "a", "(La3/l;Lb2/y0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, y0, List<? extends Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15960c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(l lVar, y0 y0Var) {
            return v.p(Float.valueOf(y0Var.d()), Boolean.valueOf(y0Var.f() == p021s1.p.Vertical));
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "restored", "Lb2/y0;", "a", "(Ljava/util/List;)Lb2/y0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<List<? extends Object>, y0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15961c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0 invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            s.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
            p021s1.p pVar = ((Boolean) obj).booleanValue() ? p021s1.p.Vertical : p021s1.p.Horizontal;
            Object obj2 = list.get(0);
            s.i(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new y0(pVar, ((Float) obj2).floatValue());
        }
    }

    /* JADX INFO: renamed from: b2.y0$c, reason: from kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb2/y0$c;", "", "<init>", "()V", "La3/j;", "Lb2/y0;", "Saver", "La3/j;", "a", "()La3/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<y0, Object> a() {
            return y0.f15954g;
        }

        private Companion() {
        }
    }

    public y0(p021s1.p pVar, float f11) {
        this.offset = b2.a(f11);
        this.maximum = b2.a(BitmapDescriptorFactory.HUE_RED);
        this.previousCursorRect = i.INSTANCE.a();
        this.previousSelection = p0.INSTANCE.a();
        this.orientation = n3.h(pVar, n3.q());
    }

    private final void g(float f11) {
        this.maximum.r(f11);
    }

    public final void b(float cursorStart, float cursorEnd, int containerSize) {
        float f11;
        float fD = d();
        float f12 = containerSize;
        float f13 = fD + f12;
        if (cursorEnd <= f13 && (cursorStart >= fD || cursorEnd - cursorStart <= f12)) {
            f11 = (cursorStart >= fD || cursorEnd - cursorStart > f12) ? BitmapDescriptorFactory.HUE_RED : cursorStart - fD;
        } else {
            f11 = cursorEnd - f13;
        }
        h(d() + f11);
    }

    public final float c() {
        return this.maximum.d();
    }

    public final float d() {
        return this.offset.d();
    }

    public final int e(long selection) {
        if (p0.n(selection) != p0.n(this.previousSelection)) {
            return p0.n(selection);
        }
        return p0.i(selection) != p0.i(this.previousSelection) ? p0.i(selection) : p0.l(selection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p021s1.p f() {
        return (p021s1.p) this.orientation.getValue();
    }

    public final void h(float f11) {
        this.offset.r(f11);
    }

    public final void i(long j11) {
        this.previousSelection = j11;
    }

    public final void j(p021s1.p orientation, i cursorRect, int containerSize, int textFieldSize) {
        float f11 = textFieldSize - containerSize;
        g(f11);
        if (cursorRect.getLeft() != this.previousCursorRect.getLeft() || cursorRect.getTop() != this.previousCursorRect.getTop()) {
            boolean z11 = orientation == p021s1.p.Vertical;
            b(z11 ? cursorRect.getTop() : cursorRect.getLeft(), z11 ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.previousCursorRect = cursorRect;
        }
        h(n.m(d(), BitmapDescriptorFactory.HUE_RED, f11));
    }

    public /* synthetic */ y0(p021s1.p pVar, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i11 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f11);
    }

    public y0() {
        this(p021s1.p.Vertical, BitmapDescriptorFactory.HUE_RED, 2, null);
    }
}
