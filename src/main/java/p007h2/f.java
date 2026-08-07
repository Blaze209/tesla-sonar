package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.i3;
import k3.j1;
import m3.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lh2/f;", "", "<init>", "()V", "Lk3/i3;", "b", "Lk3/i3;", "c", "()Lk3/i3;", "f", "(Lk3/i3;)V", "imageBitmap", "Lk3/j1;", "Lk3/j1;", "a", "()Lk3/j1;", DateTokenConverter.CONVERTER_KEY, "(Lk3/j1;)V", "canvas", "Lm3/a;", "Lm3/a;", "()Lm3/a;", "e", "(Lm3/a;)V", "canvasDrawScope", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f70251a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static i3 imageBitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static j1 canvas;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static a canvasDrawScope;

    private f() {
    }

    public final j1 a() {
        return canvas;
    }

    public final a b() {
        return canvasDrawScope;
    }

    public final i3 c() {
        return imageBitmap;
    }

    public final void d(j1 j1Var) {
        canvas = j1Var;
    }

    public final void e(a aVar) {
        canvasDrawScope = aVar;
    }

    public final void f(i3 i3Var) {
        imageBitmap = i3Var;
    }
}
