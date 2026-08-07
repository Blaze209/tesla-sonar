package com.oney.WebRTCModule;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.core.util.Consumer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Objects;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera1Helper;
import org.webrtc.Camera2Capturer;
import org.webrtc.Camera2Helper;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes6.dex */
public class d extends com.oney.WebRTCModule.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f45872q = "d";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f45874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f45875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CameraEnumerator f45876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f45877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f45878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ReadableMap f45879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f45880p;

    class a extends e {
        a() {
        }

        @Override // com.oney.WebRTCModule.e, org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public void onCameraOpening(String str) {
            super.onCameraOpening(str);
            int iU = d.this.u(str);
            d dVar = d.this;
            dVar.x(iU, str, dVar.f45836g);
            d.this.f45874j = iU == -1 ? null : String.valueOf(iU);
        }
    }

    class b implements CameraVideoCapturer.CameraSwitchHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f45882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Consumer f45883b;

        b(Runnable runnable, Consumer consumer) {
            this.f45882a = runnable;
            this.f45883b = consumer;
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchDone(boolean z11) {
            d.this.f45873i = z11;
            this.f45882a.run();
        }

        @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
        public void onCameraSwitchError(String str) {
            Exception exc = new Exception("Error switching camera: " + str);
            Log.e(d.f45872q, "OnCameraSwitchError", exc);
            Consumer consumer = this.f45883b;
            if (consumer != null) {
                consumer.accept(exc);
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final VideoCapturer f45887c;

        public c(int i11, String str, VideoCapturer videoCapturer) {
            this.f45885a = i11;
            this.f45886b = str;
            this.f45887c = videoCapturer;
        }
    }

    public d(Context context, CameraEnumerator cameraEnumerator, ReadableMap readableMap) {
        super(readableMap.getInt(Snapshot.WIDTH), readableMap.getInt(Snapshot.HEIGHT), readableMap.getInt("frameRate"));
        this.f45880p = new a();
        this.f45875k = context;
        this.f45876l = cameraEnumerator;
        this.f45879o = readableMap;
        this.f45877m = g0.a(readableMap, "deviceId");
        this.f45878n = g0.a(this.f45879o, "facingMode");
    }

    private c t(String str, String str2) {
        int i11;
        String str3;
        String[] deviceNames = this.f45876l.getDeviceNames();
        ArrayList arrayList = new ArrayList();
        try {
            i11 = Integer.parseInt(str);
            try {
                str3 = deviceNames[i11];
            } catch (Exception unused) {
                Log.d(f45872q, "failed to find device with id: " + str);
                str3 = null;
            }
        } catch (Exception unused2) {
            i11 = -1;
        }
        if (str3 != null) {
            CameraVideoCapturer cameraVideoCapturerCreateCapturer = this.f45876l.createCapturer(str3, this.f45880p);
            String str4 = "Create user-specified camera " + str3;
            if (cameraVideoCapturerCreateCapturer != null) {
                Log.d(f45872q, str4 + " succeeded");
                this.f45873i = this.f45876l.isFrontFacing(str3);
                this.f45874j = String.valueOf(i11);
                return new c(i11, str3, cameraVideoCapturerCreateCapturer);
            }
            Log.d(f45872q, str4 + " failed");
            arrayList.add(str3);
        }
        boolean z11 = str2 == null || str2.equals("user");
        int i12 = -1;
        for (String str5 : deviceNames) {
            i12++;
            if (!arrayList.contains(str5) && this.f45876l.isFrontFacing(str5) == z11) {
                CameraVideoCapturer cameraVideoCapturerCreateCapturer2 = this.f45876l.createCapturer(str5, this.f45880p);
                String str6 = "Create camera " + str5;
                if (cameraVideoCapturerCreateCapturer2 != null) {
                    Log.d(f45872q, str6 + " succeeded");
                    this.f45873i = this.f45876l.isFrontFacing(str5);
                    this.f45874j = String.valueOf(i12);
                    return new c(i12, str5, cameraVideoCapturerCreateCapturer2);
                }
                Log.d(f45872q, str6 + " failed");
                arrayList.add(str5);
            }
        }
        int i13 = -1;
        for (String str7 : deviceNames) {
            i13++;
            if (!arrayList.contains(str7)) {
                CameraVideoCapturer cameraVideoCapturerCreateCapturer3 = this.f45876l.createCapturer(str7, this.f45880p);
                String str8 = "Create fallback camera " + str7;
                if (cameraVideoCapturerCreateCapturer3 != null) {
                    Log.d(f45872q, str8 + " succeeded");
                    this.f45873i = this.f45876l.isFrontFacing(str7);
                    this.f45874j = String.valueOf(i13);
                    return new c(i13, str7, cameraVideoCapturerCreateCapturer3);
                }
                Log.d(f45872q, str8 + " failed");
                arrayList.add(str7);
            }
        }
        this.f45874j = null;
        Log.w(f45872q, "Unable to identify a suitable camera.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(String str) {
        String[] deviceNames = this.f45876l.getDeviceNames();
        for (int i11 = 0; i11 < deviceNames.length; i11++) {
            if (Objects.equals(deviceNames[i11], str)) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(ReadableMap readableMap) {
        this.f45879o = readableMap;
        this.f45830a = readableMap.getInt(Snapshot.WIDTH);
        this.f45831b = readableMap.getInt(Snapshot.HEIGHT);
        this.f45832c = readableMap.getInt("frameRate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Runnable runnable, int i11, int i12, int i13, int i14, String str, CameraVideoCapturer cameraVideoCapturer, Consumer consumer) {
        runnable.run();
        if (this.f45830a != i11 || this.f45831b != i12 || this.f45832c != i13) {
            x(i14, str, this.f45836g);
            cameraVideoCapturer.changeCaptureFormat(this.f45830a, this.f45831b, this.f45832c);
        }
        if (consumer != null) {
            consumer.accept(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i11, String str, VideoCapturer videoCapturer) {
        Size sizeFindClosestCaptureFormat;
        if (videoCapturer instanceof Camera1Capturer) {
            sizeFindClosestCaptureFormat = Camera1Helper.findClosestCaptureFormat(i11, this.f45830a, this.f45831b);
        } else {
            sizeFindClosestCaptureFormat = videoCapturer instanceof Camera2Capturer ? Camera2Helper.findClosestCaptureFormat((CameraManager) this.f45875k.getSystemService("camera"), str, this.f45830a, this.f45831b) : null;
        }
        if (sizeFindClosestCaptureFormat != null) {
            this.f45833d = sizeFindClosestCaptureFormat.width;
            this.f45834e = sizeFindClosestCaptureFormat.height;
        }
    }

    @Override // com.oney.WebRTCModule.a
    public void a(final ReadableMap readableMap, final Consumer<Exception> consumer) {
        int i11;
        boolean z11;
        final int i12 = this.f45830a;
        final int i13 = this.f45831b;
        final int i14 = this.f45832c;
        final Runnable runnable = new Runnable() { // from class: com.oney.WebRTCModule.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f45846a.v(readableMap);
            }
        };
        String str = null;
        if (this.f45836g == null) {
            runnable.run();
            if (consumer != null) {
                consumer.accept(null);
                return;
            }
            return;
        }
        String[] deviceNames = this.f45876l.getDeviceNames();
        String str2 = this.f45877m;
        String str3 = this.f45878n;
        int i15 = -1;
        if (str2 != null) {
            try {
                i11 = Integer.parseInt(str2);
                try {
                    str = deviceNames[i11];
                } catch (Exception unused) {
                    Log.d(f45872q, "failed to find device with id: " + str2);
                }
            } catch (Exception unused2) {
                i11 = -1;
            }
        } else {
            i11 = -1;
        }
        if (str == null) {
            boolean z12 = str3 == null || str3.equals("user");
            int length = deviceNames.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i11 = i15;
                    break;
                }
                String str4 = deviceNames[i16];
                i15++;
                if (this.f45876l.isFrontFacing(str4) == z12) {
                    i11 = i15;
                    str = str4;
                    break;
                }
                i16++;
            }
        }
        if (str == null) {
            if (consumer != null) {
                consumer.accept(new Exception("OverconstrainedError: could not find camera with deviceId: " + str2 + " or facingMode: " + str3));
                return;
            }
            return;
        }
        try {
            z11 = i11 != Integer.parseInt(this.f45874j);
        } catch (Exception unused3) {
            Log.d(f45872q, "Forcing camera switch, couldn't parse current device id: " + this.f45874j);
            z11 = true;
        }
        final CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) this.f45836g;
        final String str5 = str;
        final int i17 = i11;
        Runnable runnable2 = new Runnable() { // from class: com.oney.WebRTCModule.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45857a.w(runnable, i12, i13, i14, i17, str5, cameraVideoCapturer, consumer);
            }
        };
        if (z11) {
            cameraVideoCapturer.switchCamera(new b(runnable2, consumer), str5);
        } else {
            runnable2.run();
        }
    }

    @Override // com.oney.WebRTCModule.a
    protected VideoCapturer b() {
        c cVarT = t(this.f45877m, this.f45878n);
        if (cVarT == null) {
            return null;
        }
        x(cVarT.f45885a, cVarT.f45886b, cVarT.f45887c);
        return cVarT.f45887c;
    }

    @Override // com.oney.WebRTCModule.a
    public String d() {
        return this.f45874j;
    }

    @Override // com.oney.WebRTCModule.a
    public WritableMap g() {
        WritableMap writableMapG = super.g();
        writableMapG.putString("facingMode", this.f45873i ? "user" : AnalyticsAttribute.Environment);
        return writableMapG;
    }
}
