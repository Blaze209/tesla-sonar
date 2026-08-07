package com.canhub.cropper;

import android.net.Uri;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.canhub.cropper.l, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@jn0.e
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/canhub/cropper/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "uri", "Lcom/canhub/cropper/o;", "Lcom/canhub/cropper/o;", "()Lcom/canhub/cropper/o;", "cropImageOptions", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CropImageContractOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CropImageOptions cropImageOptions;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CropImageOptions getCropImageOptions() {
        return this.cropImageOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropImageContractOptions)) {
            return false;
        }
        CropImageContractOptions cropImageContractOptions = (CropImageContractOptions) other;
        return p013kotlin.jvm.internal.s.f(this.uri, cropImageContractOptions.uri) && p013kotlin.jvm.internal.s.f(this.cropImageOptions, cropImageContractOptions.cropImageOptions);
    }

    public int hashCode() {
        Uri uri = this.uri;
        return ((uri == null ? 0 : uri.hashCode()) * 31) + this.cropImageOptions.hashCode();
    }

    public String toString() {
        return "CropImageContractOptions(uri=" + this.uri + ", cropImageOptions=" + this.cropImageOptions + ")";
    }
}
