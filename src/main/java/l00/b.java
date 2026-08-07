package l00;

import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\u00020\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR.\u0010\u0015\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001d"}, d2 = {"Ll00/b;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroid/view/View;", "Ljn0/h0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "(Lwn0/p;)V", "rootView", "e", "(Landroid/view/View;)V", "g", "a", "Landroid/view/View;", "currentView", "b", "previousView", "c", "Lwn0/p;", "onFocusListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", DateTokenConverter.CONVERTER_KEY, "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "mOnGlobalFocusChangeListener", "()Landroid/view/View;", "currentFocusedView", "previousFocusedView", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private View currentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View previousView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p<? super View, ? super View, h0> onFocusListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalFocusChangeListener mOnGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: l00.a
        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public final void onGlobalFocusChanged(View view, View view2) {
            b.d(this.f89456a, view, view2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, View view, View view2) {
        bVar.currentView = view2;
        bVar.previousView = view;
        p<? super View, ? super View, h0> pVar = bVar.onFocusListener;
        if (pVar != null) {
            pVar.invoke(view, view2);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public View getCurrentView() {
        return this.currentView;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public View getPreviousView() {
        return this.previousView;
    }

    public void e(View rootView) {
        s.k(rootView, "rootView");
        rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(this.mOnGlobalFocusChangeListener);
    }

    public void f(p<? super View, ? super View, h0> listener) {
        this.onFocusListener = listener;
    }

    public void g(View rootView) {
        s.k(rootView, "rootView");
        rootView.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.mOnGlobalFocusChangeListener);
    }
}
