package i4;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Li4/r;", "a", "(Ljava/lang/String;Li4/r0;Ljava/util/List;Ljava/util/List;Lw4/d;Ln4/q$b;)Li4/r;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final r a(String str, TextStyle textStyle, List<d.Range<SpanStyle>> list, List<d.Range<Placeholder>> list2, w4.d dVar, n4.q.b bVar) {
        return q4.e.a(str, textStyle, list, list2, dVar, bVar);
    }

    public static /* synthetic */ r b(String str, TextStyle textStyle, List list, List list2, w4.d dVar, n4.q.b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = p013kotlin.collections.v.m();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = p013kotlin.collections.v.m();
        }
        return a(str, textStyle, list3, list2, dVar, bVar);
    }
}
