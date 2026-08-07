package p014n4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "resId", "Ln4/f0;", "weight", "Ln4/b0;", "style", "Ln4/z;", "loadingStrategy", "Ln4/p;", "a", "(ILn4/f0;II)Ln4/p;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v {
    public static final p a(int i11, FontWeight fontWeight, int i12, int i13) {
        return new ResourceFont(i11, fontWeight, i12, new e0.d(new e0.a[0]), i13, null);
    }

    public static /* synthetic */ p b(int i11, FontWeight fontWeight, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        if ((i14 & 4) != 0) {
            i12 = b0.INSTANCE.b();
        }
        if ((i14 & 8) != 0) {
            i13 = z.INSTANCE.b();
        }
        return a(i11, fontWeight, i12, i13);
    }
}
