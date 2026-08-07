package dz;

import android.location.Location;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.util.Log;
import android.util.Size;
import ez.PhotoFileInfo;
import fz.TakePhotoOptions;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldz/j;", "Lfz/s;", "options", "Ldz/k1;", "b", "(Ldz/j;Lfz/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/media/AudioManager;", "", "a", "(Landroid/media/AudioManager;)Z", "isSilent", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.core.CameraSession_PhotoKt", f = "CameraSession+Photo.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {48}, m = "takePhoto", n = {"photoOutput", "$this$takePicture$iv", "file$iv", "metadataProvider$iv", "callback$iv", "executor$iv", "enableShutterSound", "isMirrored"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "Z$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f61231n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f61232o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f61233p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f61234q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f61235r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f61236s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f61237t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f61238u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f61239v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f61240w;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61239v = obj;
            this.f61240w |= Integer.MIN_VALUE;
            return u.b(null, null, this);
        }
    }

    private static final boolean a(AudioManager audioManager) {
        return audioManager.getRingerMode() != 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(j jVar, TakePhotoOptions takePhotoOptions, Continuation<? super Photo> continuation) {
        a aVar;
        boolean z11;
        c0.r0 r0Var;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f61240w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f61240w = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f61239v;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f61240w;
        if (i12 == 0) {
            jn0.t.b(obj);
            c0.i camera = jVar.getCamera();
            if (camera == null) {
                throw new g();
            }
            CameraConfiguration configuration = jVar.getConfiguration();
            if (configuration == null) {
                throw new g();
            }
            CameraConfiguration.g<CameraConfiguration.Photo> gVarM = configuration.m();
            CameraConfiguration.g.b bVar = gVarM instanceof CameraConfiguration.g.b ? (CameraConfiguration.g.b) gVarM : null;
            if (bVar == null) {
                throw new m1();
            }
            c0.r0 photoOutput = jVar.getPhotoOutput();
            if (photoOutput == null) {
                throw new m1();
            }
            if (takePhotoOptions.getFlash() != fz.f.OFF && !camera.c().q()) {
                throw new k0();
            }
            photoOutput.D0(takePhotoOptions.getFlash().toFlashMode());
            int i13 = (!takePhotoOptions.getEnableShutterSound() || a(jVar.getAudioManager())) ? 0 : 1;
            boolean isMirrored = ((CameraConfiguration.Photo) bVar.a()).getIsMirrored();
            File file = takePhotoOptions.getFile().getFile();
            p013kotlin.jvm.internal.s.j(file, "<get-file>(...)");
            d1 metadataProvider = jVar.getMetadataProvider();
            j.b callback = jVar.getCallback();
            ExecutorService executorServiceB = i.INSTANCE.b();
            aVar.f61231n = photoOutput;
            aVar.f61232o = photoOutput;
            aVar.f61233p = file;
            aVar.f61234q = metadataProvider;
            aVar.f61235r = callback;
            aVar.f61236s = executorServiceB;
            aVar.f61237t = i13;
            aVar.f61238u = isMirrored;
            aVar.f61240w = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(aVar), 1);
            cancellableContinuationImpl.initCancellability();
            MediaActionSound mediaActionSound = i13 != 0 ? new MediaActionSound() : null;
            if (mediaActionSound != null) {
                mediaActionSound.load(0);
            }
            c0.r0.g.a aVar2 = new c0.r0.g.a(file);
            c0.r0.d dVar = new c0.r0.d();
            Location location = metadataProvider.getLocation();
            if (location != null) {
                Log.i("ImageCapture", "Setting Photo Location to " + location.getLatitude() + ", " + location.getLongitude() + "...");
                dVar.d(metadataProvider.getLocation());
            }
            dVar.e(isMirrored);
            aVar2.b(dVar);
            c0.r0.g gVarA = aVar2.a();
            p013kotlin.jvm.internal.s.j(gVarA, "build(...)");
            photoOutput.I0(gVarA, executorServiceB, new ez.g(i13, mediaActionSound, callback, cancellableContinuationImpl, file, gVarA));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(aVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = isMirrored;
            obj = result;
            r0Var = photoOutput;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = aVar.f61238u;
            r0Var = (c0.r0) aVar.f61231n;
            jn0.t.b(obj);
            z11 = z12;
        }
        PhotoFileInfo photoFileInfo = (PhotoFileInfo) obj;
        gz.c.Companion companion = gz.c.INSTANCE;
        String path = photoFileInfo.getUri().getPath();
        p013kotlin.jvm.internal.s.j(path, "getPath(...)");
        Size sizeB = companion.b(path);
        fz.i iVarB = fz.i.INSTANCE.b(r0Var.u0());
        String path2 = photoFileInfo.getUri().getPath();
        p013kotlin.jvm.internal.s.j(path2, "getPath(...)");
        return new Photo(path2, sizeB.getWidth(), sizeB.getHeight(), iVarB, z11);
    }
}
