package com.mrousavy.camera.react;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import dz.Photo;
import fz.TakePhotoOptions;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Lcom/facebook/react/bridge/ReadableMap;", "optionsMap", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/mrousavy/camera/react/o;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraView_TakePhotoKt", f = "CameraView+TakePhoto.kt", i = {}, l = {19}, m = "takePhoto", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f45789n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f45790o;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45789n = obj;
            this.f45790o |= Integer.MIN_VALUE;
            return x.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"UnsafeOptInUsageError"})
    public static final Object a(o oVar, ReadableMap readableMap, Continuation<? super WritableMap> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f45790o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f45790o = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f45789n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f45790o;
        if (i12 == 0) {
            jn0.t.b(objB);
            Log.i("CameraView.takePhoto", "Taking photo... Options: " + readableMap.toHashMap());
            TakePhotoOptions.Companion companion = TakePhotoOptions.INSTANCE;
            Context context = oVar.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            TakePhotoOptions takePhotoOptionsA = companion.a(context, readableMap);
            dz.j cameraSession = oVar.getCameraSession();
            aVar.f45790o = 1;
            objB = dz.u.b(cameraSession, takePhotoOptionsA, aVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objB);
        }
        Photo photo = (Photo) objB;
        Log.i("CameraView.takePhoto", "Successfully captured " + photo.getWidth() + " x " + photo.getHeight() + " photo!");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("path", photo.getPath());
        writableMapCreateMap.putInt(Snapshot.WIDTH, photo.getWidth());
        writableMapCreateMap.putInt(Snapshot.HEIGHT, photo.getHeight());
        writableMapCreateMap.putString("orientation", photo.getOrientation().getUnionValue());
        writableMapCreateMap.putBoolean("isRawPhoto", false);
        writableMapCreateMap.putBoolean("isMirrored", photo.getIsMirrored());
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
