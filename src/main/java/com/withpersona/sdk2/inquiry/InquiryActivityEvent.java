package com.withpersona.sdk2.inquiry;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "", "CancelInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InquiryActivityEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelInquiry implements InquiryActivityEvent {
        public static final CancelInquiry INSTANCE = new CancelInquiry();

        private CancelInquiry() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CancelInquiry);
        }

        public int hashCode() {
            return 97710347;
        }

        public String toString() {
            return "CancelInquiry";
        }
    }
}
