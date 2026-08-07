package bg0;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f17143a;

    g(f fVar) {
        this.f17143a = fVar;
    }

    public static qj0.i<e.a> b(f fVar) {
        return qj0.f.a(new g(fVar));
    }

    @Override // bg0.e.a
    public e a(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, a aVar, fg0.a aVar2, ej0.a aVar3, boolean z11) {
        return this.f17143a.b(cameraChoices, camera2PreviewView, aVar, aVar2, aVar3, z11);
    }
}
