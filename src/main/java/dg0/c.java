package dg0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import zf0.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0019\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u0012\u0010%¨\u0006&"}, d2 = {"Ldg0/c;", "", "Lzf0/t0;", "selfiePhoto", "Ldg0/b;", AnalyticsAttribute.Error, "", "facesInFrame", "", "isFaceTooClose", "isFaceTooFar", "isFaceCentered", "", "faceAngle", "Ldg0/a;", "brightnessInfo", "<init>", "(Lzf0/t0;Ldg0/b;IZZZFLdg0/a;)V", "a", "Lzf0/t0;", "e", "()Lzf0/t0;", "b", "Ldg0/b;", "()Ldg0/b;", "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Z", "g", "()Z", "h", "f", Gender.FEMALE, "()F", "Ldg0/a;", "()Ldg0/a;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0 selfiePhoto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b error;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int facesInFrame;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceTooClose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceTooFar;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isFaceCentered;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float faceAngle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a brightnessInfo;

    public c(t0 t0Var, b bVar, int i11, boolean z11, boolean z12, boolean z13, float f11, a aVar) {
        this.selfiePhoto = t0Var;
        this.error = bVar;
        this.facesInFrame = i11;
        this.isFaceTooClose = z11;
        this.isFaceTooFar = z12;
        this.isFaceCentered = z13;
        this.faceAngle = f11;
        this.brightnessInfo = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBrightnessInfo() {
        return this.brightnessInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFaceAngle() {
        return this.faceAngle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFacesInFrame() {
        return this.facesInFrame;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t0 getSelfiePhoto() {
        return this.selfiePhoto;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsFaceCentered() {
        return this.isFaceCentered;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsFaceTooClose() {
        return this.isFaceTooClose;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsFaceTooFar() {
        return this.isFaceTooFar;
    }
}
