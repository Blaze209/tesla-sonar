package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi0.c;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.k;
import yh0.l;
import yh0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "Ljn0/h0;", "o", "(Landroid/util/AttributeSet;II)V", "onFinishInflate", "()V", "Lii0/a;", "state", "Lkotlin/Function0;", "back", "cancel", "setState$shared_release", "(Lii0/a;Lwn0/a;Lwn0/a;)V", "setState", "controlsColor", "setControlsColor", "(I)V", "Lbi0/c;", "z", "Lbi0/c;", "binding", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pi2NavigationBar extends ConstraintLayout {

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context) {
        super(context);
        s.k(context, "context");
        c cVarB = c.b(LayoutInflater.from(getContext()), this);
        s.j(cVarB, "inflate(...)");
        this.binding = cVarB;
        o(null, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(wn0.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(wn0.a aVar, View view) {
        aVar.invoke();
    }

    private final void o(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, p.f125580a, defStyleAttr, defStyleRes);
            s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == p.f125581b) {
                    this.binding.f17426b.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, l.f125532s));
                } else if (index == p.f125582c) {
                    this.binding.f17427c.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, l.f125534u));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final View getBackButton() {
        ImageView navBarBackButton = this.binding.f17426b;
        s.j(navBarBackButton, "navBarBackButton");
        return navBarBackButton;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(k.f125512a);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    public final void setControlsColor(int controlsColor) {
        this.binding.f17426b.setColorFilter(controlsColor);
        this.binding.f17427c.setColorFilter(controlsColor);
    }

    public final void setState$shared_release(ii0.a state, final wn0.a<h0> back, final wn0.a<h0> cancel) {
        s.k(state, "state");
        s.k(back, "back");
        s.k(cancel, "cancel");
        if (!state.getShowNavBar()) {
            this.binding.f17426b.setVisibility(8);
            this.binding.f17427c.setVisibility(8);
            return;
        }
        this.binding.f17426b.setVisibility(state.getShowBackButton() ? 0 : 4);
        this.binding.f17426b.setOnClickListener(new View.OnClickListener() { // from class: ki0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.A(back, view);
            }
        });
        this.binding.f17427c.setVisibility(state.getShowCancelButton() ? 0 : 4);
        this.binding.f17427c.setOnClickListener(new View.OnClickListener() { // from class: ki0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.B(cancel, view);
            }
        });
        this.binding.f17426b.setEnabled(state.getIsNavigationEnabled());
        this.binding.f17427c.setEnabled(state.getIsNavigationEnabled());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.k(context, "context");
        c cVarB = c.b(LayoutInflater.from(getContext()), this);
        s.j(cVarB, "inflate(...)");
        this.binding = cVarB;
        o(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        c cVarB = c.b(LayoutInflater.from(getContext()), this);
        s.j(cVarB, "inflate(...)");
        this.binding = cVarB;
        o(attributeSet, i11, 0);
    }
}
