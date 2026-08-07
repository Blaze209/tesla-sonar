package expo.modules.kotlin.viewevent;

import android.view.View;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aI\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\"\b\n\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0006*\u00020\u00012:\b\u0002\u0010\u0005\u001a4\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0018\u0001`\u0004H\u0007¢\u0006\u0004\b\f\u0010\b*(\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"T", "Landroid/view/View;", "Lkotlin/Function1;", "", "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "coalescingKey", "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "EventDispatcher", "(Landroid/view/View;Lwn0/l;)Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "", "", "", "MapEventDispatcher", "CoalescingKey", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewEventDelegateKt {
    public static final /* synthetic */ <T> ViewEventDelegate<T> EventDispatcher(View view, l<? super T, Short> lVar) {
        s.k(view, "<this>");
        return new ViewEventDelegate<>(view, lVar);
    }

    public static /* synthetic */ ViewEventDelegate EventDispatcher$default(View view, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        s.k(view, "<this>");
        return new ViewEventDelegate(view, lVar);
    }

    public static final ViewEventDelegate<Map<String, Object>> MapEventDispatcher(View view, l<? super Map<String, ? extends Object>, Short> lVar) {
        s.k(view, "<this>");
        return new ViewEventDelegate<>(view, lVar);
    }

    public static /* synthetic */ ViewEventDelegate MapEventDispatcher$default(View view, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        return MapEventDispatcher(view, lVar);
    }
}
