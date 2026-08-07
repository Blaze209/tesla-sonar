package com.fourthline.vision.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class I0 implements zx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f37789a = new a();

    public static final class a extends Task {
        a() {
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnFailureListener(OnFailureListener listener) {
            p013kotlin.jvm.internal.s.k(listener, "listener");
            return this;
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnSuccessListener(OnSuccessListener<? super List<? extends zx.a>> listener) {
            p013kotlin.jvm.internal.s.k(listener, "listener");
            return this;
        }

        @Override // com.google.android.gms.tasks.Task
        public Exception getException() {
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isCanceled() {
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isComplete() {
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public boolean isSuccessful() {
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnFailureListener(Activity p11, OnFailureListener p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnSuccessListener(Activity p11, OnSuccessListener<? super List<? extends zx.a>> p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnFailureListener(Executor p11, OnFailureListener p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public Task<List<zx.a>> addOnSuccessListener(Executor p11, OnSuccessListener<? super List<? extends zx.a>> p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public List<zx.a> getResult() {
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }

        @Override // com.google.android.gms.tasks.Task
        public <X extends Throwable> List<zx.a> getResult(Class<X> p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            throw new jn0.q("An operation is not implemented: Not yet implemented");
        }
    }

    @Override // zx.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // cy.a
    public int getDetectorType() {
        throw new jn0.q("An operation is not implemented: Not yet implemented");
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public Feature[] getOptionalFeatures() {
        throw new jn0.q("An operation is not implemented: Not yet implemented");
    }

    public Task<List<zx.a>> process(yt.a p11) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        return this.f37789a;
    }

    @Override // zx.d
    public Task<List<zx.a>> process(wx.a inputImage) {
        p013kotlin.jvm.internal.s.k(inputImage, "inputImage");
        return this.f37789a;
    }

    public Task<List<zx.a>> process(Bitmap p11, int i11) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        return this.f37789a;
    }

    public Task<List<zx.a>> process(Image p11, int i11) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        return this.f37789a;
    }

    @Override // cy.a
    public Task<List<zx.a>> process(Image p11, int i11, Matrix p12) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        p013kotlin.jvm.internal.s.k(p12, "p2");
        return this.f37789a;
    }

    public Task<List<zx.a>> process(ByteBuffer p11, int i11, int i12, int i13, int i14) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        return this.f37789a;
    }
}
