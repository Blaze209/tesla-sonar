package com.fourthline.vision.internal;

import java.io.File;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4298v f37853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4306w0 f37854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4268q3 f37856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Channel f37857e;

    public static final class a implements AbstractRunnableC4219j3.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f37859b;

        a(File file) {
            this.f37859b = file;
        }

        @Override // com.fourthline.vision.internal.AbstractRunnableC4219j3.a
        public void onReleased() {
            N5.this.f37857e.mo85trySendJP2dKIU(this.f37859b);
        }

        @Override // com.fourthline.vision.internal.AbstractRunnableC4219j3.a
        public void onStopped(AbstractRunnableC4219j3 encoder) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            if ((encoder instanceof C4268q3 ? (C4268q3) encoder : null) != null) {
                N5.this.f37853a.resetVideoEncoder();
            }
        }
    }

    public N5(C4298v source, InterfaceC4306w0 mediaCodecDataSource) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        this.f37853a = source;
        this.f37854b = mediaCodecDataSource;
        this.f37857e = ChannelKt.Channel$default(0, null, null, 6, null);
    }

    private final a createListener(File file) {
        return new a(file);
    }

    public final boolean isRecording() {
        return this.f37855c;
    }

    public final void startRecording(File outputFile) {
        p013kotlin.jvm.internal.s.k(outputFile, "outputFile");
        if (this.f37856d != null) {
            throw new IllegalStateException();
        }
        C4268q3 c4268q3 = new C4268q3(outputFile, createListener(outputFile), this.f37854b);
        c4268q3.prepare();
        this.f37853a.setVideoEncoder(c4268q3);
        c4268q3.startRecording();
        this.f37856d = c4268q3;
        this.f37855c = true;
    }

    public final Object stopRecording(Continuation<? super File> continuation) {
        C4268q3 c4268q3 = this.f37856d;
        if (c4268q3 != null) {
            c4268q3.stopRecording();
        }
        this.f37856d = null;
        this.f37855c = false;
        return this.f37857e.receive(continuation);
    }
}
