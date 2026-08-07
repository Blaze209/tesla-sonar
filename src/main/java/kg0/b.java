package kg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadResponse;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import java.util.List;
import okhttp3.MultipartBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.f;
import sr0.i;
import sr0.k;
import sr0.l;
import sr0.o;
import sr0.q;
import sr0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\fJ2\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkg0/b;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "request", "Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "document", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileId", "b", "inquiryId", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    @f("/api/internal/verify/v1/documents/{documentId}")
    Object a(@i("Authorization") String str, @s("documentId") String str2, Continuation<? super y<CreateDocumentResponse>> continuation);

    @sr0.b("/api/internal/verify/v1/document-files/{fileId}")
    Object b(@i("Authorization") String str, @s("fileId") String str2, Continuation<? super y<?>> continuation);

    @o("/api/internal/verify/v1/documents")
    Object c(@i("Authorization") String str, @sr0.a CreateDocumentRequest createDocumentRequest, Continuation<? super y<CreateDocumentResponse>> continuation);

    @k({"Accept: multipart/form-data"})
    @o("/api/internal/verify/v1/document-files")
    @l
    Object d(@i("Authorization") String str, @q List<MultipartBody.Part> list, Continuation<? super y<DocumentFileUploadResponse>> continuation);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object e(@i("Authorization") String str, @s("inquiryId") String str2, @sr0.a SubmitDocumentRequest submitDocumentRequest, Continuation<? super y<?>> continuation);
}
