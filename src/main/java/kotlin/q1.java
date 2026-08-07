package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import o4.f0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb2/q1;", "Lo4/f0;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Lo4/f0;II)V", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "a", "Lo4/f0;", "b", "I", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q1 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f0 delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int transformedLength;

    public q1(f0 f0Var, int i11, int i12) {
        this.delegate = f0Var;
        this.originalLength = i11;
        this.transformedLength = i12;
    }

    @Override // o4.f0
    public int originalToTransformed(int offset) {
        int iOriginalToTransformed = this.delegate.originalToTransformed(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            r1.g(iOriginalToTransformed, this.transformedLength, offset);
        }
        return iOriginalToTransformed;
    }

    @Override // o4.f0
    public int transformedToOriginal(int offset) {
        int iTransformedToOriginal = this.delegate.transformedToOriginal(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            r1.h(iTransformedToOriginal, this.originalLength, offset);
        }
        return iTransformedToOriginal;
    }
}
