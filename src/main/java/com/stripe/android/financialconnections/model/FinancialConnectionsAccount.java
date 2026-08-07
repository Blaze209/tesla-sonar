package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.contacts.Columns;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007;pAqrstB\u00ad\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011¢\u0006\u0004\b\u001f\u0010 B×\u0001\b\u0011\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0001\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÁ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u00100J \u00109\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b9\u0010:R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bD\u0010@\u001a\u0004\bC\u00100R \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u0010@\u001a\u0004\bG\u0010.R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010F\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010.R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010K\u0012\u0004\bN\u0010@\u001a\u0004\bL\u0010MR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010@\u001a\u0004\bQ\u0010RR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010T\u0012\u0004\bW\u0010@\u001a\u0004\bU\u0010VR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b\\\u0010@\u001a\u0004\bZ\u0010[R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010]\u0012\u0004\b_\u0010@\u001a\u0004\bA\u0010^R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bc\u0010@\u001a\u0004\bE\u0010bR\"\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010F\u0012\u0004\bd\u0010@\u001a\u0004\bO\u0010.R\"\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u0010F\u0012\u0004\be\u0010@\u001a\u0004\bX\u0010.R\"\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010F\u0012\u0004\bg\u0010@\u001a\u0004\bf\u0010.R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bh\u0010i\u0012\u0004\bl\u0010@\u001a\u0004\bj\u0010kR(\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bm\u0010Y\u0012\u0004\bn\u0010@\u001a\u0004\b`\u0010[¨\u0006u"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "Lt30/f;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/f0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "category", "", "created", "", "id", "institutionName", "", "livemode", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", PermissionsResponse.STATUS_KEY, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "subcategory", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "supportedPaymentMethodTypes", "Lcom/stripe/android/financialconnections/model/Balance;", "balance", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "balanceRefresh", "displayName", "last4", "ownership", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "ownershipRefresh", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "permissions", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "q", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getCategory$annotations", "()V", "b", "I", "e", "getCreated$annotations", "c", "Ljava/lang/String;", "getId", "getId$annotations", "g", "getInstitutionName$annotations", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "getLivemode$annotations", "f", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "k", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "getStatus$annotations", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "l", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSubcategory$annotations", "h", "Ljava/util/List;", "m", "()Ljava/util/List;", "getSupportedPaymentMethodTypes$annotations", "Lcom/stripe/android/financialconnections/model/Balance;", "()Lcom/stripe/android/financialconnections/model/Balance;", "getBalance$annotations", "j", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "()Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "getBalanceRefresh$annotations", "getDisplayName$annotations", "getLast4$annotations", "getOwnership", "getOwnership$annotations", "n", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "getOwnershipRefresh", "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "getOwnershipRefresh$annotations", "o", "getPermissions$annotations", "Companion", "Category", "Permissions", "Status", "Subcategory", "SupportedPaymentMethodTypes", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class FinancialConnectionsAccount extends f0 implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Category category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int created;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean livemode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Subcategory subcategory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SupportedPaymentMethodTypes> supportedPaymentMethodTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Balance balance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final BalanceRefresh balanceRefresh;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String last4;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ownership;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final OwnershipRefresh ownershipRefresh;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Permissions> permissions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f50266p = 8;
    public static final Parcelable.Creator<FinancialConnectionsAccount> CREATOR = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ro0.d<Object>[] f50267q = {null, null, null, null, null, null, null, new vo0.e(SupportedPaymentMethodTypes.c.f50292e), null, null, null, null, null, null, new vo0.e(Permissions.c.f50286e)};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "CASH", "CREDIT", "INVESTMENT", "OTHER", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Category {
        CASH("cash"),
        CREDIT("credit"),
        INVESTMENT("investment"),
        OTHER("other"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50283c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50283c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50284e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Category$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Category.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Category> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Category> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50284e = new c();

            private c() {
                super((Enum[]) Category.getEntries().toArray(new Category[0]), Category.UNKNOWN);
            }
        }

        Category(String str) {
            this.value = str;
        }

        public static EnumEntries<Category> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "BALANCES", "OWNERSHIP", "PAYMENT_METHOD", "TRANSACTIONS", "ACCOUNT_NUMBERS", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Permissions {
        BALANCES("balances"),
        OWNERSHIP("ownership"),
        PAYMENT_METHOD("payment_method"),
        TRANSACTIONS("transactions"),
        ACCOUNT_NUMBERS("account_numbers"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50285c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50285c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50286e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Permissions$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Permissions.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Permissions> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Permissions> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50286e = new c();

            private c() {
                super((Enum[]) Permissions.getEntries().toArray(new Permissions[0]), Permissions.UNKNOWN);
            }
        }

        Permissions(String str) {
            this.value = str;
        }

        public static EnumEntries<Permissions> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "ACTIVE", "DISCONNECTED", "INACTIVE", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Status {
        ACTIVE("active"),
        DISCONNECTED("disconnected"),
        INACTIVE("inactive"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50287c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50287c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50288e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Status$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Status.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Status> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Status> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50288e = new c();

            private c() {
                super((Enum[]) Status.getEntries().toArray(new Status[0]), Status.UNKNOWN);
            }
        }

        Status(String str) {
            this.value = str;
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "CHECKING", "CREDIT_CARD", "LINE_OF_CREDIT", "MORTGAGE", "OTHER", "SAVINGS", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Subcategory {
        CHECKING("checking"),
        CREDIT_CARD("credit_card"),
        LINE_OF_CREDIT("line_of_credit"),
        MORTGAGE("mortgage"),
        OTHER("other"),
        SAVINGS("savings"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50289c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50289c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50290e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$Subcategory$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Subcategory.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Subcategory> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Subcategory> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50290e = new c();

            private c() {
                super((Enum[]) Subcategory.getEntries().toArray(new Subcategory[0]), Subcategory.UNKNOWN);
            }
        }

        Subcategory(String str) {
            this.value = str;
        }

        public static EnumEntries<Subcategory> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "LINK", "US_BANK_ACCOUNT", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum SupportedPaymentMethodTypes {
        LINK("link"),
        US_BANK_ACCOUNT("us_bank_account"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50291c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50291c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50292e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$SupportedPaymentMethodTypes$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) SupportedPaymentMethodTypes.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<SupportedPaymentMethodTypes> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<SupportedPaymentMethodTypes> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50292e = new c();

            private c() {
                super((Enum[]) SupportedPaymentMethodTypes.getEntries().toArray(new SupportedPaymentMethodTypes[0]), SupportedPaymentMethodTypes.UNKNOWN);
            }
        }

        SupportedPaymentMethodTypes(String str) {
            this.value = str;
        }

        public static EnumEntries<SupportedPaymentMethodTypes> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<FinancialConnectionsAccount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50293a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50293a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", aVar, 15);
            m1Var.o("category", true);
            m1Var.o("created", false);
            m1Var.o("id", false);
            m1Var.o("institution_name", false);
            m1Var.o("livemode", false);
            m1Var.o(PermissionsResponse.STATUS_KEY, true);
            m1Var.o("subcategory", true);
            m1Var.o("supported_payment_method_types", false);
            m1Var.o("balance", true);
            m1Var.o("balance_refresh", true);
            m1Var.o(Columns.DISPLAY_NAME, true);
            m1Var.o("last4", true);
            m1Var.o("ownership", true);
            m1Var.o("ownership_refresh", true);
            m1Var.o("permissions", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsAccount deserialize(uo0.e decoder) {
            List list;
            int i11;
            Category category;
            int i12;
            Subcategory subcategory;
            List list2;
            String str;
            String str2;
            Balance balance;
            OwnershipRefresh ownershipRefresh;
            BalanceRefresh balanceRefresh;
            String str3;
            Status status;
            String str4;
            String str5;
            boolean z11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = FinancialConnectionsAccount.f50267q;
            if (cVarB.i()) {
                Category category2 = (Category) cVarB.n(descriptor2, 0, Category.c.f50284e, null);
                int iE = cVarB.e(descriptor2, 1);
                String strT = cVarB.t(descriptor2, 2);
                String strT2 = cVarB.t(descriptor2, 3);
                boolean zW = cVarB.w(descriptor2, 4);
                Status status2 = (Status) cVarB.n(descriptor2, 5, Status.c.f50288e, null);
                Subcategory subcategory2 = (Subcategory) cVarB.n(descriptor2, 6, Subcategory.c.f50290e, null);
                list = (List) cVarB.n(descriptor2, 7, dVarArr[7], null);
                Balance balance2 = (Balance) cVarB.v(descriptor2, 8, Balance.a.f50260a, null);
                BalanceRefresh balanceRefresh2 = (BalanceRefresh) cVarB.v(descriptor2, 9, BalanceRefresh.a.f50265a, null);
                z1 z1Var = z1.f119730a;
                String str6 = (String) cVarB.v(descriptor2, 10, z1Var, null);
                String str7 = (String) cVarB.v(descriptor2, 11, z1Var, null);
                String str8 = (String) cVarB.v(descriptor2, 12, z1Var, null);
                i11 = 32767;
                ownershipRefresh = (OwnershipRefresh) cVarB.v(descriptor2, 13, OwnershipRefresh.a.f50380a, null);
                category = category2;
                i12 = iE;
                list2 = (List) cVarB.v(descriptor2, 14, dVarArr[14], null);
                str2 = str6;
                balanceRefresh = balanceRefresh2;
                subcategory = subcategory2;
                status = status2;
                str5 = strT2;
                balance = balance2;
                z11 = zW;
                str4 = strT;
                str3 = str8;
                str = str7;
            } else {
                int i13 = 14;
                int iE2 = 0;
                boolean zW2 = false;
                boolean z12 = true;
                Subcategory subcategory3 = null;
                List list3 = null;
                String str9 = null;
                String str10 = null;
                Balance balance3 = null;
                OwnershipRefresh ownershipRefresh2 = null;
                BalanceRefresh balanceRefresh3 = null;
                list = null;
                Category category3 = null;
                String strT3 = null;
                String strT4 = null;
                int i14 = 7;
                i11 = 0;
                Status status3 = null;
                String str11 = null;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            category3 = category3;
                            status3 = status3;
                            z12 = false;
                            i14 = 7;
                            break;
                        case 0:
                            i11 |= 1;
                            category3 = (Category) cVarB.n(descriptor2, 0, Category.c.f50284e, category3);
                            status3 = status3;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 1:
                            i11 |= 2;
                            iE2 = cVarB.e(descriptor2, 1);
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 2:
                            strT3 = cVarB.t(descriptor2, 2);
                            i11 |= 4;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 3:
                            strT4 = cVarB.t(descriptor2, 3);
                            i11 |= 8;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 4:
                            zW2 = cVarB.w(descriptor2, 4);
                            i11 |= 16;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 5:
                            status3 = (Status) cVarB.n(descriptor2, 5, Status.c.f50288e, status3);
                            i11 |= 32;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 6:
                            subcategory3 = (Subcategory) cVarB.n(descriptor2, 6, Subcategory.c.f50290e, subcategory3);
                            i11 |= 64;
                            i13 = 14;
                            i14 = 7;
                            break;
                        case 7:
                            list = (List) cVarB.n(descriptor2, i14, dVarArr[i14], list);
                            i11 |= 128;
                            i13 = 14;
                            break;
                        case 8:
                            balance3 = (Balance) cVarB.v(descriptor2, 8, Balance.a.f50260a, balance3);
                            i11 |= 256;
                            i13 = 14;
                            break;
                        case 9:
                            balanceRefresh3 = (BalanceRefresh) cVarB.v(descriptor2, 9, BalanceRefresh.a.f50265a, balanceRefresh3);
                            i11 |= 512;
                            i13 = 14;
                            break;
                        case 10:
                            str10 = (String) cVarB.v(descriptor2, 10, z1.f119730a, str10);
                            i11 |= 1024;
                            i13 = 14;
                            break;
                        case 11:
                            str9 = (String) cVarB.v(descriptor2, 11, z1.f119730a, str9);
                            i11 |= 2048;
                            i13 = 14;
                            break;
                        case 12:
                            str11 = (String) cVarB.v(descriptor2, 12, z1.f119730a, str11);
                            i11 |= 4096;
                            i13 = 14;
                            break;
                        case 13:
                            ownershipRefresh2 = (OwnershipRefresh) cVarB.v(descriptor2, 13, OwnershipRefresh.a.f50380a, ownershipRefresh2);
                            i11 |= PKIFailureInfo.certRevoked;
                            i13 = 14;
                            break;
                        case 14:
                            list3 = (List) cVarB.v(descriptor2, i13, dVarArr[i13], list3);
                            i11 |= 16384;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                category = category3;
                i12 = iE2;
                subcategory = subcategory3;
                list2 = list3;
                str = str9;
                str2 = str10;
                balance = balance3;
                ownershipRefresh = ownershipRefresh2;
                balanceRefresh = balanceRefresh3;
                str3 = str11;
                status = status3;
                str4 = strT3;
                str5 = strT4;
                z11 = zW2;
            }
            int i15 = i11;
            List list4 = list;
            cVarB.c(descriptor2);
            return new FinancialConnectionsAccount(i15, category, i12, str4, str5, z11, status, subcategory, list4, balance, balanceRefresh, str2, str, str3, ownershipRefresh, list2, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsAccount value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsAccount.q(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = FinancialConnectionsAccount.f50267q;
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{Category.c.f50284e, vo0.j0.f119632a, z1Var, z1Var, vo0.h.f119620a, Status.c.f50288e, Subcategory.c.f50290e, dVarArr[7], so0.a.p(Balance.a.f50260a), so0.a.p(BalanceRefresh.a.f50265a), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(OwnershipRefresh.a.f50380a), so0.a.p(dVarArr[14])};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAccount$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "serializer", "()Lro0/d;", "", "OBJECT_NEW", "Ljava/lang/String;", "OBJECT_OLD", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsAccount> serializer() {
            return a.f50293a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<FinancialConnectionsAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsAccount createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            Category categoryValueOf = Category.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            Status statusValueOf = Status.valueOf(parcel.readString());
            Subcategory subcategoryValueOf = Subcategory.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(SupportedPaymentMethodTypes.valueOf(parcel.readString()));
            }
            ArrayList arrayList2 = null;
            Balance balanceCreateFromParcel = parcel.readInt() == 0 ? null : Balance.CREATOR.createFromParcel(parcel);
            BalanceRefresh balanceRefreshCreateFromParcel = parcel.readInt() == 0 ? null : BalanceRefresh.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            OwnershipRefresh ownershipRefreshCreateFromParcel = parcel.readInt() == 0 ? null : OwnershipRefresh.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList3.add(Permissions.valueOf(parcel.readString()));
                }
                arrayList2 = arrayList3;
            }
            return new FinancialConnectionsAccount(categoryValueOf, i11, string, string2, z11, statusValueOf, subcategoryValueOf, arrayList, balanceCreateFromParcel, balanceRefreshCreateFromParcel, string3, string4, string5, ownershipRefreshCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsAccount[] newArray(int i11) {
            return new FinancialConnectionsAccount[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public /* synthetic */ FinancialConnectionsAccount(int i11, @ro0.o("category") Category category, @ro0.o("created") int i12, @ro0.o("id") String str, @ro0.o("institution_name") String str2, @ro0.o("livemode") boolean z11, @ro0.o(PermissionsResponse.STATUS_KEY) Status status, @ro0.o("subcategory") Subcategory subcategory, @ro0.o("supported_payment_method_types") List list, @ro0.o("balance") Balance balance, @ro0.o("balance_refresh") BalanceRefresh balanceRefresh, @ro0.o(Columns.DISPLAY_NAME) String str3, @ro0.o("last4") String str4, @ro0.o("ownership") String str5, @ro0.o("ownership_refresh") OwnershipRefresh ownershipRefresh, @ro0.o("permissions") List list2, v1 v1Var) {
        super(null);
        if (158 != (i11 & 158)) {
            h1.b(i11, 158, a.f50293a.getDescriptor());
        }
        this.category = (i11 & 1) == 0 ? Category.UNKNOWN : category;
        this.created = i12;
        this.id = str;
        this.institutionName = str2;
        this.livemode = z11;
        if ((i11 & 32) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
        }
        if ((i11 & 64) == 0) {
            this.subcategory = Subcategory.UNKNOWN;
        } else {
            this.subcategory = subcategory;
        }
        this.supportedPaymentMethodTypes = list;
        if ((i11 & 256) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i11 & 512) == 0) {
            this.balanceRefresh = null;
        } else {
            this.balanceRefresh = balanceRefresh;
        }
        if ((i11 & 1024) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i11 & 2048) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str4;
        }
        if ((i11 & 4096) == 0) {
            this.ownership = null;
        } else {
            this.ownership = str5;
        }
        if ((i11 & PKIFailureInfo.certRevoked) == 0) {
            this.ownershipRefresh = null;
        } else {
            this.ownershipRefresh = ownershipRefresh;
        }
        if ((i11 & 16384) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list2;
        }
    }

    public static final /* synthetic */ void q(FinancialConnectionsAccount self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f50267q;
        if (output.G(serialDesc, 0) || self.category != Category.UNKNOWN) {
            output.D(serialDesc, 0, Category.c.f50284e, self.category);
        }
        output.x(serialDesc, 1, self.created);
        output.e(serialDesc, 2, self.getId());
        output.e(serialDesc, 3, self.institutionName);
        output.A(serialDesc, 4, self.livemode);
        if (output.G(serialDesc, 5) || self.status != Status.UNKNOWN) {
            output.D(serialDesc, 5, Status.c.f50288e, self.status);
        }
        if (output.G(serialDesc, 6) || self.subcategory != Subcategory.UNKNOWN) {
            output.D(serialDesc, 6, Subcategory.c.f50290e, self.subcategory);
        }
        output.D(serialDesc, 7, dVarArr[7], self.supportedPaymentMethodTypes);
        if (output.G(serialDesc, 8) || self.balance != null) {
            output.y(serialDesc, 8, Balance.a.f50260a, self.balance);
        }
        if (output.G(serialDesc, 9) || self.balanceRefresh != null) {
            output.y(serialDesc, 9, BalanceRefresh.a.f50265a, self.balanceRefresh);
        }
        if (output.G(serialDesc, 10) || self.displayName != null) {
            output.y(serialDesc, 10, z1.f119730a, self.displayName);
        }
        if (output.G(serialDesc, 11) || self.last4 != null) {
            output.y(serialDesc, 11, z1.f119730a, self.last4);
        }
        if (output.G(serialDesc, 12) || self.ownership != null) {
            output.y(serialDesc, 12, z1.f119730a, self.ownership);
        }
        if (output.G(serialDesc, 13) || self.ownershipRefresh != null) {
            output.y(serialDesc, 13, OwnershipRefresh.a.f50380a, self.ownershipRefresh);
        }
        if (!output.G(serialDesc, 14) && self.permissions == null) {
            return;
        }
        output.y(serialDesc, 14, dVarArr[14], self.permissions);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Balance getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BalanceRefresh getBalanceRefresh() {
        return this.balanceRefresh;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCreated() {
        return this.created;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAccount)) {
            return false;
        }
        FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) other;
        return this.category == financialConnectionsAccount.category && this.created == financialConnectionsAccount.created && p013kotlin.jvm.internal.s.f(this.id, financialConnectionsAccount.id) && p013kotlin.jvm.internal.s.f(this.institutionName, financialConnectionsAccount.institutionName) && this.livemode == financialConnectionsAccount.livemode && this.status == financialConnectionsAccount.status && this.subcategory == financialConnectionsAccount.subcategory && p013kotlin.jvm.internal.s.f(this.supportedPaymentMethodTypes, financialConnectionsAccount.supportedPaymentMethodTypes) && p013kotlin.jvm.internal.s.f(this.balance, financialConnectionsAccount.balance) && p013kotlin.jvm.internal.s.f(this.balanceRefresh, financialConnectionsAccount.balanceRefresh) && p013kotlin.jvm.internal.s.f(this.displayName, financialConnectionsAccount.displayName) && p013kotlin.jvm.internal.s.f(this.last4, financialConnectionsAccount.last4) && p013kotlin.jvm.internal.s.f(this.ownership, financialConnectionsAccount.ownership) && p013kotlin.jvm.internal.s.f(this.ownershipRefresh, financialConnectionsAccount.ownershipRefresh) && p013kotlin.jvm.internal.s.f(this.permissions, financialConnectionsAccount.permissions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    @Override // com.stripe.android.financialconnections.model.f0
    public String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.category.hashCode() * 31) + Integer.hashCode(this.created)) * 31) + this.id.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + Boolean.hashCode(this.livemode)) * 31) + this.status.hashCode()) * 31) + this.subcategory.hashCode()) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Balance balance = this.balance;
        int iHashCode2 = (iHashCode + (balance == null ? 0 : balance.hashCode())) * 31;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        int iHashCode3 = (iHashCode2 + (balanceRefresh == null ? 0 : balanceRefresh.hashCode())) * 31;
        String str = this.displayName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last4;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownership;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        int iHashCode7 = (iHashCode6 + (ownershipRefresh == null ? 0 : ownershipRefresh.hashCode())) * 31;
        List<Permissions> list = this.permissions;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    public final List<Permissions> j() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> m() {
        return this.supportedPaymentMethodTypes;
    }

    public String toString() {
        return "FinancialConnectionsAccount(category=" + this.category + ", created=" + this.created + ", id=" + this.id + ", institutionName=" + this.institutionName + ", livemode=" + this.livemode + ", status=" + this.status + ", subcategory=" + this.subcategory + ", supportedPaymentMethodTypes=" + this.supportedPaymentMethodTypes + ", balance=" + this.balance + ", balanceRefresh=" + this.balanceRefresh + ", displayName=" + this.displayName + ", last4=" + this.last4 + ", ownership=" + this.ownership + ", ownershipRefresh=" + this.ownershipRefresh + ", permissions=" + this.permissions + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.category.name());
        parcel.writeInt(this.created);
        parcel.writeString(this.id);
        parcel.writeString(this.institutionName);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeString(this.status.name());
        parcel.writeString(this.subcategory.name());
        List<SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        parcel.writeInt(list.size());
        Iterator<SupportedPaymentMethodTypes> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        Balance balance = this.balance;
        if (balance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balance.writeToParcel(parcel, flags);
        }
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        if (balanceRefresh == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            balanceRefresh.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.displayName);
        parcel.writeString(this.last4);
        parcel.writeString(this.ownership);
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        if (ownershipRefresh == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownershipRefresh.writeToParcel(parcel, flags);
        }
        List<Permissions> list2 = this.permissions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Permissions> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsAccount(Category category, int i11, String id2, String institutionName, boolean z11, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        super(null);
        p013kotlin.jvm.internal.s.k(category, "category");
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(institutionName, "institutionName");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(subcategory, "subcategory");
        p013kotlin.jvm.internal.s.k(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.category = category;
        this.created = i11;
        this.id = id2;
        this.institutionName = institutionName;
        this.livemode = z11;
        this.status = status;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balance = balance;
        this.balanceRefresh = balanceRefresh;
        this.displayName = str;
        this.last4 = str2;
        this.ownership = str3;
        this.ownershipRefresh = ownershipRefresh;
        this.permissions = list;
    }
}
