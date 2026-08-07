package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n70.DisplayableSavedPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u0005\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lj80/i;", "", "Lj80/i$b;", "viewAction", "Ljn0/h0;", "a", "(Lj80/i$b;)V", "close", "()V", "", "n", "()Z", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "Lj80/i$a;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: j80.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lj80/i$a;", "", "", "Ln70/g;", "paymentMethods", "currentSelection", "", "isEditing", "canRemove", "canEdit", "<init>", "(Ljava/util/List;Ln70/g;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "Ln70/g;", "c", "()Ln70/g;", "Z", "e", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DisplayableSavedPaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DisplayableSavedPaymentMethod currentSelection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditing;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canRemove;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canEdit;

        public State(List<DisplayableSavedPaymentMethod> paymentMethods, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z11, boolean z12, boolean z13) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            this.paymentMethods = paymentMethods;
            this.currentSelection = displayableSavedPaymentMethod;
            this.isEditing = z11;
            this.canRemove = z12;
            this.canEdit = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCanRemove() {
            return this.canRemove;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DisplayableSavedPaymentMethod getCurrentSelection() {
            return this.currentSelection;
        }

        public final List<DisplayableSavedPaymentMethod> d() {
            return this.paymentMethods;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return p013kotlin.jvm.internal.s.f(this.paymentMethods, state.paymentMethods) && p013kotlin.jvm.internal.s.f(this.currentSelection, state.currentSelection) && this.isEditing == state.isEditing && this.canRemove == state.canRemove && this.canEdit == state.canEdit;
        }

        public int hashCode() {
            int iHashCode = this.paymentMethods.hashCode() * 31;
            DisplayableSavedPaymentMethod displayableSavedPaymentMethod = this.currentSelection;
            return ((((((iHashCode + (displayableSavedPaymentMethod == null ? 0 : displayableSavedPaymentMethod.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.canRemove)) * 31) + Boolean.hashCode(this.canEdit);
        }

        public String toString() {
            return "State(paymentMethods=" + this.paymentMethods + ", currentSelection=" + this.currentSelection + ", isEditing=" + this.isEditing + ", canRemove=" + this.canRemove + ", canEdit=" + this.canEdit + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lj80/i$b;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lj80/i$b$a;", "Lj80/i$b$b;", "Lj80/i$b$c;", "Lj80/i$b$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: j80.i$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/i$b$a;", "Lj80/i$b;", "Ln70/g;", "paymentMethod", "<init>", "(Ln70/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/g;", "()Ln70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeletePaymentMethod extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DisplayableSavedPaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeletePaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeletePaymentMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethod, ((DeletePaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        /* JADX INFO: renamed from: j80.i$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/i$b$b;", "Lj80/i$b;", "Ln70/g;", "paymentMethod", "<init>", "(Ln70/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/g;", "()Ln70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EditPaymentMethod extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DisplayableSavedPaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EditPaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditPaymentMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethod, ((EditPaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        /* JADX INFO: renamed from: j80.i$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/i$b$c;", "Lj80/i$b;", "Ln70/g;", "paymentMethod", "<init>", "(Ln70/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/g;", "()Ln70/g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectPaymentMethod extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DisplayableSavedPaymentMethod paymentMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectPaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                p013kotlin.jvm.internal.s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectPaymentMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethod, ((SelectPaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/i$b$d;", "Lj80/i$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f82957a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1354134144;
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
