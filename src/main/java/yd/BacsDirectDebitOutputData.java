package yd;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ke.FieldState;
import ke.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ud.e;

/* JADX INFO: renamed from: yd.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001c\u0010$R\u0014\u0010&\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lyd/b;", "Lke/m;", "Lke/j;", "", "holderNameState", "bankAccountNumberState", "sortCodeState", "shopperEmailState", "", "isAmountConsentChecked", "isAccountConsentChecked", "Lud/e;", "mode", "<init>", "(Lke/j;Lke/j;Lke/j;Lke/j;ZZLud/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/j;", "b", "()Lke/j;", "c", "e", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "f", "Lud/e;", "()Lud/e;", "h", "isValid", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsDirectDebitOutputData implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<String> holderNameState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<String> bankAccountNumberState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<String> sortCodeState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldState<String> shopperEmailState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAmountConsentChecked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAccountConsentChecked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final e mode;

    public BacsDirectDebitOutputData(FieldState<String> holderNameState, FieldState<String> bankAccountNumberState, FieldState<String> sortCodeState, FieldState<String> shopperEmailState, boolean z11, boolean z12, e mode) {
        s.k(holderNameState, "holderNameState");
        s.k(bankAccountNumberState, "bankAccountNumberState");
        s.k(sortCodeState, "sortCodeState");
        s.k(shopperEmailState, "shopperEmailState");
        s.k(mode, "mode");
        this.holderNameState = holderNameState;
        this.bankAccountNumberState = bankAccountNumberState;
        this.sortCodeState = sortCodeState;
        this.shopperEmailState = shopperEmailState;
        this.isAmountConsentChecked = z11;
        this.isAccountConsentChecked = z12;
        this.mode = mode;
    }

    public final FieldState<String> a() {
        return this.bankAccountNumberState;
    }

    public final FieldState<String> b() {
        return this.holderNameState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getMode() {
        return this.mode;
    }

    public final FieldState<String> d() {
        return this.shopperEmailState;
    }

    public final FieldState<String> e() {
        return this.sortCodeState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsDirectDebitOutputData)) {
            return false;
        }
        BacsDirectDebitOutputData bacsDirectDebitOutputData = (BacsDirectDebitOutputData) other;
        return s.f(this.holderNameState, bacsDirectDebitOutputData.holderNameState) && s.f(this.bankAccountNumberState, bacsDirectDebitOutputData.bankAccountNumberState) && s.f(this.sortCodeState, bacsDirectDebitOutputData.sortCodeState) && s.f(this.shopperEmailState, bacsDirectDebitOutputData.shopperEmailState) && this.isAmountConsentChecked == bacsDirectDebitOutputData.isAmountConsentChecked && this.isAccountConsentChecked == bacsDirectDebitOutputData.isAccountConsentChecked && this.mode == bacsDirectDebitOutputData.mode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAccountConsentChecked() {
        return this.isAccountConsentChecked;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsAmountConsentChecked() {
        return this.isAmountConsentChecked;
    }

    public boolean h() {
        return this.holderNameState.getValidation().a() && this.bankAccountNumberState.getValidation().a() && this.sortCodeState.getValidation().a() && this.shopperEmailState.getValidation().a() && this.isAmountConsentChecked && this.isAccountConsentChecked;
    }

    public int hashCode() {
        return (((((((((((this.holderNameState.hashCode() * 31) + this.bankAccountNumberState.hashCode()) * 31) + this.sortCodeState.hashCode()) * 31) + this.shopperEmailState.hashCode()) * 31) + Boolean.hashCode(this.isAmountConsentChecked)) * 31) + Boolean.hashCode(this.isAccountConsentChecked)) * 31) + this.mode.hashCode();
    }

    public String toString() {
        return "BacsDirectDebitOutputData(holderNameState=" + this.holderNameState + ", bankAccountNumberState=" + this.bankAccountNumberState + ", sortCodeState=" + this.sortCodeState + ", shopperEmailState=" + this.shopperEmailState + ", isAmountConsentChecked=" + this.isAmountConsentChecked + ", isAccountConsentChecked=" + this.isAccountConsentChecked + ", mode=" + this.mode + ")";
    }
}
