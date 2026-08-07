package t5;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u5.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f112492a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f112493b = new Comparator() { // from class: t5.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.a((c.a) obj, (c.a) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        URLSpan f112494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f112495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f112496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f112497d;

        a() {
        }
    }

    public static /* synthetic */ int a(a aVar, a aVar2) {
        int i11 = aVar.f112496c;
        int i12 = aVar2.f112496c;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        return Integer.compare(aVar2.f112497d, aVar.f112497d);
    }

    private static void b(TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean c(Spannable spannable, int i11) {
        Spannable spannable2;
        if (k()) {
            return Linkify.addLinks(spannable, i11);
        }
        if (i11 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i11 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList<a> arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            spannable2 = spannable;
            g(arrayList, spannable2, e.f115416h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        } else {
            spannable2 = spannable;
        }
        if ((i11 & 2) != 0) {
            g(arrayList, spannable2, e.f115417i, new String[]{"mailto:"}, null, null);
        }
        if ((i11 & 8) != 0) {
            h(arrayList, spannable2);
        }
        j(arrayList, spannable2);
        if (arrayList.size() == 0) {
            return false;
        }
        for (a aVar : arrayList) {
            if (aVar.f112494a == null) {
                e(aVar.f112495b, aVar.f112496c, aVar.f112497d, spannable2);
            }
        }
        return true;
    }

    public static boolean d(TextView textView, int i11) {
        if (k()) {
            return Linkify.addLinks(textView, i11);
        }
        if (i11 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (c(spannableStringValueOf, i11)) {
                b(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        } else if (c((Spannable) text, i11)) {
            b(textView);
            return true;
        }
        return false;
    }

    private static void e(String str, int i11, int i12, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i11, i12, 33);
    }

    private static String f(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : t5.a.c(str);
    }

    private static void g(ArrayList<a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    a aVar = new a();
                    aVar.f112495b = i(strGroup, strArr, matcher, transformFilter);
                    aVar.f112496c = iStart;
                    aVar.f112497d = iEnd;
                    arrayList.add(aVar);
                }
            }
        }
    }

    private static void h(ArrayList<a> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i11 = 0;
        while (true) {
            try {
                String strF = f(string);
                if (strF != null && (iIndexOf = string.indexOf(strF)) >= 0) {
                    a aVar = new a();
                    int length = strF.length() + iIndexOf;
                    aVar.f112496c = iIndexOf + i11;
                    i11 += length;
                    aVar.f112497d = i11;
                    string = string.substring(length);
                    try {
                        aVar.f112495b = "geo:0,0?q=" + URLEncoder.encode(strF, "UTF-8");
                        arrayList.add(aVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static String i(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z11;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String str2 = str;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            String str3 = strArr[i11];
            if (str2.regionMatches(true, 0, str3, 0, str3.length())) {
                z11 = true;
                if (!str2.regionMatches(false, 0, str3, 0, str3.length())) {
                    str2 = str3 + str2.substring(str3.length());
                    break;
                }
                break;
            }
            i11++;
        }
        if (z11 || strArr.length <= 0) {
            return str2;
        }
        return strArr[0] + str2;
    }

    private static void j(ArrayList<a> arrayList, Spannable spannable) {
        int i11;
        int i12 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            a aVar = new a();
            aVar.f112494a = uRLSpan;
            aVar.f112496c = spannable.getSpanStart(uRLSpan);
            aVar.f112497d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, f112493b);
        int size = arrayList.size();
        while (i12 < size - 1) {
            a aVar2 = arrayList.get(i12);
            int i13 = i12 + 1;
            a aVar3 = arrayList.get(i13);
            int i14 = aVar2.f112496c;
            int i15 = aVar3.f112496c;
            if (i14 <= i15 && (i11 = aVar2.f112497d) > i15) {
                int i16 = aVar3.f112497d;
                int i17 = (i16 > i11 && i11 - i14 <= i16 - i15) ? i11 - i14 < i16 - i15 ? i12 : -1 : i13;
                if (i17 != -1) {
                    Object obj = arrayList.get(i17).f112494a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i17);
                    size--;
                }
            }
            i12 = i13;
        }
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
