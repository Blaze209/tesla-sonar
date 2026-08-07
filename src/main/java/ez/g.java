package ez;

import android.annotation.SuppressLint;
import android.media.MediaActionSound;
import androidx.camera.core.ImageCaptureException;
import c0.r0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fz.r;
import java.io.File;
import java.net.URI;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lez/g;", "Lc0/r0$f;", "Ljn0/h0;", "a", "()V", "Lc0/r0$h;", "outputFileResults", DateTokenConverter.CONVERTER_KEY, "(Lc0/r0$h;)V", "Landroidx/camera/core/ImageCaptureException;", "exception", "c", "(Landroidx/camera/core/ImageCaptureException;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class g implements r0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f63473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaActionSound f63474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ dz.j.b f63475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CancellableContinuation<PhotoFileInfo> f63476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ File f63477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ r0.g f63478f;

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z11, MediaActionSound mediaActionSound, dz.j.b bVar, CancellableContinuation<? super PhotoFileInfo> cancellableContinuation, File file, r0.g gVar) {
        this.f63473a = z11;
        this.f63474b = mediaActionSound;
        this.f63475c = bVar;
        this.f63476d = cancellableContinuation;
        this.f63477e = file;
        this.f63478f = gVar;
    }

    @Override // c0.r0.f
    public void a() {
        MediaActionSound mediaActionSound;
        super.a();
        if (this.f63473a && (mediaActionSound = this.f63474b) != null) {
            mediaActionSound.play(0);
        }
        this.f63475c.p(r.PHOTO);
    }

    @Override // c0.r0.f
    public void c(ImageCaptureException exception) {
        s.k(exception, "exception");
        if (this.f63476d.isActive()) {
            CancellableContinuation<PhotoFileInfo> cancellableContinuation = this.f63476d;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(t.a(exception)));
        }
    }

    @Override // c0.r0.f
    @SuppressLint({"RestrictedApi"})
    public void d(r0.h outputFileResults) {
        s.k(outputFileResults, "outputFileResults");
        if (this.f63476d.isActive()) {
            URI uri = this.f63477e.toURI();
            s.j(uri, "toURI(...)");
            r0.d dVarD = this.f63478f.d();
            s.j(dVarD, "getMetadata(...)");
            this.f63476d.resumeWith(jn0.s.b(new PhotoFileInfo(uri, dVarD)));
        }
    }
}
