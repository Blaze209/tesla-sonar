package z00;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020)¢\u0006\u0004\b+\u0010,R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R)\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lz00/d;", "", "", "", "Landroid/net/Uri;", "uriMap", "<init>", "(Ljava/util/Map;)V", "Lcom/facebook/react/bridge/ReadableMap;", "map", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", "destinationDir", "h", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactContext;Ljava/io/File;)Lcom/facebook/react/bridge/ReadableMap;", "Landroid/content/Context;", "Lcom/reactnativedocumentpicker/a;", "copyTo", "k", "(Landroid/content/Context;Lcom/reactnativedocumentpicker/a;)Ljava/io/File;", "from", "fileName", "convertVirtualFileAsType", "e", "(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Landroid/content/ContentResolver;", "contentResolver", "Ljava/io/InputStream;", "j", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Ljava/io/InputStream;", "destFile", "expectedDir", "l", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "Lcom/facebook/react/bridge/ReadableArray;", "filesToCopy", "g", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/ReadableArray;Lcom/reactnativedocumentpicker/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceUri", "targetUriString", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lz00/a;", "m", "(Landroid/net/Uri;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lz00/a;", "a", "Ljava/util/Map;", "Lkotlin/Function2;", "Ljava/io/OutputStream;", "", "b", "Lwn0/p;", "getCopyStreamToAnother", "()Lwn0/p;", "copyStreamToAnother", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Uri> uriMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<InputStream, OutputStream, Long> copyStreamToAnother;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativedocumentpicker.FileOperations", f = "FileOperations.kt", i = {}, l = {32}, m = "copyFilesToLocalStorage", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f126396n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f126398p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126396n = obj;
            this.f126398p |= Integer.MIN_VALUE;
            return d.this.g(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableArray;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativedocumentpicker.FileOperations$copyFilesToLocalStorage$2", f = "FileOperations.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"results"}, s = {"L$0"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super WritableArray>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126399n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f126400o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ReactContext f126402q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.reactnativedocumentpicker.a f126403r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ReadableArray f126404s;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.reactnativedocumentpicker.FileOperations$copyFilesToLocalStorage$2$copyJobs$1$1", f = "FileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super WritableMap>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f126405n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ ReadableArray f126406o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ int f126407p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ d f126408q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ ReactContext f126409r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ File f126410s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ReadableArray readableArray, int i11, d dVar, ReactContext reactContext, File file, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f126406o = readableArray;
                this.f126407p = i11;
                this.f126408q = dVar;
                this.f126409r = reactContext;
                this.f126410s = file;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f126406o, this.f126407p, this.f126408q, this.f126409r, this.f126410s, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f126405n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableMap map = this.f126406o.getMap(this.f126407p);
                try {
                    if (map != null) {
                        writableMapCreateMap.merge(this.f126408q.h(map, this.f126409r, this.f126410s));
                        return writableMapCreateMap;
                    }
                    throw new IllegalArgumentException("keepLocalCopy: The file argument is null at index " + this.f126407p);
                } catch (Exception e11) {
                    String localizedMessage = e11.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e11.getMessage()) == null) {
                        localizedMessage = "Unknown error";
                    }
                    writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, AnalyticsAttribute.Error);
                    writableMapCreateMap.putString("copyError", localizedMessage);
                    writableMapCreateMap.putString("sourceUri", map != null ? map.getString("uri") : null);
                    return writableMapCreateMap;
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, com.reactnativedocumentpicker.a aVar, ReadableArray readableArray, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f126402q = reactContext;
            this.f126403r = aVar;
            this.f126404s = readableArray;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = d.this.new b(this.f126402q, this.f126403r, this.f126404s, continuation);
            bVar.f126400o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            WritableArray writableArray;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126399n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f126400o;
                File fileK = d.this.k(this.f126402q, this.f126403r);
                bo0.j jVarW = n.w(0, this.f126404s.size());
                ReadableArray readableArray = this.f126404s;
                d dVar = d.this;
                ReactContext reactContext = this.f126402q;
                ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
                Iterator<Integer> it = jVarW.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(readableArray, ((s0) it).nextInt(), dVar, reactContext, fileK, null), 3, null));
                    readableArray = readableArray;
                    dVar = dVar;
                    reactContext = reactContext;
                }
                WritableArray writableArrayCreateArray = Arguments.createArray();
                this.f126400o = writableArrayCreateArray;
                this.f126399n = 1;
                Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
                if (objAwaitAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                writableArray = writableArrayCreateArray;
                obj = objAwaitAll;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                writableArray = (WritableArray) this.f126400o;
                t.b(obj);
            }
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                writableArray.pushMap((WritableMap) it2.next());
            }
            return writableArray;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableArray> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(Map<String, Uri> uriMap) {
        s.k(uriMap, "uriMap");
        this.uriMap = uriMap;
        this.copyStreamToAnother = new p() { // from class: z00.b
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(d.i((InputStream) obj, (OutputStream) obj2));
            }
        };
    }

    private final File e(Context context, Uri from, File destinationDir, String fileName, String convertVirtualFileAsType) throws IOException {
        final File fileL = l(new File(destinationDir, fileName), destinationDir);
        l lVar = new l() { // from class: z00.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.f(this.f126392a, fileL, (InputStream) obj);
            }
        };
        if (convertVirtualFileAsType == null) {
            lVar.invoke(context.getContentResolver().openInputStream(from));
            return fileL;
        }
        ContentResolver contentResolver = context.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        lVar.invoke(j(contentResolver, from, convertVirtualFileAsType));
        return fileL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(d dVar, File file, InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new FileNotFoundException("No input stream was found for the source file");
        }
        if (dVar.copyStreamToAnother.invoke(inputStream, new FileOutputStream(file)).longValue() != 0) {
            return h0.f84049a;
        }
        throw new IOException("No data was copied to the destination file");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMap h(ReadableMap map, ReactContext context, File destinationDir) throws IOException {
        String string = map.getString("uri");
        if (string == null) {
            throw new IllegalArgumentException("URI is missing");
        }
        String string2 = map.getString("fileName");
        if (string2 == null) {
            throw new IllegalArgumentException("fileName is missing");
        }
        String string3 = map.getString("convertVirtualFileToType");
        Uri uri = this.uriMap.get(string);
        if (uri == null) {
            uo.c.e(context, "keepLocalCopy: You're trying to copy a file \"" + string2 + "\" that wasn't picked with this module. This can lead to permission errors because the file reference is transient to your activity's current lifecycle. See https://developer.android.com/guide/components/intents-common#GetFile . Please use the result from the picker directly.");
        }
        if (uri == null) {
            uri = Uri.parse(string);
        }
        Uri uri2 = uri;
        s.h(uri2);
        File fileE = e(context, uri2, destinationDir, string2, string3);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, "success");
        writableMapCreateMap.putString("localUri", Uri.fromFile(fileE).toString());
        writableMapCreateMap.putString("sourceUri", string);
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(InputStream inputStream, OutputStream outputStream) {
        s.k(inputStream, "inputStream");
        s.k(outputStream, "outputStream");
        try {
            try {
                long jCopy = Build.VERSION.SDK_INT >= 29 ? FileUtils.copy(inputStream, outputStream) : sn0.a.b(inputStream, outputStream, 0, 2, null);
                sn0.b.a(outputStream, null);
                sn0.b.a(inputStream, null);
                return jCopy;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(outputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(inputStream, th4);
                throw th5;
            }
        }
    }

    private final InputStream j(ContentResolver contentResolver, Uri from, String convertVirtualFileAsType) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(from, convertVirtualFileAsType, null);
        if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
            return assetFileDescriptorOpenTypedAssetFileDescriptor.createInputStream();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File k(Context context, com.reactnativedocumentpicker.a copyTo) throws IOException {
        File file = new File(copyTo == com.reactnativedocumentpicker.a.DOCUMENT_DIRECTORY ? context.getFilesDir() : context.getCacheDir(), UUID.randomUUID().toString());
        if (file.mkdir()) {
            return file;
        }
        throw new IOException("Failed to create directory at " + file.getAbsolutePath());
    }

    private final File l(File destFile, File expectedDir) throws IOException {
        String canonicalPath = destFile.getCanonicalPath();
        s.h(canonicalPath);
        String canonicalPath2 = expectedDir.getCanonicalPath();
        s.j(canonicalPath2, "getCanonicalPath(...)");
        if (p013kotlin.text.t.b0(canonicalPath, canonicalPath2, false, 2, null)) {
            return destFile;
        }
        throw new IllegalArgumentException("The copied file is attempting to write outside of the target directory.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ReactContext reactContext, ReadableArray readableArray, com.reactnativedocumentpicker.a aVar, Continuation<? super ReadableArray> continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f126398p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f126398p = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object objWithContext = aVar2.f126396n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f126398p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(reactContext, aVar, readableArray, null);
            aVar2.f126398p = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        s.j(objWithContext, "withContext(...)");
        return objWithContext;
    }

    public final z00.a m(Uri sourceUri, String targetUriString, ReactApplicationContext context) throws FileNotFoundException {
        s.k(context, "context");
        if (sourceUri == null) {
            throw new IllegalArgumentException("The source URI is null. Call saveDocument() before writeDocument()");
        }
        Uri uri = this.uriMap.get(targetUriString);
        if (uri == null) {
            uo.c.a(context, "writeDocument: You're trying to write from Uri \"" + targetUriString + "\" that wasn't picked with this module. Please use the result from saveDocument()");
            throw new IllegalArgumentException("The provided URI is not known");
        }
        z00.a aVar = new z00.a(uri);
        ContentResolver contentResolver = context.getContentResolver();
        aVar.h(contentResolver.getType(uri));
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(sourceUri);
        if (inputStreamOpenInputStream == null) {
            return aVar.g("No input stream found for source file");
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            return aVar.g("No output stream found for destination file");
        }
        if (this.copyStreamToAnother.invoke(inputStreamOpenInputStream, outputStreamOpenOutputStream).longValue() == 0) {
            aVar.g("No data was copied to the destination file");
        }
        return aVar;
    }
}
