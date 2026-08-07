package ig0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$PickVisualMedia;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u0016\u001bB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lig0/v2;", "Ly20/o;", "Lig0/v2$c;", "", Action.KEY_ATTRIBUTE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfi0/c;", "sdkFilesManager", "Lkotlin/Function0;", "Ljn0/h0;", "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lfi0/c;Lwn0/a;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Landroid/net/Uri;", "documentSelectResult", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", "Landroid/content/Context;", "Lfi0/c;", "e", "Lwn0/a;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v2 implements y20.o<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> launchPicker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lig0/v2$a;", "", "<init>", "(Ljava/lang/String;I)V", "FileNotFound", "PermissionDenied", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        FileNotFound,
        PermissionDenied;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lig0/v2$b;", "", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "openDocumentLauncher", "Lh/f;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lfi0/c;", "sdkFilesManager", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lfi0/c;)V", "Lig0/v2;", "c", "()Lig0/v2;", "e", "a", "Landroidx/activity/result/ActivityResultLauncher;", "b", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Lfi0/c;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<String[]> openDocumentLauncher;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<h.f> selectFromPhotoLibraryLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final fi0.c sdkFilesManager;

        public b(ActivityResultLauncher<String[]> openDocumentLauncher, ActivityResultLauncher<h.f> selectFromPhotoLibraryLauncher, Context context, fi0.c sdkFilesManager) {
            p013kotlin.jvm.internal.s.k(openDocumentLauncher, "openDocumentLauncher");
            p013kotlin.jvm.internal.s.k(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
            this.openDocumentLauncher = openDocumentLauncher;
            this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
            this.context = context;
            this.sdkFilesManager = sdkFilesManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 d(b bVar) {
            bVar.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 f(b bVar) {
            bVar.selectFromPhotoLibraryLauncher.b(h.g.c(ActivityResultContracts$PickVisualMedia.d.f1955a, 0, false, null, 14, null));
            return jn0.h0.f84049a;
        }

        public final v2 c() {
            return new v2("DocumentPicker", this.context, this.sdkFilesManager, new wn0.a() { // from class: ig0.w2
                @Override // wn0.a
                public final Object invoke() {
                    return v2.b.d(this.f78020a);
                }
            });
        }

        public final v2 e() {
            return new v2("PhotoLibraryPicker", this.context, this.sdkFilesManager, new wn0.a() { // from class: ig0.x2
                @Override // wn0.a
                public final Object invoke() {
                    return v2.b.f(this.f78039a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lig0/v2$c;", "", "<init>", "()V", "c", "b", "a", "Lig0/v2$c$a;", "Lig0/v2$c$b;", "Lig0/v2$c$c;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lig0/v2$c$a;", "Lig0/v2$c;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f78004a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: ig0.v2$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lig0/v2$c$b;", "Lig0/v2$c;", "", "", "absoluteFilePaths", "Lig0/v2$a;", AnalyticsAttribute.Reason, "<init>", "(Ljava/util/List;Lig0/v2$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lig0/v2$a;", "getReason", "()Lig0/v2$a;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failure extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> absoluteFilePaths;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(List<String> absoluteFilePaths, a reason) {
                super(null);
                p013kotlin.jvm.internal.s.k(absoluteFilePaths, "absoluteFilePaths");
                p013kotlin.jvm.internal.s.k(reason, "reason");
                this.absoluteFilePaths = absoluteFilePaths;
                this.reason = reason;
            }

            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return p013kotlin.jvm.internal.s.f(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public int hashCode() {
                return (this.absoluteFilePaths.hashCode() * 31) + this.reason.hashCode();
            }

            public String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }
        }

        /* JADX INFO: renamed from: ig0.v2$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lig0/v2$c$c;", "Lig0/v2$c;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> absoluteFilePaths;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(List<String> absoluteFilePaths) {
                super(null);
                p013kotlin.jvm.internal.s.k(absoluteFilePaths, "absoluteFilePaths");
                this.absoluteFilePaths = absoluteFilePaths;
            }

            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && p013kotlin.jvm.internal.s.f(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lig0/v2$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", f = "DocumentsSelectWorker.kt", i = {0, 2}, l = {40, 44, 48, 52}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class d extends SuspendLambda implements wn0.p<FlowCollector<? super c>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f78008n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f78009o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", f = "DocumentsSelectWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78011n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ v2 f78012o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v2 v2Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f78012o = v2Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f78012o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f78011n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                this.f78012o.launchPicker.invoke();
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v2 f78013a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector<c> f78014b;

            /* JADX WARN: Multi-variable type inference failed */
            b(v2 v2Var, FlowCollector<? super c> flowCollector) {
                this.f78013a = v2Var;
                this.f78014b = flowCollector;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends Uri> list, Continuation<? super jn0.h0> continuation) {
                Object objD = this.f78013a.d(this.f78014b, list, continuation);
                return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", f = "DocumentsSelectWorker.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78015n;

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new c(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f78015n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    return obj;
                }
                jn0.t.b(obj);
                com.withpersona.sdk2.inquiry.launchers.u uVar = new com.withpersona.sdk2.inquiry.launchers.u();
                this.f78015n = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(uVar, this);
                return objFirstOrNull == coroutine_suspended ? coroutine_suspended : objFirstOrNull;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Uri>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            d dVar = v2.this.new d(continuation);
            dVar.f78009o = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r2.d(r1, r11, r10) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            if (r11.collect(r3, r10) == r0) goto L30;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f78008n
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L36
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 == r2) goto L1d
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                jn0.t.b(r11)
                goto L93
            L22:
                java.lang.Object r1 = r10.f78009o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r11)
                goto L7c
            L2a:
                jn0.t.b(r11)
                goto L63
            L2e:
                java.lang.Object r1 = r10.f78009o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r11)
                goto L52
            L36:
                jn0.t.b(r11)
                java.lang.Object r11 = r10.f78009o
                kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
                ig0.v2$d$c r1 = new ig0.v2$d$c
                r1.<init>(r6)
                r10.f78009o = r11
                r10.f78008n = r5
                r7 = 100
                java.lang.Object r1 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r7, r1, r10)
                if (r1 != r0) goto L4f
                goto L92
            L4f:
                r9 = r1
                r1 = r11
                r11 = r9
            L52:
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L66
                ig0.v2 r2 = ig0.v2.this
                r10.f78009o = r6
                r10.f78008n = r4
                java.lang.Object r11 = ig0.v2.c(r2, r1, r11, r10)
                if (r11 != r0) goto L63
                goto L92
            L63:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            L66:
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                ig0.v2$d$a r4 = new ig0.v2$d$a
                ig0.v2 r5 = ig0.v2.this
                r4.<init>(r5, r6)
                r10.f78009o = r1
                r10.f78008n = r3
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r4, r10)
                if (r11 != r0) goto L7c
                goto L92
            L7c:
                com.withpersona.sdk2.inquiry.launchers.u r11 = new com.withpersona.sdk2.inquiry.launchers.u
                r11.<init>()
                ig0.v2$d$b r3 = new ig0.v2$d$b
                ig0.v2 r4 = ig0.v2.this
                r3.<init>(r4, r1)
                r10.f78009o = r6
                r10.f78008n = r2
                java.lang.Object r11 = r11.collect(r3, r10)
                if (r11 != r0) goto L93
            L92:
                return r0
            L93:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ig0.v2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super c> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public v2(String key, Context context, fi0.c sdkFilesManager, wn0.a<jn0.h0> launchPicker) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        p013kotlin.jvm.internal.s.k(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(FlowCollector<? super c> flowCollector, List<? extends Uri> list, Continuation<? super jn0.h0> continuation) {
        String absolutePath;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = this.context.getContentResolver();
        if (list.isEmpty()) {
            Object objEmit = flowCollector.emit(c.a.f78004a, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : jn0.h0.f84049a;
        }
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (Uri uri : list) {
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                fi0.c cVar = this.sdkFilesManager;
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "jpg";
                }
                File fileD = cVar.d(extensionFromMimeType);
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                try {
                    sn0.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    try {
                        sn0.b.a(inputStreamOpenInputStream, null);
                        sn0.b.a(fileOutputStream, null);
                        absolutePath = fileD.getAbsolutePath();
                        if (absolutePath != null) {
                            arrayList.add(absolutePath);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        sn0.b.a(inputStreamOpenInputStream, th4);
                        throw th5;
                    }
                }
            } catch (FileNotFoundException unused) {
                aVar = a.FileNotFound;
                absolutePath = null;
            } catch (SecurityException unused2) {
                aVar = a.PermissionDenied;
                absolutePath = null;
            }
        }
        if (aVar == null) {
            Object objEmit2 = flowCollector.emit(new c.Success(arrayList), continuation);
            if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = flowCollector.emit(new c.Failure(arrayList, aVar), continuation);
            if (objEmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit3;
            }
        }
        return jn0.h0.f84049a;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof v2) && p013kotlin.jvm.internal.s.f(this.key, ((v2) otherWorker).key);
    }

    @Override // y20.o
    public Flow<c> run() {
        return FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getIO());
    }
}
