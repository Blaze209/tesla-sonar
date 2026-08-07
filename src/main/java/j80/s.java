package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.d0;
import p013kotlin.Metadata;
import s60.FormHeaderInformation;
import u70.FormFieldValues;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\b\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lj80/s;", "", "Lj80/s$b;", "viewAction", "Ljn0/h0;", "b", "(Lj80/s$b;)V", "", "a", "()Z", "close", "()V", "n", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "Lj80/s$a;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface s {

    /* JADX INFO: renamed from: j80.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u001c\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b \u0010)¨\u0006*"}, d2 = {"Lj80/s$a;", "", "", "selectedPaymentMethodCode", "", "isProcessing", "Lz70/d;", "usBankAccountFormArguments", "Ly70/a;", "formArguments", "", "Li90/d0;", "formElements", "Ls60/a;", "headerInformation", "<init>", "(Ljava/lang/String;ZLz70/d;Ly70/a;Ljava/util/List;Ls60/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Z", "f", "()Z", "c", "Lz70/d;", "e", "()Lz70/d;", "Ly70/a;", "()Ly70/a;", "Ljava/util/List;", "()Ljava/util/List;", "Ls60/a;", "()Ls60/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedPaymentMethodCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProcessing;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p027z70.d usBankAccountFormArguments;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormArguments formArguments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> formElements;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormHeaderInformation headerInformation;

        /* JADX WARN: Multi-variable type inference failed */
        public State(String selectedPaymentMethodCode, boolean z11, p027z70.d usBankAccountFormArguments, FormArguments formArguments, List<? extends d0> formElements, FormHeaderInformation formHeaderInformation) {
            p013kotlin.jvm.internal.s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            p013kotlin.jvm.internal.s.k(usBankAccountFormArguments, "usBankAccountFormArguments");
            p013kotlin.jvm.internal.s.k(formArguments, "formArguments");
            p013kotlin.jvm.internal.s.k(formElements, "formElements");
            this.selectedPaymentMethodCode = selectedPaymentMethodCode;
            this.isProcessing = z11;
            this.usBankAccountFormArguments = usBankAccountFormArguments;
            this.formArguments = formArguments;
            this.formElements = formElements;
            this.headerInformation = formHeaderInformation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FormArguments getFormArguments() {
            return this.formArguments;
        }

        public final List<d0> b() {
            return this.formElements;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FormHeaderInformation getHeaderInformation() {
            return this.headerInformation;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedPaymentMethodCode() {
            return this.selectedPaymentMethodCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final p027z70.d getUsBankAccountFormArguments() {
            return this.usBankAccountFormArguments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return p013kotlin.jvm.internal.s.f(this.selectedPaymentMethodCode, state.selectedPaymentMethodCode) && this.isProcessing == state.isProcessing && p013kotlin.jvm.internal.s.f(this.usBankAccountFormArguments, state.usBankAccountFormArguments) && p013kotlin.jvm.internal.s.f(this.formArguments, state.formArguments) && p013kotlin.jvm.internal.s.f(this.formElements, state.formElements) && p013kotlin.jvm.internal.s.f(this.headerInformation, state.headerInformation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.selectedPaymentMethodCode.hashCode() * 31) + Boolean.hashCode(this.isProcessing)) * 31) + this.usBankAccountFormArguments.hashCode()) * 31) + this.formArguments.hashCode()) * 31) + this.formElements.hashCode()) * 31;
            FormHeaderInformation formHeaderInformation = this.headerInformation;
            return iHashCode + (formHeaderInformation == null ? 0 : formHeaderInformation.hashCode());
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.selectedPaymentMethodCode + ", isProcessing=" + this.isProcessing + ", usBankAccountFormArguments=" + this.usBankAccountFormArguments + ", formArguments=" + this.formArguments + ", formElements=" + this.formElements + ", headerInformation=" + this.headerInformation + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lj80/s$b;", "", "a", "b", "Lj80/s$b$a;", "Lj80/s$b$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj80/s$b$a;", "Lj80/s$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f83105a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1206182106;
            }

            public String toString() {
                return "FieldInteraction";
            }
        }

        /* JADX INFO: renamed from: j80.s$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj80/s$b$b;", "Lj80/s$b;", "Lu70/c;", "formValues", "<init>", "(Lu70/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu70/c;", "()Lu70/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FormFieldValuesChanged implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormFieldValues formValues;

            public FormFieldValuesChanged(FormFieldValues formFieldValues) {
                this.formValues = formFieldValues;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FormFieldValues getFormValues() {
                return this.formValues;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FormFieldValuesChanged) && p013kotlin.jvm.internal.s.f(this.formValues, ((FormFieldValuesChanged) other).formValues);
            }

            public int hashCode() {
                FormFieldValues formFieldValues = this.formValues;
                if (formFieldValues == null) {
                    return 0;
                }
                return formFieldValues.hashCode();
            }

            public String toString() {
                return "FormFieldValuesChanged(formValues=" + this.formValues + ")";
            }
        }
    }

    boolean a();

    void b(b viewAction);

    void close();

    StateFlow<State> getState();

    boolean n();
}
