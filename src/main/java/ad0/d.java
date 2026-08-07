package ad0;

import bo0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u0000*\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "", "length", "", "openWrapChar", "endWrapChar", "", "padStart", "b", "(Ljava/lang/String;ILjava/lang/Character;Ljava/lang/Character;Z)Ljava/lang/String;", "", "a", "(Ljava/lang/Object;Ljava/lang/Character;Ljava/lang/Character;)Ljava/lang/String;", "logging_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static final String a(Object obj, Character ch2, Character ch3) {
        s.k(obj, "<this>");
        Object obj2 = ch2;
        if (ch2 == null) {
            obj2 = "";
        }
        if (ch3 == 0) {
            ch3 = "";
        }
        ?? sb2 = new StringBuilder();
        sb2.append(obj2);
        sb2.append(obj);
        sb2.append(ch3);
        return sb2.toString();
    }

    public static final String b(String str, int i11, Character ch2, Character ch3, boolean z11) {
        s.k(str, "<this>");
        String strSubstring = str.substring(0, n.j(str.length(), i11));
        s.j(strSubstring, "substring(...)");
        String strA = a(strSubstring, ch2, ch3);
        int i12 = i11 + 2;
        return z11 ? t.L0(strA, i12, (char) 0, 2, null) : t.I0(strA, i12, (char) 0, 2, null);
    }

    public static /* synthetic */ String c(String str, int i11, Character ch2, Character ch3, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            ch2 = '[';
        }
        if ((i12 & 4) != 0) {
            ch3 = ']';
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        return b(str, i11, ch2, ch3, z11);
    }
}
