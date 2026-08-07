package com.stripe.android.view;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \b\u0080\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B-\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lcom/stripe/android/view/o1;", "", "Lcom/stripe/android/view/p;", "", "id", "code", "displayName", "", "brandIconResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getCode", "getDisplayName", "Ljava/lang/Integer;", "getBrandIconResId", "()Ljava/lang/Integer;", "Companion", "a", "Maybank2U", "Cimb", "PublicBank", "Rhb", "HongLeongBank", "AmBank", "AffinBank", "AllianceBankBusiness", "BankIslam", "BankMuamalat", "BankRakyat", "Bsn", "Hsbc", "Kfh", "Maybank2E", "Ocbc", "StandardChartered", "UobBank", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum o1 implements p {
    Maybank2U("MB2U0227", "maybank2u", "Maybank2U", Integer.valueOf(f30.y.f64239u)),
    Cimb("BCBB0235", "cimb", "CIMB Clicks", Integer.valueOf(f30.y.f64230l)),
    PublicBank("PBB0233", "public_bank", "Public Bank", Integer.valueOf(f30.y.A)),
    Rhb("RHB0218", "rhb", "RHB Bank", Integer.valueOf(f30.y.C)),
    HongLeongBank("HLB0224", "hong_leong_bank", "Hong Leong Bank", Integer.valueOf(f30.y.f64235q)),
    AmBank("AMBB0209", "ambank", "AmBank", Integer.valueOf(f30.y.f64225g)),
    AffinBank("ABB0233", "affin_bank", "Affin Bank", Integer.valueOf(f30.y.f64223e)),
    AllianceBankBusiness("ABMB0212", "alliance_bank", "Alliance Bank", Integer.valueOf(f30.y.f64224f)),
    BankIslam("BIMB0340", "bank_islam", "Bank Islam", Integer.valueOf(f30.y.f64237s)),
    BankMuamalat("BMMB0341", "bank_muamalat", "Bank Muamalat", Integer.valueOf(f30.y.f64241w)),
    BankRakyat("BKRM0602", "bank_rakyat", "Bank Rakyat", Integer.valueOf(f30.y.B)),
    Bsn("BSN0601", "bsn", "BSN", Integer.valueOf(f30.y.f64228j)),
    Hsbc("HSBC0223", "hsbc", "HSBC Bank", Integer.valueOf(f30.y.f64236r)),
    Kfh("KFH0346", "kfh", "KFH", Integer.valueOf(f30.y.f64238t)),
    Maybank2E("MBB0228", "maybank2e", "Maybank2E", Integer.valueOf(f30.y.f64239u)),
    Ocbc("OCBC0229", "ocbc", "OCBC Bank", Integer.valueOf(f30.y.f64243y)),
    StandardChartered("SCB0216", "standard_chartered", "Standard Chartered", Integer.valueOf(f30.y.D)),
    UobBank("UOB0226", "uob", "UOB", Integer.valueOf(f30.y.I));

    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.view.o1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/o1$a;", "", "<init>", "()V", "", "bankCode", "Lcom/stripe/android/view/o1;", "a", "(Ljava/lang/String;)Lcom/stripe/android/view/o1;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o1 a(String bankCode) {
            o1 next;
            Iterator<o1> it = o1.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (p013kotlin.jvm.internal.s.f(next.getCode(), bankCode)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    o1(String str, String str2, String str3, Integer num) {
        this.id = str;
        this.code = str2;
        this.displayName = str3;
        this.brandIconResId = num;
    }

    public static final o1 get(String str) {
        return INSTANCE.a(str);
    }

    public static EnumEntries<o1> getEntries() {
        return $ENTRIES;
    }

    @Override // com.stripe.android.view.p
    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    public String getCode() {
        return this.code;
    }

    @Override // com.stripe.android.view.p
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.view.p
    public String getId() {
        return this.id;
    }

    /* synthetic */ o1(String str, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : num);
    }
}
