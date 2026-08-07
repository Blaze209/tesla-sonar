package pg0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import e30.AlertContainerScreen;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import y20.Snapshot;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0002QSBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010$\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%J;\u0010(\u001a\u00020'2\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020'2\u001c\u0010,\u001a\u00180*R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040+H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020/*\u00020\u00052\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504*\u00020\u00052\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\u000207*\u00020\u0003H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u0004\u0018\u000102*\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010;J-\u0010A\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bC\u0010BJ-\u0010D\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\bD\u0010BJ\u001b\u0010E\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u000202*\u00020<2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bG\u0010FJ!\u0010K\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJC\u0010M\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010#\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bM\u0010%J\u0017\u0010O\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0003H\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006m"}, d2 = {"Lpg0/g3;", "Ly20/k;", "Lpg0/g3$a;", "Lpg0/n1;", "Lpg0/g3$b;", "", "Landroid/content/Context;", "applicationContext", "Lec/r;", "imageLoader", "Lwg0/f$a;", "submitVerificationWorkerFactory", "Lpg0/a0;", "documentSelectWorker", "Lxg0/j;", "localVideoCaptureRenderer", "Lxg0/u;", "webRtcRenderer", "Lrg0/m0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lqg0/o;", "autoClassificationRenderer", "Leg0/a;", "cameraStatsManager", "Lii0/b;", "navigationStateManager", "Lei0/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lec/r;Lwg0/f$a;Lpg0/a0;Lxg0/j;Lxg0/u;Lrg0/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lqg0/o;Leg0/a;Lii0/b;Lei0/c;)V", "renderProps", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "h0", "(Lpg0/g3$a;Lpg0/n1;Ly20/k$a;)Ljava/lang/Object;", "output", "Ljn0/h0;", "Y0", "(Ly20/k$a;Lpg0/g3$b;)V", "Ly20/r$c;", "Ly20/r;", "updater", "Z0", "(Ly20/r$c;)V", "Lki0/k;", "c1", "(Ljava/lang/Object;Lpg0/n1;)Lki0/k;", "", "name", "La30/n;", "f0", "(Ljava/lang/Object;Ljava/lang/String;)La30/n;", "", "b1", "(Lpg0/n1;)Z", "d0", "(Lpg0/n1;)Ljava/lang/String;", "Lpg0/g3$a$a;", "Lpg0/d4$e;", "side", "selectedId", "countryCode", "Z", "(Lpg0/g3$a$a;Lpg0/d4$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Y", "a0", "c0", "(Lpg0/g3$a$a;Lpg0/d4$e;)Ljava/lang/String;", "b0", "props", "Ly20/i;", "snapshot", "e0", "(Lpg0/g3$a;Ly20/i;)Lpg0/n1;", "g0", "state", "a1", "(Lpg0/n1;)Ly20/i;", "a", "Landroid/content/Context;", "b", "Lec/r;", "c", "Lwg0/f$a;", DateTokenConverter.CONVERTER_KEY, "Lpg0/a0;", "e", "Lxg0/j;", "f", "Lxg0/u;", "g", "Lrg0/m0;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", IntegerTokenConverter.CONVERTER_KEY, "Lqg0/o;", "j", "Leg0/a;", "k", "Lii0/b;", "l", "Lei0/c;", "Lxg0/k;", "m", "Lxg0/k;", "videoCaptureHelper", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g3 extends y20.k<a, n1, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wg0.f.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a0 documentSelectWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xg0.j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xg0.u webRtcRenderer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final rg0.m0 captureRenderer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final qg0.o autoClassificationRenderer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ei0.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xg0.k videoCaptureHelper;

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\u0018\u00002\u00020\u0001:\u0001+BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b7\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b5\u0010;R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b8\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\b<\u0010.R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b=\u0010.R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bH\u0010JR\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bL\u0010T\u001a\u0004\b+\u0010UR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bV\u0010;R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b?\u0010W\u001a\u0004\b/\u0010XR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bR\u0010Y\u001a\u0004\bM\u0010ZR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bV\u0010[\u001a\u0004\bK\u0010\\R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0011\u0010a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010;¨\u0006b"}, d2 = {"Lpg0/g3$a;", "", "", "sessionToken", "countryCode", "", "Lpg0/d4;", "enabledIdClasses", "inquiryId", "fromStep", "fromComponent", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lpg0/g3$a$a;", "strings", "", "imageCaptureCount", "fieldKeyDocument", "fieldKeyIdClass", "", "manualCaptureButtonDelayMs", "shouldSkipReviewScreen", "theme", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "isEnabled", "Lqg0/a;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lug0/a;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lpg0/g3$a$a;ILjava/lang/String;Ljava/lang/String;JZLjava/lang/Integer;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;ZLqg0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lug0/a;)V", "a", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "b", "e", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "n", "k", "f", "j", "Z", "()Z", "h", IntegerTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lpg0/g3$a$a;", "t", "()Lpg0/g3$a$a;", "l", "I", "m", "()I", "o", "J", "()J", "p", "s", "q", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "v", "()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "w", "Lqg0/a;", "()Lqg0/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "x", "Lug0/a;", "getDigitalIdConfig", "()Lug0/a;", "hasMultipleCaptureOptions", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sessionToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String countryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<IdConfig> enabledIdClasses;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String inquiryId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String fromStep;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String fromComponent;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final C2175a strings;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final int imageCaptureCount;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final String fieldKeyDocument;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String fieldKeyIdClass;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final long manualCaptureButtonDelayMs;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final boolean shouldSkipReviewScreen;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final Integer theme;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final NextStep.GovernmentId.AssetConfig assetConfig;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean isEnabled;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final qg0.a autoClassificationConfig;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final ug0.a digitalIdConfig;

        /* JADX INFO: renamed from: pg0.g3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bD\u0018\u00002\u00020\u0001B³\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010ER\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010OR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010ER\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bR\u0010ER\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bP\u0010ER\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bZ\u0010OR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\b[\u0010ER\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\b\\\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b`\u0010M\u001a\u0004\ba\u0010OR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bb\u0010M\u001a\u0004\b`\u0010OR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bb\u0010ER\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bc\u0010ER#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\bU\u0010]\u001a\u0004\bd\u0010_R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\bZ\u0010]\u001a\u0004\be\u0010_R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010ER\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bi\u0010ER\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bY\u0010ER\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bX\u0010ER\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bT\u0010ER\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bV\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bo\u0010ER\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bq\u0010ER\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bs\u0010ER\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bu\u0010ER\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010C\u001a\u0004\bj\u0010ER\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\bk\u0010ER\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bh\u0010ER\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010C\u001a\u0004\bL\u0010ER\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\by\u0010C\u001a\u0004\bJ\u0010ER\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bz\u0010C\u001a\u0004\bH\u0010ER\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bF\u0010ER\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b{\u0010C\u001a\u0004\bz\u0010ER\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010C\u001a\u0004\by\u0010ER\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b}\u0010C\u001a\u0004\bx\u0010ER\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bw\u0010ER\u0019\u00100\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bu\u0010C\u001a\u0004\bp\u0010ER\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\bn\u0010ER\u0019\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bm\u0010ER\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\bl\u0010ER\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\b~\u0010ER\u0019\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\b\u007f\u0010ER\u0019\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010C\u001a\u0004\bv\u0010ER\u0019\u00107\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bt\u0010ER\u0019\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bf\u0010ER\u0019\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\br\u0010ER\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\b}\u0010ER\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\b|\u0010ER\u0019\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u007f\u0010C\u001a\u0004\bB\u0010ER!\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0006¢\u0006\u000e\n\u0005\b~\u0010\u0080\u0001\u001a\u0005\b{\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lpg0/g3$a$a;", "", "", "title", "prompt", "choose", "instructionsDisclaimer", "Lpg0/k4;", "captureScreenTitle", "scanInstructions", "capturing", "confirmCapture", "captureDisclaimer", "buttonSubmit", "buttonRetake", "confirmCaptureTitle", "processingTitle", "processingDescription", "", "idClassToName", "chooseCaptureMethodTitle", "chooseCaptureMethodBody", "chooseCaptureMethodCameraButton", "chooseCaptureMethodUploadButton", "Lpg0/d4$e;", "reviewSelectedImageTitle", "reviewSelectedImageBody", "reviewSelectedImageConfirmButton", "reviewSelectedImageChooseAnotherButton", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsTitle", "microphonePermissionsPrompt", "microphonePermissionsAllowButtonText", "microphonePermissionsCancelButtonText", "hintHoldStill", "hintLowLight", "helpButtonText", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueButtonText", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHints", "idFrontHelpModalContinueButtonText", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHints", "idBackHelpModalContinueButtonText", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg0/k4;Lpg0/k4;Ljava/lang/String;Lpg0/k4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg0/k4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lpg0/k4;Lpg0/k4;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b0", "()Ljava/lang/String;", "b", "V", "c", "o", DateTokenConverter.CONVERTER_KEY, "L", "e", "Lpg0/k4;", "m", "()Lpg0/k4;", "f", "a0", "g", "n", "h", "t", IntegerTokenConverter.CONVERTER_KEY, "l", "j", "k", "u", Gender.UNKNOWN, "T", "Ljava/util/Map;", "G", "()Ljava/util/Map;", "p", "r", "q", "s", "Z", "W", "v", "Y", "w", "X", "x", "y", "z", "A", "B", "S", "C", "R", "D", "P", "E", "Q", Gender.FEMALE, "H", "I", "J", "K", Gender.MALE, Gender.NONE, Gender.OTHER, "d0", "c0", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2175a {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final String cameraPermissionsCancelButtonText;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final String microphonePermissionsTitle;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final String microphonePermissionsPrompt;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final String microphonePermissionsAllowButtonText;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final String microphonePermissionsCancelButtonText;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            private final String hintHoldStill;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            private final String hintLowLight;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            private final String helpButtonText;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            private final String barcodeHelpModalTitle;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            private final String barcodeHelpModalPrompt;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            private final String barcodeHelpModalHints;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            private final String barcodeHelpModalContinueButtonText;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            private final String idFrontHelpModalTitle;

            /* JADX INFO: renamed from: N, reason: from kotlin metadata */
            private final String idFrontHelpModalPrompt;

            /* JADX INFO: renamed from: O, reason: from kotlin metadata */
            private final String idFrontHelpModalHints;

            /* JADX INFO: renamed from: P, reason: from kotlin metadata */
            private final String idFrontHelpModalContinueButtonText;

            /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
            private final String idBackHelpModalTitle;

            /* JADX INFO: renamed from: R, reason: from kotlin metadata */
            private final String idBackHelpModalPrompt;

            /* JADX INFO: renamed from: S, reason: from kotlin metadata */
            private final String idBackHelpModalHints;

            /* JADX INFO: renamed from: T, reason: from kotlin metadata */
            private final String idBackHelpModalContinueButtonText;

            /* JADX INFO: renamed from: U, reason: from kotlin metadata */
            private final String unableToClassifyDocumentTitle;

            /* JADX INFO: renamed from: V, reason: from kotlin metadata */
            private final String unableToClassifyDocumentContinueButtonText;

            /* JADX INFO: renamed from: W, reason: from kotlin metadata */
            private final String idClassRejectedTitle;

            /* JADX INFO: renamed from: X, reason: from kotlin metadata */
            private final String idClassRejectedContinueButtonText;

            /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
            private final String countryInputTitle;

            /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
            private final String idClassInputTitle;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
            private final String manualClassificationTitle;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String prompt;

            /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
            private final String manualClassificationContinueButtonText;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String choose;

            /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
            private final String autoClassificationCaptureTipText;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String instructionsDisclaimer;

            /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
            private final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final OverridableText captureScreenTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final OverridableText scanInstructions;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final String capturing;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final OverridableText confirmCapture;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final String captureDisclaimer;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final String buttonSubmit;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            private final String buttonRetake;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            private final OverridableText confirmCaptureTitle;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            private final String processingTitle;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final String processingDescription;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            private final Map<String, String> idClassToName;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            private final OverridableText chooseCaptureMethodTitle;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            private final OverridableText chooseCaptureMethodBody;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            private final String chooseCaptureMethodCameraButton;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            private final String chooseCaptureMethodUploadButton;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private final Map<IdConfig.e, String> reviewSelectedImageTitle;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
            private final Map<IdConfig.e, String> reviewSelectedImageBody;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            private final String reviewSelectedImageConfirmButton;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            private final String reviewSelectedImageChooseAnotherButton;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            private final String cameraPermissionsTitle;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
            private final String cameraPermissionsPrompt;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
            private final String cameraPermissionsAllowButtonText;

            public C2175a(String title, String prompt, String choose, String instructionsDisclaimer, OverridableText captureScreenTitle, OverridableText scanInstructions, String capturing, OverridableText confirmCapture, String captureDisclaimer, String buttonSubmit, String buttonRetake, OverridableText confirmCaptureTitle, String processingTitle, String processingDescription, Map<String, String> idClassToName, OverridableText chooseCaptureMethodTitle, OverridableText chooseCaptureMethodBody, String chooseCaptureMethodCameraButton, String chooseCaptureMethodUploadButton, Map<IdConfig.e, String> reviewSelectedImageTitle, Map<IdConfig.e, String> reviewSelectedImageBody, String reviewSelectedImageConfirmButton, String reviewSelectedImageChooseAnotherButton, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List<NextStep.GovernmentId.LocalizationOverride> list) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(prompt, "prompt");
                p013kotlin.jvm.internal.s.k(choose, "choose");
                p013kotlin.jvm.internal.s.k(instructionsDisclaimer, "instructionsDisclaimer");
                p013kotlin.jvm.internal.s.k(captureScreenTitle, "captureScreenTitle");
                p013kotlin.jvm.internal.s.k(scanInstructions, "scanInstructions");
                p013kotlin.jvm.internal.s.k(capturing, "capturing");
                p013kotlin.jvm.internal.s.k(confirmCapture, "confirmCapture");
                p013kotlin.jvm.internal.s.k(captureDisclaimer, "captureDisclaimer");
                p013kotlin.jvm.internal.s.k(buttonSubmit, "buttonSubmit");
                p013kotlin.jvm.internal.s.k(buttonRetake, "buttonRetake");
                p013kotlin.jvm.internal.s.k(confirmCaptureTitle, "confirmCaptureTitle");
                p013kotlin.jvm.internal.s.k(processingTitle, "processingTitle");
                p013kotlin.jvm.internal.s.k(processingDescription, "processingDescription");
                p013kotlin.jvm.internal.s.k(idClassToName, "idClassToName");
                p013kotlin.jvm.internal.s.k(chooseCaptureMethodTitle, "chooseCaptureMethodTitle");
                p013kotlin.jvm.internal.s.k(chooseCaptureMethodBody, "chooseCaptureMethodBody");
                p013kotlin.jvm.internal.s.k(chooseCaptureMethodCameraButton, "chooseCaptureMethodCameraButton");
                p013kotlin.jvm.internal.s.k(chooseCaptureMethodUploadButton, "chooseCaptureMethodUploadButton");
                p013kotlin.jvm.internal.s.k(reviewSelectedImageTitle, "reviewSelectedImageTitle");
                p013kotlin.jvm.internal.s.k(reviewSelectedImageBody, "reviewSelectedImageBody");
                p013kotlin.jvm.internal.s.k(reviewSelectedImageConfirmButton, "reviewSelectedImageConfirmButton");
                p013kotlin.jvm.internal.s.k(reviewSelectedImageChooseAnotherButton, "reviewSelectedImageChooseAnotherButton");
                this.title = title;
                this.prompt = prompt;
                this.choose = choose;
                this.instructionsDisclaimer = instructionsDisclaimer;
                this.captureScreenTitle = captureScreenTitle;
                this.scanInstructions = scanInstructions;
                this.capturing = capturing;
                this.confirmCapture = confirmCapture;
                this.captureDisclaimer = captureDisclaimer;
                this.buttonSubmit = buttonSubmit;
                this.buttonRetake = buttonRetake;
                this.confirmCaptureTitle = confirmCaptureTitle;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.idClassToName = idClassToName;
                this.chooseCaptureMethodTitle = chooseCaptureMethodTitle;
                this.chooseCaptureMethodBody = chooseCaptureMethodBody;
                this.chooseCaptureMethodCameraButton = chooseCaptureMethodCameraButton;
                this.chooseCaptureMethodUploadButton = chooseCaptureMethodUploadButton;
                this.reviewSelectedImageTitle = reviewSelectedImageTitle;
                this.reviewSelectedImageBody = reviewSelectedImageBody;
                this.reviewSelectedImageConfirmButton = reviewSelectedImageConfirmButton;
                this.reviewSelectedImageChooseAnotherButton = reviewSelectedImageChooseAnotherButton;
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsTitle = str5;
                this.microphonePermissionsPrompt = str6;
                this.microphonePermissionsAllowButtonText = str7;
                this.microphonePermissionsCancelButtonText = str8;
                this.hintHoldStill = str9;
                this.hintLowLight = str10;
                this.helpButtonText = str11;
                this.barcodeHelpModalTitle = str12;
                this.barcodeHelpModalPrompt = str13;
                this.barcodeHelpModalHints = str14;
                this.barcodeHelpModalContinueButtonText = str15;
                this.idFrontHelpModalTitle = str16;
                this.idFrontHelpModalPrompt = str17;
                this.idFrontHelpModalHints = str18;
                this.idFrontHelpModalContinueButtonText = str19;
                this.idBackHelpModalTitle = str20;
                this.idBackHelpModalPrompt = str21;
                this.idBackHelpModalHints = str22;
                this.idBackHelpModalContinueButtonText = str23;
                this.unableToClassifyDocumentTitle = str24;
                this.unableToClassifyDocumentContinueButtonText = str25;
                this.idClassRejectedTitle = str26;
                this.idClassRejectedContinueButtonText = str27;
                this.countryInputTitle = str28;
                this.idClassInputTitle = str29;
                this.manualClassificationTitle = str30;
                this.manualClassificationContinueButtonText = str31;
                this.autoClassificationCaptureTipText = str32;
                this.localizationOverrides = list;
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final String getIdBackHelpModalHints() {
                return this.idBackHelpModalHints;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            /* JADX INFO: renamed from: C, reason: from getter */
            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            /* JADX INFO: renamed from: F, reason: from getter */
            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            public final Map<String, String> G() {
                return this.idClassToName;
            }

            /* JADX INFO: renamed from: H, reason: from getter */
            public final String getIdFrontHelpModalContinueButtonText() {
                return this.idFrontHelpModalContinueButtonText;
            }

            /* JADX INFO: renamed from: I, reason: from getter */
            public final String getIdFrontHelpModalHints() {
                return this.idFrontHelpModalHints;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            /* JADX INFO: renamed from: K, reason: from getter */
            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            /* JADX INFO: renamed from: L, reason: from getter */
            public final String getInstructionsDisclaimer() {
                return this.instructionsDisclaimer;
            }

            public final List<NextStep.GovernmentId.LocalizationOverride> M() {
                return this.localizationOverrides;
            }

            /* JADX INFO: renamed from: N, reason: from getter */
            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            /* JADX INFO: renamed from: O, reason: from getter */
            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            /* JADX INFO: renamed from: P, reason: from getter */
            public final String getMicrophonePermissionsAllowButtonText() {
                return this.microphonePermissionsAllowButtonText;
            }

            /* JADX INFO: renamed from: Q, reason: from getter */
            public final String getMicrophonePermissionsCancelButtonText() {
                return this.microphonePermissionsCancelButtonText;
            }

            /* JADX INFO: renamed from: R, reason: from getter */
            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            /* JADX INFO: renamed from: S, reason: from getter */
            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            /* JADX INFO: renamed from: T, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            /* JADX INFO: renamed from: U, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            /* JADX INFO: renamed from: V, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            public final Map<IdConfig.e, String> W() {
                return this.reviewSelectedImageBody;
            }

            /* JADX INFO: renamed from: X, reason: from getter */
            public final String getReviewSelectedImageChooseAnotherButton() {
                return this.reviewSelectedImageChooseAnotherButton;
            }

            /* JADX INFO: renamed from: Y, reason: from getter */
            public final String getReviewSelectedImageConfirmButton() {
                return this.reviewSelectedImageConfirmButton;
            }

            public final Map<IdConfig.e, String> Z() {
                return this.reviewSelectedImageTitle;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            /* JADX INFO: renamed from: a0, reason: from getter */
            public final OverridableText getScanInstructions() {
                return this.scanInstructions;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getBarcodeHelpModalContinueButtonText() {
                return this.barcodeHelpModalContinueButtonText;
            }

            /* JADX INFO: renamed from: b0, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            /* JADX INFO: renamed from: c0, reason: from getter */
            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            /* JADX INFO: renamed from: d0, reason: from getter */
            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getCaptureDisclaimer() {
                return this.captureDisclaimer;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final OverridableText getCaptureScreenTitle() {
                return this.captureScreenTitle;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getCapturing() {
                return this.capturing;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getChoose() {
                return this.choose;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final OverridableText getChooseCaptureMethodBody() {
                return this.chooseCaptureMethodBody;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getChooseCaptureMethodCameraButton() {
                return this.chooseCaptureMethodCameraButton;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final OverridableText getChooseCaptureMethodTitle() {
                return this.chooseCaptureMethodTitle;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getChooseCaptureMethodUploadButton() {
                return this.chooseCaptureMethodUploadButton;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final OverridableText getConfirmCapture() {
                return this.confirmCapture;
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final OverridableText getConfirmCaptureTitle() {
                return this.confirmCaptureTitle;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getHelpButtonText() {
                return this.helpButtonText;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final String getIdBackHelpModalContinueButtonText() {
                return this.idBackHelpModalContinueButtonText;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String sessionToken, String str, List<IdConfig> enabledIdClasses, String inquiryId, String fromStep, String fromComponent, boolean z11, boolean z12, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, C2175a strings, int i11, String fieldKeyDocument, String fieldKeyIdClass, long j11, boolean z13, Integer num, VideoCaptureConfig videoCaptureConfig, NextStep.GovernmentId.AssetConfig assetConfig, boolean z14, qg0.a autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, ug0.a aVar) {
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(enabledIdClasses, "enabledIdClasses");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            p013kotlin.jvm.internal.s.k(strings, "strings");
            p013kotlin.jvm.internal.s.k(fieldKeyDocument, "fieldKeyDocument");
            p013kotlin.jvm.internal.s.k(fieldKeyIdClass, "fieldKeyIdClass");
            p013kotlin.jvm.internal.s.k(videoCaptureConfig, "videoCaptureConfig");
            p013kotlin.jvm.internal.s.k(assetConfig, "assetConfig");
            p013kotlin.jvm.internal.s.k(autoClassificationConfig, "autoClassificationConfig");
            p013kotlin.jvm.internal.s.k(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.styles = governmentIdStepStyle;
            this.strings = strings;
            this.imageCaptureCount = i11;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.manualCaptureButtonDelayMs = j11;
            this.shouldSkipReviewScreen = z13;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z14;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.digitalIdConfig = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final qg0.a getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final List<CaptureOptionNativeMobile> f() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        public final List<IdConfig> g() {
            return this.enabledIdClasses;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        public final boolean l() {
            return this.enabledCaptureOptionsNativeMobile.size() > 1;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final C2175a getStrings() {
            return this.strings;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpg0/g3$b;", "", "<init>", "()V", "b", DateTokenConverter.CONVERTER_KEY, "a", "c", "Lpg0/g3$b$a;", "Lpg0/g3$b$b;", "Lpg0/g3$b$c;", "Lpg0/g3$b$d;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg0/g3$b$a;", "Lpg0/g3$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f102420a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1411335115;
            }

            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: pg0.g3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg0/g3$b$b;", "Lpg0/g3$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C2176b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2176b f102421a = new C2176b();

            private C2176b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2176b);
            }

            public int hashCode() {
                return 1649914237;
            }

            public String toString() {
                return "Canceled";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lpg0/g3$b$c;", "Lpg0/g3$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InternalErrorInfo cause) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg0/g3$b$d;", "Lpg0/g3$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f102423a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1099427158;
            }

            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102424a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.e.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.e.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f102424a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$2", f = "GovernmentIdWorkflow.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102425n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return g3.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f102425n;
            if (i11 == 0) {
                jn0.t.b(obj);
                zf0.l lVar = zf0.l.f128227a;
                Context context = g3.this.applicationContext;
                this.f102425n = 1;
                if (lVar.b(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            g3.this.videoCaptureHelper.a();
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3", f = "GovernmentIdWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102427n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<a, n1, b, Object>.a f102428o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ g3 f102429p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(y20.k<? super a, n1, ? extends b, ? extends Object>.a aVar, g3 g3Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f102428o = aVar;
            this.f102429p = g3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(g3 g3Var, y20.r.c cVar) {
            g3Var.Z0(cVar);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new e(this.f102428o, this.f102429p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f102427n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super a, n1, ? extends b>> hVarC = this.f102428o.c();
            final g3 g3Var = this.f102429p;
            hVarC.b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.h3
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return g3.e.b(g3Var, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1", f = "GovernmentIdWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102430n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ a f102431o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n1 f102432p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ g3 f102433q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y20.k<a, n1, b, Object>.a f102434r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(a aVar, n1 n1Var, g3 g3Var, y20.k<? super a, n1, ? extends b, ? extends Object>.a aVar2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f102431o = aVar;
            this.f102432p = n1Var;
            this.f102433q = g3Var;
            this.f102434r = aVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f102431o, this.f102432p, this.f102433q, this.f102434r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f102430n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (this.f102431o.g().size() == 1) {
                n1 n1Var = this.f102432p;
                g3 g3Var = this.f102433q;
                y20.k<a, n1, b, Object>.a aVar = this.f102434r;
                a aVar2 = this.f102431o;
                g3.W0(n1Var, g3Var, aVar, aVar2, (IdConfig) p013kotlin.collections.v.o0(aVar2.g()), false);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class g extends p013kotlin.jvm.internal.a implements wn0.l<IdConfig, jn0.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n1 f102435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g3 f102436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y20.k<a, n1, b, Object>.a f102437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102438d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(n1 n1Var, g3 g3Var, y20.k<? super a, n1, ? extends b, ? extends Object>.a aVar, a aVar2) {
            super(1, kotlin.jvm.internal.s.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f102435a = n1Var;
            this.f102436b = g3Var;
            this.f102437c = aVar;
            this.f102438d = aVar2;
        }

        public final void a(IdConfig p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            g3.X0(this.f102435a, this.f102436b, this.f102437c, this.f102438d, p11, false, 32, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(IdConfig idConfig) {
            a(idConfig);
            return jn0.h0.f84049a;
        }
    }

    public g3(Context applicationContext, ec.r imageLoader, wg0.f.a submitVerificationWorkerFactory, a0 documentSelectWorker, xg0.j localVideoCaptureRenderer, xg0.u webRtcRenderer, rg0.m0 captureRenderer, AutoClassifyWorker.b autoClassifyWorkerFactory, qg0.o autoClassificationRenderer, eg0.a cameraStatsManager, ii0.b navigationStateManager, ei0.c externalEventLogger) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p013kotlin.jvm.internal.s.k(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        p013kotlin.jvm.internal.s.k(documentSelectWorker, "documentSelectWorker");
        p013kotlin.jvm.internal.s.k(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        p013kotlin.jvm.internal.s.k(webRtcRenderer, "webRtcRenderer");
        p013kotlin.jvm.internal.s.k(captureRenderer, "captureRenderer");
        p013kotlin.jvm.internal.s.k(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        p013kotlin.jvm.internal.s.k(autoClassificationRenderer, "autoClassificationRenderer");
        p013kotlin.jvm.internal.s.k(cameraStatsManager, "cameraStatsManager");
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        p013kotlin.jvm.internal.s.k(externalEventLogger, "externalEventLogger");
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.videoCaptureHelper = new xg0.k(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A0(g3 g3Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.WaitForAutocapture waitForAutocapture = objC instanceof n1.WaitForAutocapture ? (n1.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(n1.WaitForAutocapture.s(waitForAutocapture, null, null, null, null, null, 0, null, g3Var.videoCaptureHelper.d() ? xg0.v.Connected : xg0.v.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 B0(y20.h hVar) {
        hVar.b(b.C2176b.f102421a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C0(y20.k.a aVar, g3 g3Var, final n1 n1Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.n2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.D0(n1Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D0(n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(n1.ReviewCapturedImage.w((n1.ReviewCapturedImage) n1Var, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E0(a aVar, n1 n1Var, y20.k.a aVar2, g3 g3Var) {
        y4.g(aVar, (n1.h) n1Var, aVar2, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F0(y20.k.a aVar, g3 g3Var) {
        c4.N(aVar, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 G0(y20.k.a aVar, g3 g3Var) {
        c4.N(aVar, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H0(y20.k.a aVar) {
        c4.u(aVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I0(y20.k.a aVar, g3 g3Var, final n1 n1Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.i2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.J0(n1Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 J0(n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(n1.ReviewSelectedImage.w((n1.ReviewSelectedImage) n1Var, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r K0(final g3 g3Var, final y20.k.a aVar, final wg0.f.b it) {
        final String string;
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof wg0.f.b.c) {
            return y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.j2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g3.L0(this.f102551a, aVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof wg0.f.b.C2618b)) {
            if (it instanceof wg0.f.b.a) {
                return y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.l2
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return g3.N0(it, g3Var, aVar, (y20.r.c) obj);
                    }
                }, 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        wg0.f.b.C2618b c2618b = (wg0.f.b.C2618b) it;
        if (c2618b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            string = g3Var.applicationContext.getString(qh0.e.f105562p, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c2618b.getCause()).getDetails().getMinDimensionSize()));
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
        } else {
            string = g3Var.applicationContext.getString(qh0.e.f105563q);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
        }
        return y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.k2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.M0(string, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L0(g3 g3Var, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        g3Var.Y0(aVar, b.d.f102423a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M0(String str, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        n1 backState = ((n1) action.c()).getBackState();
        if (backState != null) {
            action.e(backState.c(str));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N0(wg0.f.b bVar, g3 g3Var, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        n1 backState = ((n1) action.c()).getBackState();
        wg0.f.b.a aVar2 = (wg0.f.b.a) bVar;
        if (!aVar2.getCause().isRecoverable() || backState == null) {
            g3Var.Y0(aVar, new b.c(aVar2.getCause()));
        } else {
            String string = g3Var.applicationContext.getString(qh0.e.f105570x);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            action.e(backState.c(string));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O0(y20.k.a aVar, g3 g3Var) {
        c4.N(aVar, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P0(g3 g3Var, y20.k.a aVar) {
        g3Var.Y0(aVar, b.C2176b.f102421a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q0(g3 g3Var, y20.k.a aVar) {
        g3Var.Y0(aVar, b.C2176b.f102421a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R0(y20.k.a aVar) {
        c4.u(aVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S0(y20.k.a aVar, g3 g3Var, final n1 n1Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.s2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.T0(n1Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T0(n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(n1.ShowInstructions.q((n1.ShowInstructions) n1Var, null, null, null, null, 0, null, null, null, 127, null));
        return jn0.h0.f84049a;
    }

    private static final y20.r<a, n1, b> U0(i4.SideIdPart sideIdPart, final n1 n1Var, g3 g3Var, String str, final String str2) {
        final d0.GovernmentIdImage governmentIdImage = new d0.GovernmentIdImage(p013kotlin.collections.v.e(new Frame(str, null, 2, null)), c4.Y(sideIdPart.getSide()), r.b(((n1.ChooseCaptureMethod) n1Var).getCaptureConfig()), d0.a.UPLOAD, null, null, 32, null);
        return y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.v2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.V0(n1Var, governmentIdImage, str2, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V0(n1 n1Var, d0.GovernmentIdImage governmentIdImage, String str, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.ChooseCaptureMethod chooseCaptureMethod = objC instanceof n1.ChooseCaptureMethod ? (n1.ChooseCaptureMethod) objC : null;
        if (chooseCaptureMethod == null) {
            return jn0.h0.f84049a;
        }
        n1.ChooseCaptureMethod chooseCaptureMethod2 = chooseCaptureMethod;
        n1.ChooseCaptureMethod chooseCaptureMethod3 = (n1.ChooseCaptureMethod) n1Var;
        action.e(new n1.ReviewSelectedImage(chooseCaptureMethod3.getCurrentPart(), chooseCaptureMethod3.k(), chooseCaptureMethod3.getCaptureConfig(), governmentIdImage, str, chooseCaptureMethod2.j(), chooseCaptureMethod2.getPartIndex(), c4.x(action, false, 1, null), null, null, false, chooseCaptureMethod3.getCountryCode(), 1792, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(n1 n1Var, g3 g3Var, y20.k<? super a, n1, ? extends b, ? extends Object>.a aVar, a aVar2, IdConfig idConfig, boolean z11) {
        n1.ShowInstructions showInstructions = (n1.ShowInstructions) n1Var;
        c4.R(showInstructions, aVar, aVar2, null, idConfig, g3Var.videoCaptureHelper, new zf0.u(null, null, null, 0, 15, null), (3584 & 128) != 0 ? true : z11, (3584 & 256) != 0 ? showInstructions.j() : idConfig.b(), (3584 & 512) != 0 ? showInstructions.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? showInstructions.getCountryCode() : null);
    }

    static /* synthetic */ void X0(n1 n1Var, g3 g3Var, y20.k.a aVar, a aVar2, IdConfig idConfig, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z11 = true;
        }
        W0(n1Var, g3Var, aVar, aVar2, idConfig, z11);
    }

    private final String Y(a.C2175a c2175a, IdConfig.e eVar, String str, String str2) {
        String strA = c2175a.getChooseCaptureMethodBody().a(str2, str, eVar);
        if (strA != null) {
            return strA;
        }
        String string = this.applicationContext.getString(qh0.e.f105560n);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    private final void Y0(y20.k<? super a, n1, ? extends b, ? extends Object>.a context, b output) {
        c4.W(context, output, this.videoCaptureHelper);
    }

    private final String Z(a.C2175a c2175a, IdConfig.e eVar, String str, String str2) {
        String strA = c2175a.getChooseCaptureMethodTitle().a(str2, str, eVar);
        if (strA != null) {
            return strA;
        }
        String string = this.applicationContext.getString(qh0.e.f105561o);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(y20.r<? super a, n1, ? extends b>.c updater) {
        updater.d(new b.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    private final String a0(a.C2175a c2175a, IdConfig.e eVar, String str, String str2) {
        String strA = c2175a.getConfirmCaptureTitle().a(str2, str, eVar);
        return strA == null ? "" : strA;
    }

    private final String b0(a.C2175a c2175a, IdConfig.e eVar) {
        String str = c2175a.W().get(eVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(qh0.e.f105564r);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    private final boolean b1(n1 n1Var) {
        if ((n1Var instanceof n1.CountdownToCapture) || (n1Var instanceof n1.f) || (n1Var instanceof n1.WaitForAutocapture) || (n1Var instanceof n1.FinalizeLocalVideoCapture)) {
            return true;
        }
        if ((n1Var instanceof n1.ChooseCaptureMethod) || (n1Var instanceof n1.ReviewSelectedImage) || (n1Var instanceof n1.ShowInstructions) || (n1Var instanceof n1.Submit) || (n1Var instanceof n1.ReviewCapturedImage) || (n1Var instanceof n1.AutoClassificationError) || (n1Var instanceof n1.AutoClassificationManualSelect)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String c0(a.C2175a c2175a, IdConfig.e eVar) {
        String str = c2175a.Z().get(eVar);
        if (str != null) {
            return str;
        }
        String string = this.applicationContext.getString(qh0.e.f105565s);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        return string;
    }

    private final ki0.k c1(Object obj, n1 n1Var) {
        return new ki0.k(obj, n1Var.getDidGoBack() ? ki0.j.SLIDE_OUT : ki0.j.SLIDE_IN);
    }

    private final String d0(n1 n1Var) {
        if ((n1Var instanceof n1.CountdownToCapture) || (n1Var instanceof n1.ReviewCapturedImage) || (n1Var instanceof n1.WaitForAutocapture) || (n1Var instanceof n1.FinalizeLocalVideoCapture) || (n1Var instanceof n1.f)) {
            return "camera_screen";
        }
        if ((n1Var instanceof n1.ChooseCaptureMethod) || (n1Var instanceof n1.ReviewSelectedImage) || (n1Var instanceof n1.ShowInstructions) || (n1Var instanceof n1.Submit) || (n1Var instanceof n1.AutoClassificationError) || (n1Var instanceof n1.AutoClassificationManualSelect)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a30.n<Object> f0(Object obj, String str) {
        return new a30.n<>(obj, str);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    private final Object h0(final a renderProps, final n1 renderState, final y20.k<? super a, n1, ? extends b, ? extends Object>.a context) {
        ei0.h takePhoto;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        int i11;
        final y20.h<? super b> hVar = new y20.h() { // from class: pg0.t1
            @Override // y20.h
            public final void b(Object obj) {
                g3.s0(context, this, (g3.b) obj);
            }
        };
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof n1.Submit));
        ei0.c cVar = this.externalEventLogger;
        String fromStep = renderProps.getFromStep();
        boolean z11 = renderState instanceof n1.AutoClassificationError;
        if (z11) {
            takePhoto = ei0.h.a.f62982a;
        } else if (renderState instanceof n1.AutoClassificationManualSelect) {
            takePhoto = ei0.h.b.f62983a;
        } else if (renderState instanceof n1.ShowInstructions) {
            takePhoto = ei0.h.g.f62988a;
        } else if (renderState instanceof n1.ChooseCaptureMethod) {
            takePhoto = new ei0.h.Prompt(((n1.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof n1.WaitForAutocapture) || (renderState instanceof n1.CountdownToCapture) || (renderState instanceof n1.FinalizeLocalVideoCapture) || (renderState instanceof n1.f)) {
            takePhoto = new ei0.h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof n1.ReviewCapturedImage) {
            takePhoto = new ei0.h.Check(((n1.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof n1.ReviewSelectedImage) {
            takePhoto = new ei0.h.CheckUpload(((n1.ReviewSelectedImage) renderState).getPartIndex());
        } else {
            if (!(renderState instanceof n1.Submit)) {
                throw new NoWhenBranchMatchedException();
            }
            takePhoto = ei0.h.e.f62986a;
        }
        cVar.c(new ei0.i.c(fromStep, takePhoto));
        if (renderState instanceof n1.ShowInstructions) {
            context.a("check_if_single_id_class", new f(renderProps, renderState, this, context, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listJ = c4.J(renderProps);
            g gVar = new g(renderState, this, context, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new g5.c(title, prompt, choose, instructionsDisclaimer, listJ, this.navigationStateManager.b(), gVar, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new wn0.a() { // from class: pg0.v1
                @Override // wn0.a
                public final Object invoke() {
                    return g3.O0(context, this);
                }
            }, new wn0.a() { // from class: pg0.y1
                @Override // wn0.a
                public final Object invoke() {
                    return g3.R0(context);
                }
            }, ((n1.ShowInstructions) renderState).getError(), new wn0.a() { // from class: pg0.z1
                @Override // wn0.a
                public final Object invoke() {
                    return g3.S0(context, this, renderState);
                }
            });
        }
        if (!(renderState instanceof n1.ChooseCaptureMethod)) {
            if (renderState instanceof n1.WaitForAutocapture) {
                return this.captureRenderer.b0(renderProps, (n1.WaitForAutocapture) renderState, context, this.videoCaptureHelper, hVar);
            }
            if (renderState instanceof n1.CountdownToCapture) {
                return this.captureRenderer.Q(renderProps, (n1.CountdownToCapture) renderState, context, this.videoCaptureHelper, hVar);
            }
            if (renderState instanceof n1.ReviewCapturedImage) {
                n1.ReviewCapturedImage reviewCapturedImage = (n1.ReviewCapturedImage) renderState;
                final q captureConfig = reviewCapturedImage.getCaptureConfig();
                IdConfig.IdSideConfig idSideConfigD = r.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
                Frame frame = (Frame) p013kotlin.collections.v.o0(reviewCapturedImage.getIdForReview().G3());
                if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                    y4.i(renderProps, (n1.h) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
                }
                return new AlertContainerScreen(oh0.l1.c(new g5.e(this.imageLoader, c4.I(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), r.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), renderProps.getStrings().getCaptureDisclaimer(), idSideConfigD.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), r.a(captureConfig), this.navigationStateManager.b(), new wn0.a() { // from class: pg0.e2
                    @Override // wn0.a
                    public final Object invoke() {
                        return g3.w0(renderProps, renderState, context, this);
                    }
                }, renderProps.getStrings().getButtonSubmit(), new wn0.a() { // from class: pg0.p2
                    @Override // wn0.a
                    public final Object invoke() {
                        return g3.x0(context, this, renderState, renderProps, captureConfig);
                    }
                }, renderProps.getStrings().getButtonRetake(), a0(renderProps.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), r.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new wn0.a() { // from class: pg0.z2
                    @Override // wn0.a
                    public final Object invoke() {
                        return g3.B0(hVar);
                    }
                }, renderProps.getStyles(), reviewCapturedImage.getError(), new wn0.a() { // from class: pg0.a3
                    @Override // wn0.a
                    public final Object invoke() {
                        return g3.C0(context, this, renderState);
                    }
                }, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled() && !reviewCapturedImage.getSubmittingForAutoClassification(), reviewCapturedImage.getSubmittingForAutoClassification(), renderProps.getReviewCaptureButtonsAxis())), null, 2, null);
            }
            if (!(renderState instanceof n1.ReviewSelectedImage)) {
                if (renderState instanceof n1.Submit) {
                    n1.Submit submit = (n1.Submit) renderState;
                    y20.w.l(context, this.submitVerificationWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), p013kotlin.jvm.internal.o0.o(wg0.f.class), "", new wn0.l() { // from class: pg0.u1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return g3.K0(this.f102894a, context, (wg0.f.b) obj);
                        }
                    });
                    ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
                    return new g5.f(renderProps.getStrings().getProcessingTitle(), renderProps.getStrings().getProcessingDescription(), renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new wn0.a() { // from class: pg0.w1
                        @Override // wn0.a
                        public final Object invoke() {
                            return g3.P0(this.f102929a, context);
                        }
                    }, new wn0.a() { // from class: pg0.x1
                        @Override // wn0.a
                        public final Object invoke() {
                            return g3.Q0(this.f102938a, context);
                        }
                    }, renderProps.getPendingPageTextVerticalPosition());
                }
                if (renderState instanceof n1.FinalizeLocalVideoCapture) {
                    return this.localVideoCaptureRenderer.i(renderProps, (n1.FinalizeLocalVideoCapture) renderState, context, this.videoCaptureHelper);
                }
                if (renderState instanceof n1.f) {
                    return this.webRtcRenderer.j(renderProps, (n1.f) renderState, context, this.videoCaptureHelper);
                }
                if (z11) {
                    return this.autoClassificationRenderer.n(renderProps, (n1.AutoClassificationError) renderState, context, this.videoCaptureHelper);
                }
                if (renderState instanceof n1.AutoClassificationManualSelect) {
                    return this.autoClassificationRenderer.t(renderProps, (n1.AutoClassificationManualSelect) renderState, context, this.videoCaptureHelper);
                }
                throw new NoWhenBranchMatchedException();
            }
            n1.ReviewSelectedImage reviewSelectedImage = (n1.ReviewSelectedImage) renderState;
            i4.SideIdPart currentPart = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                y4.i(renderProps, (n1.h) renderState, context, this.videoCaptureHelper, this.autoClassifyWorkerFactory);
            }
            return new ReviewSelectedImageView(this.imageLoader, c0(renderProps.getStrings(), currentPart.getSide()), b0(renderProps.getStrings(), currentPart.getSide()), renderProps.getStrings().getReviewSelectedImageConfirmButton(), renderProps.getStrings().getReviewSelectedImageChooseAnotherButton(), ((Frame) p013kotlin.collections.v.o0(reviewSelectedImage.getIdForReview().G3())).getAbsoluteFilePath(), ((Frame) p013kotlin.collections.v.o0(reviewSelectedImage.getIdForReview().G3())).getMimeType(), reviewSelectedImage.getFileName(), this.navigationStateManager.b(), new wn0.a() { // from class: pg0.b3
                @Override // wn0.a
                public final Object invoke() {
                    return g3.E0(renderProps, renderState, context, this);
                }
            }, new wn0.a() { // from class: pg0.c3
                @Override // wn0.a
                public final Object invoke() {
                    return g3.F0(context, this);
                }
            }, new wn0.a() { // from class: pg0.d3
                @Override // wn0.a
                public final Object invoke() {
                    return g3.G0(context, this);
                }
            }, new wn0.a() { // from class: pg0.e3
                @Override // wn0.a
                public final Object invoke() {
                    return g3.H0(context);
                }
            }, reviewSelectedImage.getError(), new wn0.a() { // from class: pg0.f3
                @Override // wn0.a
                public final Object invoke() {
                    return g3.I0(context, this, renderState);
                }
            }, renderProps.getStyles(), reviewSelectedImage.getSubmittingForAutoClassification());
        }
        n1.ChooseCaptureMethod chooseCaptureMethod = (n1.ChooseCaptureMethod) renderState;
        final i4.SideIdPart currentPart2 = chooseCaptureMethod.getCurrentPart();
        if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
            y20.w.l(context, this.documentSelectWorker, p013kotlin.jvm.internal.o0.o(a0.class), "", new wn0.l() { // from class: pg0.a2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g3.i0(this.f102219a, currentPart2, renderState, (a0.a) obj);
                }
            });
        }
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
        List<CaptureOptionNativeMobile> listF = renderProps.f();
        String strZ = Z(renderProps.getStrings(), currentPart2.getSide(), r.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
        String strY = Y(renderProps.getStrings(), currentPart2.getSide(), r.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
        String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
        String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.a aVar = new wn0.a() { // from class: pg0.b2
            @Override // wn0.a
            public final Object invoke() {
                return g3.k0(context, this, renderState, renderProps);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: pg0.c2
            @Override // wn0.a
            public final Object invoke() {
                return g3.o0(context, this, renderState);
            }
        };
        wn0.a aVar3 = new wn0.a() { // from class: pg0.d2
            @Override // wn0.a
            public final Object invoke() {
                return g3.q0(context, this);
            }
        };
        wn0.a aVar4 = new wn0.a() { // from class: pg0.f2
            @Override // wn0.a
            public final Object invoke() {
                return g3.r0(context);
            }
        };
        String error = chooseCaptureMethod.getError();
        wn0.a aVar5 = new wn0.a() { // from class: pg0.g2
            @Override // wn0.a
            public final Object invoke() {
                return g3.u0(context, this, renderState);
            }
        };
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        IdConfig.e side = chooseCaptureMethod.getCurrentPart().getSide();
        int[] iArr = c.f102424a;
        int i12 = iArr[side.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (promptPage != null) {
                            idFrontPictograph = promptPage.getPassportSignaturePictograph();
                            remoteImage = idFrontPictograph;
                        }
                    } else if (promptPage != null) {
                        idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                        remoteImage = idFrontPictograph;
                    }
                }
                remoteImage = null;
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdBackPictograph();
                remoteImage = idFrontPictograph;
            } else {
                remoteImage = null;
            }
        } else if (r.a(chooseCaptureMethod.getCaptureConfig()) == wg0.e.Passport) {
            if (promptPage != null) {
                idFrontPictograph = promptPage.getPassportFrontPictograph();
                remoteImage = idFrontPictograph;
            } else {
                remoteImage = null;
            }
        } else if (promptPage != null) {
            idFrontPictograph = promptPage.getIdFrontPictograph();
            remoteImage = idFrontPictograph;
        } else {
            remoteImage = null;
        }
        int i13 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
        if (i13 != 1) {
            i11 = (i13 == 2 || i13 == 4) ? p4.f102848d : p4.f102849e;
        } else {
            i11 = r.a(chooseCaptureMethod.getCaptureConfig()) == wg0.e.Passport ? p4.f102850f : p4.f102849e;
        }
        return new ChooseCaptureMethodView(listF, strZ, strY, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, aVarB, aVar, aVar2, aVar3, aVar4, error, aVar5, styles, remoteImage, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r i0(g3 g3Var, i4.SideIdPart sideIdPart, final n1 n1Var, a0.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof a0.a.b) {
            a0.a.b bVar = (a0.a.b) it;
            return U0(sideIdPart, n1Var, g3Var, bVar.getAbsoluteFilePath(), bVar.getFileName());
        }
        if (p013kotlin.jvm.internal.s.f(it, a0.a.C2169a.f102208a)) {
            return y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.q2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g3.j0(n1Var, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j0(n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(n1.ChooseCaptureMethod.q((n1.ChooseCaptureMethod) n1Var, null, null, null, 0, null, null, false, null, null, 447, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k0(final y20.k.a aVar, final g3 g3Var, final n1 n1Var, final a aVar2) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.r2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.l0(n1Var, aVar2, aVar, g3Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l0(n1 n1Var, a aVar, final y20.k.a aVar2, final g3 g3Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.ChooseCaptureMethod chooseCaptureMethod = objC instanceof n1.ChooseCaptureMethod ? (n1.ChooseCaptureMethod) objC : null;
        if (chooseCaptureMethod == null) {
            return jn0.h0.f84049a;
        }
        n1.ChooseCaptureMethod chooseCaptureMethod2 = (n1.ChooseCaptureMethod) n1Var;
        action.e(new n1.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.k(), chooseCaptureMethod2.getCaptureConfig(), c4.K(aVar, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.j(), chooseCaptureMethod.getPartIndex(), c4.x(action, false, 1, null), xg0.v.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new wn0.a() { // from class: pg0.u2
            @Override // wn0.a
            public final Object invoke() {
                return g3.m0(aVar2, g3Var);
            }
        }, 11776, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m0(y20.k.a aVar, final g3 g3Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.y2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.n0(this.f102965a, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n0(g3 g3Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.WaitForAutocapture waitForAutocapture = objC instanceof n1.WaitForAutocapture ? (n1.WaitForAutocapture) objC : null;
        if (waitForAutocapture != null) {
            action.e(n1.WaitForAutocapture.s(waitForAutocapture, null, null, null, null, null, 0, null, g3Var.videoCaptureHelper.d() ? xg0.v.Connected : xg0.v.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o0(y20.k.a aVar, final g3 g3Var, final n1 n1Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.h2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.p0(this.f102532a, n1Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p0(g3 g3Var, n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        g3Var.documentSelectWorker.e();
        action.e(n1.ChooseCaptureMethod.q((n1.ChooseCaptureMethod) n1Var, null, null, null, 0, null, null, true, null, null, 447, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q0(y20.k.a aVar, g3 g3Var) {
        c4.N(aVar, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r0(y20.k.a aVar) {
        c4.u(aVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(final y20.k.a aVar, final g3 g3Var, final b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.o2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.t0(this.f102816a, aVar, it, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t0(g3 g3Var, y20.k.a aVar, b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        g3Var.Y0(aVar, bVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u0(y20.k.a aVar, g3 g3Var, final n1 n1Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.t2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.v0(n1Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v0(n1 n1Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(n1.ChooseCaptureMethod.q((n1.ChooseCaptureMethod) n1Var, null, null, null, 0, null, null, false, null, null, 255, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w0(a aVar, n1 n1Var, y20.k.a aVar2, g3 g3Var) {
        y4.g(aVar, (n1.h) n1Var, aVar2, g3Var.videoCaptureHelper);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x0(final y20.k.a aVar, final g3 g3Var, final n1 n1Var, final a aVar2, final q qVar) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.m2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.y0(n1Var, aVar2, qVar, aVar, g3Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 y0(n1 n1Var, a aVar, q qVar, final y20.k.a aVar2, final g3 g3Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1 n1Var2 = objC instanceof n1 ? (n1) objC : null;
        if (n1Var2 == null) {
            return jn0.h0.f84049a;
        }
        n1.ReviewCapturedImage reviewCapturedImage = (n1.ReviewCapturedImage) n1Var;
        n1.WaitForAutocapture waitForAutocapture = new n1.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), ((n1) action.c()).k(), qVar, c4.K((a) action.b(), reviewCapturedImage.getCurrentPart().getSide()), n1Var2.j(), n1Var2.getPartIndex(), c4.w(action, false), xg0.v.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new wn0.a() { // from class: pg0.w2
            @Override // wn0.a
            public final Object invoke() {
                return g3.z0(aVar2, g3Var);
            }
        }, 11776, null);
        waitForAutocapture.l(true);
        action.e(waitForAutocapture);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 z0(y20.k.a aVar, final g3 g3Var) {
        aVar.c().b(y20.z.d(g3Var, null, new wn0.l() { // from class: pg0.x2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g3.A0(this.f102940a, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(n1 state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return a30.s.a(state);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public n1 d(a props, Snapshot snapshot) {
        p013kotlin.jvm.internal.s.k(props, "props");
        n1 n1Var = null;
        Parcelable parcelable = null;
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                p013kotlin.jvm.internal.s.h(parcelable2);
                p013kotlin.jvm.internal.s.j(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            n1Var = (n1) parcelable;
        }
        if (n1Var != null) {
            return n1Var;
        }
        if (props.getAutoClassificationConfig().getIsEnabled() && !this.videoCaptureHelper.c(props)) {
            if (!props.l()) {
                return new n1.WaitForAutocapture(new i4.SideIdPart(IdConfig.e.Front), p013kotlin.collections.v.m(), new q.AutoClassifyConfig(props.getAutoClassificationConfig()), g5.b.a.Enabled, p013kotlin.collections.v.m(), 0, null, xg0.v.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, null, 28160, null);
            }
            return new n1.ChooseCaptureMethod(new i4.SideIdPart(IdConfig.e.Front), p013kotlin.collections.v.m(), p013kotlin.collections.v.m(), 0, props.getCountryCode(), new q.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
        }
        return new n1.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public Object f(a renderProps, n1 renderState, y20.k<? super a, n1, ? extends b, ? extends Object>.a context) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        Object objH0 = h0(renderProps, renderState, context);
        String strD0 = d0(renderState);
        if (strD0 != null) {
            objH0 = f0(objH0, strD0);
        }
        if (!b1(renderState)) {
            context.a("close_camera", new d(null));
        }
        if (!this.videoCaptureHelper.f(renderProps) && yh0.f.d(this.applicationContext)) {
            context.a("output_webrtc_error", new e(context, this, null));
        }
        return c1(objH0, renderState);
    }
}
