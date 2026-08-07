package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ax\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a4\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "text", "Li4/r0;", "style", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "", "maxLines", "", "ellipsis", "Li4/o;", "a", "(Ljava/lang/String;Li4/r0;JLw4/d;Ln4/q$b;Ljava/util/List;Ljava/util/List;IZ)Li4/o;", "Li4/r;", "paragraphIntrinsics", "c", "(Li4/r;JIZ)Li4/o;", "", DateTokenConverter.CONVERTER_KEY, "(F)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {
    public static final o a(String str, TextStyle textStyle, long j11, w4.d dVar, n4.q.b bVar, List<d.Range<SpanStyle>> list, List<d.Range<Placeholder>> list2, int i11, boolean z11) {
        return q4.f.b(str, textStyle, list, list2, i11, z11, j11, dVar, bVar);
    }

    public static final o c(r rVar, long j11, int i11, boolean z11) {
        return q4.f.a(rVar, i11, z11, j11);
    }

    public static final int d(float f11) {
        return (int) Math.ceil(f11);
    }
}
