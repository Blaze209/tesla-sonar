package dz;

import android.annotation.SuppressLint;
import android.location.Location;
import android.util.Log;
import android.util.Size;
import androidx.core.util.Consumer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fz.Video;
import p013kotlin.Metadata;
import z0.d2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aK\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Ldz/j;", "", "enableAudio", "Lfz/p;", "options", "Lkotlin/Function1;", "Lfz/v;", "Ljn0/h0;", "callback", "Ldz/c;", "onError", "e", "(Ldz/j;ZLfz/p;Lwn0/l;Lwn0/l;)V", "g", "(Ldz/j;)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w {
    public static final void b(j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        jVar.Y0(true);
        g(jVar);
    }

    public static final void c(j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        z0.g1 recording = jVar.getRecording();
        if (recording == null) {
            throw new i1();
        }
        recording.d();
    }

    public static final void d(j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        z0.g1 recording = jVar.getRecording();
        if (recording == null) {
            throw new i1();
        }
        recording.i();
    }

    @SuppressLint({"MissingPermission", "RestrictedApi"})
    public static final void e(final j jVar, boolean z11, final fz.p options, final wn0.l<? super Video, jn0.h0> callback, final wn0.l<? super c, jn0.h0> onError) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(onError, "onError");
        if (jVar.getCamera() == null) {
            throw new g();
        }
        if (jVar.getRecording() != null) {
            throw new r1();
        }
        final z0.r1<z0.t0> r1VarZ0 = jVar.z0();
        if (r1VarZ0 == null) {
            throw new x1();
        }
        z0.r.a aVar = new z0.r.a(options.getCh.qos.logback.core.joran.action.Action.FILE_ATTRIBUTE java.lang.String().getFile());
        Location location = jVar.getMetadataProvider().getLocation();
        if (location != null) {
            Log.i("CameraSession", "Setting Video Location to " + location.getLatitude() + ", " + location.getLongitude() + "...");
            aVar.a(location);
        }
        z0.r rVarB = aVar.b();
        p013kotlin.jvm.internal.s.j(rVarB, "build(...)");
        z0.w wVarE0 = ((z0.t0) r1VarZ0.F0()).e0(jVar.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), rVarB);
        p013kotlin.jvm.internal.s.j(wVarE0, "prepareRecording(...)");
        if (z11) {
            jVar.t();
            wVarE0 = z0.w.l(wVarE0, false, 1, null);
        }
        z0.w wVarA = wVarE0.a();
        jVar.Y0(false);
        jVar.U0(wVarA.j(i.INSTANCE.b(), new Consumer() { // from class: dz.v
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) throws w1 {
                w.f(jVar, onError, options, r1VarZ0, callback, (d2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j jVar, wn0.l lVar, fz.p pVar, z0.r1 r1Var, wn0.l lVar2, d2 event) throws w1 {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof d2.d) {
            Log.i("CameraSession", "Recording started!");
            return;
        }
        if (event instanceof d2.c) {
            Log.i("CameraSession", "Recording resumed!");
            return;
        }
        if (event instanceof d2.b) {
            Log.i("CameraSession", "Recording paused!");
            return;
        }
        if (event instanceof d2.e) {
            Log.i("CameraSession", "Status update! Recorded " + ((d2.e) event).d().b() + " bytes.");
            return;
        }
        if (event instanceof d2.a) {
            if (jVar.getIsRecordingCanceled()) {
                Log.i("CameraSession", "Recording was canceled, deleting file..");
                lVar.invoke(new q1());
                try {
                    pVar.getCh.qos.logback.core.joran.action.Action.FILE_ATTRIBUTE java.lang.String().getFile().delete();
                    return;
                } catch (Throwable th2) {
                    jVar.getCallback().onError(new i0(th2));
                    return;
                }
            }
            Log.i("CameraSession", "Recording stopped!");
            d2.a aVar = (d2.a) event;
            p1 p1VarA = ez.p.a(aVar);
            if (p1VarA != null) {
                if (!p1VarA.getWasVideoRecorded()) {
                    Log.e("CameraSession", "Video Recorder encountered a fatal error!", p1VarA);
                    lVar.invoke(p1VarA);
                    return;
                }
                Log.e("CameraSession", "Video Recorder encountered an error, but the video was recorded anyways.", p1VarA);
            }
            long jC = aVar.d().c() / ((long) 1000000);
            Log.i("CameraSession", "Successfully completed video recording! Captured " + (jC / 1000.0d) + " seconds.");
            String path = aVar.l().a().getPath();
            if (path == null) {
                throw new w1(false, null);
            }
            Size sizeG = r1Var.g();
            if (sizeG == null) {
                sizeG = new Size(0, 0);
            }
            lVar2.invoke(new Video(path, jC, sizeG));
        }
    }

    public static final void g(j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        z0.g1 recording = jVar.getRecording();
        if (recording == null) {
            throw new i1();
        }
        recording.stop();
        jVar.U0(null);
    }
}
