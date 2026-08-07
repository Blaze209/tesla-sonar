package cn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pm.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcn/f;", "Lcn/d;", "", "maxBitmapSize", "", "useDownSamplingRatio", "primaryImageTranscoderFactory", "imageTranscoderType", "ensureTranscoderLibraryLoaded", "<init>", "(IZLcn/d;Ljava/lang/Integer;Z)V", "Lgm/c;", "imageFormat", "isResizingEnabled", "Lcn/c;", "a", "(Lgm/c;Z)Lcn/c;", "c", DateTokenConverter.CONVERTER_KEY, "b", "createImageTranscoder", "I", "Z", "Lcn/d;", "Ljava/lang/Integer;", "e", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxBitmapSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean useDownSamplingRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d primaryImageTranscoderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer imageTranscoderType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean ensureTranscoderLibraryLoaded;

    public f(int i11, boolean z11, d dVar, Integer num, boolean z12) {
        this.maxBitmapSize = i11;
        this.useDownSamplingRatio = z11;
        this.primaryImageTranscoderFactory = dVar;
        this.imageTranscoderType = num;
        this.ensureTranscoderLibraryLoaded = z12;
    }

    private final c a(gm.c imageFormat, boolean isResizingEnabled) {
        d dVar = this.primaryImageTranscoderFactory;
        if (dVar != null) {
            return dVar.createImageTranscoder(imageFormat, isResizingEnabled);
        }
        return null;
    }

    private final c b(gm.c imageFormat, boolean isResizingEnabled) {
        Integer num = this.imageTranscoderType;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(imageFormat, isResizingEnabled);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(imageFormat, isResizingEnabled);
    }

    private final c c(gm.c imageFormat, boolean isResizingEnabled) {
        return com.facebook.imagepipeline.nativecode.c.a(this.maxBitmapSize, this.useDownSamplingRatio, this.ensureTranscoderLibraryLoaded).createImageTranscoder(imageFormat, isResizingEnabled);
    }

    private final c d(gm.c imageFormat, boolean isResizingEnabled) {
        c cVarCreateImageTranscoder = new h(this.maxBitmapSize).createImageTranscoder(imageFormat, isResizingEnabled);
        s.j(cVarCreateImageTranscoder, "createImageTranscoder(...)");
        return cVarCreateImageTranscoder;
    }

    @Override // cn.d
    public c createImageTranscoder(gm.c imageFormat, boolean isResizingEnabled) {
        s.k(imageFormat, "imageFormat");
        c cVarA = a(imageFormat, isResizingEnabled);
        if (cVarA == null) {
            cVarA = b(imageFormat, isResizingEnabled);
        }
        if (cVarA == null && z.a()) {
            cVarA = c(imageFormat, isResizingEnabled);
        }
        return cVarA == null ? d(imageFormat, isResizingEnabled) : cVarA;
    }
}
