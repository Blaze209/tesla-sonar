package m60;

import c60.LinkConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import t30.CountryCode;

/* JADX INFO: renamed from: m60.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0014B_\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jp\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b$\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b-\u00104R\u0011\u00106\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00100R\u0011\u00108\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00100R\u0011\u00109\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u00100¨\u0006:"}, d2 = {"Lm60/e;", "", "Lm60/m;", "userInput", "", "merchantName", "Lm60/k;", "signupMode", "", "Lm60/j;", "fields", "", "prefillEligibleFields", "", "isExpanded", "apiFailed", "Lo60/b;", "signUpState", "<init>", "(Lm60/m;Ljava/lang/String;Lm60/k;Ljava/util/List;Ljava/util/Set;ZZLo60/b;)V", "a", "(Lm60/m;Ljava/lang/String;Lm60/k;Ljava/util/List;Ljava/util/Set;ZZLo60/b;)Lm60/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lm60/m;", IntegerTokenConverter.CONVERTER_KEY, "()Lm60/m;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Lm60/k;", "g", "()Lm60/k;", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "f", "Z", "j", "()Z", "getApiFailed$link_release", "h", "Lo60/b;", "()Lo60/b;", "l", "isShowingPhoneFirst", "k", "isShowingEmailFirst", "useLink", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InlineSignupViewState {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f91372j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final m userInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final k signupMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<j> fields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<j> prefillEligibleFields;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean apiFailed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final o60.b signUpState;

    /* JADX INFO: renamed from: m60.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm60/e$a;", "", "<init>", "()V", "Lm60/k;", "signupMode", "Lc60/c;", "config", "Lm60/e;", "a", "(Lm60/k;Lc60/c;)Lm60/e;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: m60.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C1950a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91381a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.InsteadOfSaveForFutureUse.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.AlongsideSaveForFutureUse.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f91381a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InlineSignupViewState a(k signupMode, LinkConfiguration config) {
            Set setR1;
            s.k(signupMode, "signupMode");
            s.k(config, "config");
            boolean z11 = signupMode == k.AlongsideSaveForFutureUse;
            LinkConfiguration.CustomerInfo customerInfo = config.getCustomerInfo();
            List listC = v.c();
            String email = customerInfo.getEmail();
            boolean z12 = email == null || t.y0(email);
            if (z11 && !z12) {
                listC.add(j.Phone);
                listC.add(j.Email);
            } else if (z11) {
                listC.add(j.Email);
                listC.add(j.Phone);
            } else {
                listC.add(j.Email);
                listC.add(j.Phone);
            }
            if (!s.f(config.getStripeIntent().getCountryCode(), CountryCode.INSTANCE.b().getValue())) {
                listC.add(j.Name);
            }
            List listA = v.a(listC);
            int i11 = C1950a.f91381a[signupMode.ordinal()];
            if (i11 == 1) {
                setR1 = v.r1(listA);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setR1 = d1.m(v.r1(listA), v.o0(listA));
            }
            return new InlineSignupViewState(null, config.getMerchantName(), signupMode, listA, setR1, false, false, null, 224, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: m60.e$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91382a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.AlongsideSaveForFutureUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.InsteadOfSaveForFutureUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91382a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineSignupViewState(m mVar, String merchantName, k kVar, List<? extends j> fields, Set<? extends j> prefillEligibleFields, boolean z11, boolean z12, o60.b signUpState) {
        s.k(merchantName, "merchantName");
        s.k(fields, "fields");
        s.k(prefillEligibleFields, "prefillEligibleFields");
        s.k(signUpState, "signUpState");
        this.userInput = mVar;
        this.merchantName = merchantName;
        this.signupMode = kVar;
        this.fields = fields;
        this.prefillEligibleFields = prefillEligibleFields;
        this.isExpanded = z11;
        this.apiFailed = z12;
        this.signUpState = signUpState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InlineSignupViewState b(InlineSignupViewState inlineSignupViewState, m mVar, String str, k kVar, List list, Set set, boolean z11, boolean z12, o60.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = inlineSignupViewState.userInput;
        }
        if ((i11 & 2) != 0) {
            str = inlineSignupViewState.merchantName;
        }
        if ((i11 & 4) != 0) {
            kVar = inlineSignupViewState.signupMode;
        }
        if ((i11 & 8) != 0) {
            list = inlineSignupViewState.fields;
        }
        if ((i11 & 16) != 0) {
            set = inlineSignupViewState.prefillEligibleFields;
        }
        if ((i11 & 32) != 0) {
            z11 = inlineSignupViewState.isExpanded;
        }
        if ((i11 & 64) != 0) {
            z12 = inlineSignupViewState.apiFailed;
        }
        if ((i11 & 128) != 0) {
            bVar = inlineSignupViewState.signUpState;
        }
        boolean z13 = z12;
        o60.b bVar2 = bVar;
        Set set2 = set;
        boolean z14 = z11;
        return inlineSignupViewState.a(mVar, str, kVar, list, set2, z14, z13, bVar2);
    }

    public final InlineSignupViewState a(m userInput, String merchantName, k signupMode, List<? extends j> fields, Set<? extends j> prefillEligibleFields, boolean isExpanded, boolean apiFailed, o60.b signUpState) {
        s.k(merchantName, "merchantName");
        s.k(fields, "fields");
        s.k(prefillEligibleFields, "prefillEligibleFields");
        s.k(signUpState, "signUpState");
        return new InlineSignupViewState(userInput, merchantName, signupMode, fields, prefillEligibleFields, isExpanded, apiFailed, signUpState);
    }

    public final List<j> c() {
        return this.fields;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final Set<j> e() {
        return this.prefillEligibleFields;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineSignupViewState)) {
            return false;
        }
        InlineSignupViewState inlineSignupViewState = (InlineSignupViewState) other;
        return s.f(this.userInput, inlineSignupViewState.userInput) && s.f(this.merchantName, inlineSignupViewState.merchantName) && this.signupMode == inlineSignupViewState.signupMode && s.f(this.fields, inlineSignupViewState.fields) && s.f(this.prefillEligibleFields, inlineSignupViewState.prefillEligibleFields) && this.isExpanded == inlineSignupViewState.isExpanded && this.apiFailed == inlineSignupViewState.apiFailed && this.signUpState == inlineSignupViewState.signUpState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o60.b getSignUpState() {
        return this.signUpState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getSignupMode() {
        return this.signupMode;
    }

    public final boolean h() {
        k kVar = this.signupMode;
        int i11 = kVar == null ? -1 : b.f91382a[kVar.ordinal()];
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return this.isExpanded && !this.apiFailed;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.userInput != null && !this.apiFailed) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        m mVar = this.userInput;
        int iHashCode = (((mVar == null ? 0 : mVar.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        k kVar = this.signupMode;
        return ((((((((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.fields.hashCode()) * 31) + this.prefillEligibleFields.hashCode()) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.apiFailed)) * 31) + this.signUpState.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m getUserInput() {
        return this.userInput;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final boolean k() {
        return v.o0(this.fields) == j.Email;
    }

    public final boolean l() {
        return v.o0(this.fields) == j.Phone;
    }

    public String toString() {
        return "InlineSignupViewState(userInput=" + this.userInput + ", merchantName=" + this.merchantName + ", signupMode=" + this.signupMode + ", fields=" + this.fields + ", prefillEligibleFields=" + this.prefillEligibleFields + ", isExpanded=" + this.isExpanded + ", apiFailed=" + this.apiFailed + ", signUpState=" + this.signUpState + ")";
    }

    public /* synthetic */ InlineSignupViewState(m mVar, String str, k kVar, List list, Set set, boolean z11, boolean z12, o60.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, str, kVar, list, set, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? o60.b.InputtingPrimaryField : bVar);
    }
}
