package q4;

import i4.Placeholder;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "", "maxLines", "", "ellipsis", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Li4/o;", "b", "(Ljava/lang/String;Li4/r0;Ljava/util/List;Ljava/util/List;IZJLw4/d;Ln4/q$b;)Li4/o;", "Li4/r;", "paragraphIntrinsics", "a", "(Li4/r;IZJ)Li4/o;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final i4.o a(i4.r rVar, int i11, boolean z11, long j11) {
        p013kotlin.jvm.internal.s.i(rVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new i4.a((d) rVar, i11, z11, j11, null);
    }

    public static final i4.o b(String str, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, List<i4.d.Range<Placeholder>> list2, int i11, boolean z11, long j11, w4.d dVar, n4.q.b bVar) {
        return new i4.a(new d(str, textStyle, list, list2, bVar, dVar), i11, z11, j11, null);
    }
}
