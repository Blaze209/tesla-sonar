package d8;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f59865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Integer> f59866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f59867c;

    private n(List<String> list, List<Integer> list2, List<String> list3) {
        this.f59865a = list;
        this.f59866b = list2;
        this.f59867c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    private static void c(String str, List<String> list, List<Integer> list2, List<String> list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                length += 2;
            } else {
                list3.add("");
                int i11 = length + 1;
                int iIndexOf2 = str.indexOf("$", i11);
                String strSubstring2 = str.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(DateTokenConverter.CONVERTER_KEY) && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + DateTokenConverter.CONVERTER_KEY;
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    public String a(String str, long j11, int i11, long j12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < this.f59866b.size(); i12++) {
            sb2.append(this.f59865a.get(i12));
            if (this.f59866b.get(i12).intValue() == 1) {
                sb2.append(str);
            } else if (this.f59866b.get(i12).intValue() == 2) {
                sb2.append(String.format(Locale.US, this.f59867c.get(i12), Long.valueOf(j11)));
            } else if (this.f59866b.get(i12).intValue() == 3) {
                sb2.append(String.format(Locale.US, this.f59867c.get(i12), Integer.valueOf(i11)));
            } else if (this.f59866b.get(i12).intValue() == 4) {
                sb2.append(String.format(Locale.US, this.f59867c.get(i12), Long.valueOf(j12)));
            }
        }
        sb2.append(this.f59865a.get(this.f59866b.size()));
        return sb2.toString();
    }
}
