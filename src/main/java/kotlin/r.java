package kotlin;

import i4.d;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li4/d$a;", "", "id", "alternateText", "Ljn0/h0;", "a", "(Li4/d$a;Ljava/lang/String;Ljava/lang/String;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {
    public static final void a(d.a aVar, String str, String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        aVar.l("androidx.compose.foundation.text.inlineContent", str);
        aVar.i(str2);
        aVar.j();
    }

    public static /* synthetic */ void b(d.a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "�";
        }
        a(aVar, str, str2);
    }
}
