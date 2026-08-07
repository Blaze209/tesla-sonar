package pe;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpe/c;", "", "", "maxSize", "<init>", "(I)V", "", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "pe/c$b", "Lpe/c$b;", "cache", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b cache;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lpe/c$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "size", "<init>", "(Landroid/graphics/Bitmap;I)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "I", "()I", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        public a(Bitmap bitmap, int i11) {
            s.k(bitmap, "bitmap");
            this.bitmap = bitmap;
            this.size = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"pe/c$b", "Landroid/util/LruCache;", "", "Lpe/c$a;", Action.KEY_ATTRIBUTE, "value", "", "a", "(Ljava/lang/String;Lpe/c$a;)I", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends LruCache<String, a> {
        b(int i11) {
            super(i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String key, a value) {
            s.k(key, "key");
            s.k(value, "value");
            return value.getSize();
        }
    }

    public c(int i11) {
        this.cache = new b(i11);
    }

    public final Bitmap a(String key) {
        s.k(key, "key");
        a aVar = this.cache.get(key);
        if (aVar != null) {
            return aVar.getBitmap();
        }
        return null;
    }

    public final void b(String key, Bitmap bitmap) {
        int i11;
        int width;
        s.k(key, "key");
        s.k(bitmap, "bitmap");
        try {
            width = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                i11 = 1;
            } else if (bitmap.getConfig() == Bitmap.Config.RGB_565 || bitmap.getConfig() == Bitmap.Config.ARGB_4444) {
                i11 = 2;
            } else {
                i11 = (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            width = i11 * bitmap.getWidth() * bitmap.getHeight();
        }
        this.cache.put(key, new a(bitmap, width));
    }
}
