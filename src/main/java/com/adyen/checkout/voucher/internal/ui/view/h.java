package com.adyen.checkout.voucher.internal.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sf.VoucherInformationField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/h;", "Landroidx/recyclerview/widget/q;", "Lsf/a;", "Lcom/adyen/checkout/voucher/internal/ui/view/h$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "localizedContext", "<init>", "(Landroid/content/Context;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lcom/adyen/checkout/voucher/internal/ui/view/h$a;", "holder", "position", "Ljn0/h0;", "a", "(Lcom/adyen/checkout/voucher/internal/ui/view/h$a;I)V", "Landroid/content/Context;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h extends q<VoucherInformationField, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context localizedContext;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/h$a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lpf/a;", "binding", "Landroid/content/Context;", "localizedContext", "<init>", "(Lpf/a;Landroid/content/Context;)V", "Lsf/a;", "model", "Ljn0/h0;", "a", "(Lsf/a;)V", "Lpf/a;", "b", "Landroid/content/Context;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final pf.a binding;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context localizedContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pf.a binding, Context localizedContext) {
            super(binding.getRoot());
            s.k(binding, "binding");
            s.k(localizedContext, "localizedContext");
            this.binding = binding;
            this.localizedContext = localizedContext;
        }

        public final void a(VoucherInformationField model) {
            s.k(model, "model");
            this.binding.f102181c.setText(this.localizedContext.getString(model.getLabelResId()));
            this.binding.f102182d.setText(model.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/h$b;", "Landroidx/recyclerview/widget/h$f;", "Lsf/a;", "<init>", "()V", "oldItem", "newItem", "", "b", "(Lsf/a;Lsf/a;)Z", "a", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.h.f<VoucherInformationField> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19824a = new b();

        private b() {
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(VoucherInformationField oldItem, VoucherInformationField newItem) {
            s.k(oldItem, "oldItem");
            s.k(newItem, "newItem");
            return areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(VoucherInformationField oldItem, VoucherInformationField newItem) {
            s.k(oldItem, "oldItem");
            s.k(newItem, "newItem");
            return s.f(oldItem, newItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Context localizedContext) {
        super(b.f19824a);
        s.k(context, "context");
        s.k(localizedContext, "localizedContext");
        this.context = context;
        this.localizedContext = localizedContext;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int position) {
        s.k(holder, "holder");
        VoucherInformationField voucherInformationField = getCurrentList().get(position);
        s.h(voucherInformationField);
        holder.a(voucherInformationField);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int viewType) {
        s.k(parent, "parent");
        pf.a aVarC = pf.a.c(LayoutInflater.from(this.context), parent, false);
        s.j(aVarC, "inflate(...)");
        return new a(aVarC, this.localizedContext);
    }
}
