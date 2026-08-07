package q4;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.Shadow;
import k3.SolidColor;
import k3.b1;
import k3.c4;
import k3.h1;
import k3.q0;
import k3.r1;
import k3.r3;
import k3.s3;
import m3.Stroke;
import p013kotlin.Metadata;
import p020r2.n3;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u00101\u0012\u0004\b6\u0010\n\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010?\u001a\u0012\u0012\f\u0012\n\u0018\u000108j\u0004\u0018\u0001`9\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010F\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b \u0010@\u0012\u0004\bE\u0010\n\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010I\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010HR*\u0010M\u001a\u00020'2\u0006\u0010J\u001a\u00020'8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010K\"\u0004\b+\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lq4/i;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Ljn0/h0;", "a", "()V", "Lt4/k;", "textDecoration", IntegerTokenConverter.CONVERTER_KEY, "(Lt4/k;)V", "Lk3/e4;", "shadow", "h", "(Lk3/e4;)V", "Lk3/p1;", "color", "f", "(J)V", "Lk3/h1;", "brush", "Lj3/m;", "size", "alpha", "e", "(Lk3/h1;JF)V", "Lm3/g;", "drawStyle", "g", "(Lm3/g;)V", "Lk3/r3;", "Lk3/r3;", "backingComposePaint", "b", "Lt4/k;", "Lk3/b1;", "c", "I", "backingBlendMode", DateTokenConverter.CONVERTER_KEY, "Lk3/e4;", "getShadow$ui_text_release", "()Lk3/e4;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "Lk3/h1;", "getBrush$ui_text_release", "()Lk3/h1;", "setBrush$ui_text_release", "(Lk3/h1;)V", "getBrush$ui_text_release$annotations", "Lr2/y3;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "Lr2/y3;", "getShaderState$ui_text_release", "()Lr2/y3;", "setShaderState$ui_text_release", "(Lr2/y3;)V", "shaderState", "Lj3/m;", "getBrushSize-VsRJwc0$ui_text_release", "()Lj3/m;", "setBrushSize-iaC8Vc4$ui_text_release", "(Lj3/m;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "Lm3/g;", "()Lk3/r3;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private r3 backingComposePaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t4.k textDecoration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int backingBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h1 brush;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private y3<? extends Shader> shaderState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private j3.m brushSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private m3.g drawStyle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Shader> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1 f104753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f104754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1 h1Var, long j11) {
            super(0);
            this.f104753c = h1Var;
            this.f104754d = j11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            return ((c4) this.f104753c).b(this.f104754d);
        }
    }

    public i(int i11, float f11) {
        super(i11);
        ((TextPaint) this).density = f11;
        this.textDecoration = t4.k.INSTANCE.c();
        this.backingBlendMode = m3.f.INSTANCE.a();
        this.shadow = Shadow.INSTANCE.a();
    }

    private final void a() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final r3 c() {
        r3 r3Var = this.backingComposePaint;
        if (r3Var != null) {
            return r3Var;
        }
        r3 r3VarB = q0.b(this);
        this.backingComposePaint = r3VarB;
        return r3VarB;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void d(int i11) {
        if (b1.E(i11, this.backingBlendMode)) {
            return;
        }
        c().D(i11);
        this.backingBlendMode = i11;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    public final void e(h1 brush, long size, float alpha) {
        if (brush == null) {
            a();
            return;
        }
        if (brush instanceof SolidColor) {
            f(t4.m.c(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (brush instanceof c4) {
            if (p013kotlin.jvm.internal.s.f(this.brush, brush)) {
                j3.m mVar = this.brushSize;
                if (!(mVar == null ? false : j3.m.h(mVar.getPackedValue(), size))) {
                    if (size != 9205357640488583168L) {
                        this.brush = brush;
                        this.brushSize = j3.m.c(size);
                        this.shaderState = n3.e(new a(brush, size));
                    }
                }
            } else {
                if (size != 9205357640488583168L) {
                    this.brush = brush;
                    this.brushSize = j3.m.c(size);
                    this.shaderState = n3.e(new a(brush, size));
                }
            }
            r3 r3VarC = c();
            y3<? extends Shader> y3Var = this.shaderState;
            r3VarC.F(y3Var != null ? y3Var.getValue() : null);
            j.a(this, alpha);
        }
    }

    public final void f(long color) {
        if (color != 16) {
            setColor(r1.k(color));
            a();
        }
    }

    public final void g(m3.g drawStyle) {
        if (drawStyle == null || p013kotlin.jvm.internal.s.f(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (p013kotlin.jvm.internal.s.f(drawStyle, m3.j.f90966a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            c().z(s3.INSTANCE.b());
            Stroke stroke = (Stroke) drawStyle;
            c().B(stroke.getWidth());
            c().y(stroke.getMiter());
            c().r(stroke.getJoin());
            c().o(stroke.getCap());
            c().A(stroke.getPathEffect());
        }
    }

    public final void h(Shadow shadow) {
        if (shadow == null || p013kotlin.jvm.internal.s.f(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (p013kotlin.jvm.internal.s.f(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(r4.d.b(this.shadow.getBlurRadius()), j3.g.m(this.shadow.getOffset()), j3.g.n(this.shadow.getOffset()), r1.k(this.shadow.getColor()));
        }
    }

    public final void i(t4.k textDecoration) {
        if (textDecoration == null || p013kotlin.jvm.internal.s.f(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        t4.k.Companion companion = t4.k.INSTANCE;
        setUnderlineText(textDecoration.d(companion.d()));
        setStrikeThruText(this.textDecoration.d(companion.b()));
    }
}
