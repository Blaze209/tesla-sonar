package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.io.File;
import java.net.URI;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4247n3 implements InterfaceC4240m3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f38648h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f38649i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AbstractC4255o4.a f38650j = new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4184f f38652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4226k3 f38653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4254o3 f38654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4306w0 f38655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4298v f38656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Pair f38657g;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n3$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC4240m3.a.values().length];
            try {
                iArr[InterfaceC4240m3.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC4240m3.a.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC4240m3.a.VIDEO_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n3$c */
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38659b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38661d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38659b = obj;
            this.f38661d |= Integer.MIN_VALUE;
            return C4247n3.this.cancel(this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n3$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38663b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38665d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38663b = obj;
            this.f38665d |= Integer.MIN_VALUE;
            return C4247n3.this.stop(this);
        }
    }

    public C4247n3(wn0.a<? extends InterfaceC4240m3.a> recordingTypeFactory, InterfaceC4184f audioRecorder, InterfaceC4226k3 mediaFilesManager, InterfaceC4254o3 mediaTrimmer, InterfaceC4306w0 mediaDurationIntervalDataSource) {
        p013kotlin.jvm.internal.s.k(recordingTypeFactory, "recordingTypeFactory");
        p013kotlin.jvm.internal.s.k(audioRecorder, "audioRecorder");
        p013kotlin.jvm.internal.s.k(mediaFilesManager, "mediaFilesManager");
        p013kotlin.jvm.internal.s.k(mediaTrimmer, "mediaTrimmer");
        p013kotlin.jvm.internal.s.k(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        this.f38651a = recordingTypeFactory;
        this.f38652b = audioRecorder;
        this.f38653c = mediaFilesManager;
        this.f38654d = mediaTrimmer;
        this.f38655e = mediaDurationIntervalDataSource;
        this.f38657g = jn0.x.a(recordingTypeFactory.invoke(), Boolean.FALSE);
    }

    private final void changeRecordingStatus(boolean z11) {
        this.f38657g = Pair.d(this.f38657g, null, Boolean.valueOf(z11), 1, null);
    }

    private final InterfaceC4240m3.a getRecordingType() {
        return (InterfaceC4240m3.a) this.f38657g.e();
    }

    private final boolean isRecording() {
        return ((Boolean) this.f38657g.f()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try start$lambda$1(C4247n3 c4247n3, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        c4247n3.changeRecordingStatus(false);
        return TryKt.failure(f38650j);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.InterfaceC4240m3
    public Object cancel(Continuation<? super jn0.h0> continuation) {
        c cVar;
        C4247n3 c4247n3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f38661d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f38661d = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objStopRecording = cVar.f38659b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f38661d;
        if (i12 == 0) {
            jn0.t.b(objStopRecording);
            if (isRecording()) {
                if (getRecordingType() != InterfaceC4240m3.a.NONE) {
                    C4298v videoRecorder = getVideoRecorder();
                    if (videoRecorder != null) {
                        cVar.f38658a = this;
                        cVar.f38661d = 1;
                        objStopRecording = videoRecorder.stopRecording(cVar);
                        if (objStopRecording == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c4247n3 = this;
                    } else {
                        c4247n3 = this;
                    }
                    if (c4247n3.getRecordingType() == InterfaceC4240m3.a.VIDEO_AUDIO) {
                        c4247n3.f38652b.stopRecording();
                    }
                    c4247n3.f38653c.deleteTempFiles();
                } else {
                    c4247n3 = this;
                }
                c4247n3.changeRecordingStatus(false);
            }
            return jn0.h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c4247n3 = (C4247n3) cVar.f38658a;
        jn0.t.b(objStopRecording);
        if (c4247n3.getRecordingType() == InterfaceC4240m3.a.VIDEO_AUDIO) {
            c4247n3.f38652b.stopRecording();
        }
        c4247n3.f38653c.deleteTempFiles();
        c4247n3.changeRecordingStatus(false);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4240m3
    public C4298v getVideoRecorder() {
        return this.f38656f;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4240m3
    public void setVideoRecorder(C4298v c4298v) {
        this.f38656f = c4298v;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4240m3
    public Try<jn0.h0> start() {
        Try tryJust;
        if (isRecording()) {
            return TryKt.failure(f38650j);
        }
        this.f38657g = jn0.x.a(this.f38651a.invoke(), Boolean.TRUE);
        int i11 = b.$EnumSwitchMapping$0[getRecordingType().ordinal()];
        if (i11 == 1) {
            tryJust = Try.INSTANCE.just(jn0.h0.f84049a);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Try.Companion companion = Try.INSTANCE;
            try {
                C4298v videoRecorder = getVideoRecorder();
                p013kotlin.jvm.internal.s.h(videoRecorder);
                videoRecorder.startRecording(this.f38653c.createTempFile(InterfaceC4226k3.a.VIDEO));
                if (getRecordingType() == InterfaceC4240m3.a.VIDEO_AUDIO) {
                    this.f38652b.startRecording(this.f38653c.createTempFile(InterfaceC4226k3.a.AUDIO));
                }
                tryJust = new Try.Success(jn0.h0.f84049a);
            } catch (Throwable th2) {
                if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                    throw th2;
                }
                tryJust = new Try.Failure(th2);
            }
        }
        return TryKt.handleErrorWith(tryJust, new wn0.l() { // from class: com.fourthline.vision.internal.za
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4247n3.start$lambda$1(this.f39162a, (Throwable) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.fourthline.vision.internal.InterfaceC4240m3
    public Object stop(Continuation<? super Try<URI>> continuation) throws Throwable {
        d dVar;
        Throwable th2;
        C4247n3 c4247n3;
        Object failure;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f38665d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f38665d = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objStopRecording = dVar.f38663b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f38665d;
        if (i12 == 0) {
            jn0.t.b(objStopRecording);
            if (!isRecording()) {
                return TryKt.failure(f38650j);
            }
            changeRecordingStatus(false);
            int i13 = b.$EnumSwitchMapping$0[getRecordingType().ordinal()];
            if (i13 == 1) {
                return Try.INSTANCE.just(null);
            }
            if (i13 != 2 && i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Try.Companion companion = Try.INSTANCE;
            try {
                C4298v videoRecorder = getVideoRecorder();
                p013kotlin.jvm.internal.s.h(videoRecorder);
                dVar.f38662a = this;
                dVar.f38665d = 1;
                objStopRecording = videoRecorder.stopRecording(dVar);
                if (objStopRecording == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c4247n3 = this;
            } catch (Throwable th3) {
                th2 = th3;
                c4247n3 = this;
                if (th2 instanceof VirtualMachineError) {
                    throw th2;
                }
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4247n3 = (C4247n3) dVar.f38662a;
            try {
                jn0.t.b(objStopRecording);
            } catch (Throwable th4) {
                th2 = th4;
                if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                    throw th2;
                }
                failure = new Try.Failure(th2);
            }
        }
        File file = (File) objStopRecording;
        File fileStopRecording = c4247n3.getRecordingType() == InterfaceC4240m3.a.VIDEO_AUDIO ? c4247n3.f38652b.stopRecording() : null;
        Pair pair = (Pair) c4247n3.f38655e.get();
        File fileCreateResultFile = c4247n3.f38653c.createResultFile(InterfaceC4226k3.a.VIDEO);
        InterfaceC4254o3 interfaceC4254o3 = c4247n3.f38654d;
        String path = file.getPath();
        p013kotlin.jvm.internal.s.j(path, "getPath(...)");
        String path2 = fileStopRecording != null ? fileStopRecording.getPath() : null;
        String path3 = fileCreateResultFile.getPath();
        p013kotlin.jvm.internal.s.j(path3, "getPath(...)");
        interfaceC4254o3.trimVideo(path, path2, path3, ((Number) pair.e()).longValue(), ((Number) pair.f()).longValue());
        failure = new Try.Success(fileCreateResultFile.toURI());
        c4247n3.f38653c.deleteTempFiles();
        return failure;
    }
}
