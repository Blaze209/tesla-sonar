package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J=\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u001aJ-\u0010\"\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b$\u0010#R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020&0*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lp3/f;", "", "<init>", "()V", "a", "()Lp3/f;", "", "x", "y", IntegerTokenConverter.CONVERTER_KEY, "(FF)Lp3/f;", "g", "dx", "dy", "h", "e", "(F)Lp3/f;", "f", "l", "x1", "y1", "x2", "y2", "x3", "y3", "b", "(FFFFFF)Lp3/f;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "c", "j", "(FFFF)Lp3/f;", "k", "Ljava/util/ArrayList;", "Lp3/h;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "nodes", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<h> _nodes = new ArrayList<>(32);

    public final f a() {
        this._nodes.add(h.b.f100957c);
        return this;
    }

    public final f b(float x11, float y11, float x12, float y12, float x13, float y13) {
        this._nodes.add(new h.CurveTo(x11, y11, x12, y12, x13, y13));
        return this;
    }

    public final f c(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new h.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    public final List<h> d() {
        return this._nodes;
    }

    public final f e(float x11) {
        this._nodes.add(new h.HorizontalTo(x11));
        return this;
    }

    public final f f(float dx2) {
        this._nodes.add(new h.RelativeHorizontalTo(dx2));
        return this;
    }

    public final f g(float x11, float y11) {
        this._nodes.add(new h.LineTo(x11, y11));
        return this;
    }

    public final f h(float dx2, float dy2) {
        this._nodes.add(new h.RelativeLineTo(dx2, dy2));
        return this;
    }

    public final f i(float x11, float y11) {
        this._nodes.add(new h.MoveTo(x11, y11));
        return this;
    }

    public final f j(float x11, float y11, float x12, float y12) {
        this._nodes.add(new h.ReflectiveCurveTo(x11, y11, x12, y12));
        return this;
    }

    public final f k(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new h.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }

    public final f l(float dy2) {
        this._nodes.add(new h.RelativeVerticalTo(dy2));
        return this;
    }
}
