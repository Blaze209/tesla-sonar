package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import f30.PaymentSessionConfig;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R.\u00106\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010<\u001a\u00020 2\u0006\u00100\u001a\u00020 8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R7\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0?8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR/\u0010M\u001a\u0004\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010D¨\u0006P"}, d2 = {"Lcom/stripe/android/view/a2;", "Landroidx/viewpager/widget/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf30/r;", "paymentSessionConfig", "", "", "allowedShippingCountryCodes", "Lkotlin/Function1;", "Lcom/stripe/android/model/g1;", "Ljn0/h0;", "onShippingMethodSelectedCallback", "<init>", "(Landroid/content/Context;Lf30/r;Ljava/util/Set;Lwn0/l;)V", "Landroid/view/ViewGroup;", "collection", "", "position", "", "g", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "view", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", DateTokenConverter.CONVERTER_KEY, "()I", "Lcom/stripe/android/view/z1;", "r", "(I)Lcom/stripe/android/view/z1;", "Landroid/view/View;", "o", "", "h", "(Landroid/view/View;Ljava/lang/Object;)Z", "", "s", "(I)Ljava/lang/CharSequence;", "obj", "e", "(Ljava/lang/Object;)I", "c", "Landroid/content/Context;", "Lf30/r;", "Ljava/util/Set;", "f", "Lwn0/l;", "Lcom/stripe/android/model/f1;", "value", "Lcom/stripe/android/model/f1;", "getShippingInformation$payments_core_release", "()Lcom/stripe/android/model/f1;", "y", "(Lcom/stripe/android/model/f1;)V", "shippingInformation", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "x", "(Z)V", "isShippingInfoSubmitted", IntegerTokenConverter.CONVERTER_KEY, "shouldRecreateShippingMethodsScreen", "", "<set-?>", "j", "Lkotlin/properties/d;", "v", "()Ljava/util/List;", "z", "(Ljava/util/List;)V", "shippingMethods", "k", "u", "()Lcom/stripe/android/model/g1;", "w", "(Lcom/stripe/android/model/g1;)V", "selectedShippingMethod", "t", "pages", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a2 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f54751l = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(a2.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(a2.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54752m = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PaymentSessionConfig paymentSessionConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> allowedShippingCountryCodes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ShippingMethod, jn0.h0> onShippingMethodSelectedCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ShippingInformation shippingInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShippingInfoSubmitted;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean shouldRecreateShippingMethodsScreen;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d shippingMethods;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d selectedShippingMethod;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/a2$a;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "b", "Lcom/stripe/android/view/a2$a$a;", "Lcom/stripe/android/view/a2$a$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends RecyclerView.g0 {
        public /* synthetic */ a(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* JADX INFO: renamed from: com.stripe.android.view.a2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/a2$a$a;", "Lcom/stripe/android/view/a2$a;", "Lh40/v;", "viewBinding", "<init>", "(Lh40/v;)V", "Landroid/view/ViewGroup;", "root", "(Landroid/view/ViewGroup;)V", "Lf30/r;", "paymentSessionConfig", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "", "allowedShippingCountryCodes", "Ljn0/h0;", "a", "(Lf30/r;Lcom/stripe/android/model/f1;Ljava/util/Set;)V", "Lcom/stripe/android/view/ShippingInfoWidget;", "Lcom/stripe/android/view/ShippingInfoWidget;", "shippingInfoWidget", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1099a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ShippingInfoWidget shippingInfoWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            public C1099a(h40.v viewBinding) {
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                ScrollView root = viewBinding.getRoot();
                p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
                super(root, null);
                ShippingInfoWidget shippingInfoWidget = viewBinding.f70763b;
                p013kotlin.jvm.internal.s.j(shippingInfoWidget, "shippingInfoWidget");
                this.shippingInfoWidget = shippingInfoWidget;
            }

            public final void a(PaymentSessionConfig paymentSessionConfig, ShippingInformation shippingInformation, Set<String> allowedShippingCountryCodes) {
                p013kotlin.jvm.internal.s.k(paymentSessionConfig, "paymentSessionConfig");
                p013kotlin.jvm.internal.s.k(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.shippingInfoWidget.setHiddenFields(paymentSessionConfig.b());
                this.shippingInfoWidget.setOptionalFields(paymentSessionConfig.c());
                this.shippingInfoWidget.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.shippingInfoWidget.h(shippingInformation);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C1099a(ViewGroup root) {
                p013kotlin.jvm.internal.s.k(root, "root");
                h40.v vVarC = h40.v.c(LayoutInflater.from(root.getContext()), root, false);
                p013kotlin.jvm.internal.s.j(vVarC, "inflate(...)");
                this(vVarC);
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ9\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/view/a2$a$b;", "Lcom/stripe/android/view/a2$a;", "Lh40/w;", "viewBinding", "<init>", "(Lh40/w;)V", "Landroid/view/ViewGroup;", "root", "(Landroid/view/ViewGroup;)V", "", "Lcom/stripe/android/model/g1;", "shippingMethods", "selectedShippingMethod", "Lkotlin/Function1;", "Ljn0/h0;", "onShippingMethodSelectedCallback", "a", "(Ljava/util/List;Lcom/stripe/android/model/g1;Lwn0/l;)V", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "shippingMethodWidget", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final SelectShippingMethodWidget shippingMethodWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(h40.w viewBinding) {
                p013kotlin.jvm.internal.s.k(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
                super(root, null);
                SelectShippingMethodWidget selectShippingMethodWidget = viewBinding.f70765b;
                p013kotlin.jvm.internal.s.j(selectShippingMethodWidget, "selectShippingMethodWidget");
                this.shippingMethodWidget = selectShippingMethodWidget;
            }

            public final void a(List<ShippingMethod> shippingMethods, ShippingMethod selectedShippingMethod, wn0.l<? super ShippingMethod, jn0.h0> onShippingMethodSelectedCallback) {
                p013kotlin.jvm.internal.s.k(shippingMethods, "shippingMethods");
                p013kotlin.jvm.internal.s.k(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.shippingMethodWidget.setShippingMethods(shippingMethods);
                this.shippingMethodWidget.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (selectedShippingMethod != null) {
                    this.shippingMethodWidget.setSelectedShippingMethod(selectedShippingMethod);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public b(ViewGroup root) {
                p013kotlin.jvm.internal.s.k(root, "root");
                h40.w wVarC = h40.w.c(LayoutInflater.from(root.getContext()), root, false);
                p013kotlin.jvm.internal.s.j(wVarC, "inflate(...)");
                this(wVarC);
            }
        }

        private a(View view) {
            super(view);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54764a;

        static {
            int[] iArr = new int[z1.values().length];
            try {
                iArr[z1.ShippingInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z1.ShippingMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54764a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/a2$c", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends ObservableProperty<List<? extends ShippingMethod>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2 f54765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, a2 a2Var) {
            super(obj);
            this.f54765a = a2Var;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, List<? extends ShippingMethod> oldValue, List<? extends ShippingMethod> newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54765a.shouldRecreateShippingMethodsScreen = !p013kotlin.jvm.internal.s.f(newValue, oldValue);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/a2$d", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ObservableProperty<ShippingMethod> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2 f54766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a2 a2Var) {
            super(obj);
            this.f54766a = a2Var;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, ShippingMethod oldValue, ShippingMethod newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            this.f54766a.shouldRecreateShippingMethodsScreen = !p013kotlin.jvm.internal.s.f(newValue, oldValue);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2(Context context, PaymentSessionConfig paymentSessionConfig, Set<String> allowedShippingCountryCodes, wn0.l<? super ShippingMethod, jn0.h0> onShippingMethodSelectedCallback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(paymentSessionConfig, "paymentSessionConfig");
        p013kotlin.jvm.internal.s.k(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        p013kotlin.jvm.internal.s.k(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.context = context;
        this.paymentSessionConfig = paymentSessionConfig;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.onShippingMethodSelectedCallback = onShippingMethodSelectedCallback;
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.shippingMethods = new c(p013kotlin.collections.v.m(), this);
        this.selectedShippingMethod = new d(null, this);
    }

    private final List<z1> t() {
        z1 z1Var = z1.ShippingInfo;
        z1 z1Var2 = null;
        if (!this.paymentSessionConfig.getIsShippingInfoRequired()) {
            z1Var = null;
        }
        z1 z1Var3 = z1.ShippingMethod;
        if (this.paymentSessionConfig.getIsShippingMethodRequired() && (!this.paymentSessionConfig.getIsShippingInfoRequired() || this.isShippingInfoSubmitted)) {
            z1Var2 = z1Var3;
        }
        return p013kotlin.collections.v.r(z1Var, z1Var2);
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup collection, int position, Object view) {
        p013kotlin.jvm.internal.s.k(collection, "collection");
        p013kotlin.jvm.internal.s.k(view, "view");
        collection.removeView((View) view);
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return t().size();
    }

    @Override // androidx.viewpager.widget.a
    public int e(Object obj) {
        p013kotlin.jvm.internal.s.k(obj, "obj");
        if (!(obj instanceof View) || ((View) obj).getTag() != z1.ShippingMethod || !this.shouldRecreateShippingMethodsScreen) {
            return super.e(obj);
        }
        this.shouldRecreateShippingMethodsScreen = false;
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public Object g(ViewGroup collection, int position) {
        RecyclerView.g0 c1099a;
        p013kotlin.jvm.internal.s.k(collection, "collection");
        z1 z1Var = t().get(position);
        int i11 = b.f54764a[z1Var.ordinal()];
        if (i11 == 1) {
            c1099a = new a.C1099a(collection);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c1099a = new a.b(collection);
        }
        if (c1099a instanceof a.C1099a) {
            ((a.C1099a) c1099a).a(this.paymentSessionConfig, this.shippingInformation, this.allowedShippingCountryCodes);
        } else if (c1099a instanceof a.b) {
            ((a.b) c1099a).a(v(), u(), this.onShippingMethodSelectedCallback);
        }
        collection.addView(c1099a.itemView);
        c1099a.itemView.setTag(z1Var);
        View itemView = c1099a.itemView;
        p013kotlin.jvm.internal.s.j(itemView, "itemView");
        return itemView;
    }

    @Override // androidx.viewpager.widget.a
    public boolean h(View view, Object o11) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(o11, "o");
        return view == o11;
    }

    public final z1 r(int position) {
        return (z1) p013kotlin.collections.v.r0(t(), position);
    }

    public CharSequence s(int position) {
        return this.context.getString(t().get(position).getTitleResId());
    }

    public final ShippingMethod u() {
        return (ShippingMethod) this.selectedShippingMethod.getValue(this, f54751l[1]);
    }

    public final List<ShippingMethod> v() {
        return (List) this.shippingMethods.getValue(this, f54751l[0]);
    }

    public final void w(ShippingMethod shippingMethod) {
        this.selectedShippingMethod.setValue(this, f54751l[1], shippingMethod);
    }

    public final void x(boolean z11) {
        this.isShippingInfoSubmitted = z11;
        i();
    }

    public final void y(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
        i();
    }

    public final void z(List<ShippingMethod> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.shippingMethods.setValue(this, f54751l[0], list);
    }
}
