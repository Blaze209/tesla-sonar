package o40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: o40.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0012\u001f!B]\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jf\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010#R\u0011\u0010.\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010#¨\u0006/"}, d2 = {"Lo40/c;", "", "Ls50/a;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "Lo40/c$a;", StatusResponse.PAYLOAD, "", "canRetry", "Lcom/stripe/android/financialconnections/model/d0;", "selectAccounts", "", "", "selectedIds", "Lo40/c$c;", "viewEffect", "<init>", "(Ls50/a;Ls50/a;ZLs50/a;Ljava/util/Set;Lo40/c$c;)V", "a", "(Ls50/a;Ls50/a;ZLs50/a;Ljava/util/Set;Lo40/c$c;)Lo40/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "e", "c", "Z", "()Z", "f", "Ljava/util/Set;", "g", "()Ljava/util/Set;", "Lo40/c$c;", "j", "()Lo40/c$c;", IntegerTokenConverter.CONVERTER_KEY, "submitLoading", "h", "submitEnabled", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AccountPickerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<FinancialConnectionsInstitution> institution;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRetry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<PartnerAccountsList> selectAccounts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> selectedIds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC2052c viewEffect;

    /* JADX INFO: renamed from: o40.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u00100\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u00061"}, d2 = {"Lo40/c$a;", "", "", "skipAccountSelection", "", "Lcom/stripe/android/financialconnections/model/c0;", "accounts", "", "dataAccessDisclaimer", "Lcom/stripe/android/financialconnections/model/l;", "dataAccessNotice", "Lo40/c$b;", "selectionMode", "singleAccount", "stripeDirect", "businessName", "userSelectedSingleAccountInInstitution", "<init>", "(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Lo40/c$b;ZZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "h", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "e", "Lo40/c$b;", "()Lo40/c$b;", "f", "g", "getStripeDirect", "getBusinessName", IntegerTokenConverter.CONVERTER_KEY, "selectableAccounts", "shouldSkipPane", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipAccountSelection;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PartnerAccount> accounts;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String dataAccessDisclaimer;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final DataAccessNotice dataAccessNotice;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b selectionMode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean singleAccount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean stripeDirect;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String businessName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean userSelectedSingleAccountInInstitution;

        public Payload(boolean z11, List<PartnerAccount> accounts, String str, DataAccessNotice dataAccessNotice, b selectionMode, boolean z12, boolean z13, String str2, boolean z14) {
            s.k(accounts, "accounts");
            s.k(selectionMode, "selectionMode");
            this.skipAccountSelection = z11;
            this.accounts = accounts;
            this.dataAccessDisclaimer = str;
            this.dataAccessNotice = dataAccessNotice;
            this.selectionMode = selectionMode;
            this.singleAccount = z12;
            this.stripeDirect = z13;
            this.businessName = str2;
            this.userSelectedSingleAccountInInstitution = z14;
        }

        public final List<PartnerAccount> a() {
            return this.accounts;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDataAccessDisclaimer() {
            return this.dataAccessDisclaimer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DataAccessNotice getDataAccessNotice() {
            return this.dataAccessNotice;
        }

        public final List<PartnerAccount> d() {
            List<PartnerAccount> list = this.accounts;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((PartnerAccount) obj).b()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getSelectionMode() {
            return this.selectionMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.skipAccountSelection == payload.skipAccountSelection && s.f(this.accounts, payload.accounts) && s.f(this.dataAccessDisclaimer, payload.dataAccessDisclaimer) && s.f(this.dataAccessNotice, payload.dataAccessNotice) && this.selectionMode == payload.selectionMode && this.singleAccount == payload.singleAccount && this.stripeDirect == payload.stripeDirect && s.f(this.businessName, payload.businessName) && this.userSelectedSingleAccountInInstitution == payload.userSelectedSingleAccountInInstitution;
        }

        public final boolean f() {
            return this.skipAccountSelection || this.userSelectedSingleAccountInInstitution;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getSingleAccount() {
            return this.singleAccount;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getSkipAccountSelection() {
            return this.skipAccountSelection;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.skipAccountSelection) * 31) + this.accounts.hashCode()) * 31;
            String str = this.dataAccessDisclaimer;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DataAccessNotice dataAccessNotice = this.dataAccessNotice;
            int iHashCode3 = (((((((iHashCode2 + (dataAccessNotice == null ? 0 : dataAccessNotice.hashCode())) * 31) + this.selectionMode.hashCode()) * 31) + Boolean.hashCode(this.singleAccount)) * 31) + Boolean.hashCode(this.stripeDirect)) * 31;
            String str2 = this.businessName;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.userSelectedSingleAccountInInstitution);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getUserSelectedSingleAccountInInstitution() {
            return this.userSelectedSingleAccountInInstitution;
        }

        public String toString() {
            return "Payload(skipAccountSelection=" + this.skipAccountSelection + ", accounts=" + this.accounts + ", dataAccessDisclaimer=" + this.dataAccessDisclaimer + ", dataAccessNotice=" + this.dataAccessNotice + ", selectionMode=" + this.selectionMode + ", singleAccount=" + this.singleAccount + ", stripeDirect=" + this.stripeDirect + ", businessName=" + this.businessName + ", userSelectedSingleAccountInInstitution=" + this.userSelectedSingleAccountInInstitution + ")";
        }
    }

    /* JADX INFO: renamed from: o40.c$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lo40/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "Single", "Multiple", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        Single,
        Multiple;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: o40.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lo40/c$c;", "", "<init>", "()V", "a", "Lo40/c$c$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractC2052c {

        /* JADX INFO: renamed from: o40.c$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo40/c$c$a;", "Lo40/c$c;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends AbstractC2052c {

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

        public /* synthetic */ AbstractC2052c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2052c() {
        }
    }

    public AccountPickerState() {
        this(null, null, false, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountPickerState b(AccountPickerState accountPickerState, s50.a aVar, s50.a aVar2, boolean z11, s50.a aVar3, Set set, AbstractC2052c abstractC2052c, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = accountPickerState.institution;
        }
        if ((i11 & 2) != 0) {
            aVar2 = accountPickerState.payload;
        }
        if ((i11 & 4) != 0) {
            z11 = accountPickerState.canRetry;
        }
        if ((i11 & 8) != 0) {
            aVar3 = accountPickerState.selectAccounts;
        }
        if ((i11 & 16) != 0) {
            set = accountPickerState.selectedIds;
        }
        if ((i11 & 32) != 0) {
            abstractC2052c = accountPickerState.viewEffect;
        }
        Set set2 = set;
        AbstractC2052c abstractC2052c2 = abstractC2052c;
        return accountPickerState.a(aVar, aVar2, z11, aVar3, set2, abstractC2052c2);
    }

    public final AccountPickerState a(s50.a<FinancialConnectionsInstitution> institution, s50.a<Payload> payload, boolean canRetry, s50.a<PartnerAccountsList> selectAccounts, Set<String> selectedIds, AbstractC2052c viewEffect) {
        s.k(institution, "institution");
        s.k(payload, "payload");
        s.k(selectAccounts, "selectAccounts");
        s.k(selectedIds, "selectedIds");
        return new AccountPickerState(institution, payload, canRetry, selectAccounts, selectedIds, viewEffect);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanRetry() {
        return this.canRetry;
    }

    public final s50.a<FinancialConnectionsInstitution> d() {
        return this.institution;
    }

    public final s50.a<Payload> e() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountPickerState)) {
            return false;
        }
        AccountPickerState accountPickerState = (AccountPickerState) other;
        return s.f(this.institution, accountPickerState.institution) && s.f(this.payload, accountPickerState.payload) && this.canRetry == accountPickerState.canRetry && s.f(this.selectAccounts, accountPickerState.selectAccounts) && s.f(this.selectedIds, accountPickerState.selectedIds) && s.f(this.viewEffect, accountPickerState.viewEffect);
    }

    public final s50.a<PartnerAccountsList> f() {
        return this.selectAccounts;
    }

    public final Set<String> g() {
        return this.selectedIds;
    }

    public final boolean h() {
        return !this.selectedIds.isEmpty();
    }

    public int hashCode() {
        int iHashCode = ((((((((this.institution.hashCode() * 31) + this.payload.hashCode()) * 31) + Boolean.hashCode(this.canRetry)) * 31) + this.selectAccounts.hashCode()) * 31) + this.selectedIds.hashCode()) * 31;
        AbstractC2052c abstractC2052c = this.viewEffect;
        return iHashCode + (abstractC2052c == null ? 0 : abstractC2052c.hashCode());
    }

    public final boolean i() {
        return (this.payload instanceof s50.a.Loading) || (this.selectAccounts instanceof s50.a.Loading);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC2052c getViewEffect() {
        return this.viewEffect;
    }

    public String toString() {
        return "AccountPickerState(institution=" + this.institution + ", payload=" + this.payload + ", canRetry=" + this.canRetry + ", selectAccounts=" + this.selectAccounts + ", selectedIds=" + this.selectedIds + ", viewEffect=" + this.viewEffect + ")";
    }

    public AccountPickerState(s50.a<FinancialConnectionsInstitution> institution, s50.a<Payload> payload, boolean z11, s50.a<PartnerAccountsList> selectAccounts, Set<String> selectedIds, AbstractC2052c abstractC2052c) {
        s.k(institution, "institution");
        s.k(payload, "payload");
        s.k(selectAccounts, "selectAccounts");
        s.k(selectedIds, "selectedIds");
        this.institution = institution;
        this.payload = payload;
        this.canRetry = z11;
        this.selectAccounts = selectAccounts;
        this.selectedIds = selectedIds;
        this.viewEffect = abstractC2052c;
    }

    public /* synthetic */ AccountPickerState(s50.a aVar, s50.a aVar2, boolean z11, s50.a aVar3, Set set, AbstractC2052c abstractC2052c, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? s50.a.d.f110198b : aVar3, (i11 & 16) != 0 ? d1.d() : set, (i11 & 32) != 0 ? null : abstractC2052c);
    }
}
