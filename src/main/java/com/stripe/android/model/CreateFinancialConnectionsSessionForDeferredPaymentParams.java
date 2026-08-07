package com.stripe.android.model;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.x, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b%\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0001\u0013Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u0016¨\u00067"}, d2 = {"Lcom/stripe/android/model/x;", "", "", "uniqueId", "initialInstitution", "", "manualEntryOnly", "searchSession", "Lcom/stripe/android/model/s1;", "verificationMethod", "hostedSurface", "customer", "onBehalfOf", "", "amount", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/s1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "a", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUniqueId", "b", "getInitialInstitution", "c", "Ljava/lang/Boolean;", "getManualEntryOnly", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "getSearchSession", "e", "Lcom/stripe/android/model/s1;", "getVerificationMethod", "()Lcom/stripe/android/model/s1;", "f", "getHostedSurface", "g", "getCustomer", "h", "getOnBehalfOf", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "getAmount", "()Ljava/lang/Integer;", "j", "getCurrency", "k", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CreateFinancialConnectionsSessionForDeferredPaymentParams {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f51712k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uniqueId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initialInstitution;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean manualEntryOnly;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s1 verificationMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hostedSurface;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onBehalfOf;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer amount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: com.stripe.android.model.x$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/x$a;", "", "<init>", "()V", "", "PARAM_AMOUNT", "Ljava/lang/String;", "PARAM_CURRENCY", "PARAM_CUSTOMER", "PARAM_HOSTED_SURFACE", "PARAM_INITIAL_INSTITUTION", "PARAM_MANUAL_ENTRY_ONLY", "PARAM_ON_BEHALF_OF", "PARAM_SEARCH_SESSION", "PARAM_UNIQUE_ID", "PARAM_VERIFICATION_METHOD", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public CreateFinancialConnectionsSessionForDeferredPaymentParams(String uniqueId, String str, Boolean bool, String str2, s1 s1Var, String str3, String str4, String str5, Integer num, String str6) {
        p013kotlin.jvm.internal.s.k(uniqueId, "uniqueId");
        this.uniqueId = uniqueId;
        this.initialInstitution = str;
        this.manualEntryOnly = bool;
        this.searchSession = str2;
        this.verificationMethod = s1Var;
        this.hostedSurface = str3;
        this.customer = str4;
        this.onBehalfOf = str5;
        this.amount = num;
        this.currency = str6;
    }

    public final Map<String, Object> a() {
        Pair pairA = jn0.x.a("unique_id", this.uniqueId);
        Pair pairA2 = jn0.x.a("initial_institution", this.initialInstitution);
        Pair pairA3 = jn0.x.a("manual_entry_only", this.manualEntryOnly);
        Pair pairA4 = jn0.x.a("search_session", this.searchSession);
        s1 s1Var = this.verificationMethod;
        return p013kotlin.collections.v0.m(pairA, pairA2, pairA3, pairA4, jn0.x.a("verification_method", s1Var != null ? s1Var.getValue() : null), jn0.x.a("customer", this.customer), jn0.x.a("on_behalf_of", this.onBehalfOf), jn0.x.a("hosted_surface", this.hostedSurface), jn0.x.a("amount", this.amount), jn0.x.a("currency", this.currency));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFinancialConnectionsSessionForDeferredPaymentParams)) {
            return false;
        }
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = (CreateFinancialConnectionsSessionForDeferredPaymentParams) other;
        return p013kotlin.jvm.internal.s.f(this.uniqueId, createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId) && p013kotlin.jvm.internal.s.f(this.initialInstitution, createFinancialConnectionsSessionForDeferredPaymentParams.initialInstitution) && p013kotlin.jvm.internal.s.f(this.manualEntryOnly, createFinancialConnectionsSessionForDeferredPaymentParams.manualEntryOnly) && p013kotlin.jvm.internal.s.f(this.searchSession, createFinancialConnectionsSessionForDeferredPaymentParams.searchSession) && this.verificationMethod == createFinancialConnectionsSessionForDeferredPaymentParams.verificationMethod && p013kotlin.jvm.internal.s.f(this.hostedSurface, createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface) && p013kotlin.jvm.internal.s.f(this.customer, createFinancialConnectionsSessionForDeferredPaymentParams.customer) && p013kotlin.jvm.internal.s.f(this.onBehalfOf, createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf) && p013kotlin.jvm.internal.s.f(this.amount, createFinancialConnectionsSessionForDeferredPaymentParams.amount) && p013kotlin.jvm.internal.s.f(this.currency, createFinancialConnectionsSessionForDeferredPaymentParams.currency);
    }

    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode() * 31;
        String str = this.initialInstitution;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.manualEntryOnly;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.searchSession;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s1 s1Var = this.verificationMethod;
        int iHashCode5 = (iHashCode4 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        String str3 = this.hostedSurface;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customer;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onBehalfOf;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.currency;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.uniqueId + ", initialInstitution=" + this.initialInstitution + ", manualEntryOnly=" + this.manualEntryOnly + ", searchSession=" + this.searchSession + ", verificationMethod=" + this.verificationMethod + ", hostedSurface=" + this.hostedSurface + ", customer=" + this.customer + ", onBehalfOf=" + this.onBehalfOf + ", amount=" + this.amount + ", currency=" + this.currency + ")";
    }
}
