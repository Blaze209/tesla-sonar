package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.Fragment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"toInlineInquiryBuilder", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "createFragment", "Landroidx/fragment/app/Fragment;", "inquiry-dynamic-feature_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InquiryUtilsKt {
    @ExperimentalInlineApi
    public static final Fragment createFragment(InlineInquiryBuilder inlineInquiryBuilder) {
        s.k(inlineInquiryBuilder, "<this>");
        return inlineInquiryBuilder.build().createFragment();
    }

    @ExperimentalInlineApi
    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryTemplateBuilder inquiryTemplateBuilder) {
        s.k(inquiryTemplateBuilder, "<this>");
        return inquiryTemplateBuilder.build().buildInlineInquiry();
    }

    @ExperimentalInlineApi
    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryBuilder inquiryBuilder) {
        s.k(inquiryBuilder, "<this>");
        return inquiryBuilder.build().buildInlineInquiry();
    }
}
