package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.d;
import o4.TransformedText;
import o4.f0;
import o4.z0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lo4/z0;", "Li4/d;", "text", "Lo4/x0;", "c", "(Lo4/z0;Li4/d;)Lo4/x0;", "", "originalLength", "limit", "Ljn0/h0;", "e", "(Lo4/x0;II)V", "originalOffset", "offset", "h", "(III)V", "transformedOffset", "transformedLength", "g", "Lo4/f0;", "a", "Lo4/f0;", DateTokenConverter.CONVERTER_KEY, "()Lo4/f0;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f0 f15860a = new q1(f0.INSTANCE.a(), 0, 0);

    public static final TransformedText c(z0 z0Var, d dVar) {
        TransformedText transformedTextFilter = z0Var.filter(dVar);
        f(transformedTextFilter, dVar.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new q1(transformedTextFilter.getOffsetMapping(), dVar.length(), transformedTextFilter.getText().length()));
    }

    public static final f0 d() {
        return f15860a;
    }

    public static final void e(TransformedText transformedText, int i11, int i12) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i11, i12);
        for (int i13 = 0; i13 < iMin; i13++) {
            g(transformedText.getOffsetMapping().originalToTransformed(i13), length, i13);
        }
        g(transformedText.getOffsetMapping().originalToTransformed(i11), length, i11);
        int iMin2 = Math.min(length, i12);
        for (int i14 = 0; i14 < iMin2; i14++) {
            h(transformedText.getOffsetMapping().transformedToOriginal(i14), i11, i14);
        }
        h(transformedText.getOffsetMapping().transformedToOriginal(length), i11, length);
    }

    public static /* synthetic */ void f(TransformedText transformedText, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 100;
        }
        e(transformedText, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of transformed text [0, " + i12 + ']').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i13 + " -> " + i11 + " is not in range of original text [0, " + i12 + ']').toString());
        }
    }
}
