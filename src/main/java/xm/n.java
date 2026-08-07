package xm;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxm/n;", "Lxm/d;", "<init>", "()V", "", "size", "Landroid/graphics/Bitmap;", "h", "(I)Landroid/graphics/Bitmap;", "value", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap;)V", "", "a", "Ljava/util/Set;", "inUseValues", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<Bitmap> inUseValues;

    public n() {
        Set<Bitmap> setB = pk.m.b();
        p013kotlin.jvm.internal.s.j(setB, "newIdentityHashSet(...)");
        this.inUseValues = setB;
    }

    @Override // sk.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) size) / 2.0d), Bitmap.Config.RGB_565);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        this.inUseValues.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // sk.f, tk.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.inUseValues.remove(value);
        value.recycle();
    }
}
