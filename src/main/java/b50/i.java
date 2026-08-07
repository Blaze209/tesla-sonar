package b50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i40.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.q;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb50/i;", "", "<init>", "()V", "", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Z", "input", "", "c", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "accountInput", "accountConfirmInput", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f16675a = new i();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f16676c = new a();

        a() {
            super(1);
        }

        public final Integer a(int i11) {
            int i12 = 3;
            int i13 = i11 % 3;
            if (i13 != 0) {
                i12 = 1;
                if (i13 == 1) {
                    i12 = 7;
                }
            }
            return Integer.valueOf(i12);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private i() {
    }

    private final boolean d(String str) {
        a aVar = a.f16676c;
        if (new q("^\\d{9}$").i(str)) {
            int i11 = 0;
            int iG = 0;
            int i12 = 0;
            while (i11 < str.length()) {
                iG += p013kotlin.text.a.g(str.charAt(i11), 10) * aVar.invoke(Integer.valueOf(i12)).intValue();
                i11++;
                i12++;
            }
            if (iG % 10 == 0) {
                return true;
            }
        }
        return false;
    }

    public final Integer a(String accountInput, String accountConfirmInput) {
        s.k(accountInput, "accountInput");
        s.k(accountConfirmInput, "accountConfirmInput");
        if (b(accountInput) != null || s.f(accountInput, accountConfirmInput)) {
            return null;
        }
        return Integer.valueOf(k.f75869j0);
    }

    public final Integer b(String input) {
        s.k(input, "input");
        if (input.length() == 0) {
            return Integer.valueOf(k.f75871k0);
        }
        if (input.length() > 17) {
            return Integer.valueOf(k.f75873l0);
        }
        return null;
    }

    public final Integer c(String input) {
        s.k(input, "input");
        if (input.length() == 0) {
            return Integer.valueOf(k.f75877n0);
        }
        if (input.length() != 9) {
            return Integer.valueOf(k.f75879o0);
        }
        if (d(input)) {
            return null;
        }
        return Integer.valueOf(k.f75875m0);
    }
}
