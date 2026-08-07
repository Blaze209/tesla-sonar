package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004BDFGBI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010'J\u001d\u0010+\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0005H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010'J\u0017\u00101\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b6\u0010\u0017J\u001f\u00108\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u00020)H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00152\u0006\u0010:\u001a\u00020)H\u0000¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u0004\u0018\u00010\u00102\u0006\u0010:\u001a\u00020)H\u0000¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER \u0010*\u001a\b\u0012\u0004\u0012\u00020)0H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010KR$\u0010Q\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010X\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010YR\u001a\u0010_\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010^R\u0016\u0010e\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lcom/stripe/android/view/k2;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lcom/stripe/android/view/d2;", "intentArgs", "", "Lcom/stripe/android/model/v0$p;", "addableTypes", "", "initiallySelectedPaymentMethodId", "", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "<init>", "(Lcom/stripe/android/view/d2;Ljava/util/List;Ljava/lang/String;ZZZ)V", "", "position", "q", "(I)Z", "r", "Ljn0/h0;", "A", "(I)V", "Landroid/view/ViewGroup;", "parent", "Lcom/stripe/android/view/k2$c$a;", "f", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/k2$c$a;", "Lcom/stripe/android/view/k2$c$b;", "g", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/k2$c$b;", "Lcom/stripe/android/view/k2$c$d;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/k2$c$d;", "Lcom/stripe/android/view/k2$c$c;", "h", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/k2$c$c;", "n", "(I)I", "l", "Lcom/stripe/android/model/v0;", "paymentMethods", "z", "(Ljava/util/List;)V", "getItemCount", "()I", "getItemViewType", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "w", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;", "paymentMethod", "k", "(Lcom/stripe/android/model/v0;)V", "x", "m", "(I)Lcom/stripe/android/model/v0;", "o", "(Lcom/stripe/android/model/v0;)Ljava/lang/Integer;", "a", "Ljava/util/List;", "b", "Z", "c", DateTokenConverter.CONVERTER_KEY, "", "e", "getPaymentMethods$payments_core_release", "()Ljava/util/List;", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "selectedPaymentMethodId", "Lcom/stripe/android/view/k2$b;", "Lcom/stripe/android/view/k2$b;", "getListener$payments_core_release", "()Lcom/stripe/android/view/k2$b;", "y", "(Lcom/stripe/android/view/k2$b;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "I", "googlePayCount", "Lcom/stripe/android/view/b;", "Lcom/stripe/android/view/b;", "getAddCardArgs$payments_core_release", "()Lcom/stripe/android/view/b;", "addCardArgs", "j", "getAddFpxArgs$payments_core_release", "addFpxArgs", "p", "()Lcom/stripe/android/model/v0;", "selectedPaymentMethod", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k2 extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54955l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f54956m = -2057760476;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PaymentMethod.p> addableTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowGooglePay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean useGooglePay;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean canDeletePaymentMethods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<PaymentMethod> paymentMethods;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String selectedPaymentMethodId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b listener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int googlePayCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Args addCardArgs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Args addFpxArgs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/k2$b;", "", "Lcom/stripe/android/model/v0;", "paymentMethod", "Ljn0/h0;", "b", "(Lcom/stripe/android/model/v0;)V", "c", "()V", "Lcom/stripe/android/view/b;", "args", "a", "(Lcom/stripe/android/view/b;)V", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(Args args);

        void b(PaymentMethod paymentMethod);

        void c();

        void d(PaymentMethod paymentMethod);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/k2$c;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/view/k2$c$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c extends RecyclerView.g0 {
        public /* synthetic */ c(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/k2$c$d;", "Lcom/stripe/android/view/k2$c;", "Lh40/q;", "viewBinding", "<init>", "(Lh40/q;)V", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/ViewGroup;)V", "Lcom/stripe/android/model/v0;", "paymentMethod", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/v0;)V", "", "selected", "b", "(Z)V", "Lh40/q;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final h40.q viewBinding;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(h40.q viewBinding) {
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
                super(root, null);
                this.viewBinding = viewBinding;
            }

            public final void a(PaymentMethod paymentMethod) {
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.viewBinding.f70744b.setPaymentMethod(paymentMethod);
            }

            public final void b(boolean selected) {
                this.viewBinding.f70744b.setSelected(selected);
                this.itemView.setSelected(selected);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public d(ViewGroup parent) {
                p013kotlin.jvm.internal.s.k(parent, "parent");
                h40.q qVarC = h40.q.c(LayoutInflater.from(parent.getContext()), parent, false);
                p013kotlin.jvm.internal.s.j(qVarC, "inflate(...)");
                this(qVarC);
            }
        }

        private c(View view) {
            super(view);
        }

        /* JADX INFO: renamed from: com.stripe.android.view.k2$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/view/k2$c$c;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lh40/o;", "viewBinding", "<init>", "(Lh40/o;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "isSelected", "Ljn0/h0;", "a", "(Z)V", "Lh40/o;", "Lcom/stripe/android/view/x2;", "b", "Lcom/stripe/android/view/x2;", "themeConfig", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1104c extends RecyclerView.g0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final h40.o viewBinding;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final x2 themeConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1104c(h40.o viewBinding) {
                super(viewBinding.getRoot());
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                this.viewBinding = viewBinding;
                Context context = this.itemView.getContext();
                p013kotlin.jvm.internal.s.j(context, "getContext(...)");
                x2 x2Var = new x2(context);
                this.themeConfig = x2Var;
                androidx.core.widget.i.c(viewBinding.f70740b, ColorStateList.valueOf(x2Var.d(true)));
            }

            public final void a(boolean isSelected) {
                this.viewBinding.f70741c.setTextColor(ColorStateList.valueOf(this.themeConfig.c(isSelected)));
                this.viewBinding.f70740b.setVisibility(isSelected ? 0 : 4);
                this.itemView.setSelected(isSelected);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C1104c(Context context, ViewGroup parent) {
                p013kotlin.jvm.internal.s.k(context, "context");
                p013kotlin.jvm.internal.s.k(parent, "parent");
                h40.o oVarC = h40.o.c(LayoutInflater.from(context), parent, false);
                p013kotlin.jvm.internal.s.j(oVarC, "inflate(...)");
                this(oVarC);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/k2$c$a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lh40/e;", "viewBinding", "<init>", "(Lh40/e;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends RecyclerView.g0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h40.e viewBinding) {
                super(viewBinding.getRoot());
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                this.itemView.setId(f30.z.f64280r0);
                View view = this.itemView;
                view.setContentDescription(view.getResources().getString(f30.d0.D0));
                viewBinding.f70670b.setText(this.itemView.getResources().getString(f30.d0.D0));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public a(Context context, ViewGroup parent) {
                p013kotlin.jvm.internal.s.k(context, "context");
                p013kotlin.jvm.internal.s.k(parent, "parent");
                h40.e eVarC = h40.e.c(LayoutInflater.from(context), parent, false);
                p013kotlin.jvm.internal.s.j(eVarC, "inflate(...)");
                this(eVarC);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/k2$c$b;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lh40/e;", "viewBinding", "<init>", "(Lh40/e;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends RecyclerView.g0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h40.e viewBinding) {
                super(viewBinding.getRoot());
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                this.itemView.setId(f30.z.f64282s0);
                View view = this.itemView;
                view.setContentDescription(view.getResources().getString(f30.d0.E0));
                viewBinding.f70670b.setText(this.itemView.getResources().getString(f30.d0.E0));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public b(Context context, ViewGroup parent) {
                p013kotlin.jvm.internal.s.k(context, "context");
                p013kotlin.jvm.internal.s.k(parent, "parent");
                h40.e eVarC = h40.e.c(LayoutInflater.from(context), parent, false);
                p013kotlin.jvm.internal.s.j(eVarC, "inflate(...)");
                this(eVarC);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/k2$d;", "", "<init>", "(Ljava/lang/String;I)V", "Card", "AddCard", "AddFpx", "GooglePay", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum d {
        Card,
        AddCard,
        AddFpx,
        GooglePay;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f54971b;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54970a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.AddCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.AddFpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.GooglePay.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f54971b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k2(Args intentArgs, List<? extends PaymentMethod.p> addableTypes, String str, boolean z11, boolean z12, boolean z13) {
        p013kotlin.jvm.internal.s.k(intentArgs, "intentArgs");
        p013kotlin.jvm.internal.s.k(addableTypes, "addableTypes");
        this.addableTypes = addableTypes;
        this.shouldShowGooglePay = z11;
        this.useGooglePay = z12;
        this.canDeletePaymentMethods = z13;
        this.paymentMethods = new ArrayList();
        this.selectedPaymentMethodId = str;
        Integer num = z11 ? 1 : null;
        this.googlePayCount = num != null ? num.intValue() : 0;
        this.addCardArgs = new Args.a().c(intentArgs.getBillingAddressFields()).g(true).d(intentArgs.getIsPaymentSessionActive()).f(PaymentMethod.p.Card).b(intentArgs.getAddPaymentMethodFooterLayoutId()).e(intentArgs.getPaymentConfiguration()).h(intentArgs.getWindowFlags()).a();
        this.addFpxArgs = new Args.a().d(intentArgs.getIsPaymentSessionActive()).f(PaymentMethod.p.Fpx).e(intentArgs.getPaymentConfiguration()).a();
        setHasStableIds(true);
    }

    private final void A(int position) {
        Iterator<PaymentMethod> it = this.paymentMethods.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (p013kotlin.jvm.internal.s.f(it.next().id, this.selectedPaymentMethodId)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != position) {
            notifyItemChanged(i11);
            PaymentMethod paymentMethod = (PaymentMethod) p013kotlin.collections.v.r0(this.paymentMethods, position);
            this.selectedPaymentMethodId = paymentMethod != null ? paymentMethod.id : null;
        }
        notifyItemChanged(position);
    }

    private final c.a f(ViewGroup parent) {
        Context context = parent.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return new c.a(context, parent);
    }

    private final c.b g(ViewGroup parent) {
        Context context = parent.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return new c.b(context, parent);
    }

    private final c.C1104c h(ViewGroup parent) {
        Context context = parent.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return new c.C1104c(context, parent);
    }

    private final c.d i(ViewGroup parent) {
        final c.d dVar = new c.d(parent);
        if (this.canDeletePaymentMethods) {
            ViewCompat.c(dVar.itemView, parent.getContext().getString(f30.d0.f63949h0), new AccessibilityViewCommand() { // from class: com.stripe.android.view.j2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean a(View view, AccessibilityViewCommand.a aVar) {
                    return k2.j(this.f54949a, dVar, view, aVar);
                }
            });
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(k2 this$0, c.d viewHolder, View view, AccessibilityViewCommand.a aVar) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(viewHolder, "$viewHolder");
        p013kotlin.jvm.internal.s.k(view, "<anonymous parameter 0>");
        b bVar = this$0.listener;
        if (bVar == null) {
            return true;
        }
        bVar.d(this$0.m(viewHolder.getBindingAdapterPosition()));
        return true;
    }

    private final int l(int position) {
        return (position - this.paymentMethods.size()) - this.googlePayCount;
    }

    private final int n(int position) {
        return position - this.googlePayCount;
    }

    private final boolean q(int position) {
        return this.shouldShowGooglePay && position == 0;
    }

    private final boolean r(int position) {
        bo0.j jVar = this.shouldShowGooglePay ? new bo0.j(1, this.paymentMethods.size()) : bo0.n.w(0, this.paymentMethods.size());
        return position <= jVar.getLast() && jVar.getFirst() <= position;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(k2 this$0, RecyclerView.g0 holder, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(holder, "$holder");
        this$0.w(((c.d) holder).getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(k2 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.selectedPaymentMethodId = null;
        b bVar = this$0.listener;
        if (bVar != null) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(k2 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        b bVar = this$0.listener;
        if (bVar != null) {
            bVar.a(this$0.addCardArgs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(k2 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        b bVar = this$0.listener;
        if (bVar != null) {
            bVar.a(this$0.addFpxArgs);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.paymentMethods.size() + this.addableTypes.size() + this.googlePayCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int position) {
        if (q(position)) {
            return f54956m;
        }
        return r(position) ? m(position).hashCode() : this.addableTypes.get(l(position)).code.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int position) {
        if (q(position)) {
            return d.GooglePay.ordinal();
        }
        if (r(position)) {
            return PaymentMethod.p.Card == m(position).type ? d.Card.ordinal() : super.getItemViewType(position);
        }
        PaymentMethod.p pVar = this.addableTypes.get(l(position));
        int i11 = e.f54970a[pVar.ordinal()];
        if (i11 == 1) {
            return d.AddCard.ordinal();
        }
        if (i11 == 2) {
            return d.AddFpx.ordinal();
        }
        throw new IllegalArgumentException("Unsupported PaymentMethod type: " + pVar.code);
    }

    public final /* synthetic */ void k(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        Integer numO = o(paymentMethod);
        if (numO != null) {
            int iIntValue = numO.intValue();
            this.paymentMethods.remove(paymentMethod);
            notifyItemRemoved(iIntValue);
        }
    }

    public final /* synthetic */ PaymentMethod m(int position) {
        return this.paymentMethods.get(n(position));
    }

    public final Integer o(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        Integer numValueOf = Integer.valueOf(this.paymentMethods.indexOf(paymentMethod));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf(numValueOf.intValue() + this.googlePayCount);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final RecyclerView.g0 holder, int position) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        if (holder instanceof c.d) {
            PaymentMethod paymentMethodM = m(position);
            c.d dVar = (c.d) holder;
            dVar.a(paymentMethodM);
            dVar.b(p013kotlin.jvm.internal.s.f(paymentMethodM.id, this.selectedPaymentMethodId));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.f2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k2.s(this.f54898a, holder, view);
                }
            });
            return;
        }
        if (holder instanceof c.C1104c) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.g2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k2.t(this.f54910a, view);
                }
            });
            ((c.C1104c) holder).a(this.useGooglePay);
        } else if (holder instanceof c.a) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.h2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k2.u(this.f54918a, view);
                }
            });
        } else if (holder instanceof c.b) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.i2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k2.v(this.f54922a, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int viewType) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        int i11 = e.f54971b[d.getEntries().get(viewType).ordinal()];
        if (i11 == 1) {
            return i(parent);
        }
        if (i11 == 2) {
            return f(parent);
        }
        if (i11 == 3) {
            return g(parent);
        }
        if (i11 == 4) {
            return h(parent);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PaymentMethod p() {
        String str = this.selectedPaymentMethodId;
        Object obj = null;
        if (str == null) {
            return null;
        }
        for (Object obj2 : this.paymentMethods) {
            if (p013kotlin.jvm.internal.s.f(((PaymentMethod) obj2).id, str)) {
                obj = obj2;
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    public final /* synthetic */ void w(int position) {
        A(position);
        b bVar = this.listener;
        if (bVar != null) {
            bVar.b(m(position));
        }
    }

    public final /* synthetic */ void x(PaymentMethod paymentMethod) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
        Integer numO = o(paymentMethod);
        if (numO != null) {
            notifyItemChanged(numO.intValue());
        }
    }

    public final void y(b bVar) {
        this.listener = bVar;
    }

    public final /* synthetic */ void z(List paymentMethods) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        this.paymentMethods.clear();
        this.paymentMethods.addAll(paymentMethods);
        notifyDataSetChanged();
    }
}
