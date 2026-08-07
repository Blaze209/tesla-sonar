package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC4219j3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f38443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f38445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f38446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f38447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MediaCodec f38448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X5 f38449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaCodec.BufferInfo f38450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a f38451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f38452k;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.j3$a */
    public interface a {
        void onReleased();

        void onStopped(AbstractRunnableC4219j3 abstractRunnableC4219j3);
    }

    AbstractRunnableC4219j3(File file, a aVar) {
        Object obj = new Object();
        this.f38442a = obj;
        this.f38452k = 0L;
        this.f38449h = new Y5(file);
        this.f38451j = aVar;
        synchronized (obj) {
            this.f38450i = new MediaCodec.BufferInfo();
            new Thread(this, getClass().getSimpleName()).start();
            try {
                obj.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    private void a() {
        MediaCodec mediaCodec = this.f38448g;
        if (mediaCodec == null) {
            return;
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        if (this.f38449h == null) {
            return;
        }
        int i11 = 0;
        while (this.f38443b) {
            int iDequeueOutputBuffer = this.f38448g.dequeueOutputBuffer(this.f38450i, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!this.f38446e && (i11 = i11 + 1) > 5) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f38448g.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f38447f) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f38448g.getOutputFormat();
                this.f38447f = true;
                if (this.f38449h.setup(outputFormat)) {
                    continue;
                } else {
                    synchronized (this.f38449h) {
                        while (!this.f38449h.isOperational()) {
                            try {
                                this.f38449h.wait(10L);
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                    }
                }
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                MediaCodec.BufferInfo bufferInfo = this.f38450i;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f38447f) {
                        throw new RuntimeException("drain:muxer hasn't started");
                    }
                    bufferInfo.presentationTimeUs = b();
                    this.f38449h.write(byteBuffer, this.f38450i);
                    this.f38452k = this.f38450i.presentationTimeUs;
                    i11 = 0;
                }
                this.f38448g.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.f38450i.flags & 4) != 0) {
                    this.f38443b = false;
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private long b() {
        long jNanoTime = System.nanoTime() / 1000;
        long j11 = this.f38452k;
        return jNanoTime < j11 ? (j11 - jNanoTime) + jNanoTime : jNanoTime;
    }

    protected void encode(ByteBuffer byteBuffer, int i11, long j11) {
        if (this.f38443b) {
            ByteBuffer[] inputBuffers = this.f38448g.getInputBuffers();
            while (this.f38443b) {
                int iDequeueInputBuffer = this.f38448g.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
                    byteBuffer2.clear();
                    if (byteBuffer != null) {
                        byteBuffer2.put(byteBuffer);
                    }
                    if (i11 > 0) {
                        this.f38448g.queueInputBuffer(iDequeueInputBuffer, 0, i11, j11, 0);
                        return;
                    } else {
                        this.f38446e = true;
                        this.f38448g.queueInputBuffer(iDequeueInputBuffer, 0, 0, j11, 4);
                        return;
                    }
                }
            }
        }
    }

    public boolean frameAvailableSoon() {
        synchronized (this.f38442a) {
            try {
                if (this.f38443b && !this.f38445d) {
                    this.f38444c++;
                    this.f38442a.notifyAll();
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void release() {
        X5 x11;
        try {
            this.f38451j.onStopped(this);
        } catch (Exception unused) {
        }
        this.f38443b = false;
        MediaCodec mediaCodec = this.f38448g;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.f38448g.release();
                this.f38448g = null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (this.f38447f && (x11 = this.f38449h) != null) {
            try {
                x11.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        this.f38450i = null;
        this.f38451j.onReleased();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        boolean z11;
        boolean z12;
        synchronized (this.f38442a) {
            this.f38445d = false;
            this.f38444c = 0;
            this.f38442a.notify();
        }
        while (true) {
            synchronized (this.f38442a) {
                try {
                    z11 = this.f38445d;
                    int i11 = this.f38444c;
                    z12 = i11 > 0;
                    if (z12) {
                        this.f38444c = i11 - 1;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                break;
            }
            if (z12) {
                a();
            } else {
                synchronized (this.f38442a) {
                    try {
                        try {
                            this.f38442a.wait();
                        } catch (InterruptedException unused) {
                            synchronized (this.f38442a) {
                                this.f38445d = true;
                                this.f38443b = false;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (this.f38442a) {
                this.f38445d = true;
                this.f38443b = false;
            }
        }
        a();
        signalEndOfInputStream();
        a();
        release();
        synchronized (this.f38442a) {
            this.f38445d = true;
            this.f38443b = false;
        }
    }

    protected abstract void signalEndOfInputStream();

    public void startRecording() {
        synchronized (this.f38442a) {
            this.f38443b = true;
            this.f38445d = false;
            this.f38442a.notifyAll();
        }
    }

    public void stopRecording() {
        synchronized (this.f38442a) {
            try {
                if (this.f38443b && !this.f38445d) {
                    this.f38445d = true;
                    this.f38442a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
