package p008h80;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final String a(String str) {
        s.k(str, "<this>");
        return new q("\\d").j(str, "$0 ");
    }
}
