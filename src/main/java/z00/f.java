package z00;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lz00/f;", "", "", "", "Landroid/net/Uri;", "uriMap", "<init>", "(Ljava/util/Map;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "sourceUri", "Lz00/g;", "pickOptions", "Lz00/a;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Landroid/net/Uri;Lz00/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroid/database/Cursor;", "cursor", "columnName", "Ljava/lang/Class;", "valueType", "c", "(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "", "uris", "Lcom/facebook/react/bridge/ReadableArray;", "e", "(Landroid/content/Context;Ljava/util/List;Lz00/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/ContentResolver;", "contentResolver", "metadataBuilder", "", "couldBeVirtualFile", "Ljn0/h0;", "f", "(Landroid/content/ContentResolver;Lz00/a;Z)V", "a", "Ljava/util/Map;", "react-native-documents_picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Uri> uriMap;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lz00/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lz00/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativedocumentpicker.MetadataGetter$getMetadataForUri$2", f = "MetadataGetter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super z00.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126413n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f126414o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Uri f126415p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PickOptions f126416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f126417r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Uri uri, PickOptions pickOptions, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f126414o = context;
            this.f126415p = uri;
            this.f126416q = pickOptions;
            this.f126417r = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f126414o, this.f126415p, this.f126416q, this.f126417r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126413n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            ContentResolver contentResolver = this.f126414o.getContentResolver();
            z00.a aVar = new z00.a(this.f126415p);
            aVar.h(contentResolver.getType(this.f126415p));
            if (this.f126416q.getAllowVirtualFiles()) {
                aVar.j(contentResolver.getStreamTypes(this.f126415p, "*/*"));
            }
            if (this.f126416q.getRequestLongTermAccess()) {
                try {
                    this.f126414o.getContentResolver().takePersistableUriPermission(this.f126415p, 3);
                    aVar.a(this.f126415p);
                } catch (Exception e11) {
                    String localizedMessage = e11.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e11.getMessage()) == null) {
                        localizedMessage = "Unknown error with takePersistableUriPermission";
                    }
                    aVar.b(localizedMessage);
                }
            }
            boolean z11 = this.f126416q.getAllowVirtualFiles() && DocumentsContract.isDocumentUri(this.f126414o, this.f126415p);
            f fVar = this.f126417r;
            s.h(contentResolver);
            fVar.f(contentResolver, aVar, z11);
            return aVar;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super z00.a> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativedocumentpicker.MetadataGetter", f = "MetadataGetter.kt", i = {}, l = {24}, m = "processPickedFileUris", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f126418n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f126420p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f126418n = obj;
            this.f126420p |= Integer.MIN_VALUE;
            return f.this.e(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableArray;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativedocumentpicker.MetadataGetter$processPickedFileUris$2", f = "MetadataGetter.kt", i = {0, 0}, l = {27}, m = "invokeSuspend", n = {"results", "uri"}, s = {"L$0", "L$2"})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super WritableArray>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f126421n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f126422o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f126423p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f126424q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<Uri> f126425r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f126426s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f126427t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ PickOptions f126428u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends Uri> list, f fVar, Context context, PickOptions pickOptions, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f126425r = list;
            this.f126426s = fVar;
            this.f126427t = context;
            this.f126428u = pickOptions;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f126425r, this.f126426s, this.f126427t, this.f126428u, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0038  */
        /* JADX WARN: Code duplicated, block: B:13:0x0053 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:14:0x0054). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f126424q
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f126423p
                android.net.Uri r1 = (android.net.Uri) r1
                java.lang.Object r3 = r7.f126422o
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.f126421n
                com.facebook.react.bridge.WritableArray r4 = (com.facebook.react.bridge.WritableArray) r4
                jn0.t.b(r8)
                goto L54
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                jn0.t.b(r8)
                com.facebook.react.bridge.WritableArray r8 = com.facebook.react.bridge.Arguments.createArray()
                java.util.List<android.net.Uri> r1 = r7.f126425r
                java.util.Iterator r1 = r1.iterator()
                r4 = r8
                r3 = r1
            L32:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L6b
                java.lang.Object r8 = r3.next()
                r1 = r8
                android.net.Uri r1 = (android.net.Uri) r1
                z00.f r8 = r7.f126426s
                android.content.Context r5 = r7.f126427t
                z00.g r6 = r7.f126428u
                r7.f126421n = r4
                r7.f126422o = r3
                r7.f126423p = r1
                r7.f126424q = r2
                java.lang.Object r8 = z00.f.a(r8, r5, r1, r6, r7)
                if (r8 != r0) goto L54
                return r0
            L54:
                z00.a r8 = (z00.a) r8
                z00.f r5 = r7.f126426s
                java.util.Map r5 = z00.f.b(r5)
                java.lang.String r6 = r1.toString()
                r5.put(r6, r1)
                com.facebook.react.bridge.ReadableMap r8 = r8.c()
                r4.pushMap(r8)
                goto L32
            L6b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: z00.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableArray> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(Map<String, Uri> uriMap) {
        s.k(uriMap, "uriMap");
        this.uriMap = uriMap;
    }

    private final <T> T c(Cursor cursor, String columnName, Class<T> valueType) {
        Object objB;
        Object objValueOf;
        int columnIndex = cursor.getColumnIndex(columnName);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            if (s.f(valueType, String.class)) {
                objValueOf = cursor.getString(columnIndex);
            } else if (s.f(valueType, Integer.TYPE)) {
                objValueOf = Integer.valueOf(cursor.getInt(columnIndex));
            } else if (s.f(valueType, Long.TYPE)) {
                objValueOf = Long.valueOf(cursor.getLong(columnIndex));
            } else if (s.f(valueType, Double.TYPE)) {
                objValueOf = Double.valueOf(cursor.getDouble(columnIndex));
            } else {
                objValueOf = s.f(valueType, Float.TYPE) ? Float.valueOf(cursor.getFloat(columnIndex)) : null;
            }
            objB = jn0.s.b(objValueOf);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            return null;
        }
        return (T) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Context context, Uri uri, PickOptions pickOptions, Continuation<? super z00.a> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(context, uri, pickOptions, this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Context context, List<? extends Uri> list, PickOptions pickOptions, Continuation<? super ReadableArray> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f126420p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f126420p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithContext = bVar.f126418n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f126420p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            c cVar = new c(list, this, context, pickOptions, null);
            bVar.f126420p = 1;
            objWithContext = BuildersKt.withContext(io2, cVar, bVar);
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

    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:7:0x003b, B:9:0x0041, B:11:0x0050, B:15:0x005f, B:17:0x0069, B:19:0x006f, B:22:0x0074, B:23:0x0083), top: B:30:0x003b }] */
    public final void f(ContentResolver contentResolver, z00.a metadataBuilder, boolean couldBeVirtualFile) {
        s.k(contentResolver, "contentResolver");
        s.k(metadataBuilder, "metadataBuilder");
        Uri uri = metadataBuilder.getUri();
        List listS = v.s("mime_type", "_display_name", "_size");
        if (couldBeVirtualFile) {
            listS.add("flags");
        }
        boolean z11 = false;
        Cursor cursorQuery = contentResolver.query(uri, (String[]) listS.toArray(new String[0]), null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    metadataBuilder.i((String) c(cursorQuery, "_display_name", String.class));
                    if (!metadataBuilder.f()) {
                        metadataBuilder.h((String) c(cursorQuery, "mime_type", String.class));
                    }
                    if (couldBeVirtualFile) {
                        Integer num = (Integer) c(cursorQuery, "flags", Integer.TYPE);
                        if (((num != null ? num.intValue() : 0) & 512) != 0) {
                            z11 = true;
                        }
                    }
                    metadataBuilder.l(z11);
                    metadataBuilder.k((Long) c(cursorQuery, "_size", Long.TYPE));
                } else {
                    metadataBuilder.g("Could not read file metadata");
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            metadataBuilder.g("Could not read file metadata");
        }
        sn0.b.a(cursorQuery, null);
    }
}
