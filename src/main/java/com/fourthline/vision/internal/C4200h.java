package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4200h implements J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I5 f38348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f38350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f38351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Q2 f38352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q2 f38353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f38354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38355h;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.h$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f38357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f38358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f38359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f38361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38362g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f38364i;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38362g = obj;
            this.f38364i |= Integer.MIN_VALUE;
            return C4200h.process$suspendImpl(C4200h.this, null, this);
        }
    }

    public C4200h(I5 stepConfig, List<? extends G5> preconditions, List<? extends InterfaceC4265q0> errors, List<? extends Q2> warnings, Q2 processor, Q2 detector, List<? extends InterfaceC4265q0> postProcessors) {
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        p013kotlin.jvm.internal.s.k(preconditions, "preconditions");
        p013kotlin.jvm.internal.s.k(errors, "errors");
        p013kotlin.jvm.internal.s.k(warnings, "warnings");
        p013kotlin.jvm.internal.s.k(processor, "processor");
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(postProcessors, "postProcessors");
        this.f38348a = stepConfig;
        this.f38349b = preconditions;
        this.f38350c = errors;
        this.f38351d = warnings;
        this.f38352e = processor;
        this.f38353f = detector;
        this.f38354g = postProcessors;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x012c A[Catch: all -> 0x01d7, TryCatch #0 {all -> 0x01d7, blocks: (B:13:0x0032, B:73:0x01c0, B:16:0x0047, B:62:0x0171, B:64:0x0177, B:67:0x0197, B:69:0x019d, B:75:0x01ce, B:76:0x01d0, B:19:0x0064, B:55:0x014e, B:49:0x0126, B:51:0x012c, B:56:0x0157, B:61:0x0167, B:77:0x01d1, B:78:0x01d6, B:22:0x0079, B:43:0x00ef, B:45:0x00f5, B:48:0x010e, B:25:0x0086, B:42:0x00e4, B:29:0x0098, B:33:0x00af, B:35:0x00b5, B:38:0x00cd, B:32:0x00a3), top: B:91:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0149 -> B:55:0x014e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static /* synthetic */ <SCANNER_STEP, SCANNER_WARNING extends java.lang.Enum<?>, DETECTION> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.C4200h r10, android.media.Image r11, p013kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.K5>> r12) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.C4200h.process$suspendImpl(com.fourthline.vision.internal.h, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Q2 getDetector() {
        return this.f38353f;
    }

    public List<InterfaceC4265q0> getErrors() {
        return this.f38350c;
    }

    public List<InterfaceC4265q0> getPostProcessors() {
        return this.f38354g;
    }

    public List<G5> getPreconditions() {
        return this.f38349b;
    }

    public Q2 getProcessor() {
        return this.f38352e;
    }

    @Override // com.fourthline.vision.internal.J5
    public I5 getStepConfig() {
        return this.f38348a;
    }

    public List<Q2> getWarnings() {
        return this.f38351d;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.InterfaceC4237m0
    public boolean isCompleted() {
        return this.f38355h;
    }

    public Object process(Image image, Continuation<? super Try<? extends K5>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    public void setCompleted(boolean z11) {
        this.f38355h = z11;
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        setCompleted(false);
        Iterator<T> it = getPreconditions().iterator();
        while (it.hasNext()) {
            ((G5) it.next()).start();
        }
        Iterator<T> it2 = getWarnings().iterator();
        while (it2.hasNext()) {
            ((Q2) it2.next()).start();
        }
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Iterator<T> it = getPreconditions().iterator();
        while (it.hasNext()) {
            ((G5) it.next()).stop();
        }
        Iterator<T> it2 = getWarnings().iterator();
        while (it2.hasNext()) {
            ((Q2) it2.next()).stop();
        }
        getProcessor().stop();
        setCompleted(true);
    }

    @Override // com.fourthline.vision.internal.J5, com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((Image) obj, (Continuation<? super Try<? extends K5>>) continuation);
    }

    public /* synthetic */ C4200h(I5 i11, List list, List list2, List list3, Q2 q11, Q2 q12, List list4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list, list2, list3, q11, q12, (i12 & 64) != 0 ? p013kotlin.collections.v.m() : list4);
    }
}
