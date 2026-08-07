package bg0;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<eg0.a> f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<fi0.c> f17142c;

    public f(qj0.i<Context> iVar, qj0.i<eg0.a> iVar2, qj0.i<fi0.c> iVar3) {
        this.f17140a = iVar;
        this.f17141b = iVar2;
        this.f17142c = iVar3;
    }

    public static f a(qj0.i<Context> iVar, qj0.i<eg0.a> iVar2, qj0.i<fi0.c> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static e c(Context context, eg0.a aVar, fi0.c cVar, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, a aVar2, fg0.a aVar3, ej0.a aVar4, boolean z11) {
        return new e(context, aVar, cVar, cameraChoices, camera2PreviewView, aVar2, aVar3, aVar4, z11);
    }

    public e b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, a aVar, fg0.a aVar2, ej0.a aVar3, boolean z11) {
        return c(this.f17140a.get(), this.f17141b.get(), this.f17142c.get(), cameraChoices, camera2PreviewView, aVar, aVar2, aVar3, z11);
    }
}
