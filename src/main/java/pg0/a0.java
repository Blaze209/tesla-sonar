package pg0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\b\u0007\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpg0/a0;", "Ly20/o;", "Lpg0/a0$a;", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "openDocumentLauncher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfi0/c;", "sdkFilesManager", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lfi0/c;)V", "Ljn0/h0;", "e", "()V", "Landroid/net/Uri;", Action.FILE_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Landroid/content/Context;", "Lfi0/c;", "a", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 implements y20.o<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<String[]> openDocumentLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lpg0/a0$a;", "", "<init>", "()V", "b", "a", "Lpg0/a0$a$a;", "Lpg0/a0$a$b;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: pg0.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg0/a0$a$a;", "Lpg0/a0$a;", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2169a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2169a f102208a = new C2169a();

            private C2169a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lpg0/a0$a$b;", "Lpg0/a0$a;", "", "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String absoluteFilePath;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String fileName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String absoluteFilePath, String str) {
                super(null);
                p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
                this.fileName = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Flow<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f102211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f102212b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f102213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f102214b;

            /* JADX INFO: renamed from: pg0.a0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", f = "DocumentSelectWorker.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class C2170a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f102215n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f102216o;

                public C2170a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f102215n = obj;
                    this.f102216o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, a0 a0Var) {
                this.f102213a = flowCollector;
                this.f102214b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) throws FileNotFoundException {
                C2170a c2170a;
                a bVar;
                if (continuation instanceof C2170a) {
                    c2170a = (C2170a) continuation;
                    int i11 = c2170a.f102216o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2170a.f102216o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2170a = new C2170a(continuation);
                    }
                } else {
                    c2170a = new C2170a(continuation);
                }
                Object obj2 = c2170a.f102215n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2170a.f102216o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f102213a;
                    Uri uri = (Uri) obj;
                    if (uri != null) {
                        String type = this.f102214b.context.getContentResolver().getType(uri);
                        String strD = this.f102214b.d(uri);
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                        }
                        fi0.c cVar = this.f102214b.sdkFilesManager;
                        p013kotlin.jvm.internal.s.h(extensionFromMimeType);
                        File fileD = cVar.d(extensionFromMimeType);
                        InputStream inputStreamOpenInputStream = this.f102214b.context.getContentResolver().openInputStream(uri);
                        p013kotlin.jvm.internal.s.h(inputStreamOpenInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                        try {
                            try {
                                sn0.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                sn0.b.a(inputStreamOpenInputStream, null);
                                sn0.b.a(fileOutputStream, null);
                                String absolutePath = fileD.getAbsolutePath();
                                p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
                                bVar = new a.b(absolutePath, strD);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    sn0.b.a(inputStreamOpenInputStream, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                sn0.b.a(fileOutputStream, th4);
                                throw th5;
                            }
                        }
                    } else {
                        bVar = a.C2169a.f102208a;
                    }
                    c2170a.f102216o = 1;
                    if (flowCollector.emit(bVar, c2170a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public b(Flow flow, a0 a0Var) {
            this.f102211a = flow;
            this.f102212b = a0Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super a> flowCollector, Continuation continuation) {
            Object objCollect = this.f102211a.collect(new a(flowCollector, this.f102212b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public a0(ActivityResultLauncher<String[]> openDocumentLauncher, Context context, fi0.c sdkFilesManager) {
        p013kotlin.jvm.internal.s.k(openDocumentLauncher, "openDocumentLauncher");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // y20.o
    public boolean a(y20.o<?> oVar) {
        return y20.o.b.a(this, oVar);
    }

    public final String d(Uri file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        Cursor cursorQuery = this.context.getContentResolver().query(file, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        String string = cursorQuery != null ? cursorQuery.getString(Math.max(cursorQuery.getColumnIndex("_display_name"), 0)) : null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public final void e() {
        this.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
    }

    @Override // y20.o
    public Flow<a> run() {
        return FlowKt.flowOn(new b(new com.withpersona.sdk2.inquiry.launchers.t(), this), Dispatchers.getIO());
    }
}
