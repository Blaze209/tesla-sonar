package ae;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lae/a;", "", "<init>", "()V", "", "unformattedString", "", "", "maskPartsLengths", "separator", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f982a = new a();

    private a() {
    }

    public final String a(String unformattedString, List<Integer> maskPartsLengths, String separator) {
        StringBuilder sb2;
        s.k(unformattedString, "unformattedString");
        s.k(maskPartsLengths, "maskPartsLengths");
        s.k(separator, "separator");
        int size = maskPartsLengths.size();
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            i12++;
            arrayList.add(Integer.valueOf(v.c1(v.d1(maskPartsLengths, i12))));
        }
        String string = "";
        int i13 = 0;
        while (i11 < unformattedString.length()) {
            char cCharAt = unformattedString.charAt(i11);
            int i14 = i13 + 1;
            if (arrayList.contains(Integer.valueOf(i13))) {
                sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(separator);
            } else {
                sb2 = new StringBuilder();
                sb2.append(string);
            }
            sb2.append(cCharAt);
            string = sb2.toString();
            i11++;
            i13 = i14;
        }
        return string;
    }
}
