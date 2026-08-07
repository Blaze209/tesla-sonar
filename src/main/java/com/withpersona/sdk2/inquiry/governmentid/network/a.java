package com.withpersona.sdk2.inquiry.governmentid.network;

import java.util.List;
import okhttp3.MultipartBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.i;
import sr0.k;
import sr0.l;
import sr0.o;
import sr0.q;
import sr0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\t\u0010\nJD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "", "", "sessionToken", "inquiryId", "", "Lokhttp3/MultipartBody$Part;", "body", "Lretrofit2/y;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    @k({"Accept: multipart/form-data"})
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/government-id-classification")
    @l
    Object a(@i("Authorization") String str, @s("inquiryId") String str2, @q List<MultipartBody.Part> list, @q("data[attributes][files][][supplementary_data]") AutoClassifyWorker.SupplementaryData supplementaryData, Continuation<? super y<AutoClassifyResponse>> continuation);

    @k({"Accept: multipart/form-data"})
    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    @l
    Object b(@i("Authorization") String str, @s("inquiryId") String str2, @q List<MultipartBody.Part> list, Continuation<? super y<?>> continuation);
}
