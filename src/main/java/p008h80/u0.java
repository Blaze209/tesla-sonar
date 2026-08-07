package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.t;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u0005\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lh80/u0;", "", "Lh80/u0$b;", "viewAction", "Ljn0/h0;", "a", "(Lh80/u0$b;)V", "close", "()V", "", "n", "()Z", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/u0$a;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface u0 {

    /* JADX INFO: renamed from: h80.u0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJT\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lh80/u0$a;", "", "", "Lcom/stripe/android/paymentsheet/t;", "paymentOptionsItems", "selectedPaymentOptionsItem", "", "isEditing", "isProcessing", "canEdit", "canRemove", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/t;ZZZZ)V", "a", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/t;ZZZZ)Lh80/u0$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "Lcom/stripe/android/paymentsheet/t;", "e", "()Lcom/stripe/android/paymentsheet/t;", "c", "Z", "f", "()Z", "g", "getCanRemove", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<t> paymentOptionsItems;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t selectedPaymentOptionsItem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditing;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canEdit;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemove;

        /* JADX WARN: Multi-variable type inference failed */
        public State(List<? extends t> paymentOptionsItems, t tVar, boolean z11, boolean z12, boolean z13, boolean z14) {
            s.k(paymentOptionsItems, "paymentOptionsItems");
            this.paymentOptionsItems = paymentOptionsItems;
            this.selectedPaymentOptionsItem = tVar;
            this.isEditing = z11;
            this.isProcessing = z12;
            this.canEdit = z13;
            this.canRemove = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State b(State state, List list, t tVar, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = state.paymentOptionsItems;
            }
            if ((i11 & 2) != 0) {
                tVar = state.selectedPaymentOptionsItem;
            }
            if ((i11 & 4) != 0) {
                z11 = state.isEditing;
            }
            if ((i11 & 8) != 0) {
                z12 = state.isProcessing;
            }
            if ((i11 & 16) != 0) {
                z13 = state.canEdit;
            }
            if ((i11 & 32) != 0) {
                z14 = state.canRemove;
            }
            boolean z15 = z13;
            boolean z16 = z14;
            return state.a(list, tVar, z11, z12, z15, z16);
        }

        public final State a(List<? extends t> paymentOptionsItems, t selectedPaymentOptionsItem, boolean isEditing, boolean isProcessing, boolean canEdit, boolean canRemove) {
            s.k(paymentOptionsItems, "paymentOptionsItems");
            return new State(paymentOptionsItems, selectedPaymentOptionsItem, isEditing, isProcessing, canEdit, canRemove);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final List<t> d() {
            return this.paymentOptionsItems;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final t getSelectedPaymentOptionsItem() {
            return this.selectedPaymentOptionsItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return s.f(this.paymentOptionsItems, state.paymentOptionsItems) && s.f(this.selectedPaymentOptionsItem, state.selectedPaymentOptionsItem) && this.isEditing == state.isEditing && this.isProcessing == state.isProcessing && this.canEdit == state.canEdit && this.canRemove == state.canRemove;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        public int hashCode() {
            int iHashCode = this.paymentOptionsItems.hashCode() * 31;
            t tVar = this.selectedPaymentOptionsItem;
            return ((((((((iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.isProcessing)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.canRemove);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.paymentOptionsItems + ", selectedPaymentOptionsItem=" + this.selectedPaymentOptionsItem + ", isEditing=" + this.isEditing + ", isProcessing=" + this.isProcessing + ", canEdit=" + this.canEdit + ", canRemove=" + this.canRemove + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lh80/u0$b;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lh80/u0$b$a;", "Lh80/u0$b$b;", "Lh80/u0$b$c;", "Lh80/u0$b$d;", "Lh80/u0$b$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh80/u0$b$a;", "Lh80/u0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f71583a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 792087598;
            }

            public String toString() {
                return "AddCardPressed";
            }
        }

        /* JADX INFO: renamed from: h80.u0$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/u0$b$b;", "Lh80/u0$b;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeletePaymentMethod extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f71584b = PaymentMethod.f51534u;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeletePaymentMethod(PaymentMethod paymentMethod) {
                super(null);
                s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeletePaymentMethod) && s.f(this.paymentMethod, ((DeletePaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        /* JADX INFO: renamed from: h80.u0$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/u0$b$c;", "Lh80/u0$b;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/v0;", "()Lcom/stripe/android/model/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EditPaymentMethod extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f71586b = PaymentMethod.f51534u;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EditPaymentMethod(PaymentMethod paymentMethod) {
                super(null);
                s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditPaymentMethod) && s.f(this.paymentMethod, ((EditPaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        /* JADX INFO: renamed from: h80.u0$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/u0$b$d;", "Lh80/u0$b;", "Lw70/j;", "selection", "<init>", "(Lw70/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw70/j;", "()Lw70/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectPaymentMethod extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final j selection;

            public SelectPaymentMethod(j jVar) {
                super(null);
                this.selection = jVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final j getSelection() {
                return this.selection;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectPaymentMethod) && s.f(this.selection, ((SelectPaymentMethod) other).selection);
            }

            public int hashCode() {
                j jVar = this.selection;
                if (jVar == null) {
                    return 0;
                }
                return jVar.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.selection + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh80/u0$b$e;", "Lh80/u0$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f71589a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 2007142043;
            }

            public String toString() {
                return "ToggleEdit";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    void a(b viewAction);

    void close();

    StateFlow<State> getState();

    boolean n();
}
