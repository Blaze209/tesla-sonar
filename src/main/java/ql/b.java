package ql;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ql.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 !*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010-R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010.¨\u0006/"}, d2 = {"Lql/b;", "Lql/a;", "T", "_animationBackend", "<init>", "(Lql/a;)V", "", "a", "()I", "frameNumber", "j", "(I)I", IntegerTokenConverter.CONVERTER_KEY, "l", "g", "b", "Landroid/graphics/drawable/Drawable;", "parent", "Landroid/graphics/Canvas;", "canvas", "", "m", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z", "alpha", "Ljn0/h0;", "k", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "f", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "e", "(Landroid/graphics/Rect;)V", "clear", "()V", "Lql/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "h", "(Lql/a$a;)V", "c", DateTokenConverter.CONVERTER_KEY, "Lql/a;", "I", "Landroid/graphics/ColorFilter;", "Landroid/graphics/Rect;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b<T extends a> implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private T _animationBackend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int alpha = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Rect bounds;

    public b(T t11) {
        this._animationBackend = t11;
    }

    @Override // ql.d
    public int a() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.a();
    }

    @Override // ql.d
    public int b() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.b();
    }

    @Override // ql.a
    public int c() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return -1;
        }
        s.h(t11);
        return t11.c();
    }

    @Override // ql.a
    public void clear() {
        T t11 = this._animationBackend;
        if (t11 != null) {
            t11.clear();
        }
    }

    @Override // ql.a
    public int d() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return -1;
        }
        s.h(t11);
        return t11.d();
    }

    @Override // ql.a
    public void e(Rect bounds) {
        s.k(bounds, "bounds");
        T t11 = this._animationBackend;
        if (t11 != null) {
            t11.e(bounds);
        }
        this.bounds = bounds;
    }

    @Override // ql.a
    public void f(ColorFilter colorFilter) {
        T t11 = this._animationBackend;
        if (t11 != null) {
            t11.f(colorFilter);
        }
        this.colorFilter = colorFilter;
    }

    @Override // ql.d
    public int g() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.g();
    }

    @Override // ql.a
    public void h(a.InterfaceC2242a listener) {
        T t11 = this._animationBackend;
        if (t11 != null) {
            t11.h(listener);
        }
    }

    @Override // ql.d
    public int i() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.i();
    }

    @Override // ql.d
    public int j(int frameNumber) {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.j(frameNumber);
    }

    @Override // ql.a
    public void k(int alpha) {
        T t11 = this._animationBackend;
        if (t11 != null) {
            t11.k(alpha);
        }
        this.alpha = alpha;
    }

    @Override // ql.d
    public int l() {
        T t11 = this._animationBackend;
        if (t11 == null) {
            return 0;
        }
        s.h(t11);
        return t11.l();
    }

    @Override // ql.a
    public boolean m(Drawable parent, Canvas canvas, int frameNumber) {
        s.k(parent, "parent");
        s.k(canvas, "canvas");
        T t11 = this._animationBackend;
        return t11 != null && t11.m(parent, canvas, frameNumber);
    }
}
