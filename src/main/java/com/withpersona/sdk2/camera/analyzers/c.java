package com.withpersona.sdk2.camera.analyzers;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import jn0.s;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import zf0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/c;", "Lag0/b;", "Lcom/withpersona/sdk2/camera/analyzers/d;", "idFrontAnalyzer", "Lcom/withpersona/sdk2/camera/analyzers/b;", "barcodePdf417Analyzer", "<init>", "(Lcom/withpersona/sdk2/camera/analyzers/d;Lcom/withpersona/sdk2/camera/analyzers/b;)V", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/camera/analyzers/d;", "b", "Lcom/withpersona/sdk2/camera/analyzers/b;", "", "Lzf0/q0$c;", "c", "Ljava/util/Map;", "analyzers", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements ag0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d idFrontAnalyzer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b barcodePdf417Analyzer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<ag0.b, q0.c> analyzers;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer", f = "FrontOrBackAnalyzer.kt", i = {0, 0, 0, 0}, l = {27}, m = "analyze-0E7RQCE", n = {"image", "viewfinderRect", AnalyticsAttribute.Error, "side"}, s = {"L$0", "L$1", "L$2", "L$4"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57168n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f57169o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f57170p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f57171q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f57172r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f57173s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f57175u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57173s = obj;
            this.f57175u |= Integer.MIN_VALUE;
            Object objA = c.this.a(null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    public c(d idFrontAnalyzer, b barcodePdf417Analyzer) {
        p013kotlin.jvm.internal.s.k(idFrontAnalyzer, "idFrontAnalyzer");
        p013kotlin.jvm.internal.s.k(barcodePdf417Analyzer, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = idFrontAnalyzer;
        this.barcodePdf417Analyzer = barcodePdf417Analyzer;
        this.analyzers = v0.m(x.a(barcodePdf417Analyzer, q0.c.Back), x.a(idFrontAnalyzer, q0.c.Front));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:21:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ag0.b
    public java.lang.Object a(zf0.i0 r10, android.graphics.Rect r11, p013kotlin.coroutines.Continuation<? super jn0.s<? extends com.withpersona.sdk2.camera.analyzers.a>> r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.analyzers.c.a(zf0.i0, android.graphics.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
