package u00;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.p;
import y00.Result;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0014\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JT\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lu00/c;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "Landroid/net/Uri;", "uris", "", "isStreamable", "", "outputWidth", "outputHeight", "bitrate", "Lu00/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "destPath", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;ZIIILu00/a;Ljava/lang/String;)V", "index", "srcUri", "streamableFile", "Ly00/f;", "f", "(ILandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIILu00/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "srcPath", "e", "(Ljava/lang/String;Ljava/lang/String;IIILu00/a;)V", "c", "()V", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lkotlinx/coroutines/Job;", "b", "Lkotlinx/coroutines/Job;", "job", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Job job;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass$doVideoCompression$1", f = "VideoCompressorClass.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115250o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f115251p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f115252q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f115253r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0<File> f115254s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ u00.a f115255t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f115256u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c f115257v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ List<Uri> f115258w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f115259x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f115260y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f115261z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, boolean z11, n0<File> n0Var, u00.a aVar, int i11, c cVar, List<? extends Uri> list, int i12, int i13, int i14, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115252q = str;
            this.f115253r = z11;
            this.f115254s = n0Var;
            this.f115255t = aVar;
            this.f115256u = i11;
            this.f115257v = cVar;
            this.f115258w = list;
            this.f115259x = i12;
            this.f115260y = i13;
            this.f115261z = i14;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f115252q, this.f115253r, this.f115254s, this.f115255t, this.f115256u, this.f115257v, this.f115258w, this.f115259x, this.f115260y, this.f115261z, continuation);
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.io.File] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u00.a aVar;
            int i11;
            Object objF;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f115251p;
            if (i12 == 0) {
                t.b(obj);
                File file = new File(this.f115252q);
                if (this.f115253r) {
                    this.f115254s.f86529a = new File(this.f115252q);
                }
                aVar = this.f115255t;
                int i13 = this.f115256u;
                c cVar = this.f115257v;
                List<Uri> list = this.f115258w;
                n0<File> n0Var = this.f115254s;
                int i14 = this.f115259x;
                int i15 = this.f115260y;
                int i16 = this.f115261z;
                v00.a.f117427a.g(true);
                aVar.c(i13);
                Uri uri = list.get(i13);
                String path = file.getPath();
                s.j(path, "getPath(...)");
                File file2 = n0Var.f86529a;
                String path2 = file2 != null ? file2.getPath() : null;
                this.f115249n = aVar;
                this.f115250o = i13;
                this.f115251p = 1;
                i11 = i13;
                objF = cVar.f(i11, uri, path, path2, i14, i15, i16, aVar, this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i17 = this.f115250o;
                u00.a aVar2 = (u00.a) this.f115249n;
                t.b(obj);
                aVar = aVar2;
                i11 = i17;
                objF = obj;
            }
            Result result = (Result) objF;
            if (result.getSuccess()) {
                aVar.d(i11, result.getSize(), result.getPath());
            } else {
                String failureMessage = result.getFailureMessage();
                if (failureMessage == null) {
                    failureMessage = "An error has occurred!";
                }
                aVar.e(i11, failureMessage);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly00/f;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly00/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass$startCompression$2", f = "VideoCompressorClass.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super Result>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115262n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f115263o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f115264p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Uri f115265q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f115266r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f115267s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f115268t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f115269u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f115270v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ u00.a f115271w;

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"u00/c$b$a", "Lu00/b;", "", "index", "", "percent", "Ljn0/h0;", "b", "(IF)V", "a", "(I)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements u00.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u00.a f115272a;

            a(u00.a aVar) {
                this.f115272a = aVar;
            }

            @Override // u00.b
            public void a(int index) {
                this.f115272a.a(index);
            }

            @Override // u00.b
            public void b(int index, float percent) {
                this.f115272a.b(index, percent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, c cVar, Uri uri, String str, String str2, int i12, int i13, int i14, u00.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115263o = i11;
            this.f115264p = cVar;
            this.f115265q = uri;
            this.f115266r = str;
            this.f115267s = str2;
            this.f115268t = i12;
            this.f115269u = i13;
            this.f115270v = i14;
            this.f115271w = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f115263o, this.f115264p, this.f115265q, this.f115266r, this.f115267s, this.f115268t, this.f115269u, this.f115270v, this.f115271w, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115262n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            v00.a aVar = v00.a.f117427a;
            int i12 = this.f115263o;
            ReactApplicationContext reactApplicationContext = this.f115264p.context;
            Uri uri = this.f115265q;
            String str = this.f115266r;
            String str2 = this.f115267s;
            int i13 = this.f115268t;
            int i14 = this.f115269u;
            int i15 = this.f115270v;
            a aVar2 = new a(this.f115271w);
            this.f115262n = 1;
            Object objB = aVar.b(i12, reactApplicationContext, uri, str, str2, i13, i14, i15, aVar2, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(ReactApplicationContext context) {
        s.k(context, "context");
        this.context = context;
    }

    private final void d(List<? extends Uri> uris, boolean isStreamable, int outputWidth, int outputHeight, int bitrate, u00.a listener, String destPath) {
        n0 n0Var = new n0();
        int size = uris.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.job = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(destPath, isStreamable, n0Var, listener, i11, this, uris, outputWidth, outputHeight, bitrate, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(int i11, Uri uri, String str, String str2, int i12, int i13, int i14, u00.a aVar, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new b(i11, this, uri, str, str2, i12, i13, i14, aVar, null), continuation);
    }

    public final void c() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        v00.a.f117427a.g(false);
    }

    public final void e(String srcPath, String destPath, int outputWidth, int outputHeight, int bitrate, u00.a listener) {
        s.k(srcPath, "srcPath");
        s.k(destPath, "destPath");
        s.k(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Uri uri = Uri.parse(srcPath);
        s.h(uri);
        arrayList.add(uri);
        d(arrayList, false, outputWidth, outputHeight, bitrate, listener, destPath);
    }
}
