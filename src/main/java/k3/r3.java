package k3;

import android.graphics.Paint;
import android.graphics.Shader;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00188&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001e\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\"\u0010\"\u001a\u00020\u001f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\"\u0010&\u001a\u00020#8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010)\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\"\u0010-\u001a\u00020*8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R$\u00104\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010:\u001a\u0004\u0018\u0001058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010@\u001a\u0004\u0018\u00010;8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006AÀ\u0006\u0001"}, d2 = {"Lk3/r3;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "w", "()Landroid/graphics/Paint;", "", "b", "()F", "a", "(F)V", "alpha", "Lk3/p1;", "c", "()J", "s", "(J)V", "color", "Lk3/b1;", "n", "()I", "D", "(I)V", "blendMode", "Lk3/s3;", "getStyle-TiuSbCo", "z", "style", "C", "B", "strokeWidth", "Lk3/i4;", "q", "o", "strokeCap", "Lk3/j4;", "u", "r", "strokeJoin", "v", "y", "strokeMiterLimit", "Lk3/d3;", "G", "p", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "x", "()Landroid/graphics/Shader;", Gender.FEMALE, "(Landroid/graphics/Shader;)V", "shader", "Lk3/q1;", "e", "()Lk3/q1;", "t", "(Lk3/q1;)V", "colorFilter", "Lk3/u3;", "E", "()Lk3/u3;", "A", "(Lk3/u3;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface r3 {
    void A(u3 u3Var);

    void B(float f11);

    float C();

    void D(int i11);

    u3 E();

    void F(Shader shader);

    int G();

    void a(float f11);

    float b();

    long c();

    q1 e();

    int n();

    void o(int i11);

    void p(int i11);

    int q();

    void r(int i11);

    void s(long j11);

    void t(q1 q1Var);

    int u();

    float v();

    Paint w();

    Shader x();

    void y(float f11);

    void z(int i11);
}
