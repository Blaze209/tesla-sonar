package p010i90;

import i4.d;
import o4.TransformedText;
import o4.f0;
import o4.z0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li90/y0;", "Lo4/z0;", "Li90/x0$a;", "format", "<init>", "(Li90/x0$a;)V", "Li4/d;", "text", "Lo4/x0;", "a", "(Li4/d;)Lo4/x0;", "filter", "Li90/x0$a;", "getFormat", "()Li90/x0$a;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x0.a format;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"i90/y0$a", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f0 {
        a() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            if (offset <= 2) {
                return offset;
            }
            if (offset <= 5) {
                return offset + 1;
            }
            return 7;
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            if (offset <= 3) {
                return offset;
            }
            if (offset <= 6) {
                return offset - 1;
            }
            return 6;
        }
    }

    public y0(x0.a format) {
        s.k(format, "format");
        this.format = format;
    }

    private final TransformedText a(d text) {
        int length = text.getText().length();
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = str + Character.toUpperCase(text.getText().charAt(i11));
            if (i11 == 2) {
                str2 = str2 + " ";
            }
            str = str2;
        }
        return new TransformedText(new d(str, null, null, 6, null), new a());
    }

    @Override // o4.z0
    public TransformedText filter(d text) {
        s.k(text, "text");
        return this.format instanceof x0.a.C1628a ? a(text) : new TransformedText(text, f0.INSTANCE.a());
    }
}
