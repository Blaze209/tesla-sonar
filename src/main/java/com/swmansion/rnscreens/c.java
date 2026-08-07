package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\nR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010*\u001a\u00020$2\u0006\u0010%\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/swmansion/rnscreens/c;", "Landroidx/appcompat/widget/SearchView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V", "Ljn0/h0;", "focus", "()V", "clearText", "", "text", "setText", "(Ljava/lang/String;)V", "cancelSearch", "Landroidx/appcompat/widget/SearchView$k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCloseListener", "(Landroidx/appcompat/widget/SearchView$k;)V", "Landroid/view/View$OnClickListener;", "setOnSearchClickListener", "(Landroid/view/View$OnClickListener;)V", "onAttachedToWindow", "onDetachedFromWindow", "onCloseListener", "Landroidx/appcompat/widget/SearchView$k;", "onSearchClickedListener", "Landroid/view/View$OnClickListener;", "Landroidx/activity/b0;", "onBackPressedCallback", "Landroidx/activity/b0;", "Lcom/swmansion/rnscreens/h;", "backPressOverrider", "Lcom/swmansion/rnscreens/h;", "", "value", "getOverrideBackAction", "()Z", "setOverrideBackAction", "(Z)V", "overrideBackAction", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class c extends SearchView {
    private final h backPressOverrider;
    private androidx.p002activity.b0 onBackPressedCallback;
    private SearchView.k onCloseListener;
    private View.OnClickListener onSearchClickedListener;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/swmansion/rnscreens/c$a", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends androidx.p002activity.b0 {
        a() {
            super(true);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Fragment fragment) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(fragment, "fragment");
        a aVar = new a();
        this.onBackPressedCallback = aVar;
        this.backPressOverrider = new h(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c._init_$lambda$0(this.f55481a, view);
            }
        });
        super.setOnCloseListener(new SearchView.k() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.k
            public final boolean a() {
                return c._init_$lambda$1(this.f55484a);
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(c cVar, View view) {
        View.OnClickListener onClickListener = cVar.onSearchClickedListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cVar.backPressOverrider.maybeAddBackCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(c cVar) {
        SearchView.k kVar = cVar.onCloseListener;
        boolean zA = kVar != null ? kVar.a() : false;
        cVar.backPressOverrider.removeBackCallbackIfAdded();
        return zA;
    }

    public final void cancelSearch() {
        clearText();
        setIconified(true);
    }

    public final void clearText() {
        setQuery("", false);
    }

    public final void focus() {
        setIconified(false);
        requestFocusFromTouch();
    }

    public final boolean getOverrideBackAction() {
        return this.backPressOverrider.getOverrideBackAction();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isIconified()) {
            return;
        }
        this.backPressOverrider.maybeAddBackCallback();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.backPressOverrider.removeBackCallbackIfAdded();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.k listener) {
        this.onCloseListener = listener;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.onSearchClickedListener = listener;
    }

    public final void setOverrideBackAction(boolean z11) {
        this.backPressOverrider.setOverrideBackAction(z11);
    }

    public final void setText(String text) {
        p013kotlin.jvm.internal.s.k(text, "text");
        setQuery(text, false);
    }
}
