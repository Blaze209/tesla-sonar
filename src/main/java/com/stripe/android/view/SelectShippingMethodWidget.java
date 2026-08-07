package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/SelectShippingMethodWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lcom/stripe/android/model/g1;", "Ljn0/h0;", "callback", "setShippingMethodSelectedCallback", "(Lwn0/l;)V", "", "shippingMethods", "setShippingMethods", "(Ljava/util/List;)V", "shippingMethod", "setSelectedShippingMethod", "(Lcom/stripe/android/model/g1;)V", "Lcom/stripe/android/view/p2;", "a", "Lcom/stripe/android/view/p2;", "shippingMethodAdapter", "getSelectedShippingMethod", "()Lcom/stripe/android/model/g1;", "selectedShippingMethod", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectShippingMethodWidget extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p2 shippingMethodAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return this.shippingMethodAdapter.b();
    }

    public final void setSelectedShippingMethod(ShippingMethod shippingMethod) {
        p013kotlin.jvm.internal.s.k(shippingMethod, "shippingMethod");
        this.shippingMethodAdapter.g(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(wn0.l<? super ShippingMethod, jn0.h0> callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.shippingMethodAdapter.f(callback);
    }

    public final void setShippingMethods(List<ShippingMethod> shippingMethods) {
        p013kotlin.jvm.internal.s.k(shippingMethods, "shippingMethods");
        this.shippingMethodAdapter.i(shippingMethods);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p2 p2Var = new p2();
        this.shippingMethodAdapter = p2Var;
        h40.y yVarB = h40.y.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(yVarB, "inflate(...)");
        RecyclerView recyclerView = yVarB.f70772b;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(p2Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
