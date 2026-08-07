package en;

import android.graphics.drawable.Drawable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import um.e;
import um.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Len/a;", "Ltm/a;", "<init>", "()V", "Lum/e;", "image", "", "b", "(Lum/e;)Z", "Landroid/graphics/drawable/Drawable;", "a", "(Lum/e;)Landroid/graphics/drawable/Drawable;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements tm.a {
    @Override // tm.a
    public Drawable a(e image) {
        s.k(image, "image");
        g gVar = image instanceof g ? (g) image : null;
        if (gVar != null) {
            return gVar.h3();
        }
        return null;
    }

    @Override // tm.a
    public boolean b(e image) {
        s.k(image, "image");
        return image instanceof g;
    }
}
