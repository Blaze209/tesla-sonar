package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import i4.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"", "Li4/d;", "a", "(Ljava/lang/CharSequence;)Li4/d;", "b", "(Li4/d;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final i4.d a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new i4.d(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i11 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iU0 = p013kotlin.collections.n.u0(annotationArr);
        if (iU0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i11];
                if (p013kotlin.jvm.internal.s.f(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new i4.d.Range(new a1(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i11 == iU0) {
                    break;
                }
                i11++;
            }
        }
        return new i4.d(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(i4.d dVar) {
        if (dVar.g().isEmpty()) {
            return dVar.getText();
        }
        SpannableString spannableString = new SpannableString(dVar.getText());
        h1 h1Var = new h1();
        List<i4.d.Range<SpanStyle>> listG = dVar.g();
        int size = listG.size();
        for (int i11 = 0; i11 < size; i11++) {
            i4.d.Range<SpanStyle> range = listG.get(i11);
            SpanStyle spanStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            h1Var.q();
            h1Var.d(spanStyleA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", h1Var.p()), start, end, 33);
        }
        return spannableString;
    }
}
