package th0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import bg0.CameraChoice;
import bg0.CameraChoices;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import ezvcard.property.Gender;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import y20.Snapshot;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u009d\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0083\u0001\u0085\u0001\u0087\u0001\u0089\u0001Ba\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b$\u0010%JC\u0010'\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020&2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b'\u0010(JC\u0010+\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020)2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b+\u0010,JC\u0010.\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020-2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u0002002\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00104\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u0002032\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105JC\u00107\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u0002062\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JC\u0010:\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u0002092\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;JC\u0010=\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020<2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b=\u0010>JC\u0010@\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020?2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b@\u0010AJC\u0010C\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020B2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bC\u0010DJC\u0010F\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020E2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bF\u0010GJC\u0010I\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020H2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020K2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020K2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010MJ\u0017\u0010P\u001a\u00020O2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010QJ-\u0010V\u001a\u00020U2\u001c\u0010T\u001a\u00180RR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040SH\u0002¢\u0006\u0004\bV\u0010WJC\u0010Y\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020X2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bY\u0010ZJC\u0010\\\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020[2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\\\u0010]JE\u0010c\u001a\u00020B\"\f\b\u0000\u0010_*\u00020\u0003*\u00020^*\u00160RR\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030S2\u0006\u0010`\u001a\u00028\u00002\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ3\u0010e\u001a\u00020U2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\be\u0010fJ;\u0010h\u001a\u00020U2\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010g\u001a\u00020\u0004H\u0002¢\u0006\u0004\bh\u0010iJ7\u0010l\u001a\u00020U*\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ%\u0010t\u001a\u0004\u0018\u00010s*\u00020n2\u0006\u0010p\u001a\u00020o2\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bt\u0010uJ\u0013\u0010w\u001a\u00020v*\u00020\u0003H\u0002¢\u0006\u0004\bw\u0010xJ!\u0010|\u001a\u00020\u00032\u0006\u0010y\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\b|\u0010}JC\u0010~\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00032\"\u0010\"\u001a\u001e0!R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020z2\u0007\u0010\u0080\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009e\u0001"}, d2 = {"Lth0/d6;", "Ly20/k;", "Lth0/d6$b;", "Lth0/x1;", "Lth0/d6$c;", "", "Landroid/content/Context;", "applicationContext", "Lvh0/c$a;", "submitVerificationWorker", "Ldj0/b$a;", "webRtcWorkerFactory", "Lth0/b1$b;", "selfieAnalyzeWorker", "Loh0/c1;", "permissionRequestWorkflow", "Lwh0/j;", "localVideoCaptureRenderer", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "Leg0/a;", "cameraStatsManager", "Lii0/b;", "navigationStateManager", "Lei0/c;", "externalEventLogger", "<init>", "(Landroid/content/Context;Lvh0/c$a;Ldj0/b$a;Lth0/b1$b;Loh0/c1;Lwh0/j;Lzf0/y$a;Lbg0/e$a;Leg0/a;Lii0/b;Lei0/c;)V", "renderProps", "Lth0/x1$j;", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth0/d6$d$b;", "c2", "(Lth0/d6$b;Lth0/x1$j;Ly20/k$a;)Lth0/d6$d$b;", "Lth0/x1$o;", "M2", "(Lth0/d6$b;Lth0/x1$o;Ly20/k$a;)Ljava/lang/Object;", "Lth0/x1$h;", "Lth0/d6$d;", "S1", "(Lth0/d6$b;Lth0/x1$h;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$p;", "W2", "(Lth0/d6$b;Lth0/x1$p;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$k;", "h2", "(Lth0/d6$b;Lth0/x1$k;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$l;", "n2", "(Lth0/d6$b;Lth0/x1$l;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$m;", "y2", "(Lth0/d6$b;Lth0/x1$m;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$c;", "w1", "(Lth0/d6$b;Lth0/x1$c;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$d;", "D1", "(Lth0/d6$b;Lth0/x1$d;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$a;", "h1", "(Lth0/d6$b;Lth0/x1$a;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$b;", "q1", "(Lth0/d6$b;Lth0/x1$b;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$f;", "L1", "(Lth0/d6$b;Lth0/x1$f;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$q;", "i3", "(Lth0/d6$b;Lth0/x1$q;Ly20/k$a;)Lth0/d6$d;", "", "x3", "(Lth0/d6$b;)Z", "e1", "Lfg0/a;", "w3", "(Lth0/d6$b;)Lfg0/a;", "Ly20/r$c;", "Ly20/r;", "updater", "Ljn0/h0;", "s3", "(Ly20/r$c;)V", "Lth0/x1$i;", "V1", "(Lth0/d6$b;Lth0/x1$i;Ly20/k$a;)Lth0/d6$d;", "Lth0/x1$n;", "G2", "(Lth0/d6$b;Lth0/x1$n;Ly20/k$a;)Lth0/d6$d;", "Lth0/a0;", "T", "currentState", "Lth0/a1;", "capturedSelfie", "f1", "(Ly20/r$c;Lth0/x1;Lth0/a1;)Lth0/x1$b;", "o3", "(Ly20/k$a;)V", "output", "q3", "(Ly20/k$a;Lth0/d6$c;)V", "", AnalyticsAttribute.Error, "p3", "(Ly20/k$a;Ljava/lang/Throwable;)V", "Ldg0/b;", "Lth0/d6$b$a;", "strings", "Lth0/a1$b;", "pose", "", "u3", "(Ldg0/b;Lth0/d6$b$a;Lth0/a1$b;)Ljava/lang/String;", "Lei0/j;", "v3", "(Lth0/x1;)Lei0/j;", "props", "Ly20/i;", "snapshot", "d1", "(Lth0/d6$b;Ly20/i;)Lth0/x1;", "g1", "(Lth0/d6$b;Lth0/x1;Ly20/k$a;)Ljava/lang/Object;", "state", "t3", "(Lth0/x1;)Ly20/i;", "a", "Landroid/content/Context;", "b", "Lvh0/c$a;", "c", "Ldj0/b$a;", DateTokenConverter.CONVERTER_KEY, "Lth0/b1$b;", "e", "Loh0/c1;", "f", "Lwh0/j;", "g", "Lzf0/y$a;", "h", "Lbg0/e$a;", IntegerTokenConverter.CONVERTER_KEY, "Leg0/a;", "j", "Lii0/b;", "k", "Lei0/c;", "Lej0/a;", "l", "Lej0/a;", "webRtcManager", "m", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d6 extends y20.k<Input, x1, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vh0.c.a submitVerificationWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dj0.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b1.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oh0.c1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wh0.j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zf0.y.a cameraXControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bg0.e.a camera2ManagerFactoryFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ei0.c externalEventLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ej0.a webRtcManager;

    /* JADX INFO: renamed from: th0.d6$b, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001:\u00012Bï\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010+R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b5\u0010=R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010=R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b@\u0010+R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010=R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bC\u0010=R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b6\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\b>\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b;\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\b9\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\b7\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bP\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bO\u0010+R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bN\u0010+R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bM\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bH\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b4\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bC\u0010Y\u001a\u0004\b2\u0010ZR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bE\u0010[\u001a\u0004\bQ\u0010\\R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bT\u0010]\u001a\u0004\bR\u0010^R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bW\u0010_\u001a\u0004\bA\u0010`¨\u0006a"}, d2 = {"Lth0/d6$b;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lth0/d6$b$a;", "strings", "Lth0/d2;", "selfieType", "", "Lth0/a1$b;", "orderedPoses", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lth0/s0;", "poseConfigs", "Lth0/b0;", "designVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLth0/d6$b$a;Lth0/d2;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lth0/s0;Lth0/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v", "b", "l", "c", "j", DateTokenConverter.CONVERTER_KEY, "k", "e", "Z", "()Z", "f", "g", IntegerTokenConverter.CONVERTER_KEY, "h", "t", "w", "Lth0/d6$b$a;", "x", "()Lth0/d6$b$a;", "Lth0/d2;", "u", "()Lth0/d2;", "Ljava/util/List;", "q", "()Ljava/util/List;", "m", "n", "o", "p", "r", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "y", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "z", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lth0/s0;", "()Lth0/s0;", "Lth0/b0;", "()Lth0/b0;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromComponent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldKeySelfie;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipPromptPage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Strings strings;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final d2 selfieType;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<a1.b> orderedPoses;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cameraPermissionsTitle;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cameraPermissionsRationale;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cameraPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cameraPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String microphonePermissionsTitle;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String microphonePermissionsRationale;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final String microphonePermissionsModalPositiveButton;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String microphonePermissionsModalNegativeButton;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 designVersion;

        /* JADX INFO: renamed from: th0.d6$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b1\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b9\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010$R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010$R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b7\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b5\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\bF\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b>\u0010$R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\b@\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bB\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bD\u0010$R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\b<\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\b:\u0010$R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b,\u0010$R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b3\u0010$R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\bJ\u0010$R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\bH\u0010$R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bI\u0010$R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\b/\u0010$¨\u0006L"}, d2 = {"Lth0/d6$b$a;", "", "", "title", "prompt", "disclosure", "startButton", "capturePageTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "cameraLoadingTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "C", "b", "h", "c", "e", DateTokenConverter.CONVERTER_KEY, "B", "f", "A", "g", "p", "r", IntegerTokenConverter.CONVERTER_KEY, "s", "j", "y", "k", "q", "l", "z", "m", "u", "n", "w", "o", "t", "v", "x", "getSelfieHintCenterFaceDescription", "D", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Strings {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            private final String selfieHintCenterFaceDescription;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            private final String selfieHintLookLeftDescription;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
            private final String selfieHintLookRightDescription;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
            private final String cameraLoadingTitle;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String startButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String capturePageTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintTakePhoto;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintCenterFace;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintFaceTooClose;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintFaceTooFar;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintMultipleFaces;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintFaceIncomplete;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintPoseNotCentered;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintLookLeft;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintLookRight;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieHintHoldStill;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final String processingTitle;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final String processingDescription;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageTitle;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageDescription;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageLabelFront;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageLabelLeft;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageLabelRight;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageBtnSubmit;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            private final String selfieCheckPageBtnRetake;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            private final String autoCaptureOn;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            private final String captureSuccess;

            public Strings(String title, String prompt, String disclosure, String startButton, String capturePageTitle, String selfieHintTakePhoto, String selfieHintCenterFace, String selfieHintFaceTooClose, String selfieHintFaceTooFar, String selfieHintMultipleFaces, String selfieHintFaceIncomplete, String selfieHintPoseNotCentered, String selfieHintLookLeft, String selfieHintLookRight, String selfieHintHoldStill, String processingTitle, String processingDescription, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(prompt, "prompt");
                p013kotlin.jvm.internal.s.k(disclosure, "disclosure");
                p013kotlin.jvm.internal.s.k(startButton, "startButton");
                p013kotlin.jvm.internal.s.k(capturePageTitle, "capturePageTitle");
                p013kotlin.jvm.internal.s.k(selfieHintTakePhoto, "selfieHintTakePhoto");
                p013kotlin.jvm.internal.s.k(selfieHintCenterFace, "selfieHintCenterFace");
                p013kotlin.jvm.internal.s.k(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                p013kotlin.jvm.internal.s.k(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                p013kotlin.jvm.internal.s.k(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                p013kotlin.jvm.internal.s.k(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                p013kotlin.jvm.internal.s.k(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
                p013kotlin.jvm.internal.s.k(selfieHintLookLeft, "selfieHintLookLeft");
                p013kotlin.jvm.internal.s.k(selfieHintLookRight, "selfieHintLookRight");
                p013kotlin.jvm.internal.s.k(selfieHintHoldStill, "selfieHintHoldStill");
                p013kotlin.jvm.internal.s.k(processingTitle, "processingTitle");
                p013kotlin.jvm.internal.s.k(processingDescription, "processingDescription");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.startButton = startButton;
                this.capturePageTitle = capturePageTitle;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCentered = selfieHintPoseNotCentered;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.selfieCheckPageTitle = str;
                this.selfieCheckPageDescription = str2;
                this.selfieCheckPageLabelFront = str3;
                this.selfieCheckPageLabelLeft = str4;
                this.selfieCheckPageLabelRight = str5;
                this.selfieCheckPageBtnSubmit = str6;
                this.selfieCheckPageBtnRetake = str7;
                this.autoCaptureOn = str8;
                this.captureSuccess = str9;
                this.selfieHintCenterFaceDescription = str10;
                this.selfieHintLookLeftDescription = str11;
                this.selfieHintLookRightDescription = str12;
                this.cameraLoadingTitle = str13;
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final String getStartButton() {
                return this.startButton;
            }

            /* JADX INFO: renamed from: C, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return p013kotlin.jvm.internal.s.f(this.title, strings.title) && p013kotlin.jvm.internal.s.f(this.prompt, strings.prompt) && p013kotlin.jvm.internal.s.f(this.disclosure, strings.disclosure) && p013kotlin.jvm.internal.s.f(this.startButton, strings.startButton) && p013kotlin.jvm.internal.s.f(this.capturePageTitle, strings.capturePageTitle) && p013kotlin.jvm.internal.s.f(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && p013kotlin.jvm.internal.s.f(this.selfieHintCenterFace, strings.selfieHintCenterFace) && p013kotlin.jvm.internal.s.f(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && p013kotlin.jvm.internal.s.f(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && p013kotlin.jvm.internal.s.f(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && p013kotlin.jvm.internal.s.f(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && p013kotlin.jvm.internal.s.f(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && p013kotlin.jvm.internal.s.f(this.selfieHintLookLeft, strings.selfieHintLookLeft) && p013kotlin.jvm.internal.s.f(this.selfieHintLookRight, strings.selfieHintLookRight) && p013kotlin.jvm.internal.s.f(this.selfieHintHoldStill, strings.selfieHintHoldStill) && p013kotlin.jvm.internal.s.f(this.processingTitle, strings.processingTitle) && p013kotlin.jvm.internal.s.f(this.processingDescription, strings.processingDescription) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && p013kotlin.jvm.internal.s.f(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && p013kotlin.jvm.internal.s.f(this.autoCaptureOn, strings.autoCaptureOn) && p013kotlin.jvm.internal.s.f(this.captureSuccess, strings.captureSuccess) && p013kotlin.jvm.internal.s.f(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && p013kotlin.jvm.internal.s.f(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && p013kotlin.jvm.internal.s.f(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && p013kotlin.jvm.internal.s.f(this.cameraLoadingTitle, strings.cameraLoadingTitle);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31) + this.selfieHintHoldStill.hashCode()) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str = this.selfieCheckPageTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.selfieCheckPageDescription;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.selfieCheckPageLabelFront;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.selfieCheckPageLabelLeft;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.selfieCheckPageLabelRight;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieCheckPageBtnSubmit;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.selfieCheckPageBtnRetake;
                int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.autoCaptureOn;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.captureSuccess;
                int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieHintCenterFaceDescription;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieHintLookLeftDescription;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieHintLookRightDescription;
                int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.cameraLoadingTitle;
                return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ", autoCaptureOn=" + this.autoCaptureOn + ", captureSuccess=" + this.captureSuccess + ", selfieHintCenterFaceDescription=" + this.selfieHintCenterFaceDescription + ", selfieHintLookLeftDescription=" + this.selfieHintLookLeftDescription + ", selfieHintLookRightDescription=" + this.selfieHintLookRightDescription + ", cameraLoadingTitle=" + this.cameraLoadingTitle + ")";
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input(String sessionToken, String inquiryId, String fromComponent, String fromStep, boolean z11, boolean z12, String fieldKeySelfie, boolean z13, boolean z14, Strings strings, d2 selfieType, List<? extends a1.b> orderedPoses, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, StepStyles.SelfieStepStyle selfieStepStyle, VideoCaptureConfig videoCaptureConfig, NextStep.Selfie.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition, PoseConfigs poseConfigs, b0 designVersion) {
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(fieldKeySelfie, "fieldKeySelfie");
            p013kotlin.jvm.internal.s.k(strings, "strings");
            p013kotlin.jvm.internal.s.k(selfieType, "selfieType");
            p013kotlin.jvm.internal.s.k(orderedPoses, "orderedPoses");
            p013kotlin.jvm.internal.s.k(videoCaptureConfig, "videoCaptureConfig");
            p013kotlin.jvm.internal.s.k(assetConfig, "assetConfig");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            p013kotlin.jvm.internal.s.k(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z13;
            this.skipPromptPage = z14;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = orderedPoses;
            this.cameraPermissionsTitle = str;
            this.cameraPermissionsRationale = str2;
            this.cameraPermissionsModalPositiveButton = str3;
            this.cameraPermissionsModalNegativeButton = str4;
            this.microphonePermissionsTitle = str5;
            this.microphonePermissionsRationale = str6;
            this.microphonePermissionsModalPositiveButton = str7;
            this.microphonePermissionsModalNegativeButton = str8;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return p013kotlin.jvm.internal.s.f(this.sessionToken, input.sessionToken) && p013kotlin.jvm.internal.s.f(this.inquiryId, input.inquiryId) && p013kotlin.jvm.internal.s.f(this.fromComponent, input.fromComponent) && p013kotlin.jvm.internal.s.f(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && p013kotlin.jvm.internal.s.f(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && p013kotlin.jvm.internal.s.f(this.strings, input.strings) && p013kotlin.jvm.internal.s.f(this.selfieType, input.selfieType) && p013kotlin.jvm.internal.s.f(this.orderedPoses, input.orderedPoses) && p013kotlin.jvm.internal.s.f(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && p013kotlin.jvm.internal.s.f(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && p013kotlin.jvm.internal.s.f(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && p013kotlin.jvm.internal.s.f(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && p013kotlin.jvm.internal.s.f(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && p013kotlin.jvm.internal.s.f(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && p013kotlin.jvm.internal.s.f(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && p013kotlin.jvm.internal.s.f(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && p013kotlin.jvm.internal.s.f(this.styles, input.styles) && p013kotlin.jvm.internal.s.f(this.videoCaptureConfig, input.videoCaptureConfig) && p013kotlin.jvm.internal.s.f(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && p013kotlin.jvm.internal.s.f(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getDesignVersion() {
            return this.designVersion;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            String str = this.cameraPermissionsTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            return ((((((((((iHashCode9 + (selfieStepStyle != null ? selfieStepStyle.hashCode() : 0)) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }

        public final List<a1.b> q() {
            return this.orderedPoses;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final d2 getSelfieType() {
            return this.selfieType;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lth0/d6$c;", "", "<init>", "()V", "b", DateTokenConverter.CONVERTER_KEY, "a", "c", "Lth0/d6$c$a;", "Lth0/d6$c$b;", "Lth0/d6$c$c;", "Lth0/d6$c$d;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lth0/d6$c$a;", "Lth0/d6$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f113699a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 869674411;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lth0/d6$c$b;", "Lth0/d6$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f113700a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1455860573;
            }

            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: th0.d6$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lth0/d6$c$c;", "Lth0/d6$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && p013kotlin.jvm.internal.s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lth0/d6$c$d;", "Lth0/d6$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f113702a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 905373494;
            }

            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lth0/d6$d;", "", "<init>", "()V", "b", DateTokenConverter.CONVERTER_KEY, "c", "a", "e", "f", "Lth0/d6$d$a;", "Lth0/d6$d$b;", "Lth0/d6$d$c;", "Lth0/d6$d$d;", "Lth0/d6$d$e;", "Lth0/d6$d$f;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\u0018\u00002\u00020\u0001:\u000259BÏ\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0016j\u0002`\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010*\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0016\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u00108R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bK\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010NR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\bS\u0010QR'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0016j\u0002`\u00188\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010VR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bW\u0010QR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bW\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b_\u0010A\u001a\u0004\b`\u0010CR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b>\u0010cR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b@\u0010d\u001a\u0004\b=\u0010eR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130\u00168\u0006¢\u0006\f\n\u0004\bf\u0010U\u001a\u0004\bT\u0010VR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\ba\u0010iR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bK\u0010j\u001a\u0004\b;\u0010kR\u0017\u0010*\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bI\u0010l\u001a\u0004\bD\u0010mR\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u0010A\u001a\u0004\bn\u0010CR\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bZ\u0010A\u001a\u0004\bo\u0010CR#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u00168\u0006¢\u0006\f\n\u0004\b]\u0010U\u001a\u0004\bX\u0010VR\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b`\u0010p\u001a\u0004\b_\u0010qR\u0017\u00100\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\bg\u0010CR\u0017\u00101\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bn\u0010A\u001a\u0004\bf\u0010CR\u0017\u00102\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bo\u0010A\u001a\u0004\b5\u0010C¨\u0006r"}, d2 = {"Lth0/d6$d$a;", "Lth0/d6$d;", "", "title", "message", "description", "autoCaptureText", "captureSuccessText", "realTimeHint", "", "isAutoCaptureOn", "Lth0/d6$d$a$a;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "requireStrictSelfieCapture", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "isAudioRequired", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "Lzf0/u$b;", "onCameraFacingModeSelected", "", "poseScore", "Ldg0/a;", "brightnessInfo", "facingMode", "isFlashEnabled", "isFlashOn", "onFlashSet", "Lth0/a1$b;", "pose", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLth0/d6$d$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLii0/a;Lwn0/a;Lwn0/a;Lwn0/l;Lwn0/a;Lfg0/a;Lej0/a;ZLzf0/y$a;Lbg0/e$a;Lwn0/l;FLdg0/a;Lzf0/u$b;ZZLwn0/l;Lth0/a1$b;ZZZ)V", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "g", DateTokenConverter.CONVERTER_KEY, "e", "f", "t", "Z", "C", "()Z", "h", "Lth0/d6$d$a$a;", "j", "()Lth0/d6$d$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "w", "k", "Lii0/a;", "()Lii0/a;", "l", "Lwn0/a;", "()Lwn0/a;", "m", "o", "n", "Lwn0/l;", "()Lwn0/l;", "q", "p", "Lfg0/a;", "z", "()Lfg0/a;", "Lej0/a;", "A", "()Lej0/a;", "r", "B", "s", "Lzf0/y$a;", "()Lzf0/y$a;", "Lbg0/e$a;", "()Lbg0/e$a;", "u", "v", Gender.FEMALE, "()F", "Ldg0/a;", "()Ldg0/a;", "Lzf0/u$b;", "()Lzf0/u$b;", "D", "E", "Lth0/a1$b;", "()Lth0/a1$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends d {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final wn0.l<Boolean, jn0.h0> onFlashSet;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final a1.b pose;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final boolean requestingPermissions;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            private final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            private final boolean allowSwitchCamera;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String autoCaptureText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final String captureSuccessText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final String realTimeHint;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final boolean isAutoCaptureOn;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final AbstractC2425a mode;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final wn0.l<Throwable, jn0.h0> onCameraError;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onPermissionChanged;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            private final fg0.a videoCaptureMethod;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            private final ej0.a webRtcManager;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            private final boolean isAudioRequired;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            private final zf0.y.a cameraXControllerFactory;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private final bg0.e.a camera2ManagerFactoryFactory;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
            private final wn0.l<zf0.u.b, jn0.h0> onCameraFacingModeSelected;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            private final float poseScore;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            private final dg0.a brightnessInfo;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            private final zf0.u.b facingMode;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
            private final boolean isFlashEnabled;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
            private final boolean isFlashOn;

            /* JADX INFO: renamed from: th0.d6$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lth0/d6$d$a$a;", "", "<init>", "()V", "Lth0/d6$d$a$b;", "a", "()Lth0/d6$d$a$b;", "overlay", "g", IntegerTokenConverter.CONVERTER_KEY, "f", "b", "h", DateTokenConverter.CONVERTER_KEY, "e", "c", "Lth0/d6$d$a$a$a;", "Lth0/d6$d$a$a$b;", "Lth0/d6$d$a$a$c;", "Lth0/d6$d$a$a$d;", "Lth0/d6$d$a$a$e;", "Lth0/d6$d$a$a$f;", "Lth0/d6$d$a$a$g;", "Lth0/d6$d$a$a$h;", "Lth0/d6$d$a$a$i;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class AbstractC2425a {

                /* JADX INFO: renamed from: th0.d6$d$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lth0/d6$d$a$a$a;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "<init>", "(Lth0/d6$d$a$b;)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class C2426a extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2426a(b overlay) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.overlay = overlay;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$b */
                @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lth0/d6$d$a$a$b;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "", "countDown", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lkotlin/Function1;", "", "Ljn0/h0;", "onError", "<init>", "(Lth0/d6$d$a$b;IZJLwn0/l;)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "I", "()I", "c", "Z", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "J", "()J", "Lwn0/l;", "()Lwn0/l;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class b extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final int countDown;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<Throwable, jn0.h0> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public b(b overlay, int i11, boolean z11, long j11, wn0.l<? super Throwable, jn0.h0> onError) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(onError, "onError");
                        this.overlay = overlay;
                        this.countDown = i11;
                        this.recordLocalVideo = z11;
                        this.maxRecordingLengthMs = j11;
                        this.onError = onError;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    public final wn0.l<Throwable, jn0.h0> d() {
                        return this.onError;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$c */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lth0/d6$d$a$a$c;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function1;", "Ljava/io/File;", "Ljn0/h0;", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "<init>", "(Lth0/d6$d$a$b;Lwn0/l;Lwn0/a;Z)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/l;", "()Lwn0/l;", "c", "Lwn0/a;", "()Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class c extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<File, jn0.h0> finalizeVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onAnimationComplete;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final boolean startFinalize;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public c(b overlay, wn0.l<? super File, jn0.h0> finalizeVideo, wn0.a<jn0.h0> onAnimationComplete, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(finalizeVideo, "finalizeVideo");
                        p013kotlin.jvm.internal.s.k(onAnimationComplete, "onAnimationComplete");
                        this.overlay = overlay;
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z11;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.l<File, jn0.h0> b() {
                        return this.finalizeVideo;
                    }

                    public final wn0.a<jn0.h0> c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$d, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lth0/d6$d$a$a$d;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function1;", "", "Ljn0/h0;", "processImage", "", "onError", "", "forceCapture", "<init>", "(Lth0/d6$d$a$b;Lwn0/l;Lwn0/l;Z)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/l;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class C2427d extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<String, jn0.h0> processImage;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<Throwable, jn0.h0> onError;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final boolean forceCapture;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C2427d(b overlay, wn0.l<? super String, jn0.h0> processImage, wn0.l<? super Throwable, jn0.h0> onError, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(processImage, "processImage");
                        p013kotlin.jvm.internal.s.k(onError, "onError");
                        this.overlay = overlay;
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z11;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    public final wn0.l<Throwable, jn0.h0> c() {
                        return this.onError;
                    }

                    public final wn0.l<String, jn0.h0> d() {
                        return this.processImage;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$e */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lth0/d6$d$a$a$e;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function0;", "Ljn0/h0;", "onCaptureClicked", "<init>", "(Lth0/d6$d$a$b;Lwn0/a;)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/a;", "()Lwn0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class e extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onCaptureClicked;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(b overlay, wn0.a<jn0.h0> onCaptureClicked) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(onCaptureClicked, "onCaptureClicked");
                        this.overlay = overlay;
                        this.onCaptureClicked = onCaptureClicked;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.a<jn0.h0> b() {
                        return this.onCaptureClicked;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$f */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lth0/d6$d$a$a$f;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function0;", "Ljn0/h0;", "poseHintComplete", "<init>", "(Lth0/d6$d$a$b;Lwn0/a;)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/a;", "()Lwn0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class f extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> poseHintComplete;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(b overlay, wn0.a<jn0.h0> poseHintComplete) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(poseHintComplete, "poseHintComplete");
                        this.overlay = overlay;
                        this.poseHintComplete = poseHintComplete;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.a<jn0.h0> b() {
                        return this.poseHintComplete;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$g */
                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lth0/d6$d$a$a$g;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function1;", "Lzf0/u;", "Ljn0/h0;", "previewReady", "<init>", "(Lth0/d6$d$a$b;Lwn0/l;)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/l;", "()Lwn0/l;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class g extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<zf0.u, jn0.h0> previewReady;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(b overlay, wn0.l<? super zf0.u, jn0.h0> previewReady) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(previewReady, "previewReady");
                        this.overlay = overlay;
                        this.previewReady = previewReady;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.l<zf0.u, jn0.h0> b() {
                        return this.previewReady;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$h */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lth0/d6$d$a$a$h;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "Lkotlin/Function0;", "Ljn0/h0;", "onComplete", "", "imageCaptured", "<init>", "(Lth0/d6$d$a$b;Lwn0/a;Z)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "Lwn0/a;", "c", "()Lwn0/a;", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class h extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean imageCaptured;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(b overlay, wn0.a<jn0.h0> onComplete, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(onComplete, "onComplete");
                        this.overlay = overlay;
                        this.onComplete = onComplete;
                        this.imageCaptured = z11;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    public final wn0.a<jn0.h0> c() {
                        return this.onComplete;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$a$a$i */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lth0/d6$d$a$a$i;", "Lth0/d6$d$a$a;", "Lth0/d6$d$a$b;", "overlay", "", "maxRecordingLengthMs", "<init>", "(Lth0/d6$d$a$b;J)V", "a", "Lth0/d6$d$a$b;", "()Lth0/d6$d$a$b;", "b", "J", "()J", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class i extends AbstractC2425a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final b overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final long maxRecordingLengthMs;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(b overlay, long j11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j11;
                    }

                    @Override // th0.d6.d.a.AbstractC2425a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ AbstractC2425a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX INFO: renamed from: a */
                public abstract b getOverlay();

                private AbstractC2425a() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lth0/d6$d$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "LOOK_LEFT", "LOOK_RIGHT", "FINALIZING", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum b {
                CLEAR,
                CENTER,
                LOOK_LEFT,
                LOOK_RIGHT,
                FINALIZING;

                private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

                public static EnumEntries<b> getEntries() {
                    return $ENTRIES;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, AbstractC2425a mode, StepStyles.SelfieStepStyle selfieStepStyle, boolean z12, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, wn0.l<? super Throwable, jn0.h0> onCameraError, wn0.a<jn0.h0> onPermissionChanged, fg0.a videoCaptureMethod, ej0.a aVar, boolean z13, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, wn0.l<? super zf0.u.b, jn0.h0> onCameraFacingModeSelected, float f11, dg0.a aVar2, zf0.u.b facingMode, boolean z14, boolean z15, wn0.l<? super Boolean, jn0.h0> onFlashSet, a1.b bVar, boolean z16, boolean z17, boolean z18) {
                super(null);
                p013kotlin.jvm.internal.s.k(mode, "mode");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
                p013kotlin.jvm.internal.s.k(onPermissionChanged, "onPermissionChanged");
                p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
                p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
                p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
                p013kotlin.jvm.internal.s.k(onCameraFacingModeSelected, "onCameraFacingModeSelected");
                p013kotlin.jvm.internal.s.k(facingMode, "facingMode");
                p013kotlin.jvm.internal.s.k(onFlashSet, "onFlashSet");
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.realTimeHint = str6;
                this.isAutoCaptureOn = z11;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z12;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z13;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
                this.onCameraFacingModeSelected = onCameraFacingModeSelected;
                this.poseScore = f11;
                this.brightnessInfo = aVar2;
                this.facingMode = facingMode;
                this.isFlashEnabled = z14;
                this.isFlashOn = z15;
                this.onFlashSet = onFlashSet;
                this.pose = bVar;
                this.requestingPermissions = z16;
                this.recordingLocallyRequired = z17;
                this.allowSwitchCamera = z18;
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final ej0.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            /* JADX INFO: renamed from: C, reason: from getter */
            public final boolean getIsAutoCaptureOn() {
                return this.isAutoCaptureOn;
            }

            /* JADX INFO: renamed from: D, reason: from getter */
            public final boolean getIsFlashEnabled() {
                return this.isFlashEnabled;
            }

            /* JADX INFO: renamed from: E, reason: from getter */
            public final boolean getIsFlashOn() {
                return this.isFlashOn;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAllowSwitchCamera() {
                return this.allowSwitchCamera;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getAutoCaptureText() {
                return this.autoCaptureText;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final dg0.a getBrightnessInfo() {
                return this.brightnessInfo;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final bg0.e.a getCamera2ManagerFactoryFactory() {
                return this.camera2ManagerFactoryFactory;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final zf0.y.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCaptureSuccessText() {
                return this.captureSuccessText;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final zf0.u.b getFacingMode() {
                return this.facingMode;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final AbstractC2425a getMode() {
                return this.mode;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> l() {
                return this.onBack;
            }

            public final wn0.l<Throwable, jn0.h0> m() {
                return this.onCameraError;
            }

            public final wn0.l<zf0.u.b, jn0.h0> n() {
                return this.onCameraFacingModeSelected;
            }

            public final wn0.a<jn0.h0> o() {
                return this.onCancel;
            }

            public final wn0.l<Boolean, jn0.h0> p() {
                return this.onFlashSet;
            }

            public final wn0.a<jn0.h0> q() {
                return this.onPermissionChanged;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final a1.b getPose() {
                return this.pose;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getRealTimeHint() {
                return this.realTimeHint;
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX INFO: renamed from: v, reason: from getter */
            public final boolean getRequestingPermissions() {
                return this.requestingPermissions;
            }

            /* JADX INFO: renamed from: w, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final fg0.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0018\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001a\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b!\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u001b\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006("}, d2 = {"Lth0/d6$d$b;", "Lth0/d6$d;", "", "title", "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "onBack", "onCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", "g", "c", DateTokenConverter.CONVERTER_KEY, "h", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lii0/a;", "()Lii0/a;", "Lwn0/a;", "()Lwn0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String start;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final RemoteImage instructionAsset;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onClick;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String title, String prompt, String disclosure, String start, StepStyles.SelfieStepStyle selfieStepStyle, RemoteImage remoteImage, ii0.a navigationState, wn0.a<jn0.h0> onClick, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel) {
                super(null);
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(prompt, "prompt");
                p013kotlin.jvm.internal.s.k(disclosure, "disclosure");
                p013kotlin.jvm.internal.s.k(start, "start");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onClick, "onClick");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.start = start;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.onClick = onClick;
                this.onBack = onBack;
                this.onCancel = onCancel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> d() {
                return this.onBack;
            }

            public final wn0.a<jn0.h0> e() {
                return this.onCancel;
            }

            public final wn0.a<jn0.h0> f() {
                return this.onClick;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getStart() {
                return this.start;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\u0018\u00002\u00020\u0001:\u0003(*$B»\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b$\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b7\u0010<R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b=\u0010<R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b:\u0010@R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\b>\u0010<R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b5\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b/\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\bH\u00106R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bC\u0010I\u001a\u0004\b*\u0010JR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010K\u001a\u0004\b(\u0010LR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bA\u00106¨\u0006M"}, d2 = {"Lth0/d6$d$c;", "Lth0/d6$d;", "", "title", "message", "Lth0/d6$d$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lth0/d6$d$c$a;", "assetOverrides", "", "requireStrictSelfieCapture", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "isAudioRequired", "Lzf0/y$a;", "cameraXControllerFactory", "Lbg0/e$a;", "camera2ManagerFactoryFactory", "recordingLocallyRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lth0/d6$d$c$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lth0/d6$d$c$a;ZLii0/a;Lwn0/a;Lwn0/a;Lwn0/l;Lwn0/a;Lfg0/a;Lej0/a;ZLzf0/y$a;Lbg0/e$a;Z)V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lth0/d6$d$c$b;", "e", "()Lth0/d6$d$c$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lth0/d6$d$c$a;", "()Lth0/d6$d$c$a;", "f", "Z", "l", "()Z", "g", "Lii0/a;", "()Lii0/a;", "h", "Lwn0/a;", "()Lwn0/a;", IntegerTokenConverter.CONVERTER_KEY, "j", "Lwn0/l;", "()Lwn0/l;", "k", "Lfg0/a;", "o", "()Lfg0/a;", "Lej0/a;", "p", "()Lej0/a;", "q", "Lzf0/y$a;", "()Lzf0/y$a;", "Lbg0/e$a;", "()Lbg0/e$a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final b mode;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final AssetOverrides assetOverrides;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final wn0.l<Throwable, jn0.h0> onCameraError;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onPermissionChanged;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            private final fg0.a videoCaptureMethod;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            private final ej0.a webRtcManager;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final boolean isAudioRequired;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            private final zf0.y.a cameraXControllerFactory;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            private final bg0.e.a camera2ManagerFactoryFactory;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            private final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: th0.d6$d$c$a, reason: from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lth0/d6$d$c$a;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "b", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AssetOverrides {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final RemoteImage leftPoseImage;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final RemoteImage rightPoseImage;

                public AssetOverrides(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return p013kotlin.jvm.internal.s.f(this.leftPoseImage, assetOverrides.leftPoseImage) && p013kotlin.jvm.internal.s.f(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lth0/d6$d$c$b;", "", "<init>", "()V", "Lth0/d6$d$c$c;", "a", "()Lth0/d6$d$c$c;", "overlay", "g", IntegerTokenConverter.CONVERTER_KEY, "f", "b", "h", DateTokenConverter.CONVERTER_KEY, "e", "c", "Lth0/d6$d$c$b$a;", "Lth0/d6$d$c$b$b;", "Lth0/d6$d$c$b$c;", "Lth0/d6$d$c$b$d;", "Lth0/d6$d$c$b$e;", "Lth0/d6$d$c$b$f;", "Lth0/d6$d$c$b$g;", "Lth0/d6$d$c$b$h;", "Lth0/d6$d$c$b$i;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class b {

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lth0/d6$d$c$b$a;", "Lth0/d6$d$c$b;", "Lth0/d6$d$c$c;", "overlay", "", "showProgress", "<init>", "(Lth0/d6$d$c$c;Z)V", "a", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "b", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class a extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(EnumC2431c overlay, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$c$b$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lth0/d6$d$c$b$b;", "Lth0/d6$d$c$b;", "", "countDown", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lth0/d6$d$c$c;", "overlay", "showProgress", "Lkotlin/Function1;", "", "Ljn0/h0;", "onError", "<init>", "(IZJLth0/d6$d$c$c;ZLwn0/l;)V", "a", "I", "b", "()I", "Z", "e", "()Z", "c", "J", "()J", DateTokenConverter.CONVERTER_KEY, "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "f", "Lwn0/l;", "()Lwn0/l;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class C2428b extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final int countDown;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<Throwable, jn0.h0> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C2428b(int i11, boolean z11, long j11, EnumC2431c overlay, boolean z12, wn0.l<? super Throwable, jn0.h0> onError) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        p013kotlin.jvm.internal.s.k(onError, "onError");
                        this.countDown = i11;
                        this.recordLocalVideo = z11;
                        this.maxRecordingLengthMs = j11;
                        this.overlay = overlay;
                        this.showProgress = z12;
                        this.onError = onError;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    public final wn0.l<Throwable, jn0.h0> d() {
                        return this.onError;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$c$b$c, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lth0/d6$d$c$b$c;", "Lth0/d6$d$c$b;", "Lkotlin/Function1;", "Ljava/io/File;", "Ljn0/h0;", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "Lth0/d6$d$c$c;", "overlay", "showProgress", "<init>", "(Lwn0/l;Lwn0/a;ZLth0/d6$d$c$c;Z)V", "a", "Lwn0/l;", "b", "()Lwn0/l;", "Lwn0/a;", "c", "()Lwn0/a;", "Z", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class C2429c extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<File, jn0.h0> finalizeVideo;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onAnimationComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean startFinalize;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C2429c(wn0.l<? super File, jn0.h0> finalizeVideo, wn0.a<jn0.h0> onAnimationComplete, boolean z11, EnumC2431c overlay, boolean z12) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(finalizeVideo, "finalizeVideo");
                        p013kotlin.jvm.internal.s.k(onAnimationComplete, "onAnimationComplete");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z11;
                        this.overlay = overlay;
                        this.showProgress = z12;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.l<File, jn0.h0> b() {
                        return this.finalizeVideo;
                    }

                    public final wn0.a<jn0.h0> c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: th0.d6$d$c$b$d, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lth0/d6$d$c$b$d;", "Lth0/d6$d$c$b;", "Lkotlin/Function1;", "", "Ljn0/h0;", "processImage", "", "onError", "", "forceCapture", "Lth0/d6$d$c$c;", "overlay", "showProgress", "<init>", "(Lwn0/l;Lwn0/l;ZLth0/d6$d$c$c;Z)V", "a", "Lwn0/l;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/l;", "b", "c", "Z", "()Z", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "e", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class C2430d extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<String, jn0.h0> processImage;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<Throwable, jn0.h0> onError;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean forceCapture;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    public /* synthetic */ C2430d(wn0.l lVar, wn0.l lVar2, boolean z11, EnumC2431c enumC2431c, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                        this(lVar, lVar2, (i11 & 4) != 0 ? false : z11, enumC2431c, z12);
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    public final wn0.l<Throwable, jn0.h0> c() {
                        return this.onError;
                    }

                    public final wn0.l<String, jn0.h0> d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C2430d(wn0.l<? super String, jn0.h0> processImage, wn0.l<? super Throwable, jn0.h0> onError, boolean z11, EnumC2431c overlay, boolean z12) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(processImage, "processImage");
                        p013kotlin.jvm.internal.s.k(onError, "onError");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z11;
                        this.overlay = overlay;
                        this.showProgress = z12;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lth0/d6$d$c$b$e;", "Lth0/d6$d$c$b;", "Lkotlin/Function0;", "Ljn0/h0;", "onCaptureClicked", "Lth0/d6$d$c$c;", "overlay", "", "showProgress", "<init>", "(Lwn0/a;Lth0/d6$d$c$c;Z)V", "a", "Lwn0/a;", "b", "()Lwn0/a;", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class e extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onCaptureClicked;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(wn0.a<jn0.h0> onCaptureClicked, EnumC2431c overlay, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(onCaptureClicked, "onCaptureClicked");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.a<jn0.h0> b() {
                        return this.onCaptureClicked;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lth0/d6$d$c$b$f;", "Lth0/d6$d$c$b;", "Lkotlin/Function0;", "Ljn0/h0;", "poseHintComplete", "Lth0/d6$d$c$c;", "overlay", "", "showProgress", "<init>", "(Lwn0/a;Lth0/d6$d$c$c;Z)V", "a", "Lwn0/a;", "b", "()Lwn0/a;", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class f extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> poseHintComplete;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(wn0.a<jn0.h0> poseHintComplete, EnumC2431c overlay, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(poseHintComplete, "poseHintComplete");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.a<jn0.h0> b() {
                        return this.poseHintComplete;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lth0/d6$d$c$b$g;", "Lth0/d6$d$c$b;", "Lkotlin/Function1;", "Lzf0/u;", "Ljn0/h0;", "previewReady", "Lth0/d6$d$c$c;", "overlay", "", "showProgress", "<init>", "(Lwn0/l;Lth0/d6$d$c$c;Z)V", "a", "Lwn0/l;", "b", "()Lwn0/l;", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class g extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.l<zf0.u, jn0.h0> previewReady;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(wn0.l<? super zf0.u, jn0.h0> previewReady, EnumC2431c overlay, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(previewReady, "previewReady");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.previewReady = previewReady;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    public final wn0.l<zf0.u, jn0.h0> b() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lth0/d6$d$c$b$h;", "Lth0/d6$d$c$b;", "Lkotlin/Function0;", "Ljn0/h0;", "onComplete", "", "imageCaptured", "Lth0/d6$d$c$c;", "overlay", "showProgress", "<init>", "(Lwn0/a;ZLth0/d6$d$c$c;Z)V", "a", "Lwn0/a;", "c", "()Lwn0/a;", "b", "Z", "()Z", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", DateTokenConverter.CONVERTER_KEY, "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class h extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final wn0.a<jn0.h0> onComplete;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final boolean imageCaptured;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(wn0.a<jn0.h0> onComplete, boolean z11, EnumC2431c overlay, boolean z12) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(onComplete, "onComplete");
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z11;
                        this.overlay = overlay;
                        this.showProgress = z12;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    public final wn0.a<jn0.h0> c() {
                        return this.onComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lth0/d6$d$c$b$i;", "Lth0/d6$d$c$b;", "Lth0/d6$d$c$c;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lth0/d6$d$c$c;JZ)V", "a", "Lth0/d6$d$c$c;", "()Lth0/d6$d$c$c;", "b", "J", "()J", "c", "Z", "getShowProgress", "()Z", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class i extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final EnumC2431c overlay;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    private final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(EnumC2431c overlay, long j11, boolean z11) {
                        super(null);
                        p013kotlin.jvm.internal.s.k(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j11;
                        this.showProgress = z11;
                    }

                    @Override // th0.d6.d.c.b
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC2431c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX INFO: renamed from: a */
                public abstract EnumC2431c getOverlay();

                private b() {
                }
            }

            /* JADX INFO: renamed from: th0.d6$d$c$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lth0/d6$d$c$c;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "CENTER_COMPLETE", "LOOK_LEFT_HINT", "LOOK_LEFT", "LOOK_LEFT_COMPLETE", "LOOK_RIGHT_HINT", "LOOK_RIGHT", "LOOK_RIGHT_COMPLETE", "FINALIZING", "COMPLETE_WITH_CAPTURE", "COMPLETE", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum EnumC2431c {
                CLEAR,
                CENTER,
                CENTER_COMPLETE,
                LOOK_LEFT_HINT,
                LOOK_LEFT,
                LOOK_LEFT_COMPLETE,
                LOOK_RIGHT_HINT,
                LOOK_RIGHT,
                LOOK_RIGHT_COMPLETE,
                FINALIZING,
                COMPLETE_WITH_CAPTURE,
                COMPLETE;

                private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

                public static EnumEntries<EnumC2431c> getEntries() {
                    return $ENTRIES;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, String str2, b mode, StepStyles.SelfieStepStyle selfieStepStyle, AssetOverrides assetOverrides, boolean z11, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, wn0.l<? super Throwable, jn0.h0> onCameraError, wn0.a<jn0.h0> onPermissionChanged, fg0.a videoCaptureMethod, ej0.a aVar, boolean z12, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, boolean z13) {
                super(null);
                p013kotlin.jvm.internal.s.k(mode, "mode");
                p013kotlin.jvm.internal.s.k(assetOverrides, "assetOverrides");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
                p013kotlin.jvm.internal.s.k(onPermissionChanged, "onPermissionChanged");
                p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
                p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
                p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
                this.title = str;
                this.message = str2;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z11;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = aVar;
                this.isAudioRequired = z12;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
                this.recordingLocallyRequired = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final bg0.e.a getCamera2ManagerFactoryFactory() {
                return this.camera2ManagerFactoryFactory;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final zf0.y.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getMode() {
                return this.mode;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> g() {
                return this.onBack;
            }

            public final wn0.l<Throwable, jn0.h0> h() {
                return this.onCameraError;
            }

            public final wn0.a<jn0.h0> i() {
                return this.onCancel;
            }

            public final wn0.a<jn0.h0> j() {
                return this.onPermissionChanged;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final fg0.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final ej0.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        /* JADX INFO: renamed from: th0.d6$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lth0/d6$d$d;", "Lth0/d6$d;", "Lkotlin/Function0;", "Ljn0/h0;", "rendered", "<init>", "(Lwn0/a;)V", "a", "Lwn0/a;", "()Lwn0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2432d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> rendered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2432d(wn0.a<jn0.h0> rendered) {
                super(null);
                p013kotlin.jvm.internal.s.k(rendered, "rendered");
                this.rendered = rendered;
            }

            public final wn0.a<jn0.h0> a() {
                return this.rendered;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0013Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0013\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b\u001f\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u0017\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lth0/d6$d$e;", "Lth0/d6$d;", "Lth0/d6$d$e$a;", "strings", "", "Lth0/a1;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", "<init>", "(Lth0/d6$d$e$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "a", "Lth0/d6$d$e$a;", "g", "()Lth0/d6$d$e$a;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "h", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", DateTokenConverter.CONVERTER_KEY, "Lii0/a;", "()Lii0/a;", "e", "Lwn0/a;", "()Lwn0/a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Strings strings;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<a1> selfies;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onUsePhotos;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onRetakePhotos;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: th0.d6$d$e$a, reason: from toString */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, d2 = {"Lth0/d6$d$e$a;", "", "", "title", "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Strings {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String selfieLabelFront;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final String selfieLabelLeft;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final String selfieLabelRight;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final String submitButton;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final String retakeButton;

                public Strings(String title, String description, String selfieLabelFront, String selfieLabelLeft, String selfieLabelRight, String submitButton, String retakeButton) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    p013kotlin.jvm.internal.s.k(description, "description");
                    p013kotlin.jvm.internal.s.k(selfieLabelFront, "selfieLabelFront");
                    p013kotlin.jvm.internal.s.k(selfieLabelLeft, "selfieLabelLeft");
                    p013kotlin.jvm.internal.s.k(selfieLabelRight, "selfieLabelRight");
                    p013kotlin.jvm.internal.s.k(submitButton, "submitButton");
                    p013kotlin.jvm.internal.s.k(retakeButton, "retakeButton");
                    this.title = title;
                    this.description = description;
                    this.selfieLabelFront = selfieLabelFront;
                    this.selfieLabelLeft = selfieLabelLeft;
                    this.selfieLabelRight = selfieLabelRight;
                    this.submitButton = submitButton;
                    this.retakeButton = retakeButton;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getRetakeButton() {
                    return this.retakeButton;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return p013kotlin.jvm.internal.s.f(this.title, strings.title) && p013kotlin.jvm.internal.s.f(this.description, strings.description) && p013kotlin.jvm.internal.s.f(this.selfieLabelFront, strings.selfieLabelFront) && p013kotlin.jvm.internal.s.f(this.selfieLabelLeft, strings.selfieLabelLeft) && p013kotlin.jvm.internal.s.f(this.selfieLabelRight, strings.selfieLabelRight) && p013kotlin.jvm.internal.s.f(this.submitButton, strings.submitButton) && p013kotlin.jvm.internal.s.f(this.retakeButton, strings.retakeButton);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final String getSubmitButton() {
                    return this.submitButton;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(Strings strings, List<? extends a1> selfies, StepStyles.SelfieStepStyle selfieStepStyle, ii0.a navigationState, wn0.a<jn0.h0> onUsePhotos, wn0.a<jn0.h0> onRetakePhotos, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel) {
                super(null);
                p013kotlin.jvm.internal.s.k(strings, "strings");
                p013kotlin.jvm.internal.s.k(selfies, "selfies");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onUsePhotos, "onUsePhotos");
                p013kotlin.jvm.internal.s.k(onRetakePhotos, "onRetakePhotos");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                this.strings = strings;
                this.selfies = selfies;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = onUsePhotos;
                this.onRetakePhotos = onRetakePhotos;
                this.onBack = onBack;
                this.onCancel = onCancel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> b() {
                return this.onBack;
            }

            public final wn0.a<jn0.h0> c() {
                return this.onCancel;
            }

            public final wn0.a<jn0.h0> d() {
                return this.onRetakePhotos;
            }

            public final wn0.a<jn0.h0> e() {
                return this.onUsePhotos;
            }

            public final List<a1> f() {
                return this.selfies;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Strings getStrings() {
                return this.strings;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001c\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b\u0013\u0010&¨\u0006'"}, d2 = {"Lth0/d6$d$f;", "Lth0/d6$d;", "", "title", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lii0/a;Lwn0/a;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "Lii0/a;", "()Lii0/a;", "Lwn0/a;", "()Lwn0/a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final RemoteImage customLoadingAsset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String title, String description, PendingPageTextPosition pendingPageTextVerticalPosition, StepStyles.SelfieStepStyle selfieStepStyle, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, RemoteImage remoteImage) {
                super(null);
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(description, "description");
                p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                this.title = title;
                this.description = description;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.customLoadingAsset = remoteImage;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> d() {
                return this.onBack;
            }

            public final wn0.a<jn0.h0> e() {
                return this.onCancel;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f113843c;

        static {
            int[] iArr = new int[a1.b.values().length];
            try {
                iArr[a1.b.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.b.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.b.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113841a = iArr;
            int[] iArr2 = new int[h1.values().length];
            try {
                iArr2[h1.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h1.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h1.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f113842b = iArr2;
            int[] iArr3 = new int[dg0.b.values().length];
            try {
                iArr3[dg0.b.FaceNotCentered.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[dg0.b.FaceTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[dg0.b.FaceTooFar.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[dg0.b.MultipleFaces.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[dg0.b.IncompleteFace.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[dg0.b.FaceNotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[dg0.b.IncorrectPose.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[dg0.b.FaceDetectionUnsupported.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[dg0.b.Other.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            f113843c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", f = "SelfieWorkflow.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113844n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return d6.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113844n;
            if (i11 == 0) {
                jn0.t.b(obj);
                zf0.l lVar = zf0.l.f128227a;
                Context context = d6.this.applicationContext;
                this.f113844n = 1;
                if (lVar.b(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            ej0.a aVar = d6.this.webRtcManager;
            if (aVar != null) {
                aVar.d();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", f = "SelfieWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113846n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113847o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d6 f113848p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f113847o = aVar;
            this.f113848p = d6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(d6 d6Var, y20.r.c cVar) {
            d6Var.s3(cVar);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f113847o, this.f113848p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113846n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super Input, x1, ? extends c>> hVarC = this.f113847o.c();
            final d6 d6Var = this.f113848p;
            hVarC.b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.e6
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return d6.g.b(d6Var, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$2", f = "SelfieWorkflow.kt", i = {}, l = {1208}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113849n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113850o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d6 f113851p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f113850o = aVar;
            this.f113851p = d6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(y20.r.c cVar) {
            Object objC = cVar.c();
            x1.Capture capture = objC instanceof x1.Capture ? (x1.Capture) objC : null;
            if (capture == null) {
                return jn0.h0.f84049a;
            }
            cVar.e(capture.s((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : BitmapDescriptorFactory.HUE_RED, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : false, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture.flashState : x1.g.ReadyToCapture));
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f113850o, this.f113851p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113849n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f113849n = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f113850o.c().b(y20.z.d(this.f113851p, null, new wn0.l() { // from class: th0.f6
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return d6.h.b((y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", f = "SelfieWorkflow.kt", i = {}, l = {1222}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113852n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113853o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d6 f113854p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f113853o = aVar;
            this.f113854p = d6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(y20.r.c cVar) {
            Object objC = cVar.c();
            x1.Capture capture = objC instanceof x1.Capture ? (x1.Capture) objC : null;
            if (capture == null) {
                return jn0.h0.f84049a;
            }
            cVar.e(capture.s((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : BitmapDescriptorFactory.HUE_RED, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : false, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture.flashState : x1.g.Enabled));
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f113853o, this.f113854p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113852n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f113852n = 1;
                if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f113853o.c().b(y20.z.d(this.f113854p, null, new wn0.l() { // from class: th0.g6
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return d6.i.b((y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", f = "SelfieWorkflow.kt", i = {}, l = {911}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113855n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113856o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d6 f113857p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ x1.CountdownToCapture f113858q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Input f113859r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, x1.CountdownToCapture countdownToCapture, Input input, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f113856o = aVar;
            this.f113857p = d6Var;
            this.f113858q = countdownToCapture;
            this.f113859r = input;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(x1.CountdownToCapture countdownToCapture, Input input, y20.r.c cVar) {
            Object objC = cVar.c();
            x1.CountdownToCapture countdownToCapture2 = objC instanceof x1.CountdownToCapture ? (x1.CountdownToCapture) objC : null;
            if (countdownToCapture2 == null) {
                return jn0.h0.f84049a;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown > 1) {
                cVar.e(countdownToCapture2.s((8188 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (8188 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (8188 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture2.poseScore : BitmapDescriptorFactory.HUE_RED, (8188 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (8188 & 128) != 0 ? countdownToCapture2.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture2.backState : null, (8188 & 512) != 0 ? countdownToCapture2.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture2.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture2.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture2.isFlashEnabled : false));
            } else {
                cVar.e(new x1.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), null, countdownToCapture2.g(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), t6.j(cVar, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, 8264, null));
            }
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new j(this.f113856o, this.f113857p, this.f113858q, this.f113859r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113855n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f113855n = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            y20.h<y20.r<? super Input, x1, ? extends c>> hVarC = this.f113856o.c();
            d6 d6Var = this.f113857p;
            final x1.CountdownToCapture countdownToCapture = this.f113858q;
            final Input input = this.f113859r;
            hVarC.b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.h6
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return d6.j.b(countdownToCapture, input, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", f = "SelfieWorkflow.kt", i = {}, l = {1002}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113860n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113861o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d6 f113862p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f113861o = aVar;
            this.f113862p = d6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(y20.r.c cVar) {
            Object objC = cVar.c();
            x1.CountdownToManualCapture countdownToManualCapture = objC instanceof x1.CountdownToManualCapture ? (x1.CountdownToManualCapture) objC : null;
            if (countdownToManualCapture == null) {
                return jn0.h0.f84049a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                cVar.e(x1.CountdownToManualCapture.u(countdownToManualCapture, countDown - 1, countdownToManualCapture.getSelfieError(), null, null, 0L, false, 0L, null, null, null, false, 2044, null));
            }
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new k(this.f113861o, this.f113862p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f113860n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f113860n = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f113861o.c().b(y20.z.d(this.f113862p, null, new wn0.l() { // from class: th0.i6
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return d6.k.b((y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", f = "SelfieWorkflow.kt", i = {}, l = {1684}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113863n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.j0 f113864o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, x1, c, Object>.a f113865p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ d6 f113866q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(p013kotlin.jvm.internal.j0 j0Var, y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, d6 d6Var, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f113864o = j0Var;
            this.f113865p = aVar;
            this.f113866q = d6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(p013kotlin.jvm.internal.j0 j0Var, y20.r.c cVar) {
            Parcelable parcelable = (x1) cVar.c();
            if ((parcelable instanceof a0) && ((a0) parcelable).e()) {
                cVar.e(parcelable);
                j0Var.f86523a = false;
            }
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new l(this.f113864o, this.f113865p, this.f113866q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f113863n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
            L1a:
                kotlin.jvm.internal.j0 r6 = r5.f113864o
                boolean r6 = r6.f86523a
                if (r6 == 0) goto L43
                r5.f113863n = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                y20.k<th0.d6$b, th0.x1, th0.d6$c, java.lang.Object>$a r6 = r5.f113865p
                y20.h r6 = r6.c()
                th0.d6 r1 = r5.f113866q
                kotlin.jvm.internal.j0 r3 = r5.f113864o
                th0.j6 r4 = new th0.j6
                r4.<init>()
                r3 = 0
                y20.r r1 = y20.w.g(r1, r3, r4, r2, r3)
                r6.b(r1)
                goto L1a
            L43:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: th0.d6.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public d6(Context applicationContext, vh0.c.a submitVerificationWorker, dj0.b.a webRtcWorkerFactory, b1.b selfieAnalyzeWorker, oh0.c1 permissionRequestWorkflow, wh0.j localVideoCaptureRenderer, zf0.y.a cameraXControllerFactory, bg0.e.a camera2ManagerFactoryFactory, eg0.a cameraStatsManager, ii0.b navigationStateManager, ei0.c externalEventLogger) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(submitVerificationWorker, "submitVerificationWorker");
        p013kotlin.jvm.internal.s.k(webRtcWorkerFactory, "webRtcWorkerFactory");
        p013kotlin.jvm.internal.s.k(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkflow, "permissionRequestWorkflow");
        p013kotlin.jvm.internal.s.k(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        p013kotlin.jvm.internal.s.k(cameraXControllerFactory, "cameraXControllerFactory");
        p013kotlin.jvm.internal.s.k(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        p013kotlin.jvm.internal.s.k(cameraStatsManager, "cameraStatsManager");
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        p013kotlin.jvm.internal.s.k(externalEventLogger, "externalEventLogger");
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.webRtcManager = ej0.c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A1(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A2(b1.c cVar, d6 d6Var, y20.k.a aVar, x1.StartCaptureFaceDetected startCaptureFaceDetected, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (!(cVar instanceof b1.c.a)) {
            if (cVar instanceof b1.c.b) {
                d6Var.p3(aVar, ((b1.c.b) cVar).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
            } else {
                if (!(cVar instanceof b1.c.C2421c)) {
                    throw new NoWhenBranchMatchedException();
                }
                b1.c.C2421c c2421c = (b1.c.C2421c) cVar;
                dg0.b bVar = c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String();
                List<a1.b> listG = startCaptureFaceDetected.g();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                zf0.u cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.e(new x1.StartCapture(false, bVar, c2421c.getPoseScore(), c2421c.getBrightnessInfo(), listG, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, t6.j(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), 65, null));
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 B1(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r B2(d6 d6Var, final x1.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, jn0.h0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.z4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.C2(startCaptureFaceDetected, input, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C1(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C2(x1.StartCaptureFaceDetected startCaptureFaceDetected, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (!(action.c() instanceof x1.StartCaptureFaceDetected)) {
            return jn0.h0.f84049a;
        }
        List<a1.b> listG = startCaptureFaceDetected.g();
        action.e(new x1.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listG, t6.j(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), 2, null));
        return jn0.h0.f84049a;
    }

    private final d D1(final Input renderProps, x1.CountdownToManualCapture renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        d.c.EnumC2431c enumC2431c;
        final x1.CountdownToManualCapture countdownToManualCapture;
        d.c.b c2428b;
        final a1.b bVar = (a1.b) p013kotlin.collections.v.o0(renderState.g());
        int i11 = e.f113841a[bVar.ordinal()];
        if (i11 == 1) {
            enumC2431c = d.c.EnumC2431c.LOOK_LEFT;
        } else if (i11 == 2) {
            enumC2431c = d.c.EnumC2431c.LOOK_RIGHT;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            enumC2431c = d.c.EnumC2431c.CENTER;
        }
        d.c.EnumC2431c enumC2431c2 = enumC2431c;
        context.a("countdown_to_manual_capture_" + renderState.getCountDown(), new k(context, this, null));
        dg0.b selfieError = renderState.getSelfieError();
        String strU3 = selfieError != null ? u3(selfieError, renderProps.getStrings(), renderState.i()) : null;
        String selfieHintCenterFace = strU3 == null ? renderProps.getStrings().getSelfieHintCenterFace() : strU3;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            countdownToManualCapture = renderState;
            c2428b = new d.c.b.C2430d(new wn0.l() { // from class: th0.n4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.E1(bVar, context, this, countdownToManualCapture, (String) obj);
                }
            }, new wn0.l() { // from class: th0.y4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.G1(this.f114480a, context, (Throwable) obj);
                }
            }, true, enumC2431c2, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        } else {
            countdownToManualCapture = renderState;
            c2428b = new d.c.b.C2428b(countdownToManualCapture.getCountDown(), w3(renderProps) == fg0.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), enumC2431c2, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a), new wn0.l() { // from class: th0.j5
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.H1(context, (Throwable) obj);
                }
            });
        }
        return j2.e(renderProps, context, countdownToManualCapture.i(), capturePageTitle, (251658240 & 16) != 0 ? null : selfieHintCenterFace, strU3, countdownToManualCapture.getAutoCaptureSupported(), c2428b, t6.x(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new wn0.a() { // from class: th0.u5
            @Override // wn0.a
            public final Object invoke() {
                return d6.I1(context, this);
            }
        }, new wn0.a() { // from class: th0.c6
            @Override // wn0.a
            public final Object invoke() {
                return d6.J1(this.f113612a, context);
            }
        }, t6.l(context), new wn0.a() { // from class: th0.l2
            @Override // wn0.a
            public final Object invoke() {
                return d6.K1(this.f113967a, context, renderProps);
            }
        }, w3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, countdownToManualCapture.getCameraFacingMode(), countdownToManualCapture.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E1(a1.b bVar, y20.k.a aVar, final d6 d6Var, final x1.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        p013kotlin.jvm.internal.s.k(absolutePath, "absolutePath");
        final a1.SelfieImage selfieImage = new a1.SelfieImage(absolutePath, a1.a.MANUAL, bVar, System.currentTimeMillis());
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.b5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.F1(this.f113584a, countdownToManualCapture, selfieImage, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F1(d6 d6Var, x1.CountdownToManualCapture countdownToManualCapture, a1.SelfieImage selfieImage, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(d6Var.f1(action, countdownToManualCapture, selfieImage));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F2(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 G1(d6 d6Var, y20.k.a aVar, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        d6Var.p3(aVar, it);
        return jn0.h0.f84049a;
    }

    private final d G2(Input renderProps, x1.n renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        y20.w.l(context, this.submitVerificationWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromComponent(), renderProps.getFromStep(), renderProps.getSelfieType(), renderProps.getFieldKeySelfie(), renderState.q(), renderState.getWebRtcObjectId(), renderState.getCameraProperties(), renderState.getStartSelfieTimestamp()), p013kotlin.jvm.internal.o0.o(vh0.c.class), "", new wn0.l() { // from class: th0.g4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.H2(this.f113901a, context, (vh0.c.b) obj);
            }
        });
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.a aVar = new wn0.a() { // from class: th0.h4
            @Override // wn0.a
            public final Object invoke() {
                return d6.K2(this.f113912a, context);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: th0.i4
            @Override // wn0.a
            public final Object invoke() {
                return d6.L2(this.f113924a, context);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new d.f(processingTitle, processingDescription, pendingPageTextVerticalPosition, styles, aVarB, aVar, aVar2, recordPage != null ? recordPage.getLoadingPictograph() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H1(y20.k.a aVar, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        t6.l(aVar).invoke(it);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r H2(final d6 d6Var, final y20.k.a aVar, final vh0.c.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof vh0.c.b.C2553b) {
            return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.v4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.I2(this.f114201a, aVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof vh0.c.b.Error) {
            return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.w4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.J2(this.f114307a, aVar, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I1(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I2(d6 d6Var, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        d6Var.q3(aVar, c.d.f113702a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 J1(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 J2(d6 d6Var, y20.k.a aVar, vh0.c.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        d6Var.q3(aVar, new c.Error(((vh0.c.b.Error) bVar).getCause()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 K1(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 K2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    private final d L1(final Input renderProps, x1.f renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        final x1.f fVar;
        ej0.a aVar = this.webRtcManager;
        if (aVar != null) {
            fVar = renderState;
            aVar.b(new wn0.l() { // from class: th0.a4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.M1(context, this, fVar, (String) obj);
                }
            });
        } else {
            fVar = renderState;
        }
        return j2.e(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (251658240 & 16) != 0 ? null : null, null, false, new d.c.b.h(new wn0.a() { // from class: th0.b4
            @Override // wn0.a
            public final Object invoke() {
                return d6.O1();
            }
        }, false, d.c.EnumC2431c.FINALIZING, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a)), t6.x(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new wn0.a() { // from class: th0.d4
            @Override // wn0.a
            public final Object invoke() {
                return d6.P1(context, this);
            }
        }, new wn0.a() { // from class: th0.e4
            @Override // wn0.a
            public final Object invoke() {
                return d6.Q1(this.f113875a, context);
            }
        }, t6.l(context), new wn0.a() { // from class: th0.f4
            @Override // wn0.a
            public final Object invoke() {
                return d6.R1(this.f113890a, context, renderProps);
            }
        }, w3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, fVar.getCameraFacingMode(), false, (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M1(y20.k.a aVar, final d6 d6Var, final x1.f fVar, final String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.e5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.N1(fVar, it, d6Var, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final Object M2(final Input renderProps, final x1.WaitForCameraFeed renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        boolean hasRequestedCameraPermissions = renderState.getHasRequestedCameraPermissions();
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && e1(renderProps) && yh0.f.e(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        d dVarE = j2.e(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (251658240 & 16) != 0 ? null : null, null, false, new d.c.b.g(new wn0.l() { // from class: th0.j4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.R2(context, this, renderProps, renderState, jCurrentTimeMillis, (zf0.u) obj);
            }
        }, d.c.EnumC2431c.CLEAR, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a)), t6.x(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new wn0.a() { // from class: th0.k4
            @Override // wn0.a
            public final Object invoke() {
                return d6.T2(context, this);
            }
        }, new wn0.a() { // from class: th0.l4
            @Override // wn0.a
            public final Object invoke() {
                return d6.U2(this.f113972a, context);
            }
        }, t6.l(context), new wn0.a() { // from class: th0.m4
            @Override // wn0.a
            public final Object invoke() {
                return d6.V2(this.f114027a, context, renderProps);
            }
        }, w3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : !hasRequestedCameraPermissions || z11, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
        if (!hasRequestedCameraPermissions) {
            oh0.d0 d0Var = oh0.d0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle != null ? cameraPermissionsTitle : "";
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(qh0.e.D);
                p013kotlin.jvm.internal.s.j(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(qh0.e.C, yh0.f.b(context2));
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            return oh0.l1.d(dVarE, context, true, d0Var, (19976 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new wn0.l() { // from class: th0.o4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.N2(this.f114069a, renderState, renderProps, context, (oh0.c1.Output) obj);
                }
            });
        }
        if (!z11) {
            return dVarE;
        }
        oh0.d0 d0Var2 = oh0.d0.RecordAudio;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(qh0.e.M);
            p013kotlin.jvm.internal.s.j(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string2 = context3.getString(qh0.e.L, yh0.f.b(context3));
        p013kotlin.jvm.internal.s.j(string2, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        oh0.c1 c1Var = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        return oh0.l1.d(dVarE, context, true, d0Var2, (19976 & 8) != 0 ? false : false, microphonePermissionsTitle != null ? microphonePermissionsTitle : "", microphonePermissionsRationale, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, c1Var, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new wn0.l() { // from class: th0.p4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.P2(this.f114088a, renderState, renderProps, context, (oh0.c1.Output) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N1(x1.f fVar, String str, d6 d6Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.q(fVar.q(), str, fVar.getCameraProperties(), fVar.getStartSelfieTimestamp(), t6.j(action, false), fVar.getCameraFacingMode()));
        d6Var.webRtcManager.d();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r N2(final d6 d6Var, final x1.WaitForCameraFeed waitForCameraFeed, final Input input, final y20.k.a aVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.n5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.O2(it, waitForCameraFeed, input, d6Var, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O1() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O2(oh0.c1.Output aVar, x1.WaitForCameraFeed waitForCameraFeed, Input input, d6 d6Var, y20.k.a aVar2, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (aVar.getPermissionState().getResult() == oh0.g1.PermissionGranted) {
            action.e(x1.WaitForCameraFeed.u(waitForCameraFeed, true, false, null, null, null, false, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new x1.j(null, null, 2, null));
        } else if (input.getBackStepEnabled()) {
            d6Var.q3(aVar2, c.a.f113699a);
        } else {
            d6Var.q3(aVar2, new c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P1(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r P2(final d6 d6Var, final x1.WaitForCameraFeed waitForCameraFeed, final Input input, final y20.k.a aVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.c5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.Q2(it, waitForCameraFeed, input, d6Var, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q1(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q2(oh0.c1.Output aVar, x1.WaitForCameraFeed waitForCameraFeed, Input input, d6 d6Var, y20.k.a aVar2, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (aVar.getPermissionState().getResult() == oh0.g1.PermissionGranted) {
            action.e(x1.WaitForCameraFeed.u(waitForCameraFeed, false, true, null, null, null, false, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new x1.j(null, null, 2, null));
        } else if (input.getBackStepEnabled()) {
            d6Var.q3(aVar2, c.a.f113699a);
        } else {
            d6Var.q3(aVar2, new c.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R1(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R2(y20.k.a aVar, final d6 d6Var, final Input input, final x1.WaitForCameraFeed waitForCameraFeed, final long j11, final zf0.u cameraProperties) {
        p013kotlin.jvm.internal.s.k(cameraProperties, "cameraProperties");
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.d5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.S2(this.f113629a, input, waitForCameraFeed, cameraProperties, j11, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final d S1(final Input renderProps, final x1.RestartCamera renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        ej0.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.d();
        }
        return new d.C2432d(new wn0.a() { // from class: th0.c4
            @Override // wn0.a
            public final Object invoke() {
                return d6.T1(context, this, renderProps, renderState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S2(d6 d6Var, Input input, x1.WaitForCameraFeed waitForCameraFeed, zf0.u uVar, long j11, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (d6Var.w3(input) == fg0.a.Stream) {
            action.e(new x1.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), uVar, j11, t6.j(action, false), waitForCameraFeed.g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            action.e(new x1.StartCapture(false, null, BitmapDescriptorFactory.HUE_RED, null, waitForCameraFeed.g(), System.currentTimeMillis(), false, j11, uVar, t6.j(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), 67, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T1(y20.k.a aVar, d6 d6Var, final Input input, final x1.RestartCamera restartCamera) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.o5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.U1(input, restartCamera, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U1(Input input, x1.RestartCamera restartCamera, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.WaitForCameraFeed(false, false, t6.j(action, false), input.q(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    private final d V1(final Input renderProps, final x1.i renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(qh0.e.K);
            p013kotlin.jvm.internal.s.j(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(qh0.e.E);
            p013kotlin.jvm.internal.s.j(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(qh0.e.H);
            p013kotlin.jvm.internal.s.j(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(qh0.e.I);
            p013kotlin.jvm.internal.s.j(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(qh0.e.J);
            p013kotlin.jvm.internal.s.j(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(qh0.e.G);
            p013kotlin.jvm.internal.s.j(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(qh0.e.F);
            p013kotlin.jvm.internal.s.j(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new d.e(new d.e.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.s(), renderProps.getStyles(), this.navigationStateManager.b(), new wn0.a() { // from class: th0.i3
            @Override // wn0.a
            public final Object invoke() {
                return d6.W1(context, this, renderState);
            }
        }, new wn0.a() { // from class: th0.j3
            @Override // wn0.a
            public final Object invoke() {
                return d6.Y1(context, this, renderProps, renderState);
            }
        }, new wn0.a() { // from class: th0.k3
            @Override // wn0.a
            public final Object invoke() {
                return d6.a2(context, this);
            }
        }, new wn0.a() { // from class: th0.l3
            @Override // wn0.a
            public final Object invoke() {
                return d6.b2(this.f113970a, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V2(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 W1(y20.k.a aVar, d6 d6Var, final x1.i iVar) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.w5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.X1(iVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final d W2(final Input renderProps, final x1.WaitForWebRtcSetup renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        y20.w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), p013kotlin.jvm.internal.o0.o(dj0.b.class), "", new wn0.l() { // from class: th0.k2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.X2(this.f113947a, renderState, renderProps, context, (dj0.b.AbstractC1237b) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.i iVar = new d.c.b.i(d.c.EnumC2431c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        fg0.a aVarW3 = w3(renderProps);
        ej0.a aVar = this.webRtcManager;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : null, null, false, iVar, t6.x(renderProps), requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.v2
            @Override // wn0.a
            public final Object invoke() {
                return d6.f3(context, this);
            }
        }, new wn0.a() { // from class: th0.g3
            @Override // wn0.a
            public final Object invoke() {
                return d6.g3(this.f113899a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.r3
            @Override // wn0.a
            public final Object invoke() {
                return d6.h3(this.f114124a, context, renderProps);
            }
        }, aVarW3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X1(x1.i iVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.i iVar2 = objC instanceof x1.i ? (x1.i) objC : null;
        if (iVar2 == null) {
            return jn0.h0.f84049a;
        }
        x1.i iVar3 = iVar2;
        action.e(new x1.n(iVar3.q(), iVar3.getWebRtcObjectId(), iVar3.getCameraProperties(), iVar3.getStartSelfieTimestamp(), t6.j(action, true), iVar.getCameraFacingMode()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r X2(final d6 d6Var, final x1.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final y20.k.a aVar, final dj0.b.AbstractC1237b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        final CameraChoices cameraChoicesB = bg0.h.b(d6Var.applicationContext, bg0.k.FRONT);
        if (it instanceof dj0.b.AbstractC1237b.C1238b) {
            return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.r5
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.Y2(this.f114128a, cameraChoicesB, it, waitForWebRtcSetup, input, aVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof dj0.b.AbstractC1237b.Error) {
            return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.s5
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.d3(aVar, d6Var, waitForWebRtcSetup, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y1(y20.k.a aVar, d6 d6Var, final Input input, final x1.i iVar) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.x4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.Z1(input, iVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y2(final d6 d6Var, CameraChoices cameraChoices, dj0.b.AbstractC1237b abstractC1237b, final x1.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final y20.k.a aVar, y20.r.c action) {
        int i11;
        int i12;
        CameraChoice primaryChoice;
        CameraChoice primaryChoice2;
        CameraChoice primaryChoice3;
        Size size;
        CameraChoice primaryChoice4;
        Size size2;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        ej0.a aVar2 = d6Var.webRtcManager;
        if (aVar2 != null) {
            aVar2.i(d6Var.webRtcWorkerFactory.getService());
        }
        ej0.a aVar3 = d6Var.webRtcManager;
        if (aVar3 != null) {
            aVar3.h(d6Var.applicationContext);
        }
        int height = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            height = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i11 = height;
            i12 = width;
        } else {
            i12 = height;
            i11 = width;
        }
        ej0.a aVar4 = d6Var.webRtcManager;
        if (aVar4 != null) {
            dj0.b.AbstractC1237b.C1238b c1238b = (dj0.b.AbstractC1237b.C1238b) abstractC1237b;
            aVar4.f(c1238b.getResult().getUsername(), c1238b.getResult().getCredential(), c1238b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i12, i11, input.getVideoCaptureConfig().getRecordAudio(), new wn0.a() { // from class: th0.y5
                @Override // wn0.a
                public final Object invoke() {
                    return d6.Z2(aVar, d6Var, waitForWebRtcSetup, input);
                }
            }, new wn0.a() { // from class: th0.z5
                @Override // wn0.a
                public final Object invoke() {
                    return d6.b3(aVar, d6Var, waitForWebRtcSetup);
                }
            });
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z1(Input input, x1.i iVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.WaitForCameraFeed(false, false, t6.j(action, false), input.q(), input.getPoseConfigs(), false, iVar.getCameraFacingMode(), false, 163, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z2(y20.k.a aVar, d6 d6Var, final x1.WaitForWebRtcSetup waitForWebRtcSetup, final Input input) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.b6
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.a3(waitForWebRtcSetup, input, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a3(x1.WaitForWebRtcSetup waitForWebRtcSetup, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.StartCapture(false, null, BitmapDescriptorFactory.HUE_RED, null, waitForWebRtcSetup.g(), System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), t6.j(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), 67, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b3(y20.k.a aVar, final d6 d6Var, final x1.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.a6
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.c3(this.f113556a, waitForWebRtcSetup, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final d.b c2(final Input renderProps, final x1.j renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        ii0.a aVarB = this.navigationStateManager.b();
        d2 selfieType = renderProps.getSelfieType();
        RemoteImage selfiePictograph = null;
        if (p013kotlin.jvm.internal.s.f(selfieType, d2.a.f113622a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!p013kotlin.jvm.internal.s.f(selfieType, d2.c.f113624a) && !p013kotlin.jvm.internal.s.f(selfieType, d2.b.f113623a)) {
                throw new NoWhenBranchMatchedException();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new d.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, aVarB, new wn0.a() { // from class: th0.m3
            @Override // wn0.a
            public final Object invoke() {
                return d6.d2(context, this, renderProps, renderState);
            }
        }, new wn0.a() { // from class: th0.n3
            @Override // wn0.a
            public final Object invoke() {
                return d6.f2(context, this);
            }
        }, new wn0.a() { // from class: th0.o3
            @Override // wn0.a
            public final Object invoke() {
                return d6.g2(this.f114067a, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c3(d6 d6Var, x1.WaitForWebRtcSetup waitForWebRtcSetup, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        d6Var.webRtcManager.a();
        action.e(new x1.RestartCamera(false, false, t6.j(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d2(y20.k.a aVar, d6 d6Var, final Input input, final x1.j jVar) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.k5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.e2(input, jVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d3(y20.k.a aVar, final d6 d6Var, final x1.WaitForWebRtcSetup waitForWebRtcSetup, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.x5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.e3(this.f114468a, waitForWebRtcSetup, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final boolean e1(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ej0.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.g()) : null;
        ej0.a aVar2 = this.webRtcManager;
        Object objD = videoCaptureConfig.d(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.e()) : null, this.applicationContext);
        if (jn0.s.e(objD) == null) {
            return ((Boolean) objD).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e2(Input input, x1.j jVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new x1.WaitForCameraFeed(false, false, t6.k(action, false, 1, null), input.q(), input.getPoseConfigs(), false, jVar.getCameraFacingMode(), false, 163, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e3(d6 d6Var, x1.WaitForWebRtcSetup waitForWebRtcSetup, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        ej0.a aVar = d6Var.webRtcManager;
        if (aVar != null) {
            aVar.a();
        }
        action.e(new x1.RestartCamera(false, false, t6.j(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return jn0.h0.f84049a;
    }

    private final <T extends x1 & a0> x1.b f1(y20.r<? super Input, x1, ?>.c cVar, T t11, a1 a1Var) {
        x1 x1VarY;
        z zVar = (z) t11;
        if (zVar.g().size() > 1) {
            z zVar2 = (z) t11;
            T t12 = t11;
            x1VarY = new x1.ShowPoseHint(p013kotlin.collections.v.Q0(t11.q(), a1Var), p013kotlin.collections.v.i0(zVar2.g(), 1), zVar2.getAutoCaptureSupported(), t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t11.getBackState(), cVar.b().getPoseConfigs(), t11.getCameraFacingMode(), zVar2.getIsFlashEnabled());
        } else if (w3(cVar.b()) == fg0.a.Upload) {
            T t13 = t11;
            x1VarY = new x1.FinalizeLocalVideoCapture(p013kotlin.collections.v.Q0(t11.q(), a1Var), 3000L, false, false, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t11.getBackState(), t11.getCameraFacingMode(), 12, null);
        } else if (w3(cVar.b()) == fg0.a.Stream) {
            T t14 = t11;
            x1VarY = new x1.f(p013kotlin.collections.v.Q0(t11.q(), a1Var), t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t11.getBackState(), t11.getCameraFacingMode());
        } else {
            T t15 = t11;
            x1VarY = t6.y(cVar, p013kotlin.collections.v.Q0(t11.q(), a1Var), null, t15.getCameraProperties(), t15.getStartSelfieTimestamp(), t11.getBackState());
        }
        return new x1.b(x1VarY, zVar.i(), t11.getBackState(), t11.getCameraFacingMode(), ((z) t11).getIsFlashEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f3(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g3(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    private final d h1(final Input renderProps, final x1.Capture renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        x1.g flashState;
        String selfieHintCenterFace;
        d.c.EnumC2431c enumC2431c;
        d.c.b aVar;
        final a1.b bVarI = renderState.i();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == x1.g.Disabled ? x1.g.Enabled : renderState.getFlashState();
        } else {
            flashState = x1.g.Disabled;
        }
        if (renderState.j().getAutoCaptureEnabled()) {
            y20.w.l(context, this.selfieAnalyzeWorker.a(bVarI, flashState == x1.g.Disabled || flashState == x1.g.ReadyToCapture), p013kotlin.jvm.internal.o0.o(b1.class), "", new wn0.l() { // from class: th0.p3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.i1(this.f114085a, renderState, context, (b1.c) obj);
                }
            });
        }
        dg0.b selfieError = renderState.getSelfieError();
        String strU3 = selfieError != null ? u3(selfieError, renderProps.getStrings(), renderState.i()) : null;
        if (bVarI == a1.b.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (bVarI == a1.b.Right) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        } else if (renderState.getSelfieError() != null) {
            selfieHintCenterFace = strU3;
        } else {
            selfieHintCenterFace = bVarI == a1.b.Center ? renderProps.getStrings().getSelfieHintCenterFace() : null;
        }
        int i11 = e.f113841a[bVarI.ordinal()];
        if (i11 == 1) {
            enumC2431c = d.c.EnumC2431c.LOOK_LEFT;
        } else if (i11 == 2) {
            enumC2431c = d.c.EnumC2431c.LOOK_RIGHT;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            enumC2431c = d.c.EnumC2431c.CENTER;
        }
        d.c.EnumC2431c enumC2431c2 = enumC2431c;
        if (!renderState.e() || flashState == x1.g.FlashOn || flashState == x1.g.ReadyToCapture) {
            aVar = new d.c.b.a(enumC2431c2, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        } else {
            aVar = new d.c.b.C2430d(new wn0.l() { // from class: th0.q3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.k1(bVarI, context, this, renderState, (String) obj);
                }
            }, new wn0.l() { // from class: th0.s3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.m1(this.f114140a, context, (Throwable) obj);
                }
            }, false, enumC2431c2, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a), 4, null);
        }
        if (!renderState.e()) {
            o3(context);
        }
        x1.g gVar = x1.g.FlashOn;
        if (flashState == gVar) {
            context.a("wait_to_capture_with_flash_on", new h(context, this, null));
        }
        x1.g gVar2 = x1.g.ReadyToCapture;
        if (flashState == gVar2) {
            context.a("turn_off_flash", new i(context, this, null));
        }
        fg0.a aVarW3 = w3(renderProps);
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        ej0.a aVar2 = this.webRtcManager;
        String str = strU3;
        String str2 = selfieHintCenterFace;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : str2, str, renderState.getAutoCaptureSupported(), aVar, t6.x(renderProps), requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.t3
            @Override // wn0.a
            public final Object invoke() {
                return d6.n1(context, this);
            }
        }, new wn0.a() { // from class: th0.u3
            @Override // wn0.a
            public final Object invoke() {
                return d6.o1(this.f114184a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.v3
            @Override // wn0.a
            public final Object invoke() {
                return d6.p1(this.f114198a, context, renderProps);
            }
        }, aVarW3, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : renderState.getFlashState() == gVar || renderState.getFlashState() == gVar2, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : w3(renderProps) == fg0.a.Upload, (251658240 & 134217728) != 0);
    }

    private final d h2(final Input renderProps, final x1.ShowPoseHint renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        h1 h1Var;
        String selfieHintLookLeft;
        d.c.EnumC2431c enumC2431c;
        int i11 = e.f113841a[((a1.b) p013kotlin.collections.v.o0(renderState.g())).ordinal()];
        if (i11 == 1) {
            h1Var = h1.Left;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            h1Var = h1.Right;
        }
        int[] iArr = e.f113842b;
        int i12 = iArr[h1Var.ordinal()];
        if (i12 == 1) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i12 == 2) {
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintLookRight();
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            selfieHintLookLeft = renderProps.getStrings().getSelfieHintPoseNotCentered();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i13 = iArr[h1Var.ordinal()];
        if (i13 == 1) {
            enumC2431c = d.c.EnumC2431c.LOOK_LEFT_HINT;
        } else if (i13 == 2) {
            enumC2431c = d.c.EnumC2431c.LOOK_RIGHT_HINT;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            enumC2431c = d.c.EnumC2431c.CENTER;
        }
        String str = selfieHintLookLeft;
        d.c.b.f fVar = new d.c.b.f(new wn0.a() { // from class: th0.m2
            @Override // wn0.a
            public final Object invoke() {
                return d6.i2(context, this, renderState, renderProps);
            }
        }, enumC2431c, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        fg0.a aVarW3 = w3(renderProps);
        ej0.a aVar = this.webRtcManager;
        d.c.AssetOverrides assetOverridesX = t6.x(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        zf0.y.a aVar2 = this.cameraXControllerFactory;
        bg0.e.a aVar3 = this.camera2ManagerFactoryFactory;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesX, requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.n2
            @Override // wn0.a
            public final Object invoke() {
                return d6.k2(context, this);
            }
        }, new wn0.a() { // from class: th0.o2
            @Override // wn0.a
            public final Object invoke() {
                return d6.l2(this.f114065a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.p2
            @Override // wn0.a
            public final Object invoke() {
                return d6.m2(this.f114082a, context, renderProps);
            }
        }, aVarW3, aVar, recordAudio, aVar2, aVar3, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h3(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r i1(final d6 d6Var, final x1.Capture capture, final y20.k.a aVar, final b1.c output) {
        p013kotlin.jvm.internal.s.k(output, "output");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.t5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.j1(output, d6Var, capture, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i2(y20.k.a aVar, d6 d6Var, final x1.ShowPoseHint showPoseHint, final Input input) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.v5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.j2(showPoseHint, input, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final d i3(final Input renderProps, final x1.q renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.h hVar = new d.c.b.h(new wn0.a() { // from class: th0.w3
            @Override // wn0.a
            public final Object invoke() {
                return d6.j3(context, this, renderState);
            }
        }, false, d.c.EnumC2431c.COMPLETE, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        ej0.a aVar = this.webRtcManager;
        return j2.e(renderProps, context, null, capturePageTitle, (251658240 & 16) != 0 ? null : null, null, false, hVar, t6.x(renderProps), requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.x3
            @Override // wn0.a
            public final Object invoke() {
                return d6.l3(context, this);
            }
        }, new wn0.a() { // from class: th0.y3
            @Override // wn0.a
            public final Object invoke() {
                return d6.m3(this.f114478a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.z3
            @Override // wn0.a
            public final Object invoke() {
                return d6.n3(this.f114499a, context, renderProps);
            }
        }, w3(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), false, (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j1(b1.c cVar, d6 d6Var, x1.Capture capture, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.Capture capture2 = objC instanceof x1.Capture ? (x1.Capture) objC : null;
        if (capture2 == null) {
            return jn0.h0.f84049a;
        }
        if (cVar instanceof b1.c.a) {
            b1.c.a aVar2 = (b1.c.a) cVar;
            if (aVar2.getSelfie() != null) {
                a1 selfie = aVar2.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                action.e(d6Var.f1(action, capture, selfie));
            } else {
                action.e(capture2.s((8191 & 1) != 0 ? capture2.selfieError : null, (8191 & 2) != 0 ? capture2.poseScore : BitmapDescriptorFactory.HUE_RED, (8191 & 4) != 0 ? capture2.brightnessInfo : null, (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture2.flashState : x1.g.FlashOn));
            }
        } else if (cVar instanceof b1.c.C2421c) {
            b1.c.C2421c c2421c = (b1.c.C2421c) cVar;
            if (c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String() == dg0.b.FaceDetectionUnsupported) {
                action.e(capture2.s((8191 & 1) != 0 ? capture2.selfieError : null, (8191 & 2) != 0 ? capture2.poseScore : c2421c.getPoseScore(), (8191 & 4) != 0 ? capture2.brightnessInfo : c2421c.getBrightnessInfo(), (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture2.flashState : null));
            } else {
                action.e(capture2.s((8191 & 1) != 0 ? capture2.selfieError : c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String(), (8191 & 2) != 0 ? capture2.poseScore : c2421c.getPoseScore(), (8191 & 4) != 0 ? capture2.brightnessInfo : c2421c.getBrightnessInfo(), (8191 & 8) != 0 ? capture2.selfies : null, (8191 & 16) != 0 ? capture2.posesNeeded : null, (8191 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture2.autoCaptureSupported : false, (8191 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture2.cameraProperties : null, (8191 & 512) != 0 ? capture2.backState : null, (8191 & 1024) != 0 ? capture2.poseConfigs : null, (8191 & 2048) != 0 ? capture2.cameraFacingMode : null, (8191 & 4096) != 0 ? capture2.isFlashEnabled : false, (8191 & PKIFailureInfo.certRevoked) != 0 ? capture2.flashState : null));
            }
        } else {
            if (!(cVar instanceof b1.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d6Var.p3(aVar, ((b1.c.b) cVar).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j2(x1.ShowPoseHint showPoseHint, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        List<a1.b> listG = showPoseHint.g();
        action.e(new x1.Capture(null, BitmapDescriptorFactory.HUE_RED, null, showPoseHint.q(), listG, System.currentTimeMillis(), showPoseHint.getAutoCaptureSupported(), showPoseHint.getStartSelfieTimestamp(), showPoseHint.getCameraProperties(), t6.j(action, false), input.getPoseConfigs(), showPoseHint.getCameraFacingMode(), showPoseHint.getIsFlashEnabled(), null, 8193, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j3(y20.k.a aVar, d6 d6Var, final x1.q qVar) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.h5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.k3(qVar, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k1(a1.b bVar, y20.k.a aVar, final d6 d6Var, final x1.Capture capture, String absolutePath) {
        p013kotlin.jvm.internal.s.k(absolutePath, "absolutePath");
        final a1.SelfieImage selfieImage = new a1.SelfieImage(absolutePath, a1.a.MANUAL, bVar, System.currentTimeMillis());
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.l5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.l1(this.f113974a, capture, selfieImage, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k3(x1.q qVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(t6.y(action, qVar.q(), qVar.getWebRtcObjectId(), qVar.getCameraProperties(), qVar.getStartSelfieTimestamp(), t6.j(action, false)));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l1(d6 d6Var, x1.Capture capture, a1.SelfieImage selfieImage, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(d6Var.f1(action, capture, selfieImage));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l3(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m1(d6 d6Var, y20.k.a aVar, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        d6Var.p3(aVar, it);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m2(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m3(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n1(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    private final d n2(final Input renderProps, final x1.StartCapture renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        d.c.b aVar;
        d.c.b c2430d;
        if (renderState.j().getAutoCaptureEnabled()) {
            y20.w.l(context, this.selfieAnalyzeWorker.a(a1.b.Center, false), p013kotlin.jvm.internal.o0.o(b1.class), "", new wn0.l() { // from class: th0.q2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.o2(this.f114099a, renderState, renderProps, context, (b1.c) obj);
                }
            });
        }
        final a1.b bVarI = renderState.i();
        boolean zE = renderState.e();
        if (!zE) {
            o3(context);
        }
        d.c.EnumC2431c enumC2431c = d.c.EnumC2431c.CENTER;
        dg0.b selfieError = renderState.getSelfieError();
        String strU3 = selfieError != null ? u3(selfieError, renderProps.getStrings(), renderState.i()) : null;
        String selfieHintTakePhoto = strU3 == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strU3;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (zE) {
            if (e1(renderProps)) {
                aVar = new d.c.b.e(new wn0.a() { // from class: th0.r2
                    @Override // wn0.a
                    public final Object invoke() {
                        return d6.q2(context, this, renderState, renderProps);
                    }
                }, enumC2431c, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
            } else {
                c2430d = new d.c.b.C2430d(new wn0.l() { // from class: th0.s2
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return d6.s2(bVarI, context, this, renderState, (String) obj);
                    }
                }, new wn0.l() { // from class: th0.t2
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return d6.u2(this.f114149a, context, (Throwable) obj);
                    }
                }, false, enumC2431c, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a), 4, null);
            }
            boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
            ii0.a aVarB = this.navigationStateManager.b();
            wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
            fg0.a aVarW3 = w3(renderProps);
            ej0.a aVar2 = this.webRtcManager;
            return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : selfieHintTakePhoto, strU3, renderState.getAutoCaptureSupported(), c2430d, t6.x(renderProps), requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.u2
                @Override // wn0.a
                public final Object invoke() {
                    return d6.v2(context, this);
                }
            }, new wn0.a() { // from class: th0.w2
                @Override // wn0.a
                public final Object invoke() {
                    return d6.w2(this.f114302a, context);
                }
            }, lVarL, new wn0.a() { // from class: th0.x2
                @Override // wn0.a
                public final Object invoke() {
                    return d6.x2(this.f114461a, context, renderProps);
                }
            }, aVarW3, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
        }
        aVar = new d.c.b.a(enumC2431c, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        c2430d = aVar;
        boolean requireStrictSelfieCapture2 = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB2 = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL2 = t6.l(context);
        fg0.a aVarW4 = w3(renderProps);
        ej0.a aVar3 = this.webRtcManager;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : selfieHintTakePhoto, strU3, renderState.getAutoCaptureSupported(), c2430d, t6.x(renderProps), requireStrictSelfieCapture2, aVarB2, new wn0.a() { // from class: th0.u2
            @Override // wn0.a
            public final Object invoke() {
                return d6.v2(context, this);
            }
        }, new wn0.a() { // from class: th0.w2
            @Override // wn0.a
            public final Object invoke() {
                return d6.w2(this.f114302a, context);
            }
        }, lVarL2, new wn0.a() { // from class: th0.x2
            @Override // wn0.a
            public final Object invoke() {
                return d6.x2(this.f114461a, context, renderProps);
            }
        }, aVarW4, aVar3, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n3(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o1(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r o2(final d6 d6Var, final x1.StartCapture startCapture, final Input input, final y20.k.a aVar, final b1.c output) {
        p013kotlin.jvm.internal.s.k(output, "output");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.m5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.p2(output, startCapture, input, d6Var, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    private final void o3(y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        p013kotlin.jvm.internal.j0 j0Var = new p013kotlin.jvm.internal.j0();
        j0Var.f86523a = true;
        context.a("check_if_manual_capture_enabled", new l(j0Var, context, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p1(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p2(b1.c cVar, x1.StartCapture startCapture, Input input, d6 d6Var, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.StartCapture startCapture2 = objC instanceof x1.StartCapture ? (x1.StartCapture) objC : null;
        if (startCapture2 == null) {
            return jn0.h0.f84049a;
        }
        if (cVar instanceof b1.c.a) {
            b1.c.a aVar2 = (b1.c.a) cVar;
            action.e(new x1.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar2.getPoseScore(), aVar2.getBrightnessInfo(), startCapture.g(), t6.j(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled()));
        } else if (cVar instanceof b1.c.b) {
            d6Var.p3(aVar, ((b1.c.b) cVar).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
        } else {
            if (!(cVar instanceof b1.c.C2421c)) {
                throw new NoWhenBranchMatchedException();
            }
            b1.c.C2421c c2421c = (b1.c.C2421c) cVar;
            action.e(c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String() == dg0.b.FaceDetectionUnsupported ? startCapture2.s((4095 & 1) != 0 ? startCapture2.centered : false, (4095 & 2) != 0 ? startCapture2.selfieError : null, (4095 & 4) != 0 ? startCapture2.poseScore : c2421c.getPoseScore(), (4095 & 8) != 0 ? startCapture2.brightnessInfo : c2421c.getBrightnessInfo(), (4095 & 16) != 0 ? startCapture2.posesNeeded : null, (4095 & 32) != 0 ? startCapture2.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture2.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture2.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture2.cameraProperties : null, (4095 & 512) != 0 ? startCapture2.backState : null, (4095 & 1024) != 0 ? startCapture2.poseConfigs : null, (4095 & 2048) != 0 ? startCapture2.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture2.isFlashEnabled : false) : startCapture2.s((4095 & 1) != 0 ? startCapture2.centered : false, (4095 & 2) != 0 ? startCapture2.selfieError : c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String(), (4095 & 4) != 0 ? startCapture2.poseScore : c2421c.getPoseScore(), (4095 & 8) != 0 ? startCapture2.brightnessInfo : c2421c.getBrightnessInfo(), (4095 & 16) != 0 ? startCapture2.posesNeeded : null, (4095 & 32) != 0 ? startCapture2.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture2.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture2.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture2.cameraProperties : null, (4095 & 512) != 0 ? startCapture2.backState : null, (4095 & 1024) != 0 ? startCapture2.poseConfigs : null, (4095 & 2048) != 0 ? startCapture2.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture2.isFlashEnabled : false));
        }
        return jn0.h0.f84049a;
    }

    private final void p3(y20.k<? super Input, x1, ? extends c, ? extends Object>.a aVar, Throwable th2) {
        String message;
        String message2 = th2.getMessage();
        if (message2 != null && p013kotlin.text.t.h0(message2, "ENOSPC", false, 2, null)) {
            q3(aVar, new c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof ImageCaptureException)) {
            q3(aVar, new c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null && p013kotlin.text.t.h0(message, "ENOSPC", false, 2, null)) {
            q3(aVar, new c.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        q3(aVar, new c.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
    }

    private final d q1(final Input renderProps, x1.b renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        d.c.EnumC2431c enumC2431c;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof x1.n) {
            enumC2431c = d.c.EnumC2431c.COMPLETE_WITH_CAPTURE;
        } else {
            int i11 = e.f113841a[renderState.getCompletedPose().ordinal()];
            if (i11 == 1) {
                enumC2431c = d.c.EnumC2431c.LOOK_LEFT_COMPLETE;
            } else if (i11 == 2) {
                enumC2431c = d.c.EnumC2431c.LOOK_RIGHT_COMPLETE;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC2431c = d.c.EnumC2431c.CENTER_COMPLETE;
            }
        }
        return j2.e(renderProps, context, null, capturePageTitle, (251658240 & 16) != 0 ? null : null, null, false, new d.c.b.h(new wn0.a() { // from class: th0.d3
            @Override // wn0.a
            public final Object invoke() {
                return d6.r1(context, this);
            }
        }, true, enumC2431c, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a)), t6.x(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new wn0.a() { // from class: th0.e3
            @Override // wn0.a
            public final Object invoke() {
                return d6.t1(context, this);
            }
        }, new wn0.a() { // from class: th0.f3
            @Override // wn0.a
            public final Object invoke() {
                return d6.u1(this.f113888a, context);
            }
        }, t6.l(context), new wn0.a() { // from class: th0.h3
            @Override // wn0.a
            public final Object invoke() {
                return d6.v1(this.f113909a, context, renderProps);
            }
        }, w3(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, BitmapDescriptorFactory.HUE_RED, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q2(y20.k.a aVar, d6 d6Var, final x1.StartCapture startCapture, final Input input) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.q5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.r2(startCapture, input, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    private final void q3(y20.k<? super Input, x1, ? extends c, ? extends Object>.a context, final c output) {
        ej0.a aVar;
        if (((output instanceof c.d) || (output instanceof c.a) || (output instanceof c.Error)) && (aVar = this.webRtcManager) != null) {
            aVar.d();
        }
        context.c().b(y20.z.d(this, null, new wn0.l() { // from class: th0.f5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.r3(output, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r1(y20.k.a aVar, d6 d6Var) {
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.i5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.s1((y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r2(x1.StartCapture startCapture, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.StartCapture startCapture2 = objC instanceof x1.StartCapture ? (x1.StartCapture) objC : null;
        if (startCapture2 == null) {
            return jn0.h0.f84049a;
        }
        action.e(new x1.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), t6.j(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), 2, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r3(c cVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(cVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s1(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.b bVar = objC instanceof x1.b ? (x1.b) objC : null;
        x1 nextState = bVar != null ? bVar.getNextState() : null;
        if (nextState != null) {
            action.e(nextState);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s2(a1.b bVar, y20.k.a aVar, final d6 d6Var, final x1.StartCapture startCapture, String absolutePath) {
        p013kotlin.jvm.internal.s.k(absolutePath, "absolutePath");
        final a1.SelfieImage selfieImage = new a1.SelfieImage(absolutePath, a1.a.MANUAL, bVar, System.currentTimeMillis());
        aVar.c().b(y20.z.d(d6Var, null, new wn0.l() { // from class: th0.p5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.t2(this.f114092a, startCapture, selfieImage, (y20.r.c) obj);
            }
        }, 1, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3(y20.r<? super Input, x1, ? extends c>.c updater) {
        updater.d(new c.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t1(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t2(d6 d6Var, x1.StartCapture startCapture, a1.SelfieImage selfieImage, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(d6Var.f1(action, startCapture, selfieImage));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u1(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u2(d6 d6Var, y20.k.a aVar, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        d6Var.p3(aVar, it);
        return jn0.h0.f84049a;
    }

    private final String u3(dg0.b bVar, Input.Strings strings, a1.b bVar2) {
        switch (e.f113843c[bVar.ordinal()]) {
            case 1:
                return strings.getSelfieHintCenterFace();
            case 2:
                return strings.getSelfieHintFaceTooClose();
            case 3:
                return strings.getSelfieHintFaceTooFar();
            case 4:
                return strings.getSelfieHintMultipleFaces();
            case 5:
                return strings.getSelfieHintFaceIncomplete();
            case 6:
                return strings.getSelfieHintCenterFace();
            case 7:
                int i11 = e.f113841a[bVar2.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    return null;
                }
                if (i11 == 3) {
                    return strings.getSelfieHintPoseNotCentered();
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                return strings.getSelfieHintCenterFace();
            case 9:
                return strings.getSelfieHintCenterFace();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v1(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v2(y20.k.a aVar, d6 d6Var) {
        t6.t(aVar, d6Var.webRtcManager);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ei0.j v3(x1 x1Var) {
        if (x1Var instanceof x1.j) {
            return ei0.j.e.f63004a;
        }
        if (x1Var instanceof x1.ShowPoseHint) {
            a1.b bVarB = ((x1.ShowPoseHint) x1Var).b();
            return new ei0.j.LeadInAnimation(bVarB != null ? m1.a(bVarB) : null);
        }
        if (x1Var instanceof x1.RestartCamera) {
            return ei0.j.e.f63004a;
        }
        if (x1Var instanceof z) {
            a1.b bVarB2 = ((z) x1Var).b();
            return new ei0.j.TakePhoto(bVarB2 != null ? m1.a(bVarB2) : null);
        }
        if (x1Var instanceof x1.b) {
            return v3(((x1.b) x1Var).getNextState());
        }
        if ((x1Var instanceof x1.FinalizeLocalVideoCapture) || (x1Var instanceof x1.f) || (x1Var instanceof x1.q)) {
            return ei0.j.b.f63001a;
        }
        if (x1Var instanceof x1.i) {
            return ei0.j.a.f63000a;
        }
        if (x1Var instanceof x1.n) {
            return ei0.j.d.f63003a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final d w1(final Input renderProps, x1.CountdownToCapture renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        if (renderState.j().getAutoCaptureEnabled()) {
            y20.w.l(context, this.selfieAnalyzeWorker.a(a1.b.Center, false), p013kotlin.jvm.internal.o0.o(b1.class), "", new wn0.l() { // from class: th0.q4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.x1(this.f114107a, context, (b1.c) obj);
                }
            });
        }
        context.a("countdown_" + renderState.getCountDown(), new j(context, this, renderState, renderProps, null));
        dg0.b selfieError = renderState.getSelfieError();
        String strU3 = selfieError != null ? u3(selfieError, renderProps.getStrings(), renderState.i()) : null;
        String selfieHintCenterFace = strU3 == null ? renderProps.getStrings().getSelfieHintCenterFace() : strU3;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        d.c.b.C2428b c2428b = new d.c.b.C2428b(renderState.getCountDown(), w3(renderProps) == fg0.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), d.c.EnumC2431c.CENTER, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a), new wn0.l() { // from class: th0.r4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.z1(context, (Throwable) obj);
            }
        });
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        fg0.a aVarW3 = w3(renderProps);
        ej0.a aVar = this.webRtcManager;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : selfieHintCenterFace, strU3, renderState.getAutoCaptureSupported(), c2428b, t6.x(renderProps), requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.s4
            @Override // wn0.a
            public final Object invoke() {
                return d6.A1(context, this);
            }
        }, new wn0.a() { // from class: th0.t4
            @Override // wn0.a
            public final Object invoke() {
                return d6.B1(this.f114153a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.u4
            @Override // wn0.a
            public final Object invoke() {
                return d6.C1(this.f114186a, context, renderProps);
            }
        }, aVarW3, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w2(d6 d6Var, y20.k.a aVar) {
        d6Var.q3(aVar, c.b.f113700a);
        return jn0.h0.f84049a;
    }

    private final fg0.a w3(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ej0.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.g()) : null;
        ej0.a aVar2 = this.webRtcManager;
        Object objF = videoCaptureConfig.f(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.e()) : null, this.applicationContext);
        return jn0.s.e(objF) == null ? (fg0.a) objF : fg0.a.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r x1(final d6 d6Var, final y20.k.a aVar, final b1.c output) {
        p013kotlin.jvm.internal.s.k(output, "output");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.g5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.y1(output, d6Var, aVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x2(d6 d6Var, y20.k.a aVar, Input input) {
        t6.v(d6Var.applicationContext, aVar, input, d6Var.e1(input));
        return jn0.h0.f84049a;
    }

    private final boolean x3(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ej0.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.g()) : null;
        ej0.a aVar2 = this.webRtcManager;
        Object objD = videoCaptureConfig.d(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.e()) : null, this.applicationContext);
        if (jn0.s.e(objD) != null) {
            return false;
        }
        ((Boolean) objD).getClass();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 y1(b1.c cVar, d6 d6Var, y20.k.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        x1.CountdownToCapture countdownToCapture = objC instanceof x1.CountdownToCapture ? (x1.CountdownToCapture) objC : null;
        if (countdownToCapture == null) {
            return jn0.h0.f84049a;
        }
        if (!(cVar instanceof b1.c.a)) {
            if (cVar instanceof b1.c.b) {
                d6Var.p3(aVar, ((b1.c.b) cVar).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
            } else {
                if (!(cVar instanceof b1.c.C2421c)) {
                    throw new NoWhenBranchMatchedException();
                }
                b1.c.C2421c c2421c = (b1.c.C2421c) cVar;
                action.e(countdownToCapture.s((8188 & 1) != 0 ? countdownToCapture.countDown : 0, (8188 & 2) != 0 ? countdownToCapture.selfieError : c2421c.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String(), (8188 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture.poseScore : c2421c.getPoseScore(), (8188 & 64) != 0 ? countdownToCapture.brightnessInfo : c2421c.getBrightnessInfo(), (8188 & 128) != 0 ? countdownToCapture.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture.backState : null, (8188 & 512) != 0 ? countdownToCapture.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture.isFlashEnabled : false));
            }
        }
        return jn0.h0.f84049a;
    }

    private final d y2(final Input renderProps, final x1.StartCaptureFaceDetected renderState, final y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        if (renderState.j().getAutoCaptureEnabled()) {
            y20.w.l(context, this.selfieAnalyzeWorker.a(a1.b.Center, false), p013kotlin.jvm.internal.o0.o(b1.class), "", new wn0.l() { // from class: th0.y2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return d6.z2(this.f114474a, context, renderState, renderProps, (b1.c) obj);
                }
            });
        }
        y20.w.l(context, y20.o.Companion.b(y20.o.INSTANCE, 1000L, null, 2, null), p013kotlin.jvm.internal.o0.p(y20.o.class, co0.s.INSTANCE.d(p013kotlin.jvm.internal.o0.o(jn0.h0.class))), "", new wn0.l() { // from class: th0.z2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.B2(this.f114496a, renderState, renderProps, (jn0.h0) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        d.c.b.a aVar = new d.c.b.a(d.c.EnumC2431c.CENTER, !p013kotlin.jvm.internal.s.f(renderProps.getSelfieType(), d2.b.f113623a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        ii0.a aVarB = this.navigationStateManager.b();
        wn0.l<Throwable, jn0.h0> lVarL = t6.l(context);
        fg0.a aVarW3 = w3(renderProps);
        ej0.a aVar2 = this.webRtcManager;
        d.c.AssetOverrides assetOverridesX = t6.x(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        zf0.y.a aVar3 = this.cameraXControllerFactory;
        bg0.e.a aVar4 = this.camera2ManagerFactoryFactory;
        return j2.e(renderProps, context, renderState.i(), capturePageTitle, (251658240 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesX, requireStrictSelfieCapture, aVarB, new wn0.a() { // from class: th0.a3
            @Override // wn0.a
            public final Object invoke() {
                return d6.D2(context, this);
            }
        }, new wn0.a() { // from class: th0.b3
            @Override // wn0.a
            public final Object invoke() {
                return d6.E2(this.f113582a, context);
            }
        }, lVarL, new wn0.a() { // from class: th0.c3
            @Override // wn0.a
            public final Object invoke() {
                return d6.F2(this.f113600a, context, renderProps);
            }
        }, aVarW3, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), (251658240 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : false, (251658240 & 33554432) != 0 ? false : false, (251658240 & 67108864) != 0 ? false : false, (251658240 & 134217728) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 z1(y20.k.a aVar, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        t6.l(aVar).invoke(it);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r z2(final d6 d6Var, final y20.k.a aVar, final x1.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final b1.c output) {
        p013kotlin.jvm.internal.s.k(output, "output");
        return y20.z.d(d6Var, null, new wn0.l() { // from class: th0.a5
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d6.A2(output, d6Var, aVar, startCaptureFaceDetected, input, (y20.r.c) obj);
            }
        }, 1, null);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public x1 d(Input props, Snapshot snapshot) {
        Parcelable parcelable;
        p013kotlin.jvm.internal.s.k(props, "props");
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB == null) {
                parcelable = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                p013kotlin.jvm.internal.s.h(parcelable);
                p013kotlin.jvm.internal.s.j(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            x1 x1Var = (x1) parcelable;
            if (x1Var != null) {
                return x1Var;
            }
        }
        return props.getSkipPromptPage() ? new x1.WaitForCameraFeed(false, false, null, props.q(), props.getPoseConfigs(), false, zf0.u.b.User, false, 163, null) : new x1.j(null, null, 2, null);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public Object f(Input renderProps, x1 renderState, y20.k<? super Input, x1, ? extends c, ? extends Object>.a context) {
        Object objG2;
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        if (!t6.A(renderState)) {
            context.a("close_camera", new f(null));
        }
        if (!x3(renderProps)) {
            context.a("output_webrtc_error", new g(context, this, null));
        }
        boolean z11 = renderState instanceof x1.n;
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z11);
        this.externalEventLogger.c(new ei0.i.e(renderProps.getFromStep(), v3(renderState)));
        if (renderState instanceof x1.j) {
            objG2 = c2(renderProps, (x1.j) renderState, context);
        } else if (renderState instanceof x1.WaitForWebRtcSetup) {
            objG2 = W2(renderProps, (x1.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof x1.WaitForCameraFeed) {
            objG2 = M2(renderProps, (x1.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof x1.RestartCamera) {
            objG2 = S1(renderProps, (x1.RestartCamera) renderState, context);
        } else if (renderState instanceof x1.ShowPoseHint) {
            objG2 = h2(renderProps, (x1.ShowPoseHint) renderState, context);
        } else if (renderState instanceof x1.StartCapture) {
            objG2 = n2(renderProps, (x1.StartCapture) renderState, context);
        } else if (renderState instanceof x1.StartCaptureFaceDetected) {
            objG2 = y2(renderProps, (x1.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof x1.CountdownToCapture) {
            objG2 = w1(renderProps, (x1.CountdownToCapture) renderState, context);
        } else if (renderState instanceof x1.CountdownToManualCapture) {
            objG2 = D1(renderProps, (x1.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof x1.Capture) {
            objG2 = h1(renderProps, (x1.Capture) renderState, context);
        } else if (renderState instanceof x1.b) {
            objG2 = q1(renderProps, (x1.b) renderState, context);
        } else if (renderState instanceof x1.FinalizeLocalVideoCapture) {
            objG2 = this.localVideoCaptureRenderer.q(renderProps, (x1.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof x1.f) {
            objG2 = L1(renderProps, (x1.f) renderState, context);
        } else if (renderState instanceof x1.q) {
            objG2 = i3(renderProps, (x1.q) renderState, context);
        } else if (renderState instanceof x1.i) {
            objG2 = V1(renderProps, (x1.i) renderState, context);
        } else {
            if (!z11) {
                throw new NoWhenBranchMatchedException();
            }
            objG2 = G2(renderProps, (x1.n) renderState, context);
        }
        return objG2 instanceof d.c ? oh0.l1.c(objG2) : objG2;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: t3, reason: merged with bridge method [inline-methods] */
    public Snapshot g(x1 state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return a30.s.a(state);
    }
}
