package com.releaseprofiler;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.a;
import sn0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/releaseprofiler/ReleaseProfilerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "startProfiling", "()Z", "saveToDownloads", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "stopProfiling", "(ZLcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "Companion", "a", "react-native-release-profiler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReleaseProfilerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ReleaseProfiler";
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReleaseProfilerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean startProfiling() {
        HermesSamplingProfiler.enable();
        return true;
    }

    @ReactMethod
    public final void stopProfiling(boolean saveToDownloads, Promise promise) throws IOException {
        s.k(promise, "promise");
        File fileCreateTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.reactContext.getCacheDir());
        String path = fileCreateTempFile.getPath();
        s.h(path);
        HermesSamplingProfiler.dumpSampledTraceToFile(path);
        HermesSamplingProfiler.disable();
        Toast.makeText(this.reactContext, "Saved results from Profiler to " + path, 1).show();
        if (saveToDownloads) {
            String name = fileCreateTempFile.getName();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", name);
                contentValues.put("mime_type", "text/plain");
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                ContentResolver contentResolver = this.reactContext.getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert != null) {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL("file://" + path));
                    try {
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        try {
                            s.h(inputStreamOpenStream);
                            s.h(outputStreamOpenOutputStream);
                            a.a(inputStreamOpenStream, outputStreamOpenOutputStream, PKIFailureInfo.certRevoked);
                            b.a(outputStreamOpenOutputStream, null);
                            b.a(inputStreamOpenStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                b.a(outputStreamOpenOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            b.a(inputStreamOpenStream, th4);
                            throw th5;
                        }
                    }
                }
            } else {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), name);
                InputStream inputStreamOpenStream2 = FirebasePerfUrlConnection.openStream(new URL("file://" + path));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        s.h(inputStreamOpenStream2);
                        a.b(inputStreamOpenStream2, fileOutputStream, 0, 2, null);
                        b.a(fileOutputStream, null);
                        b.a(inputStreamOpenStream2, null);
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            b.a(fileOutputStream, th6);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        b.a(inputStreamOpenStream2, th8);
                        throw th9;
                    }
                }
            }
        }
        promise.resolve(path);
    }
}
