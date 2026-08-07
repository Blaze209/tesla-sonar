package p3;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import k3.SolidColor;
import k3.h1;
import k3.n3;
import k3.p1;
import k3.t3;
import k3.w0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u00101\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R6\u0010:\u001a\b\u0012\u0004\u0012\u000203022\f\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010@8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010A\u001a\u0004\b\u001f\u0010B\"\u0004\b(\u0010CR \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010AR*\u0010J\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010\u001d\"\u0004\bH\u0010IR*\u0010Q\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010T\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR*\u0010W\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR*\u0010Z\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010L\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR*\u0010]\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR*\u0010`\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010L\u001a\u0004\b^\u0010N\"\u0004\b_\u0010PR*\u0010c\u001a\u00020K2\u0006\u00104\u001a\u00020K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010L\u001a\u0004\ba\u0010N\"\u0004\bb\u0010PR\u0016\u0010d\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010)R\u0014\u0010e\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010+R\u0011\u0010g\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Lp3/c;", "Lp3/l;", "<init>", "()V", "Lk3/h1;", "brush", "Ljn0/h0;", "l", "(Lk3/h1;)V", "Lk3/p1;", "color", "m", "(J)V", "node", "n", "(Lp3/l;)V", "k", "x", "y", "", "index", "instance", IntegerTokenConverter.CONVERTER_KEY, "(ILp3/l;)V", "Lm3/f;", "a", "(Lm3/f;)V", "", "toString", "()Ljava/lang/String;", "Lk3/n3;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Z", "j", "()Z", "isTintable", "e", "J", "g", "()J", "tintColor", "", "Lp3/h;", "value", "f", "getClipPathData", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "Lk3/t3;", "h", "Lk3/t3;", "clipPath", "Lkotlin/Function1;", "Lwn0/l;", "()Lwn0/l;", "(Lwn0/l;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", Gender.FEMALE, "getRotation", "()F", "s", "(F)V", "rotation", "getPivotX", "q", "pivotX", "getPivotY", "r", "pivotY", "getScaleX", "t", "scaleX", "getScaleY", "u", "scaleY", "getTranslationX", "v", "translationX", "getTranslationY", "w", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float[] groupMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<l> children;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isTintable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long tintColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends h> clipPathData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isClipPathDirty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private t3 clipPath;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super l, h0> invalidateListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<l, h0> wrappedListener;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/l;", "node", "Ljn0/h0;", "a", "(Lp3/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<l, h0> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            c.this.n(lVar);
            wn0.l<l, h0> lVarB = c.this.b();
            if (lVarB != null) {
                lVarB.invoke(lVar);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(l lVar) {
            a(lVar);
            return h0.f84049a;
        }
    }

    public c() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = p1.INSTANCE.j();
        this.clipPathData = o.d();
        this.isClipPathDirty = true;
        this.wrappedListener = new a();
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean h() {
        return !this.clipPathData.isEmpty();
    }

    private final void k() {
        this.isTintable = false;
        this.tintColor = p1.INSTANCE.j();
    }

    private final void l(h1 brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m(((SolidColor) brush).getValue());
            } else {
                k();
            }
        }
    }

    private final void m(long color) {
        if (this.isTintable && color != 16) {
            long j11 = this.tintColor;
            if (j11 == 16) {
                this.tintColor = color;
            } else {
                if (o.e(j11, color)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(l node) {
        if (node instanceof g) {
            g gVar = (g) node;
            l(gVar.getFill());
            l(gVar.getStroke());
        } else if (node instanceof c) {
            c cVar = (c) node;
            if (cVar.isTintable && this.isTintable) {
                m(cVar.tintColor);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            t3 t3VarA = this.clipPath;
            if (t3VarA == null) {
                t3VarA = w0.a();
                this.clipPath = t3VarA;
            }
            k.c(this.clipPathData, t3VarA);
        }
    }

    private final void y() {
        float[] fArrC = this.groupMatrix;
        if (fArrC == null) {
            fArrC = n3.c(null, 1, null);
            this.groupMatrix = fArrC;
        } else {
            n3.j(fArrC);
        }
        float[] fArr = fArrC;
        n3.s(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, BitmapDescriptorFactory.HUE_RED, 4, null);
        n3.m(fArr, this.rotation);
        n3.n(fArr, this.scaleX, this.scaleY, 1.0f);
        n3.s(fArr, -this.pivotX, -this.pivotY, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    @Override // p3.l
    public void a(m3.f fVar) {
        if (this.isMatrixDirty) {
            y();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            x();
            this.isClipPathDirty = false;
        }
        m3.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.a().u();
        try {
            m3.h transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.e(n3.a(fArr).getValues());
            }
            t3 t3Var = this.clipPath;
            if (h() && t3Var != null) {
                m3.h.j(transform, t3Var, 0, 2, null);
            }
            List<l> list = this.children;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).a(fVar);
            }
        } finally {
            drawContext.a().o();
            drawContext.f(jB);
        }
    }

    @Override // p3.l
    public wn0.l<l, h0> b() {
        return this.invalidateListener;
    }

    @Override // p3.l
    public void d(wn0.l<? super l, h0> lVar) {
        this.invalidateListener = lVar;
    }

    public final int f() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public final void i(int index, l instance) {
        if (index < f()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        n(instance);
        instance.d(this.wrappedListener);
        c();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    public final void o(List<? extends h> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        c();
    }

    public final void p(String str) {
        this.name = str;
        c();
    }

    public final void q(float f11) {
        this.pivotX = f11;
        this.isMatrixDirty = true;
        c();
    }

    public final void r(float f11) {
        this.pivotY = f11;
        this.isMatrixDirty = true;
        c();
    }

    public final void s(float f11) {
        this.rotation = f11;
        this.isMatrixDirty = true;
        c();
    }

    public final void t(float f11) {
        this.scaleX = f11;
        this.isMatrixDirty = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<l> list = this.children;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            l lVar = list.get(i11);
            sb2.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb2.append(lVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f11) {
        this.scaleY = f11;
        this.isMatrixDirty = true;
        c();
    }

    public final void v(float f11) {
        this.translationX = f11;
        this.isMatrixDirty = true;
        c();
    }

    public final void w(float f11) {
        this.translationY = f11;
        this.isMatrixDirty = true;
        c();
    }
}
