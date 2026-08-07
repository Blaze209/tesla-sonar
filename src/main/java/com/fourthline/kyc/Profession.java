package com.fourthline.kyc;

import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/fourthline/kyc/Profession;", "", "Lcom/fourthline/kyc/EmploymentStatus;", "employment", "", "profession", "Lcom/fourthline/kyc/Industry;", "industry", "<init>", "(Lcom/fourthline/kyc/EmploymentStatus;Ljava/lang/String;Lcom/fourthline/kyc/Industry;)V", "component1", "()Lcom/fourthline/kyc/EmploymentStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/fourthline/kyc/Industry;", "copy", "(Lcom/fourthline/kyc/EmploymentStatus;Ljava/lang/String;Lcom/fourthline/kyc/Industry;)Lcom/fourthline/kyc/Profession;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/kyc/EmploymentStatus;", "getEmployment", "setEmployment", "(Lcom/fourthline/kyc/EmploymentStatus;)V", "b", "Ljava/lang/String;", "getProfession", "setProfession", "(Ljava/lang/String;)V", "c", "Lcom/fourthline/kyc/Industry;", "getIndustry", "setIndustry", "(Lcom/fourthline/kyc/Industry;)V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Profession {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private EmploymentStatus employment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String profession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Industry industry;

    public Profession() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Profession copy$default(Profession profession, EmploymentStatus employmentStatus, String str, Industry industry, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            employmentStatus = profession.employment;
        }
        if ((i11 & 2) != 0) {
            str = profession.profession;
        }
        if ((i11 & 4) != 0) {
            industry = profession.industry;
        }
        return profession.copy(employmentStatus, str, industry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmploymentStatus getEmployment() {
        return this.employment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProfession() {
        return this.profession;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Industry getIndustry() {
        return this.industry;
    }

    public final Profession copy(EmploymentStatus employment, String profession, Industry industry) {
        return new Profession(employment, profession, industry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profession)) {
            return false;
        }
        Profession profession = (Profession) other;
        return this.employment == profession.employment && s.f(this.profession, profession.profession) && this.industry == profession.industry;
    }

    public final EmploymentStatus getEmployment() {
        return this.employment;
    }

    public final Industry getIndustry() {
        return this.industry;
    }

    public final String getProfession() {
        return this.profession;
    }

    public int hashCode() {
        EmploymentStatus employmentStatus = this.employment;
        int iHashCode = (employmentStatus == null ? 0 : employmentStatus.hashCode()) * 31;
        String str = this.profession;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Industry industry = this.industry;
        return iHashCode2 + (industry != null ? industry.hashCode() : 0);
    }

    public final void setEmployment(EmploymentStatus employmentStatus) {
        this.employment = employmentStatus;
    }

    public final void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public final void setProfession(String str) {
        this.profession = str;
    }

    public String toString() {
        return "Profession(employment=" + this.employment + ", profession=" + this.profession + ", industry=" + this.industry + ")";
    }

    public Profession(EmploymentStatus employmentStatus) {
        this(employmentStatus, null, null, 6, null);
    }

    public Profession(EmploymentStatus employmentStatus, String str) {
        this(employmentStatus, str, null, 4, null);
    }

    public Profession(EmploymentStatus employmentStatus, String str, Industry industry) {
        this.employment = employmentStatus;
        this.profession = str;
        this.industry = industry;
    }

    public /* synthetic */ Profession(EmploymentStatus employmentStatus, String str, Industry industry, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : employmentStatus, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : industry);
    }
}
