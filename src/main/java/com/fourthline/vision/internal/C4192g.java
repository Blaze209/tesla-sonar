package com.fourthline.vision.internal;

import android.media.MediaRecorder;
import java.io.File;
import java.io.IOException;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4192g implements InterfaceC4184f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f38323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f38324b = jn0.m.b(new wn0.a() { // from class: com.fourthline.vision.internal.da
        @Override // wn0.a
        public final Object invoke() {
            return C4192g.recorder_delegate$lambda$1();
        }
    });

    private final MediaRecorder getRecorder() {
        return (MediaRecorder) this.f38324b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaRecorder recorder_delegate$lambda$1() {
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(5);
        mediaRecorder.setOutputFormat(1);
        mediaRecorder.setAudioEncoder(2);
        if (mediaRecorder.getClass().isAnonymousClass()) {
            String name = mediaRecorder.getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length <= 23) {
                return mediaRecorder;
            }
            p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            return mediaRecorder;
        }
        String simpleName = mediaRecorder.getClass().getSimpleName();
        int length2 = simpleName.length();
        p013kotlin.jvm.internal.s.h(simpleName);
        if (length2 <= 23) {
            return mediaRecorder;
        }
        p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
        return mediaRecorder;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4184f
    public void startRecording(File outputFile) {
        p013kotlin.jvm.internal.s.k(outputFile, "outputFile");
        this.f38323a = outputFile;
        MediaRecorder recorder = getRecorder();
        recorder.setOutputFile(outputFile.getAbsolutePath());
        try {
            recorder.prepare();
        } catch (IOException unused) {
            if (recorder.getClass().isAnonymousClass()) {
                String name = recorder.getClass().getName();
                int length = name.length();
                p013kotlin.jvm.internal.s.h(name);
                if (length > 23) {
                    p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = recorder.getClass().getSimpleName();
                int length2 = simpleName.length();
                p013kotlin.jvm.internal.s.h(simpleName);
                if (length2 > 23) {
                    p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                }
            }
        }
        recorder.start();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4184f
    public File stopRecording() throws AbstractC4255o4.a {
        File file = this.f38323a;
        if (file == null) {
            throw new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null);
        }
        MediaRecorder recorder = getRecorder();
        recorder.stop();
        recorder.release();
        return file;
    }
}
