package j40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j40.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001: \u0012\u0014\u0016\u0019\u001e\u001f !\"#$%&'()*+,-./0123456789B3\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u001d\u001a\u00020\u0002*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001c\u0082\u0001 :;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXY¨\u0006Z"}, d2 = {"Lj40/e;", "", "", "name", "", "params", "", "includePrefix", "<init>", "(Ljava/lang/String;Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Z", DateTokenConverter.CONVERTER_KEY, "eventName", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ljava/lang/String;", "analyticsValue", "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a0", "b0", "c0", "d0", "e0", "f0", "Lj40/e$a;", "Lj40/e$b;", "Lj40/e$c;", "Lj40/e$d;", "Lj40/e$e;", "Lj40/e$f;", "Lj40/e$g;", "Lj40/e$h;", "Lj40/e$i;", "Lj40/e$j;", "Lj40/e$k;", "Lj40/e$l;", "Lj40/e$m;", "Lj40/e$n;", "Lj40/e$o;", "Lj40/e$p;", "Lj40/e$q;", "Lj40/e$r;", "Lj40/e$s;", "Lj40/e$t;", "Lj40/e$u;", "Lj40/e$v;", "Lj40/e$w;", "Lj40/e$x;", "Lj40/e$y;", "Lj40/e$z;", "Lj40/e$a0;", "Lj40/e$b0;", "Lj40/e$c0;", "Lj40/e$d0;", "Lj40/e$e0;", "Lj40/e$f0;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FinancialConnectionsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> params;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean includePrefix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: j40.e$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj40/e$a;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "selected", "isSingleAccount", "", "accountId", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZZLjava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FinancialConnectionsSessionManifest.Pane pane, boolean z11, boolean z12, String accountId) {
            super(z11 ? "click.account_picker.account_selected" : "click.account_picker.account_unselected", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("is_single_account", String.valueOf(z12)), jn0.x.a("account", accountId))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(accountId, "accountId");
        }
    }

    /* JADX INFO: renamed from: j40.e$a0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj40/e$a0;", "Lj40/e;", "", "", "institutionIds", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Ljava/util/Set;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a0 extends FinancialConnectionsEvent {
        public a0(Set<String> institutionIds, FinancialConnectionsSessionManifest.Pane pane) {
            p013kotlin.jvm.internal.s.k(institutionIds, "institutionIds");
            p013kotlin.jvm.internal.s.k(pane, "pane");
            Set<String> set = institutionIds;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set, 10));
            int i11 = 0;
            for (Object obj : set) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                arrayList.add(jn0.x.a("institution_ids[" + i11 + "]", (String) obj));
                i11 = i12;
            }
            super("search.scroll", z50.a.a(v0.r(v0.y(arrayList), v0.f(jn0.x.a("pane", o.f82596e.a(pane))))), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: j40.e$b */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj40/e$b;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "", "accountIds", "", "isSingleAccount", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Set;Z)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends FinancialConnectionsEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(FinancialConnectionsSessionManifest.Pane pane, Set<String> accountIds, boolean z11) {
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(accountIds, "accountIds");
            String str = "account_picker.accounts_auto_selected";
            boolean z12 = false;
            super(str, z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("account_ids", p013kotlin.collections.v.y0(accountIds, " ", null, null, 0, null, null, 62, null)), jn0.x.a("is_single_account", String.valueOf(z11)))), z12, 4, null);
        }
    }

    /* JADX INFO: renamed from: j40.e$b0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj40/e$b0;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", SearchIntents.EXTRA_QUERY, "", "duration", "", "resultCount", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;JI)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b0 extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(FinancialConnectionsSessionManifest.Pane pane, String query, long j11, int i11) {
            super("search.succeeded", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a(SearchIntents.EXTRA_QUERY, query), jn0.x.a("duration", String.valueOf(j11)), jn0.x.a("result_count", String.valueOf(i11)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(query, "query");
        }
    }

    /* JADX INFO: renamed from: j40.e$c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj40/e$c;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "", "accountIds", "", "isSkipAccountSelection", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Set;Z)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends FinancialConnectionsEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public c(FinancialConnectionsSessionManifest.Pane pane, Set<String> accountIds, boolean z11) {
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(accountIds, "accountIds");
            String str = "account_picker.accounts_submitted";
            boolean z12 = false;
            super(str, z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("account_ids", p013kotlin.collections.v.y0(accountIds, " ", null, null, 0, null, null, 62, null)), jn0.x.a("is_skip_account_selection", String.valueOf(z11)))), z12, 4, null);
        }
    }

    /* JADX INFO: renamed from: j40.e$c0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj40/e$c0;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Lj40/e$c0$a;", AnalyticsAttribute.Error, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lj40/e$c0$a;)V", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c0 extends FinancialConnectionsEvent {

        /* JADX INFO: renamed from: j40.e$c0$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lj40/e$c0$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ConsumerNotFoundError", "LookupConsumerSession", "StartVerificationSessionError", "ConfirmVerificationSessionError", "MarkLinkVerifiedError", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            ConsumerNotFoundError("ConsumerNotFoundError"),
            LookupConsumerSession("LookupConsumerSession"),
            StartVerificationSessionError("StartVerificationSessionError"),
            ConfirmVerificationSessionError("ConfirmVerificationSessionError"),
            MarkLinkVerifiedError("MarkLinkVerifiedError");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            a(String str) {
                this.value = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(FinancialConnectionsSessionManifest.Pane pane, a error) {
            super("networking.verification.error", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a(AnalyticsAttribute.Error, error.getValue()))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(error, "error");
        }
    }

    /* JADX INFO: renamed from: j40.e$d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj40/e$d;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "backgrounded", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FinancialConnectionsSessionManifest.Pane pane, boolean z11) {
            super(z11 ? "mobile.app_entered_background" : "mobile.app_entered_foreground", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$d0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj40/e$d0;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Lj40/e$d0$a;", AnalyticsAttribute.Error, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lj40/e$d0$a;)V", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d0 extends FinancialConnectionsEvent {

        /* JADX INFO: renamed from: j40.e$d0$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lj40/e$d0$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ConsumerNotFoundError", "LookupConsumerSession", "StartVerificationError", "MarkLinkVerifiedError", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            ConsumerNotFoundError("ConsumerNotFoundError"),
            LookupConsumerSession("LookupConsumerSession"),
            StartVerificationError("StartVerificationSessionError"),
            MarkLinkVerifiedError("MarkLinkStepUpAuthenticationVerifiedError");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            a(String str) {
                this.value = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(FinancialConnectionsSessionManifest.Pane pane, a error) {
            super("networking.verification.step_up.error", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a(AnalyticsAttribute.Error, error.getValue()))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(error, "error");
        }
    }

    /* JADX INFO: renamed from: j40.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$e;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", AnalyticsContext.Flow, "defaultBrowser", "id", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1725e extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1725e(FinancialConnectionsSessionManifest.Pane pane, String str, String str2, String id2) {
            super("auth_session.opened", z50.a.a(v0.m(jn0.x.a("auth_session_id", id2), jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a(AnalyticsContext.Flow, str == null ? "unknown" : str), jn0.x.a("browser", str2 == null ? "unknown" : str2))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(id2, "id");
        }
    }

    /* JADX INFO: renamed from: j40.e$e0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$e0;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e0 extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.verification.step_up.success", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$f */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj40/e$f;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", "", "authSessionId", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FinancialConnectionsSessionManifest.Pane nextPane, String authSessionId) {
            super("auth_session.retrieved", z50.a.a(v0.m(jn0.x.a("next_pane", nextPane.getValue()), jn0.x.a("auth_session_id", authSessionId))), false, 4, null);
            p013kotlin.jvm.internal.s.k(nextPane, "nextPane");
            p013kotlin.jvm.internal.s.k(authSessionId, "authSessionId");
        }
    }

    /* JADX INFO: renamed from: j40.e$f0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$f0;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f0 extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.verification.success", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$g */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$g;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", ImagesContract.URL, PermissionsResponse.STATUS_KEY, "authSessionId", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FinancialConnectionsSessionManifest.Pane pane, String url, String status, String str) {
            super("auth_session.url_received", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a(PermissionsResponse.STATUS_KEY, status), jn0.x.a(ImagesContract.URL, url), jn0.x.a("auth_session_id", str == null ? "" : str))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(status, "status");
        }
    }

    /* JADX INFO: renamed from: j40.e$g0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82595a;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82595a = iArr;
        }
    }

    /* JADX INFO: renamed from: j40.e$h */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj40/e$h;", "Lj40/e;", "", "eventName", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String eventName, FinancialConnectionsSessionManifest.Pane pane) {
            super(eventName, z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$i */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$i;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.done", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$j */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$j;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.data_access.learn_more", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$k */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$k;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.link_accounts", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$l */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$l;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.back", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$m */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$m;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.close", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$n */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj40/e$n;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "exception", "", "exceptionExtraMessage", "", "connectedAccounts", PermissionsResponse.STATUS_KEY, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends FinancialConnectionsEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public n(FinancialConnectionsSessionManifest.Pane pane, Throwable th2, String str, Integer num, String status) {
            Map<String, String> mapA;
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(status, "status");
            super("complete", z50.a.a(v0.r(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("num_linked_accounts", num != null ? num.toString() : null), jn0.x.a("type", th2 == null ? "object" : AnalyticsAttribute.Error), jn0.x.a(PermissionsResponse.STATUS_KEY, status)), (th2 == null || (mapA = j40.a.a(th2, str)) == null) ? v0.i() : mapA)), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: j40.e$o */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj40/e$o;", "Lj40/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends FinancialConnectionsEvent {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final o f82596e = new o();

        private o() {
            super("click.agree", v0.f(jn0.x.a("pane", FinancialConnectionsSessionManifest.Pane.CONSENT.getValue())), false, 4, null);
        }

        @Override // j40.FinancialConnectionsEvent
        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        @Override // j40.FinancialConnectionsEvent
        public int hashCode() {
            return 772248265;
        }

        @Override // j40.FinancialConnectionsEvent
        public String toString() {
            return "ConsentAgree";
        }
    }

    /* JADX INFO: renamed from: j40.e$p */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$p;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "exception", "", "extraMessage", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(FinancialConnectionsSessionManifest.Pane pane, Throwable exception, String str) {
            super(exception instanceof FinancialConnectionsError ? true : exception instanceof WebAuthFlowFailedException ? true : exception instanceof n40.l.a ? "error.expected" : "error.unexpected", z50.a.a(v0.r(v0.f(jn0.x.a("pane", o.f82596e.a(pane))), j40.a.a(exception, str))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(exception, "exception");
        }
    }

    /* JADX INFO: renamed from: j40.e$q */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj40/e$q;", "Lj40/e;", "", "experimentName", "assignmentEventId", "accountHolderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String experimentName, String assignmentEventId, String accountHolderId) {
            super("preloaded_experiment_retrieved", z50.a.a(v0.m(jn0.x.a("experiment_retrieved", experimentName), jn0.x.a("arb_id", assignmentEventId), jn0.x.a("account_holder_id", accountHolderId))), false, null);
            p013kotlin.jvm.internal.s.k(experimentName, "experimentName");
            p013kotlin.jvm.internal.s.k(assignmentEventId, "assignmentEventId");
            p013kotlin.jvm.internal.s.k(accountHolderId, "accountHolderId");
        }
    }

    /* JADX INFO: renamed from: j40.e$r */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj40/e$r;", "Lj40/e;", "", "", "institutionIds", "", "duration", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Ljava/util/Set;JLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends FinancialConnectionsEvent {
        public r(Set<String> institutionIds, long j11, FinancialConnectionsSessionManifest.Pane pane) {
            p013kotlin.jvm.internal.s.k(institutionIds, "institutionIds");
            p013kotlin.jvm.internal.s.k(pane, "pane");
            Set<String> set = institutionIds;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(set, 10));
            int i11 = 0;
            for (Object obj : set) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                arrayList.add(jn0.x.a("institutions[" + i11 + "]", (String) obj));
                i11 = i12;
            }
            super("search.feature_institutions_loaded", z50.a.a(v0.r(v0.y(arrayList), v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("result_count", String.valueOf(institutionIds.size())), jn0.x.a("duration", String.valueOf(j11))))), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: j40.e$s */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$s;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "fromFeatured", "", "institutionId", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(FinancialConnectionsSessionManifest.Pane pane, boolean z11, String institutionId) {
            super(z11 ? "search.featured_institution_selected" : "search.search_result_selected", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("institution_id", institutionId))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(institutionId, "institutionId");
        }
    }

    /* JADX INFO: renamed from: j40.e$t */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$t;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.new_consumer", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$u */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$u;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.returning_consumer", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$v */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj40/e$v;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "referrer", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane pane2) {
            super("pane.launched", z50.a.a(v0.m(jn0.x.a("referrer_pane", pane2 != null ? pane2.getValue() : null), jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$w */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$w;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(FinancialConnectionsSessionManifest.Pane pane) {
            super("pane.loaded", z50.a.a(v0.f(jn0.x.a("pane", o.f82596e.a(pane)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    /* JADX INFO: renamed from: j40.e$x */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$x;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "authSessionId", "", "duration", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(FinancialConnectionsSessionManifest.Pane pane, String authSessionId, long j11) {
            super("polling.accounts.success", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("authSessionId", authSessionId), jn0.x.a("duration", String.valueOf(j11)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(authSessionId, "authSessionId");
        }
    }

    /* JADX INFO: renamed from: j40.e$y */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj40/e$y;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "authSessionId", "", "duration", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(FinancialConnectionsSessionManifest.Pane pane, String authSessionId, long j11) {
            super("polling.attachPayment.success", z50.a.a(v0.m(jn0.x.a("pane", o.f82596e.a(pane)), jn0.x.a("authSessionId", authSessionId), jn0.x.a("duration", String.valueOf(j11)))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
            p013kotlin.jvm.internal.s.k(authSessionId, "authSessionId");
        }
    }

    /* JADX INFO: renamed from: j40.e$z */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj40/e$z;", "Lj40/e;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class z extends FinancialConnectionsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.prepane.continue", v0.f(jn0.x.a("pane", o.f82596e.a(pane))), false, 4, null);
            p013kotlin.jvm.internal.s.k(pane, "pane");
        }
    }

    public /* synthetic */ FinancialConnectionsEvent(String str, Map map, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, z11);
    }

    public final String a(FinancialConnectionsSessionManifest.Pane pane) {
        p013kotlin.jvm.internal.s.k(pane, "<this>");
        int i11 = g0.f82595a[pane.ordinal()];
        return (i11 == 1 || i11 == 2) ? FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue() : pane.getValue();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> c() {
        return this.params;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent");
        FinancialConnectionsEvent financialConnectionsEvent = (FinancialConnectionsEvent) other;
        return p013kotlin.jvm.internal.s.f(this.name, financialConnectionsEvent.name) && p013kotlin.jvm.internal.s.f(this.params, financialConnectionsEvent.params) && this.includePrefix == financialConnectionsEvent.includePrefix && p013kotlin.jvm.internal.s.f(this.eventName, financialConnectionsEvent.eventName);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Map<String, String> map = this.params;
        return ((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.includePrefix)) * 31) + this.eventName.hashCode();
    }

    public String toString() {
        return "FinancialConnectionsEvent(name='" + this.name + "', params=" + this.params + ")";
    }

    private FinancialConnectionsEvent(String str, Map<String, String> map, boolean z11) {
        this.name = str;
        this.params = map;
        this.includePrefix = z11;
        if (z11) {
            str = "linked_accounts." + str;
        }
        this.eventName = str;
    }

    public /* synthetic */ FinancialConnectionsEvent(String str, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? true : z11, null);
    }
}
