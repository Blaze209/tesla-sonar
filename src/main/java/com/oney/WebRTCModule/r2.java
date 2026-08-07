package com.oney.WebRTCModule;

import java.util.concurrent.Callable;
import org.webrtc.AudioProcessingFactory;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.audio.AudioDeviceModule;

/* JADX INFO: loaded from: classes6.dex */
public class r2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static r2 f46070j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VideoEncoderFactory f46071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoDecoderFactory f46072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioDeviceModule f46073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Callable<AudioProcessingFactory> f46074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Loggable f46075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Logging.Severity f46076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f46077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f46079i = 1.0d;

    public static r2 a() {
        if (f46070j == null) {
            f46070j = new r2();
        }
        return f46070j;
    }
}
