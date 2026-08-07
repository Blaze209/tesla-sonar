package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.List;
import k3.h1;
import k3.t3;
import k3.v0;
import k3.w0;
import k3.w3;
import m3.Stroke;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020,8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R*\u0010:\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R.\u0010<\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b4\u0010\u0018\"\u0004\b;\u0010\u001aR0\u0010@\u001a\u00020=2\u0006\u0010\r\u001a\u00020=8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u00100\"\u0004\b?\u00102R0\u0010D\u001a\u00020A2\u0006\u0010\r\u001a\u00020A8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\bB\u00100\"\u0004\bC\u00102R*\u0010G\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R*\u0010J\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001e\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R*\u0010M\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R*\u0010P\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001e\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010RR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010RR\u0016\u0010U\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ZR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ZR\u001b\u0010`\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b-\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Lp3/g;", "Lp3/l;", "<init>", "()V", "Ljn0/h0;", "v", "w", "Lm3/f;", "a", "(Lm3/f;)V", "", "toString", "()Ljava/lang/String;", "value", "b", "Ljava/lang/String;", "getName", "j", "(Ljava/lang/String;)V", "name", "Lk3/h1;", "c", "Lk3/h1;", "e", "()Lk3/h1;", "h", "(Lk3/h1;)V", "fill", "", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "getFillAlpha", "()F", IntegerTokenConverter.CONVERTER_KEY, "(F)V", "fillAlpha", "", "Lp3/h;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "pathData", "Lk3/v3;", "f", "I", "getPathFillType-Rg-k1Os", "()I", "l", "(I)V", "pathFillType", "g", "getStrokeAlpha", "n", "strokeAlpha", "getStrokeLineWidth", "r", "strokeLineWidth", "m", "stroke", "Lk3/i4;", "getStrokeLineCap-KaPHkGw", "o", "strokeLineCap", "Lk3/j4;", "getStrokeLineJoin-LxFBmk8", "p", "strokeLineJoin", "getStrokeLineMiter", "q", "strokeLineMiter", "getTrimPathStart", "u", "trimPathStart", "getTrimPathEnd", "s", "trimPathEnd", "getTrimPathOffset", "t", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lm3/k;", "Lm3/k;", "strokeStyle", "Lk3/t3;", "Lk3/t3;", "path", "renderPath", "Lk3/w3;", "Lkotlin/Lazy;", "()Lk3/w3;", "pathMeasure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private h1 fill;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float fillAlpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends h> pathData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int pathFillType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float strokeLineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private h1 stroke;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int strokeLineCap;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int strokeLineJoin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float strokeLineMiter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float trimPathStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float trimPathEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float trimPathOffset;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isPathDirty;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isStrokeDirty;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Stroke strokeStyle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final t3 path;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private t3 renderPath;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy pathMeasure;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk3/w3;", "b", "()Lk3/w3;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<w3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f100947c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w3 invoke() {
            return v0.a();
        }
    }

    public g() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = o.d();
        this.pathFillType = o.a();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = o.b();
        this.strokeLineJoin = o.c();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        t3 t3VarA = w0.a();
        this.path = t3VarA;
        this.renderPath = t3VarA;
        this.pathMeasure = jn0.m.a(jn0.p.NONE, a.f100947c);
    }

    private final w3 f() {
        return (w3) this.pathMeasure.getValue();
    }

    private final void v() {
        k.c(this.pathData, this.path);
        w();
    }

    private final void w() {
        if (this.trimPathStart == BitmapDescriptorFactory.HUE_RED && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (s.f(this.renderPath, this.path)) {
            this.renderPath = w0.a();
        } else {
            int iK = this.renderPath.k();
            this.renderPath.m();
            this.renderPath.p(iK);
        }
        f().a(this.path, false);
        float length = f().getLength();
        float f11 = this.trimPathStart;
        float f12 = this.trimPathOffset;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.trimPathEnd + f12) % 1.0f) * length;
        if (f13 <= f14) {
            f().b(f13, f14, this.renderPath, true);
        } else {
            f().b(f13, length, this.renderPath, true);
            f().b(BitmapDescriptorFactory.HUE_RED, f14, this.renderPath, true);
        }
    }

    @Override // p3.l
    public void a(m3.f fVar) {
        Stroke stroke;
        if (this.isPathDirty) {
            v();
        } else if (this.isTrimPathDirty) {
            w();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        h1 h1Var = this.fill;
        if (h1Var != null) {
            m3.f.K1(fVar, this.renderPath, h1Var, this.fillAlpha, null, null, 0, 56, null);
        }
        h1 h1Var2 = this.stroke;
        if (h1Var2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            m3.f.K1(fVar, this.renderPath, h1Var2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h1 getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h1 getStroke() {
        return this.stroke;
    }

    public final void h(h1 h1Var) {
        this.fill = h1Var;
        c();
    }

    public final void i(float f11) {
        this.fillAlpha = f11;
        c();
    }

    public final void j(String str) {
        this.name = str;
        c();
    }

    public final void k(List<? extends h> list) {
        this.pathData = list;
        this.isPathDirty = true;
        c();
    }

    public final void l(int i11) {
        this.pathFillType = i11;
        this.renderPath.p(i11);
        c();
    }

    public final void m(h1 h1Var) {
        this.stroke = h1Var;
        c();
    }

    public final void n(float f11) {
        this.strokeAlpha = f11;
        c();
    }

    public final void o(int i11) {
        this.strokeLineCap = i11;
        this.isStrokeDirty = true;
        c();
    }

    public final void p(int i11) {
        this.strokeLineJoin = i11;
        this.isStrokeDirty = true;
        c();
    }

    public final void q(float f11) {
        this.strokeLineMiter = f11;
        this.isStrokeDirty = true;
        c();
    }

    public final void r(float f11) {
        this.strokeLineWidth = f11;
        this.isStrokeDirty = true;
        c();
    }

    public final void s(float f11) {
        this.trimPathEnd = f11;
        this.isTrimPathDirty = true;
        c();
    }

    public final void t(float f11) {
        this.trimPathOffset = f11;
        this.isTrimPathDirty = true;
        c();
    }

    public String toString() {
        return this.path.toString();
    }

    public final void u(float f11) {
        this.trimPathStart = f11;
        this.isTrimPathDirty = true;
        c();
    }
}
