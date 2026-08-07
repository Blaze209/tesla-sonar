package t4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt4/o;", "start", "stop", "", "fraction", "a", "(Lt4/o;Lt4/o;F)Lt4/o;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p {
    public static final TextGeometricTransform a(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f11) {
        return new TextGeometricTransform(y4.b.b(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f11), y4.b.b(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f11));
    }
}
