package bg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lbg0/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Leg0/a;", "cameraStatsManager", "Lfi0/c;", "sdkFilesManager", "Lbg0/j;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lbg0/a;", "analyzer", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Leg0/a;Lfi0/c;Lbg0/j;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lbg0/a;Lfg0/a;Lej0/a;Z)V", "b", "()Z", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "a", "()Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "Landroid/content/Context;", "Leg0/a;", "c", "Lfi0/c;", DateTokenConverter.CONVERTER_KEY, "Lbg0/j;", "e", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "f", "Lbg0/a;", "g", "Lfg0/a;", "h", "Lej0/a;", IntegerTokenConverter.CONVERTER_KEY, "Z", "", "j", "I", "choiceIndex", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CameraChoices cameraChoices;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bg0.a analyzer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final fg0.a videoCaptureMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ej0.a webRtcManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isAudioRequired;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int choiceIndex;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbg0/e$a;", "", "Lbg0/j;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lbg0/a;", "analyzer", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "", "isAudioRequired", "Lbg0/e;", "a", "(Lbg0/j;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lbg0/a;Lfg0/a;Lej0/a;Z)Lbg0/e;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        e a(CameraChoices cameraChoices, Camera2PreviewView previewView, bg0.a analyzer, fg0.a videoCaptureMethod, ej0.a webRtcManager, boolean isAudioRequired);
    }

    public e(Context context, eg0.a cameraStatsManager, fi0.c sdkFilesManager, CameraChoices cameraChoices, Camera2PreviewView previewView, bg0.a analyzer, fg0.a videoCaptureMethod, ej0.a aVar, boolean z11) {
        s.k(context, "context");
        s.k(cameraStatsManager, "cameraStatsManager");
        s.k(sdkFilesManager, "sdkFilesManager");
        s.k(cameraChoices, "cameraChoices");
        s.k(previewView, "previewView");
        s.k(analyzer, "analyzer");
        s.k(videoCaptureMethod, "videoCaptureMethod");
        this.context = context;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraChoices = cameraChoices;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = aVar;
        this.isAudioRequired = z11;
    }

    public final Camera2Manager a() {
        return new Camera2Manager(this.context, this.cameraChoices.a().get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.webRtcManager, this.isAudioRequired, this.cameraStatsManager, this.sdkFilesManager);
    }

    public final boolean b() {
        if (this.choiceIndex + 1 >= this.cameraChoices.a().size()) {
            return false;
        }
        this.choiceIndex++;
        return true;
    }
}
