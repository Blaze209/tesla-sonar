package b4;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import j3.MutableRect;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#J9\u0010(\u001a\u00020\u00042\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H&¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&ø\u0001\u0000¢\u0006\u0004\b.\u0010-ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Lb4/i1;", "", "Landroidx/compose/ui/graphics/d;", "scope", "Ljn0/h0;", "k", "(Landroidx/compose/ui/graphics/d;)V", "Lj3/g;", "position", "", "j", "(J)Z", "Lw4/n;", "m", "(J)V", "Lw4/r;", "size", IntegerTokenConverter.CONVERTER_KEY, "Lk3/j1;", "canvas", "Ln3/c;", "parentLayer", "f", "(Lk3/j1;Ln3/c;)V", "n", "()V", "invalidate", "destroy", "point", "inverse", "g", "(JZ)J", "Lj3/e;", "rect", "h", "(Lj3/e;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "o", "(Lwn0/p;Lwn0/a;)V", "Lk3/n3;", "matrix", "e", "([F)V", "l", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i1 {
    void destroy();

    void e(float[] matrix);

    void f(k3.j1 canvas, n3.c parentLayer);

    long g(long point, boolean inverse);

    void h(MutableRect rect, boolean inverse);

    void i(long size);

    void invalidate();

    boolean j(long position);

    void k(androidx.compose.ui.graphics.d scope);

    void l(float[] matrix);

    void m(long position);

    void n();

    void o(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer);
}
