package com.mrousavy.camera.react;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.view.PreviewView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import dz.t1;
import dz.u1;
import fz.TakeSnapshotOptions;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Lfz/t;", "options", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/mrousavy/camera/react/o;Lfz/t;)Lcom/facebook/react/bridge/WritableMap;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class y {
    public static final WritableMap a(o oVar, TakeSnapshotOptions options) throws t1, u1 {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(options, "options");
        Log.i("CameraView.takeSnapshot", "Capturing snapshot of Camera View...");
        PreviewView previewView = oVar.getPreviewView();
        if (previewView == null) {
            throw new u1();
        }
        Bitmap bitmap = previewView.getBitmap();
        if (bitmap == null) {
            throw new t1();
        }
        oVar.p(fz.r.SNAPSHOT);
        gz.c.Companion companion = gz.c.INSTANCE;
        File file = options.getFile().getFile();
        p013kotlin.jvm.internal.s.j(file, "<get-file>(...)");
        companion.c(bitmap, file, options.getQuality());
        Log.i("CameraView.takeSnapshot", "Successfully saved snapshot to file!");
        fz.i iVarS0 = oVar.getCameraSession().s0();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("path", options.getFile().getFile().getAbsolutePath());
        writableMapCreateMap.putInt(Snapshot.WIDTH, bitmap.getWidth());
        writableMapCreateMap.putInt(Snapshot.HEIGHT, bitmap.getHeight());
        writableMapCreateMap.putString("orientation", iVarS0.getUnionValue());
        writableMapCreateMap.putBoolean("isMirrored", false);
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
