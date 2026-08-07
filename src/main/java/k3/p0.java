package k3;

import android.graphics.Paint;
import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010#\"\u0004\b\n\u0010$R*\u0010'\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0012\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u0002002\u0006\u0010\u001a\u001a\u0002008V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00106\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b5\u0010$R*\u0010:\u001a\u0002072\u0006\u0010\u001a\u001a\u0002078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R*\u0010>\u001a\u00020;2\u0006\u0010\u001a\u001a\u00020;8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010A\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010#\"\u0004\b@\u0010$R*\u0010E\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020B8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R4\u0010J\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010N\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010K\"\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Lk3/p0;", "Lk3/r3;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "w", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "Lk3/b1;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Lk3/q1;", DateTokenConverter.CONVERTER_KEY, "Lk3/q1;", "internalColorFilter", "Lk3/u3;", "value", "e", "Lk3/u3;", "E", "()Lk3/u3;", "A", "(Lk3/u3;)V", "pathEffect", "", "()F", "(F)V", "alpha", "Lk3/p1;", "color", "()J", "s", "(J)V", "n", "()I", "D", "(I)V", "blendMode", "Lk3/s3;", "getStyle-TiuSbCo", "z", "style", "C", "B", "strokeWidth", "Lk3/i4;", "q", "o", "strokeCap", "Lk3/j4;", "u", "r", "strokeJoin", "v", "y", "strokeMiterLimit", "Lk3/d3;", "G", "p", "filterQuality", "x", "()Landroid/graphics/Shader;", Gender.FEMALE, "(Landroid/graphics/Shader;)V", "shader", "()Lk3/q1;", "t", "(Lk3/q1;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint internalPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q1 internalColorFilter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u3 pathEffect;

    public p0(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = b1.INSTANCE.B();
    }

    @Override // k3.r3
    public void A(u3 u3Var) {
        q0.p(this.internalPaint, u3Var);
        this.pathEffect = u3Var;
    }

    @Override // k3.r3
    public void B(float f11) {
        q0.u(this.internalPaint, f11);
    }

    @Override // k3.r3
    public float C() {
        return q0.i(this.internalPaint);
    }

    @Override // k3.r3
    public void D(int i11) {
        if (b1.E(this._blendMode, i11)) {
            return;
        }
        this._blendMode = i11;
        q0.l(this.internalPaint, i11);
    }

    @Override // k3.r3
    /* JADX INFO: renamed from: E, reason: from getter */
    public u3 getPathEffect() {
        return this.pathEffect;
    }

    @Override // k3.r3
    public void F(Shader shader) {
        this.internalShader = shader;
        q0.q(this.internalPaint, shader);
    }

    @Override // k3.r3
    public int G() {
        return q0.e(this.internalPaint);
    }

    @Override // k3.r3
    public void a(float f11) {
        q0.k(this.internalPaint, f11);
    }

    @Override // k3.r3
    public float b() {
        return q0.c(this.internalPaint);
    }

    @Override // k3.r3
    public long c() {
        return q0.d(this.internalPaint);
    }

    @Override // k3.r3
    /* JADX INFO: renamed from: e, reason: from getter */
    public q1 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // k3.r3
    /* JADX INFO: renamed from: n, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // k3.r3
    public void o(int i11) {
        q0.r(this.internalPaint, i11);
    }

    @Override // k3.r3
    public void p(int i11) {
        q0.o(this.internalPaint, i11);
    }

    @Override // k3.r3
    public int q() {
        return q0.f(this.internalPaint);
    }

    @Override // k3.r3
    public void r(int i11) {
        q0.s(this.internalPaint, i11);
    }

    @Override // k3.r3
    public void s(long j11) {
        q0.m(this.internalPaint, j11);
    }

    @Override // k3.r3
    public void t(q1 q1Var) {
        this.internalColorFilter = q1Var;
        q0.n(this.internalPaint, q1Var);
    }

    @Override // k3.r3
    public int u() {
        return q0.g(this.internalPaint);
    }

    @Override // k3.r3
    public float v() {
        return q0.h(this.internalPaint);
    }

    @Override // k3.r3
    /* JADX INFO: renamed from: w, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // k3.r3
    /* JADX INFO: renamed from: x, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // k3.r3
    public void y(float f11) {
        q0.t(this.internalPaint, f11);
    }

    @Override // k3.r3
    public void z(int i11) {
        q0.v(this.internalPaint, i11);
    }

    public p0() {
        this(q0.j());
    }
}
