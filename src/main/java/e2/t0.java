package e2;

import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p013kotlin.Metadata;
import p4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le2/t0;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Lp4/e;", "localeList", "Ljn0/h0;", "a", "(Landroid/view/inputmethod/EditorInfo;Lp4/e;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f61545a = new t0();

    private t0() {
    }

    public final void a(EditorInfo editorInfo, LocaleList localeList) {
        if (p013kotlin.jvm.internal.s.f(localeList, LocaleList.INSTANCE.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(localeList, 10));
        Iterator<p4.d> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
