package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import o4.TransformedText;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lz80/m0;", "Lo4/z0;", "", "separator", "<init>", "(C)V", "Li4/d;", "text", "Lo4/x0;", "b", "(Li4/d;)Lo4/x0;", "c", DateTokenConverter.CONVERTER_KEY, "filter", "a", "C", "", "Ljava/lang/Integer;", "getBinBasedMaxPan$payments_ui_core_release", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "binBasedMaxPan", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m0 implements o4.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char separator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer binBasedMaxPan;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"z80/m0$a", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements o4.f0 {
        a() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            if (offset <= 3) {
                return offset;
            }
            return offset <= 9 ? offset + 1 : offset + 2;
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            if (offset <= 4) {
                return offset;
            }
            return offset <= 11 ? offset - 1 : offset - 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"z80/m0$b", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements o4.f0 {
        b() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            if (offset <= 3) {
                return offset;
            }
            if (offset <= 7) {
                return offset + 1;
            }
            return offset <= 11 ? offset + 2 : offset + 3;
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            if (offset <= 4) {
                return offset;
            }
            if (offset <= 9) {
                return offset - 1;
            }
            return offset <= 14 ? offset - 2 : offset - 3;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"z80/m0$c", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements o4.f0 {
        c() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            if (offset <= 3) {
                return offset;
            }
            if (offset <= 7) {
                return offset + 1;
            }
            if (offset <= 11) {
                return offset + 2;
            }
            return offset <= 15 ? offset + 3 : offset + 4;
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            if (offset <= 4) {
                return offset;
            }
            if (offset <= 9) {
                return offset - 1;
            }
            if (offset <= 14) {
                return offset - 2;
            }
            return offset <= 19 ? offset - 3 : offset - 4;
        }
    }

    public m0(char c11) {
        this.separator = c11;
    }

    private final TransformedText b(i4.d text) {
        int length = text.length();
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = str + text.charAt(i11);
            if (i11 == 3 || i11 == 9) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new TransformedText(new i4.d(str, null, null, 6, null), new a());
    }

    private final TransformedText c(i4.d text) {
        int length = text.length();
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = str + text.charAt(i11);
            if (i11 % 4 == 3 && i11 < 15) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new TransformedText(new i4.d(str, null, null, 6, null), new b());
    }

    private final TransformedText d(i4.d text) {
        int length = text.length();
        String str = "";
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = str + text.charAt(i11);
            if (i11 % 4 == 3 && i11 < 19) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new TransformedText(new i4.d(str, null, null, 6, null), new c());
    }

    public final void a(Integer num) {
        this.binBasedMaxPan = num;
    }

    @Override // o4.z0
    public TransformedText filter(i4.d text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        com.stripe.android.model.h hVarA = com.stripe.android.model.h.INSTANCE.a(text.getText());
        Integer num = this.binBasedMaxPan;
        int iIntValue = num != null ? num.intValue() : hVarA.getMaxLengthForCardNumber(text.getText());
        if (iIntValue == 19) {
            return d(text);
        }
        switch (iIntValue) {
            case 14:
            case 15:
                return b(text);
            case 16:
                return c(text);
            default:
                return c(text);
        }
    }
}
