package com.facebook.imagepipeline.decoder;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Lum/k;", "encodedImage", "<init>", "(Ljava/lang/String;Lum/k;)V", "a", "Lum/k;", "()Lum/k;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecodeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k encodedImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(String str, k encodedImage) {
        super(str);
        s.k(encodedImage, "encodedImage");
        this.encodedImage = encodedImage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getEncodedImage() {
        return this.encodedImage;
    }
}
