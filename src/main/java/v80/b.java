package v80;

import android.graphics.Bitmap;
import android.util.LruCache;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H¦\u0002¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lv80/b;", "", "Ljn0/h0;", "clear", "()V", "", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "a", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lv80/b$a;", "Lv80/b;", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "clear", "", "b", "I", "cacheSize", "Landroid/util/LruCache;", "c", "Landroid/util/LruCache;", "getCache$3ds2sdk_release", "()Landroid/util/LruCache;", "getCache$3ds2sdk_release$annotations", "cache", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f118418a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int cacheSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final LruCache<String, Bitmap> cache;

        /* JADX INFO: renamed from: v80.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"v80/b$a$a", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", Action.KEY_ATTRIBUTE, "bitmap", "", "a", "(Ljava/lang/String;Landroid/graphics/Bitmap;)I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C2538a extends LruCache<String, Bitmap> {
            C2538a(int i11) {
                super(i11);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int sizeOf(String key, Bitmap bitmap) {
                s.k(key, "key");
                s.k(bitmap, "bitmap");
                return bitmap.getByteCount() / 1024;
            }
        }

        static {
            int iMin = Math.min((int) ((Runtime.getRuntime().maxMemory() / ((long) 1024)) / ((long) 8)), 10240);
            cacheSize = iMin;
            cache = new C2538a(iMin);
        }

        private a() {
        }

        @Override // v80.b
        public void a(String key, Bitmap bitmap) {
            s.k(key, "key");
            s.k(bitmap, "bitmap");
            cache.put(key, bitmap);
        }

        @Override // v80.b
        public void clear() {
            cache.evictAll();
        }

        @Override // v80.b
        public Bitmap get(String key) {
            s.k(key, "key");
            return cache.get(key);
        }
    }

    void a(String key, Bitmap bitmap);

    void clear();

    Bitmap get(String key);
}
