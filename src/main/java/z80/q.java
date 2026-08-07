package z80;

import o4.TransformedText;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz80/q;", "Lo4/z0;", "<init>", "()V", "", "text", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Li4/d;", "Lo4/x0;", "filter", "(Li4/d;)Lo4/x0;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q implements o4.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f127686a = new q();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lz80/q$a;", "Lo4/f0;", "<init>", "()V", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements o4.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127687a = new a();

        private a() {
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            if (offset == 0) {
                return 0;
            }
            int i11 = (offset / 2) + offset;
            return offset % 2 == 0 ? i11 - 1 : i11;
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            if (offset == 0) {
                return 0;
            }
            return offset - (offset / 3);
        }
    }

    private q() {
    }

    private final String a(String text) {
        return p013kotlin.collections.v.y0(p013kotlin.text.t.L1(text, 2), "-", null, null, 0, null, null, 62, null);
    }

    @Override // o4.z0
    public TransformedText filter(i4.d text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        return new TransformedText(new i4.d(a(text.getText()), null, null, 6, null), a.f127687a);
    }
}
