package com.stripe.android.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.model.Networks;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0002'+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u000fJ\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00104R$\u0010#\u001a\u0002032\u0006\u00106\u001a\u0002038B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010@\u001a\u00020;2\u0006\u00106\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u001d\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u001fR0\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c0D2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001c0D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0D2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001c0D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010O\u001a\u00020;2\u0006\u00106\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R$\u0010R\u001a\u00020;2\u0006\u00106\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R$\u0010W\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/model/w0$c$c;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/w0$c$c;", "Lcom/stripe/android/model/t0;", "c", "()Lcom/stripe/android/model/t0;", "Ljn0/h0;", "m", "()V", "f", "n", "h", "Lcom/stripe/android/view/u;", "adapter", "k", "(Lcom/stripe/android/view/u;)I", "l", "e", "Lcom/stripe/android/model/h;", "brand", "g", "(Lcom/stripe/android/model/h;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lh40/j;", "a", "Lh40/j;", "viewBinding", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "iconView", "chevron", "Landroid/widget/ListPopupWindow;", "Landroid/widget/ListPopupWindow;", "listPopup", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/view/CardBrandView$b;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "stateFlow", "value", "getState", "()Lcom/stripe/android/view/CardBrandView$b;", "setState", "(Lcom/stripe/android/view/CardBrandView$b;)V", "", "j", "()Z", "setCbcEligible", "(Z)V", "isCbcEligible", "getBrand", "()Lcom/stripe/android/model/h;", "setBrand", "", "getPossibleBrands", "()Ljava/util/List;", "setPossibleBrands", "(Ljava/util/List;)V", "possibleBrands", "getMerchantPreferredNetworks", "setMerchantPreferredNetworks", "merchantPreferredNetworks", "getShouldShowCvc", "setShouldShowCvc", "shouldShowCvc", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "shouldShowErrorIcon", "getTintColorInt$payments_core_release", "()I", "setTintColorInt$payments_core_release", "(I)V", "tintColorInt", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardBrandView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h40.j viewBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageView iconView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImageView chevron;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ListPopupWindow listPopup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private MutableStateFlow<State> stateFlow;

    /* JADX INFO: renamed from: com.stripe.android.view.CardBrandView$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/view/CardBrandView$a;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", "Lcom/stripe/android/view/CardBrandView$b;", "state", "<init>", "(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/os/Parcelable;", "getSuperSavedState", "()Landroid/os/Parcelable;", "b", "Lcom/stripe/android/view/CardBrandView$b;", "()Lcom/stripe/android/view/CardBrandView$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1092a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Parcelable superSavedState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: com.stripe.android.view.CardBrandView$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1092a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SavedState createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), State.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, State state) {
            super(parcelable);
            p013kotlin.jvm.internal.s.k(state, "state");
            this.superSavedState = parcelable;
            this.state = state;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final State getState() {
            return this.state;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return p013kotlin.jvm.internal.s.f(this.superSavedState, savedState.superSavedState) && p013kotlin.jvm.internal.s.f(this.state, savedState.state);
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", state=" + this.state + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.superSavedState, flags);
            this.state.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.CardBrandView$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jx\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u0004\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b*\u0010.R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b0\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b1\u0010\u0017¨\u00063"}, d2 = {"Lcom/stripe/android/view/CardBrandView$b;", "Landroid/os/Parcelable;", "", "isCbcEligible", "isLoading", "Lcom/stripe/android/model/h;", "brand", "userSelectedBrand", "", "possibleBrands", "merchantPreferredNetworks", "shouldShowCvc", "shouldShowErrorIcon", "", "tintColor", "<init>", "(ZZLcom/stripe/android/model/h;Lcom/stripe/android/model/h;Ljava/util/List;Ljava/util/List;ZZI)V", "a", "(ZZLcom/stripe/android/model/h;Lcom/stripe/android/model/h;Ljava/util/List;Ljava/util/List;ZZI)Lcom/stripe/android/view/CardBrandView$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "j", "()Z", "b", "c", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", "h", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCbcEligible;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.model.h brand;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.model.h userSelectedBrand;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<com.stripe.android.model.h> possibleBrands;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<com.stripe.android.model.h> merchantPreferredNetworks;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowCvc;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowErrorIcon;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final int tintColor;

        /* JADX INFO: renamed from: com.stripe.android.view.CardBrandView$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final State createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                com.stripe.android.model.h hVarValueOf = com.stripe.android.model.h.valueOf(parcel.readString());
                com.stripe.android.model.h hVarValueOf2 = parcel.readInt() == 0 ? null : com.stripe.android.model.h.valueOf(parcel.readString());
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(com.stripe.android.model.h.valueOf(parcel.readString()));
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(com.stripe.android.model.h.valueOf(parcel.readString()));
                }
                return new State(z11, z12, hVarValueOf, hVarValueOf2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final State[] newArray(int i11) {
                return new State[i11];
            }
        }

        public State() {
            this(false, false, null, null, null, null, false, false, 0, 511, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State b(State state, boolean z11, boolean z12, com.stripe.android.model.h hVar, com.stripe.android.model.h hVar2, List list, List list2, boolean z13, boolean z14, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z11 = state.isCbcEligible;
            }
            if ((i12 & 2) != 0) {
                z12 = state.isLoading;
            }
            if ((i12 & 4) != 0) {
                hVar = state.brand;
            }
            if ((i12 & 8) != 0) {
                hVar2 = state.userSelectedBrand;
            }
            if ((i12 & 16) != 0) {
                list = state.possibleBrands;
            }
            if ((i12 & 32) != 0) {
                list2 = state.merchantPreferredNetworks;
            }
            if ((i12 & 64) != 0) {
                z13 = state.shouldShowCvc;
            }
            if ((i12 & 128) != 0) {
                z14 = state.shouldShowErrorIcon;
            }
            if ((i12 & 256) != 0) {
                i11 = state.tintColor;
            }
            boolean z15 = z14;
            int i13 = i11;
            List list3 = list2;
            boolean z16 = z13;
            List list4 = list;
            com.stripe.android.model.h hVar3 = hVar;
            return state.a(z11, z12, hVar3, hVar2, list4, list3, z16, z15, i13);
        }

        public final State a(boolean isCbcEligible, boolean isLoading, com.stripe.android.model.h brand, com.stripe.android.model.h userSelectedBrand, List<? extends com.stripe.android.model.h> possibleBrands, List<? extends com.stripe.android.model.h> merchantPreferredNetworks, boolean shouldShowCvc, boolean shouldShowErrorIcon, int tintColor) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            p013kotlin.jvm.internal.s.k(possibleBrands, "possibleBrands");
            p013kotlin.jvm.internal.s.k(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new State(isCbcEligible, isLoading, brand, userSelectedBrand, possibleBrands, merchantPreferredNetworks, shouldShowCvc, shouldShowErrorIcon, tintColor);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.stripe.android.model.h getBrand() {
            return this.brand;
        }

        public final List<com.stripe.android.model.h> d() {
            return this.merchantPreferredNetworks;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<com.stripe.android.model.h> e() {
            return this.possibleBrands;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.isCbcEligible == state.isCbcEligible && this.isLoading == state.isLoading && this.brand == state.brand && this.userSelectedBrand == state.userSelectedBrand && p013kotlin.jvm.internal.s.f(this.possibleBrands, state.possibleBrands) && p013kotlin.jvm.internal.s.f(this.merchantPreferredNetworks, state.merchantPreferredNetworks) && this.shouldShowCvc == state.shouldShowCvc && this.shouldShowErrorIcon == state.shouldShowErrorIcon && this.tintColor == state.tintColor;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldShowCvc() {
            return this.shouldShowCvc;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShouldShowErrorIcon() {
            return this.shouldShowErrorIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isCbcEligible) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.brand.hashCode()) * 31;
            com.stripe.android.model.h hVar = this.userSelectedBrand;
            return ((((((((((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.possibleBrands.hashCode()) * 31) + this.merchantPreferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.shouldShowCvc)) * 31) + Boolean.hashCode(this.shouldShowErrorIcon)) * 31) + Integer.hashCode(this.tintColor);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final com.stripe.android.model.h getUserSelectedBrand() {
            return this.userSelectedBrand;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        public String toString() {
            return "State(isCbcEligible=" + this.isCbcEligible + ", isLoading=" + this.isLoading + ", brand=" + this.brand + ", userSelectedBrand=" + this.userSelectedBrand + ", possibleBrands=" + this.possibleBrands + ", merchantPreferredNetworks=" + this.merchantPreferredNetworks + ", shouldShowCvc=" + this.shouldShowCvc + ", shouldShowErrorIcon=" + this.shouldShowErrorIcon + ", tintColor=" + this.tintColor + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.isCbcEligible ? 1 : 0);
            parcel.writeInt(this.isLoading ? 1 : 0);
            parcel.writeString(this.brand.name());
            com.stripe.android.model.h hVar = this.userSelectedBrand;
            if (hVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(hVar.name());
            }
            List<com.stripe.android.model.h> list = this.possibleBrands;
            parcel.writeInt(list.size());
            Iterator<com.stripe.android.model.h> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            List<com.stripe.android.model.h> list2 = this.merchantPreferredNetworks;
            parcel.writeInt(list2.size());
            Iterator<com.stripe.android.model.h> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().name());
            }
            parcel.writeInt(this.shouldShowCvc ? 1 : 0);
            parcel.writeInt(this.shouldShowErrorIcon ? 1 : 0);
            parcel.writeInt(this.tintColor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(boolean z11, boolean z12, com.stripe.android.model.h brand, com.stripe.android.model.h hVar, List<? extends com.stripe.android.model.h> possibleBrands, List<? extends com.stripe.android.model.h> merchantPreferredNetworks, boolean z13, boolean z14, int i11) {
            p013kotlin.jvm.internal.s.k(brand, "brand");
            p013kotlin.jvm.internal.s.k(possibleBrands, "possibleBrands");
            p013kotlin.jvm.internal.s.k(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.isCbcEligible = z11;
            this.isLoading = z12;
            this.brand = brand;
            this.userSelectedBrand = hVar;
            this.possibleBrands = possibleBrands;
            this.merchantPreferredNetworks = merchantPreferredNetworks;
            this.shouldShowCvc = z13;
            this.shouldShowErrorIcon = z14;
            this.tintColor = i11;
        }

        public /* synthetic */ State(boolean z11, boolean z12, com.stripe.android.model.h hVar, com.stripe.android.model.h hVar2, List list, List list2, boolean z13, boolean z14, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? com.stripe.android.model.h.Unknown : hVar, (i12 & 8) != 0 ? null : hVar2, (i12 & 16) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 32) != 0 ? p013kotlin.collections.v.m() : list2, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? 0 : i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final Networks c() {
        String code;
        com.stripe.android.model.h brand = getBrand();
        if (brand == com.stripe.android.model.h.Unknown) {
            brand = null;
        }
        Networks networks = (brand == null || (code = brand.getCode()) == null) ? null : new Networks(code);
        if (!j() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return networks;
    }

    private final PaymentMethodCreateParams.Card.C0920c d() {
        if (getBrand() == com.stripe.android.model.h.Unknown) {
            return null;
        }
        PaymentMethodCreateParams.Card.C0920c c0920c = new PaymentMethodCreateParams.Card.C0920c(getBrand().getCode());
        if (!j() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return c0920c;
    }

    private final void f() {
        com.stripe.android.model.h hVarA = getState().e().size() > 1 ? v.a(getState().getUserSelectedBrand(), getState().e(), getState().d()) : getState().getBrand();
        if (getBrand() != hVarA) {
            setBrand(hVarA);
        }
        m();
    }

    private final State getState() {
        return this.stateFlow.getValue();
    }

    private final void h() {
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        u uVar = new u(context, getPossibleBrands(), getBrand());
        this.listPopup.setAdapter(uVar);
        this.listPopup.setModal(true);
        this.listPopup.setWidth(k(uVar));
        this.listPopup.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.x
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                CardBrandView.i(this.f55202a, adapterView, view, i11, j11);
            }
        });
        this.listPopup.setAnchorView(this.iconView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardBrandView this$0, AdapterView adapterView, View view, int i11, long j11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.r0(this$0.getPossibleBrands(), i11 - 1);
        if (hVar != null) {
            this$0.g(hVar);
        }
        this$0.listPopup.dismiss();
    }

    private final int k(u adapter) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        int iF = 0;
        for (int i11 = 0; i11 < count; i11++) {
            View view = adapter.getView(i11, null, this);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iF = bo0.n.f(iF, view.getMeasuredWidth());
        }
        return iF;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    private final void m() {
        int cvcIcon;
        Integer numValueOf;
        ImageView imageView = this.iconView;
        if (getShouldShowErrorIcon()) {
            cvcIcon = getState().getBrand().getErrorIcon();
        } else {
            cvcIcon = getShouldShowCvc() ? getState().getBrand().getCvcIcon() : getState().getBrand().getIcon();
        }
        imageView.setBackgroundResource(cvcIcon);
        if (getShouldShowErrorIcon()) {
            numValueOf = null;
        } else if (getShouldShowCvc()) {
            numValueOf = Integer.valueOf(getTintColorInt$payments_core_release());
        } else {
            numValueOf = Integer.valueOf(getTintColorInt$payments_core_release());
            if (getState().getBrand() != com.stripe.android.model.h.Unknown) {
                numValueOf = null;
            }
        }
        this.iconView.setColorFilter(numValueOf != null ? new PorterDuffColorFilter(numValueOf.intValue(), PorterDuff.Mode.LIGHTEN) : null);
    }

    private final void n() {
        if (!j() || getPossibleBrands().size() <= 1 || getShouldShowCvc() || getShouldShowErrorIcon()) {
            setOnClickListener(null);
            this.chevron.setVisibility(8);
        } else {
            h();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.o(this.f55186a, view);
                }
            });
            this.chevron.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CardBrandView this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (this$0.listPopup.isShowing()) {
            this$0.listPopup.dismiss();
        } else {
            this$0.listPopup.show();
        }
    }

    private final void setState(State state) {
        this.stateFlow.setValue(state);
    }

    public final Networks e() {
        String code;
        Networks networksC = c();
        if (networksC != null) {
            return networksC;
        }
        com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.q0(getMerchantPreferredNetworks());
        if (hVar == null) {
            return null;
        }
        if (hVar == com.stripe.android.model.h.Unknown) {
            hVar = null;
        }
        if (hVar == null || (code = hVar.getCode()) == null) {
            return null;
        }
        return new Networks(code);
    }

    public final void g(com.stripe.android.model.h brand) {
        if (brand == null) {
            return;
        }
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            com.stripe.android.model.h hVar = brand;
            if (mutableStateFlow.compareAndSet(value, State.b(value, false, false, null, hVar, null, null, false, false, 0, 503, null))) {
                f();
                return;
            }
            brand = hVar;
        }
    }

    public final com.stripe.android.model.h getBrand() {
        return getState().getBrand();
    }

    public final List<com.stripe.android.model.h> getMerchantPreferredNetworks() {
        return getState().d();
    }

    public final List<com.stripe.android.model.h> getPossibleBrands() {
        return getState().e();
    }

    public final boolean getShouldShowCvc() {
        return getState().getShouldShowCvc();
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().getShouldShowErrorIcon();
    }

    public final int getTintColorInt$payments_core_release() {
        return getState().getTintColor();
    }

    public final boolean j() {
        return getState().getIsCbcEligible();
    }

    public final PaymentMethodCreateParams.Card.C0920c l() {
        String code;
        PaymentMethodCreateParams.Card.C0920c c0920cD = d();
        if (c0920cD != null) {
            return c0920cD;
        }
        com.stripe.android.model.h hVar = (com.stripe.android.model.h) p013kotlin.collections.v.q0(getMerchantPreferredNetworks());
        if (hVar == null || (code = hVar.getCode()) == null) {
            return null;
        }
        return new PaymentMethodCreateParams.Card.C0920c(code);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        State state2;
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState == null || (state2 = savedState.getState()) == null) {
            state2 = new State(false, false, null, null, null, null, false, false, 0, 511, null);
        }
        setState(state2);
        f();
        n();
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getState());
    }

    public final void setBrand(com.stripe.android.model.h value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            com.stripe.android.model.h hVar = value;
            if (mutableStateFlow.compareAndSet(value2, State.b(value2, false, false, hVar, null, null, null, false, false, 0, 507, null))) {
                f();
                n();
                return;
            }
            value = hVar;
        }
    }

    public final void setCbcEligible(boolean z11) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z12 = z11;
            if (mutableStateFlow.compareAndSet(value, State.b(value, z12, false, null, null, null, null, false, false, 0, 510, null))) {
                n();
                return;
            }
            z11 = z12;
        }
    }

    public final void setMerchantPreferredNetworks(List<? extends com.stripe.android.model.h> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            List<? extends com.stripe.android.model.h> list = value;
            if (mutableStateFlow.compareAndSet(value2, State.b(value2, false, false, null, null, null, list, false, false, 0, 479, null))) {
                f();
                return;
            }
            value = list;
        }
    }

    public final void setPossibleBrands(List<? extends com.stripe.android.model.h> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            List<? extends com.stripe.android.model.h> list = value;
            if (mutableStateFlow.compareAndSet(value2, State.b(value2, false, false, null, null, list, null, false, false, 0, DownloaderService.STATUS_HTTP_DATA_ERROR, null))) {
                f();
                n();
                return;
            }
            value = list;
        }
    }

    public final void setShouldShowCvc(boolean z11) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z12 = z11;
            if (mutableStateFlow.compareAndSet(value, State.b(value, false, false, null, null, null, null, z12, false, 0, 447, null))) {
                m();
                return;
            }
            z11 = z12;
        }
    }

    public final void setShouldShowErrorIcon(boolean z11) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z12 = z11;
            if (mutableStateFlow.compareAndSet(value, State.b(value, false, false, null, null, null, null, false, z12, 0, 383, null))) {
                m();
                return;
            }
            z11 = z12;
        }
    }

    public final void setTintColorInt$payments_core_release(int i11) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            int i12 = i11;
            if (mutableStateFlow.compareAndSet(value, State.b(value, false, false, null, null, null, null, false, false, i12, 255, null))) {
                return;
            } else {
                i11 = i12;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        h40.j jVarB = h40.j.b(LayoutInflater.from(context), this);
        p013kotlin.jvm.internal.s.j(jVarB, "inflate(...)");
        this.viewBinding = jVarB;
        ImageView icon = jVarB.f70705c;
        p013kotlin.jvm.internal.s.j(icon, "icon");
        this.iconView = icon;
        ImageView chevron = jVarB.f70704b;
        p013kotlin.jvm.internal.s.j(chevron, "chevron");
        this.chevron = chevron;
        this.listPopup = new ListPopupWindow(context);
        this.stateFlow = StateFlowKt.MutableStateFlow(new State(false, false, null, null, null, null, false, false, 0, 511, null));
        setClickable(false);
        setFocusable(false);
        f();
        n();
    }
}
