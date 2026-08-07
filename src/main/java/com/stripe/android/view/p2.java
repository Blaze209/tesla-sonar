package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150!8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b\u000e\u0010'R*\u0010-\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010.¨\u00060"}, d2 = {"Lcom/stripe/android/view/p2;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/stripe/android/view/p2$a;", "<init>", "()V", "", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "viewGroup", IntegerTokenConverter.CONVERTER_KEY, "e", "(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/p2$a;", "holder", "Ljn0/h0;", "c", "(Lcom/stripe/android/view/p2$a;I)V", "Lcom/stripe/android/model/g1;", "shippingMethod", "g", "(Lcom/stripe/android/model/g1;)V", "Lkotlin/Function1;", "a", "Lwn0/l;", "getOnShippingMethodSelectedCallback$payments_core_release", "()Lwn0/l;", "f", "(Lwn0/l;)V", "onShippingMethodSelectedCallback", "", "value", "b", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "(Ljava/util/List;)V", "shippingMethods", "I", "getSelectedIndex$payments_core_release", "h", "(I)V", "selectedIndex", "()Lcom/stripe/android/model/g1;", "selectedShippingMethod", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p2 extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super ShippingMethod, jn0.h0> onShippingMethodSelectedCallback = b.f55122c;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<ShippingMethod> shippingMethods = p013kotlin.collections.v.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ int selectedIndex;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/p2$a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/stripe/android/view/q2;", "shippingMethodView", "<init>", "(Lcom/stripe/android/view/q2;)V", "Lcom/stripe/android/model/g1;", "shippingMethod", "Ljn0/h0;", "c", "(Lcom/stripe/android/model/g1;)V", "", "selected", "b", "(Z)V", "a", "Lcom/stripe/android/view/q2;", "()Lcom/stripe/android/view/q2;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q2 shippingMethodView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q2 shippingMethodView) {
            super(shippingMethodView);
            p013kotlin.jvm.internal.s.k(shippingMethodView, "shippingMethodView");
            this.shippingMethodView = shippingMethodView;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q2 getShippingMethodView() {
            return this.shippingMethodView;
        }

        public final void b(boolean selected) {
            this.shippingMethodView.setSelected(selected);
        }

        public final void c(ShippingMethod shippingMethod) {
            p013kotlin.jvm.internal.s.k(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/g1;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/g1;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<ShippingMethod, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f55122c = new b();

        b() {
            super(1);
        }

        public final void a(ShippingMethod it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(ShippingMethod shippingMethod) {
            a(shippingMethod);
            return jn0.h0.f84049a;
        }
    }

    public p2() {
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p2 this$0, a holder, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(holder, "$holder");
        this$0.h(holder.getBindingAdapterPosition());
    }

    public final ShippingMethod b() {
        return (ShippingMethod) p013kotlin.collections.v.r0(this.shippingMethods, this.selectedIndex);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a holder, int i11) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        holder.c(this.shippingMethods.get(i11));
        holder.b(i11 == this.selectedIndex);
        holder.getShippingMethodView().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.d(this.f55105a, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i11) {
        p013kotlin.jvm.internal.s.k(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return new a(new q2(context, null, 0, 6, null));
    }

    public final void f(wn0.l<? super ShippingMethod, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onShippingMethodSelectedCallback = lVar;
    }

    public final void g(ShippingMethod shippingMethod) {
        p013kotlin.jvm.internal.s.k(shippingMethod, "shippingMethod");
        h(this.shippingMethods.indexOf(shippingMethod));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.shippingMethods.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return this.shippingMethods.get(position).hashCode();
    }

    public final void h(int i11) {
        int i12 = this.selectedIndex;
        if (i12 != i11) {
            notifyItemChanged(i12);
            notifyItemChanged(i11);
            this.selectedIndex = i11;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i11));
        }
    }

    public final void i(List<ShippingMethod> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        h(0);
        this.shippingMethods = value;
        notifyDataSetChanged();
    }
}
