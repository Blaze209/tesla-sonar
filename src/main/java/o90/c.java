package o90;

import android.graphics.Bitmap;
import android.util.LruCache;
import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lo90/c;", "", "", "maxSize", "<init>", "(I)V", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "a", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "I", "getMaxSize", "()I", "o90/c$a", "Lo90/c$a;", "getLruCache$annotations", "()V", "lruCache", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a lruCache;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"o90/c$a", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", Action.KEY_ATTRIBUTE, "bitmap", "", "a", "(Ljava/lang/String;Landroid/graphics/Bitmap;)I", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends LruCache<String, Bitmap> {
        a(int i11) {
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

    public c(int i11) {
        this.maxSize = i11;
        this.lruCache = new a(i11);
    }

    private final String c(String str) {
        return String.valueOf(str.hashCode());
    }

    public final Bitmap a(String key) {
        Bitmap bitmap;
        s.k(key, "key");
        synchronized (this) {
            bitmap = this.lruCache.get(c(key));
        }
        return bitmap;
    }

    public final void b(String key, Bitmap bitmap) {
        s.k(key, "key");
        s.k(bitmap, "bitmap");
        synchronized (this) {
            try {
                if (this.lruCache.get(c(key)) == null) {
                    this.lruCache.put(c(key), bitmap);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ c(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8 : i11);
    }
}
