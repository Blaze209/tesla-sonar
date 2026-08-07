package com.stripe.android.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/stripe/android/view/u;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "brands", "selectedBrand", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/stripe/android/model/h;)V", "Landroid/view/View;", "view", "", "position", "Ljn0/h0;", "b", "(Landroid/view/View;I)V", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "(I)Lcom/stripe/android/model/h;", "getCount", "()I", "", "areAllItemsEnabled", "()Z", "isEnabled", "(I)Z", "Ljava/util/List;", "Lcom/stripe/android/model/h;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "Lcom/stripe/android/view/s2;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/view/s2;", "colorUtils", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u extends ArrayAdapter<com.stripe.android.model.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<com.stripe.android.model.h> brands;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.model.h selectedBrand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LayoutInflater inflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s2 colorUtils;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Context context, List<? extends com.stripe.android.model.h> brands, com.stripe.android.model.h hVar) {
        super(context, 0, brands);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(brands, "brands");
        this.brands = brands;
        this.selectedBrand = hVar;
        this.inflater = LayoutInflater.from(context);
        this.colorUtils = new s2(context);
    }

    private final void b(View view, int position) {
        com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.r0(this.brands, position - 1);
        if (hVar != null) {
            boolean z11 = hVar == this.selectedBrand;
            ImageView imageView = (ImageView) view.findViewById(f30.z.f64259h);
            if (imageView != null) {
                imageView.setBackgroundResource(hVar.getIcon());
            }
            ImageView imageView2 = (ImageView) view.findViewById(f30.z.f64257g);
            if (z11) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(this.colorUtils.getColorPrimary());
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(f30.z.f64261i);
            if (textView != null) {
                p013kotlin.jvm.internal.s.h(textView);
                textView.setText(hVar.getDisplayName());
                if (!z11) {
                    textView.setTypeface(Typeface.DEFAULT);
                } else {
                    textView.setTextColor(this.colorUtils.getColorPrimary());
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                }
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.h getItem(int position) {
        if (position == 0) {
            return null;
        }
        return (com.stripe.android.model.h) super.getItem(position - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        if (this.brands.isEmpty()) {
            return 0;
        }
        return this.brands.size() + 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        View viewInflate = position == 0 ? this.inflater.inflate(f30.b0.f63926x, parent, false) : this.inflater.inflate(f30.b0.f63912j, parent, false);
        if (position > 0) {
            p013kotlin.jvm.internal.s.h(viewInflate);
            b(viewInflate, position);
        }
        p013kotlin.jvm.internal.s.h(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int position) {
        return position != 0;
    }
}
