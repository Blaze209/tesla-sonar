package ig0;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u0014B)\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lig0/c;", "Ly20/o;", "Lig0/c$b;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfi0/c;", "sdkFilesManager", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lfi0/c;)V", "", "errorMessage", "", "c", "(Ljava/lang/String;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Lfi0/c;", "e", "a", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<Uri> pictureLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lig0/c$b;", "", "<init>", "()V", "b", "a", "Lig0/c$b$a;", "Lig0/c$b$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lig0/c$b$a;", "Lig0/c$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f77707a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: ig0.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lig0/c$b$b;", "Lig0/c$b;", "", "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1638b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1638b(String absoluteFilePath) {
                super(null);
                p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: ig0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1639c implements Flow<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f77709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f77710b;

        /* JADX INFO: renamed from: ig0.c$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f77711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f77712b;

            /* JADX INFO: renamed from: ig0.c$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", f = "DocumentCameraWorker.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class C1640a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f77713n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f77714o;

                public C1640a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f77713n = obj;
                    this.f77714o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, c cVar) {
                this.f77711a = flowCollector;
                this.f77712b = cVar;
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
            public final Object emit(Object obj, Continuation continuation) {
                C1640a c1640a;
                b c1638b;
                if (continuation instanceof C1640a) {
                    c1640a = (C1640a) continuation;
                    int i11 = c1640a.f77714o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1640a.f77714o = i11 - Integer.MIN_VALUE;
                    } else {
                        c1640a = new C1640a(continuation);
                    }
                } else {
                    c1640a = new C1640a(continuation);
                }
                Object obj2 = c1640a.f77713n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c1640a.f77714o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f77711a;
                    if (((Boolean) obj).booleanValue()) {
                        File fileE = this.f77712b.sdkFilesManager.e("document_camera_photo.jpg");
                        File fileD = this.f77712b.sdkFilesManager.d("jpg");
                        if (fileE.renameTo(fileD)) {
                            String absolutePath = fileD.getAbsolutePath();
                            p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
                            c1638b = new b.C1638b(absolutePath);
                        } else {
                            c1638b = b.a.f77707a;
                        }
                    } else {
                        c1638b = b.a.f77707a;
                    }
                    c1640a.f77714o = 1;
                    if (flowCollector.emit(c1638b, c1640a) == coroutine_suspended) {
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

        public C1639c(Flow flow, c cVar) {
            this.f77709a = flow;
            this.f77710b = cVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super b> flowCollector, Continuation continuation) {
            Object objCollect = this.f77709a.collect(new a(flowCollector, this.f77710b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public c(ActivityResultLauncher<Uri> pictureLauncher, Context context, fi0.c sdkFilesManager) {
        p013kotlin.jvm.internal.s.k(pictureLauncher, "pictureLauncher");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // y20.o
    public boolean a(y20.o<?> oVar) {
        return y20.o.b.a(this, oVar);
    }

    public final boolean c(String errorMessage) {
        p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.e("document_camera_photo.jpg"));
            ActivityResultLauncher<Uri> activityResultLauncher = this.pictureLauncher;
            p013kotlin.jvm.internal.s.h(uriForFile);
            activityResultLauncher.b(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // y20.o
    public Flow<b> run() {
        return new C1639c(new com.withpersona.sdk2.inquiry.launchers.z(), this);
    }
}
