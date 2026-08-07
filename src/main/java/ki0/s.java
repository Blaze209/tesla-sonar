package ki0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "Ljn0/h0;", "onPreDraw", "b", "(Landroid/view/View;Lwn0/a;)V", "e", "(Landroid/view/View;)V", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Ljava/util/List;", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {
    public static final void b(View view, final wn0.a<h0> onPreDraw) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(onPreDraw, "onPreDraw");
        g.INSTANCE.a(view, new Runnable() { // from class: ki0.r
            @Override // java.lang.Runnable
            public final void run() {
                s.c(onPreDraw);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(wn0.a aVar) {
        aVar.invoke();
    }

    public static final List<View> d(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(view);
        while (!linkedList.isEmpty()) {
            Object objPollLast = linkedList.pollLast();
            if (objPollLast == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            View view2 = (View) objPollLast;
            if (view2 instanceof ViewGroup) {
                Iterator it = v.R0(ho0.l.c0(s0.a((ViewGroup) view2))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!p013kotlin.jvm.internal.s.f(view2, view)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    public static final void e(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        view.sendAccessibilityEvent(32768);
    }
}
