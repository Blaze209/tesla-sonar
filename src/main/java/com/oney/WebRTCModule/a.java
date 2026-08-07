package com.oney.WebRTCModule;

import androidx.core.util.Consumer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f45830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f45831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f45832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f45833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f45834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f45835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected VideoCapturer f45836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected InterfaceC0713a f45837h;

    /* JADX INFO: renamed from: com.oney.WebRTCModule.a$a, reason: collision with other inner class name */
    public interface InterfaceC0713a {
        void a();
    }

    public a(int i11, int i12, int i13) {
        this.f45830a = i11;
        this.f45831b = i12;
        this.f45832c = i13;
        this.f45833d = i11;
        this.f45834e = i12;
        this.f45835f = i13;
    }

    public void a(ReadableMap readableMap, Consumer<Exception> consumer) {
        if (consumer != null) {
            consumer.accept(new UnsupportedOperationException("This video track does not support applyConstraints."));
        }
    }

    protected abstract VideoCapturer b();

    public void c() {
        VideoCapturer videoCapturer = this.f45836g;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.f45836g = null;
        }
    }

    public abstract String d();

    public int e() {
        return this.f45835f;
    }

    public int f() {
        return this.f45834e;
    }

    public WritableMap g() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceId", d());
        writableMapCreateMap.putString("groupId", "");
        writableMapCreateMap.putInt(Snapshot.HEIGHT, f());
        writableMapCreateMap.putInt(Snapshot.WIDTH, h());
        writableMapCreateMap.putInt("frameRate", e());
        return writableMapCreateMap;
    }

    public int h() {
        return this.f45833d;
    }

    public void i() {
        this.f45836g = b();
    }

    public void j(InterfaceC0713a interfaceC0713a) {
        this.f45837h = interfaceC0713a;
    }

    public void k() {
        try {
            this.f45836g.startCapture(this.f45830a, this.f45831b, this.f45832c);
        } catch (RuntimeException unused) {
        }
    }

    public boolean l() {
        try {
            this.f45836g.stopCapture();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
