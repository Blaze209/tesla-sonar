package od0;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.core.app.o;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.util.GmsVersion;
import com.tesla.notifications.attachment.AttachmentException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import nd0.h;
import nd0.i;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\b2\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0003R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u00103R\u0014\u00106\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00108¨\u0006:"}, d2 = {"Lod0/f;", "", "<init>", "()V", "Ljava/io/File;", "thumbnail", "Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "h", "(Ljava/io/File;Landroid/graphics/Bitmap;)V", "Lkotlinx/coroutines/Job;", "job", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlinx/coroutines/Job;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/core/app/o$e;", "builder", "", "title", "message", "", "attachmentEvents", "f", "(Landroid/content/Context;Ljava/io/File;Landroidx/core/app/o$e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroidx/core/app/o$e;", "Lkotlinx/coroutines/Deferred;", "c", "(Lkotlinx/coroutines/Deferred;)V", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "frameList", "j", "(Ljava/util/List;)V", "e", "Lkotlinx/coroutines/sync/Mutex;", "a", "Lkotlinx/coroutines/sync/Mutex;", "g", "()Lkotlinx/coroutines/sync/Mutex;", "setReady", "(Lkotlinx/coroutines/sync/Mutex;)V", "ready", "b", "Ljava/util/List;", "deferredFrameList", "resolvedFrameList", "Lkotlinx/coroutines/Job;", "fetchFrameJob", "", "I", "MAX_FRAME_MEMORY", "Ljava/lang/String;", "TAG", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile f f97197i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Mutex ready = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<Deferred<Bitmap>> deferredFrameList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<Bitmap> resolvedFrameList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Job fetchFrameJob;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int MAX_FRAME_MEMORY;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private com.tesla.logging.g logger;

    /* JADX INFO: renamed from: od0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lod0/f$a;", "", "<init>", "()V", "Lod0/f;", "a", "()Lod0/f;", "manager", "Lod0/f;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            if (f.f97197i == null) {
                synchronized (this) {
                    try {
                        if (f.f97197i == null) {
                            f.f97197i = new f();
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            f fVar = f.f97197i;
            s.h(fVar);
            return fVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.notifications.attachment.NotificationVideoManager", f = "NotificationVideoManager.kt", i = {0}, l = {80, 81}, m = "awaitAllFrames", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97205n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f97206o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f97208q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97206o = obj;
            this.f97208q |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    public f() {
        List<Deferred<Bitmap>> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        s.j(listSynchronizedList, "synchronizedList(...)");
        this.deferredFrameList = listSynchronizedList;
        this.MAX_FRAME_MEMORY = GmsVersion.VERSION_LONGHORN;
        this.TAG = "VideoNotificationManager";
        this.logger = com.tesla.logging.g.INSTANCE.a("TeslaNotification").p("VideoNotificationManager");
    }

    private final void h(File thumbnail, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(thumbnail);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                sn0.b.a(fileOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            this.logger.d("Failed to save thumbnail: " + e11.getMessage(), e11);
        }
    }

    public final void c(Deferred<Bitmap> bitmap) {
        s.k(bitmap, "bitmap");
        this.deferredFrameList.add(bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6.join(r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p013kotlin.coroutines.Continuation<? super jn0.h0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof od0.f.b
            if (r0 == 0) goto L13
            r0 = r6
            od0.f$b r0 = (od0.f.b) r0
            int r1 = r0.f97208q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97208q = r1
            goto L18
        L13:
            od0.f$b r0 = new od0.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97206o
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f97208q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f97205n
            od0.f r0 = (od0.f) r0
            jn0.t.b(r6)
            goto L63
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.f97205n
            od0.f r2 = (od0.f) r2
            jn0.t.b(r6)
            goto L53
        L40:
            jn0.t.b(r6)
            kotlinx.coroutines.Job r6 = r5.fetchFrameJob
            if (r6 == 0) goto L52
            r0.f97205n = r5
            r0.f97208q = r4
            java.lang.Object r6 = r6.join(r0)
            if (r6 != r1) goto L52
            goto L61
        L52:
            r2 = r5
        L53:
            java.util.List<kotlinx.coroutines.Deferred<android.graphics.Bitmap>> r6 = r2.deferredFrameList
            java.util.Collection r6 = (java.util.Collection) r6
            r0.f97205n = r2
            r0.f97208q = r3
            java.lang.Object r6 = kotlinx.coroutines.AwaitKt.awaitAll(r6, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            r0 = r2
        L63:
            java.util.List r6 = (java.util.List) r6
            r0.resolvedFrameList = r6
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.f.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        this.deferredFrameList.clear();
        this.resolvedFrameList = null;
        Job job = this.fetchFrameJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.fetchFrameJob = null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c9, please report this as an issue */
    public final o.e f(Context context, File thumbnail, o.e builder, String title, String message, List<String> attachmentEvents) throws AttachmentException {
        int allocationByteCount;
        int i11;
        s.k(context, "context");
        s.k(thumbnail, "thumbnail");
        s.k(builder, "builder");
        s.k(attachmentEvents, "attachmentEvents");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i.f93863d);
        if (title != null) {
            remoteViews.setTextViewText(h.f93858r, title);
        }
        if (message != null) {
            remoteViews.setTextViewText(h.f93857q, message);
        }
        com.tesla.logging.g gVar = this.logger;
        List<Bitmap> list = this.resolvedFrameList;
        gVar.j("resolvedFrameList size is " + (list != null ? Integer.valueOf(list.size()) : null));
        List<Bitmap> list2 = this.resolvedFrameList;
        int i12 = 0;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            allocationByteCount = 0;
            i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        v.x();
                    }
                    Bitmap bitmap = (Bitmap) next;
                    if (bitmap != null) {
                        if (i12 == 0) {
                            h(thumbnail, bitmap);
                        }
                        if (bitmap.getAllocationByteCount() + allocationByteCount >= this.MAX_FRAME_MEMORY) {
                            this.logger.j("[memory limit] maximum frame carried with memory: " + allocationByteCount + " bytes, early return with " + i11 + " frames");
                            break;
                        }
                        allocationByteCount += bitmap.getAllocationByteCount();
                        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i.f93862c);
                        remoteViews2.setImageViewBitmap(h.f93856p, bitmap);
                        remoteViews.addView(h.f93859s, remoteViews2);
                        i11++;
                    }
                    i12 = i13;
                } else {
                    i12 = i11;
                }
            }
            if (i11 != 0) {
                throw new AttachmentException("no frames");
            }
            this.logger.j("frame carried: " + i11 + ", " + allocationByteCount + " bytes");
            attachmentEvents.add("frames carried: " + i11 + ", " + allocationByteCount + " bytes");
            builder.n(remoteViews);
            builder.F(new o.g());
            return builder;
        }
        allocationByteCount = 0;
        i11 = i12;
        if (i11 != 0) {
            throw new AttachmentException("no frames");
        }
        this.logger.j("frame carried: " + i11 + ", " + allocationByteCount + " bytes");
        attachmentEvents.add("frames carried: " + i11 + ", " + allocationByteCount + " bytes");
        builder.n(remoteViews);
        builder.F(new o.g());
        return builder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Mutex getReady() {
        return this.ready;
    }

    public final void i(Job job) {
        s.k(job, "job");
        this.fetchFrameJob = job;
    }

    public final void j(List<Bitmap> frameList) {
        this.resolvedFrameList = frameList;
    }
}
