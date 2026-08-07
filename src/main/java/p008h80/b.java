package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p027z70.d;
import t60.SupportedPaymentMethod;
import u70.FormFieldValues;
import w70.j;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u0005\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lh80/b;", "", "Lh80/b$b;", "viewAction", "Ljn0/h0;", "a", "(Lh80/b$b;)V", "close", "()V", "", "n", "()Z", "isLiveMode", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/b$a;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: h80.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b(\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lh80/b$a;", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "selectedPaymentMethodCode", "", "Lt60/g;", "supportedPaymentMethods", "Ly70/a;", "arguments", "Li90/d0;", "formElements", "Lw70/j;", "paymentSelection", "", "processing", "Lz70/d;", "usBankAccountFormArguments", "<init>", "(Ljava/lang/String;Ljava/util/List;Ly70/a;Ljava/util/List;Lw70/j;ZLz70/d;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ly70/a;Ljava/util/List;Lw70/j;ZLz70/d;)Lh80/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Ly70/a;", "()Ly70/a;", DateTokenConverter.CONVERTER_KEY, "e", "Lw70/j;", "getPaymentSelection", "()Lw70/j;", "Z", "()Z", "Lz70/d;", "h", "()Lz70/d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedPaymentMethodCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SupportedPaymentMethod> supportedPaymentMethods;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FormArguments arguments;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<d0> formElements;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final j paymentSelection;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean processing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final d usBankAccountFormArguments;

        /* JADX WARN: Multi-variable type inference failed */
        public State(String selectedPaymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormArguments arguments, List<? extends d0> formElements, j jVar, boolean z11, d usBankAccountFormArguments) {
            s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            s.k(supportedPaymentMethods, "supportedPaymentMethods");
            s.k(arguments, "arguments");
            s.k(formElements, "formElements");
            s.k(usBankAccountFormArguments, "usBankAccountFormArguments");
            this.selectedPaymentMethodCode = selectedPaymentMethodCode;
            this.supportedPaymentMethods = supportedPaymentMethods;
            this.arguments = arguments;
            this.formElements = formElements;
            this.paymentSelection = jVar;
            this.processing = z11;
            this.usBankAccountFormArguments = usBankAccountFormArguments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State b(State state, String str, List list, FormArguments formArguments, List list2, j jVar, boolean z11, d dVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = state.selectedPaymentMethodCode;
            }
            if ((i11 & 2) != 0) {
                list = state.supportedPaymentMethods;
            }
            if ((i11 & 4) != 0) {
                formArguments = state.arguments;
            }
            if ((i11 & 8) != 0) {
                list2 = state.formElements;
            }
            if ((i11 & 16) != 0) {
                jVar = state.paymentSelection;
            }
            if ((i11 & 32) != 0) {
                z11 = state.processing;
            }
            if ((i11 & 64) != 0) {
                dVar = state.usBankAccountFormArguments;
            }
            boolean z12 = z11;
            d dVar2 = dVar;
            j jVar2 = jVar;
            FormArguments formArguments2 = formArguments;
            return state.a(str, list, formArguments2, list2, jVar2, z12, dVar2);
        }

        public final State a(String selectedPaymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormArguments arguments, List<? extends d0> formElements, j paymentSelection, boolean processing, d usBankAccountFormArguments) {
            s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            s.k(supportedPaymentMethods, "supportedPaymentMethods");
            s.k(arguments, "arguments");
            s.k(formElements, "formElements");
            s.k(usBankAccountFormArguments, "usBankAccountFormArguments");
            return new State(selectedPaymentMethodCode, supportedPaymentMethods, arguments, formElements, paymentSelection, processing, usBankAccountFormArguments);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final FormArguments getArguments() {
            return this.arguments;
        }

        public final List<d0> d() {
            return this.formElements;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getProcessing() {
            return this.processing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return s.f(this.selectedPaymentMethodCode, state.selectedPaymentMethodCode) && s.f(this.supportedPaymentMethods, state.supportedPaymentMethods) && s.f(this.arguments, state.arguments) && s.f(this.formElements, state.formElements) && s.f(this.paymentSelection, state.paymentSelection) && this.processing == state.processing && s.f(this.usBankAccountFormArguments, state.usBankAccountFormArguments);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSelectedPaymentMethodCode() {
            return this.selectedPaymentMethodCode;
        }

        public final List<SupportedPaymentMethod> g() {
            return this.supportedPaymentMethods;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final d getUsBankAccountFormArguments() {
            return this.usBankAccountFormArguments;
        }

        public int hashCode() {
            int iHashCode = ((((((this.selectedPaymentMethodCode.hashCode() * 31) + this.supportedPaymentMethods.hashCode()) * 31) + this.arguments.hashCode()) * 31) + this.formElements.hashCode()) * 31;
            j jVar = this.paymentSelection;
            return ((((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + Boolean.hashCode(this.processing)) * 31) + this.usBankAccountFormArguments.hashCode();
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.selectedPaymentMethodCode + ", supportedPaymentMethods=" + this.supportedPaymentMethods + ", arguments=" + this.arguments + ", formElements=" + this.formElements + ", paymentSelection=" + this.paymentSelection + ", processing=" + this.processing + ", usBankAccountFormArguments=" + this.usBankAccountFormArguments + ")";
        }
    }

    /* JADX INFO: renamed from: h80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lh80/b$b;", "", "<init>", "()V", "a", "b", "c", "Lh80/b$b$a;", "Lh80/b$b$b;", "Lh80/b$b$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractC1489b {

        /* JADX INFO: renamed from: h80.b$b$a, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lh80/b$b$a;", "Lh80/b$b;", "Lu70/c;", "formValues", "", "Lcom/stripe/android/model/PaymentMethodCode;", "selectedPaymentMethodCode", "<init>", "(Lu70/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu70/c;", "()Lu70/c;", "b", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnFormFieldValuesChanged extends AbstractC1489b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormFieldValues formValues;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selectedPaymentMethodCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFormFieldValuesChanged(FormFieldValues formFieldValues, String selectedPaymentMethodCode) {
                super(null);
                s.k(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.formValues = formFieldValues;
                this.selectedPaymentMethodCode = selectedPaymentMethodCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FormFieldValues getFormValues() {
                return this.formValues;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSelectedPaymentMethodCode() {
                return this.selectedPaymentMethodCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnFormFieldValuesChanged)) {
                    return false;
                }
                OnFormFieldValuesChanged onFormFieldValuesChanged = (OnFormFieldValuesChanged) other;
                return s.f(this.formValues, onFormFieldValuesChanged.formValues) && s.f(this.selectedPaymentMethodCode, onFormFieldValuesChanged.selectedPaymentMethodCode);
            }

            public int hashCode() {
                FormFieldValues formFieldValues = this.formValues;
                return ((formFieldValues == null ? 0 : formFieldValues.hashCode()) * 31) + this.selectedPaymentMethodCode.hashCode();
            }

            public String toString() {
                return "OnFormFieldValuesChanged(formValues=" + this.formValues + ", selectedPaymentMethodCode=" + this.selectedPaymentMethodCode + ")";
            }
        }

        /* JADX INFO: renamed from: h80.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lh80/b$b$b;", "Lh80/b$b;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnPaymentMethodSelected extends AbstractC1489b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String code;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPaymentMethodSelected(String code) {
                super(null);
                s.k(code, "code");
                this.code = code;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnPaymentMethodSelected) && s.f(this.code, ((OnPaymentMethodSelected) other).code);
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return "OnPaymentMethodSelected(code=" + this.code + ")";
            }
        }

        /* JADX INFO: renamed from: h80.b$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lh80/b$b$c;", "Lh80/b$b;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ReportFieldInteraction extends AbstractC1489b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String code;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReportFieldInteraction(String code) {
                super(null);
                s.k(code, "code");
                this.code = code;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReportFieldInteraction) && s.f(this.code, ((ReportFieldInteraction) other).code);
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return "ReportFieldInteraction(code=" + this.code + ")";
            }
        }

        public /* synthetic */ AbstractC1489b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1489b() {
        }
    }

    void a(AbstractC1489b viewAction);

    void close();

    StateFlow<State> getState();

    boolean n();
}
