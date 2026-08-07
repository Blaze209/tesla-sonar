package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.BankStatuses;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00105\u001a\u00020\t2\u0006\u00102\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00103\u001a\u0004\b#\u0010\u0014\"\u0004\b4\u0010\u001d¨\u00066"}, d2 = {"Lcom/stripe/android/view/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/stripe/android/view/x2;", "themeConfig", "", "Lcom/stripe/android/view/p;", "items", "Lkotlin/Function1;", "", "Ljn0/h0;", "itemSelectedCallback", "<init>", "(Lcom/stripe/android/view/x2;Ljava/util/List;Lwn0/l;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "g", "(I)V", "c", "a", "Lcom/stripe/android/view/x2;", "getThemeConfig", "()Lcom/stripe/android/view/x2;", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lwn0/l;", "getItemSelectedCallback", "()Lwn0/l;", "Lcom/stripe/android/model/e;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/e;", "getBankStatuses$payments_core_release", "()Lcom/stripe/android/model/e;", "e", "(Lcom/stripe/android/model/e;)V", "bankStatuses", "value", "I", "f", "selectedPosition", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x2 themeConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<p> items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, jn0.h0> itemSelectedCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BankStatuses bankStatuses;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int selectedPosition;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/g$a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lh40/g;", "viewBinding", "Lcom/stripe/android/view/x2;", "themeConfig", "<init>", "(Lh40/g;Lcom/stripe/android/view/x2;)V", "Lcom/stripe/android/view/p;", PlaceTypes.BANK, "", "isOnline", "Ljn0/h0;", "b", "(Lcom/stripe/android/view/p;Z)V", "isSelected", "a", "(Z)V", "Lh40/g;", "Lcom/stripe/android/view/x2;", "Landroid/content/res/Resources;", "c", "Landroid/content/res/Resources;", "resources", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h40.g viewBinding;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final x2 themeConfig;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Resources resources;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h40.g viewBinding, x2 themeConfig) {
            super(viewBinding.getRoot());
            p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
            p013kotlin.jvm.internal.s.k(themeConfig, "themeConfig");
            this.viewBinding = viewBinding;
            this.themeConfig = themeConfig;
            Resources resources = this.itemView.getResources();
            p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
            this.resources = resources;
        }

        public final void a(boolean isSelected) {
            this.viewBinding.f70690d.setTextColor(this.themeConfig.c(isSelected));
            androidx.core.widget.i.c(this.viewBinding.f70688b, ColorStateList.valueOf(this.themeConfig.d(isSelected)));
            AppCompatImageView checkIcon = this.viewBinding.f70688b;
            p013kotlin.jvm.internal.s.j(checkIcon, "checkIcon");
            checkIcon.setVisibility(isSelected ? 0 : 8);
        }

        public final void b(p bank, boolean isOnline) {
            p013kotlin.jvm.internal.s.k(bank, "bank");
            this.viewBinding.f70690d.setText(isOnline ? bank.getDisplayName() : this.resources.getString(f30.d0.f63969r0, bank.getDisplayName()));
            Integer brandIconResId = bank.getBrandIconResId();
            if (brandIconResId != null) {
                this.viewBinding.f70689c.setImageResource(brandIconResId.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(x2 themeConfig, List<? extends p> items, wn0.l<? super Integer, jn0.h0> itemSelectedCallback) {
        p013kotlin.jvm.internal.s.k(themeConfig, "themeConfig");
        p013kotlin.jvm.internal.s.k(items, "items");
        p013kotlin.jvm.internal.s.k(itemSelectedCallback, "itemSelectedCallback");
        this.themeConfig = themeConfig;
        this.items = items;
        this.itemSelectedCallback = itemSelectedCallback;
        this.selectedPosition = -1;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g this$0, RecyclerView.g0 holder, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(holder, "$holder");
        this$0.f(holder.getBindingAdapterPosition());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void c(int position) {
        notifyItemChanged(position);
    }

    public final void e(BankStatuses bankStatuses) {
        this.bankStatuses = bankStatuses;
    }

    public final void f(int i11) {
        int i12 = this.selectedPosition;
        if (i11 != i12) {
            if (i12 != -1) {
                notifyItemChanged(i12);
            }
            notifyItemChanged(i11);
            this.itemSelectedCallback.invoke(Integer.valueOf(i11));
        }
        this.selectedPosition = i11;
    }

    public final void g(int position) {
        f(position);
        notifyItemChanged(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final RecyclerView.g0 holder, int position) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        p pVar = this.items.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.d(this.f54895a, holder, view);
            }
        });
        a aVar = (a) holder;
        aVar.a(position == this.selectedPosition);
        BankStatuses bankStatuses = this.bankStatuses;
        aVar.b(pVar, bankStatuses != null ? bankStatuses.a(pVar) : true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int viewType) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        h40.g gVarC = h40.g.c(LayoutInflater.from(parent.getContext()), parent, false);
        p013kotlin.jvm.internal.s.j(gVarC, "inflate(...)");
        return new a(gVarC, this.themeConfig);
    }
}
