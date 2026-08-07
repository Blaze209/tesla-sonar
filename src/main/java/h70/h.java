package h70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import java.util.Map;
import java.util.Set;
import jn0.x;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import r30.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \n2\u00020\u0001:\u0005\n\f\r\u000e\u000fJ9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lh70/h;", "Lr30/n;", "Lh70/h$c;", "errorEvent", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "", "", "additionalNonPiiParams", "Ljn0/h0;", "a", "(Lh70/h$c;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f70983a;

    /* JADX INFO: renamed from: h70.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh70/h$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "productUsage", "Lh70/h;", "a", "(Landroid/content/Context;Ljava/util/Set;)Lh70/h;", "", AnalyticsAttribute.Error, "", "c", "(Ljava/lang/Throwable;)Ljava/util/Map;", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f70983a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ h b(Companion companion, Context context, Set set, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                set = d1.d();
            }
            return companion.a(context, set);
        }

        public final h a(Context context, Set<String> productUsage) {
            s.k(context, "context");
            s.k(productUsage, "productUsage");
            h70.c.a aVarA = a.a();
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            return aVarA.a(applicationContext).b(productUsage).build().a();
        }

        public final Map<String, String> c(Throwable error) {
            s.k(error, "error");
            return error instanceof StripeException ? d((StripeException) error) : d(StripeException.INSTANCE.b(error));
        }

        public final Map<String, String> d(StripeException stripeException) {
            s.k(stripeException, "stripeException");
            Integer numValueOf = stripeException.getStatusCode() == 0 ? null : Integer.valueOf(stripeException.getStatusCode());
            Pair pairA = x.a("analytics_value", stripeException.a());
            Pair pairA2 = x.a("status_code", numValueOf != null ? numValueOf.toString() : null);
            Pair pairA3 = x.a("request_id", stripeException.getRequestId());
            StripeError stripeErrorD = stripeException.getStripeError();
            Pair pairA4 = x.a("error_type", stripeErrorD != null ? stripeErrorD.getType() : null);
            StripeError stripeErrorD2 = stripeException.getStripeError();
            return s90.b.a(v0.m(pairA, pairA2, pairA3, pairA4, x.a("error_code", stripeErrorD2 != null ? stripeErrorD2.getCode() : null)));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(h hVar, c cVar, StripeException stripeException, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
            }
            if ((i11 & 2) != 0) {
                stripeException = null;
            }
            if ((i11 & 4) != 0) {
                map = v0.i();
            }
            hVar.a(cVar, stripeException, map);
        }

        public static void b(h hVar, StripeException error) {
            s.k(error, "error");
            a(hVar, d.FRAUD_DETECTION_API_FAILURE, error, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh70/h$c;", "Lw30/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends w30.a {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lh70/h$d;", "", "Lh70/h$c;", "", "eventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "AUTH_WEB_VIEW_FAILURE", "AUTH_WEB_VIEW_NULL_ARGS", "GET_SAVED_PAYMENT_METHODS_FAILURE", "GOOGLE_PAY_IS_READY_API_CALL", "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", "CUSTOMER_SHEET_ADAPTER_NOT_FOUND", "PLACES_FIND_AUTOCOMPLETE_ERROR", "PLACES_FETCH_PLACE_ERROR", "LINK_CREATE_CARD_FAILURE", "LINK_SHARE_CARD_FAILURE", "LINK_LOG_OUT_FAILURE", "PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", "BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", "BROWSER_LAUNCHER_NULL_ARGS", "GOOGLE_PAY_FAILED", "FRAUD_DETECTION_API_FAILURE", "EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", "EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum d implements c {
        AUTH_WEB_VIEW_FAILURE("payments.auth_web_view.failure"),
        AUTH_WEB_VIEW_NULL_ARGS("payments.auth_web_view.null_args"),
        GET_SAVED_PAYMENT_METHODS_FAILURE("elements.customer_repository.get_saved_payment_methods_failure"),
        GOOGLE_PAY_IS_READY_API_CALL("elements.google_pay_repository.is_ready_request_api_call_failure"),
        CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.elements_session.load_failure"),
        CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE("elements.customer_sheet.customer_session.elements_session.load_failure"),
        CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE("elements.customer_sheet.payment_methods.load_failure"),
        CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE("elements.customer_sheet.payment_methods.refresh_failure"),
        CUSTOMER_SHEET_ADAPTER_NOT_FOUND("elements.customer_sheet.customer_adapter.not_found"),
        PLACES_FIND_AUTOCOMPLETE_ERROR("address_element.find_autocomplete.error"),
        PLACES_FETCH_PLACE_ERROR("address_element.fetch_place.error"),
        LINK_CREATE_CARD_FAILURE("link.create_new_card.create_payment_details_failure"),
        LINK_SHARE_CARD_FAILURE("link.create_new_card.share_payment_details_failure"),
        LINK_LOG_OUT_FAILURE("link.log_out.failure"),
        PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS("payments.paymentlauncherconfirmation.null_args"),
        BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND("payments.browserlauncher.activity_not_found"),
        BROWSER_LAUNCHER_NULL_ARGS("payments.browserlauncher.null_args"),
        GOOGLE_PAY_FAILED("google_pay.confirm.error"),
        FRAUD_DETECTION_API_FAILURE("fraud_detection_data_repository.api_failure"),
        EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL("paymentsheet.external_payment_method.confirm_handler_is_null"),
        EXTERNAL_PAYMENT_METHOD_LAUNCHER_NULL("paymentsheet.external_payment_method.launcher_is_null");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String eventName;

        d(String str) {
            this.eventName = str;
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lh70/h$e;", "", "Lh70/h$c;", "", "eventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS", "CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS", "CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS", "GET_SAVED_PAYMENT_METHODS_SUCCESS", "PLACES_FIND_AUTOCOMPLETE_SUCCESS", "PLACES_FETCH_PLACE_SUCCESS", "LINK_CREATE_CARD_SUCCESS", "LINK_LOG_OUT_SUCCESS", "CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS", "EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum e implements c {
        CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS("elements.customer_sheet.elements_session.load_success"),
        CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS("elements.customer_sheet.customer_session.elements_session.load_success"),
        CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS("elements.customer_sheet.payment_methods.load_success"),
        GET_SAVED_PAYMENT_METHODS_SUCCESS("elements.customer_repository.get_saved_payment_methods_success"),
        PLACES_FIND_AUTOCOMPLETE_SUCCESS("address_element.find_autocomplete.success"),
        PLACES_FETCH_PLACE_SUCCESS("address_element.fetch_place.success"),
        LINK_CREATE_CARD_SUCCESS("link.create_new_card.success"),
        LINK_LOG_OUT_SUCCESS("link.log_out.success"),
        CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS("elements.customer_sheet.payment_methods.refresh_success"),
        EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS("paymentsheet.external_payment_method.launch_success");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String eventName;

        e(String str) {
            this.eventName = str;
        }

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lh70/h$f;", "", "Lh70/h$c;", "", "partialEventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getPartialEventName", "()Ljava/lang/String;", "getEventName", "eventName", "AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", "MISSING_CARDSCAN_DEPENDENCY", "MISSING_HOSTED_VOUCHER_URL", "MISSING_POLLING_AUTHENTICATOR", "LINK_INVALID_SESSION_STATE", "GOOGLE_PAY_JSON_REQUEST_PARSING", "GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", "GOOGLE_PAY_MISSING_INTENT_DATA", "FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", "FETCH_PLACE_WITHOUT_DEPENDENCY", "LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", "PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", "PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", "EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", "PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", "PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", "INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", "EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", "CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION", "CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION", "CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum f implements c {
        AUTH_WEB_VIEW_BLANK_CLIENT_SECRET("payments.auth_web_view.blank_client_secret"),
        MISSING_CARDSCAN_DEPENDENCY("cardscan.missing_dependency"),
        MISSING_HOSTED_VOUCHER_URL("payments.missing_hosted_voucher_url"),
        MISSING_POLLING_AUTHENTICATOR("payments.missing_polling_authenticator"),
        LINK_INVALID_SESSION_STATE("link.signup.failure.invalidSessionState"),
        GOOGLE_PAY_JSON_REQUEST_PARSING("google_pay_repository.is_ready_request_json_parsing_failure"),
        GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT("google_pay.confirm.unexpected_result"),
        GOOGLE_PAY_MISSING_INTENT_DATA("google_pay.on_result.missing_data"),
        FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY("address_element.find_autocomplete.without_dependency"),
        FETCH_PLACE_WITHOUT_DEPENDENCY("address_element.fetch_place.without_dependency"),
        LINK_ATTACH_CARD_WITH_NULL_ACCOUNT("link.create_new_card.missing_link_account"),
        PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND("paymentsheet.authenticators.not_found"),
        PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND("paymentsheet.loader.elements_session.customer.not_found"),
        EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE("elements.external_payment_methods_serializer.error"),
        PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT("paymentsheet.no_payment_selection"),
        PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT("paymentsheet.invalid_payment_selection"),
        FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT("flow_controller.invalid_payment_selection"),
        INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION("intent_confirmation_handler.invalid_payment_confirmation_option"),
        EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE("paymentsheet.external_payment_method.unexpected_result_code"),
        CVC_RECOLLECTION_UNEXPECTED_PAYMENT_SELECTION("payments.cvc_recollection_unexpected_payment_selection"),
        CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION("customersheet.customer_session.attach_called"),
        CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD("customersheet.customer_session.elements_session.no_customer_field");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String partialEventName;

        f(String str) {
            this.partialEventName = str;
        }

        public static EnumEntries<f> getEntries() {
            return $ENTRIES;
        }

        @Override // w30.a
        public String getEventName() {
            return "unexpected_error." + this.partialEventName;
        }

        public final String getPartialEventName() {
            return this.partialEventName;
        }
    }

    void a(c errorEvent, StripeException stripeException, Map<String, String> additionalNonPiiParams);
}
