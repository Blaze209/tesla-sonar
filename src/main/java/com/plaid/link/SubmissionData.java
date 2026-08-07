package com.plaid.link;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/plaid/link/SubmissionData;", "", "phoneNumber", "", "dateOfBirth", "(Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getPhoneNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmissionData {
    private final String dateOfBirth;
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public SubmissionData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubmissionData copy$default(SubmissionData submissionData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submissionData.phoneNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = submissionData.dateOfBirth;
        }
        return submissionData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final SubmissionData copy(String phoneNumber, String dateOfBirth) {
        return new SubmissionData(phoneNumber, dateOfBirth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmissionData)) {
            return false;
        }
        SubmissionData submissionData = (SubmissionData) other;
        return s.f(this.phoneNumber, submissionData.phoneNumber) && s.f(this.dateOfBirth, submissionData.dateOfBirth);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dateOfBirth;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubmissionData(phoneNumber=" + this.phoneNumber + ", dateOfBirth=" + this.dateOfBirth + ")";
    }

    public SubmissionData(String str, String str2) {
        this.phoneNumber = str;
        this.dateOfBirth = str2;
    }

    public /* synthetic */ SubmissionData(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
