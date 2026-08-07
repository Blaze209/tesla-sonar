package dn;

import android.graphics.Bitmap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldn/b;", "", "<init>", "()V", "Ldn/a;", "transformation", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmapReference", "", "a", "(Ldn/a;Ltk/a;)Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f60790a = new b();

    private b() {
    }

    public static final boolean a(a transformation, tk.a<Bitmap> bitmapReference) {
        if (transformation == null || bitmapReference == null) {
            return false;
        }
        Bitmap bitmapH = bitmapReference.H();
        s.j(bitmapH, "get(...)");
        Bitmap bitmap = bitmapH;
        if (transformation.a()) {
            bitmap.setHasAlpha(true);
        }
        transformation.transform(bitmap);
        return true;
    }
}
