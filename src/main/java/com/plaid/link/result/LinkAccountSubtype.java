package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import jn0.m;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype;", "Landroid/os/Parcelable;", "json", "", "accountType", "Lcom/plaid/link/result/LinkAccountType;", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "getAccountType", "()Lcom/plaid/link/result/LinkAccountType;", "getJson", "()Ljava/lang/String;", "CREDIT", "Companion", "DEPOSITORY", "INVESTMENT", "LOAN_SUBTYPE", "OTHER", "UNKNOWN", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LinkAccountSubtype implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Map<LinkAccountType, Map<String, LinkAccountSubtype>>> accountTypeToMap$delegate = m.b(LinkAccountSubtype$Companion$accountTypeToMap$2.INSTANCE);
    private static final Lazy<Map<String, CREDIT>> creditMap$delegate = m.b(LinkAccountSubtype$Companion$creditMap$2.INSTANCE);
    private static final Lazy<Map<String, DEPOSITORY>> depositoryMap$delegate = m.b(LinkAccountSubtype$Companion$depositoryMap$2.INSTANCE);
    private static final Lazy<Map<String, INVESTMENT>> investmentMap$delegate = m.b(LinkAccountSubtype$Companion$investmentMap$2.INSTANCE);
    private static final Lazy<Map<String, LOAN_SUBTYPE>> loanMap$delegate = m.b(LinkAccountSubtype$Companion$loanMap$2.INSTANCE);
    private final LinkAccountType accountType;
    private final String json;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "CREDIT_CARD", "PAYPAL_CREDIT", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CREDIT extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends CREDIT {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CREDIT_CARD extends CREDIT {
            public static final CREDIT_CARD INSTANCE = new CREDIT_CARD();
            public static final Parcelable.Creator<CREDIT_CARD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CREDIT_CARD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CREDIT_CARD createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CREDIT_CARD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CREDIT_CARD[] newArray(int i11) {
                    return new CREDIT_CARD[i11];
                }
            }

            private CREDIT_CARD() {
                super("credit card", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL_CREDIT extends CREDIT {
            public static final PAYPAL_CREDIT INSTANCE = new PAYPAL_CREDIT();
            public static final Parcelable.Creator<PAYPAL_CREDIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYPAL_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL_CREDIT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL_CREDIT[] newArray(int i11) {
                    return new PAYPAL_CREDIT[i11];
                }
            }

            private PAYPAL_CREDIT() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ CREDIT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private CREDIT(String str) {
            super(str, LinkAccountType.CREDIT.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006R3\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR'\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR'\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$Companion;", "", "()V", "accountTypeToMap", "", "Lcom/plaid/link/result/LinkAccountType;", "", "Lcom/plaid/link/result/LinkAccountSubtype;", "getAccountTypeToMap", "()Ljava/util/Map;", "accountTypeToMap$delegate", "Lkotlin/Lazy;", "creditMap", "getCreditMap", "creditMap$delegate", "depositoryMap", "getDepositoryMap", "depositoryMap$delegate", "investmentMap", "getInvestmentMap", "investmentMap$delegate", "loanMap", "getLoanMap", "loanMap$delegate", "convert", "subtypeJson", "accountTypeJson", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<LinkAccountType, Map<String, LinkAccountSubtype>> getAccountTypeToMap() {
            return (Map) LinkAccountSubtype.accountTypeToMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getCreditMap() {
            return (Map) LinkAccountSubtype.creditMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getDepositoryMap() {
            return (Map) LinkAccountSubtype.depositoryMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getInvestmentMap() {
            return (Map) LinkAccountSubtype.investmentMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getLoanMap() {
            return (Map) LinkAccountSubtype.loanMap$delegate.getValue();
        }

        public final LinkAccountSubtype convert(String subtypeJson, String accountTypeJson) {
            LinkAccountSubtype linkAccountSubtype;
            LinkAccountType.Companion companion = LinkAccountType.INSTANCE;
            if (accountTypeJson == null) {
                accountTypeJson = "";
            }
            LinkAccountType linkAccountTypeConvert = companion.convert(accountTypeJson);
            if (s.f(linkAccountTypeConvert, LinkAccountType.OTHER.INSTANCE)) {
                return OTHER.C0762OTHER.INSTANCE;
            }
            Map<String, LinkAccountSubtype> map = getAccountTypeToMap().get(linkAccountTypeConvert);
            if (map != null && (linkAccountSubtype = map.get(subtypeJson)) != null) {
                return linkAccountSubtype;
            }
            if (subtypeJson == null) {
                subtypeJson = "";
            }
            return new UNKNOWN(subtypeJson, linkAccountTypeConvert);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "CASH_MANAGEMENT", "CD", "CHECKING", "EBT", "HSA", "MONEY_MARKET", "PAYPAL", "PREPAID", "SAVINGS", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DEPOSITORY extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends DEPOSITORY {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_MANAGEMENT extends DEPOSITORY {
            public static final CASH_MANAGEMENT INSTANCE = new CASH_MANAGEMENT();
            public static final Parcelable.Creator<CASH_MANAGEMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CASH_MANAGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_MANAGEMENT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CASH_MANAGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_MANAGEMENT[] newArray(int i11) {
                    return new CASH_MANAGEMENT[i11];
                }
            }

            private CASH_MANAGEMENT() {
                super("cash management", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CD extends DEPOSITORY {
            public static final CD INSTANCE = new CD();
            public static final Parcelable.Creator<CD> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CD createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CD[] newArray(int i11) {
                    return new CD[i11];
                }
            }

            private CD() {
                super("cd", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CHECKING extends DEPOSITORY {
            public static final CHECKING INSTANCE = new CHECKING();
            public static final Parcelable.Creator<CHECKING> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CHECKING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CHECKING createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CHECKING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CHECKING[] newArray(int i11) {
                    return new CHECKING[i11];
                }
            }

            private CHECKING() {
                super("checking", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EBT extends DEPOSITORY {
            public static final EBT INSTANCE = new EBT();
            public static final Parcelable.Creator<EBT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EBT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EBT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return EBT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EBT[] newArray(int i11) {
                    return new EBT[i11];
                }
            }

            private EBT() {
                super("ebt", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends DEPOSITORY {
            public static final HSA INSTANCE = new HSA();
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA[] newArray(int i11) {
                    return new HSA[i11];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MONEY_MARKET extends DEPOSITORY {
            public static final MONEY_MARKET INSTANCE = new MONEY_MARKET();
            public static final Parcelable.Creator<MONEY_MARKET> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MONEY_MARKET> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MONEY_MARKET createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return MONEY_MARKET.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MONEY_MARKET[] newArray(int i11) {
                    return new MONEY_MARKET[i11];
                }
            }

            private MONEY_MARKET() {
                super("money market", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL extends DEPOSITORY {
            public static final PAYPAL INSTANCE = new PAYPAL();
            public static final Parcelable.Creator<PAYPAL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PAYPAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL[] newArray(int i11) {
                    return new PAYPAL[i11];
                }
            }

            private PAYPAL() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PREPAID extends DEPOSITORY {
            public static final PREPAID INSTANCE = new PREPAID();
            public static final Parcelable.Creator<PREPAID> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PREPAID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PREPAID createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PREPAID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PREPAID[] newArray(int i11) {
                    return new PREPAID[i11];
                }
            }

            private PREPAID() {
                super("prepaid", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SAVINGS extends DEPOSITORY {
            public static final SAVINGS INSTANCE = new SAVINGS();
            public static final Parcelable.Creator<SAVINGS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SAVINGS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SAVINGS createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return SAVINGS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SAVINGS[] newArray(int i11) {
                    return new SAVINGS[i11];
                }
            }

            private SAVINGS() {
                super("savings", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ DEPOSITORY(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private DEPOSITORY(String str) {
            super(str, LinkAccountType.DEPOSITORY.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:.\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001.3456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "BROKERAGE", "CASH_ISA", "EDUCATION_SAVINGS_ACCOUNT", "FIXED_ANNUITY", "GIC", "HEALTH_REIMBURSEMENT_ARRANGEMENT", "HSA", "INVESTMENT_401A", "INVESTMENT_401K", "INVESTMENT_403B", "INVESTMENT_457B", "INVESTMENT_529", "IRA", "ISA", "KEOGH", "LIF", "LIRA", "LRIF", "LRSP", "MUTUAL_FUND", "NON_TAXABLE_BROKERAGE_ACCOUNTT", "OTHER", "PENSION", "PRIF", "PROFIT_SHARING_PLAN", "QSHR", "RDSP", "RESP", "RETIREMENT", "RLIF", "ROTH", "ROTH_401K", "RRIF", "RRSP", "SARSEP", "SEP_IRA", "SIMPLE_IRA", "SIPP", "STOCK_PLAN", "TFSA", "THRIFT_SAVINGS_PLAN", "TRUST", "UGMA", "UTMA", "VARIABLE_ANNUITY", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class INVESTMENT extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends INVESTMENT {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BROKERAGE extends INVESTMENT {
            public static final BROKERAGE INSTANCE = new BROKERAGE();
            public static final Parcelable.Creator<BROKERAGE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BROKERAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BROKERAGE createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return BROKERAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BROKERAGE[] newArray(int i11) {
                    return new BROKERAGE[i11];
                }
            }

            private BROKERAGE() {
                super("brokerage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_ISA extends INVESTMENT {
            public static final CASH_ISA INSTANCE = new CASH_ISA();
            public static final Parcelable.Creator<CASH_ISA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CASH_ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_ISA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CASH_ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_ISA[] newArray(int i11) {
                    return new CASH_ISA[i11];
                }
            }

            private CASH_ISA() {
                super("cash isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EDUCATION_SAVINGS_ACCOUNT extends INVESTMENT {
            public static final EDUCATION_SAVINGS_ACCOUNT INSTANCE = new EDUCATION_SAVINGS_ACCOUNT();
            public static final Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EDUCATION_SAVINGS_ACCOUNT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EDUCATION_SAVINGS_ACCOUNT[] newArray(int i11) {
                    return new EDUCATION_SAVINGS_ACCOUNT[i11];
                }
            }

            private EDUCATION_SAVINGS_ACCOUNT() {
                super("education savings account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FIXED_ANNUITY extends INVESTMENT {
            public static final FIXED_ANNUITY INSTANCE = new FIXED_ANNUITY();
            public static final Parcelable.Creator<FIXED_ANNUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FIXED_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIXED_ANNUITY createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return FIXED_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIXED_ANNUITY[] newArray(int i11) {
                    return new FIXED_ANNUITY[i11];
                }
            }

            private FIXED_ANNUITY() {
                super("fixed annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class GIC extends INVESTMENT {
            public static final GIC INSTANCE = new GIC();
            public static final Parcelable.Creator<GIC> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<GIC> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GIC createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return GIC.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GIC[] newArray(int i11) {
                    return new GIC[i11];
                }
            }

            private GIC() {
                super("gic", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HEALTH_REIMBURSEMENT_ARRANGEMENT extends INVESTMENT {
            public static final HEALTH_REIMBURSEMENT_ARRANGEMENT INSTANCE = new HEALTH_REIMBURSEMENT_ARRANGEMENT();
            public static final Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT[] newArray(int i11) {
                    return new HEALTH_REIMBURSEMENT_ARRANGEMENT[i11];
                }
            }

            private HEALTH_REIMBURSEMENT_ARRANGEMENT() {
                super("health reimbursement arrangement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends INVESTMENT {
            public static final HSA INSTANCE = new HSA();
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA[] newArray(int i11) {
                    return new HSA[i11];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401A extends INVESTMENT {
            public static final INVESTMENT_401A INSTANCE = new INVESTMENT_401A();
            public static final Parcelable.Creator<INVESTMENT_401A> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401A> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401A createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401A.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401A[] newArray(int i11) {
                    return new INVESTMENT_401A[i11];
                }
            }

            private INVESTMENT_401A() {
                super("401a", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401K extends INVESTMENT {
            public static final INVESTMENT_401K INSTANCE = new INVESTMENT_401K();
            public static final Parcelable.Creator<INVESTMENT_401K> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401K createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401K[] newArray(int i11) {
                    return new INVESTMENT_401K[i11];
                }
            }

            private INVESTMENT_401K() {
                super("401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_403B extends INVESTMENT {
            public static final INVESTMENT_403B INSTANCE = new INVESTMENT_403B();
            public static final Parcelable.Creator<INVESTMENT_403B> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_403B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_403B createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_403B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_403B[] newArray(int i11) {
                    return new INVESTMENT_403B[i11];
                }
            }

            private INVESTMENT_403B() {
                super("403B", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_457B extends INVESTMENT {
            public static final INVESTMENT_457B INSTANCE = new INVESTMENT_457B();
            public static final Parcelable.Creator<INVESTMENT_457B> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_457B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_457B createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_457B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_457B[] newArray(int i11) {
                    return new INVESTMENT_457B[i11];
                }
            }

            private INVESTMENT_457B() {
                super("457b", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_529 extends INVESTMENT {
            public static final INVESTMENT_529 INSTANCE = new INVESTMENT_529();
            public static final Parcelable.Creator<INVESTMENT_529> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<INVESTMENT_529> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_529 createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_529.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_529[] newArray(int i11) {
                    return new INVESTMENT_529[i11];
                }
            }

            private INVESTMENT_529() {
                super("529", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IRA extends INVESTMENT {
            public static final IRA INSTANCE = new IRA();
            public static final Parcelable.Creator<IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IRA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IRA[] newArray(int i11) {
                    return new IRA[i11];
                }
            }

            private IRA() {
                super("ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ISA extends INVESTMENT {
            public static final ISA INSTANCE = new ISA();
            public static final Parcelable.Creator<ISA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ISA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ISA[] newArray(int i11) {
                    return new ISA[i11];
                }
            }

            private ISA() {
                super("isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class KEOGH extends INVESTMENT {
            public static final KEOGH INSTANCE = new KEOGH();
            public static final Parcelable.Creator<KEOGH> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<KEOGH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final KEOGH createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return KEOGH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final KEOGH[] newArray(int i11) {
                    return new KEOGH[i11];
                }
            }

            private KEOGH() {
                super("keogh", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIF extends INVESTMENT {
            public static final LIF INSTANCE = new LIF();
            public static final Parcelable.Creator<LIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIF createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIF[] newArray(int i11) {
                    return new LIF[i11];
                }
            }

            private LIF() {
                super("lif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIRA extends INVESTMENT {
            public static final LIRA INSTANCE = new LIRA();
            public static final Parcelable.Creator<LIRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LIRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIRA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LIRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIRA[] newArray(int i11) {
                    return new LIRA[i11];
                }
            }

            private LIRA() {
                super("lira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRIF extends INVESTMENT {
            public static final LRIF INSTANCE = new LRIF();
            public static final Parcelable.Creator<LRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRIF createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRIF[] newArray(int i11) {
                    return new LRIF[i11];
                }
            }

            private LRIF() {
                super("lrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRSP extends INVESTMENT {
            public static final LRSP INSTANCE = new LRSP();
            public static final Parcelable.Creator<LRSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRSP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRSP[] newArray(int i11) {
                    return new LRSP[i11];
                }
            }

            private LRSP() {
                super("lrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MUTUAL_FUND extends INVESTMENT {
            public static final MUTUAL_FUND INSTANCE = new MUTUAL_FUND();
            public static final Parcelable.Creator<MUTUAL_FUND> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MUTUAL_FUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MUTUAL_FUND createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return MUTUAL_FUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MUTUAL_FUND[] newArray(int i11) {
                    return new MUTUAL_FUND[i11];
                }
            }

            private MUTUAL_FUND() {
                super("mutual fund", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NON_TAXABLE_BROKERAGE_ACCOUNTT extends INVESTMENT {
            public static final NON_TAXABLE_BROKERAGE_ACCOUNTT INSTANCE = new NON_TAXABLE_BROKERAGE_ACCOUNTT();
            public static final Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT[] newArray(int i11) {
                    return new NON_TAXABLE_BROKERAGE_ACCOUNTT[i11];
                }
            }

            private NON_TAXABLE_BROKERAGE_ACCOUNTT() {
                super("non-taxable brokerage account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends INVESTMENT {
            public static final OTHER INSTANCE = new OTHER();
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER[] newArray(int i11) {
                    return new OTHER[i11];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PENSION extends INVESTMENT {
            public static final PENSION INSTANCE = new PENSION();
            public static final Parcelable.Creator<PENSION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PENSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PENSION createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PENSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PENSION[] newArray(int i11) {
                    return new PENSION[i11];
                }
            }

            private PENSION() {
                super("pension", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRIF extends INVESTMENT {
            public static final PRIF INSTANCE = new PRIF();
            public static final Parcelable.Creator<PRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRIF createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRIF[] newArray(int i11) {
                    return new PRIF[i11];
                }
            }

            private PRIF() {
                super("prif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PROFIT_SHARING_PLAN extends INVESTMENT {
            public static final PROFIT_SHARING_PLAN INSTANCE = new PROFIT_SHARING_PLAN();
            public static final Parcelable.Creator<PROFIT_SHARING_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PROFIT_SHARING_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PROFIT_SHARING_PLAN createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return PROFIT_SHARING_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PROFIT_SHARING_PLAN[] newArray(int i11) {
                    return new PROFIT_SHARING_PLAN[i11];
                }
            }

            private PROFIT_SHARING_PLAN() {
                super("profit sharing plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class QSHR extends INVESTMENT {
            public static final QSHR INSTANCE = new QSHR();
            public static final Parcelable.Creator<QSHR> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<QSHR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final QSHR createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return QSHR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final QSHR[] newArray(int i11) {
                    return new QSHR[i11];
                }
            }

            private QSHR() {
                super("qshr", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RDSP extends INVESTMENT {
            public static final RDSP INSTANCE = new RDSP();
            public static final Parcelable.Creator<RDSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RDSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RDSP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RDSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RDSP[] newArray(int i11) {
                    return new RDSP[i11];
                }
            }

            private RDSP() {
                super("rdsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RESP extends INVESTMENT {
            public static final RESP INSTANCE = new RESP();
            public static final Parcelable.Creator<RESP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RESP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RESP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RESP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RESP[] newArray(int i11) {
                    return new RESP[i11];
                }
            }

            private RESP() {
                super("resp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RETIREMENT extends INVESTMENT {
            public static final RETIREMENT INSTANCE = new RETIREMENT();
            public static final Parcelable.Creator<RETIREMENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RETIREMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RETIREMENT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RETIREMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RETIREMENT[] newArray(int i11) {
                    return new RETIREMENT[i11];
                }
            }

            private RETIREMENT() {
                super("retirement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RLIF extends INVESTMENT {
            public static final RLIF INSTANCE = new RLIF();
            public static final Parcelable.Creator<RLIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RLIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RLIF createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RLIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RLIF[] newArray(int i11) {
                    return new RLIF[i11];
                }
            }

            private RLIF() {
                super("rlif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH extends INVESTMENT {
            public static final ROTH INSTANCE = new ROTH();
            public static final Parcelable.Creator<ROTH> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ROTH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ROTH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH[] newArray(int i11) {
                    return new ROTH[i11];
                }
            }

            private ROTH() {
                super("roth", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH_401K extends INVESTMENT {
            public static final ROTH_401K INSTANCE = new ROTH_401K();
            public static final Parcelable.Creator<ROTH_401K> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ROTH_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH_401K createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ROTH_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH_401K[] newArray(int i11) {
                    return new ROTH_401K[i11];
                }
            }

            private ROTH_401K() {
                super("roth 401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRIF extends INVESTMENT {
            public static final RRIF INSTANCE = new RRIF();
            public static final Parcelable.Creator<RRIF> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRIF createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRIF[] newArray(int i11) {
                    return new RRIF[i11];
                }
            }

            private RRIF() {
                super("rrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRSP extends INVESTMENT {
            public static final RRSP INSTANCE = new RRSP();
            public static final Parcelable.Creator<RRSP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRSP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return RRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRSP[] newArray(int i11) {
                    return new RRSP[i11];
                }
            }

            private RRSP() {
                super("rrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SARSEP extends INVESTMENT {
            public static final SARSEP INSTANCE = new SARSEP();
            public static final Parcelable.Creator<SARSEP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SARSEP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SARSEP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return SARSEP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SARSEP[] newArray(int i11) {
                    return new SARSEP[i11];
                }
            }

            private SARSEP() {
                super("sarsep", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SEP_IRA extends INVESTMENT {
            public static final SEP_IRA INSTANCE = new SEP_IRA();
            public static final Parcelable.Creator<SEP_IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SEP_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SEP_IRA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return SEP_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SEP_IRA[] newArray(int i11) {
                    return new SEP_IRA[i11];
                }
            }

            private SEP_IRA() {
                super("sep ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIMPLE_IRA extends INVESTMENT {
            public static final SIMPLE_IRA INSTANCE = new SIMPLE_IRA();
            public static final Parcelable.Creator<SIMPLE_IRA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SIMPLE_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIMPLE_IRA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return SIMPLE_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIMPLE_IRA[] newArray(int i11) {
                    return new SIMPLE_IRA[i11];
                }
            }

            private SIMPLE_IRA() {
                super("simple ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIPP extends INVESTMENT {
            public static final SIPP INSTANCE = new SIPP();
            public static final Parcelable.Creator<SIPP> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SIPP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIPP createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return SIPP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIPP[] newArray(int i11) {
                    return new SIPP[i11];
                }
            }

            private SIPP() {
                super("sipp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STOCK_PLAN extends INVESTMENT {
            public static final STOCK_PLAN INSTANCE = new STOCK_PLAN();
            public static final Parcelable.Creator<STOCK_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<STOCK_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STOCK_PLAN createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return STOCK_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STOCK_PLAN[] newArray(int i11) {
                    return new STOCK_PLAN[i11];
                }
            }

            private STOCK_PLAN() {
                super("stock plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TFSA extends INVESTMENT {
            public static final TFSA INSTANCE = new TFSA();
            public static final Parcelable.Creator<TFSA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TFSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TFSA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return TFSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TFSA[] newArray(int i11) {
                    return new TFSA[i11];
                }
            }

            private TFSA() {
                super("tfsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class THRIFT_SAVINGS_PLAN extends INVESTMENT {
            public static final THRIFT_SAVINGS_PLAN INSTANCE = new THRIFT_SAVINGS_PLAN();
            public static final Parcelable.Creator<THRIFT_SAVINGS_PLAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<THRIFT_SAVINGS_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final THRIFT_SAVINGS_PLAN createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return THRIFT_SAVINGS_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final THRIFT_SAVINGS_PLAN[] newArray(int i11) {
                    return new THRIFT_SAVINGS_PLAN[i11];
                }
            }

            private THRIFT_SAVINGS_PLAN() {
                super("thrift savings plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TRUST extends INVESTMENT {
            public static final TRUST INSTANCE = new TRUST();
            public static final Parcelable.Creator<TRUST> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TRUST> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRUST createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return TRUST.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRUST[] newArray(int i11) {
                    return new TRUST[i11];
                }
            }

            private TRUST() {
                super("trust", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UGMA extends INVESTMENT {
            public static final UGMA INSTANCE = new UGMA();
            public static final Parcelable.Creator<UGMA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UGMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UGMA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return UGMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UGMA[] newArray(int i11) {
                    return new UGMA[i11];
                }
            }

            private UGMA() {
                super("ugma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UTMA extends INVESTMENT {
            public static final UTMA INSTANCE = new UTMA();
            public static final Parcelable.Creator<UTMA> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UTMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UTMA createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return UTMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UTMA[] newArray(int i11) {
                    return new UTMA[i11];
                }
            }

            private UTMA() {
                super("utma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VARIABLE_ANNUITY extends INVESTMENT {
            public static final VARIABLE_ANNUITY INSTANCE = new VARIABLE_ANNUITY();
            public static final Parcelable.Creator<VARIABLE_ANNUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VARIABLE_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VARIABLE_ANNUITY createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return VARIABLE_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VARIABLE_ANNUITY[] newArray(int i11) {
                    return new VARIABLE_ANNUITY[i11];
                }
            }

            private VARIABLE_ANNUITY() {
                super("variable annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ INVESTMENT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private INVESTMENT(String str) {
            super(str, LinkAccountType.INVESTMENT.INSTANCE, null);
        }

        public /* synthetic */ INVESTMENT(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "ALL", "AUTO", "BUSINESS", "COMMERCIAL", "CONSTRUCTION", "CONSUMER", "HOME_EQUITY", "LINE_OF_CREDIT", "LOAN", "MORTGAGE", "OTHER", "OVERDRAFT", "STUDENT", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LOAN_SUBTYPE extends LinkAccountSubtype {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends LOAN_SUBTYPE {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AUTO extends LOAN_SUBTYPE {
            public static final AUTO INSTANCE = new AUTO();
            public static final Parcelable.Creator<AUTO> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AUTO> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTO createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return AUTO.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTO[] newArray(int i11) {
                    return new AUTO[i11];
                }
            }

            private AUTO() {
                super(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BUSINESS extends LOAN_SUBTYPE {
            public static final BUSINESS INSTANCE = new BUSINESS();
            public static final Parcelable.Creator<BUSINESS> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BUSINESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BUSINESS createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return BUSINESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BUSINESS[] newArray(int i11) {
                    return new BUSINESS[i11];
                }
            }

            private BUSINESS() {
                super("business", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class COMMERCIAL extends LOAN_SUBTYPE {
            public static final COMMERCIAL INSTANCE = new COMMERCIAL();
            public static final Parcelable.Creator<COMMERCIAL> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<COMMERCIAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final COMMERCIAL createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return COMMERCIAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final COMMERCIAL[] newArray(int i11) {
                    return new COMMERCIAL[i11];
                }
            }

            private COMMERCIAL() {
                super("commercial", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSTRUCTION extends LOAN_SUBTYPE {
            public static final CONSTRUCTION INSTANCE = new CONSTRUCTION();
            public static final Parcelable.Creator<CONSTRUCTION> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CONSTRUCTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSTRUCTION createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CONSTRUCTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSTRUCTION[] newArray(int i11) {
                    return new CONSTRUCTION[i11];
                }
            }

            private CONSTRUCTION() {
                super("construction", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSUMER extends LOAN_SUBTYPE {
            public static final CONSUMER INSTANCE = new CONSUMER();
            public static final Parcelable.Creator<CONSUMER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CONSUMER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSUMER createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return CONSUMER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSUMER[] newArray(int i11) {
                    return new CONSUMER[i11];
                }
            }

            private CONSUMER() {
                super("consumer", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HOME_EQUITY extends LOAN_SUBTYPE {
            public static final HOME_EQUITY INSTANCE = new HOME_EQUITY();
            public static final Parcelable.Creator<HOME_EQUITY> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HOME_EQUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HOME_EQUITY createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return HOME_EQUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HOME_EQUITY[] newArray(int i11) {
                    return new HOME_EQUITY[i11];
                }
            }

            private HOME_EQUITY() {
                super("home equity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LINE_OF_CREDIT extends LOAN_SUBTYPE {
            public static final LINE_OF_CREDIT INSTANCE = new LINE_OF_CREDIT();
            public static final Parcelable.Creator<LINE_OF_CREDIT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LINE_OF_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LINE_OF_CREDIT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LINE_OF_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LINE_OF_CREDIT[] newArray(int i11) {
                    return new LINE_OF_CREDIT[i11];
                }
            }

            private LINE_OF_CREDIT() {
                super("line of credit", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LOAN extends LOAN_SUBTYPE {
            public static final LOAN INSTANCE = new LOAN();
            public static final Parcelable.Creator<LOAN> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LOAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LOAN createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return LOAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LOAN[] newArray(int i11) {
                    return new LOAN[i11];
                }
            }

            private LOAN() {
                super("loan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MORTGAGE extends LOAN_SUBTYPE {
            public static final MORTGAGE INSTANCE = new MORTGAGE();
            public static final Parcelable.Creator<MORTGAGE> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MORTGAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MORTGAGE createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return MORTGAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MORTGAGE[] newArray(int i11) {
                    return new MORTGAGE[i11];
                }
            }

            private MORTGAGE() {
                super("mortgage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends LOAN_SUBTYPE {
            public static final OTHER INSTANCE = new OTHER();
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER[] newArray(int i11) {
                    return new OTHER[i11];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OVERDRAFT extends LOAN_SUBTYPE {
            public static final OVERDRAFT INSTANCE = new OVERDRAFT();
            public static final Parcelable.Creator<OVERDRAFT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OVERDRAFT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OVERDRAFT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return OVERDRAFT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OVERDRAFT[] newArray(int i11) {
                    return new OVERDRAFT[i11];
                }
            }

            private OVERDRAFT() {
                super("overdraft", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STUDENT extends LOAN_SUBTYPE {
            public static final STUDENT INSTANCE = new STUDENT();
            public static final Parcelable.Creator<STUDENT> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<STUDENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STUDENT createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return STUDENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STUDENT[] newArray(int i11) {
                    return new STUDENT[i11];
                }
            }

            private STUDENT() {
                super("student", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private LOAN_SUBTYPE(String str) {
            super(str, LinkAccountType.LOAN.INSTANCE, null);
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype;", "json", "", "(Ljava/lang/String;)V", "OTHER", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OTHER extends LinkAccountSubtype {

        /* JADX INFO: renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0762OTHER extends OTHER {
            public static final C0762OTHER INSTANCE = new C0762OTHER();
            public static final Parcelable.Creator<C0762OTHER> CREATOR = new Creator();

            /* JADX INFO: renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER$Creator */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<C0762OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final C0762OTHER createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return C0762OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final C0762OTHER[] newArray(int i11) {
                    return new C0762OTHER[i11];
                }
            }

            private C0762OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ OTHER(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private OTHER(String str) {
            super(str, LinkAccountType.OTHER.INSTANCE, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "name", "Lcom/plaid/link/result/LinkAccountType;", "type", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/plaid/link/result/LinkAccountType;", "getType", "()Lcom/plaid/link/result/LinkAccountType;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkAccountSubtype {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;
        private final LinkAccountType type;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new UNKNOWN(parcel.readString(), (LinkAccountType) parcel.readParcelable(UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String name, LinkAccountType type) {
            super(name, type, null);
            s.k(name, "name");
            s.k(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!s.f(UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            s.i(other, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountSubtype.UNKNOWN");
            UNKNOWN unknown = (UNKNOWN) other;
            return s.f(this.name, unknown.name) && s.f(this.type, unknown.type);
        }

        public final String getName() {
            return this.name;
        }

        public final LinkAccountType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkAccountType);
    }

    public final LinkAccountType getAccountType() {
        return this.accountType;
    }

    public final String getJson() {
        return this.json;
    }

    private LinkAccountSubtype(String str, LinkAccountType linkAccountType) {
        this.json = str;
        this.accountType = linkAccountType;
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new LinkAccountType.UNKNOWN("") : linkAccountType, null);
    }
}
