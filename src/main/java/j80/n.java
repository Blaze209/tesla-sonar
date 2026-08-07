package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n70.DisplayableSavedPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0003\u0010\u0005\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lj80/n;", "", "Lj80/n$c;", "viewAction", "Ljn0/h0;", "b", "(Lj80/n$c;)V", "", "n", "()Z", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "Lj80/n$b;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "a", "showsWalletsHeader", "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lj80/n$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "EDIT_CARD_BRAND", "MANAGE_ONE", "MANAGE_ALL", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        NONE,
        EDIT_CARD_BRAND,
        MANAGE_ONE,
        MANAGE_ALL;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: j80.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lj80/n$b;", "", "", "Lj80/e;", "displayablePaymentMethods", "", "isProcessing", "Lw70/j;", "selection", "Ln70/g;", "displayedSavedPaymentMethod", "Lj80/n$a;", "availableSavedPaymentMethodAction", "<init>", "(Ljava/util/List;ZLw70/j;Ln70/g;Lj80/n$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "e", "()Z", "c", "Lw70/j;", DateTokenConverter.CONVERTER_KEY, "()Lw70/j;", "Ln70/g;", "()Ln70/g;", "Lj80/n$a;", "()Lj80/n$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DisplayablePaymentMethod> displayablePaymentMethods;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j selection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DisplayableSavedPaymentMethod displayedSavedPaymentMethod;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final a availableSavedPaymentMethodAction;

        public State(List<DisplayablePaymentMethod> displayablePaymentMethods, boolean z11, w70.j jVar, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, a availableSavedPaymentMethodAction) {
            p013kotlin.jvm.internal.s.k(displayablePaymentMethods, "displayablePaymentMethods");
            p013kotlin.jvm.internal.s.k(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
            this.displayablePaymentMethods = displayablePaymentMethods;
            this.isProcessing = z11;
            this.selection = jVar;
            this.displayedSavedPaymentMethod = displayableSavedPaymentMethod;
            this.availableSavedPaymentMethodAction = availableSavedPaymentMethodAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAvailableSavedPaymentMethodAction() {
            return this.availableSavedPaymentMethodAction;
        }

        public final List<DisplayablePaymentMethod> b() {
            return this.displayablePaymentMethods;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DisplayableSavedPaymentMethod getDisplayedSavedPaymentMethod() {
            return this.displayedSavedPaymentMethod;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final w70.j getSelection() {
            return this.selection;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return p013kotlin.jvm.internal.s.f(this.displayablePaymentMethods, state.displayablePaymentMethods) && this.isProcessing == state.isProcessing && p013kotlin.jvm.internal.s.f(this.selection, state.selection) && p013kotlin.jvm.internal.s.f(this.displayedSavedPaymentMethod, state.displayedSavedPaymentMethod) && this.availableSavedPaymentMethodAction == state.availableSavedPaymentMethodAction;
        }

        public int hashCode() {
            int iHashCode = ((this.displayablePaymentMethods.hashCode() * 31) + Boolean.hashCode(this.isProcessing)) * 31;
            w70.j jVar = this.selection;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            DisplayableSavedPaymentMethod displayableSavedPaymentMethod = this.displayedSavedPaymentMethod;
            return ((iHashCode2 + (displayableSavedPaymentMethod != null ? displayableSavedPaymentMethod.hashCode() : 0)) * 31) + this.availableSavedPaymentMethodAction.hashCode();
        }

        public String toString() {
            return "State(displayablePaymentMethods=" + this.displayablePaymentMethods + ", isProcessing=" + this.isProcessing + ", selection=" + this.selection + ", displayedSavedPaymentMethod=" + this.displayedSavedPaymentMethod + ", availableSavedPaymentMethodAction=" + this.availableSavedPaymentMethodAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lj80/n$c;", "", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lj80/n$c$a;", "Lj80/n$c$b;", "Lj80/n$c$c;", "Lj80/n$c$d;", "Lj80/n$c$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: j80.n$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/n$c$a;", "Lj80/n$c;", "Ln70/g;", "savedPaymentMethod", "<init>", "(Ln70/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/g;", "()Ln70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EditPaymentMethod implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DisplayableSavedPaymentMethod savedPaymentMethod;

            public EditPaymentMethod(DisplayableSavedPaymentMethod savedPaymentMethod) {
                p013kotlin.jvm.internal.s.k(savedPaymentMethod, "savedPaymentMethod");
                this.savedPaymentMethod = savedPaymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DisplayableSavedPaymentMethod getSavedPaymentMethod() {
                return this.savedPaymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditPaymentMethod) && p013kotlin.jvm.internal.s.f(this.savedPaymentMethod, ((EditPaymentMethod) other).savedPaymentMethod);
            }

            public int hashCode() {
                return this.savedPaymentMethod.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(savedPaymentMethod=" + this.savedPaymentMethod + ")";
            }
        }

        /* JADX INFO: renamed from: j80.n$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lj80/n$c$b;", "Lj80/n$c;", "", "selectedPaymentMethodCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentMethodSelected implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selectedPaymentMethodCode;

            public PaymentMethodSelected(String selectedPaymentMethodCode) {
                p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.selectedPaymentMethodCode = selectedPaymentMethodCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getSelectedPaymentMethodCode() {
                return this.selectedPaymentMethodCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentMethodSelected) && p013kotlin.jvm.internal.s.f(this.selectedPaymentMethodCode, ((PaymentMethodSelected) other).selectedPaymentMethodCode);
            }

            public int hashCode() {
                return this.selectedPaymentMethodCode.hashCode();
            }

            public String toString() {
                return "PaymentMethodSelected(selectedPaymentMethodCode=" + this.selectedPaymentMethodCode + ")";
            }
        }

        /* JADX INFO: renamed from: j80.n$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/n$c$c;", "Lj80/n$c;", "Lcom/stripe/android/model/v0;", "savedPaymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SavedPaymentMethodSelected implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f83039b = PaymentMethod.f51534u;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod savedPaymentMethod;

            public SavedPaymentMethodSelected(PaymentMethod savedPaymentMethod) {
                p013kotlin.jvm.internal.s.k(savedPaymentMethod, "savedPaymentMethod");
                this.savedPaymentMethod = savedPaymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethod getSavedPaymentMethod() {
                return this.savedPaymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SavedPaymentMethodSelected) && p013kotlin.jvm.internal.s.f(this.savedPaymentMethod, ((SavedPaymentMethodSelected) other).savedPaymentMethod);
            }

            public int hashCode() {
                return this.savedPaymentMethod.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.savedPaymentMethod + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/n$c$d;", "Lj80/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f83041a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1370197407;
            }

            public String toString() {
                return "TransitionToManageOneSavedPaymentMethod";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/n$c$e;", "Lj80/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f83042a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1332425524;
            }

            public String toString() {
                return "TransitionToManageSavedPaymentMethods";
            }
        }
    }

    StateFlow<Boolean> a();

    void b(c viewAction);

    StateFlow<State> getState();

    boolean n();
}
