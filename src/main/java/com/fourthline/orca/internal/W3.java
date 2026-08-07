package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class W3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29389c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29390d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29391e = "CdnAssetBundleDownloadWorker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X3 f29392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3438jo f29393b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f29397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f29398e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29400g;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29398e = obj;
            this.f29400g |= Integer.MIN_VALUE;
            Object objA = W3.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public W3(X3 cdnUrlDownloadWorker, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f29392a = cdnUrlDownloadWorker;
        this.f29393b = tracker;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00db A[Catch: Exception -> 0x010b, TryCatch #0 {Exception -> 0x010b, blocks: (B:23:0x00cb, B:25:0x00db, B:28:0x010e), top: B:35:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:32:0x013a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c2 -> B:21:0x00c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(com.fourthline.orca.internal.C3967w0 r14, p013kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.W3.a(com.fourthline.orca.internal.w0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
