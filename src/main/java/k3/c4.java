package k3;

import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lk3/c4;", "Lk3/h1;", "<init>", "()V", "Lj3/m;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "Lk3/r3;", "p", "", "alpha", "Ljn0/h0;", "a", "(JLk3/r3;F)V", "c", "Landroid/graphics/Shader;", "internalShader", DateTokenConverter.CONVERTER_KEY, "J", "createdSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c4 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long createdSize;

    public c4() {
        super(null);
        this.createdSize = j3.m.INSTANCE.a();
    }

    @Override // k3.h1
    public final void a(long size, r3 p11, float alpha) {
        Shader shaderB = this.internalShader;
        if (shaderB == null || !j3.m.h(this.createdSize, size)) {
            if (j3.m.m(size)) {
                shaderB = null;
                this.internalShader = null;
                this.createdSize = j3.m.INSTANCE.a();
            } else {
                shaderB = b(size);
                this.internalShader = shaderB;
                this.createdSize = size;
            }
        }
        long jC = p11.c();
        p1.Companion companion = p1.INSTANCE;
        if (!p1.r(jC, companion.a())) {
            p11.s(companion.a());
        }
        if (!p013kotlin.jvm.internal.s.f(p11.x(), shaderB)) {
            p11.F(shaderB);
        }
        if (p11.b() == alpha) {
            return;
        }
        p11.a(alpha);
    }

    public abstract Shader b(long size);
}
