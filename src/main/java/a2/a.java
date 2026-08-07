package a2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.m;
import k3.g4;
import k3.p3;
import p013kotlin.Metadata;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"La2/a;", "Lk3/g4;", "La2/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(La2/b;La2/b;La2/b;La2/b;)V", "Lj3/m;", "size", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Lk3/p3;", "a", "(JLw4/t;Lw4/d;)Lk3/p3;", "", "e", "(JFFFFLw4/t;)Lk3/p3;", "c", "(La2/b;La2/b;La2/b;La2/b;)La2/a;", "all", "b", "(La2/b;)La2/a;", "La2/b;", IntegerTokenConverter.CONVERTER_KEY, "()La2/b;", "h", "f", DateTokenConverter.CONVERTER_KEY, "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b topStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b topEnd;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b bottomEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b bottomStart;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.topStart = bVar;
        this.topEnd = bVar2;
        this.bottomEnd = bVar3;
        this.bottomStart = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            bVar = aVar.topStart;
        }
        if ((i11 & 2) != 0) {
            bVar2 = aVar.topEnd;
        }
        if ((i11 & 4) != 0) {
            bVar3 = aVar.bottomEnd;
        }
        if ((i11 & 8) != 0) {
            bVar4 = aVar.bottomStart;
        }
        return aVar.c(bVar, bVar2, bVar3, bVar4);
    }

    @Override // k3.g4
    public final p3 a(long size, t layoutDirection, w4.d density) {
        float fA = this.topStart.a(size, density);
        float fA2 = this.topEnd.a(size, density);
        float fA3 = this.bottomEnd.a(size, density);
        float fA4 = this.bottomStart.a(size, density);
        float fJ = m.j(size);
        float f11 = fA + fA4;
        if (f11 > fJ) {
            float f12 = fJ / f11;
            fA *= f12;
            fA4 *= f12;
        }
        float f13 = fA2 + fA3;
        if (f13 > fJ) {
            float f14 = fJ / f13;
            fA2 *= f14;
            fA3 *= f14;
        }
        if (fA >= BitmapDescriptorFactory.HUE_RED && fA2 >= BitmapDescriptorFactory.HUE_RED && fA3 >= BitmapDescriptorFactory.HUE_RED && fA4 >= BitmapDescriptorFactory.HUE_RED) {
            return e(size, fA, fA2, fA3, fA4, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
    }

    public final a b(b all) {
        return c(all, all, all, all);
    }

    public abstract a c(b topStart, b topEnd, b bottomEnd, b bottomStart);

    public abstract p3 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection);

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getTopStart() {
        return this.topStart;
    }
}
