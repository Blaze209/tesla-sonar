package expo.modules.kotlin.viewevent;

import android.view.View;
import co0.m;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00030\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "T", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "coalescingKey", "<init>", "(Landroid/view/View;Lwn0/l;)V", "thisRef", "Lco0/m;", "property", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "getValue", "(Landroid/view/View;Lco0/m;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "Lwn0/l;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "viewHolder", "Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewEventDelegate<T> {
    private final l<T, Short> coalescingKey;
    private final WeakReference<View> viewHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEventDelegate(View view, l<? super T, Short> lVar) {
        s.k(view, "view");
        this.coalescingKey = lVar;
        this.viewHolder = new WeakReference<>(view);
    }

    public final ViewEventCallback<T> getValue(View thisRef, m<?> property) {
        s.k(thisRef, "thisRef");
        s.k(property, "property");
        View view = this.viewHolder.get();
        if (view != null) {
            return new ViewEvent(property.getName(), view, this.coalescingKey);
        }
        throw new IllegalStateException("Can't send the '" + property.getName() + "' event from the view that is deallocated");
    }
}
