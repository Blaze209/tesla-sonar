package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B³\u0001\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u000f\u0012 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R3\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR1\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR1\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinition;", "", "Lkotlin/Function3;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "", "Ljn0/h0;", "Lexpo/modules/kotlin/views/AddViewAction;", "addViewAction", "Lkotlin/Function2;", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildAtAction", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getChildCountAction", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAction", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "removeViewAtAction", "<init>", "(Lwn0/q;Lwn0/p;Lwn0/l;Lwn0/p;Lwn0/p;)V", "Lwn0/q;", "getAddViewAction", "()Lwn0/q;", "Lwn0/p;", "getGetChildAtAction", "()Lwn0/p;", "Lwn0/l;", "getGetChildCountAction", "()Lwn0/l;", "getRemoveViewAction", "getRemoveViewAtAction", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewGroupDefinition {
    private final q<ViewGroup, View, Integer, h0> addViewAction;
    private final p<ViewGroup, Integer, View> getChildAtAction;
    private final l<ViewGroup, Integer> getChildCountAction;
    private final p<ViewGroup, View, h0> removeViewAction;
    private final p<ViewGroup, Integer, h0> removeViewAtAction;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupDefinition(q<? super ViewGroup, ? super View, ? super Integer, h0> qVar, p<? super ViewGroup, ? super Integer, ? extends View> pVar, l<? super ViewGroup, Integer> lVar, p<? super ViewGroup, ? super View, h0> pVar2, p<? super ViewGroup, ? super Integer, h0> pVar3) {
        this.addViewAction = qVar;
        this.getChildAtAction = pVar;
        this.getChildCountAction = lVar;
        this.removeViewAction = pVar2;
        this.removeViewAtAction = pVar3;
    }

    public final q<ViewGroup, View, Integer, h0> getAddViewAction() {
        return this.addViewAction;
    }

    public final p<ViewGroup, Integer, View> getGetChildAtAction() {
        return this.getChildAtAction;
    }

    public final l<ViewGroup, Integer> getGetChildCountAction() {
        return this.getChildCountAction;
    }

    public final p<ViewGroup, View, h0> getRemoveViewAction() {
        return this.removeViewAction;
    }

    public final p<ViewGroup, Integer, h0> getRemoveViewAtAction() {
        return this.removeViewAtAction;
    }
}
