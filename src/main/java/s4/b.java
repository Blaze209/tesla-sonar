package s4;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import j3.m;
import k3.c4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import q4.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R1\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u0017\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Ls4/b;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lk3/c4;", "shaderBrush", "", "alpha", "<init>", "(Lk3/c4;F)V", "Landroid/text/TextPaint;", "textPaint", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Lk3/c4;", "()Lk3/c4;", "b", Gender.FEMALE, "getAlpha", "()F", "Lj3/m;", "<set-?>", "c", "Lr2/p1;", "()J", "(J)V", "size", "Lr2/y3;", "Landroid/graphics/Shader;", DateTokenConverter.CONVERTER_KEY, "Lr2/y3;", "shaderState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c4 shaderBrush;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 size = s3.d(m.c(m.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3<Shader> shaderState = n3.e(new a());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Shader> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if (b.this.b() == 9205357640488583168L || m.m(b.this.b())) {
                return null;
            }
            return b.this.getShaderBrush().b(b.this.b());
        }
    }

    public b(c4 c4Var, float f11) {
        this.shaderBrush = c4Var;
        this.alpha = f11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c4 getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((m) this.size.getValue()).getPackedValue();
    }

    public final void c(long j11) {
        this.size.setValue(m.c(j11));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
