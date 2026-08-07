package expo.modules.filesystem.next;

import android.webkit.URLUtil;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.plaid.internal.EnumC4419g;
import expo.modules.interfaces.filesystem.Permission;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sn0.a;
import sn0.b;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.next.FileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3", f = "FileSystemNextModule.kt", i = {0, 0, 0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {"to", ImagesContract.URL, "client", "$this$await$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
public final class FileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    public FileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3(Continuation continuation) {
        super(3, continuation);
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws UnableToDownloadException, MalformedURLException, DestinationAlreadyExistsException {
        URI uri;
        FileSystemPath fileSystemPath;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            t.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            FileSystemPath fileSystemPath2 = (FileSystemPath) objArr[1];
            URI uri2 = (URI) obj2;
            fileSystemPath2.validatePermission(Permission.WRITE);
            Request.Builder builder = new Request.Builder();
            URL url = uri2.toURL();
            s.j(url, "toURL(...)");
            Request requestBuild = builder.url(url).build();
            OkHttpClient okHttpClient = new OkHttpClient();
            this.L$0 = fileSystemPath2;
            this.L$1 = uri2;
            this.L$2 = okHttpClient;
            this.L$3 = requestBuild;
            this.L$4 = this;
            this.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(requestBuild), new Callback() { // from class: expo.modules.filesystem.next.FileSystemNextModule$definition$lambda$40$lambda$2$$inlined$await$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e11) {
                    s.k(call, "call");
                    s.k(e11, "e");
                    if (cancellableContinuationImpl.isCancelled()) {
                        return;
                    }
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    cancellableContinuation.resumeWith(jn0.s.b(t.a(e11)));
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    s.k(call, "call");
                    s.k(response, "response");
                    cancellableContinuationImpl.resumeWith(jn0.s.b(response));
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            uri = uri2;
            fileSystemPath = fileSystemPath2;
            obj = result;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (URI) this.L$1;
            fileSystemPath = (FileSystemPath) this.L$0;
            t.b(obj);
        }
        Response response = (Response) obj;
        if (!response.isSuccessful()) {
            throw new UnableToDownloadException("response has status: " + response.code());
        }
        File file = fileSystemPath instanceof FileSystemDirectory ? new File(fileSystemPath.getFile(), URLUtil.guessFileName(uri.toString(), response.headers().get("content-disposition"), response.headers().get("content-type"))) : fileSystemPath.getFile();
        if (file.exists()) {
            throw new DestinationAlreadyExistsException();
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            throw new UnableToDownloadException("response body is null");
        }
        InputStream inputStreamByteStream = responseBodyBody.byteStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                a.b(inputStreamByteStream, fileOutputStream, 0, 2, null);
                b.a(fileOutputStream, null);
                b.a(inputStreamByteStream, null);
                return file.getPath();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(inputStreamByteStream, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        FileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3 fileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3 = new FileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3(continuation);
        fileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3.L$0 = objArr;
        return fileSystemNextModule$definition$lambda$40$$inlined$Coroutine$3.invokeSuspend(h0.f84049a);
    }
}
