package z40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: z40.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u000b\u001aB3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lz40/d;", "", "Ls50/a;", "Lz40/d$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "selectNetworkedAccountAsync", "Lz40/d$b;", "viewEffect", "<init>", "(Ls50/a;Ls50/a;Lz40/d$b;)V", "a", "(Ls50/a;Ls50/a;Lz40/d$b;)Lz40/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", "e", "()Ls50/a;", "b", "f", "c", "Lz40/d$b;", "g", "()Lz40/d$b;", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "activeDataAccessNotice", "Lv50/g;", DateTokenConverter.CONVERTER_KEY, "()Lv50/g;", "cta", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkAccountPickerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<h0> selectNetworkedAccountAsync;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b viewEffect;

    /* JADX INFO: renamed from: z40.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J´\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b0\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b)\u0010\u001cR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b7\u0010=R\u0017\u0010\u0016\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b.\u0010:R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010(¨\u0006@"}, d2 = {"Lz40/d$a;", "", "", "title", "", "Lz40/i;", "accounts", "selectedAccountIds", "Lcom/stripe/android/financialconnections/model/b;", "addNewAccount", "consumerSessionClientSecret", "defaultCta", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPaneOnNewAccount", "", "partnerToCoreAuths", "", "singleAccount", "Lcom/stripe/android/financialconnections/model/l;", "multipleAccountTypesSelectedDataAccessNotice", "aboveCta", "defaultDataAccessNotice", "acquireConsentOnPrimaryCtaClick", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/b;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/l;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Z)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/b;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/l;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Z)Lz40/d$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "p", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "c", "m", "Lcom/stripe/android/financialconnections/model/b;", "f", "()Lcom/stripe/android/financialconnections/model/b;", "e", "g", "h", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "k", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "Ljava/util/Map;", "l", "()Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "Z", "o", "()Z", "j", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "n", "selectedAccounts", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<LinkedAccount> accounts;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> selectedAccountIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddNewAccount addNewAccount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String consumerSessionClientSecret;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultCta;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> partnerToCoreAuths;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean singleAccount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String aboveCta;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final DataAccessNotice defaultDataAccessNotice;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean acquireConsentOnPrimaryCtaClick;

        public Payload(String title, List<LinkedAccount> accounts, List<String> selectedAccountIds, AddNewAccount addNewAccount, String consumerSessionClientSecret, String defaultCta, FinancialConnectionsSessionManifest.Pane pane, Map<String, String> map, boolean z11, DataAccessNotice dataAccessNotice, String str, DataAccessNotice dataAccessNotice2, boolean z12) {
            s.k(title, "title");
            s.k(accounts, "accounts");
            s.k(selectedAccountIds, "selectedAccountIds");
            s.k(addNewAccount, "addNewAccount");
            s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            s.k(defaultCta, "defaultCta");
            this.title = title;
            this.accounts = accounts;
            this.selectedAccountIds = selectedAccountIds;
            this.addNewAccount = addNewAccount;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.defaultCta = defaultCta;
            this.nextPaneOnNewAccount = pane;
            this.partnerToCoreAuths = map;
            this.singleAccount = z11;
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
            this.aboveCta = str;
            this.defaultDataAccessNotice = dataAccessNotice2;
            this.acquireConsentOnPrimaryCtaClick = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload b(Payload payload, String str, List list, List list2, AddNewAccount addNewAccount, String str2, String str3, FinancialConnectionsSessionManifest.Pane pane, Map map, boolean z11, DataAccessNotice dataAccessNotice, String str4, DataAccessNotice dataAccessNotice2, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = payload.title;
            }
            return payload.a(str, (i11 & 2) != 0 ? payload.accounts : list, (i11 & 4) != 0 ? payload.selectedAccountIds : list2, (i11 & 8) != 0 ? payload.addNewAccount : addNewAccount, (i11 & 16) != 0 ? payload.consumerSessionClientSecret : str2, (i11 & 32) != 0 ? payload.defaultCta : str3, (i11 & 64) != 0 ? payload.nextPaneOnNewAccount : pane, (i11 & 128) != 0 ? payload.partnerToCoreAuths : map, (i11 & 256) != 0 ? payload.singleAccount : z11, (i11 & 512) != 0 ? payload.multipleAccountTypesSelectedDataAccessNotice : dataAccessNotice, (i11 & 1024) != 0 ? payload.aboveCta : str4, (i11 & 2048) != 0 ? payload.defaultDataAccessNotice : dataAccessNotice2, (i11 & 4096) != 0 ? payload.acquireConsentOnPrimaryCtaClick : z12);
        }

        public final Payload a(String title, List<LinkedAccount> accounts, List<String> selectedAccountIds, AddNewAccount addNewAccount, String consumerSessionClientSecret, String defaultCta, FinancialConnectionsSessionManifest.Pane nextPaneOnNewAccount, Map<String, String> partnerToCoreAuths, boolean singleAccount, DataAccessNotice multipleAccountTypesSelectedDataAccessNotice, String aboveCta, DataAccessNotice defaultDataAccessNotice, boolean acquireConsentOnPrimaryCtaClick) {
            s.k(title, "title");
            s.k(accounts, "accounts");
            s.k(selectedAccountIds, "selectedAccountIds");
            s.k(addNewAccount, "addNewAccount");
            s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            s.k(defaultCta, "defaultCta");
            return new Payload(title, accounts, selectedAccountIds, addNewAccount, consumerSessionClientSecret, defaultCta, nextPaneOnNewAccount, partnerToCoreAuths, singleAccount, multipleAccountTypesSelectedDataAccessNotice, aboveCta, defaultDataAccessNotice, acquireConsentOnPrimaryCtaClick);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAboveCta() {
            return this.aboveCta;
        }

        public final List<LinkedAccount> d() {
            return this.accounts;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getAcquireConsentOnPrimaryCtaClick() {
            return this.acquireConsentOnPrimaryCtaClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.title, payload.title) && s.f(this.accounts, payload.accounts) && s.f(this.selectedAccountIds, payload.selectedAccountIds) && s.f(this.addNewAccount, payload.addNewAccount) && s.f(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && s.f(this.defaultCta, payload.defaultCta) && this.nextPaneOnNewAccount == payload.nextPaneOnNewAccount && s.f(this.partnerToCoreAuths, payload.partnerToCoreAuths) && this.singleAccount == payload.singleAccount && s.f(this.multipleAccountTypesSelectedDataAccessNotice, payload.multipleAccountTypesSelectedDataAccessNotice) && s.f(this.aboveCta, payload.aboveCta) && s.f(this.defaultDataAccessNotice, payload.defaultDataAccessNotice) && this.acquireConsentOnPrimaryCtaClick == payload.acquireConsentOnPrimaryCtaClick;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AddNewAccount getAddNewAccount() {
            return this.addNewAccount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getDefaultCta() {
            return this.defaultCta;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.title.hashCode() * 31) + this.accounts.hashCode()) * 31) + this.selectedAccountIds.hashCode()) * 31) + this.addNewAccount.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode()) * 31) + this.defaultCta.hashCode()) * 31;
            FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnNewAccount;
            int iHashCode2 = (iHashCode + (pane == null ? 0 : pane.hashCode())) * 31;
            Map<String, String> map = this.partnerToCoreAuths;
            int iHashCode3 = (((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.singleAccount)) * 31;
            DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
            int iHashCode4 = (iHashCode3 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31;
            String str = this.aboveCta;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice2 = this.defaultDataAccessNotice;
            return ((iHashCode5 + (dataAccessNotice2 != null ? dataAccessNotice2.hashCode() : 0)) * 31) + Boolean.hashCode(this.acquireConsentOnPrimaryCtaClick);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final DataAccessNotice getDefaultDataAccessNotice() {
            return this.defaultDataAccessNotice;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
            return this.multipleAccountTypesSelectedDataAccessNotice;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final FinancialConnectionsSessionManifest.Pane getNextPaneOnNewAccount() {
            return this.nextPaneOnNewAccount;
        }

        public final Map<String, String> l() {
            return this.partnerToCoreAuths;
        }

        public final List<String> m() {
            return this.selectedAccountIds;
        }

        public final List<LinkedAccount> n() {
            List<LinkedAccount> list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.selectedAccountIds.contains(((LinkedAccount) obj).c().getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            return "Payload(title=" + this.title + ", accounts=" + this.accounts + ", selectedAccountIds=" + this.selectedAccountIds + ", addNewAccount=" + this.addNewAccount + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", defaultCta=" + this.defaultCta + ", nextPaneOnNewAccount=" + this.nextPaneOnNewAccount + ", partnerToCoreAuths=" + this.partnerToCoreAuths + ", singleAccount=" + this.singleAccount + ", multipleAccountTypesSelectedDataAccessNotice=" + this.multipleAccountTypesSelectedDataAccessNotice + ", aboveCta=" + this.aboveCta + ", defaultDataAccessNotice=" + this.defaultDataAccessNotice + ", acquireConsentOnPrimaryCtaClick=" + this.acquireConsentOnPrimaryCtaClick + ")";
        }
    }

    /* JADX INFO: renamed from: z40.d$b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lz40/d$b;", "", "<init>", "()V", "a", "Lz40/d$b$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: z40.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz40/d$b$a;", "Lz40/d$b;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final long id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String url, long j11) {
                super(null);
                s.k(url, "url");
                this.url = url;
                this.id = j11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) other;
                return s.f(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.id);
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ", id=" + this.id + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public LinkAccountPickerState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkAccountPickerState b(LinkAccountPickerState linkAccountPickerState, s50.a aVar, s50.a aVar2, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = linkAccountPickerState.payload;
        }
        if ((i11 & 2) != 0) {
            aVar2 = linkAccountPickerState.selectNetworkedAccountAsync;
        }
        if ((i11 & 4) != 0) {
            bVar = linkAccountPickerState.viewEffect;
        }
        return linkAccountPickerState.a(aVar, aVar2, bVar);
    }

    public final LinkAccountPickerState a(s50.a<Payload> payload, s50.a<h0> selectNetworkedAccountAsync, b viewEffect) {
        s.k(payload, "payload");
        s.k(selectNetworkedAccountAsync, "selectNetworkedAccountAsync");
        return new LinkAccountPickerState(payload, selectNetworkedAccountAsync, viewEffect);
    }

    public final DataAccessNotice c() {
        NetworkedAccount networkedAccountD;
        DataAccessNotice dataAccessNotice;
        Payload payloadA = this.payload.a();
        if (payloadA == null) {
            return null;
        }
        List<LinkedAccount> listN = payloadA.n();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listN.iterator();
        while (it.hasNext()) {
            String strE = ((LinkedAccount) it.next()).e();
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        if (v.r1(arrayList).size() > 1) {
            return payloadA.getMultipleAccountTypesSelectedDataAccessNotice();
        }
        LinkedAccount linkedAccount = (LinkedAccount) v.q0(payloadA.n());
        return (linkedAccount == null || (networkedAccountD = linkedAccount.d()) == null || (dataAccessNotice = networkedAccountD.getDataAccessNotice()) == null) ? payloadA.getDefaultDataAccessNotice() : dataAccessNotice;
    }

    public final v50.g d() {
        String defaultCta;
        Payload payloadA = this.payload.a();
        if (payloadA == null || !payloadA.getSingleAccount()) {
            String defaultCta2 = payloadA != null ? payloadA.getDefaultCta() : null;
            if (defaultCta2 == null) {
                defaultCta2 = "";
            }
            return new v50.g.Text(defaultCta2);
        }
        LinkedAccount linkedAccount = (LinkedAccount) v.W0(payloadA.n());
        NetworkedAccount networkedAccountD = linkedAccount != null ? linkedAccount.d() : null;
        if (networkedAccountD == null || (defaultCta = networkedAccountD.getSelectionCta()) == null) {
            defaultCta = payloadA.getDefaultCta();
        }
        return new v50.g.Text(defaultCta);
    }

    public final s50.a<Payload> e() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountPickerState)) {
            return false;
        }
        LinkAccountPickerState linkAccountPickerState = (LinkAccountPickerState) other;
        return s.f(this.payload, linkAccountPickerState.payload) && s.f(this.selectNetworkedAccountAsync, linkAccountPickerState.selectNetworkedAccountAsync) && s.f(this.viewEffect, linkAccountPickerState.viewEffect);
    }

    public final s50.a<h0> f() {
        return this.selectNetworkedAccountAsync;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getViewEffect() {
        return this.viewEffect;
    }

    public int hashCode() {
        int iHashCode = ((this.payload.hashCode() * 31) + this.selectNetworkedAccountAsync.hashCode()) * 31;
        b bVar = this.viewEffect;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "LinkAccountPickerState(payload=" + this.payload + ", selectNetworkedAccountAsync=" + this.selectNetworkedAccountAsync + ", viewEffect=" + this.viewEffect + ")";
    }

    public LinkAccountPickerState(s50.a<Payload> payload, s50.a<h0> selectNetworkedAccountAsync, b bVar) {
        s.k(payload, "payload");
        s.k(selectNetworkedAccountAsync, "selectNetworkedAccountAsync");
        this.payload = payload;
        this.selectNetworkedAccountAsync = selectNetworkedAccountAsync;
        this.viewEffect = bVar;
    }

    public /* synthetic */ LinkAccountPickerState(s50.a aVar, s50.a aVar2, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 4) != 0 ? null : bVar);
    }
}
