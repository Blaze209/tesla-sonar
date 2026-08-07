package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.model.PaymentMethod;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 =2\u00020\u0001:\u0002>?B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!JG\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102R\u0014\u0010<\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102¨\u0006@"}, d2 = {"Lcom/stripe/android/view/c2;", "Landroidx/recyclerview/widget/l$h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/view/k2;", "adapter", "Lcom/stripe/android/view/c2$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/k2;Lcom/stripe/android/view/c2$b;)V", "Landroid/view/View;", "itemView", "", "dX", "", "transitionFraction", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", "E", "(Landroid/view/View;IFLandroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$g0;", "viewHolder", "target", "", "y", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$g0;Landroidx/recyclerview/widget/RecyclerView$g0;)Z", "direction", "B", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "D", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$g0;)I", "dY", "actionState", "isCurrentlyActive", "u", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$g0;FFIZ)V", "m", "(Landroidx/recyclerview/widget/RecyclerView$g0;)F", "f", "Lcom/stripe/android/view/k2;", "g", "Lcom/stripe/android/view/c2$b;", "Landroid/graphics/drawable/Drawable;", "h", "Landroid/graphics/drawable/Drawable;", "trashIcon", IntegerTokenConverter.CONVERTER_KEY, "I", "swipeStartColor", "j", "swipeThresholdColor", "Landroid/graphics/drawable/ColorDrawable;", "k", "Landroid/graphics/drawable/ColorDrawable;", AppStateModule.APP_STATE_BACKGROUND, "l", "itemViewStartPadding", "iconStartOffset", "n", "a", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c2 extends androidx.recyclerview.widget.l.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f54822o = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k2 adapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Drawable trashIcon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int swipeStartColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int swipeThresholdColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ColorDrawable background;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int itemViewStartPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int iconStartOffset;

    /* JADX INFO: renamed from: com.stripe.android.view.c2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/c2$a;", "", "<init>", "()V", "", "fraction", "", "startValue", "endValue", "a", "(FII)I", "END_TRANSITION_THRESHOLD", Gender.FEMALE, "START_TRANSITION_THRESHOLD", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(float fraction, int startValue, int endValue) {
            int iAlpha = Color.alpha(startValue);
            int iRed = Color.red(startValue);
            int iGreen = Color.green(startValue);
            int iBlue = Color.blue(startValue);
            return Color.argb((int) (iAlpha + ((Color.alpha(endValue) - iAlpha) * fraction)), (int) (iRed + ((Color.red(endValue) - iRed) * fraction)), (int) (iGreen + ((Color.green(endValue) - iGreen) * fraction)), (int) (iBlue + ((Color.blue(endValue) - iBlue) * fraction)));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/c2$b;", "", "Lcom/stripe/android/model/v0;", "paymentMethod", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(PaymentMethod paymentMethod);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context, k2 adapter, b listener) {
        super(0, 8);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(adapter, "adapter");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.adapter = adapter;
        this.listener = listener;
        Drawable drawable = androidx.core.content.b.getDrawable(context, f30.y.T);
        p013kotlin.jvm.internal.s.h(drawable);
        this.trashIcon = drawable;
        int color = androidx.core.content.b.getColor(context, f30.w.f64206j);
        this.swipeStartColor = color;
        this.swipeThresholdColor = androidx.core.content.b.getColor(context, f30.w.f64207k);
        this.background = new ColorDrawable(color);
        this.itemViewStartPadding = drawable.getIntrinsicWidth() / 2;
        this.iconStartOffset = context.getResources().getDimensionPixelSize(f30.x.f64218k);
    }

    private final void E(View itemView, int dX, float transitionFraction, Canvas canvas) {
        int iA;
        int top = itemView.getTop() + ((itemView.getHeight() - this.trashIcon.getIntrinsicHeight()) / 2);
        int intrinsicHeight = this.trashIcon.getIntrinsicHeight() + top;
        if (dX > 0) {
            int left = itemView.getLeft() + this.iconStartOffset;
            int intrinsicWidth = this.trashIcon.getIntrinsicWidth() + left;
            if (dX > intrinsicWidth) {
                this.trashIcon.setBounds(left, top, intrinsicWidth, intrinsicHeight);
            } else {
                this.trashIcon.setBounds(0, 0, 0, 0);
            }
            this.background.setBounds(itemView.getLeft(), itemView.getTop(), itemView.getLeft() + dX + this.itemViewStartPadding, itemView.getBottom());
            ColorDrawable colorDrawable = this.background;
            if (transitionFraction <= BitmapDescriptorFactory.HUE_RED) {
                iA = this.swipeStartColor;
            } else {
                iA = transitionFraction >= 1.0f ? this.swipeThresholdColor : INSTANCE.a(transitionFraction, this.swipeStartColor, this.swipeThresholdColor);
            }
            colorDrawable.setColor(iA);
        } else {
            this.trashIcon.setBounds(0, 0, 0, 0);
            this.background.setBounds(0, 0, 0, 0);
        }
        this.background.draw(canvas);
        this.trashIcon.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.l.e
    public void B(RecyclerView.g0 viewHolder, int direction) {
        p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
        this.listener.a(this.adapter.m(viewHolder.getBindingAdapterPosition()));
    }

    @Override // androidx.recyclerview.widget.l.h
    public int D(RecyclerView recyclerView, RecyclerView.g0 viewHolder) {
        p013kotlin.jvm.internal.s.k(recyclerView, "recyclerView");
        p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
        if (viewHolder instanceof k2.c.d) {
            return super.D(recyclerView, viewHolder);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l.e
    public float m(RecyclerView.g0 viewHolder) {
        p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.g0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        float f11;
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        p013kotlin.jvm.internal.s.k(recyclerView, "recyclerView");
        p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
        super.u(canvas, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        if (viewHolder instanceof k2.c.d) {
            View itemView = viewHolder.itemView;
            p013kotlin.jvm.internal.s.j(itemView, "itemView");
            float width = itemView.getWidth() * 0.25f;
            float width2 = itemView.getWidth() * 0.5f;
            if (dX < width) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f11 = dX >= width2 ? 1.0f : (dX - width) / (width2 - width);
            }
            E(itemView, (int) dX, f11, canvas);
        }
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean y(RecyclerView recyclerView, RecyclerView.g0 viewHolder, RecyclerView.g0 target) {
        p013kotlin.jvm.internal.s.k(recyclerView, "recyclerView");
        p013kotlin.jvm.internal.s.k(viewHolder, "viewHolder");
        p013kotlin.jvm.internal.s.k(target, "target");
        return true;
    }
}
