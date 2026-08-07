package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/facebook/react/views/text/p;", "textTransform", "a", "(Ljava/lang/String;Lcom/facebook/react/views/text/p;)Ljava/lang/String;", "ReactAndroid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23780a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23780a = iArr;
        }
    }

    public static final String a(String str, p pVar) {
        s.k(str, "<this>");
        int i11 = pVar == null ? -1 : a.f23780a[pVar.ordinal()];
        if (i11 == 1) {
            Locale locale = Locale.getDefault();
            s.j(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            s.j(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i11 == 2) {
            Locale locale2 = Locale.getDefault();
            s.j(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            s.j(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i11 != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i12 = next;
            int i13 = iFirst;
            iFirst = i12;
            if (iFirst == -1) {
                String string = sb2.toString();
                s.h(string);
                return string;
            }
            String strSubstring = str.substring(i13, iFirst);
            s.j(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                char upperCase2 = Character.toUpperCase(strSubstring.charAt(0));
                String strSubstring2 = strSubstring.substring(1);
                s.j(strSubstring2, "substring(...)");
                strSubstring = upperCase2 + strSubstring2;
            }
            sb2.append(strSubstring);
            next = wordInstance.next();
        }
    }
}
