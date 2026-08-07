package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.painter.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.q1;
import m3.d;
import m3.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p020r2.e3;
import p020r2.m1;
import p020r2.p1;
import p020r2.s3;
import p3.c;
import p3.m;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001b\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010,\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b'\u0010+R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u00104\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R(\u00109\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b!\u00108R*\u0010;\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00138@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b:\u0010\u0017\"\u0004\b2\u0010\u0019R$\u0010@\u001a\u00020<2\u0006\u00105\u001a\u00020<8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b-\u0010?R\u001a\u0010B\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/b;", "Lp3/c;", "root", "<init>", "(Lp3/c;)V", "Lm3/f;", "Ljn0/h0;", "onDraw", "(Lm3/f;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Lk3/q1;", "colorFilter", "applyColorFilter", "(Lk3/q1;)Z", "Lj3/m;", "<set-?>", "f", "Lr2/p1;", "()J", "k", "(J)V", "size", "g", DateTokenConverter.CONVERTER_KEY, "()Z", "(Z)V", "autoMirror", "Lp3/m;", "h", "Lp3/m;", "getVector$ui_release", "()Lp3/m;", "vector", "", IntegerTokenConverter.CONVERTER_KEY, "Lr2/m1;", "e", "()I", "(I)V", "invalidateCount", "j", Gender.FEMALE, "currentAlpha", "Lk3/q1;", "currentColorFilter", "l", "I", "drawCount", "value", "getIntrinsicColorFilter$ui_release", "()Lk3/q1;", "(Lk3/q1;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui_release", "viewportSize", "", "getName$ui_release", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "name", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorPainter extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5475m = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 autoMirror;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m vector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final m1 invalidateCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private q1 currentColorFilter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int drawCount;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {
        a() {
            super(0);
        }

        public final void b() {
            if (VectorPainter.this.drawCount == VectorPainter.this.e()) {
                VectorPainter vectorPainter = VectorPainter.this;
                vectorPainter.i(vectorPainter.e() + 1);
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e() {
        return this.invalidateCount.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i11) {
        this.invalidateCount.a(i11);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean applyAlpha(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean applyColorFilter(q1 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((j3.m) this.size.getValue()).getPackedValue();
    }

    public final void g(boolean z11) {
        this.autoMirror.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.ui.graphics.painter.b
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1getIntrinsicSizeNHjbRc() {
        return f();
    }

    public final void h(q1 q1Var) {
        this.vector.n(q1Var);
    }

    public final void j(String str) {
        this.vector.p(str);
    }

    public final void k(long j11) {
        this.size.setValue(j3.m.c(j11));
    }

    public final void l(long j11) {
        this.vector.q(j11);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void onDraw(f fVar) {
        m mVar = this.vector;
        q1 q1VarK = this.currentColorFilter;
        if (q1VarK == null) {
            q1VarK = mVar.k();
        }
        if (d() && fVar.getLayoutDirection() == t.Rtl) {
            long jJ0 = fVar.J0();
            d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.a().u();
            try {
                drawContext.getTransform().f(-1.0f, 1.0f, jJ0);
                mVar.i(fVar, this.currentAlpha, q1VarK);
                drawContext.a().o();
                drawContext.f(jB);
            } catch (Throwable th2) {
                drawContext.a().o();
                drawContext.f(jB);
                throw th2;
            }
        } else {
            mVar.i(fVar, this.currentAlpha, q1VarK);
        }
        this.drawCount = e();
    }

    public VectorPainter(c cVar) {
        this.size = s3.d(j3.m.c(j3.m.INSTANCE.b()), null, 2, null);
        this.autoMirror = s3.d(Boolean.FALSE, null, 2, null);
        m mVar = new m(cVar);
        mVar.o(new a());
        this.vector = mVar;
        this.invalidateCount = e3.a(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new c() : cVar);
    }
}
