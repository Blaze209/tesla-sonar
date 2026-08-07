package com.squareup.workflow1.ui;

import a30.ViewEnvironment;
import a30.e0;
import a30.f0;
import a30.g0;
import a30.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.squareup.workflow1.ui.WorkflowViewStub;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;
import xa.d;
import xa.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0011R4\u0010:\u001a\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "newView", "Ljn0/h0;", "b", "(Landroid/view/View;)V", "id", "setId", "(I)V", "visibility", "setVisibility", "getVisibility", "()I", "Landroid/graphics/drawable/Drawable;", AppStateModule.APP_STATE_BACKGROUND, "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "rendering", "La30/a0;", "viewEnvironment", "c", "(Ljava/lang/Object;La30/a0;)Landroid/view/View;", "<set-?>", "a", "Landroid/view/View;", "getActual", "()Landroid/view/View;", "actual", "", "Z", "getUpdatesVisibility", "()Z", "setUpdatesVisibility", "(Z)V", "updatesVisibility", "value", "I", "getInflatedId", "setInflatedId", "inflatedId", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "getReplaceOldViewInParent", "()Lwn0/p;", "setReplaceOldViewInParent", "(Lwn0/p;)V", "replaceOldViewInParent", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WorkflowViewStub extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private View actual;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean updatesVisibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int inflatedId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p<? super ViewGroup, ? super View, h0> replaceOldViewInParent;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "newView", "Ljn0/h0;", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends u implements p<ViewGroup, View, h0> {
        a() {
            super(2);
        }

        public final void a(ViewGroup parent, View newView) {
            h0 h0Var;
            s.k(parent, "parent");
            s.k(newView, "newView");
            int iIndexOfChild = parent.indexOfChild(WorkflowViewStub.this.getActual());
            parent.removeView(WorkflowViewStub.this.getActual());
            ViewGroup.LayoutParams layoutParams = WorkflowViewStub.this.getActual().getLayoutParams();
            if (layoutParams == null) {
                h0Var = null;
            } else {
                parent.addView(newView, iIndexOfChild, layoutParams);
                h0Var = h0.f84049a;
            }
            if (h0Var == null) {
                parent.addView(newView, iIndexOfChild);
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(ViewGroup viewGroup, View view) {
            a(viewGroup, view);
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    private final void b(View newView) {
        d dVarA = e.a(this);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (dVarA != (viewGroup != null ? e.a(viewGroup) : null)) {
            e.b(newView, dVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, wn0.a doStart) {
        s.k(view, "view");
        s.k(doStart, "doStart");
        b30.d.Companion.e(b30.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    public final View c(Object rendering, ViewEnvironment viewEnvironment) {
        b30.d dVarC;
        s.k(rendering, "rendering");
        s.k(viewEnvironment, "viewEnvironment");
        View view = this.actual;
        if (!g0.b(view, rendering)) {
            view = null;
        }
        if (view != null) {
            g0.g(view, rendering, viewEnvironment);
            return view;
        }
        ViewParent parent = this.actual.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException("WorkflowViewStub must have a non-null ViewGroup parent");
        }
        View view2 = this.actual;
        if (view2 != this && (dVarC = b30.d.INSTANCE.c(view2)) != null) {
            dVarC.o();
        }
        e0 e0Var = (e0) viewEnvironment.a(e0.INSTANCE);
        Context context = viewGroup.getContext();
        s.j(context, "parent.context");
        View viewC = f0.c(e0Var, rendering, viewEnvironment, context, viewGroup, new a30.h0() { // from class: a30.l0
            @Override // a30.h0
            public final void a(View view3, wn0.a aVar) {
                WorkflowViewStub.d(view3, aVar);
            }
        });
        g0.h(viewC);
        if (getInflatedId() != -1) {
            viewC.setId(getInflatedId());
        }
        if (getUpdatesVisibility()) {
            viewC.setVisibility(getVisibility());
        }
        Drawable background = getBackground();
        if (background != null) {
            viewC.setBackground(background);
        }
        b(viewC);
        getReplaceOldViewInParent().invoke(viewGroup, viewC);
        this.actual = viewC;
        return viewC;
    }

    public final View getActual() {
        return this.actual;
    }

    public final int getInflatedId() {
        return this.inflatedId;
    }

    public final p<ViewGroup, View, h0> getReplaceOldViewInParent() {
        return this.replaceOldViewInParent;
    }

    public final boolean getUpdatesVisibility() {
        return this.updatesVisibility;
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.actual;
        return (s.f(view, this) || view == null) ? super.getVisibility() : this.actual.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        View view;
        super.setBackground(background);
        if (s.f(this.actual, this) || (view = this.actual) == null || background == null) {
            return;
        }
        view.setBackground(background);
    }

    @Override // android.view.View
    public void setId(int id2) {
        if (id2 != -1 && id2 == this.inflatedId) {
            throw new IllegalArgumentException(s.t("id must be distinct from inflatedId: ", getResources().getResourceName(id2)).toString());
        }
        super.setId(id2);
    }

    public final void setInflatedId(int i11) {
        if (i11 != -1 && i11 == getId()) {
            throw new IllegalArgumentException(s.t("inflatedId must be distinct from id: ", getResources().getResourceName(getId())).toString());
        }
        this.inflatedId = i11;
    }

    public final void setReplaceOldViewInParent(p<? super ViewGroup, ? super View, h0> pVar) {
        s.k(pVar, "<set-?>");
        this.replaceOldViewInParent = pVar;
    }

    public final void setUpdatesVisibility(boolean z11) {
        this.updatesVisibility = z11;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        View view;
        super.setVisibility(visibility);
        if (s.f(this.actual, this) || (view = this.actual) == null) {
            return;
        }
        view.setVisibility(visibility);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ WorkflowViewStub(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
        this.actual = this;
        this.updatesVisibility = true;
        this.inflatedId = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.U, i11, i12);
        s.j(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…fStyle, defStyleRes\n    )");
        setInflatedId(typedArrayObtainStyledAttributes.getResourceId(r.V, -1));
        this.updatesVisibility = typedArrayObtainStyledAttributes.getBoolean(r.W, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.replaceOldViewInParent = new a();
    }
}
