package p014n4;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ln4/f0;", "weight", "Ln4/b0;", "style", "Ln4/e0$d;", "variationSettings", "Ln4/p;", "a", "(Ljava/io/File;Ln4/f0;ILn4/e0$d;)Ln4/p;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final p a(File file, FontWeight fontWeight, int i11, e0.d dVar) {
        return new Font(file, fontWeight, i11, dVar, null);
    }

    public static /* synthetic */ p b(File file, FontWeight fontWeight, int i11, e0.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        if ((i12 & 4) != 0) {
            i11 = b0.INSTANCE.b();
        }
        if ((i12 & 8) != 0) {
            dVar = e0.f92907a.a(fontWeight, i11, new e0.a[0]);
        }
        return a(file, fontWeight, i11, dVar);
    }
}
