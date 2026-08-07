package com.fourthline.adapters.extensions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.a;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toLowerCamelCase", "", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final String toLowerCamelCase(String str) {
        String strValueOf;
        s.k(str, "<this>");
        List listF1 = t.f1(str, new String[]{"_"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(v.y(listF1, 10));
        int i11 = 0;
        for (Object obj : listF1) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            Locale ROOT = Locale.ROOT;
            String lowerCase = ((String) obj).toLowerCase(ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            if (i11 > 0 && lowerCase.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = lowerCase.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    s.j(ROOT, "ROOT");
                    strValueOf = a.d(cCharAt, ROOT);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb2.append((Object) strValueOf);
                String strSubstring = lowerCase.substring(1);
                s.j(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                lowerCase = sb2.toString();
            }
            arrayList.add(lowerCase);
            i11 = i12;
        }
        return v.y0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
